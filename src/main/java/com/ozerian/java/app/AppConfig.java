package com.ozerian.java.app;

import com.ozerian.java.app.optional_math_operations.NumberDivision;
import com.ozerian.java.app.optional_math_operations.NumberMultiplication;
import com.ozerian.java.app.util.InputDataReader;
import com.ozerian.java.app.util.InputDataReaderFactory;
import com.ozerian.lib.calculator.model.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * This class was created for possibility to configure spring container with Java-based configuration type.
 */
@Configuration
public class AppConfig {

    @Bean
    public Bootstrap bootstrap(Calculator calculator, InputDataReader reader) {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.setCalculator(calculator);
      /*  bootstrap.setReader(reader);*/
        return bootstrap;
    }

    @Bean
    public Calculator calculator() {
        return new Calculator();
    }

    @Bean
    @Scope("prototype")
    public InputDataReader reader() {
        return new InputDataReader();
    }

    @Bean
    public InputDataReaderFactory inputDataReaderFactory() {
        return new InputDataReaderFactory() {
            @Override
            public InputDataReader getInputDataReader() {
                return reader();
            }
        };
    }

    @Bean
    public NumberDivision divide() {
        return new NumberDivision(calculator().getParser());
    }

    @Bean
    public NumberMultiplication multiply() {
        return new NumberMultiplication(calculator().getParser());
    }
}
