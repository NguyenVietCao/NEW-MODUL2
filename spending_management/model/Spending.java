package spending_management.model;

import java.util.ArrayList;
import java.util.List;

public class Spending {
    private String spendingCode;
    private String spendingName;
    private String spendingDate;
    private String amountSpent;
    private String moreDescription;

    public Spending() {
    }

    public Spending(String spendingCode, String spendingName, String spendingDate, String amountSpent, String moreDescription) {
        this.spendingCode = spendingCode;
        this.spendingName = spendingName;
        this.spendingDate = spendingDate;
        this.amountSpent = amountSpent;
        this.moreDescription = moreDescription;
    }

    public String getSpendingCode() {
        return spendingCode;
    }

    public void setSpendingCode(String spendingCode) {
        this.spendingCode = spendingCode;
    }

    public String getSpendingName() {
        return spendingName;
    }

    public void setSpendingName(String spendingName) {
        this.spendingName = spendingName;
    }

    public String getSpendingDate() {
        return spendingDate;
    }

    public void setSpendingDate(String spendingDate) {
        this.spendingDate = spendingDate;
    }

    public String getAmountSpent() {
        return amountSpent;
    }

    public void setAmountSpent(String amountSpent) {
        this.amountSpent = amountSpent;
    }

    public String getMoreDescription() {
        return moreDescription;
    }

    public void setMoreDescription(String moreDescription) {
        this.moreDescription = moreDescription;
    }

    @Override
    public String toString() {
        return "Spending{" +
                "spendingCode='" + spendingCode + '\'' +
                ", spendingName='" + spendingName + '\'' +
                ", spendingDate='" + spendingDate + '\'' +
                ", amountSpent='" + amountSpent + '\'' +
                ", moreDescription='" + moreDescription + '\'' +
                '}' + "\n";
    }
}


