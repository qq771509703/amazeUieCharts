package com.example.xxf.service.Impl;

import com.example.xxf.bean.synergyEvolvePlug;
import com.example.xxf.mapper.SynergyEvolveMapper;
import com.example.xxf.service.SynergyEvolveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class SynergyEvolveServiceImpl implements SynergyEvolveService {

    @Autowired
    private SynergyEvolveMapper synergyEvolveMapper;

    @Override
    public List<String> getSelectArea() {
        List<String> list = null;
        try{
            list = synergyEvolveMapper.getSelectArea();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<String> getSelectBrand() {
        List<String> list = null;
        try{
            list = synergyEvolveMapper.getSelectBrand();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<String> getSelectCarType() {
        List<String> list = null;
        try{
            list = synergyEvolveMapper.getSelectCarType();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public synergyEvolvePlug getAtShopAndUninstalledGPS(Map<String,Object> param) {
        synergyEvolvePlug count = null;
        try{
            count = synergyEvolveMapper.getAtShopAndUninstalledGPS(param);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public List<LinkedHashMap<String, Object>> getSynergyEvolveTable(Map<String,Object> param) {
        List<LinkedHashMap<String,Object>> list = null;
        try{
            list = synergyEvolveMapper.getSynergyEvolveTable(param);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public long getSynergyEvolveTableCount(Map<String, Object> param) {
        long count = 0;
        try{
            count = synergyEvolveMapper.getSynergyEvolveTableCount(param);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }
}