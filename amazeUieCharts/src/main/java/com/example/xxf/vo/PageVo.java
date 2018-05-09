package com.example.xxf.vo;

import java.util.List;

public class PageVo {
    List<?> rows;
    int total;


    public PageVo(List<?> rows, int total) {
        this.rows = rows;
        this.total = total;
    }

    public PageVo() {
       super();
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}