package me.harry;

import me.harry.controller.CalculatorController;
import me.harry.domain.Calculator;
import me.harry.view.CalculatorView;

public class App {

  public static void main(String[] args) {
    CalculatorController controller = new CalculatorController(new CalculatorView(),
        new Calculator());

    controller.execute();
  }
}
