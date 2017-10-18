package com.smart.model;

/**
 * Created by gaowei on 2017/10/18.
 */
public class User {
    private int id;

    private String name;

    private int age;

    private String password;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return "User: name:" + name + "age:" + Integer.toString(age);
    }

}