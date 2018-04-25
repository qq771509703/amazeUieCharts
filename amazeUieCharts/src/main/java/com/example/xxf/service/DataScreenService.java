package com.example.xxf.service;


import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DataScreenService {

    //获取总销量多少台
    String getGross_sales_count();
    //获取总销量多少钱
    String getGross_sales_performance();

    //获取当年销售多少台
    String getYear_sales_count();
    //获取当年销售多少钱
    String getYear_sales_performance();

    List<Map<String,Object>> region_performance(Integer s_year);

    List<String> getNewDealCity();

    /**
     * 获取采购品牌
     * @return
     */
    List<Map<String,Object>> getPurchaseBrand();

    /**
     * 获取采购品牌
     * @return
     */
    List<Map<String,Object>> getSalesBrand();


    /**
     * 获取销售人员年龄分布
     * @return
     */
    List<Map<String,Object>> getSalesStaffDistribution();


    /**
     * 总部人员分布
     * @return
     */
    List<Map<String,Object>> getHQDistribution();

}