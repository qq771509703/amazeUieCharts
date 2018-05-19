package com.example.xxf.controller;

import com.example.xxf.Util.ExcelUtil;
import com.example.xxf.bean.PerformanceRecord;
import com.example.xxf.bean.perCapitaCapacity;
import com.example.xxf.service.PerCapitaCapacityService;
import com.example.xxf.service.PerformanceRecordService;
import com.example.xxf.vo.Layui;
import com.example.xxf.vo.ResponseVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class PerformanceRecordController {

    @Resource
    PerformanceRecordService performanceRecordService;

    @RequestMapping("/getPerformanceRecord")
    @ResponseBody
    public Layui getPerCapitaCapacityList(String s_date,String e_date, int page, int pageSize){

        int start = (page-1)*pageSize+1;
        int end = page*pageSize;
        List<PerformanceRecord> list = performanceRecordService.getPerformanceRecord(s_date,e_date,start,end);
        int count = (int)performanceRecordService.getPerformanceRecordCount(s_date,e_date);
        return Layui.data(count,list);
    }

    @RequestMapping("/getRegionPerformanceRecord")
    @ResponseBody
    public Layui getRegionPerformanceRecordList(String s_date,String e_date,int page, int pageSize){
        int start = (page-1)*pageSize+1;
        int end = page*pageSize;
        List<PerformanceRecord> list = performanceRecordService.getRegionPerformanceRecord(s_date,e_date,start,end);
        int count = (int)performanceRecordService.getRegionPerformanceRecordCount(s_date,e_date);
        return Layui.data(count,list);
    }


    @RequestMapping("/getTop15Record")
    @ResponseBody
    public Layui getTop15Record(String s_date,String e_date){
        List<LinkedHashMap<String, Object>> list = performanceRecordService.getTop15Record(s_date,e_date);
        return Layui.data(15,list);
    }

    @RequestMapping(value="getPerformanceRecordTOExcal",produces="text/html;charset=UTF-8")
    @ResponseBody
    public void exprotPerPerformanceRecordTOExcal(String s_date,String e_date,HttpServletResponse response) {

        List<LinkedHashMap<String, Object>> list = performanceRecordService.getPerformanceRecordTOExcal(s_date,e_date);
        String[] titles = {"大区", "省级", "城市", "当月业绩", "昨日业绩"};
        try {
            ExcelUtil.exportExcel(list, titles, "当月业绩——城市", response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value="getRegionPerformanceRecordTOExcal",produces="text/html;charset=UTF-8")
    @ResponseBody
    public void exprotRegionPerformanceRecordTOExcal(String s_date,String e_date,HttpServletResponse response){

        List<LinkedHashMap<String,Object>> list = performanceRecordService.getRegionPerformanceRecordTOExcal(s_date,e_date);
        String[] titles = {"大区","省级","当月业绩","昨日业绩"};
        try {
            ExcelUtil.exportExcel(list,titles,"当月业绩——省级",response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @RequestMapping(value="getTop15RecordTOExcal",produces="text/html;charset=UTF-8")
    @ResponseBody
    public void exprotTop15RecordTOExcalTOExcal(String s_date,String e_date,HttpServletResponse response){

        List<LinkedHashMap<String,Object>> list = performanceRecordService.getTop15Record(s_date,e_date);
        String[] titles = {"大区","业绩/台","业绩/万","排名"};
        try {
            ExcelUtil.exportExcel(list,titles,"销项Top15",response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}