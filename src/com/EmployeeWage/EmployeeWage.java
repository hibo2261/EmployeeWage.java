package com.EmployeeWage;

public class EmployeeWage {
    public static void main(String args [])
    {
        System.out.println("Welcome to Employee Wage Problem");
        int Present=1;

        int empCheck=(int)Math.floor(Math.random()*10)%2;
        System.out.println("Random value "+empCheck);

        if(empCheck==Present)
        {
            System.out.println("Employpee is Presnt");
        }
        else
        {
            System.out.println("Employee is Absent");
        }

    }
}
