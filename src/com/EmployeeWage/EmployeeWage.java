package com.EmployeeWage;

public class EmployeeWage {
    public static void main(String args [])
    {

        System.out.println("Welcome to Emplyoee Wage Computation Program");


        int isPresent = 1;
        int wagePerHour = 20;
        int noOfWorkingHours = 8;
        int partTimeHours = 4;
        int checkAttendance =(int)Math.floor((Math.random()*10)%3);
        System.out.println(checkAttendance);
        if(checkAttendance == 1) {
            System.out.println("Emplyoee is present");
            System.out.println("Emplyoee Daily wage is" + wagePerHour * noOfWorkingHours);
        }
        else if(checkAttendance == 0) {
            System.out.println("Emplyoee is absent");
        }
        else {
            System.out.println("Part Time");
            System.out.println("Emplyoee Part Time wage is" + wagePerHour * partTimeHours);
        }

    }
}