package com.example.xxf.service.Impl;

import com.example.xxf.Util.BuildTree;
import com.example.xxf.annotation.DBSource;
import com.example.xxf.bean.*;
import com.example.xxf.mapper.*;
import com.example.xxf.service.LoginService;
import com.example.xxf.vo.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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

    @Autowired
    LborganizationMapper lborganizationMapper;



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
    public  List<Tree<TBaseDataAnalyzeMenu>> getAccountMenu(Tuser user) {
        List<TBaseDataAnalyzeMenu> menus = null;
        List<Tree<TBaseDataAnalyzeMenu>> list = null;
        try{
            Lborganization lborganization =  lborganizationMapper.getOrganizationByUserName(user.getUserid());
            String fdncoed = lborganization.getFdncode();
            String[] fdncoeds = fdncoed.split("\\.");
            fdncoed = lborganization.getId()+"";
            if (fdncoeds.length>2){
                fdncoed = fdncoeds[2];
            }
            TBaseDataAnalyzeMenuAclExample Aclexample1 = new TBaseDataAnalyzeMenuAclExample();
            Aclexample1.createCriteria().andCCodeEqualTo(fdncoed);

            List<TBaseDataAnalyzeMenuAcl> menuAcls = tBaseDataAnalyzeMenuAclMapper.selectByExample(Aclexample1);
            TBaseDataAnalyzeMenuAcl menuAcl = null;
            List<Integer> menuCodes = new ArrayList<>();
            for (int i = 0; i < menuAcls.size(); i++) {
                menuAcl = menuAcls.get(i);
                menuCodes.add(Integer.parseInt(menuAcl.getcMenuid()+""));
            }
            TBaseDataAnalyzeMenuExample menuExample = new TBaseDataAnalyzeMenuExample();
            menuExample.createCriteria().andIdIn(menuCodes);
            if ("5183208".equals(user.getUserid())||"5171652".equals(user.getUserid())){
                menuExample = new TBaseDataAnalyzeMenuExample();
            }
            menus = tBaseDataAnalyzeMenuMapper.selectByExample(menuExample);
            List<Tree<TBaseDataAnalyzeMenu>> trees = new ArrayList<Tree<TBaseDataAnalyzeMenu>>();
            for (TBaseDataAnalyzeMenu menu : menus) {
                Tree<TBaseDataAnalyzeMenu> tree = new Tree<TBaseDataAnalyzeMenu>();
                tree.setId(menu.getId().toString());
                tree.setParentId(menu.getcParentid().toString());
                tree.setText(menu.getcTitle());
                tree.setHasHref(menu.getcUseable().toString());
                Map<String, Object> attributes = new HashMap<>(16);
                attributes.put("url", menu.getcUrl());
                attributes.put("icon", menu.getcIcon());
                tree.setAttributes(attributes);
                trees.add(tree);
            }
           list = BuildTree.buildList(trees, "0");

            //根据用户（Tuser）获取到角色（TBaseDataAnalyzeAccountRole）
//            TBaseDataAnalyzeAccountRoleExample Roleexample = new TBaseDataAnalyzeAccountRoleExample();
//            Roleexample.createCriteria().andCAccountEqualTo(user.getUserid()+"");
//            List<TBaseDataAnalyzeAccountRole> roles = tBaseDataAnalyzeAccountRoleMapper.selectByExample(Roleexample);
//            if (roles!=null && !roles.isEmpty()){
//                //根据用户（Tuser）的角色（TBaseDataAnalyzeAccountRole）获取到角色权限（TBaseDataAnalyzeMenuAcl）
//                TBaseDataAnalyzeMenuAclExample Aclexample1 = new TBaseDataAnalyzeMenuAclExample();
//                Aclexample1.createCriteria().andCCodeEqualTo(roles.get(0).getcRolecode());
//                List<TBaseDataAnalyzeMenuAcl> menuAcls = tBaseDataAnalyzeMenuAclMapper.selectByExample(Aclexample1);
//                TBaseDataAnalyzeMenuAcl menuAcl = null;
//                List<Integer> menuCodes = new ArrayList<>();
//                for (int i = 0; i < menuAcls.size(); i++) {
//                    menuAcl = menuAcls.get(i);
//                    menuCodes.add(Integer.parseInt(menuAcl.getcMenuid()+""));
//                }
//                //根据角色权限（TBaseDataAnalyzeMenuAcl）的menuid获取到菜单（TBaseDataAnalyzeMenu）
//                TBaseDataAnalyzeMenuExample menuExample = new TBaseDataAnalyzeMenuExample();
//                menuExample.createCriteria().andIdIn(menuCodes);
//                menus = tBaseDataAnalyzeMenuMapper.selectByExample(menuExample);
//            }
        }catch(Exception e){
            e.printStackTrace();
        }
    return list;
    }

    @DBSource(source = "local")
    @Override
    public List<LinkedHashMap<String, Object>> listMap() {
        List list = lborganizationMapper.listMap();
        return list;
    }
}