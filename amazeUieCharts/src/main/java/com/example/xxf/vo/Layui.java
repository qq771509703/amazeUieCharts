package com.example.xxf.vo;

import java.util.HashMap;
import java.util.List;

public class Layui extends HashMap<String, Object> {
    public static Layui data(Integer count,List<?> data){
        Layui r = new Layui();
        r.put("code", 0);
        r.put("msg", "");
        r.put("count", count);
        r.put("data", data);
        return r;
    }
    public static Layui data(String msg){
        Layui r = new Layui();
        r.put("code", 0);
        r.put("msg", msg);
        return r;
    }
}