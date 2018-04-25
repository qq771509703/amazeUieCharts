package com.example.xxf.service.Impl;

import com.example.xxf.annotation.DBSource;
import com.example.xxf.mapper.AreaCoordMapper;
import com.example.xxf.service.AreaCoordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AreaCoordServiceImp implements AreaCoordService {

    @Autowired
    AreaCoordMapper areaCoordMapper;

    @DBSource(source = "xxfcar")
    @Override
    public List<Map<String,String>> getCoordByName(List<String> names) {
        List<Map<String,String>> listMap = new ArrayList<>();
        Map<String,Object> map = new HashMap();
        try{
            map.put("names",names);
           return areaCoordMapper.getCoordByName(map);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMap;
    }
}