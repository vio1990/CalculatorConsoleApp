package com.ozerian.java.app.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDataReader {

    public String inputReader() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String inputExpression = reader.readLine().trim();
            return inputExpression;
        }
    }
}
