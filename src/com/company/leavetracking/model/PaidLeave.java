package com.company.leavetracking.model;

public class PaidLeave extends Leaverequest {
    public PaidLeave(int requestId, int employeeId) {
        super(requestId, employeeId);
        this.leaveType = "Paid";
    }
}
