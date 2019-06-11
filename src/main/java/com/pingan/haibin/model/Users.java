package com.pingan.haibin.model;

import java.io.Serializable;

public class Users implements Serializable{
	

	private static final long serialVersionUID = -2545901512285334227L;
	

	private Integer id;

    private String passwd;

    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}