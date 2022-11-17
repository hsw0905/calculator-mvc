package me.harry.controller;

import java.util.List;
import me.harry.domain.Calculator;
import me.harry.domain.PositiveNumber;
import me.harry.dto.CalculatorDto;
import me.harry.dto.ResultDto;
import me.harry.view.CalculatorView;

public class CalculatorController {

  private final String WRONG_INPUT_EXCEPTION_MESSAGE = "Wrong input String, Required [int String int]";
  private final String WRONG_INPUT_INTEGER_EXCEPTION_MESSAGE = "lValue, rValue must be int type";

  private final CalculatorView view;
  private final Calculator calculator;

  public CalculatorController(CalculatorView view, Calculator calculator) {
    this.view = view;
    this.calculator = calculator;
  }

  public void execute() {
    view.printInputConsole();
    String userInput = view.requestConsole();
    CalculatorDto calculatorDto = toCalculatorDto(userInput);
    int result;

    try {
      result = calculator.calculate(new PositiveNumber(calculatorDto.getlValue()),
          calculatorDto.getOperator(),
          new PositiveNumber(calculatorDto.getrValue()));
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
      System.out.printf("[CalculatorController][execute]-Error : %s\n", e.getMessage());
      return;
    }
    view.printOutputConsole(toResultDto(result));
  }

  private CalculatorDto toCalculatorDto(String inputStr) {
    String[] splitArr = inputStr.split(" ");
    int lValue, rValue;
    String operator;

    if (splitArr.length != 3) {
      throw new IllegalArgumentException(WRONG_INPUT_EXCEPTION_MESSAGE);
    }

    try {
      lValue = Integer.parseInt(splitArr[0]);
      operator = splitArr[1];
      rValue = Integer.parseInt(splitArr[2]);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(WRONG_INPUT_INTEGER_EXCEPTION_MESSAGE);
    }

    return new CalculatorDto(lValue, operator, rValue);
  }

  private ResultDto toResultDto(int result) {
    return new ResultDto(result);
  }
}
