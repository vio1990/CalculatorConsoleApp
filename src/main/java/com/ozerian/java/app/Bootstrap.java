package com.ozerian.java.app;


import com.ozerian.java.app.optional_math_operations.NumberDivision;
import com.ozerian.java.app.optional_math_operations.NumberMultiplication;
import com.ozerian.java.app.util.InputDataReader;
import com.ozerian.lib.calculator.exceptions.IncorrectInputDataException;
import com.ozerian.lib.calculator.exceptions.NotSupportedException;
import com.ozerian.lib.calculator.exceptions.WrongInputDataException;
import com.ozerian.lib.calculator.model.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Bootstrap {

    private Calculator calculator;
    private InputDataReader reader;
    private NumberDivision division;
    private NumberMultiplication multiplication;

    public void execute() throws IOException {
        try {
            String expression = reader.inputReader();
            String result = calculator.calculatorExecute(expression);
            System.out.println(result);
        } catch (WrongInputDataException e) {
            e.printStackTrace();
        } catch (IncorrectInputDataException e) {
            e.printStackTrace();
        } catch (NotSupportedException e) {
            e.printStackTrace();
        }
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void setReader(InputDataReader reader) {
        this.reader = reader;
    }

    public void setDivision(NumberDivision division) {
        this.division = division;
    }

    public void setMultiplication(NumberMultiplication multiplication) {
        this.multiplication = multiplication;
    }

    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Bootstrap bootstrap = applicationContext.getBean("bootstrap", Bootstrap.class);
        bootstrap.execute();
        bootstrap.execute();
        bootstrap.execute();

    }
}
