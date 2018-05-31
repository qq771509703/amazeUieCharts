package com.example.xxf.service.Impl;

import com.example.xxf.service.purchaseDataService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class purchaseDataServiceImpl implements purchaseDataService {


    @Override
    public List<LinkedHashMap<String, Object>> getPurchaseDataList(Map<String, Object> parameter) {
            List<LinkedHashMap<String, Object>> listMap = null;
            try {
               // listMap =  performanceRecordMapper.getTop15Record(s_date,e_date);
            }catch (Exception e){
                e.printStackTrace();
            }
            return listMap;
        }

}