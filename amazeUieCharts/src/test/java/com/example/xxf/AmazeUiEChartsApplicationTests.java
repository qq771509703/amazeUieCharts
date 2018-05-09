package com.example.xxf;

import com.example.xxf.bean.perCapitaCapacityDetail;
import com.example.xxf.controller.DataScreenController;
import com.example.xxf.mapper.DataScreenMapper;
import com.example.xxf.mapper.PerCapitaCapacityMapper;
import com.example.xxf.mapper.SynergyEvolveMapper;
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

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest

public class AmazeUiEChartsApplicationTests {


	@Autowired
	DataScreenService dataScreenService;

	@Autowired
	AreaCoordService areaCoordService;

	@Autowired
	SynergyEvolveMapper synergyEvolveMapper;


	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext wac;

	@Autowired
	PerCapitaCapacityMapper perCapitaCapacityMapper;


	@Before // 在测试开始前初始化工作
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(new DataScreenController()).build();
	}

	@Test
	public void contextLoads()throws Exception {
//		List<Map<String,Object>> listMap = dataScreenService.getSalesStaffDistribution();
//		System.out.println(listMap);
//		System.out.print("");
//		listMap=dataScreenService.getPurchaseBrand();
//		System.out.println(listMap);

//		Map<String,Object> map  = new HashMap<>();
//		List<LinkedHashMap<String,Object>> listMap = synergyEvolveMapper.getSynergyEvolveTable(map);
//		System.out.println(listMap);

//		long count = perCapitaCapacityMapper.getPerCapitaCapacityListCount("");
//		System.out.println(count);

		long count2 = perCapitaCapacityMapper.getPerCapitaCapacityDetailListCount("");
		System.out.println(count2);

//		List<perCapitaCapacityDetail> list = perCapitaCapacityMapper.getPerCapitaCapacityList();
//		System.out.println(list);


	}

}
