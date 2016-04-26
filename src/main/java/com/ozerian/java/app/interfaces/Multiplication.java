package com.ozerian.java.app.interfaces;

import com.ozerian.lib.calculator.exceptions.IncorrectInputDataException;
import com.ozerian.lib.calculator.interfaces.CalculatorOperation;

/**
 * Interface for multiplication different number types.
 * User can add another type of data.
 */
public interface Multiplication extends CalculatorOperation {

    /**
     * This method adds two numbers.
     *
     * @throws IncorrectInputDataException Throws when there are problems with input data after some methods
     *                                     and operations.
     */
    public void multiply() throws IncorrectInputDataException;
}
