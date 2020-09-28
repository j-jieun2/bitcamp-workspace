package com.eomcs.oop.ex06.d;

public class A2 extends A {
  @Override // 컴파일러에게 오버라이딩을 제대로 했는지 검사한다.
  public void m() {
    System.out.println("A2의 m() 호출!");
  }

  public void x() {
    System.out.println("A2의 x() 호출!");
  }
}
