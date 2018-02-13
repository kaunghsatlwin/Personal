/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.service;

import com.portfolio.model.Blog;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface BlogService {
//    Find all written blog

    public List<Blog> findAll();
}
