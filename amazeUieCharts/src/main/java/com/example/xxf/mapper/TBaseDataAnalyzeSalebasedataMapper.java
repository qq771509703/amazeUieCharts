package com.example.xxf.mapper;

import com.example.xxf.bean.TBaseDataAnalyzeSalebasedata;
import com.example.xxf.bean.TBaseDataAnalyzeSalebasedataExample;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TBaseDataAnalyzeSalebasedataMapper {
    int countByExample(TBaseDataAnalyzeSalebasedataExample example);

    int deleteByExample(TBaseDataAnalyzeSalebasedataExample example);

    int insert(TBaseDataAnalyzeSalebasedata record);

    int insertSelective(TBaseDataAnalyzeSalebasedata record);

    List<TBaseDataAnalyzeSalebasedata> selectByExample(TBaseDataAnalyzeSalebasedataExample example);

    int updateByExampleSelective(@Param("record") TBaseDataAnalyzeSalebasedata record, @Param("example") TBaseDataAnalyzeSalebasedataExample example);

    int updateByExample(@Param("record") TBaseDataAnalyzeSalebasedata record, @Param("example") TBaseDataAnalyzeSalebasedataExample example);

    int insertBaseDataTOLocal();

    /**
     * 喜相逢各月份销售台数
     * @return
     */
    List<LinkedHashMap<String,Object>> everyMouthSaleCount(TBaseDataAnalyzeSalebasedata tBaseDataAnalyzeSalebasedata,@Param("beginDate") String beginDate,@Param("endDate") String endDate);

}