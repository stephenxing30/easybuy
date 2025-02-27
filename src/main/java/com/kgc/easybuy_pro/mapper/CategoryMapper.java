package com.kgc.easybuy_pro.mapper;

import com.kgc.easybuy_pro.pojo.Category;

import java.util.List;
import java.util.Map;

public interface CategoryMapper {
    List<Category> selectCategoryList(Map<String, Object> params);
    int selectCount(Map<String, Object> params);

    //查询出三级分类
    List<Category> selectThirdCategory();
}
