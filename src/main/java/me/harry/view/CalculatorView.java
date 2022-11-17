package me.harry.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import me.harry.dto.ResultDto;

public class CalculatorView {
  public String requestConsole() {
    String userInput = "";
    try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
      userInput = bufferedReader.readLine();
    } catch (IOException e){
      e.printStackTrace();
      System.out.printf("[CalculatorView][requestConsole]-Error : %s\n",e.getMessage());
    }

    return userInput;
  }

  public void printInputConsole() {
    System.out.println("[계산기 입력]");
    System.out.print("(양수 연산자 양수) 형태로 입력해주세요: ");
  }

  public void printOutputConsole(ResultDto result) {
    System.out.printf("[계산 결과]: %d\n", result.getResult());
  }

}
