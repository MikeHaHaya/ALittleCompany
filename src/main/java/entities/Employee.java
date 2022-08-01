package entities;

import exceptions.SalaryException;

public class Employee extends Person {

    Salary salary;

    public Employee() {
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) throws SalaryException {

        // Will operate if the class is an instance of Manager
        if (this instanceof Manager) {
            if (salary.getAmount() >= 25000) {
                this.salary = salary;
//            } else {
//                throw SalaryException
            }

            // Will operate if the class is a regular employee
        } else {
            this.salary = salary;
        }
    }
}
