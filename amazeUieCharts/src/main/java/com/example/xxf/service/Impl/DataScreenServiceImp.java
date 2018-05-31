package com.example.xxf.service.Impl;

import com.example.xxf.annotation.DBSource;
import com.example.xxf.mapper.DataScreenMapper;
import com.example.xxf.mapper.TuserMapper;
import com.example.xxf.service.DataScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class DataScreenServiceImp implements DataScreenService {

    @Autowired
    DataScreenMapper dataScreenMapper;

    @Override
    public String getGross_sales_count() {
        int count = 0;
        String str = "0";
        try {
            count = dataScreenMapper.getGross_sales_count();
//            NumberFormat nf = new DecimalFormat("#,###.##");
//            str = nf.format(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count+"";
    }

    @Override
    public String getGross_sales_performance() {
        double count = 0;
        String str = "0";
            try{
                count = dataScreenMapper.getGross_sales_performance();

                NumberFormat nf = new DecimalFormat("#,###.##");
                str = nf.format(count);
            }catch (Exception e){
                e.printStackTrace();
            }
        return str;
    }

    @Override
    public String getYear_sales_count() {
        int count = 0;
        String str = "0";
        try {
            count = dataScreenMapper.getYear_sales_count();
//            NumberFormat nf = new DecimalFormat("#,###.##");
//            str = nf.format(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count+"";

    }

    @Override
    public String getYear_sales_performance() {
        double count = 0;
        String str = "0";
        try{
            count = dataScreenMapper.getYear_sales_performance();
            NumberFormat nf = new DecimalFormat("#,###.##");
            str = nf.format(count);
        }catch (Exception e){
            e.printStackTrace();
        }
        return str;
    }

    @Override
    public List<Map<String, Object>> region_performance(Integer s_year) {
        List<Map<String, Object>> listMap = null;
        try{
            listMap = dataScreenMapper.region_performance(s_year);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }

    @Override
    public List<String> getNewDealCity() {
        List<String> list = new ArrayList<>();
        try{
            list = dataScreenMapper.getNewDealCity();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Map<String, Object>> getPurchaseBrand() {
        List<Map<String, Object>> listMap = new ArrayList<>();
        try{
            listMap = dataScreenMapper.getPurchaseBrand();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }

    @Override
    public List<Map<String, Object>> getSalesBrand() {
        List<Map<String, Object>> listMap = new ArrayList<>();
        try{
            listMap = dataScreenMapper.getSalesBrand();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }

    @DBSource(source = "xxf")
    @Override
    public List<Map<String, Object>> getSalesStaffDistribution() {
        List<Map<String, Object>> listMap = new ArrayList<>();
        try{
            listMap = dataScreenMapper.getSalesStaffDistribution();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }
    @DBSource(source = "xxf")
    @Override
    public List<Map<String, Object>> getHQDistribution() {
        List<Map<String, Object>> listMap = new ArrayList<>();
        try{
            listMap = dataScreenMapper.getHQDistribution();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }

    @Override
    public List<Map<String, Object>> year_financing_amoun() {
        List<Map<String, Object>> listMap = new ArrayList<>();
        try{
            listMap = dataScreenMapper.year_financing_amoun();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }
}