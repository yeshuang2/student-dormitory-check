package com.ysgsignin.web.controller.system;

import java.util.List;

import com.ysgsignin.wxinfo.domain.WxStudent;
import com.ysgsignin.wxinfo.service.IWxStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ysgsignin.common.annotation.Log;
import com.ysgsignin.common.core.controller.BaseController;
import com.ysgsignin.common.core.domain.AjaxResult;
import com.ysgsignin.common.core.page.TableDataInfo;
import com.ysgsignin.common.enums.BusinessType;
import com.ysgsignin.system.domain.SysNotice;
import com.ysgsignin.system.service.ISysNoticeService;

/**
 * 公告 信息操作处理
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/system/notice")
public class SysNoticeController extends BaseController
{
    @Autowired
    private ISysNoticeService noticeService;

    /**
     * 获取通知公告列表
     */
    @GetMapping("/list")
    public TableDataInfo list(SysNotice notice)
    {
        startPage();
        List<SysNotice> list = noticeService.selectNoticeList(notice);
        return getDataTable(list);
    }

    @GetMapping("/getuserinfolist/{vuexname}")
    public AjaxResult getlist(@PathVariable("vuexname") String vuexname)
    {
        List<SysNotice> list = null;
        try {
            list = noticeService.selectonename(vuexname);
            logger.info("没有查询到该学院的通知");
        } catch (Exception e) {
            AjaxResult.success("没有查询到该学院的通知",302);
        }
        return AjaxResult.success(list);
    }

    /**
     * 根据通知公告编号获取详细信息
     */
    @GetMapping(value = "/{noticeId}")
    public AjaxResult getInfo(@PathVariable Long noticeId)
    {
        return success(noticeService.selectNoticeById(noticeId));
    }

    /**
     * 新增通知公告
     */

    @Log(title = "通知公告", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody SysNotice notice)
    {
        notice.setCreateBy(getUsername());
        return toAjax(noticeService.insertNotice(notice));
    }

    /**
     * 修改通知公告
     */
//    @PreAuthorize("@ss.hasPermi('system:notice:edit')")
    @Log(title = "通知公告", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody SysNotice notice)
    {
        notice.setUpdateBy(getUsername());
        return toAjax(noticeService.updateNotice(notice));
    }

    /**
     * 删除通知公告
     */
//    @PreAuthorize("@ss.hasPermi('system:notice:remove')")
    @Log(title = "通知公告", businessType = BusinessType.DELETE)
    @DeleteMapping("/{noticeIds}")
    public AjaxResult remove(@PathVariable Long[] noticeIds)
    {
        return toAjax(noticeService.deleteNoticeByIds(noticeIds));
    }


    /**
     * @param teacherName  教师
     * @param clazzName  班级名称
     * @return 去查询通知的具体信息
     *
     **/
    @GetMapping(value = "/wxinfolike/{teacherName}/{clazzName}")
    public AjaxResult WxInfoNoticeList(@PathVariable("teacherName") String teacherName,@PathVariable("clazzName") String clazzName)
    {
        return success(noticeService.selectNoticeByIdNotice(teacherName,clazzName));
    }
}
