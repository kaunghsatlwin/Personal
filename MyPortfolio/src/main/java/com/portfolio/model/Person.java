/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Kaung Hsat Lwin
 */
@Entity
@Table(name = "Person", catalog = "public")
public class Person implements Serializable {

    private static final long serialVersionUID = 5L;

    @Id
    @Column(name = "pson_id", nullable = false, unique = true)
    private int pson_id;
    @Column(name = "pson_fname", nullable = false)
    private String pson_fname;
    @Column(name = "pson_lname", nullable = false)
    private String pson_lname;
    @Column(name = "pson_phone", nullable = true)
    private String pson_phone;
    @Column(name = "pson_dob", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date pson_dob;
    @Column(name = "pson_adres", nullable = false)
    private String pson_adres;
    @Column(name = "pson_mail", nullable = false)
    private String pson_mail;
    @Column(name = "pson_jndate", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date pson_jndate;
    @Column(name = "pson_img", nullable = false)
    private byte[] pson_img;
    @Column(name = "pson_status", nullable = false)
    private String pson_status;
    @Column(name = "pson_abt", nullable = false)
    private String pson_abt;
    @Column(name = "pson_pswd", nullable = false)
    private String pson_pswd;

    public int getPson_id() {
        return pson_id;
    }

    public void setPson_id(int pson_id) {
        this.pson_id = pson_id;
    }

    public String getPson_fname() {
        return pson_fname;
    }

    public void setPson_fname(String pson_fname) {
        this.pson_fname = pson_fname;
    }

    public String getPson_lname() {
        return pson_lname;
    }

    public void setPson_lname(String pson_lname) {
        this.pson_lname = pson_lname;
    }

    public String getPson_phone() {
        return pson_phone;
    }

    public void setPson_phone(String pson_phone) {
        this.pson_phone = pson_phone;
    }

    public Date getPson_dob() {
        return pson_dob;
    }

    public void setPson_dob(Date pson_dob) {
        this.pson_dob = pson_dob;
    }

    public String getPson_adres() {
        return pson_adres;
    }

    public void setPson_adres(String pson_adres) {
        this.pson_adres = pson_adres;
    }

    public String getPson_mail() {
        return pson_mail;
    }

    public void setPson_mail(String pson_mail) {
        this.pson_mail = pson_mail;
    }

    public Date getPson_jndate() {
        return pson_jndate;
    }

    public void setPson_jndate(Date pson_jndate) {
        this.pson_jndate = pson_jndate;
    }

    public byte[] getPson_img() {
        return pson_img;
    }

    public void setPson_img(byte[] pson_img) {
        this.pson_img = pson_img;
    }

    public String getPson_status() {
        return pson_status;
    }

    public void setPson_status(String pson_status) {
        this.pson_status = pson_status;
    }

    public String getPson_abt() {
        return pson_abt;
    }

    public void setPson_abt(String pson_abt) {
        this.pson_abt = pson_abt;
    }

    public String getPson_pswd() {
        return pson_pswd;
    }

    public void setPson_pswd(String pson_pswd) {
        this.pson_pswd = pson_pswd;
    }

    @Override
    public String toString() {
        return " ID : " + this.pson_id + ", Name : " + this.pson_fname;
    }
}
