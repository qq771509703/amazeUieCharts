package com.example.xxf.service;

import com.example.xxf.bean.perCapitaCapacity;
import com.example.xxf.bean.perCapitaCapacityDetail;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface PerCapitaCapacityService {

    List<perCapitaCapacity> getPerCapitaCapacityList(String department, int offset, int end);


    long getPerCapitaCapacityListCount(String department);


    List<perCapitaCapacityDetail> getPerCapitaCapacityDetailList(String department,int offset,int end);


    long getPerCapitaCapacityDetailListCount(String department);


    List<LinkedHashMap<String,Object>> getPerCapitaCapacityListTOExcal(String department);


    List<LinkedHashMap<String,Object>>  getPerCapitaCapacityDetailListTOExcal(String department);


    List<perCapitaCapacity> getPerCapitaCapacityListByBase(int start,int end);

    //把基础数据保存到本地库
    int batchSave(List<perCapitaCapacity> list);

    void deletePerCapitaCapacity();

    int getPerCapitaCapacityListByBaseCount();

    List<perCapitaCapacity> getPerCapitaCapacityListByLocal(Map<String,Object> map);

    int getPerCapitaCapacityListByLocalCount(Map<String,Object> map);

    /**
     *导出Excel时获取数据的借口
     * @param map
     * @return
     */
    List<LinkedHashMap<String,Object>> getPerCapitaCapacityListByLocalTOExcel(Map<String,Object> map);

    /**
     * 获取部门初始化人均产能页面中的下拉菜单
     * @return
     */
    List<String> getDepartmentInitialize_select();
}