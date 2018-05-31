package com.example.xxf.service;

import com.example.xxf.bean.TBaseDataAnalyzeMenu;
import com.example.xxf.bean.Tuser;
import com.example.xxf.vo.Tree;

import java.util.LinkedHashMap;
import java.util.List;

public interface LoginService {


    /**
     * 根据登录账号获取登录对象
     * @param account
     * @return
     */
    Tuser getUserByAccount(String account);

    List<Tree<TBaseDataAnalyzeMenu>> getAccountMenu(Tuser user);


    List<LinkedHashMap<String,Object>> listMap();

}