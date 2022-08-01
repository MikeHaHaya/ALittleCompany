package entities;

import exceptions.SalaryException;

public class Salary {

    double amount;
    int yearlyBonus;

    public Salary() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) throws SalaryException {
        if (amount >= 1000 && amount <= 50000)
            this.amount = amount;
//        else
//            throw SalaryException();
    }

    public int getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(int yearlyBonus) {
        if (yearlyBonus >= 0 && yearlyBonus <= 10000)
            this.yearlyBonus = yearlyBonus;
    }
}
