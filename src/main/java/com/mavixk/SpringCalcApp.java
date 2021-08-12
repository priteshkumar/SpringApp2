package com.mavixk;

import com.mavixk.Calculator.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCalcApp {

  public static void main(String[] args) {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.mavixk"
        + ".Calculator");

    Calculator calculator = (Calculator) applicationContext.getBean("calculator");
    calculator.compute("add", 30, 40);
  }
}
