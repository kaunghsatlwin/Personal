/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.repository;

import com.portfolio.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lenovo
 */
@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {

    @Query("SELECT max(e.blg_id) FROM Blog e")//Retrieving Maximun Id of Employee Record
    Integer getMaxBlogId();

}
