package com.eomcs.oop.ex02;

//# 관련된 기능(메서드)을 묶어 분류하기 - 클래스로 분류
//

public class Exam0220 {
  // 계산 기능과 관련된 메서드를 별도의 블록으로 분리할 때 사용하는 문법이 "클래스"이다.

  static class Calculator {

    static int plus(int a, int b) {
      return a + b;
    }

    static int minus(int a, int b) {
      return a - b;
    }

    static int multple(int a, int b) {
      return a * b;
    }

    static int divde(int a, int b) {
      return a / b;
    }

  }

  public static void main(String[] args) {
    // 연산자 우선순위를 고려하지 말고 나온 순서대로 계산하라!
    // 식1) 2 + 3 - 1 * 7 / 3 = 9

    int result = 0;
    // main()에 계산 결과를 담을 변수 준비

    // 클래스 메서드를 호출하여 작업을 수행하고
    // 리턴 결과는 로컬변수에 저장한다.

    result = Calculator.plus(2, 3);
    result = Calculator.minus(result, 1);
    result = Calculator.multple(result, 7);
    result = Calculator.divde(result, 3);

    System.out.println("**********************");
    System.out.printf("정답 = %d\n", result);
    System.out.println("**********************");
  }
}

