package com.vandhana.assignment.employees;

public class Developer extends Employee {
    private String progLang;

    public Developer(String n, int id, double sal, String lang) {
        super(n, id, sal);
        progLang = lang;
    }

    public String getProgrammingLanguage() {
        return progLang;
    }

    public void setProgrammingLanguage(String lang) {
        progLang = lang;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + progLang);
    }
}
