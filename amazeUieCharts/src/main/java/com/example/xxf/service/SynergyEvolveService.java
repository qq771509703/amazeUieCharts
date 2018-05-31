package com.example.xxf.service;

import com.example.xxf.bean.Synergyevolvetable;
import com.example.xxf.bean.SynergyevolvetableExample;
import com.example.xxf.bean.synergyEvolvePlug;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface SynergyEvolveService {
    List<String> getSelectArea();

    List<String> getSelectBrand();

    List<String> getSelectCarType();



    /**
     * 到店未安装GPS
     * @param param
     * @return
     */
    synergyEvolvePlug getAtShopAndUninstalledGPS(Map<String,Object> param);

    /**
     * 协同进展表格
     * @param param
     * @return
     */
    List<LinkedHashMap<String,Object>> getSynergyEvolveTable(Map<String,Object> param);

    long getSynergyEvolveTableCount(Map <String,Object> param);

    List<Synergyevolvetable> getSynergyEvolveTableByBase(int offset,int end);
    long getSynergyEvolveTableByBaseCount();

    int batchSave(List<Synergyevolvetable> list);

    int deleteByExample(SynergyevolvetableExample example);

    int deleteSynergyevolvetable();

    List<Synergyevolvetable> selectByExampleAndPage(Map<String,Object> map);
    int selectByExampleAndPageCount(Map<String,Object> map);

    synergyEvolvePlug pluginsBtn(Map<String,Object> map);


    /**
     * 导出Excel时获取数据的借口
     * @param map
     * @return
     */
    List<LinkedHashMap<String,Object>> getSynergyevolvetableExportExcel(Map<String,Object> map);

}