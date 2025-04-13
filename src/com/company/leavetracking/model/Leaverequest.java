package com.company.leavetracking.model;

import java.io.Serializable;


public class Leaverequest implements Serializable {
    protected int requestId;
    protected int employeeId;
    protected String leaveType;
    protected String status;

    public Leaverequest(int requestId, int employeeId) {
        this.requestId = requestId;
        this.employeeId = employeeId;
        this.status = "Pending";
    }
    public int getRequestId() { return requestId; }
    public int getEmployeeId() { return employeeId; }
    public String getLeaveType() { return leaveType; }
    public String getStatus() { return status; } 

    public void displayRequest() {
        System.out.println("Request ID: " + requestId);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Leave Type: " + leaveType);
        System.out.println("Status: " + status);
    }
}





