package com.kgc.easybuy_project.pojo;

import java.util.List;

public class PageInfo<T> {

    private int curPage = 1;
    private int pageSize;
    private int total;
    private int pages;
    private List<T> list;

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return total;
    }

    public void setTotalCount(int totalCount) {
        this.total = totalCount;
        if (totalCount > 0) {
            pages = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
        }
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
