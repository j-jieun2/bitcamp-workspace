package com.eomcs.basic.test;

public class Computer extends Calculator {

  @Override
  double areaCircle(double r) {
    System.out.println("Computer 객체의 areaCircle() 실행");
    return Math.PI * r * r;
  }
}
