// 메서드 오버로딩(overloading) - 문법 사용 후
package com.eomcs.oop.ex06.b;

public class Exam0120 {

  static class Calculator {

    // 파라미터의 타입이나 개수가 다르더라도
    // 같은 일을 하는 메서드에 대해서는 같은 이름을 갖게 한다.

    static int plus(int a, int b) {
      return a + b;
    }

    static int plus(int a) {
      return a + a;
    }

    static float plus(float a, float b) {
      return a + b;
    }
  }
  public static void main(String[] args) {

    // 호출하는 메서드 이름은 같지만,
    // 아규먼트의 타입이나 개수에 따라 호출되는 메서드가 결정된다.
    //
    int r1 = Calculator.plus(100, 200);
    int r2 = Calculator.plus(100);
    float r3 = Calculator.plus(35.7f, 22.2f);

    System.out.printf("%d, %d, %.1f\n", r1, r2, r3);

    // float r4 = Calculator.plus(35.7f, 22); // 암시적 형변환, 22.0
    // System.out.println(r4);

    // float r5 = Calculator.plus(35.7, 22.2); 컴파일 오류!
    // 부동소수점에서는 f를 붙이지않으면 double, 해당 아규먼트는 존재하지않음

  }
}






