package me.harry.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * TDD - toy project
 * 간단한 사칙연산을 할 수 있다.
 * 양수로만 계산할 수 있다.
 * 나눗셈에서 0으로 나눌 경우 IllegalArgument 예외를 발생시킨다.
 */
public class CalculatorTest {

  @DisplayName("계산기 객체를 생성한다.")
  @Test
  void createCalculatorSuccess() {
    assertThatCode(Calculator::new).doesNotThrowAnyException();
  }

  @DisplayName("사칙 연산 결과를 반환한다")
  @ParameterizedTest
  @MethodSource("calculateFourArithmetic")
  void calculateSuccess(int lValue, String operator, int rValue, int result) {
    int calculateResult = Calculator.calculate(new PositiveNumber(lValue), operator, new PositiveNumber(rValue));
    assertThat(calculateResult).isEqualTo(result);
  }

  private static Stream<Arguments> calculateFourArithmetic(){
    return Stream.of(
        arguments(1, "+", 3, 4),
        arguments(3, "-", 5, -2),
        arguments(2, "*", 7, 14),
        arguments(15, "/", 5, 3)
    );
  }

}
