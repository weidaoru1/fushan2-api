package com.fushan2api.common.utils;

import java.io.Serializable;

public class DataGrid implements Serializable {

    private static final long serialVersionUID = 8762216290541983128L;
    private int pageSize = 10;
    private int pageNum = 1;
    private String order = "asc";
    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    public int getPageNum()
    {
        return pageNum;
    }

    public void setPageNum(int pageNum)
    {
        this.pageNum = pageNum;
    }

    public String getOrder()
    {
        return order;
    }

    public void setOrder(String order)
    {
        this.order = order;
    }
}
