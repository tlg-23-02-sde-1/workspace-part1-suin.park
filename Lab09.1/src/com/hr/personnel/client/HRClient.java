/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24),2250.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2),150,40));
        dept.addEmployee((new SalariedEmployee("Brandon",LocalDate.of(2023,2,20),
                3500)));
        dept.addEmployee(new HourlyEmployee("John",LocalDate.of(2023,2,20),160,
                40));
        dept.addEmployee(new Executive("Suin", LocalDate.of(2021,2,20),75_000.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay its Employees
        System.out.println("\nPay all Employees");
        dept.payEmployees();

        // holiday break
        System.out.println("\nHoliday break:");
        dept.holidayBreak();

    }
}