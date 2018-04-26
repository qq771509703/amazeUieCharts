package com.example.xxf.service.Impl;

import com.example.xxf.bean.*;
import com.example.xxf.mapper.TBaseDataAnalyzeAccountRoleMapper;
import com.example.xxf.mapper.TBaseDataAnalyzeMenuAclMapper;
import com.example.xxf.mapper.TBaseDataAnalyzeMenuMapper;
import com.example.xxf.mapper.TuserMapper;
import com.example.xxf.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private TuserMapper tuserMapper;

    @Autowired
    private TBaseDataAnalyzeAccountRoleMapper tBaseDataAnalyzeAccountRoleMapper;

    @Autowired
    TBaseDataAnalyzeMenuAclMapper tBaseDataAnalyzeMenuAclMapper;

    @Autowired
    TBaseDataAnalyzeMenuMapper tBaseDataAnalyzeMenuMapper;

    @Override
    public Tuser getUserByAccount(String account) {
        List<Tuser> list = null;
        try
        {
            TuserExample example = new TuserExample();
            example.createCriteria().andUseridEqualTo(account);
            list = tuserMapper.selectByExample(example);
            if (list!=null){
                return list.get(0);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public  List<TBaseDataAnalyzeMenu> getAccountMenu(Tuser user) {
        List<TBaseDataAnalyzeMenu> menus = null;
        try{
            TBaseDataAnalyzeAccountRoleExample Roleexample = new TBaseDataAnalyzeAccountRoleExample();
            Roleexample.createCriteria().andCAccountEqualTo(user.getUserid()+"");
            List<TBaseDataAnalyzeAccountRole> roles = tBaseDataAnalyzeAccountRoleMapper.selectByExample(Roleexample);
            if (roles!=null && !roles.isEmpty()){
                TBaseDataAnalyzeMenuAclExample Aclexample1 = new TBaseDataAnalyzeMenuAclExample();
                Aclexample1.createCriteria().andCCodeEqualTo(roles.get(0).getcRolecode());
                List<TBaseDataAnalyzeMenuAcl> menuAcls = tBaseDataAnalyzeMenuAclMapper.selectByExample(Aclexample1);
                TBaseDataAnalyzeMenuAcl menuAcl = null;
                List<Integer> menuCodes = new ArrayList<>();
                for (int i = 0; i < menuAcls.size(); i++) {
                    menuAcl = menuAcls.get(i);
                    menuCodes.add(Integer.parseInt(menuAcl.getcMenuid()+""));
                }
                TBaseDataAnalyzeMenuExample menuExample = new TBaseDataAnalyzeMenuExample();
                menuExample.createCriteria().andIdIn(menuCodes);
                menus = tBaseDataAnalyzeMenuMapper.selectByExample(menuExample);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    return menus;
    }
}