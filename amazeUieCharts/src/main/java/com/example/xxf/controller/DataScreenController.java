package com.example.xxf.controller;

import com.example.xxf.service.AreaCoordService;
import com.example.xxf.service.DataScreenService;
import com.example.xxf.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.*;

@PropertySource({"classpath:config.properties"})
@Component
@Controller
@RequestMapping("/admin")
public class DataScreenController {

    @Autowired
    DataScreenService dataScreenService;

    @Autowired
    AreaCoordService areaCoordService;

    @Value("${targetVal}")
    private String targetVal;

    @RequestMapping("/getGross_sales_count")
    @ResponseBody
    public ResponseVo getGross_sales_count  (){
        ResponseVo response = new ResponseVo();
        String count =dataScreenService.getGross_sales_count();
        response.setData(count);
        return response;
    }
    @RequestMapping("/getGross_sales_performance")
    @ResponseBody
    public ResponseVo getGross_sales_performance(){
        ResponseVo response = new ResponseVo();
        String count =dataScreenService.getGross_sales_performance();
        response.setData(count);
        return response;
    }

    @RequestMapping("/getYear_sales_performance")
    @ResponseBody
    public ResponseVo getYear_sales_performance(){
        ResponseVo response = new ResponseVo();
        String count =dataScreenService.getYear_sales_performance();
        response.setData(count);
        return response;
    }


    @RequestMapping("/getYear_sales_count")
    @ResponseBody
    public ResponseVo getYear_sales_count(){
        ResponseVo response = new ResponseVo();
        String count =dataScreenService.getYear_sales_count();
        response.setData(count);
        return response;
    }


    @RequestMapping("/getRegion_performance")
    @ResponseBody
    public ResponseVo getRegion_performance(Integer obj){
        ResponseVo response = new ResponseVo();
        Map<String,Object> returnList = new HashMap<>();
        List<Map<String,Object>> listMap = dataScreenService.region_performance(obj);
        returnList.put("targetVal",targetVal);
        returnList.put("listMap",listMap);

  /*      //预留功能
        double[] doubles = new double[5];
        String  key = "";
        Object val = "";

        Map<String,Object> map = null;
        for (int i = 0; i < listMap.size();i++ ){
            map = listMap.get(i);
            if (map!=null) {
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Object> entry = it.next();
                    key = entry.getKey();
                    val = entry.getValue();
                    if (key.equals("sum") || key == "sum") {
                        doubles[i] = Double.parseDouble(val.toString());
                    }
                }
            }
        }
        double orderDS = getMax(doubles);*/
        response.setData(returnList);
        return response;
    }


    @RequestMapping("/getInitialize_map")
    @ResponseBody
    public ResponseVo getInitialize_map(){
        ResponseVo response = new ResponseVo();
        List cityName = dataScreenService.getNewDealCity();
        List<Map<String,String>> listMap = areaCoordService.getCoordByName(cityName);
        Map<String,String> map = new HashMap<>();
        String  key = "";
        String val = "";


        List<Map<String,Object>> res = new ArrayList();

        for (int i = 0; i < listMap.size();i++ ){
            Map<String,Object> valMap = new HashMap<>();
            map = listMap.get(i);
            if (map!=null) {
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {

                    Map.Entry<String, String> entry = it.next();
                    key = entry.getKey();
                    val = entry.getValue().toString();
                    if ("areaname"==key||"areaname".equals(key)){
                        valMap.put("name",val);
                    }else if("marker"==key||"marker".equals(key)){
                        String[] strs = val.toString().split(",");
                        List valList = new ArrayList();
                        valList.add(strs[0]);
                        valList.add(strs[1]);
                        valList.add(0);
                        valMap.put("value",valList);
                        }
                    }
                res.add(valMap);
                }
            }
        response.setData(res);
        return response;
    }


    @RequestMapping("/getSales_brand")
    @ResponseBody
    public ResponseVo getSales_brand(){
        ResponseVo response = new ResponseVo();
        Map<String,Object> returnMap = new HashMap<>();
        List<Map<String,Object>> pbListMap = dataScreenService.getSalesBrand();
        Map<String,Object> map = new HashMap<>();
        List<String> nameList = new ArrayList<>();

        String key = "";
        Object val = "";
        for (int j = 0; j < pbListMap.size();j++ ) {
            Map<String, Object> valMap = new HashMap<>();
            map = pbListMap.get(j);
            if (map != null) {
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Object> entry = it.next();
                    key = entry.getKey();
                    val = entry.getValue().toString();
                    if ("name"==key||"name".equals(key)){
                        nameList.add(val.toString());
                    }
                }
            }
        }
        returnMap.put("name",nameList);
        returnMap.put("sbListMap",pbListMap);
        response.setData(returnMap);
        return response;
    }
    @RequestMapping("/getPurchase_brand")
    @ResponseBody
    public ResponseVo getPurchase_brand(){
        ResponseVo response = new ResponseVo();
        Map<String,Object> returnMap = new HashMap<>();
        List<Map<String,Object>> pbListMap = dataScreenService.getPurchaseBrand();
        Map<String,Object> map = null;
        List<String> nameList = new ArrayList<>();

        for (int i = 0; i < pbListMap.size();i++ ) {
            Map<String, Object> valMap = new HashMap<>();
            map = pbListMap.get(i);
            if (map != null) {
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                Map.Entry<String, Object> entry = it.next();
                String key = entry.getKey();
                 Object val =entry.getValue().toString();
                if ("name"==key||"name".equals(key)){
                    nameList.add(val.toString());
                    }
                 }
            }
        }
        returnMap.put("name",nameList);
        returnMap.put("pbListMap",pbListMap);
        response.setData(returnMap);
        return response;
    }


    @RequestMapping("/getSales_staff_distribution")
    @ResponseBody
    public ResponseVo getSales_staff_distribution(){
        ResponseVo response = new ResponseVo();
        Map<String,Object> returnMap = new HashMap<>();
        List<Map<String,Object>> ssdListMap = dataScreenService.getSalesStaffDistribution();
        Map<String,Object> map = null;
        List<String> nameList = new ArrayList<>();

        for (int i = 0; i < ssdListMap.size();i++ ) {
            map = ssdListMap.get(i);
            if (map != null) {
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Object> entry = it.next();
                    String key = entry.getKey();
                    Object val = entry.getValue().toString();
                    if ("name"==key||"name".equals(key)){
                        nameList.add(val.toString());
                    }
                }
            }
        }
        returnMap.put("name",nameList);
        returnMap.put("ssdListMap",ssdListMap);
        response.setData(returnMap);
        return response;
    }



    @RequestMapping("/getHQ_staff_distribution")
    @ResponseBody
    public ResponseVo getHQ_staff_distribution(){
        ResponseVo response = new ResponseVo();
        Map<String,Object> returnMap = new HashMap<>();
        List<Map<String,Object>> hqdListMap = dataScreenService.getHQDistribution();
        Map<String,Object> map = null;
        List<String> nameList = new ArrayList<>();
       
        for (int i = 0; i < hqdListMap.size();i++ ) {
            map = hqdListMap.get(i);
            if (map != null) {
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Object> entry = it.next();
                    String key = entry.getKey();
                    Object val = entry.getValue().toString();
                    if ("name"==key||"name".equals(key)){
                        nameList.add(val.toString());
                    }
                }
            }
        }
        returnMap.put("name",nameList);
        returnMap.put("hqdListMap",hqdListMap);
        response.setData(returnMap);
        return response;
    }



    public static double getMax(double[] arr)
    {
        double max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }

}