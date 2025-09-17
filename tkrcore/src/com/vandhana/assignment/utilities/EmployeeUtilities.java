package com.vandhana.assignment.utilities;

import com.vandhana.assignment.employees.Employee;

public class EmployeeUtilities {

    public void printEmployeeDetails(Employee emp) {
        emp.displayInfo();
        System.out.println("-------------------------");
    }
    
    public void giveRaise(Employee emp, double amount) {
        double newSalary = emp.getSalary() + amount;
        emp.setSalary(newSalary);
        System.out.println(emp.getName() + " got a raise! New Salary: " + newSalary);
    }
}
