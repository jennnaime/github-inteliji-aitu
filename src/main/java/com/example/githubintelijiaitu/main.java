package com.example.githubintelijiaitu;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        Student student1 = new Student("Aisha", 17, true, "Media Technologies", 4.0f);
        Human student2 = new Student("Ayana", 18, true, "Computer Science", 4.0f);
        ILearner student3 = new Student("Merey", 17, true, "Media", 4.0f);

        Employee employee1 = new Employee("Aisha", 25, true, "Graphical Designer", 500000f);
        Human employee2 = new Employee("Anel", 36, true, "3d modelier", 600000f);
        IWorker employee3 = new Employee("Ayana", 40, true, "content maker", 700000f);
        ILearner employee4 = new Employee("Merey", 28, true, "Analyst", 450000f);



        System.out.println("Student as Student: " + student1.getYourRole());
        System.out.println("Student as Human: " + student2.getYourRole());
        System.out.print("Student as ILearner: ");
        student3.study();

        System.out.println("\nEmployee as Employee: " + employee1.getYourRole());
        System.out.println("Employee as Human: " + employee2.getYourRole());
        System.out.print("Employee as IWorker: ");
        employee3.work();
        System.out.print("Employee as ILearner: ");
        employee4.study();

        System.out.println("\n=== User Input ===");
        System.out.println("What is your name?");
        String NameOfEmployees = sc.nextLine();

        System.out.println("How old are you?");
        int AgeOfEmployees = sc.nextInt();
        sc.nextLine();

        System.out.println("Are you alive? (true/false)");
        boolean Live = sc.nextBoolean();
        sc.nextLine();

        System.out.println("Where do you work?");
        String Company = sc.nextLine();

        System.out.println("How much do you earn?");
        float Money = sc.nextFloat();
        sc.nextLine();

        System.out.println("Where do you study?");
        String University = sc.nextLine();

        System.out.println("What is your gpa?");
        float gpaResult = sc.nextFloat();


        Student userStudent = new Student(NameOfEmployees, AgeOfEmployees, Live, University, gpaResult);
        Employee userEmployee = new Employee(NameOfEmployees, AgeOfEmployees, Live, Company, Money);

        System.out.println("\n=== Created from your input ===");
        System.out.println("Student: " + userStudent.getYourRole());
        userStudent.StudentCard();
        System.out.println("Employee: " + userEmployee.getYourRole());
        userEmployee.work();

        sc.close();
    }
}
