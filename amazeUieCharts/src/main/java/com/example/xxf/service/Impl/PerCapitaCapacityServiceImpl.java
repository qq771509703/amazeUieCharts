package com.example.xxf.service.Impl;

import com.example.xxf.annotation.DBSource;
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

    @Override
    public List<perCapitaCapacity> getPerCapitaCapacityListByBase(int start,int end) {
        List<perCapitaCapacity> list = null;
        try {
            list =  perCapitaCapacityMapper.getPerCapitaCapacityListByBase(start,end);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @DBSource(source = "local")
    @Override
    public int batchSave(List<perCapitaCapacity> list) {
        int count = 0;
        try {
            count =  perCapitaCapacityMapper.batchSave(list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @DBSource(source = "local")
    @Override
    public void deletePerCapitaCapacity() {
        perCapitaCapacityMapper.deletePerCapitaCapacity();
    }

    @Override
    public int getPerCapitaCapacityListByBaseCount() {
        int count = 0;
        try {
            count =  perCapitaCapacityMapper.getPerCapitaCapacityListByBaseCount();
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }
    @DBSource(source = "local")
    @Override
    public List<perCapitaCapacity> getPerCapitaCapacityListByLocal(Map<String, Object> map) {
        List<perCapitaCapacity> list = null;
        try {
            list =  perCapitaCapacityMapper.getPerCapitaCapacityListByLocal(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    @DBSource(source = "local")
    @Override
    public int getPerCapitaCapacityListByLocalCount(Map<String, Object> map) {
        int count = 0;
        try {
            count =  perCapitaCapacityMapper.getPerCapitaCapacityListByLocalCount(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @DBSource(source = "local")
    @Override
    public List<LinkedHashMap<String, Object>> getPerCapitaCapacityListByLocalTOExcel(Map<String,Object> map) {
        List<LinkedHashMap<String, Object>> list = null;
        try {
            list =  perCapitaCapacityMapper.getPerCapitaCapacityListByLocalTOExcel(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    @DBSource(source = "local")
    @Override
    public List<String> getDepartmentInitialize_select() {
        List<String> list = null;
        try {
            list =  perCapitaCapacityMapper.getDepartmentInitialize_select();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

}