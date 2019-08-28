package com.alive.activiti.domain;

public class LeaveApply {

    public LeaveApply() {
    }

    public LeaveApply(String taskId, String jobNumber, String leaveDays, String leaveReason) {
        this.taskId = taskId;
        this.jobNumber = jobNumber;
        this.leaveDays = leaveDays;
        this.leaveReason = leaveReason;
    }

    private String taskId;
    private String jobNumber;
    private String leaveDays;
    private String leaveReason;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(String leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }
}
