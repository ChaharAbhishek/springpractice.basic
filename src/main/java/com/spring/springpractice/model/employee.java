package com.spring.springpractice.model;


public class employee {

    String name;
    int age;
    String dept;


    //in this first we create constructor then getter & setter .
    //parameterised constructor (at the time of object creation we assign a value).
    public employee(String name, int age, String dept)
    {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }


    //getter is used for getting the details
    //setter is used for change the details

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
