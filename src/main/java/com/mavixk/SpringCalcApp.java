package com.mavixk;

import com.mavixk.Calculator.CalcAppConstructorDI;
import com.mavixk.Calculator.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCalcApp {

  public static void main(String[] args) {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.mavixk"
        + ".Calculator");

    Calculator calculator = (Calculator) applicationContext.getBean("calculator");
    calculator.compute("add", 30, 40);

    CalcAppConstructorDI calc = (CalcAppConstructorDI) applicationContext.getBean(
        "calcAppConstructorDI");
    calc.compute("add", 30, 40);
    calc.compute("sub", 40, 30);
    calc.compute("mul", 20, 30);
    calc.compute("div", 30, 15);
  }
}
