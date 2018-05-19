package com.example.xxf.service;

import com.example.xxf.bean.TBaseDataAnalyzeMenu;
import com.example.xxf.vo.Tree;

public interface MenuService {
    Tree<TBaseDataAnalyzeMenu> getTree(Long id);
}