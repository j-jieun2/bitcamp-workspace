// call by value vs. call by reference
package com.eomcs.basic.ex07;

public class Exam0330 {
  // main()에서 만든 int a와 int b의 값을 바꾸고 싶다면,
  // primitive data type 값을 직접 넘기지 말고
  // 객체에 담아 넘겨라!

  static class MyObject {
    int a;
    int b;
  }

  static void swap(MyObject ref) {
    System.out.printf("swap(): a = %d, b = %d\n", ref.a, ref.b);
    // a = 100, b = 200
    int temp = ref.a; // temp = 100
    ref.a = ref.b; // ref.a = 200
    ref.b = temp; // ref.b = 100
    System.out.printf("swap(): a = %d, b = %d\n", ref.a, ref.b);
    // a = 200, b = 100
  }

  public static void main(String[] args) {
    // MyObject 설계도에 따라 int a와 int b 메모리를 만든다.
    // 그리고 그 메모리(인스턴스=객체)의 주소를 ref 변수에 저장한다.
    MyObject ref = new MyObject(); // heap에 저장
    ref.a = 100;
    ref.b = 200;

    // a, b 변수가 들어있는 인스턴스(객체=메모리)의 주소를
    // swap()에 넘긴다. => 그래서 "call by reference"인 것이다.

    swap(ref); // 주소 소환!
    System.out.printf("main(): a = %d, b = %d\n", ref.a, ref.b);
    // a = 200, b = 100
  }
}