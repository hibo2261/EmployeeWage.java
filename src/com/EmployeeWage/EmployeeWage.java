package com.EmployeeWage;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Emplyoee Wage Computation Program");

        /* UC5 Problem
         * calculate wage for a month
         * (assume 20 waking day per month)
         */
        int isPresent = 1;
        int wagePerHour = 20;
        int noOfWorkingHours = 8;
        int partTimeHours = 4;
        int workingDaysInAMonth = 20;
        int checkAttendance = (int)Math.floor((Math.random()*10)%3);
        System.out.println(checkAttendance);

        /* Using Switch Case For Attendance
        and for calculation
         */

        switch(checkAttendance){
            case 0 :
                System.out.println("Emplyoee is absent. ");
                break;

            case 1:
                System.out.println("Emplyoee is present. ");
                System.out.println("Emplyoee Daily Wage is = " + wagePerHour * noOfWorkingHours);
                System.out.println("Emplyoee Monthly wage is = "  + wagePerHour * noOfWorkingHours * workingDaysInAMonth);
                break;
            case 2:
                System.out.println("Part Time");
                System.out.println("Emplyoee part Time wage is = " + noOfWorkingHours * wagePerHour);
                System.out.println("Emplyoee Monthly wage is = " + wagePerHour * partTimeHours * workingDaysInAMonth);
                break;

        }
    }

}