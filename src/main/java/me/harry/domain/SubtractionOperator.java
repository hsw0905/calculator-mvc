package me.harry.domain;

public class SubtractionOperator implements ArithmeticOperator{

  @Override
  public boolean isSupport(String operator) {
    return operator.equals("-");
  }

  @Override
  public int arithmeticCalculate(PositiveNumber lValue, PositiveNumber rValue) {
    return lValue.toInt() - rValue.toInt();
  }
}
