package com.company.leavetracking.model;

public class CausalLeave extends Leaverequest {
    public CausalLeave(int requestId, int employeeId) {
        super(requestId, employeeId);
        this.leaveType = "Causal";
    }
}
