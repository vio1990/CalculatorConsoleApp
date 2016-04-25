package com.ozerian.java.app;

import com.ozerian.lib.calculator.exceptions.IncorrectInputDataException;
import com.ozerian.lib.calculator.exceptions.NotSupportedException;
import com.ozerian.lib.calculator.exceptions.WrongInputDataException;
import com.ozerian.lib.calculator.model.Calculator;

public class Bootstrap {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            String result = calculator.calculatorExecute("15+13");
            System.out.println(result);
        } catch (WrongInputDataException e) {
            e.printStackTrace();
        } catch (IncorrectInputDataException e) {
            e.printStackTrace();
        } catch (NotSupportedException e) {
            e.printStackTrace();
        }
    }
}
