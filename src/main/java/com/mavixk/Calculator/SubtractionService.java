package com.mavixk.Calculator;

import org.springframework.stereotype.Component;

@Component
public class SubtractionService implements MathService {

  @Override
  public void operate(int x, int y) {
    System.out.println(x - y);
  }
}
