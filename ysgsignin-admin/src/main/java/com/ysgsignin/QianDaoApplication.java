package com.ysgsignin;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 启动程序
 *
 * @author ruoyi
 */

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class QianDaoApplication{

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(QianDaoApplication.class);

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext application = SpringApplication.run(QianDaoApplication.class, args);
        // System.setProperty("spring.devtools.restart.enabled", "false");
//        SpringApplication.run(QianDaoApplication.class, args);
        System.out.println("管理后台系统启动成功  \n");
        Environment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        logger.info("\n----------------------------------------------------------\n\t" +
                "Application Jeecg-Boot is running! Access URLs:\n\t" +
                "Local: \t\thttp://localhost:" + port  + "/\n\t" +
                "External: \thttp://" + ip + ":" + port  + "/\n\t" +
                "Swagger文档: \thttp://" + ip + ":" + port  + "/doc.html\n" +
                "----------------------------------------------------------");
    }
}
