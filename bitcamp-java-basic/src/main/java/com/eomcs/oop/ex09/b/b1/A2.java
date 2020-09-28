// 인터페이스 정의 II - 모든 메서드는 abstract 이다.
package com.eomcs.oop.ex09.b.b1;

public interface A2 {
  // 인터페이스에 선언하는 메서드는 호출 규칙을 정의한 것이다.
  // 규칙은 클래스가 따라야 한다.
  // 그래서 인터페이스에 선언되는 모든 메서드는 몸체를 구현하지 않는다.
  // void m1() {}

  abstract void m2();

  void m3();
  // abstract 생략 가능
}

