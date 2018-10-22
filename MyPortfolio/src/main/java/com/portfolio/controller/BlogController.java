/*
 * copyright (c) 2018. All rights reserved.
 */
package com.portfolio.controller;

import com.portfolio.model.Blog;
import com.portfolio.service.BlogService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Lenovo
 */
@ManagedBean(name = "blogController")
@RequestScoped
@Component
public class BlogController {

    private static final long serialVersionUID = 5L;
    @Autowired
    private BlogService blogService;
    private List<Blog> blogList;

    private Blog blog;

    @PostConstruct
    public void init() {
        blog = new Blog();
    }

    public Blog getBlog() {
        return blog;
    }

    public List<Blog> getBlogList() {
        System.out.println("From Blog Controller !!");
        if (blogService != null) {
            System.out.println("From Blog Controller and Blog Service is not null!!");
        }
        blogList = new ArrayList<>();
        System.out.println("Extracting ResultSet from Blog Service.......");
        blogList.addAll(getBlogService().findAll());
        blogList.add(new Blog(6, "Hi Kaung Hsat Lwin", "", new Date(), new Date(), new byte[1], 1, 1));
        return blogList;
    }

    public BlogService getBlogService() {
        return blogService;
    }

    public void addBlog() {
        System.out.print("<!------" + blog.getBlg_title() + blog.getBlg_bdy() + blog.getBlg_img());
    }

}
