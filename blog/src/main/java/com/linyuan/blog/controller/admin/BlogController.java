package com.linyuan.blog.controller.admin;

import com.linyuan.blog.domain.Blog;
import com.linyuan.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author LinYuan
 * @version 1.0
 * @date 2019/11/5 11:02
 */
@Controller
@RequestMapping("/admin")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/blogs")
    public String blogs(Blog blog, Model model){

        model.addAttribute("blogList",blogService.findAllBlog(blog));

        return "admin/blogs";
    }

    @GetMapping("/blogs/search")
    public String search(Blog blog, Model model){

        model.addAttribute("blogList",blogService.findAllBlog(blog));

        return "admin/blogs :: blogSearchList";
    }


}
