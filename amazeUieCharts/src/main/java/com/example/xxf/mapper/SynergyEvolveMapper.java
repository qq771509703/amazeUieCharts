package com.example.xxf.mapper;

import com.example.xxf.bean.synergyEvolvePlug;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface SynergyEvolveMapper {

    /**
     * 获取区域来初始化协同进度页面中的下拉菜单
     * @return
     */
    List<String> getSelectArea();

    /**
     * 获取品牌来初始化协同进度页面中的下拉菜单
     * @return
     */
    List<String> getSelectBrand();

    /**
     * 获取车型来初始化协同进度页面中的下拉菜单
     * @return
     */
    List<String> getSelectCarType();

    /**
     * 到店未安装GPS
     * @param param
     * @return
     */
    synergyEvolvePlug getAtShopAndUninstalledGPS(Map <String,Object > param);


    List<LinkedHashMap<String,Object>> getSynergyEvolveTable(Map <String,Object> param);

    long getSynergyEvolveTableCount(Map <String,Object> param);

}