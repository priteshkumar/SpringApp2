package com.mavixk.Calculator;

import org.springframework.stereotype.Component;

@Component
public class AdditionService implements MathService{

  @Override
  public int operate(int x, int y) {
    return x + y;
  }
}
