package com.course.system;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.course")
@MapperScan("com.course.server.mapper")
public class SystemApplication {

	private static final Logger log = LoggerFactory.getLogger(SystemApplication.class);
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SystemApplication.class);
		Environment evn = app.run(args).getEnvironment();
		log.info("启动成功！！");
		log.info("system地址：\thttp://127.0.0.1:{}",evn.getProperty("server.port"));
	}

}
