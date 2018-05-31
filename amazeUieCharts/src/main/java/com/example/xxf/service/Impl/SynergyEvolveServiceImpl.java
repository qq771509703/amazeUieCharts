package com.example.xxf.service.Impl;

import com.example.xxf.annotation.DBSource;
import com.example.xxf.bean.Synergyevolvetable;
import com.example.xxf.bean.SynergyevolvetableExample;
import com.example.xxf.bean.synergyEvolvePlug;
import com.example.xxf.mapper.SynergyEvolveMapper;
import com.example.xxf.mapper.SynergyevolvetableMapper;
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

    @Autowired
    SynergyevolvetableMapper synergyevolvetableMapper;



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

    @Override
    public List<Synergyevolvetable> getSynergyEvolveTableByBase(int offset,int end) {
        List<Synergyevolvetable> list = null;
        try{
            list = synergyEvolveMapper.getSynergyEvolveTableByBase(offset,end);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public long getSynergyEvolveTableByBaseCount() {
        long count = 0;
        try{
            count = synergyEvolveMapper.getSynergyEvolveTableByBaseCount();
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @DBSource(source = "local")
    @Override
    public int batchSave(List<Synergyevolvetable> list) {
        int count = 0;
        try{
            count = synergyevolvetableMapper.batchSave(list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @DBSource(source = "local")
    @Override
    public int deleteByExample(SynergyevolvetableExample example) {
        int count = 0;
        try{
            count = synergyevolvetableMapper.deleteByExample(example);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @DBSource(source = "local")
    @Override
    public int deleteSynergyevolvetable() {
        int count = 0;
        try{
            count = synergyevolvetableMapper.deleteSynergyevolvetable();
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @DBSource(source = "local")
    @Override
    public List<Synergyevolvetable> selectByExampleAndPage(Map<String,Object> map) {
        List<Synergyevolvetable> list = null;
        try{
            list = synergyevolvetableMapper.selectByExampleAndPage(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    @DBSource(source = "local")
    @Override
    public int selectByExampleAndPageCount(Map<String, Object> map) {
        int count = 0;
        try{
            count = synergyevolvetableMapper.selectByExampleAndPageCount(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @DBSource(source = "local")
    @Override
    public synergyEvolvePlug pluginsBtn(Map<String, Object> map) {
        synergyEvolvePlug synergyEvolvePlug = null;
        try{
            synergyEvolvePlug = synergyevolvetableMapper.pluginsBtn(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return synergyEvolvePlug;
    }

    @DBSource(source = "local")
    @Override
    public List<LinkedHashMap<String, Object>> getSynergyevolvetableExportExcel(Map<String, Object> map) {
        List<LinkedHashMap<String, Object>> list = null;
        try{
            list = synergyevolvetableMapper.getSynergyevolvetableExportExcel(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}