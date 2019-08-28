package com.alive.activiti.domain;

public class HigherAudit {

    private String taskId;
    private boolean result;
    private String opinion;

    public HigherAudit() {
    }

    public HigherAudit(String taskId, boolean result, String opinion) {
        this.taskId = taskId;
        this.result = result;
        this.opinion = opinion;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
