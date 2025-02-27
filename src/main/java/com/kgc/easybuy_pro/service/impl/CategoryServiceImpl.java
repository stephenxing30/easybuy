package com.kgc.easybuy_pro.service.impl;

import com.kgc.easybuy_pro.mapper.CategoryMapper;
import com.kgc.easybuy_pro.pojo.Category;
import com.kgc.easybuy_pro.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> selectByCategoryList() {
        logger.info("CategoryServiceImpl selectByCategory is start...");
        List<Category> categories = categoryMapper.selectCategoryList();
        return categories;
    }
}
