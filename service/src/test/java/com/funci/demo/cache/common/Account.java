package com.funci.demo.cache.common;

import java.io.Serializable;

public class Account implements Serializable{

    private static final long serialVersionUID = -2556125128652942150L;
    
    private int id;
    private String name;
    private String password;
    
    public Account(){}

    public Account(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String toString(){
	StringBuilder sb=new StringBuilder("{");
	sb.append("id:"+this.id).append(",");
	sb.append("name:"+this.name).append(",");
	sb.append("password:"+this.password).append("}");
	return sb.toString();
    }

}
