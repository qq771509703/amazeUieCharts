package com.example.xxf.mapper;

import com.example.xxf.bean.TBaseRole;
import com.example.xxf.bean.TBaseRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBaseRoleMapper {
    int countByExample(TBaseRoleExample example);

    int deleteByExample(TBaseRoleExample example);

    int insert(TBaseRole record);

    int insertSelective(TBaseRole record);

    List<TBaseRole> selectByExample(TBaseRoleExample example);

    int updateByExampleSelective(@Param("record") TBaseRole record, @Param("example") TBaseRoleExample example);

    int updateByExample(@Param("record") TBaseRole record, @Param("example") TBaseRoleExample example);
}