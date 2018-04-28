package com.example.xxf.mapper;

import com.example.xxf.bean.TBaseDataAnalyzeMenu;
import com.example.xxf.bean.TBaseDataAnalyzeMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBaseDataAnalyzeMenuMapper {
    int countByExample(TBaseDataAnalyzeMenuExample example);

    int deleteByExample(TBaseDataAnalyzeMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBaseDataAnalyzeMenu record);

    int insertSelective(TBaseDataAnalyzeMenu record);

    List<TBaseDataAnalyzeMenu> selectByExample(TBaseDataAnalyzeMenuExample example);

    TBaseDataAnalyzeMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBaseDataAnalyzeMenu record, @Param("example") TBaseDataAnalyzeMenuExample example);

    int updateByExample(@Param("record") TBaseDataAnalyzeMenu record, @Param("example") TBaseDataAnalyzeMenuExample example);

    int updateByPrimaryKeySelective(TBaseDataAnalyzeMenu record);

    int updateByPrimaryKey(TBaseDataAnalyzeMenu record);
}