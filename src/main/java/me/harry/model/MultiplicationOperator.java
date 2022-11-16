package me.harry.model;

public class MultiplicationOperator implements ArithmeticOperator{

  @Override
  public boolean isSupport(String operator) {
    return operator.equals("*");
  }

  @Override
  public int arithmeticCalculate(PositiveNumber lValue, PositiveNumber rValue) {
    return lValue.toInt() * rValue.toInt();
  }
}
