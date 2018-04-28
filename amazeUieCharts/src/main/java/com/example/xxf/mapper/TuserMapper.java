package com.example.xxf.mapper;

import com.example.xxf.bean.Tuser;
import com.example.xxf.bean.TuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TuserMapper {
    int countByExample(TuserExample example);

    int deleteByExample(TuserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tuser record);

    int insertSelective(Tuser record);

    List<Tuser> selectByExampleWithBLOBs(TuserExample example);

    List<Tuser> selectByExample(TuserExample example);

    Tuser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tuser record, @Param("example") TuserExample example);

    int updateByExampleWithBLOBs(@Param("record") Tuser record, @Param("example") TuserExample example);

    int updateByExample(@Param("record") Tuser record, @Param("example") TuserExample example);

    int updateByPrimaryKeySelective(Tuser record);

    int updateByPrimaryKeyWithBLOBs(Tuser record);

    int updateByPrimaryKey(Tuser record);
}