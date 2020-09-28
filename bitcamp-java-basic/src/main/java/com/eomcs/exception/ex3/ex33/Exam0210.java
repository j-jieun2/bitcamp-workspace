// 예외 던지기 - 예외 상황을 호출자에게 알려주기
package com.eomcs.exception.ex3.ex33;

import java.io.FileNotFoundException;

public class Exam0210 {
  static void m1() throws Throwable {
    throw new Throwable();// ok
  }

  // 여러 개의 오류를 던지는 경우 메서드 선언부에 그대로 나열하라.
  static void m2() throws FileNotFoundException, RuntimeException {
    int a = 100;
    if (a < 0)
      throw new FileNotFoundException();
    else
      throw new RuntimeException();
  }

  public static void main(String[] args) {
  }
}
