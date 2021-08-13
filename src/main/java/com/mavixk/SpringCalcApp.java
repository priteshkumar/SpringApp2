package com.mavixk;

import com.mavixk.Calculator.CalcAppConstructorDI;
import com.mavixk.Calculator.Calculator;
import com.mavixk.Calculator.ui.OutputScreenUI;
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
    OutputScreenUI addUI = (OutputScreenUI) applicationContext.getBean("outputScreenUI");

    calc.compute("add", 30, 40,addUI);

    OutputScreenUI subtractUI = (OutputScreenUI) applicationContext.getBean("outputScreenUI");
    calc.compute("sub", 40, 30,subtractUI);

    OutputScreenUI multiplyUI = (OutputScreenUI) applicationContext.getBean("outputScreenUI");
    calc.compute("mul", 20, 30,multiplyUI);

    OutputScreenUI divisionUI = (OutputScreenUI) applicationContext.getBean("outputScreenUI");

    calc.compute("div", 30, 15,divisionUI);
    //all output UI screens are prototype scope creating new instances
    System.out.println(addUI.equals(subtractUI) + " addui is equal to subui");
    System.out.println(addUI != multiplyUI);

  }
}
