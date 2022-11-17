package me.harry.dto;

import me.harry.domain.PositiveNumber;

public final class CalculatorDto {
  private final PositiveNumber lValue;
  private final String operator;
  private final PositiveNumber rValue;

  public CalculatorDto(int lValue, String operator, int rValue) {
    this.lValue = new PositiveNumber(lValue);
    this.operator = operator;
    this.rValue = new PositiveNumber(rValue);
  }

  public int getlValue() {
    return lValue.toInt();
  }

  public String getOperator() {
    return operator;
  }

  public int getrValue() {
    return rValue.toInt();
  }
}
