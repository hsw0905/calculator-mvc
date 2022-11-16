package me.harry.model;

public class Calculator {

  public static int calculate(PositiveNumber lValue, String operator, PositiveNumber rValue) {
    if (operator.equals("+")){
      return lValue.toInt() + rValue.toInt();
    } else if (operator.equals("-")) {
      return lValue.toInt() - rValue.toInt();
    } else if (operator.equals("*")) {
      return lValue.toInt() * rValue.toInt();
    } else {
      return lValue.toInt() / rValue.toInt();
    }
  }
}
