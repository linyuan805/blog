package com.linyuan.blog.domain;

import java.util.ArrayList;
import java.util.List;


/**
 * @author LinYuan
 * @version 1.0
 * @date 2019/11/1 23:04
 */


public class Type {


    private Long id;

    private String name;





    public Type() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
