package com.ozerian.java.app;


import com.ozerian.java.app.optional_math_operations.NumberDivision;
import com.ozerian.java.app.optional_math_operations.NumberMultiplication;
import com.ozerian.lib.calculator.exceptions.IncorrectInputDataException;
import com.ozerian.lib.calculator.exceptions.NotSupportedException;
import com.ozerian.lib.calculator.exceptions.WrongInputDataException;
import com.ozerian.lib.calculator.model.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
    public static void main(String[] args)  {
       /* ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");*/
        Calculator calculator = new Calculator();
        new NumberDivision(calculator.getParser(), calculator.getSupportedOperation());
        new NumberMultiplication(calculator.getParser(),calculator.getSupportedOperation());
        try {
            calculator.calculatorExecute("5*3");
        } catch (WrongInputDataException e) {
            e.printStackTrace();
        } catch (IncorrectInputDataException e) {
            e.printStackTrace();
        } catch (NotSupportedException e) {
            e.printStackTrace();
        }

    }
}
