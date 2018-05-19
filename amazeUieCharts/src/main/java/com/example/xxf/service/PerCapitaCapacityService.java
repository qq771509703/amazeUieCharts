package com.example.xxf.service;

import com.example.xxf.bean.perCapitaCapacity;
import com.example.xxf.bean.perCapitaCapacityDetail;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface PerCapitaCapacityService {

    List<perCapitaCapacity> getPerCapitaCapacityList(String department, int offset, int end);


    long getPerCapitaCapacityListCount(String department);


    List<perCapitaCapacityDetail> getPerCapitaCapacityDetailList(String department,int offset,int end);


    long getPerCapitaCapacityDetailListCount(String department);


    List<LinkedHashMap<String,Object>> getPerCapitaCapacityListTOExcal(String department);


    List<LinkedHashMap<String,Object>>  getPerCapitaCapacityDetailListTOExcal(String department);
}