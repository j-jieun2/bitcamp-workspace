package com.eomcs.oop.ex09.c.c1;

public class Exam03 implements B, C, D {
  @Override
  public void m1() {} // B의 수퍼 인터페이스 A 인터페이스 구현
  @Override
  public void m2() {} // B와 D의 인터페이스 구현
  @Override
  public void m3() {} // C의 인터페이스 구현
  @Override
  public void m4() {} // D의 인터페이스 구현

  public static void main(String[] args) {

    Exam03 obj = new Exam03();

    B obj2 = obj;
    obj2.m1();
    obj2.m2(); // 여기에서는 B.m2()

    C obj3 = obj;
    obj3.m3();

    D obj4 = obj;
    obj4.m2(); // 여기에서는 D.m2() 이다. 같은 메서드를 여러 인터페이스에서 공유할 수 있다.
    obj4.m4();
  }
}
