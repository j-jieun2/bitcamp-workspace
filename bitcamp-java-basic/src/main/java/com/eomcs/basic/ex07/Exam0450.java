//# 메서드 : 스택 메모리 응용 II - 재귀호출
//
package com.eomcs.basic.ex07;

public class Exam0450 {

  static int sum(int value) {
    if (value == 1)
      return 1;
// 만약 value 값이 1일 경우 return 해라.

    return value + sum(value - 1);
    // value = 5 + (5 - 1) = 9
    // value = 4 + (4 - 1) = 7
    // value = 3 + (3 - 1) = 5
    // value = 2 + (2 - 1) = 3
    // value = 1 + (1 - 1) = 1 // if문으로 인해 멈춤
  }

  public static void main(String[] args) {
    System.out.println(sum(5));
  }
}