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
@Table(name = "Comment", catalog = "public")
public class Comment implements Serializable {

    private static final long serialVersionUID = 5L;

    @Id
    @Column(name = "cmt_id", unique = true, nullable = false)
    private int cmt_id;
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Person> person = new ArrayList<>();

    @Column(name = "cmt_bdy", nullable = false)
    private String cmt_bdy;
    @Column(name = "cmt_crtdate", nullable = false)
    private Date cmt_crtdate;
    @Column(name = "cmt_mdydate", nullable = true)
    private Date cmt_mdydate;
    @Column(name = "cmt_status", nullable = false)
    private int cmt_status;

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public String getCmt_bdy() {
        return cmt_bdy;
    }

    public void setCmt_bdy(String cmt_bdy) {
        this.cmt_bdy = cmt_bdy;
    }

    public Date getCmt_crtdate() {
        return cmt_crtdate;
    }

    public void setCmt_crtdate(Date cmt_crtdate) {
        this.cmt_crtdate = cmt_crtdate;
    }

    public Date getCmt_mdydate() {
        return cmt_mdydate;
    }

    public void setCmt_mdydate(Date cmt_mdydate) {
        this.cmt_mdydate = cmt_mdydate;
    }

    public int getCmt_status() {
        return cmt_status;
    }

    public void setCmt_status(int cmt_status) {
        this.cmt_status = cmt_status;
    }

    public int getCmt_id() {
        return cmt_id;
    }

    public void setCmt_id(int cmt_id) {
        this.cmt_id = cmt_id;
    }

    @Override
    public String toString() {
        return "Comment : " + this.cmt_id + " is created in " + this.cmt_crtdate;
    }

}
