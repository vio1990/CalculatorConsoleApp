package com.ozerian.java.app;


import com.ozerian.java.app.optional_math_operations.NumberDivision;
import com.ozerian.java.app.util.InputDataReader;
import com.ozerian.lib.calculator.exceptions.IncorrectInputDataException;
import com.ozerian.lib.calculator.exceptions.NotSupportedException;
import com.ozerian.lib.calculator.exceptions.WrongInputDataException;
import com.ozerian.lib.calculator.model.Calculator;

public class Bootstrap {
    public static void main(String[] args) throws IncorrectInputDataException, NotSupportedException, WrongInputDataException {
        Calculator calculator = new Calculator();
        InputDataReader reader = new InputDataReader();
        String expression = reader.inputReader();
        String result = calculator.calculatorExecute(expression);
        System.out.println(result);
    }
}
