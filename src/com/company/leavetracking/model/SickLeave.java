package com.company.leavetracking.model;

public class SickLeave extends Leaverequest {
    public SickLeave(int requestId, int employeeId) {
       
        super(requestId, employeeId);
        this.leaveType = "sick";
    }
}
