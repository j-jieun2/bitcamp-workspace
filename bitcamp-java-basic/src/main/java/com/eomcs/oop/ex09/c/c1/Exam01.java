package com.eomcs.oop.ex09.c.c1;

public class Exam01 implements B {

  @Override
  public void m1() {}
  @Override
  public void m2() {}

  // 클래스에 추가한 메서드
  public void x1() {}
  public void x2() {}

  public static void main(String[] args) {

    Exam01 obj = new Exam01();

    obj.m1(); // A.m1()
    obj.m2(); // B.m2()
    obj.x1(); // Exam01.x1()
    obj.x2(); // Exam01.x2()

    B obj2 = obj;

    obj2.m1(); // B.m2()
    obj2.m2(); // A.m1() <== B가 상속받은 인터페이스의 메서드
    // obj2.x1(); // 컴파일 오류
    // obj2.x2();

    A obj3 = obj;

    obj3.m1(); // A.m1()
    // obj3.m2();
    // obj3.x1();
    // obj3.x2();

  }
}
