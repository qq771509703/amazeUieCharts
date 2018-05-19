package com.example.xxf.mapper;

import com.example.xxf.bean.Lborganization;
import com.example.xxf.bean.LborganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LborganizationMapper {
    int countByExample(LborganizationExample example);

    int deleteByExample(LborganizationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Lborganization record);

    int insertSelective(Lborganization record);

    List<Lborganization> selectByExample(LborganizationExample example);

    Lborganization selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Lborganization record, @Param("example") LborganizationExample example);

    int updateByExample(@Param("record") Lborganization record, @Param("example") LborganizationExample example);

    int updateByPrimaryKeySelective(Lborganization record);

    int updateByPrimaryKey(Lborganization record);

    Lborganization getOrganizationByUserName(@Param("userID") String userID);

    List<Lborganization> getLborganizationList(@Param("orgName") String orgName,@Param("startRow")int offset,@Param("endRow")int end);

    int getLborganizationListCount(@Param("orgName") String orgName);
}