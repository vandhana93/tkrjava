package com.vandhana.assignment.employees;

public class Employee {
    private String empName;
    private int empId;
    private double empSalary;

    public Employee(String n, int id, double sal) {
        empName = n;
        empId = id;
        empSalary = sal;
    }

    public String getName() {
        return empName;
    }

    public void setName(String n) {
        empName = n;
    }

    public int getEmployeeId() {
        return empId;
    }

    public void setEmployeeId(int id) {
        empId = id;
    }

    public double getSalary() {
        return empSalary;
    }

    public void setSalary(double sal) {
        empSalary = sal;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + empId +
                           ", Name: " + empName +
                           ", Salary: " + empSalary);
    }
}
