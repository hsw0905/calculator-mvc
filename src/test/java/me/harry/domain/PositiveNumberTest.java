package me.harry.domain;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PositiveNumberTest {
  @DisplayName("0 또는 음수일 경우 예외가 발생한다.")
  @ParameterizedTest
  @ValueSource(ints = {-1, 0})
  void createTest(int value) {
    assertThatCode(()->new PositiveNumber(value))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("0 또는 음수는 사용할 수 없습니다.");
  }
}
