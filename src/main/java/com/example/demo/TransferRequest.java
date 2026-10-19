package com.example.demo;

public class TransferRequest {

    private String sourceAccountId;
    private String destinationAccountId;
    private double amount;
    private String currency;
    private double availableBalance;
    public String getSourceAccountId() {
        return sourceAccountId;
    }
    public void setSourceAccountId(String sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }
    public String getDestinationAccountId() {
        return destinationAccountId;
    }
    public void setDestinationAccountId(String destinationAccountId) {
        this.destinationAccountId = destinationAccountId;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public double getAvailableBalance() {
        return availableBalance;
    }
    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }
    
}