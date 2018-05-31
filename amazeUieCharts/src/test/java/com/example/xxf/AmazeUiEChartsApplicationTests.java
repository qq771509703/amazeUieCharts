package com.example.xxf;

import com.example.xxf.Util.MapUtil;
import com.example.xxf.bean.Lborganization;
import com.example.xxf.bean.SynergyevolvetableExample;
import com.example.xxf.bean.perCapitaCapacity;
import com.example.xxf.bean.perCapitaCapacityDetail;
import com.example.xxf.controller.DataScreenController;
import com.example.xxf.mapper.*;
import com.example.xxf.service.*;
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
import org.thymeleaf.util.MapUtils;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AmazeUiEChartsApplicationTests {


	@Autowired
	DataScreenService dataScreenService;

	@Autowired
	AreaCoordService areaCoordService;

	@Autowired
	SynergyEvolveService synergyEvolveService;


	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext wac;

	@Autowired
	PerCapitaCapacityMapper perCapitaCapacityMapper;

	@Autowired
	PerformanceRecordMapper performanceRecordMapper;

	@Autowired
	LborganizationMapper lborganizationMapper;

	@Autowired
	LoginService loginService;

	@Autowired
	SynergyevolvetableMapper synergyevolvetableMapper;

	@Autowired
	PerCapitaCapacityService perCapitaCapacityService;


	@Autowired
	ForsalecarbaseService forsalecarbaseService;

	@Autowired
	ForsalecardetailService forsalecardetailService;


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

//		long count2 = perCapitaCapacityMapper.getPerCapitaCapacityDetailListCount("");
//		System.out.println(count2);

//		List<perCapitaCapacityDetail> list = perCapitaCapacityMapper.getPerCapitaCapacityList();
//		System.out.println(list);

		//List list = performanceRecordMapper.getPerformanceRecord("","",0,50);

		//long list = performanceRecordMapper.getRegionPerformanceRecordCount();

//		performanceRecordMapper.getPerformanceRecordTOExcal();
//		performanceRecordMapper.getRegionPerformanceRecordTOExcal();


//		System.out.println(list);

//		Lborganization lborganization =  lborganizationMapper.getOrganizationByUserName("张乔羽");
//		String fdncoed = lborganization.getFdncode();
//		String str = ".";
//		String[] fdncoeds = fdncoed.split("\\.");
//		System.out.println(fdncoeds[1]);
//		List list = loginService.listMap();
//		System.out.println(list);

//		List list = synergyEvolveMapper.getSynergyEvolveTableByBase(0,100);
//		int count = synergyEvolveService.deleteSynergyevolvetable();
//		int count = synergyEvolveMapper.batchSave(list);
//		long count = synergyEvolveService.getSynergyEvolveTableByBaseCount();
//
//		Map<String,Object> map = new HashMap<>();
//		//map.put("department","南平营销一部");
//		map.put("startRow",0);
//		map.put("endRow",10);
//		List<perCapitaCapacity> list = perCapitaCapacityService.getPerCapitaCapacityListByLocal(map);
//		List<LinkedHashMap<String,Object>> listMap = new LinkedList<>();
//		LinkedHashMap mmp = null;
//		for (perCapitaCapacity perCapitaCapacity : list) {
//			mmp = MapUtil.java2Map(perCapitaCapacity);
//			listMap.add(mmp);
//		}
//		System.out.println(listMap);

		//int count = perCapitaCapacityService.batchSave(list);
		//System.out.println(count);

		//perCapitaCapacityService.getPerCapitaCapacityListByBaseCount();

		//forsalecardetailService.getForsalecardetailByXXFDB("厦门",0,10);
		forsalecardetailService.getForsalecardetailCountByXXFDB("");
	}

}
