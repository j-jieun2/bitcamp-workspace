// 인터페이스 구현 - 직접 인터페이스를 구현하기 보다 추상 클래스를 상속 받는다.
package com.eomcs.oop.ex10.b.b1;

// 인터페이스를 직접 구현하면 인터페이스에 선언된 모든 메서드를 구현해야 하지만,
// 미리 인터페이스의 몇몇 메서드를 구현한 추상클래스(AbstractServlet)를 상속 받는다면
// 서브 클래스는 좀 더 쉽게 인터페이스를 구현할 수 있다.

public class Exam03 extends AbstractServlet {
  @Override
  public void service() {}
}
