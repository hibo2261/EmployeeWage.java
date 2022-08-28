package com.EmployeeWage;

public class EmployeeWage {
    public static void main(String args [])
    {

        System.out.println("Welcome to Employee Wage Computation Program ");


        int Emp_Hrs=0;
        int Emp_Rate_Per_Hrs=20;
        int Per_Day_Salary=0;
        int Full_Time=1;

        int Result=(int)Math.floor(Math.random()*10)%2;
        System.out.println("Result is :-"+Result);

        if(Result == Full_Time)
        {
            Emp_Hrs=8;
        }
        else
        {
            Per_Day_Salary=0;
        }
        Per_Day_Salary = (Emp_Hrs*Emp_Rate_Per_Hrs);
        System.out.println("Employee per Day Salary is :-"+Per_Day_Salary);



    }
}