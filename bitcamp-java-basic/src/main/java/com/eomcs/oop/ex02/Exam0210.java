package com.eomcs.oop.ex02;

import com.eomcs.util.Calculator;

public class Exam0210 {



  public static void main(String[] args) {
    // 연산자 우선순위를 고려하지 말고 나온 순서대로 계산하라!
    // 식1) 2 + 3 - 1 * 7 / 3 = 9

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();


    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);


    printResult(c1.result);

  }

  static void printResult(int value) {
    System.out.println("******************************");
    System.out.printf("==> 결과 = %d\n", value);
    System.out.println("******************************");
  }

}

//    Calculator.plus(2);
//    Calculator.plus(3);
//    Calculator.minus(1);
//    Calculator.multiple(7);
//    Calculator.divide(3);
// result 2 리턴, result = 2
// result 3 리턴, result += 3 = 5
// result 1 리턴, result -= 1 = 4
// result 7 리턴, result *= 7 = 28
// result 3 리턴, result /= 3 = 9