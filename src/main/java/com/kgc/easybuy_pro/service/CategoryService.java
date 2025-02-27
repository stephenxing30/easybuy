package com.kgc.easybuy_pro.service;

import com.kgc.easybuy_pro.pojo.Category;
import com.kgc.easybuy_pro.util.ResponseMsg;

import java.util.List;
import java.util.Map;

public interface CategoryService {
    ResponseMsg selectByCategoryList(Map<String, Object> params);

    //查询出三级分类
    ResponseMsg selectThirdCategory();
}
