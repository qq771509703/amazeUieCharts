package com.example.xxf.mapper;

import com.example.xxf.bean.Forsalecardetail;
import com.example.xxf.bean.ForsalecardetailExample;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ForsalecardetailMapper {
    int countByExample(ForsalecardetailExample example);

    int deleteByExample(ForsalecardetailExample example);

    int insert(Forsalecardetail record);

    int insertSelective(Forsalecardetail record);

    List<Forsalecardetail> selectByExample(ForsalecardetailExample example);

    int updateByExampleSelective(@Param("record") Forsalecardetail record, @Param("example") ForsalecardetailExample example);

    int updateByExample(@Param("record") Forsalecardetail record, @Param("example") ForsalecardetailExample example);

    List<Forsalecardetail>getForsalecardetailByXXFDB(@Param("area")String area,@Param("startRow")int start, @Param("endRow")int end);

    int getForsalecardetailCountByXXFDB(@Param("area")String area);


    int batchInsert(List<Forsalecardetail> list);


    List<Forsalecardetail> getForsalecardetailByLocal(Map<String,Object> map);
    int getForsalecardetailCountByLocal(Map<String,Object> map);

    List<LinkedHashMap<String,Object>> getForsalecardetailByLocalToExcel(Map<String,Object> map);

}