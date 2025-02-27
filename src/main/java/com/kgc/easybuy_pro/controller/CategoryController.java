package com.kgc.easybuy_pro.controller;

import com.kgc.easybuy_pro.service.CategoryService;
import com.kgc.easybuy_pro.util.ResponseMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    private Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("getCategoryList")
    public ResponseMsg getCategoryList() {
        logger.info("CategoryController getCategoryList is start...");
        ResponseMsg msg = categoryService.selectByCategoryList();
        logger.debug("CategoryController getCategoryList msg:{}", msg);
        return msg;
    }
}
