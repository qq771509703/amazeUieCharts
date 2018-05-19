package com.example.xxf.service;

import com.example.xxf.bean.RoleMenuDO;

import java.util.List;

public interface TBaseDataAnalyzeMenuAclService {

    void deleteRoleAcl(String roleId);

    int batchSave(List<RoleMenuDO> list);
}