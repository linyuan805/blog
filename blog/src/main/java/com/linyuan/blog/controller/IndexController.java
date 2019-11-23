package com.linyuan.blog.controller;

import com.linyuan.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LinYuan
 * @version 1.0
 * @date 2019/10/31 17:10
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
//        int i = 9/0;
//        String blog = null;
//        if (blog == null){
//            throw new NotFoundException("博客不存在");
//        }
        System.out.println("---------index--------");
        return "index";
    }

    @RequestMapping("/blog")
    public String blog(){
//        int i = 9/0;
//        String blog = null;
//        if (blog == null){
//            throw new NotFoundException("博客不存在");
//        }
        System.out.println("---------blog--------");
        return "blog";
    }
}
