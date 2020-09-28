package com.eomcs.basic.test.test1;

// Animal 상속한 후 추상 메소드를 재정의 한다.
public class Dog extends Animal {
  public Dog() {
    this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("멍멍");
  }
}
