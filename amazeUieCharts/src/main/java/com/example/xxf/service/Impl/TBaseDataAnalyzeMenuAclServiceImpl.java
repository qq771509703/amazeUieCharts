package com.example.xxf.service.Impl;

import com.example.xxf.bean.Lborganization;
import com.example.xxf.bean.RoleMenuDO;
import com.example.xxf.bean.TBaseDataAnalyzeMenuAclExample;
import com.example.xxf.mapper.LborganizationMapper;
import com.example.xxf.mapper.TBaseDataAnalyzeMenuAclMapper;
import com.example.xxf.service.TBaseDataAnalyzeMenuAclService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TBaseDataAnalyzeMenuAclServiceImpl implements TBaseDataAnalyzeMenuAclService {

    @Autowired
    TBaseDataAnalyzeMenuAclMapper tBaseDataAnalyzeMenuAclMapper;

    @Resource
    LborganizationMapper lborganizationMapper;

    @Override
    public void deleteRoleAcl(String roleId) {
        try{
//            Lborganization lborganization =  lborganizationMapper.getOrganizationByUserName(roleId);
//            String fdncoed = lborganization.getFdncode();
//            String[] fdncoeds = fdncoed.split("\\.");
//            fdncoed = lborganization.getId()+"";
//            if (fdncoeds.length>2){
//                fdncoed = fdncoeds[2];
//            }
            TBaseDataAnalyzeMenuAclExample example = new TBaseDataAnalyzeMenuAclExample();
            example.createCriteria().andCCodeEqualTo(roleId);
            tBaseDataAnalyzeMenuAclMapper.deleteByExample(example);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public int batchSave(List<RoleMenuDO> list) {
        int count = 0;
        try{
            count = tBaseDataAnalyzeMenuAclMapper.batchSave(list);
        }catch(Exception e){
            e.printStackTrace();
        }
         return count;
    }
}