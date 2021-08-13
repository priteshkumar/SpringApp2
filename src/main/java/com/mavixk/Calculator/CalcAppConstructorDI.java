package com.mavixk.Calculator;

import com.mavixk.Calculator.ui.OutputScreenUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CalcAppConstructorDI {

  private MathService addService;

  private MathService subtractService;

  private MathService multiplyService;

  private MathService divideService;

  //constructor injection
  //use qualifiers to differentiate between
  //components implementing same interface
  @Autowired
  public CalcAppConstructorDI(@Qualifier("additionService") MathService addService, @Qualifier(
      "subtractionService") MathService subtractService,
      @Qualifier("multiplicationService") MathService multiplyService,
      @Qualifier("divisionService") MathService divideService) {

    this.addService = addService;
    this.subtractService = subtractService;
    this.multiplyService = multiplyService;
    this.divideService = divideService;
  }

  public void compute(String cmd, int x, int y,OutputScreenUI outputScreenUI) {
    //System.out.println(cmd);
    int res = 0;
    switch (cmd) {
      case "add":
        res = addService.operate(x, y);
        break;
      case "sub":
        res = subtractService.operate(x, y);
        break;
      case "mul":
        res = multiplyService.operate(x, y);
        break;
      case "div":
        res = divideService.operate(x, y);
        break;
      default:
        throw new RuntimeException("illegal calculator cmd");
    }
    //show output on screen component
    outputScreenUI.showOutput(res);
  }
}
