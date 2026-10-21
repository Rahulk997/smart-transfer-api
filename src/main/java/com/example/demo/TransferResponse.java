package com.example.demo;

public class TransferResponse {

    private boolean approved;
    private TransferDecision decision;
    private String message;

    public TransferResponse(
            boolean approved,
            TransferDecision decision,
            String message) {
        this.approved = approved;
        this.decision = decision;
        this.message = message;
    }

    public boolean isApproved() {
        return approved;
    }

    public TransferDecision getDecision() {
        return decision;
    }

    public String getMessage() {
        return message;
    }
}