package com.example.xxf.service.Impl;

import com.example.xxf.bean.PerformanceRecord;
import com.example.xxf.mapper.PerformanceRecordMapper;
import com.example.xxf.service.PerformanceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class PerformanceRecordServiceImpl implements PerformanceRecordService {

    @Resource
    PerformanceRecordMapper performanceRecordMapper;

    @Override
    public List<PerformanceRecord> getPerformanceRecord(String s_date,String e_date, int offset, int end) {
        List<PerformanceRecord> listMap = null;
        try {
            listMap =  performanceRecordMapper.getPerformanceRecord(s_date,e_date,offset,end);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }

    @Override
    public long getPerformanceRecordCount(String s_date,String e_date) {
        long count = 0;
        try {
            count =  performanceRecordMapper.getPerformanceRecordCount(s_date,s_date);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public List<PerformanceRecord> getRegionPerformanceRecord(String s_date,String e_date,int offset,int end) {
        List<PerformanceRecord> listMap = null;
        try {
            listMap =  performanceRecordMapper.getRegionPerformanceRecord(s_date,e_date,offset,end);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }

    @Override
    public long getRegionPerformanceRecordCount(String s_date,String e_date) {
        long count = 0;
        try {
            count =  performanceRecordMapper.getRegionPerformanceRecordCount(s_date,e_date);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public List<LinkedHashMap<String, Object>> getTop15Record(String s_date,String e_date) {
        List<LinkedHashMap<String, Object>> listMap = null;
        try {
            listMap =  performanceRecordMapper.getTop15Record(s_date,e_date);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }

    @Override
    public List<LinkedHashMap<String, Object>> getRegionPerformanceRecordTOExcal(String s_date,String e_date) {
        List<LinkedHashMap<String, Object>> listMap = null;
        try {
            listMap =  performanceRecordMapper.getRegionPerformanceRecordTOExcal(s_date,e_date);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }

    @Override
    public List<LinkedHashMap<String, Object>> getPerformanceRecordTOExcal(String s_date,String e_date) {
        List<LinkedHashMap<String, Object>> listMap = null;
        try {
            listMap =  performanceRecordMapper.getPerformanceRecordTOExcal(s_date,e_date);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }
}