package com.vandhana.assignment.employees;

public class Manager extends Employee {
    private String dept;

    public Manager(String n, int id, double sal, String d) {
        super(n, id, sal);
        dept = d;
    }

    public String getDepartment() {
        return dept;
    }

    public void setDepartment(String d) {
        dept = d;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + dept);
    }
}
