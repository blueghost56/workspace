package com.wayx.system.modle;

import java.io.Serializable;

public class People implements Serializable{
 private String name;
 private String age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
@Override
public String toString() {
	return "People [name=" + name + ", age=" + age + "]";
}
 
}
