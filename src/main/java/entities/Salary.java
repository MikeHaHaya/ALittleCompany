package entities;

import exceptions.SalaryException;

public class Salary {

    private double amount;
    private int yearlyBonus;

    public Salary() {
    }

    public double getAmount() {
        return amount;
    }

    // TODO -- Separate business logic from entity
    public void setAmount(double amount) throws SalaryException {
        if (amount >= 1000 && amount <= 50000)
            this.amount = amount;
        else
            throw new SalaryException("Illegal amount, salary amount has to be between 1000 to 50000.");
    }

    public int getYearlyBonus() {
        return yearlyBonus;
    }

    // TODO -- Separate business logic from entity
    public void setYearlyBonus(int yearlyBonus) throws SalaryException {
        if (yearlyBonus >= 0 && yearlyBonus <= 10000)
            this.yearlyBonus = yearlyBonus;
        else
            throw new SalaryException("Illegal amount, yearly bonus amount has to be between 0 to 10000.");
    }
}
