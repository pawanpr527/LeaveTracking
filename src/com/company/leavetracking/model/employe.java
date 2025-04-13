package com.company.leavetracking.model;
public class employe {
    protected int employeeId;
    protected String employeeName;

    public employe(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}
