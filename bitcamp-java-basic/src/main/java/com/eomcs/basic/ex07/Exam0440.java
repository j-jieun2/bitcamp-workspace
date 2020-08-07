//# 메서드 : 스택 메모리 응용 I
//
package com.eomcs.basic.ex07;

public class Exam0440 {

  static int m1(int value) {
    int r1 = m2(value); // r1 = 105
    int r2 = m3(value); // r2 = 205
    return r1 + r2; // 105 + 205
  }

  static int m2(int value) {
    return value + 100; // 105
  }

  static int m3(int value) {
    return value + 200;
  }

  public static void main(String[] args) {

    int r = m1(5);
    System.out.println(r); // 105 + 205

  }
}