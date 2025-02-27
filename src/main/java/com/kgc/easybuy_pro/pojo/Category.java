package com.kgc.easybuy_pro.pojo;


public class Category {

    private Integer categoryid;
    private String categoryname;
    private String childcategoryname;
    private String grandsoncategoryname;

    public String getChildcategoryname() {
        return childcategoryname;
    }

    public void setChildcategoryname(String childcategoryname) {
        this.childcategoryname = childcategoryname;
    }

    public String getGrandsoncategoryname() {
        return grandsoncategoryname;
    }

    public void setGrandsoncategoryname(String grandsoncategoryname) {
        this.grandsoncategoryname = grandsoncategoryname;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }


    @Override
    public String toString() {
        return "Category{" +
                "categoryid=" + categoryid +
                ", categoryname='" + categoryname + '\'' +
                ", childcategoryname='" + childcategoryname + '\'' +
                ", grandsoncategoryname='" + grandsoncategoryname + '\'' +
                '}';
    }
}
