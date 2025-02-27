package com.kgc.easybuy_pro.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.kgc.easybuy_pro.mapper.CategoryMapper;
import com.kgc.easybuy_pro.pojo.Category;
import com.kgc.easybuy_pro.service.CategoryService;
import com.kgc.easybuy_pro.util.PageInfo;
import com.kgc.easybuy_pro.util.ResponseMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CategoryServiceImpl implements CategoryService {
    private Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public ResponseMsg selectByCategoryList(Map<String, Object> params) {
        ResponseMsg msg = new ResponseMsg();
        PageInfo<Category> pageInfo = new PageInfo<>();
        logger.info("CategoryServiceImpl selectByCategory is start...");
        if (params.containsKey("pageNo")) {
            pageInfo.setPageNo(Integer.parseInt(params.get("pageNo").toString()));
        }
        if (params.containsKey("pageSize")) {
            pageInfo.setPageSize(Integer.parseInt(params.get("pageSize").toString()));
        }
        params.put("from", (pageInfo.getPageNo() - 1) * pageInfo.getPageSize());
        pageInfo.setList(categoryMapper.selectCategoryList(params));
        pageInfo.setTotal(categoryMapper.selectCount(params));
        msg.setData(pageInfo);
        msg.setCode("200");
        logger.debug("CategoryServiceImpl selectByCategory params msg:{}", msg);
        return msg;
    }

    @Override
    public ResponseMsg selectThirdCategory() {
        logger.info("CategoryServiceImpl selectThirdCategory is start...");
        ResponseMsg msg = new ResponseMsg();
        List<Category> categories = categoryMapper.selectThirdCategory();
        if (categories.isEmpty()) {
            msg.setCode("301");
            msg.setMsg("There is no categories any more");
            return msg;
        }
        msg.setData(categories);
        msg.setCode("200");
        return msg;
    }
}
