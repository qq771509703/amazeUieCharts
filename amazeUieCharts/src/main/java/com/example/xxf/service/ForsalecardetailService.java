package com.example.xxf.service;

import com.example.xxf.bean.Forsalecardetail;
import com.example.xxf.bean.ForsalecardetailExample;
import org.apache.ibatis.annotations.Param;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface ForsalecardetailService {

    int deleteForsalecardetail();

    List<Forsalecardetail> getForsalecardetailByXXFDB(String area, int start, int end);

    int getForsalecardetailCountByXXFDB(String area);

    int batchInsert(List<Forsalecardetail> list);

    List<Forsalecardetail> getForsalecardetailByLocal(Map<String,Object> map);
    int getForsalecardetailCountByLocal(Map<String,Object> map);

    List<LinkedHashMap<String,Object>> getForsalecardetailByLocalToExcel(Map<String,Object> map);

    int countByExample(ForsalecardetailExample example);
}