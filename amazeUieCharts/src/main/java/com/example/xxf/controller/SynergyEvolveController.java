package com.example.xxf.controller;

import com.example.xxf.bean.synergyEvolvePlug;
import com.example.xxf.service.SynergyEvolveService;
import com.example.xxf.vo.ResponseVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class SynergyEvolveController {


    @Resource
    SynergyEvolveService synergyEvolveService;

    @RequestMapping("/table-list")
    public String tableList(Model model){
        List<String> arealist = synergyEvolveService.getSelectArea();
        model.addAttribute("seleteArea",arealist);

        List<String> brandlist = synergyEvolveService.getSelectBrand();
        model.addAttribute("seleteBrand",brandlist);

        List<String> carTypelist = synergyEvolveService.getSelectCarType();
        model.addAttribute("carTypelist",carTypelist);

        return "admin/table-list";
    }



    @RequestMapping("/initializeSelectMenu")
    @ResponseBody
    //@RequestBody
    public ResponseVo initializeSelectMenu(String area,String brand,String carType,String phyStatus,String owner,String arriveWay){
        ResponseVo vo = new ResponseVo();
        Map<String,Object> map = new HashMap<>();
        Map<String,Object> returnMap = new HashMap<>();

        List<String>  areaList = null;
        List<String>  brandList = null;
        List<String>  carTypeList = null;
        List<String>  phyStatusList = null;
        List<String>  ownerList = null;
        List<String>  arriveWayList = null;

        if (area!=""){
            areaList = Arrays.asList(area.split(","));
        }
        if (brand!=""){
            brandList = Arrays.asList(brand.split(","));
        }
        if (carType!=""){
            carTypeList = Arrays.asList(carType.split(","));
        }
        if (phyStatus!=""){
            phyStatusList = Arrays.asList(phyStatus.split(","));
        }
        if (owner!=""){
            ownerList = Arrays.asList(owner.split(","));
        }
        if (arriveWay!=""){
            arriveWayList = Arrays.asList(arriveWay.split(","));
        }

        map.put("areaList",areaList);
        map.put("brandList",brandList);
        map.put("carTypeList",carTypeList);
        map.put("phyStatusList",phyStatusList);
        map.put("ownerList",ownerList);
        map.put("arriveWayList",arriveWayList);

        synergyEvolvePlug sAndUGPS = synergyEvolveService.getAtShopAndUninstalledGPS(map);
        returnMap.put("sAndUGPS",sAndUGPS);


        map.put("startRow",0);
        map.put("endRow",10);
        List<Map<String,Object>> listMap = synergyEvolveService.getSynergyEvolveTable(map);


        returnMap.put("SETListMap",listMap);

        vo.setData(returnMap);
        return  vo;
    }




}