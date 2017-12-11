package org.provider.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
@SpringBootApplication
@ComponentScan(basePackages= {"org.provider.service.impl"})
@DubboComponentScan(basePackages= {"org.provider.service.impl"})
@ImportResource("classpath:dubbo/dubbo.xml")
public class Application {
	
	public static void main(String[] args) {
			SpringApplication.run(Application.class, args);
	}
}
