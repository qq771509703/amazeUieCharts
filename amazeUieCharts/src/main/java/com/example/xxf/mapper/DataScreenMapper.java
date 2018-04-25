package com.example.xxf.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DataScreenMapper {

    int getGross_sales_count();

    double getGross_sales_performance();


    int getYear_sales_count();

    double getYear_sales_performance();

    List<Map<String,Object>> region_performance(@Param("s_year") Integer s_year);

    List<String> getNewDealCity();

    List<Map<String,Object>> getPurchaseBrand();

    /**
     * 获取销售品牌
     * @return
     */
    List<Map<String,Object>> getSalesBrand();

    /**
     * 营销人员年龄分布
     * @return
     */
    List<Map<String,Object>> getSalesStaffDistribution();


    /**
     * 总部人员分布
     * @return
     */
    List<Map<String,Object>> getHQDistribution();


}