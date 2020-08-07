//# 메서드 : 스택 오버플로우 오류!
//
package com.eomcs.basic.ex07;

public class Exam0460 {

  static int sum(int value) {
    if (value == 1)
      return 1;

    return value + sum(value - 1);
  }

  public static void main(String[] args) {
    System.out.println(sum(100000));
    // Exception in thread "main" java.lang.StackOverflowError
    // => JVM 스택 메모리가 꽉 차서 더이상 메서드 실행을 위해 로컬 변수를
    //    만들 수 없는 상태이다.

    // 메소드 호출이 너무 깊어지는 경우는 재귀호출 대신 다른 방법을 사용하라.
    
    long sum = 0;
    for (int i = 1; i <= 100000; i++) {
      sum += i;
    }
    System.out.println(sum);
    
  }
}