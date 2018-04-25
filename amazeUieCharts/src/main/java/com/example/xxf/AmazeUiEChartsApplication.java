package com.example.xxf;


import org.mybatis.spring.annotation.MapperScan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@MapperScan("com.example.xxf.mapper")
@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class
})
@Controller
@ServletComponentScan
@Component
public class AmazeUiEChartsApplication {


	public static void main(String[] args) {
		SpringApplication.run(AmazeUiEChartsApplication.class, args);
	}

	/**
	 * 配置各大屏各个大区的目标d
	 */
	@Value("${targetVal}")
	private String targetVal;

	@RequestMapping("/login")
	public String account_login(){
		return "admin/login";
	}
	@RequestMapping("/index")
	public String account_index(){
		return "admin/index";
	}


}
