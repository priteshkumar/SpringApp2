package com.mavixk.Calculator.ui;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class OutputScreenUI {

  public OutputScreenUI(){
    System.out.println("create output ui widget");
  }

  public void showOutput(int result){
    for(int i=0; i < 10;i++)
      System.out.print("-");
    System.out.println();
    System.out.println(result);
    System.out.println();
    for(int i=0; i < 10;i++)
      System.out.print("-");
    System.out.println();
  }
}
