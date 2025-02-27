package com.kgc.easybuy_pro.controller;

import com.kgc.easybuy_pro.service.CategoryService;
import com.kgc.easybuy_pro.util.ResponseMsg;
import com.mysql.cj.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CategoryController {
    private Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("getCategoryList")
    @CrossOrigin
    public ResponseMsg getCategoryList(String pageNo, String pageSize, String childcategoryname) {
        logger.info("CategoryController getCategoryList params pageNo:{},pageSize:{},childcategoryname:{}", pageNo, pageSize, childcategoryname);
        Map<String, Object> params = new HashMap<>();
        if (!StringUtils.isNullOrEmpty(childcategoryname)) {
            params.put("childcategoryname", childcategoryname);
        }
        params.put("pageNo", Integer.parseInt(pageNo));
        if (!StringUtils.isNullOrEmpty(pageNo)) {
            params.put("pageNo", pageNo);
        }
        params.put("pageSize", Integer.valueOf(pageSize));
        ResponseMsg msg = categoryService.selectByCategoryList(params);
        logger.debug("CategoryController getCategoryList msg:{}", msg);
        return msg;
    }

    @RequestMapping("selectThirdCategory")
    @CrossOrigin
    public ResponseMsg selectThirdCategory() {
        logger.info("CategoryController selectThirdCategory is start...");
        ResponseMsg msg = categoryService.selectThirdCategory();
        logger.debug("CategoryController selectThirdCategory msg:{}", msg);
        return msg;
    }
}
