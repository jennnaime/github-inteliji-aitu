package com.example.githubintelijiaitu;

public class Human {
    private String name; // 3 basic atributes
    private int age;
    private boolean isAlive;

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
    public void setIsAlive (boolean isAlive) {
        this.isAlive = isAlive;
    }

    public String getYour_role(){
        return "This is human " ;
    }
    public String introduce(){
        return "My name is" + name + "and i am " + age + "years old ";
    }
}

