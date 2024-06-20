package org.example.model;
import java.util.LinkedList;
import java.util.List;

public class Employees {
    public Employees() {
        this.employees = new LinkedList<Employee>();
    }

    List<Employee> employees;

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
