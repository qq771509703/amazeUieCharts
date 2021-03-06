package com.example.xxf.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface purchaseDataService {

    /**
     * 获取数据展示报表dao
     * @param parameter
     * @return
     */
    List<LinkedHashMap<String,Object>> getPurchaseDataList(Map<String,Object> parameter);
    int getPurchaseDataListCount(Map<String,Object> parameter);


    /**
     * 获取数据初始化SELECT下拉dao
     * @return
     */
    List<String> initializeSelect_area();
    List<String> initializeSelect_brand();
}