package com.example.xxf.mapper;

import com.example.xxf.bean.RoleMenuDO;
import com.example.xxf.bean.TBaseDataAnalyzeMenuAcl;
import com.example.xxf.bean.TBaseDataAnalyzeMenuAclExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBaseDataAnalyzeMenuAclMapper {
    int countByExample(TBaseDataAnalyzeMenuAclExample example);

    int deleteByExample(TBaseDataAnalyzeMenuAclExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBaseDataAnalyzeMenuAcl record);

    int insertSelective(TBaseDataAnalyzeMenuAcl record);

    List<TBaseDataAnalyzeMenuAcl> selectByExample(TBaseDataAnalyzeMenuAclExample example);

    TBaseDataAnalyzeMenuAcl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBaseDataAnalyzeMenuAcl record, @Param("example") TBaseDataAnalyzeMenuAclExample example);

    int updateByExample(@Param("record") TBaseDataAnalyzeMenuAcl record, @Param("example") TBaseDataAnalyzeMenuAclExample example);

    int updateByPrimaryKeySelective(TBaseDataAnalyzeMenuAcl record);

    int updateByPrimaryKey(TBaseDataAnalyzeMenuAcl record);


    int batchSave(List<RoleMenuDO> list);
}