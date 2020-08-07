package com.eomcs.basic.ex07;

// 메서드 중첩 호출

public class Exam0280 {
  public static void main(String[] args) {
// 2 + 3 + 4 + 5 = ?
    int result = plus(2, 3);
    result = plus(result, 4);
    result = plus(result, 5);
    System.out.println(result);

    result = plus(plus(plus(2, 3), 4), 5);

    // 실행과정
    // 메서드를 호출하는 문장은 가장 안쪽부터 실행된다.

    // result = plus(plus(5, 4), 5);
    // result = plus(9, 5);
    // result = 14;

    System.out.println(result);

    System.out.printf("100 + 200 = %d\n", plus(100, 200));

  }

  static int plus(int a, int b) {
    return a + b;
  }
}
