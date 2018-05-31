package com.example.xxf.service;

import com.example.xxf.bean.Forsalecarbase;
import com.example.xxf.bean.ForsalecarbaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface ForsalecarbaseService {
    int countByExample(ForsalecarbaseExample example);

    int deleteByExample(ForsalecarbaseExample example);

    int insert(Forsalecarbase record);

    int insertSelective(Forsalecarbase record);

    List<Forsalecarbase> selectByExample(ForsalecarbaseExample example);

    int updateByExampleSelective(@Param("record") Forsalecarbase record, @Param("example") ForsalecarbaseExample example);

    int updateByExample(@Param("record") Forsalecarbase record, @Param("example") ForsalecarbaseExample example);


    /**
     * 获取待售车数据准备用来存入本地库
     * @return
     */
    List<Forsalecarbase>getForsalecarbaseByXXFDB(int start,int end);
    int getForsalecarbaseCountByXXFDB();

    int batchInsert(List<Forsalecarbase> list);

    List<Forsalecarbase> getForsalecarbaseByLocal(Map<String,Object> map);
    int getForsalecarbaseCountByLocal(Map<String,Object> map);

    List<String> initializeAreaSelect();


    List<LinkedHashMap<String,Object>> getForsalecarbaseByLocalTOExcel(Map<String,Object> map);
}