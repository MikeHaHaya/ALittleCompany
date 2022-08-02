package entities;

import exceptions.EmployeeException;

public class Employee extends Person {

    private Salary salary;

    public Employee() {
    }

    public Salary getSalary() {
        return salary;
    }

    // TODO -- Separate business logic from entity
    public void setSalary(Salary salary) throws EmployeeException {
        this.salary = salary;
    }
}
