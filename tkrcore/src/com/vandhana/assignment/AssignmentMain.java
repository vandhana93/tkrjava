package com.vandhana.assignment;
import com.vandhana.assignment.employees.Manager;
import com.vandhana.assignment.employees.Developer;
import com.vandhana.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager mgr = new Manager("Vandhana", 101, 75000, "IT");
        Developer dev = new Developer("Gnatha", 102, 60000, "Java");

        EmployeeUtilities util = new EmployeeUtilities();

        util.printEmployeeDetails(mgr);
        util.printEmployeeDetails(dev);

        util.giveRaise(mgr, 5000);
        util.giveRaise(dev, 3000);

        util.printEmployeeDetails(mgr);
        util.printEmployeeDetails(dev);
    }
}
