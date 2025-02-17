package com.situ.blog;

import lombok.Data;
import java.util.Date;

@Data
public class Blog {
    private Integer id;
    private String name;
    private String image;
    private Integer clickCount;
    private String content;
    private Integer typeId;
    private Integer status;
    private Boolean deleted;
    private Date createTime;
    private Date updateTime;
}
