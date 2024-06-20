package org.example.io;

import com.google.gson.reflect.TypeToken;
import org.example.IReader;
import org.example.model.Employee;
import org.example.model.Employees;

import com.google.gson.Gson;


import java.io.IOException;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class JSONReader implements IReader {

    @Override
    public Employees read(String fileName) throws IOException {
        Gson gson = new Gson();

        Type type = new TypeToken<Map<String, List<Map<String, String>>>>(){}.getType();

        Map<String, List<Map<String, String>>> parsed = gson.fromJson(
                "{\"employees\":[\n" +
                        "  { \"firstName\":\"John\", \"lastName\":\"Doe\" },\n" +
                        "  { \"firstName\":\"Anna\", \"lastName\":\"Smith\" },\n" +
                        "  { \"firstName\":\"Peter\", \"lastName\":\"Jones\" }\n" +
                        "]}",
                type
        );

        List<Employee> employeeList = new LinkedList<Employee>();

        for(Map<String, String> e: parsed.get("employees")) {
            Employee employee1 = new Employee();
            employee1.setFirstName(e.get("firstName"));
            employee1.setLastName(e.get("lastName"));

            employeeList.add(employee1);
        }

        Employees employees = new Employees();
        employees.setEmployees(employeeList);

        return employees;
    }
}
