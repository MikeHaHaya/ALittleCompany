package entities;

import exceptions.EmployeeException;

public class Employee extends Person {

    Salary salary;

    public Employee() {
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) throws EmployeeException {
        this.salary = salary;
    }
}
