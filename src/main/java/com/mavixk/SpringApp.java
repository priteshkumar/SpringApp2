package com.mavixk;

import com.mavixk.Calculator.MathService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.mavixk"
        + ".Calculator");
    MathService mathService = (MathService) applicationContext.getBean("additionService");
    mathService.operate(3, 4);
  }

}
