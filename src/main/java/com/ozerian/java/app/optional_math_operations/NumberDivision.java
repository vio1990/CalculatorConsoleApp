package com.ozerian.java.app.optional_math_operations;

import com.ozerian.java.app.interfaces.Division;
import com.ozerian.lib.calculator.exceptions.IncorrectInputDataException;
import com.ozerian.lib.calculator.util.DataParser;
import com.ozerian.lib.calculator.util.OperationFactory;

/**
 * Class for division number's data types.
 */
public final class NumberDivision implements Division {

    public static final int INDEX_OF_FIRST_NUMBER = 0;
    public static final int INDEX_OF_SECOND_NUMBER = 1;
    private DataParser parser;
    private OperationFactory operationFactory;
    private StringBuilder operationResult = new StringBuilder();

    /**
     * Creation new object with parser and operationFactory.
     *
     * @param parser           DataParser for checking data type.
     * @param operationFactory OperationFactory for checking supported operations.
     */
    public NumberDivision(DataParser parser, OperationFactory operationFactory) {
        this.parser = parser;
        this.operationFactory = operationFactory;
        operationFactory.addOperation("/", this);
    }

    /**
     * Checking data type and division after definition.
     *
     * @throws IncorrectInputDataException Throws when there are problems with input data after some methods
     *                                     and operations.
     */
    @Override
    public void divide() throws IncorrectInputDataException {
        if ("int".equals(parser.getNumberType())) {
            int firstNumber = Integer.parseInt(parser.getStringNumbers().get(INDEX_OF_FIRST_NUMBER));
            int secondNumber = Integer.parseInt(parser.getStringNumbers().get(INDEX_OF_SECOND_NUMBER));
            divideInt(firstNumber, secondNumber);
        } else if ("long".equals(parser.getNumberType())) {
            long firstNumber = Long.parseLong(parser.getStringNumbers().get(INDEX_OF_FIRST_NUMBER));
            long secondNumber = Long.parseLong(parser.getStringNumbers().get(INDEX_OF_SECOND_NUMBER));
            divideLong(firstNumber, secondNumber);
        } else if ("double".equals(parser.getNumberType())) {
            double firstNumber = Double.parseDouble(parser.getStringNumbers().get(INDEX_OF_FIRST_NUMBER));
            double secondNumber = Double.parseDouble(parser.getStringNumbers().get(INDEX_OF_SECOND_NUMBER));
            divideDouble(firstNumber, secondNumber);
        } else if ("float".equals(parser.getNumberType())) {
            float firstNumber = Float.parseFloat(parser.getStringNumbers().get(INDEX_OF_FIRST_NUMBER));
            float secondNumber = Float.parseFloat(parser.getStringNumbers().get(INDEX_OF_SECOND_NUMBER));
            divideFloat(firstNumber, secondNumber);
        } else {
            throw new IncorrectInputDataException("Impossible parsing!");
        }
    }

    /**
     * Divide operation for int data type.
     *
     * @param firstNumber  int first divider.
     * @param secondNumber int second divider.
     */
    public void divideInt(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        String textResult = firstNumber + "/" + secondNumber + "=" + result;
        operationResult.append(textResult);
    }

    /**
     * Divide operation for long data type.
     *
     * @param firstNumber  long first divider.
     * @param secondNumber long second divider.
     */
    public void divideLong(long firstNumber, long secondNumber) {
        long result = firstNumber / secondNumber;
        String textResult = firstNumber + "/" + secondNumber + "=" + result;
        operationResult.append(textResult);
    }

    /**
     * Divide operation for float data type.
     *
     * @param firstNumber  float first divider.
     * @param secondNumber float second divider.
     */
    public void divideFloat(float firstNumber, float secondNumber) {
        float result = firstNumber / secondNumber;
        String textResult = firstNumber + "/" + secondNumber + "=" + result;
        operationResult.append(textResult);

    }

    /**
     * Divide operation for double data type.
     *
     * @param firstNumber  double first divider.
     * @param secondNumber double second divider.
     */
    public void divideDouble(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        String textResult = firstNumber + "/" + secondNumber + "=" + result;
        operationResult.append(textResult);

    }

    /**
     * Override method for execution add operation.
     *
     * @throws IncorrectInputDataException Throws when there are problems with input data after some methods
     *                                     and operations.
     */
    @Override
    public void calculate() throws IncorrectInputDataException {
        this.divide();
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
