/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.service.impl;

import com.portfolio.model.Blog;
import com.portfolio.repository.BlogRepository;
import com.portfolio.service.BlogService;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Lenovo
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "classpath:spring-database.xml"})
public class BlogServiceImplTest {

    public BlogServiceImplTest() {
    }

    @Autowired
    private BlogRepository blogRepo;
    @Autowired
    private BlogService blogService;
    //List<Blog> blogList = null;

    @Before
    public void setUp() {
        System.out.println("Before Saved data!");
        if (blogRepo != null) {
            System.out.println("Not null!");
            Blog b = new Blog(7, "Hi Kaung Hsat Lwin", "", new Date(), new Date(), new byte[1], 1, 1);
            blogRepo.save(b);
            System.out.println("Saved data!");
        } else {
            System.out.println("Blog Repo is null");
        }
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        List<Blog> result = blogService.findAll();
        Blog b = result.get(0);
        Blog b1 = new Blog(7, "Hi Kaung Hsat Lwin", "", new Date(), new Date(), new byte[1], 1, 1);
        assertBlog(b, b1);
    }

    private void assertBlog(Blog... expected) {
        assertEquals(expected[0].getBlg_title(), expected[1].getBlg_title());
    }

}
