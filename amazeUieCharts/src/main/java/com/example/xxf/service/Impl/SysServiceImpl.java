package com.example.xxf.service.Impl;

import com.example.xxf.bean.Lborganization;
import com.example.xxf.bean.LborganizationExample;
import com.example.xxf.mapper.LborganizationMapper;
import com.example.xxf.service.SysService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysServiceImpl implements SysService {


    @Resource
    LborganizationMapper lborganizationMapper;

    @Override
    public List<Lborganization> getLborganizationList(String orgName, int offset, int end) {
        List<Lborganization> list = null;
        try{

            list = lborganizationMapper.getLborganizationList(orgName,offset,end);
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int getLborganizationListCount(String orgName) {
        int count = 0;
        try{
            count = lborganizationMapper.getLborganizationListCount(orgName);
        }catch(Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public List<Lborganization> selectByExample(LborganizationExample example) {
        List<Lborganization> list = null;
        try{
            list = lborganizationMapper.selectByExample(example);
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
}