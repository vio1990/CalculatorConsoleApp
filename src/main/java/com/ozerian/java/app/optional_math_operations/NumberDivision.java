package com.ozerian.java.app.optional_math_operations;

import com.ozerian.lib.calculator.interfaces.CalculatorOperation;
import com.ozerian.lib.calculator.util.OperationRegister;
import com.ozerian.lib.calculator.util.Parser;

/**
 * Class for division number's data types.
 */
public final class NumberDivision implements CalculatorOperation {

    private Parser parser;
    private StringBuilder operationResult = new StringBuilder();

    /**
     * Creation new object with parser and operationRegister.
     *
     * @param parser DataParser for checking data type.
     */
    public NumberDivision(Parser parser) {
        this.parser = parser;
        addOperationToRegister("/");
    }

    /**
     * Checking data type and division after definition.
     */

    public void divide(String firstOperand, String secondOperand) {

        if ("int".equals(parser.getNumberType())) {
            int firstNumber = Integer.parseInt(firstOperand);
            int secondNumber = Integer.parseInt(secondOperand);
            divideInt(firstNumber, secondNumber);
        } else if ("long".equals(parser.getNumberType())) {
            long firstNumber = Long.parseLong(firstOperand);
            long secondNumber = Long.parseLong(secondOperand);
            divideLong(firstNumber, secondNumber);
        } else if ("double".equals(parser.getNumberType())) {
            double firstNumber = Double.parseDouble(firstOperand);
            double secondNumber = Double.parseDouble(secondOperand);
            divideDouble(firstNumber, secondNumber);
        } else if ("float".equals(parser.getNumberType())) {
            float firstNumber = Float.parseFloat(firstOperand);
            float secondNumber = Float.parseFloat(secondOperand);
            divideFloat(firstNumber, secondNumber);
        } else {
            throw new UnsupportedOperationException("Not supported data type!");
        }
    }

    /**
     * Division operation for int data type.
     *
     * @param firstNumber  int first operand.
     * @param secondNumber int second operand.
     */
    public void divideInt(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        String textResult = firstNumber + "/" + secondNumber + "=" + result;
        operationResult = new StringBuilder();
        operationResult.append(textResult);
    }

    /**
     * Division operation for long data type.
     *
     * @param firstNumber  long first operand.
     * @param secondNumber long second operand.
     */
    public void divideLong(long firstNumber, long secondNumber) {
        long result = firstNumber / secondNumber;
        String textResult = firstNumber + "/" + secondNumber + "=" + result;
        operationResult = new StringBuilder();
        operationResult.append(textResult);
    }

    /**
     * Division operation for float data type.
     *
     * @param firstNumber  float first operand.
     * @param secondNumber float second operand.
     */
    public void divideFloat(float firstNumber, float secondNumber) {
        float result = firstNumber / secondNumber;
        String textResult = firstNumber + "/" + secondNumber + "=" + result;
        operationResult = new StringBuilder();
        operationResult.append(textResult);
    }

    /**
     * Division operation for double data type.
     *
     * @param firstNumber  double first operand.
     * @param secondNumber double second operand.
     */
    public void divideDouble(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        String textResult = firstNumber + "/" + secondNumber + "=" + result;
        operationResult = new StringBuilder();
        operationResult.append(textResult);
    }

    /**
     * Override method for execution divide operation.
     */
    @Override
    public void calculate(String firstNumber, String secondNumber) {
        this.divide(firstNumber, secondNumber);
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
