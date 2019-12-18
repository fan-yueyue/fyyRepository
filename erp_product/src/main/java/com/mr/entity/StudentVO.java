package com.mr.entity;

import lombok.Data;

import java.util.List;

public class StudentVO {
    private Integer age;
    private String name;
    private String describe;
    private List<StudentVO> listStu;


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public List<StudentVO> getListStu() {
        return listStu;
    }

    public void setListStu(List<StudentVO> listStu) {
        this.listStu = listStu;
    }

    public StudentVO(Integer age, String name, String describe) {
        this.age = age;
        this.name = name;
        this.describe = describe;
    }

    public StudentVO() {
    }
}
