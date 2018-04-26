package com.example.xxf.service;

import com.example.xxf.bean.TBaseDataAnalyzeMenu;
import com.example.xxf.bean.Tuser;

import java.util.List;

public interface LoginService {


    /**
     * 根据登录账号获取登录对象
     * @param account
     * @return
     */
    Tuser getUserByAccount(String account);

    List<TBaseDataAnalyzeMenu> getAccountMenu(Tuser user);

}