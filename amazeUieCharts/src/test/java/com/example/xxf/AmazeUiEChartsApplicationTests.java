package com.example.xxf;

import com.example.xxf.controller.DataScreenController;
import com.example.xxf.mapper.DataScreenMapper;
import com.example.xxf.service.AreaCoordService;
import com.example.xxf.service.DataScreenService;
import net.minidev.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest

public class AmazeUiEChartsApplicationTests {


	@Autowired
	DataScreenService dataScreenService;

	@Autowired
	AreaCoordService areaCoordService;


	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext wac;

	@Before // 在测试开始前初始化工作
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(new DataScreenController()).build();
	}


	@Test
	public void contextLoads()throws Exception {
		List<Map<String,Object>> list = dataScreenService.getSalesStaffDistribution();
		System.out.println(list);
		list=dataScreenService.getPurchaseBrand();
		System.out.println(list);



	}

}
