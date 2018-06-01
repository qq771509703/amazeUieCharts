package com.example.xxf.service.Impl;

import com.example.xxf.mapper.purchaseDataMapper;
import com.example.xxf.service.purchaseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class purchaseDataServiceImpl implements purchaseDataService {

    @Autowired
    purchaseDataMapper purchaseDataMapper;

    @Override
    public List<LinkedHashMap<String, Object>> getPurchaseDataList(Map<String, Object> parameter) {
            List<LinkedHashMap<String, Object>> listMap = null;
            try {
                listMap =  purchaseDataMapper.getPurchaseDataList(parameter);
            }catch (Exception e){
                e.printStackTrace();
            }
            return listMap;
        }

    @Override
    public int getPurchaseDataListCount(Map<String, Object> parameter) {
        int count = 0;
        try {
            count =  purchaseDataMapper.getPurchaseDataListCount(parameter);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public List<String> initializeSelect_area() {
        List<String> listMap = null;
        try {
            listMap =  purchaseDataMapper.initializeSelect_area();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }

    @Override
    public List<String> initializeSelect_brand() {
        List<String> listMap = null;
        try {
            listMap =  purchaseDataMapper.initializeSelect_brand();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }


}