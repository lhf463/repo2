package com.leyou.service;

import com.leyou.item.pojo.Category;
import com.leyou.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    public List<Category> queryCategoriesByPid(Long pid) {
        Category category=new Category();
        category.setParentId(pid);
        return this.categoryMapper.select(category);
    }
}
