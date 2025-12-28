package com.example.githubintelijiaitu;

public final class Student extends Human implements ILearner {
    private String major;
    private float gpa;
    public static int studentcount = 0;
    private final String UniversityName = "Astana IT University";

    public Student(String name, int age, boolean isAlive, String major, float gpa) {
        super(name, age, isAlive);
        this.gpa = gpa;
        this.major = major;
        studentcount++;
    }

    public String getMajor() {
        return major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getYourRole() {
        return "I am student and my major is " + major + " and my GPA is " + gpa;
    }

    public final void StudentCard() {
        System.out.println("Student ID card:");
        System.out.println("Name: " + name);
        System.out.println("University: " + UniversityName);
    }

    // ILearner methods
    @Override
    public void study() {
        System.out.println(name + " is studying");
    }

    @Override
    public void takeExam() { // ← ИМЕННО takeExam, а не exam!
        System.out.println(name + " is on the exam");
    }
}
