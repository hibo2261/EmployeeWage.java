package com.EmployeeWage;

public class Main {

    public static void main(String[] args) {
        EmployeeWage emp = new EmployeeWage();
        Welcome();
        emp.toCalculateMonthlyWages();



    }
    public static void Welcome() {
        System.out.println("***********************************************************");
        System.out.println("Welcome to Emplyoee Wage Computation Problem");
        System.out.println("***********************************************************");
    }

}