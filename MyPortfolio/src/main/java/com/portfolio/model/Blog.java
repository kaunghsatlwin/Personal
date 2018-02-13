/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "Blog", catalog = "public")
public class Blog implements Serializable {

    private static final long serialVersionUID = 5L;

    @Id
    @Column(name = "blg_id", unique = true, nullable = false)
    private int blg_id;
    @Column(name = "blg_title", unique = false, nullable = false)
    private String blg_title;
    @Column(name = "blg_bdy", unique = false, nullable = false)
    private String blg_bdy;
    @Column(name = "blg_crtdate", unique = false, nullable = false)
    private Date blg_crtdate;
    @Column(name = "blg_mdydate", unique = false, nullable = true)
    private Date blg_mdydate;
    @Column(name = "blg_img", unique = false, nullable = true)
    private byte[] blg_img;
//One Blog may have many comments,
//Table is related auto and
//if parent type is remove, child is auto remove
    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Comment> comments = new ArrayList<>();
    @Column(name = "blg_status", unique = false, nullable = false)
    private int blg_status;
    @Column(name = "blg_review", unique = false, nullable = false)
    private int blg_review;

    public Blog() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getBlg_id() {
        return blg_id;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setBlg_id(int blg_id) {
        this.blg_id = blg_id;
    }

    public String getBlg_title() {
        return blg_title;
    }

    public void setBlg_title(String blg_title) {
        this.blg_title = blg_title;
    }

    public String getBlg_bdy() {
        return blg_bdy;
    }

    public void setBlg_bdy(String blg_bdy) {
        this.blg_bdy = blg_bdy;
    }

    public Date getBlg_crtdate() {
        return blg_crtdate;
    }

    public void setBlg_crtdate(Date blg_crtdate) {
        this.blg_crtdate = blg_crtdate;
    }

    public Date getBlg_mdydate() {
        return blg_mdydate;
    }

    public void setBlg_mdydate(Date blg_mdydate) {
        this.blg_mdydate = blg_mdydate;
    }

    public byte[] getBlg_img() {
        return blg_img;
    }

    public void setBlg_img(byte[] blg_img) {
        this.blg_img = blg_img;
    }

    public int getBlg_status() {
        return blg_status;
    }

    public void setBlg_status(int blg_status) {
        this.blg_status = blg_status;
    }

    public int getBlg_review() {
        return blg_review;
    }

    public void setBlg_review(int blg_review) {
        this.blg_review = blg_review;
    }

    public Blog(int blg_id, String blg_title, String blg_bdy, Date blg_crtdate, Date blg_mdydate, byte[] blg_img, int blg_status, int blg_review) {
        this.blg_id = blg_id;
        this.blg_title = blg_title;
        this.blg_bdy = blg_bdy;
        this.blg_crtdate = blg_crtdate;
        this.blg_mdydate = blg_mdydate;
        this.blg_img = blg_img;
        this.blg_status = blg_status;
        this.blg_review = blg_review;
    }

    @Override
    public String toString() {
        return "Blog : " + this.blg_title + " is created in " + this.blg_crtdate;
    }

}
