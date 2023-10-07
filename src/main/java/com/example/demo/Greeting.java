package com.example.demo;

public record Greeting(long id, String content) {
  public String getContent(){
    return this.content();
  }
 }