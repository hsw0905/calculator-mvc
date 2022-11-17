package me.harry.domain;

public interface ArithmeticOperator {

  boolean isSupport(String operator);

  int arithmeticCalculate(final PositiveNumber lValue, final PositiveNumber rValue);
}
