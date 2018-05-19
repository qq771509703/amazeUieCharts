package com.example.xxf.service;

import com.example.xxf.bean.PerformanceRecord;

import java.util.LinkedHashMap;
import java.util.List;

public interface PerformanceRecordService {
    List<PerformanceRecord>  getPerformanceRecord(String s_date,String e_date,int offset,int end);

    long getPerformanceRecordCount(String s_date,String e_date);


    List<PerformanceRecord> getRegionPerformanceRecord(String s_date,String e_date,int offset,int end);

    long getRegionPerformanceRecordCount(String s_date,String e_date);

    /**
     * 获取业绩top15的数据
     * @return
     */
    List<LinkedHashMap<String,Object>> getTop15Record(String s_date,String e_date);


    /**
     * 获取城市业绩数据导出成excel
     * @return
     */
    List<LinkedHashMap<String,Object>> getRegionPerformanceRecordTOExcal(String s_date,String e_date);

    /**
     * 获取大区省级业绩数据导出成excel
     * @return
     */
    List<LinkedHashMap<String,Object>> getPerformanceRecordTOExcal(String s_date,String e_date);

}