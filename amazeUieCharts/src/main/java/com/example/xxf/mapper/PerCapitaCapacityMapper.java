package com.example.xxf.mapper;



import com.example.xxf.bean.perCapitaCapacity;
import com.example.xxf.bean.perCapitaCapacityDetail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface   PerCapitaCapacityMapper {

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


    /**
     * 获取数据，用来存到本地库
     * @return
     */
    List<perCapitaCapacity> getPerCapitaCapacityListByBase(@Param("startRow")int start, @Param("endRow")int end);

    int batchSave(List<perCapitaCapacity> list);

    @Delete("delete from perCapitaCapacityTable")
    void deletePerCapitaCapacity();

    int getPerCapitaCapacityListByBaseCount();


    List<perCapitaCapacity> getPerCapitaCapacityListByLocal(Map<String,Object> map);

    int getPerCapitaCapacityListByLocalCount(Map<String,Object> map);

    /**
     * 导出Excel时获取数据的借口
     * @return
     */
    List<LinkedHashMap<String,Object>> getPerCapitaCapacityListByLocalTOExcel(Map<String,Object> map);


    /**
     * 获取部门初始化人均产能中的下拉菜单
     * @return
     */
    List<String> getDepartmentInitialize_select();
}