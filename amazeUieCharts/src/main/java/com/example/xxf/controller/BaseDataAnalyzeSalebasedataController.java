package com.example.xxf.controller;

import com.example.xxf.bean.TBaseDataAnalyzeSalebasedata;
import com.example.xxf.service.Impl.TBaseDataAnalyzeSalebasedataServiceImpl;
import com.example.xxf.vo.ResponseVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class BaseDataAnalyzeSalebasedataController {

    @Resource
    TBaseDataAnalyzeSalebasedataServiceImpl tBaseDataAnalyzeSalebasedataService;

    @RequestMapping("/getEveryMouthSaleCount")
    @ResponseBody
    public ResponseVo getEveryMouthSaleCount(TBaseDataAnalyzeSalebasedata tBaseDataAnalyzeSalebasedata,String beginDate,String endDate){
        ResponseVo response = new ResponseVo();
        Map<String,Object> parameter = new HashMap();
        List<LinkedHashMap<String,Object>> list = tBaseDataAnalyzeSalebasedataService.everyMouthSaleCount(tBaseDataAnalyzeSalebasedata,beginDate,endDate);
        response.setData(list);
        return response;
    }
}