package com.example.githubintelijiaitu;
public class Student extends Human {
    private String major; // Unique String attribute
    private float gpa;    // Unique float attribute

    public Student ( String name , int age , boolean isAlive ,String major ,float gpa  ){
        super (name , age, isAlive );
        this.gpa = gpa;
        this.major = major ;
        studentcount++ ;

    }
    public String getMajor(){
        return major;
    }
    public float getGpa (){
        return gpa ;
    }
    public void setMajor (String major) {
        this.major = major ;
    }
    public void setGpa (float gpa){
        this.gpa = gpa ;
    }
    @Override
    public String getYour_role () {
        return "I am student and my major is" + major + "and my GPA is " + gpa ;
    }
    public static int studentcount = 0 ;

}
