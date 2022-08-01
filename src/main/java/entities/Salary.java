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
        else
            throw new SalaryException("Illegal amount, salary amount has to be between 1000 to 50000.");
    }

    public int getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(int yearlyBonus) throws SalaryException {
        if (yearlyBonus >= 0 && yearlyBonus <= 10000)
            this.yearlyBonus = yearlyBonus;
        else
            throw new SalaryException("Illegal amount, yearly bonus amount has to be between 0 to 10000.");
    }
}
