package me.harry.domain;

import java.util.List;

public class Calculator {
  private final String NOT_CORRECT_OPERATOR_MESSAGE = "올바른 연산자가 아닙니다.";

  private final List<ArithmeticOperator> operatorList = List.of(
      new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(),
      new DivisionOperator()
  );

  public int calculate(PositiveNumber lValue, String operator, PositiveNumber rValue) {
    return operatorList.stream()
        .filter(arithmeticOperator -> arithmeticOperator.isSupport(operator))
        .mapToInt(arithmeticOperator -> arithmeticOperator.arithmeticCalculate(lValue, rValue))
        .findFirst()
        .orElseThrow(()->new IllegalArgumentException(NOT_CORRECT_OPERATOR_MESSAGE));
  }
}
