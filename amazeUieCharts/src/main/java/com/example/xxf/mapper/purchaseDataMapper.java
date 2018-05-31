package com.example.xxf.mapper;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface purchaseDataMapper {

   List<LinkedHashMap<String,Object>> getPurchaseDataList(Map<String,Object> parameter);

}