// 인터페이스의 모든 메서드는 public이다.
// 인터페이스를 구현하는 클래스는
// 메서드의 공개 범위를 public 보다 좁게할 순 없다.
package com.eomcs.oop.ex09.b.b1;

public class Exam02 implements A3 {

  // public 보다 좁게 공개 범위를 줄일 수 없다.
  //  private void m1() {};
  //  protected void m2() {};
  //  void m1() {};
  //  void m2() {};

  // 반드시 public 이어야 한다.
  @Override
  public void m1() {}
  @Override
  public void m2() {}
}
