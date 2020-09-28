// 아규먼트에 람다(lambda) 활용 III - 여러 개의 문장이 있는 경우
package com.eomcs.oop.ex12.ex122;

public class Exam0330 {

  static interface Calulator {
    int computer(int a, int b);
  }

  static void test(Calulator c) {
    System.out.println(c.computer(100, 200));
  }

  public static void main(String[] args) {
    // 여러 문장을 실행하는 경우 블록 {}으로 감싸라!
    test((a, b) -> {
      int sum = 0;
      for (int i = a; a <= b; i++) {
        sum += i;
      }
      return sum;
    });
  }
}
