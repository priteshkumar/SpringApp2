package com.mavixk;

import com.mavixk.Calculator.AdditionService;
import com.mavixk.Calculator.MathService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.mavixk"
        + ".Calculator");

    //log bean names
    for (String bean : applicationContext.getBeanDefinitionNames()) {
      System.out.println(bean);
    }

    MathService mService = applicationContext.getBean(AdditionService.class);
    mService.operate(7,9);

    //check for singleton instance of additionService bean
    System.out.println(
        "additionService is singleton " + applicationContext.isSingleton("additionService"));

            //get the additionsService bean
            MathService mathService = (MathService) applicationContext.getBean("additionService");
    mathService.operate(3, 4);

  }

}
