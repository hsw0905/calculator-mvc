package me.harry.model;

public class PositiveNumber {
  private final String NEGATIVE_NUMBER_OR_ZERO_IS_NOT_ACCEPT_MESSAGE = "0 또는 음수는 사용할 수 없습니다.";
  private final int num;

  public PositiveNumber(int value) {
    validate(value);
    this.num = value;
  }

  private void validate(int value) {
    if (isNegative(value)){
      throw new IllegalArgumentException(NEGATIVE_NUMBER_OR_ZERO_IS_NOT_ACCEPT_MESSAGE);
    }
  }

  private boolean isNegative(int value) {
    return value <= 0;
  }

  public int toInt() {
    return num;
  }
}
