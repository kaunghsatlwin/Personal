/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.service.impl;

import com.portfolio.model.Blog;
import com.portfolio.repository.BlogRepository;
import com.portfolio.service.BlogService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lenovo
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepo;

    @Override
    @Transactional
    public List<Blog> findAll() {
        return blogRepo.findAll();
    }
}
