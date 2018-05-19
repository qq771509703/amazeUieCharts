package com.example.xxf.service.Impl;

import com.example.xxf.bean.perCapitaCapacity;
import com.example.xxf.bean.perCapitaCapacityDetail;
import com.example.xxf.mapper.PerCapitaCapacityMapper;
import com.example.xxf.service.PerCapitaCapacityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class PerCapitaCapacityServiceImpl implements PerCapitaCapacityService {

    @Autowired
    PerCapitaCapacityMapper perCapitaCapacityMapper;

    @Override
    public List<perCapitaCapacity> getPerCapitaCapacityList(String department, int offset, int end) {
        List<perCapitaCapacity> list = null;
        try {
            list =  perCapitaCapacityMapper.getPerCapitaCapacityList(department,offset,end);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public long getPerCapitaCapacityListCount(String department) {
       long count = 0;
        try {
            count =  perCapitaCapacityMapper.getPerCapitaCapacityListCount(department);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public List<perCapitaCapacityDetail> getPerCapitaCapacityDetailList(String department, int offset, int end) {
        List<perCapitaCapacityDetail> list = null;
        try {
            list =  perCapitaCapacityMapper.getPerCapitaCapacityDetailList(department,offset,end);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public long getPerCapitaCapacityDetailListCount(String department) {
        long count = 0;
        try {
            count =  perCapitaCapacityMapper.getPerCapitaCapacityDetailListCount(department);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public  List<LinkedHashMap<String,Object>> getPerCapitaCapacityListTOExcal(String department) {
        List<LinkedHashMap<String,Object>> listMap = null;
        try {
            listMap =  perCapitaCapacityMapper.getPerCapitaCapacityListTOExcal(department);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }

    @Override
    public List<LinkedHashMap<String, Object>> getPerCapitaCapacityDetailListTOExcal(String department) {
        List<LinkedHashMap<String,Object>> listMap = null;
        try {
            listMap =  perCapitaCapacityMapper.getPerCapitaCapacityDetailListTOExcal(department);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }


}