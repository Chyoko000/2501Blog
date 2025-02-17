package com.situ.blog.pojo.query;

import lombok.Data;

@Data
public class BlogQuery {
    private Integer page;
    private Integer limit;
    private String name;
}

