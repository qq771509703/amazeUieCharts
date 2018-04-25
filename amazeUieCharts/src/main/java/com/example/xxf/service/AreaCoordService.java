package com.example.xxf.service;

import java.util.List;
import java.util.Map;

public interface AreaCoordService {
   List<Map<String,String>> getCoordByName(List<String> names);

}