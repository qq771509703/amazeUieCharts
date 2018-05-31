package com.example.xxf.controller;

import com.example.xxf.Util.ExcelUtil;
import com.example.xxf.Util.MapUtil;
import com.example.xxf.Util.StringUtil;
import com.example.xxf.bean.Synergyevolvetable;
import com.example.xxf.bean.perCapitaCapacity;
import com.example.xxf.bean.synergyEvolvePlug;
import com.example.xxf.comms.Config;
import com.example.xxf.service.SynergyEvolveService;
import com.example.xxf.vo.Layui;
import com.example.xxf.vo.ResponseVo;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

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
public class SynergyEvolveController {


    @Resource
    SynergyEvolveService synergyEvolveService;

    @RequestMapping("/synergyEvolve")
    public String tableList(Model model){
        List<String> arealist = synergyEvolveService.getSelectArea();
        model.addAttribute("seleteArea",arealist);

        List<String> brandlist = synergyEvolveService.getSelectBrand();
        model.addAttribute("seleteBrand",brandlist);

        List<String> carTypelist = synergyEvolveService.getSelectCarType();
        model.addAttribute("carTypelist",carTypelist);

        return "admin/synergyEvolve";
    }



    @RequestMapping("/initializeSelectMenu")
    @ResponseBody
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

        //synergyEvolvePlug sAndUGPS = synergyEvolveService.getAtShopAndUninstalledGPS(map);
        synergyEvolvePlug synergyEvolvePlug = synergyEvolveService.pluginsBtn(map);
        returnMap.put("sAndUGPS",synergyEvolvePlug);

//        long count = synergyEvolveService.getSynergyEvolveTableCount(map);
//
//        returnMap.put("count",count);
//        map.put("startRow",0);
//        map.put("endRow",10);
//        List<Map<String,Object>> listMap = synergyEvolveService.getSynergyEvolveTable(map);
//        returnMap.put("SETListMap",listMap);

