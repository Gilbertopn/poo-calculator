package com.mjv.curso.model;

public class User {

    private String firstName;

    private String secondName;

    private Integer age;

    private String profession;

    public User(){

    }

    public User(String firstName, String secondName, Integer age, String profession) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.profession = profession;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}
