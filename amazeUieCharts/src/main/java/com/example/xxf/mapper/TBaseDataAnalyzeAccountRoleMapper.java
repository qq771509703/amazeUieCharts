package com.example.xxf.mapper;

import com.example.xxf.bean.TBaseDataAnalyzeAccountRole;
import com.example.xxf.bean.TBaseDataAnalyzeAccountRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBaseDataAnalyzeAccountRoleMapper {
    int countByExample(TBaseDataAnalyzeAccountRoleExample example);

    int deleteByExample(TBaseDataAnalyzeAccountRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBaseDataAnalyzeAccountRole record);

    int insertSelective(TBaseDataAnalyzeAccountRole record);

    List<TBaseDataAnalyzeAccountRole> selectByExample(TBaseDataAnalyzeAccountRoleExample example);

    TBaseDataAnalyzeAccountRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBaseDataAnalyzeAccountRole record, @Param("example") TBaseDataAnalyzeAccountRoleExample example);

    int updateByExample(@Param("record") TBaseDataAnalyzeAccountRole record, @Param("example") TBaseDataAnalyzeAccountRoleExample example);

    int updateByPrimaryKeySelective(TBaseDataAnalyzeAccountRole record);

    int updateByPrimaryKey(TBaseDataAnalyzeAccountRole record);
}