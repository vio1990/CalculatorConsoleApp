package com.ozerian.java.app.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDataReader {

    public String inputReader() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String inputExpression = reader.readLine().trim();
            return inputExpression;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Incorrect input data!");
            return inputReader();
        }
    }
}
