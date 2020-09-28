// 인터페이스 정의 I - 모든 메서드는 public이다.
package com.eomcs.oop.ex09.b.b1;

public interface A {

  public void m1();
  void m2();

  // private void m3(); // 컴파일 오류
  //protected void m4(); // 컴파일 오류
  void m5(); // 이건 default 가 아니라 publi이 생략된 것이다.
}
