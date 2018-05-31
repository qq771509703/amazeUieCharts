package com.example.xxf.service.Impl;

import com.example.xxf.annotation.DBSource;
import com.example.xxf.bean.Forsalecarbase;
import com.example.xxf.bean.Forsalecardetail;
import com.example.xxf.bean.ForsalecardetailExample;
import com.example.xxf.mapper.ForsalecardetailMapper;
import com.example.xxf.service.ForsalecardetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class ForsalecardetailServiceImpl implements ForsalecardetailService {

    @Autowired
    ForsalecardetailMapper forsalecardetailMapper;

    @DBSource(source = "local")
    @Override
    public int deleteForsalecardetail() {
        return forsalecardetailMapper.deleteByExample(new ForsalecardetailExample());
    }

    @Override
    public List<Forsalecardetail> getForsalecardetailByXXFDB(String area, int start, int end) {
        List<Forsalecardetail> list = null;
        try {
            list =  forsalecardetailMapper.getForsalecardetailByXXFDB(area,start,end);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int getForsalecardetailCountByXXFDB(String area) {
        int count = 0;
        try {
            count =  forsalecardetailMapper.getForsalecardetailCountByXXFDB(area);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @DBSource(source = "local")
    @Override
    public int batchInsert(List<Forsalecardetail> list) {
        int count = 0;
        try {
            count =  forsalecardetailMapper.batchInsert(list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }
    @DBSource(source = "local")
    @Override
    public List<Forsalecardetail> getForsalecardetailByLocal(Map<String, Object> map) {
        List<Forsalecardetail> list = null;
        try {
            list =  forsalecardetailMapper.getForsalecardetailByLocal(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    @DBSource(source = "local")
    @Override
    public int getForsalecardetailCountByLocal(Map<String, Object> map) {
        int count = 0;
        try {
            count =  forsalecardetailMapper.getForsalecardetailCountByLocal(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }
    @DBSource(source = "local")
    @Override
    public List<LinkedHashMap<String, Object>> getForsalecardetailByLocalToExcel(Map<String, Object> map) {
        List<LinkedHashMap<String, Object>> list = null;
        try {
            list =  forsalecardetailMapper.getForsalecardetailByLocalToExcel(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    @DBSource(source = "local")
    @Override
    public int countByExample(ForsalecardetailExample example) {
        return forsalecardetailMapper.countByExample(example);
    }
}