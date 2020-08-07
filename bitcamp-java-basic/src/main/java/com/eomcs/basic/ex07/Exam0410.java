//# 메서드 : JVM 메모리

package com.eomcs.basic.ex07;

public class Exam0410 {

  static void swap(int a, int b) {
    int temp = a; // temp = 100
    a = b; // a = 200
    b = temp; // b = 100
    System.out.printf("swap(): a = %d, b = %d\n", a, b);
    // a = 200, b = 100
  }

  public static void main(String[] args) {
    int a = 100;
    int b = 200;
    swap(a, b);
    // 값을 준 뒤 swap 필드가 사라짐.
    System.out.printf("main(): a = %d, b = %d\n", a, b);
    // a = 100, b = 200

  }
}