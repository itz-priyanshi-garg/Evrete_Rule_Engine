package com.EvreteTransaction.EvreteTransaction;

import org.springframework.stereotype.Component;

@Component
public class Transaction {

    private int transactionAmount;
    private int transactionCount;

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionAmount=" + transactionAmount +
                ", transactionCount=" + transactionCount +
                '}';
    }
}
