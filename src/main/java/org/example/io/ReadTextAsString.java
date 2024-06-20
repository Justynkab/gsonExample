package org.example.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadTextAsString {
    public static String readFileAsString(String fileName) throws Exception{
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            System.out.println("File: "+fileName+" did not open correctly");
            data = null;
        }
        return data;
    }
}
