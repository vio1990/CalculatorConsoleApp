package com.ozerian.java.app;


import com.ozerian.java.app.optional_math_operations.NumberDivision;
import com.ozerian.java.app.optional_math_operations.NumberMultiplication;
import com.ozerian.java.app.util.InputDataReader;
import com.ozerian.java.app.util.InputDataReaderFactory;
import com.ozerian.lib.calculator.model.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Bootstrap {

    private Calculator calculator;
    private InputDataReaderFactory readerFactory;
    private NumberDivision division;
    private NumberMultiplication multiplication;

    public void execute() throws IOException {
        InputDataReader reader = readerFactory.getInputDataReader();
        String expression = reader.inputReader();
        String result = calculator.calculatorExecute(expression);
        System.out.println(result);
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void setReaderFactory(InputDataReaderFactory readerFactory) {
        this.readerFactory = readerFactory;
    }

    public void setDivision(NumberDivision division) {
        this.division = division;
    }

    public void setMultiplication(NumberMultiplication multiplication) {
        this.multiplication = multiplication;
    }

    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml", "aop-context.xml");
        Bootstrap bootstrap = applicationContext.getBean("bootstrap", Bootstrap.class);
        bootstrap.execute();
    }
}