        vo.setData(returnMap);
        return  vo;
    }

    @RequestMapping("/getSynergyEvolveTable")
    @ResponseBody
    public Layui getSynergyEvolveTable(String area, String brand, String carType, String phyStatus, String owner,
                                       String arriveWay, String pluginVal, int page, int pageSize
                                                    ){

        //状态等于0的时候说明数据正在更新
        if (Config.synergyevolvetable_status==0){
            return  Layui.data("'正在为您准备最新鲜的数据，请稍后...'");
        }
        ResponseVo vo = new ResponseVo();
        Map<String,Object> map = new HashMap<>();
        Map<String,Object> returnMap = new HashMap<>();

        List<String>  areaList = null;
        List<String>  brandList = null;
        List<String>  carTypeList = null;
        List<String>  phyStatusList = null;
        List<String>  ownerList = null;
        List<String>  arriveWayList = null;

        if (StringUtil.hasValue(area)){
            areaList = Arrays.asList(area.split(","));
        }
        if (StringUtil.hasValue(brand)){
            brandList = Arrays.asList(brand.split(","));
        }
        if (StringUtil.hasValue(carType)){
            carTypeList = Arrays.asList(carType.split(","));
        }
        if (StringUtil.hasValue(phyStatus)){
            phyStatusList = Arrays.asList(phyStatus.split(","));
        }
        if (StringUtil.hasValue(owner)){
            ownerList = Arrays.asList(owner.split(","));
        }
        if (StringUtil.hasValue(arriveWay)){
            arriveWayList = Arrays.asList(arriveWay.split(","));
        }

        map.put("areaList",areaList);
        map.put("brandList",brandList);
        map.put("carTypeList",carTypeList);
        map.put("phyStatusList",phyStatusList);
        map.put("ownerList",ownerList);
        map.put("arriveWayList",arriveWayList);

        map.put("pluginVal",pluginVal);

        int start = (page-1)*pageSize+1;
        int end = page*pageSize;

        map.put("startRow",start);
        map.put("endRow",end);
        //List<LinkedHashMap<String,Object>> listMap = synergyEvolveService.getSynergyEvolveTable(map);
        List<Synergyevolvetable> list = synergyEvolveService.selectByExampleAndPage(map);

        returnMap.put("SETListMap",list);

        //int count = (int)synergyEvolveService.getSynergyEvolveTableCount(map);
        int count = synergyEvolveService.selectByExampleAndPageCount(map);

        returnMap.put("count",count);
        vo.setData(returnMap);
        return  Layui.data(count,list);
    }


    @RequestMapping(value="exportExcel",produces="text/html;charset=UTF-8")
    @ResponseBody
    public void exprotSynergyEvolveTable(String area,String brand,String carType,String phyStatus,String owner,
                                         String arriveWay,String pluginVal,HttpServletRequest request,HttpServletResponse response) throws Exception {
        ResponseVo vo = new ResponseVo();
        Map<String,Object> map = new HashMap<>();
        Map<String,Object> returnMap = new HashMap<>();
        List<String>  areaList = null;
        List<String>  brandList = null;
        List<String>  carTypeList = null;
        List<String>  phyStatusList = null;
        List<String>  ownerList = null;
        List<String>  arriveWayList = null;
        if (StringUtil.hasValue(area)){
            areaList = Arrays.asList(area.split(","));
        }
        if (StringUtil.hasValue(brand)){
            brandList = Arrays.asList(brand.split(","));
        }
        if (StringUtil.hasValue(carType)){
            carTypeList = Arrays.asList(carType.split(","));
        }
        if (StringUtil.hasValue(phyStatus)){
            phyStatusList = Arrays.asList(phyStatus.split(","));
        }
        if (StringUtil.hasValue(owner)){
            ownerList = Arrays.asList(owner.split(","));
        }
        if (StringUtil.hasValue(arriveWay) ){
            arriveWayList = Arrays.asList(arriveWay.split(","));
        }

        map.put("areaList",areaList);
        map.put("brandList",brandList);
        map.put("carTypeList",carTypeList);
        map.put("phyStatusList",phyStatusList);
        map.put("ownerList",ownerList);
        map.put("arriveWayList",arriveWayList);

        map.put("pluginVal",pluginVal);
        map.put("startRow",0);
        map.put("endRow",5000);
       // List<LinkedHashMap<String,Object>> listMap = synergyEvolveService.getSynergyEvolveTable(map);

//        List<Synergyevolvetable> list = synergyEvolveService.selectByExampleAndPage(map);
//        List<LinkedHashMap<String,Object>> listMap = new LinkedList<>();
//        LinkedHashMap mmp = null;
//        for (Synergyevolvetable synergyevolvetable : list) {
//            mmp = MapUtil.java2Map(synergyevolvetable);
//            listMap.add(mmp);
//        }

        List<LinkedHashMap<String,Object>> listMap = synergyEvolveService.getSynergyevolvetableExportExcel(map);
        String[] titles = {"区域","ID","车辆归属","采购单号","车架号","车牌号","采购跟进单","车型","规格","颜色","付款结束","预计发车","发票寄出","合格证寄出","商业险购买","交强险购买","到4S店","到店日期","到票日期","到证日期","GPS安装","上牌日期","车辆标识","到店方式","采购合同号","付款单号","指导价"};
        ExcelUtil.exportExcel(listMap,titles,"协同进度表",response);
       // exportExcel(listMap,"2","2",request,response);
    }

    @RequestMapping("getSynergyevolvetable")
    @ResponseBody
    public int getExportStatus(){
        return Config.synergyevolvetable_status;
    }


    public void exportExcel(List<LinkedHashMap<String, Object>> listMap, String s_type, String s_month, HttpServletRequest request, HttpServletResponse response){
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

        Map<String,Object> map = new HashMap<>();
        String  key = "";
        Object val = "";
        for (int i = 0; i < listMap.size();i++ ){
            HSSFRow hRow =sheet.createRow(i+1);
            Map<String,Object> valMap = new HashMap<>();
            map = listMap.get(i);
            if (map!=null) {
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                int c = 0;
                int d = 0;
                while (it.hasNext()) {
                    Map.Entry<String, Object> entry = it.next();
                    key = entry.getKey();
                    val = entry.getValue();
                    if (i==0){
//                        System.out.println("key----->"+key);
//                        System.out.println("c----->"+c);
                        row2.createCell(c).setCellValue(key);
                        c = c+1;
                    }
                        System.out.println("val----->"+val);
                        hRow.createCell(d).setCellValue(val==null?"":val.toString());
                        d = d+1;

                }
            }
        }

        //输出Excel文件
        OutputStream output;
        try {
            String  type = s_type;
            String fileName = "";
            output = response.getOutputStream();

            fileName = "协同进度表.xls";
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