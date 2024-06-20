package org.example;

import org.example.io.JSONReader;
import org.example.model.Employee;
import org.example.model.EmployeePrinter;
import org.example.model.Employees;

import java.io.IOException;

public class Main {
    public static final String DATA_JSON = "data.json";

    public static void main(String[] args) {
        Employees employees = null;
        IReader reader = new JSONReader();
        try {
            employees = reader.read(DATA_JSON);
        } catch (IOException e) {
            System.out.println("Could not read the file: "+DATA_JSON);
        }

        if (employees != null){
            EmployeePrinter printer = new EmployeePrinter();
            for(Employee employee: employees.getEmployees()) {
                printer.print(employee);
            }
        }
    }
}