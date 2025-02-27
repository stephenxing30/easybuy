package com.kgc.easybuy_pro.util;

import java.util.List;

public class PageInfo<T> {
    private int pageNo;
    private int pageSize;
    private int total;
    private int pages;
    private List<T> list;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        if (total > 0) {
            this.pages = total % pageSize == 0 ? total / pageSize : total / pageSize + 1;
        }
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
