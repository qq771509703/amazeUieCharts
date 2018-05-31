package com.example.xxf.controller;

import com.example.xxf.Util.ExcelUtil;
import com.example.xxf.Util.MapUtil;
import com.example.xxf.Util.StringUtil;
import com.example.xxf.bean.Forsalecarbase;
import com.example.xxf.bean.Forsalecardetail;
import com.example.xxf.bean.perCapitaCapacity;
import com.example.xxf.comms.Config;
import com.example.xxf.service.ForsalecarbaseService;
import com.example.xxf.service.ForsalecardetailService;
import com.example.xxf.vo.Layui;
import com.example.xxf.vo.ResponseVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
@RequestMapping("/admin")
public class ForSaleCarController {

    @Resource
    ForsalecarbaseService forsalecarbaseService;

    @Resource
    ForsalecardetailService forsalecardetailService;


    @RequestMapping("/initializeSelect")
    @ResponseBody
    public List<String> initializeSelect(){
        return forsalecarbaseService.initializeAreaSelect();
    }


    @RequestMapping("/getForsalecarbaseList")
    @ResponseBody
    public Layui getForsalecarbaseList(String area, int page, int pageSize){

        if (Config.forsalecarbasetable_status==0){
            return  Layui.data("'正在为您准备最新鲜的数据，请稍后...'");
        }
        List<String> areas = new ArrayList<>();
        if (StringUtil.hasValue(area)){
            areas = Arrays.asList(area.split(","));
        }
        Map<String,Object> map = new HashMap<>();
        ResponseVo vo = new ResponseVo();
        int start = (page-1)*pageSize+1;
        int end = page*pageSize;
        map.put("areas",areas);
        map.put("startRow",start);
        map.put("endRow",end);
        List<Forsalecarbase> list =  forsalecarbaseService.getForsalecarbaseByLocal(map);
        int count = forsalecarbaseService.getForsalecarbaseCountByLocal(map);
        return Layui.data(count,list);
    }

    @RequestMapping("/getForsalecardetailList")
    @ResponseBody
    public Layui getForsalecardetailList(String area,String biaoshi, int page, int pageSize){

        if (Config.forsalecardetailtable_status==0){
            return  Layui.data("'正在为您准备最新鲜的数据，请稍后...'");
        }
        List<String> areas = new ArrayList<>();
        if (StringUtil.hasValue(area)){
            areas = Arrays.asList(area.split(","));
        }
        Map<String,Object> map = new HashMap<>();
        ResponseVo vo = new ResponseVo();
        int start = (page-1)*pageSize+1;
        int end = page*pageSize;
        map.put("biaoshi",biaoshi);
        map.put("areas",areas);
        map.put("startRow",start);
        map.put("endRow",end);
        List<Forsalecardetail> list =  forsalecardetailService.getForsalecardetailByLocal(map);
        int count = forsalecardetailService.getForsalecardetailCountByLocal(map);
        return Layui.data(count,list);
    }


    @RequestMapping(value = "getForsalecarbaseListExportStatus")
    @ResponseBody
    public int getExportStatus(){
        return Config.forsalecarbasetable_status;
    }
    @RequestMapping(value="getForsalecarbaseListTOExcel",produces="text/html;charset=UTF-8")
    @ResponseBody
    public void exprotPerCapitaCapacityDetailListTOExcal(String area, HttpServletRequest request, HttpServletResponse response){
        ResponseVo vo = new ResponseVo();
        List<String> areas = new ArrayList<>();
        if (StringUtil.hasValue(area)){
            areas = Arrays.asList(area.split(","));
        }
        Map<String,Object> map = new HashMap<>();
        map.put("areas",areas);
        map.put("startRow",0);
        map.put("endRow",10000);
        List<LinkedHashMap<String,Object>> listMap = new LinkedList<>();
        listMap =  forsalecarbaseService.getForsalecarbaseByLocalTOExcel(map);
        String[] titles = {"区域","待售新车","待售二手车","汇总"};
        try {
            ExcelUtil.exportExcel(listMap,titles,"待售车记录表",response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @RequestMapping(value = "getForsalecardetailListExportStatus")
    @ResponseBody
    public int getForsalecardetailListExportStatus(){
        return Config.forsalecarbasetable_status;
    }
    @RequestMapping(value="getForsalecardetailListTOExcel",produces="text/html;charset=UTF-8")
    @ResponseBody
    public void exprotForsalecardetailListTOExcal(String area,String biaoshi, HttpServletRequest request, HttpServletResponse response){
        List<String> areas = new ArrayList<>();
        if (StringUtil.hasValue(area)){
            areas = Arrays.asList(area.split(","));
        }
        Map<String,Object> map = new HashMap<>();
        map.put("biaoshi",biaoshi);
        map.put("areas",areas);
        List<LinkedHashMap<String,Object>> list =  forsalecardetailService.getForsalecardetailByLocalToExcel(map);
        String[] titles = {"区域","ID","车辆归属","车架号","车牌号","品牌","车型","规格","区间价格","车辆标识","库存时长"};
        try {
            ExcelUtil.exportExcel(list,titles,"待售车记录表",response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}