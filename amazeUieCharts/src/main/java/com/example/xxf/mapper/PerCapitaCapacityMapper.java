package com.example.xxf.mapper;



import com.example.xxf.bean.perCapitaCapacity;
import com.example.xxf.bean.perCapitaCapacityDetail;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface PerCapitaCapacityMapper {

    /**
     * 获取产能详细表
     * @param department
     * @param offset
     * @param end
     * @return
     */
    List<perCapitaCapacityDetail> getPerCapitaCapacityDetailList(@Param("department")String department,@Param("startRow")int offset,@Param("endRow")int end);

    /**
     * @param department
     * @param offset
     * @param end
     * @return
     */
    List<perCapitaCapacity>getPerCapitaCapacityList(@Param("department")String department,@Param("startRow")int offset,@Param("endRow")int end);

    long getPerCapitaCapacityListCount(@Param("department")String department);


    long getPerCapitaCapacityDetailListCount(@Param("department")String department);


    List<LinkedHashMap<String,Object>> getPerCapitaCapacityListTOExcal(@Param("department")String department);

    List<LinkedHashMap<String,Object>> getPerCapitaCapacityDetailListTOExcal(@Param("department")String department);
}