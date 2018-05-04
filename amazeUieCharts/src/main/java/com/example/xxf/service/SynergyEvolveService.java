package com.example.xxf.service;

import com.example.xxf.bean.synergyEvolvePlug;

import java.util.HashMap;
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
    List<Map<String,Object>> getSynergyEvolveTable(Map<String,Object> param);

    long getSynergyEvolveTableCount(Map <String,Object> param);
}