package com.eomcs.oop.ex02;

//# 관련된 기능(메서드)을 묶어 분류하기 - 클래스 메서드와 클래스 변수
//

public class Exam0240 {
  // 계산 기능과 관련된 메서드를 별도의 블록으로 분리할 때 사용하는 문법이 "클래스"이다.

  static class Calculator {

    // ## 클래스 변수 사용
    // - 메서드들의 작업 결과를 보관할 때 사용할 변수이다.
    // - 변수 선언에 static을 붙이다.
    // - "스태틱 변수"라고도 부른다.
    // - 클래스 변수는 new 명령으로 생성하지 않는다.
    // - 클래스가 메모리에 로딩될 때 자동으로 "Method Area" 영역에 생성된다.

    static int result = 0;

    static void plus(int value) {
      // 메서드 작업 결과는 클래스 변수에 보관한다.
      result += value;
      // result = result + value;
    }

    static void minus(int value) {
      result -= value;
      // result = result - value;
    }

    static void multple(int value) {
      result *= value;
      // result = result * value;
    }

    static void divde(int value) {
      result /= value;
      // result = result / value;
    }

  }

  public static void main(String[] args) {
    // 연산자 우선순위를 고려하지 말고 나온 순서대로 계산하라!
    // 식1) 2 + 3 - 1 * 7 / 3 = 9

    // 계산 결과를 보관할 변수는 더이상 필요가 없다.
    // Calculator 내부에서 계산 결과를 관리한다.
    // int result = 0;


    Calculator.plus(2);
    Calculator.plus(3);
    Calculator.minus(1);
    Calculator.multple(7);
    Calculator.divde(3);

    System.out.println("**********************");
    System.out.printf("정답 = %d\n", Calculator.result);
    System.out.println("**********************");
  }
}

