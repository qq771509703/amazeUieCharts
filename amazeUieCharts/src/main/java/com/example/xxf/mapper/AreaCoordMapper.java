package com.example.xxf.mapper;

import java.util.List;
import java.util.Map;

public interface AreaCoordMapper {

    List<Map<String,String>> getCoordByName(Map<String,Object> param);

}