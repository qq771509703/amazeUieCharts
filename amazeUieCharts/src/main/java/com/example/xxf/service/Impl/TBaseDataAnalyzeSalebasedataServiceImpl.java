package com.example.xxf.service.Impl;

import com.example.xxf.bean.TBaseDataAnalyzeSalebasedata;
import com.example.xxf.mapper.TBaseDataAnalyzeSalebasedataMapper;
import com.example.xxf.service.TBaseDataAnalyzeSalebasedataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class TBaseDataAnalyzeSalebasedataServiceImpl implements TBaseDataAnalyzeSalebasedataService {

    @Autowired
    TBaseDataAnalyzeSalebasedataMapper tBaseDataAnalyzeSalebasedataMapper;
    @Override
    public int insertBaseDataTOLocal() {
        int count = 0;
        try{
            count = tBaseDataAnalyzeSalebasedataMapper.insertBaseDataTOLocal();
        }catch(Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public List<LinkedHashMap<String, Object>> everyMouthSaleCount(TBaseDataAnalyzeSalebasedata tBaseDataAnalyzeSalebasedata,String beginDate,String endDate) {
        List<LinkedHashMap<String, Object>> list = null;
        try{
            list = tBaseDataAnalyzeSalebasedataMapper.everyMouthSaleCount(tBaseDataAnalyzeSalebasedata,beginDate,endDate);
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
}