package com.kgc.easybuy_pro.service.impl;

import com.kgc.easybuy_pro.mapper.CategoryMapper;
import com.kgc.easybuy_pro.pojo.Category;
import com.kgc.easybuy_pro.service.CategoryService;
import com.kgc.easybuy_pro.util.ResponseMsg;
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
    public ResponseMsg selectByCategoryList() {
        ResponseMsg msg = new ResponseMsg();
        logger.info("CategoryServiceImpl selectByCategory is start...");
        List<Category> categorieList = categoryMapper.selectCategoryList();
        if (categorieList.isEmpty()) {
            msg.setCode("301");
            return msg;
        }
        msg.setData(categorieList);
        msg.setCode("200");
        logger.debug("CategoryServiceImpl selectByCategory params msg:{}", msg);
        return msg;
    }
}
