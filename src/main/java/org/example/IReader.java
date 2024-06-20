package org.example;

import org.example.model.Employees;

import java.io.IOException;

public interface IReader {
    Employees read(String fileName) throws IOException;
}
