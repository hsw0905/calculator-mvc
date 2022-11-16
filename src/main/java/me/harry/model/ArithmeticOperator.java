package me.harry.model;

public interface ArithmeticOperator {

  boolean isSupport(String operator);

  int arithmeticCalculate(final PositiveNumber lValue, final PositiveNumber rValue);
}
