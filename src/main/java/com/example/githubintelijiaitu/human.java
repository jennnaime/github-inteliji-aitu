package com.example.githubintelijiaitu;

public abstract class Human {
    protected String name;
    protected int age;
    protected boolean isAlive;

    public Human(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public abstract String getYourRole();

    public String introduce() {
        return "My name is " + name + " and I am " + age + " years old";
    }
}
