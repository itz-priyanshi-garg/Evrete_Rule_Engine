package com.EvreteTransaction.EvreteTransaction;

import org.springframework.stereotype.Component;

@Component
public class Commission {

    private int commissionAmount;
    private int commissionPercentage;
    private String responseMessage;

    public int getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(int commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public int getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(int commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    @Override
    public String toString() {
        return "Commission{" +
                "commissionAmount=" + commissionAmount +
                ", commissionPercentage=" + commissionPercentage +
                ", responseMessage='" + responseMessage + '\'' +
                '}';
    }
}
