
# 学生宿舍查寝系统管理平台

#### 项目介绍
基于Ruoyi+uniapp （前后端分离项目） 实现学生宿舍查寝系统管理平台
学生考勤（普通、位置、二维码、人脸识别签到）、以及可视化数据展示
使用阿里云人脸识别+OSS存储
微信小程序密码和微信授权登录都可以！

后期会不断优化、如果满意给个Star星吧！以此鼓励、谢谢支持呀！

代码：https://gitee.com/ye-sgui
（可以联系主页+v）

### 学生考勤系统
1. 学生用户模块：用于录入和管理学生的基本信息，包括姓名、学号、班级、性别等。
2. 学生考勤（口头点名签到、普通、位置、二维码、人脸识别签到）、以及可视化数据展示使用阿里云人脸识别+OSS存储
3. 班级管理：用于管理学生所属的班级信息，包括班级名称、班级成员等。
4. 教师管理：对教师信息进行管理，包括教师的基本信息、职务等。
5. 请假管理：提供学生请假功能，包括在线请假、请假审批（老师是否同意）和请假记录查询等。
6. 可视化模块 用于对考勤数据进行分析和统计，生成考勤报表，包括学生出勤率、请假次数、迟到次数等。
7. 二维码签到--教师发布二维码--微信移动端学生扫码签到数据
8. 考勤记录管理：用于记录学生的考勤情况，包括请假、迟到、早退、缺勤等信息，并提供查询和统计功能。

## 更新日志：2024年4月28日

1. 新增功能：老师后台发布通知信息、学生可以进行查阅，移动端通知公告信息栏目（由富文本展示）。
2. 新增功能：后台管理页面PC端教师提醒（学生发起请假、所属老师登录，后台首页界面进行提醒）。
3. 新增功能：移动端集成腾讯地图、实时定位。
4. 新增功能：学生请假需要上传（生病的图等信息）、由教师进行审核、是否同意。
5. 新增功能：老师口头点名导入EXCEL表格数据、由教师进行审核签到信息录入。

## 更新日志：2024年12月1日

1. 优化整合后台配置信息（key）
2. 实现人脸识别和活体检测功能，实时监测人脸是否进入区域。微信小程序实现人脸识别，具体应用场景 前端实现人脸信息采集 拍到正面照片 发送给后端 （可以接入阿里云的人脸、腾讯云等不同的厂商）



项目持续更新、优化中......



## 内置功能

1.  用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2.  部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。
3.  岗位管理：配置系统用户所属担任职务。
4.  菜单管理：配置系统菜单，操作权限，按钮权限标识等。
5. 角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
6. 通知公告：系统通知公告信息发布维护。

 
## 效果图展示

<img width="1434" alt="1733792435523" src="https://github.com/user-attachments/assets/0594bf9d-66b5-4dfd-9d5b-16de3d34462b">


<img width="1434" alt="1733792629459" src="https://github.com/user-attachments/assets/33ec9227-b6bd-4209-bd0d-8ff3e6eb9925">

<img width="371" alt="218efb21d5f70e8db12eed8837e7c05" src="https://github.com/user-attachments/assets/07e4f365-84d2-4286-ab0e-1ca508402650">

<img width="371" alt="51b7b66d158deb401c0385b9fe0f22a" src="https://github.com/user-attachments/assets/e072cc22-96e3-4b0f-bcf3-35b1044621d9">

<img width="371" alt="ae3caf215b3b2acbf91159ed56e0968" src="https://github.com/user-attachments/assets/9b85af12-362e-4812-bf73-4619b65add56">






