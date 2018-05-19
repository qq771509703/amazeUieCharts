package com.example.xxf.service.Impl;

import com.example.xxf.Util.BuildTree;
import com.example.xxf.bean.TBaseDataAnalyzeMenu;
import com.example.xxf.bean.TBaseDataAnalyzeMenuAcl;
import com.example.xxf.bean.TBaseDataAnalyzeMenuAclExample;
import com.example.xxf.bean.TBaseDataAnalyzeMenuExample;
import com.example.xxf.mapper.TBaseDataAnalyzeMenuAclMapper;
import com.example.xxf.mapper.TBaseDataAnalyzeMenuMapper;
import com.example.xxf.service.MenuService;
import com.example.xxf.vo.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    TBaseDataAnalyzeMenuMapper tBaseDataAnalyzeMenuMapper;

    @Autowired
    TBaseDataAnalyzeMenuAclMapper tBaseDataAnalyzeMenuAclMapper;

    @Override
    public Tree<TBaseDataAnalyzeMenu> getTree(Long id) {

        List<TBaseDataAnalyzeMenu> menus = null;
        Integer intId = id.intValue();
        try{
            menus = tBaseDataAnalyzeMenuMapper.selectByExample(new TBaseDataAnalyzeMenuExample());
            TBaseDataAnalyzeMenuAclExample example = new TBaseDataAnalyzeMenuAclExample();
            example.createCriteria().andCCodeEqualTo(intId+"");
            List<TBaseDataAnalyzeMenuAcl> menuAcl = tBaseDataAnalyzeMenuAclMapper.selectByExample(example);

            List<Integer> menuIds = new ArrayList<>();
            for (TBaseDataAnalyzeMenuAcl tBaseDataAnalyzeMenuAcl : menuAcl) {
                menuIds.add(tBaseDataAnalyzeMenuAcl.getcMenuid());
            }
            List<Integer> temp = menuIds;
            for (TBaseDataAnalyzeMenu menu : menus) {
                if (temp.contains(menu.getcParentid())) {
                    menuIds.remove(menu.getcParentid());
                }
            }
            List<Tree<TBaseDataAnalyzeMenu>> trees = new ArrayList<Tree<TBaseDataAnalyzeMenu>>();
            List<TBaseDataAnalyzeMenu> menuDOs  = tBaseDataAnalyzeMenuMapper.selectByExample(new TBaseDataAnalyzeMenuExample());
            for (TBaseDataAnalyzeMenu sysMenuDO : menuDOs) {
                Tree<TBaseDataAnalyzeMenu> tree = new Tree<TBaseDataAnalyzeMenu>();
                tree.setId(sysMenuDO.getId().toString());
                tree.setParentId(sysMenuDO.getcParentid().toString());
                tree.setText(sysMenuDO.getcTitle());
                Map<String, Object> state = new HashMap<>(16);
                int menuId = sysMenuDO.getId();
                if (menuIds.contains(menuId)) {
                    state.put("selected", true);
                } else {
                    state.put("selected", false);
                }
                tree.setState(state);
                trees.add(tree);
            }
            Tree<TBaseDataAnalyzeMenu> t = BuildTree.build(trees);
            return t;


        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}