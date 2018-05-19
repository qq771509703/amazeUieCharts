package com.example.xxf.controller;


import com.alibaba.fastjson.JSON;
import com.example.xxf.Util.DatetimeUtil;
import com.example.xxf.Util.ExcelUtil;
import com.example.xxf.Util.StringUtil;
import com.example.xxf.bean.perCapitaCapacity;
import com.example.xxf.bean.perCapitaCapacityDetail;
import com.example.xxf.service.PerCapitaCapacityService;
import com.example.xxf.vo.Layui;
import com.example.xxf.vo.PageVo;
import com.example.xxf.vo.ResponseVo;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

@Controller
@RequestMapping("/admin")
public class PerCapitaCapacityController {


    @Resource
    PerCapitaCapacityService perCapitaCapacityService;

    @RequestMapping("/getPerCapitaCapacityList")
    @ResponseBody
    public Layui getPerCapitaCapacityList(String department, int page, int pageSize){
        Map<String,Object> map = new HashMap<>();

        ResponseVo vo = new ResponseVo();
        int start = (page-1)*pageSize+1;
        int end = page*pageSize;

        List<perCapitaCapacity> list = perCapitaCapacityService.getPerCapitaCapacityList(department,start,end);
        int count = (int)perCapitaCapacityService.getPerCapitaCapacityListCount(department);
        map.put("data",list);
        map.put("count",count);
        return Layui.data(count,list);
    }
    @RequestMapping("/getPerCapitaCapacityDetailList")
    @ResponseBody
    public Layui getPerCapitaCapacityDetailList(String department, int page, int limit){

        int start = (page-1)*limit+1;
        int end = page*limit;
        List<perCapitaCapacityDetail> list = perCapitaCapacityService.getPerCapitaCapacityDetailList(department,start,end);
        int count = (int)perCapitaCapacityService.getPerCapitaCapacityDetailListCount(department);

        return Layui.data(count,list);
    }

    @RequestMapping(value="getPerCapitaCapacityDetailListTOExcel",produces="text/html;charset=UTF-8")
    @ResponseBody
    public void exprotPerCapitaCapacityDetailListTOExcal(String department,HttpServletRequest request,HttpServletResponse response){

        List<LinkedHashMap<String,Object>> list = perCapitaCapacityService.getPerCapitaCapacityDetailListTOExcal(department);
        String[] titles = {"部门","业务员","合同编号","车牌号","合同成交日期","车辆分类","分红比例", "业绩金额"};
        try {
            ExcelUtil.exportExcel(list,titles,"人均产能详细",response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value="perCapitaCapacityexportExcel",produces="text/html;charset=UTF-8")
    @ResponseBody
    public void exprotPerCapitaCapacityTable(String department,HttpServletRequest request,HttpServletResponse response){

        List<LinkedHashMap<String,Object>> list = perCapitaCapacityService.getPerCapitaCapacityListTOExcal(department);

        exportExcel(list,"人均产能",request,response);
    }

    public void exportExcel( List<LinkedHashMap<String,Object>> list, String s_type, HttpServletRequest request, HttpServletResponse response){
        //创建HSSFWorkbook对象(excel的文档对象)
        HSSFWorkbook wb = new HSSFWorkbook();
        //建立新的sheet对象（excel的表单）
        HSSFSheet sheet=wb.createSheet("sheet1");
        for (int i = 0; i < 9; i++) {
            sheet.setColumnWidth(i, 5000);
        }
        //在sheet里创建第一行，参数为行索引(excel的行)，可以是0～65535之间的任何一个
//		HSSFRow row1=sheet.createRow(0);
//		row1.setHeightInPoints(30);
        //row1.setHeightInPoints(30);
        //创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
//		HSSFCell cell=row1.createCell(0);
//		      //设置单元格内容
//		cell.setCellValue("奖励金额");
//		//合并单元格CellRangeAddress构造参数依次表示起始行，截至行，起始列， 截至列
//		sheet.addMergedRegion(new CellRangeAddress(0,0,0,10));

        HSSFRow row2=sheet.createRow(0);
        row2.setHeightInPoints(30);

        String[] titles = {"部门","目标台数","目标金额(万)","新车增量","新车总量","二手车增量","二手车总量",
                "本月总量","本月业绩(万)","人头数","人均产能(台)","人均产能(万)","排名","本月总量(包含新人和经理)"};

        for (int i = 0; i < titles.length; i++) {
            row2.createCell(i).setCellValue(titles[i]);
        }
        
        Map<String,Object> map = new HashMap<>();
        String  key = "";
        Object val = "";

        for (int i = 0; i < list.size();i++ ){
            HSSFRow hRow =sheet.createRow(i+1);


            Map<String,Object> valMap = new HashMap<>();
            map = list.get(i);
            if (map!=null) {
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                int c = 0;
                int d = 0;
                while (it.hasNext()) {
                    Map.Entry<String, Object> entry = it.next();
                    key = entry.getKey();
                    val = entry.getValue();
//                    if (i==0){
////                        System.out.println("key----->"+key);
////                        System.out.println("c----->"+c);
//                        row2.createCell(c).setCellValue(key);
//                        c = c+1;
//                    }
                    System.out.println("val----->"+val);
                    hRow.createCell(d).setCellValue(val==null?"":val.toString());
                    d = d+1;

                }
            }
        }

        //输出Excel文件
        OutputStream output;
        try {
            String fileName = "";
            output = response.getOutputStream();

            fileName = s_type+DatetimeUtil.parseToString(
                    new Date(),DatetimeUtil.DATETIME_FORMAT)+".xls";
            response.reset();

            response.setHeader("Content-disposition", "attachment; filename="+java.net.URLEncoder.encode(fileName, "UTF-8"));
            response.setContentType("application/msexcel");
            wb.write(output);
            output.flush();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}