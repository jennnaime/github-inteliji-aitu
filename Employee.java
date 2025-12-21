package com.example.githubintelijiaitu;

public class Employee extends Human {
    private String department; // Unique String attribute
    private float salary;// Unique float attribute

    public Employee ( String name , int age , boolean isAlive , String department , float salary) {
        super(name,age ,isAlive);
        this.department = department;
        this.salary = salary;
        employeecount ++ ;

    }
    public String getDepartment(){
        return department;
    }
    public float getSalary (){
        return salary ;
    }
    public void setDepartment (String department) {
        this.department = department ;
    }
    public void setSalary (float salary){
        this.salary = salary ;
    }
    @Override
    public String getYour_role () {
        return "I am employee working in" + department + "and i get " + salary + "per month" ;
    }
    public static int employeecount = 0 ;

}