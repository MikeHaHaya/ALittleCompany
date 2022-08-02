package entities;

import exceptions.EmployeeException;
import exceptions.ManagerException;

public class Manager extends Employee {

    public Manager() {
    }

    // TODO -- Separate business logic from entity
    @Override
    public void setSalary(Salary salary) throws EmployeeException {
        if (salary.getAmount() >= 25000)
            super.setSalary(salary);
        else throw new ManagerException("Illegal amount, a manager's salary has to be above 25000.");

    }
}
