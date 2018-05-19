package com.example.xxf.controller;

import com.example.xxf.bean.Lborganization;
import com.example.xxf.bean.LborganizationExample;
import com.example.xxf.bean.RoleMenuDO;
import com.example.xxf.bean.TBaseDataAnalyzeMenu;
import com.example.xxf.mapper.LborganizationMapper;
import com.example.xxf.service.MenuService;
import com.example.xxf.service.SysService;
import com.example.xxf.service.TBaseDataAnalyzeMenuAclService;
import com.example.xxf.vo.Layui;
import com.example.xxf.vo.ResponseVo;
import com.example.xxf.vo.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/admin")
@Controller
public class sysController {

    @Autowired
    SysService sysService;

    @Autowired
    MenuService menuService;

    @Autowired
    TBaseDataAnalyzeMenuAclService tBaseDataAnalyzeMenuAclService;


    @RequestMapping("getOrganizationList")
    @ResponseBody
    public Layui getOrganizationList(String orgName,int page, int pageSize){

        int start = (page-1)*pageSize+1;
        int end = page*pageSize;
        List list = sysService.getLborganizationList(orgName,start,end);
        int count = sysService.getLborganizationListCount(orgName);
        return Layui.data(count,list);
    }



    @GetMapping("/edit/{id}")
    String edit(@PathVariable("id") Long id, Model model) {
        LborganizationExample example = new LborganizationExample();
        example.createCriteria().andIdEqualTo(id);
        Lborganization roleDO = sysService.selectByExample(example).get(0);
        model.addAttribute("role", roleDO);
        return "admin/role/edit";
    }

    @GetMapping("/tree/{roleId}")
    @ResponseBody
    Tree<TBaseDataAnalyzeMenu> tree(@PathVariable("roleId") Long roleId) {
        Tree<TBaseDataAnalyzeMenu> tree = menuService.getTree(roleId);
        return tree;
    }


    @PostMapping("/roleAcl/update")
    @ResponseBody
    public ResponseVo upataRoleAcl(String menuIds,String roleId){
        ResponseVo vo = new ResponseVo();
        if (!"".equals(menuIds)){
           String[] sMenuIds = menuIds.split(",");
            List<String> list = Arrays.asList(sMenuIds);
            List<String> arrList = new ArrayList(list);
           // arrList.remove("-1");
            tBaseDataAnalyzeMenuAclService.deleteRoleAcl(roleId);
            List<RoleMenuDO> rms = new ArrayList<>();
            for (String menuId : arrList) {
                RoleMenuDO rmDo = new RoleMenuDO();
                rmDo.setRoleId(roleId);
                rmDo.setMenuId(menuId);
                rms.add(rmDo);
            }

            tBaseDataAnalyzeMenuAclService.batchSave(rms);
        }
        return vo;
    }

}