package com.mavixk.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

  //DI via field injection
  @Autowired
  private MathService mathService;

  public MathService getMathService() {
    return mathService;
  }

  public void setMathService(MathService mathService) {
    this.mathService = mathService;
  }

  public void compute(String cmd, int x, int y) {
    switch (cmd) {
      case "add":
        mathService.operate(x, y);
        break;
      default:
        throw new RuntimeException("illegal calculator cmd");
    }
  }
}
