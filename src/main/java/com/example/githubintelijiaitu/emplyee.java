package com.example.githubintelijiaitu;

public class Employee extends Human implements IWorker , ILearner {
    private String department;
    private float salary;
    public static int employeecount = 0 ;

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
    public String getYourRole () {
        return "I am employee working in" + department + "and i get " + salary + "per month" ;
    }
    // IWORKER interface methods
    @Override
    public void work() {
        System.out.println(name + "is working now") ;
    }
    @Override
    public void onBreak() {
        System.out.println(name + "is on break");
    }
    //ILEARNER INTERFACE METHODS
    @Override
    public void study(){
        System.out.println(name + "is studying");
    }
    @Override
    public void exam(){
        System.out.println(name + "is on the exam";
    }

}
