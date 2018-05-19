package com.example.xxf.mapper;

import com.example.xxf.bean.PerformanceRecord;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public interface PerformanceRecordMapper {

   List<PerformanceRecord> getPerformanceRecord(@Param("s_date")String s_date,@Param("e_date") String e_date,@Param("startRow")int offset, @Param("endRow")int end);

   long getPerformanceRecordCount(@Param("s_date")String s_date,@Param("e_date")String e_date);

    List<PerformanceRecord> getRegionPerformanceRecord(@Param("s_date")String s_date,@Param("e_date")String e_date,@Param("startRow")int offset, @Param("endRow")int end);

    long getRegionPerformanceRecordCount(@Param("s_date")String s_date,@Param("e_date")String e_date);

    List<LinkedHashMap<String,Object>> getTop15Record(@Param("s_date")String s_date,@Param("e_date")String e_date);

    List<LinkedHashMap<String,Object>> getRegionPerformanceRecordTOExcal(@Param("s_date")String s_date,@Param("e_date")String e_date);

    List<LinkedHashMap<String,Object>> getPerformanceRecordTOExcal(@Param("s_date")String s_date,@Param("e_date")String e_date);

}