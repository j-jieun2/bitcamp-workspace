// call by value vs. call by reference
package com.eomcs.basic.ex07;

public class Exam0310_1 {

  static void swap(int a, int b) {
    System.out.printf("swap(): a = %d, b = %d\n", a, b); // a = 100, b = 200
    int temp = a; // temp = 100
    a = b; // a = 200
    b = temp; // b = 100
    System.out.printf("swap(): a = %d, b = %d\n", a, b); // a = 200, b = 100
  }

  public static void main(String[] args) {

    int a = 100;
    int b = 200;


    // swap() 호출할 때 a 변수의 값과 b 변수의 값을 넘긴다.
    // => 그래서 "call by value" 라 부른다.
    // => 비록 swap()에서 a와 b라는 이름의 변수가 있지만,
    //    이 변수는 main()에 있는 변수와 다른 변수이다.
    swap(a, b);
    System.out.printf("main(): a = %d, b = %d\n", a, b); // a = 100, b = 200

  }
}