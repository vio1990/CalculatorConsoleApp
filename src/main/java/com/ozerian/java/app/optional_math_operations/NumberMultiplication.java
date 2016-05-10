package com.ozerian.java.app.optional_math_operations;

import com.ozerian.lib.calculator.interfaces.CalculatorOperation;
import com.ozerian.lib.calculator.util.OperationRegister;
import com.ozerian.lib.calculator.util.Parser;

/**
 * Class for multiplication number's data types.
 */
public final class NumberMultiplication implements CalculatorOperation {

    private Parser parser;
    private StringBuilder operationResult = new StringBuilder();

    /**
     * Creation new object with parser and operationRegister.
     *
     * @param parser DataParser for checking data type.
     */
    public NumberMultiplication(Parser parser) {
        this.parser = parser;
        addOperationToRegister("*");
    }

    /**
     * Checking data type and multiplication after definition.
     */

    public void multiply(String firstOperand, String secondOperand) {

        if ("int".equals(parser.getNumberType())) {
            int firstNumber = Integer.parseInt(firstOperand);
            int secondNumber = Integer.parseInt(secondOperand);
            multiplyInt(firstNumber, secondNumber);
        } else if ("long".equals(parser.getNumberType())) {
            long firstNumber = Long.parseLong(firstOperand);
            long secondNumber = Long.parseLong(secondOperand);
            multiplyLong(firstNumber, secondNumber);
        } else if ("double".equals(parser.getNumberType())) {
            double firstNumber = Double.parseDouble(firstOperand);
            double secondNumber = Double.parseDouble(secondOperand);
            multiplyDouble(firstNumber, secondNumber);
        } else if ("float".equals(parser.getNumberType())) {
            float firstNumber = Float.parseFloat(firstOperand);
            float secondNumber = Float.parseFloat(secondOperand);
            multiplyFloat(firstNumber, secondNumber);
        } else {
            throw new UnsupportedOperationException("Not supported data type!");
        }
    }

    /**
     * Multiplication operation for int data type.
     *
     * @param firstNumber  int first operand.
     * @param secondNumber int second operand.
     */
    public void multiplyInt(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        String textResult = firstNumber + "*" + secondNumber + "=" + result;
        operationResult = new StringBuilder();
        operationResult.append(textResult);
    }

    /**
     * Multiplication operation for long data type.
     *
     * @param firstNumber  long first operand.
     * @param secondNumber long second operand.
     */
    public void multiplyLong(long firstNumber, long secondNumber) {
        long result = firstNumber * secondNumber;
        String textResult = firstNumber + "*" + secondNumber + "=" + result;
        operationResult = new StringBuilder();
        operationResult.append(textResult);
    }

    /**
     * Multiplication operation for float data type.
     *
     * @param firstNumber  float first operand.
     * @param secondNumber float second operand.
     */
    public void multiplyFloat(float firstNumber, float secondNumber) {
        float result = firstNumber * secondNumber;
        String textResult = firstNumber + "*" + secondNumber + "=" + result;
        operationResult = new StringBuilder();
        operationResult.append(textResult);
    }

    /**
     * Multiplication operation for double data type.
     *
     * @param firstNumber  double first operand.
     * @param secondNumber double second operand.
     */
    public void multiplyDouble(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        String textResult = firstNumber + "*" + secondNumber + "=" + result;
        operationResult = new StringBuilder();
        operationResult.append(textResult);
    }

    /**
     * Override method for execution multiply operation.
     */
    @Override
    public void calculate(String firstNumber, String secondNumber) {
        this.multiply(firstNumber, secondNumber);
    }

    @Override
    public void addOperationToRegister(String operationSymbol) {
        OperationRegister.addOperation(operationSymbol, this);
    }

    /**
     * Method returns the result of the executed operation.
     *
     * @return String result of the operation.
     */
    @Override
    public String getOperationResult() {
        return operationResult.toString();
    }

}

