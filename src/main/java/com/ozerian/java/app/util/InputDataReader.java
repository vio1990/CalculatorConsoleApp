package com.ozerian.java.app.util;

import com.sun.xml.internal.ws.util.NoCloseInputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDataReader {

    public String inputReader() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new NoCloseInputStream(System.in)))) {
            String inputExpression = reader.readLine().trim();
            return inputExpression;
        }
    }
}
