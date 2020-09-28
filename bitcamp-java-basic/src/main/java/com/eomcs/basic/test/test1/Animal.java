package com.eomcs.basic.test.test1;

public abstract class Animal { // 추상 클래스
  // 필드
  public String kind;

  // 메소드
  public void breathe() {
    System.out.println("숨을 쉽니다.");
  }

  // 추상메소드
  // 각 서브 클래스에서 재정의 해야함.
  public abstract void sound();
}
