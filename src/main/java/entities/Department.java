package entities;

import java.util.ArrayList;

public class Department {

    enum Division {
        SALES, FINANCE, ADMINISTRATION, ENGINEERING, MARKETING
    }

    private Division division;
    private Manager manager;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Department() {
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    // TODO -- Separate business logic from entity
    public void setEmployees(ArrayList<Employee> employees) {
        if (employees.size() < 15)
            this.employees = employees;
    }

    // TODO -- Separate business logic from entity
    public void addEmployee(Employee employee) {
        if (this.employees.size() < 15)
            this.employees.add(employee);
    }

}
