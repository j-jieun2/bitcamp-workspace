package com.eomcs.oop.ex10.d.d1;

public class Sedan extends Car {

  @Override
  public void run() {
    System.out.println("쌩쌩 달린다");
  }

  public void doSurroof(boolean open) {
    if (open) {
      System.out.println("썬루프를 연다.");
    } else {
      System.out.println("썬루프를 닫는다.");
    }
  }
}
