package com.example.xxf.service;

import com.example.xxf.bean.Lborganization;
import com.example.xxf.bean.LborganizationExample;

import java.util.List;

public interface SysService {

    List<Lborganization> getLborganizationList(String orgName,int offset,int end);
    int getLborganizationListCount(String orgName);


    List<Lborganization> selectByExample(LborganizationExample example);
}