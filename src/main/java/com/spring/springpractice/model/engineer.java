package com.spring.springpractice.model;

public class engineer {
    String name;
    int age;
    String branch;

    public engineer(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
