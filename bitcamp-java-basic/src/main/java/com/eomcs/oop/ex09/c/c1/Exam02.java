package com.eomcs.oop.ex09.c.c1;

public class Exam02 implements B, C {
  @Override
  public void m2() {} // B의 인터페이스
  @Override
  public void m1() {} // B의 수퍼인터페이스 메서드
  @Override
  public void m3() {} // C의 인터페이스

  public static void main(String[] args) {

    Exam02 obj = new Exam02();

    B obj2 = obj;

    obj2.m2(); // B.m2
    obj2.m1(); // A.m1 - 상속받은 메서드
    // obj2.m3(); // C.m3

    C obj3 = obj;

    obj3.m3(); // C.m3
    // obj3.m1();
    // obj3.m2();
  }
}
