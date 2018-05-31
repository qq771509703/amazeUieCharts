package com.example.xxf.service.Impl;

import com.example.xxf.annotation.DBSource;
import com.example.xxf.bean.Forsalecarbase;
import com.example.xxf.bean.ForsalecarbaseExample;
import com.example.xxf.mapper.ForsalecarbaseMapper;
import com.example.xxf.service.ForsalecarbaseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class ForsalecarbaseServiceImpl implements ForsalecarbaseService {


    @Autowired
    ForsalecarbaseMapper forsalecarbaseMapper;

    @DBSource(source = "local")
    @Override
    public int countByExample(ForsalecarbaseExample example) {
        return forsalecarbaseMapper.countByExample(example);
    }

    @DBSource(source = "local")
    @Override
    public int deleteByExample(ForsalecarbaseExample example) {
            return forsalecarbaseMapper.deleteByExample(example);
    }

    @Override
    public int insert(Forsalecarbase record) {
        return  forsalecarbaseMapper.insert(record);
    }

    @Override
    public int insertSelective(Forsalecarbase record) {
            return forsalecarbaseMapper.insertSelective(record);
    }

    @Override
    public List<Forsalecarbase> selectByExample(ForsalecarbaseExample example) {
            return forsalecarbaseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(@Param("record") Forsalecarbase record, @Param("example") ForsalecarbaseExample example) {
            return forsalecarbaseMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(@Param("record") Forsalecarbase record, @Param("example") ForsalecarbaseExample example) {
            return forsalecarbaseMapper.updateByExample(record,example);
    }

    @Override
    public List<Forsalecarbase> getForsalecarbaseByXXFDB(int start,int end) {
        List<Forsalecarbase> list = null;
        try {
            list =  forsalecarbaseMapper.getForsalecarbaseByXXFDB(start,end);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int getForsalecarbaseCountByXXFDB() {
        int count = 0;
        try {
            count =  forsalecarbaseMapper.getForsalecarbaseCountByXXFDB();
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }
    @DBSource(source = "local")
    @Override
    public int batchInsert(List<Forsalecarbase> list) {
        int count = 0;
        try {
            count =  forsalecarbaseMapper.batchInsert(list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @DBSource(source = "local")
    @Override
    public List<Forsalecarbase> getForsalecarbaseByLocal(Map<String, Object> map) {
        List<Forsalecarbase> list = null;
        try {
            list =  forsalecarbaseMapper.getForsalecarbaseByLocal(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @DBSource(source = "local")
    @Override
    public int getForsalecarbaseCountByLocal(Map<String, Object> map) {
        int count = 0;
        try {
            count =  forsalecarbaseMapper.getForsalecarbaseCountByLocal(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @DBSource(source = "local")
    @Override
    public List<String> initializeAreaSelect() {
        List<String> list = null;
        try {
            list =  forsalecarbaseMapper.initializeAreaSelect();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    @DBSource(source = "local")
    @Override
    public List<LinkedHashMap<String, Object>> getForsalecarbaseByLocalTOExcel(Map<String, Object> map) {
        List<LinkedHashMap<String, Object>> list = null;
        try {
            list =  forsalecarbaseMapper.getForsalecarbaseByLocalTOExcel(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

}