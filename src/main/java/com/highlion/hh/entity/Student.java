package com.highlion.hh.entity;

import lombok.Data;

@Data
public class Student {
	
  private int id;
	
  private String name;
  
  private String pwd;

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
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
  
  
}
