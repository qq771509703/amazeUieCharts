package com.example.xxf.controller;

import com.example.xxf.Util.StringUtil;
import com.example.xxf.bean.perCapitaCapacity;
import com.example.xxf.comms.Config;
import com.example.xxf.service.purchaseDataService;
import com.example.xxf.vo.Layui;
import com.example.xxf.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("/admin")
public class purchaseDataController {

    @Autowired
    purchaseDataService purchaseDataService;

    @RequestMapping("initializeSelectBrand")
    @ResponseBody
    public List<String> initializeSelectBrand(){
       return purchaseDataService.initializeSelect_brand();
    }

    @RequestMapping("initializeSelectArea")
    @ResponseBody
    public List<String> initializeSelectArea(){
        return purchaseDataService.initializeSelect_area();
    }

    @RequestMapping("/getPurchaseDataList")
    @ResponseBody
    public Layui getPurchaseDataList(String areas,String brands, int page, int pageSize){

        List<String> areasList = new ArrayList<>();
        if (StringUtil.hasValue(areas)){
            areasList = Arrays.asList(areas.split(","));
        }
        List<String>  brandsList = new ArrayList<>();
        if (StringUtil.hasValue(brands)){
            brandsList = Arrays.asList(brands.split(","));
        }
        Map<String,Object> map = new HashMap<>();
        int start = (page-1)*pageSize+1;
        int end = page*pageSize;
        map.put("areasList",areasList);
        map.put("brandsList",brandsList);
        map.put("startRow",start);
        map.put("endRow",end);
        List<LinkedHashMap<String,Object>> list =  purchaseDataService.getPurchaseDataList(map);
        int count = purchaseDataService.getPurchaseDataListCount(map);
        return Layui.data(count,list);
    }


}