package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ChrisComponent {
  public int add(int x, int y){
    return (x +y);
  }
  public String greeting(String name){
    if(name.equals("Chris")){
      return "I can't say hi to myself";
    }
    return "Hello "+name+"!";
  }
}
