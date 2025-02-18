package com.situ.blog.service;

import com.situ.blog.pojo.Blog;
import com.situ.blog.util.PageInfo;

import java.util.List;

public interface IBlogService {
    List<Blog> selectAll();
    void deleteById(int id);
    void add(Blog banji);
    Blog selectById(int id);
    void update(Blog banji);

    PageInfo<Blog> selectByPage(int pageNo, int pageSize);
}
