package me.harry.view;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorViewTest {

  private CalculatorView view;

  @BeforeEach
  void setUp() {
    view = mock(CalculatorView.class);
  }

  @DisplayName("(mock) 사용자로부터 입력값을 받는다.")
  @Test
  void requestSuccess() {
    view.printInputConsole();

    String input = "123 + 456";
    when(view.requestConsole()).thenReturn(input);

    assertThat(view.requestConsole()).isEqualTo(input);
  }
}
