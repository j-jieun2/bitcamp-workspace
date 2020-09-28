// 아규먼트에 람다(lambda) 활용 II - 파라미터와 리턴 값이 있는 람다 만들기
package com.eomcs.oop.ex12.ex122;

public class Exam0321 {

  static interface Calulator {
    int computer(int a, int b);
  }

  static void test(Calulator c) {
    System.out.println(c.computer(100, 200));
  }

  public static void main(String[] args) {
    // 익명 클래스로 정의한다면?
    test(new Calulator() {
      @Override
      public int computer(int a, int b) {
        return a + b;
      }
    });
  }
}
