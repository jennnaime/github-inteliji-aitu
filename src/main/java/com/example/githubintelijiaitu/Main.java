package com.example.githubintelijiaitu;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        Human result1 = new Human( "Aisha" , 17 , true);
        System.out.println(result1.introduce());
        System.out.println(result1.getYour_role());


        System.out.println("What is your name?");
        String NameOfEmployees = sc.nextLine();
        System.out.println("How old are you?");
        int AgeOfEmployees = sc.nextInt();
        System.out.println("Are you alive?");
        boolean Live = sc.nextBoolean();


        Employee result2 = new Employee("Aisha" , 17 , true , "Aitu" , 800000) ;
        System.out.println(result2.introduce());
        System.out.println(result2.getYour_role());

        System.out.println("Where do you work?");
        String Company = sc.nextLine();
        System.out.println("How much do you earn?");
        float Money = sc.nextFloat();

        Student result3 = new Student("Aisha" , 17, true, "Media Technologies" , 2.62f) ;
        System.out.println(result3.introduce());
        System.out.println(result3.getYour_role());
        System.out.println("Where do you study?");
        String University = sc.nextLine();
        System.out.println("What isyour gpa?");
        float gparesult = sc.nextFloat();



    }
}
