package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;

public class EmployeeClient {

    public static void main(String[] args) {
        Employee emp = new Employee("Brandon");

        try{
            emp.goToWork();
        }
        catch (WorkException e) {
            e.printStackTrace();

//            System.out.println(e.getMessage());
//            System.out.println(e.getCause());               // extracts the nested exceptions inside
//            System.out.println(e.getCause().getMessage());  // just the reason string (message)
        }
    }
}