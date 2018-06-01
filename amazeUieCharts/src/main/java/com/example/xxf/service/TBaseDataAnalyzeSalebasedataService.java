package com.example.xxf.service;

import com.example.xxf.bean.TBaseDataAnalyzeSalebasedata;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface TBaseDataAnalyzeSalebasedataService {

    int insertBaseDataTOLocal();

    /**
     * 喜相逢各月份销售台数
     * @return
     */
    List<LinkedHashMap<String,Object>> everyMouthSaleCount(TBaseDataAnalyzeSalebasedata tBaseDataAnalyzeSalebasedata,String beginDate,String endDate);

}