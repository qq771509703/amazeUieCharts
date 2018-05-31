package com.example.xxf.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface purchaseDataService {

    List<LinkedHashMap<String,Object>> getPurchaseDataList(Map<String,Object> parameter);
}