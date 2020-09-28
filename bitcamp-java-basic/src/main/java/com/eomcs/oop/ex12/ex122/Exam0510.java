// 메서드 레퍼런스 - 스태틱 메서드 레퍼런스
package com.eomcs.oop.ex12.ex122;

public class Exam0510 {

  static class MyCalulator {
    public static int plus(int a, int b) {return a + b;}
    public static int minus(int a, int b) {return a - b;}
    public static int multiple(int a, int b) {return a * b;}
    public static int divide(int a, int b) {return a / b;}
  }

  static interface Calulator {
    int computer(int x, int y);
  }

  public static void main(String[] args) {
    // 메서드 한 개짜리 인터페이스의 구현체를 만들 때
    // 기존 스태틱 메서드를 람다 구현체로 사용할 수 있다.
    // => 단 인터페이스에 선언된 메서드의 규격과 일치해야 한다.
    // => 규격? 파라미터 타입 및 개수, 리턴 타입
    // => 문법:
    //    클래스명::메서드명

    Calulator c1 = MyCalulator::plus;
    Calulator c2 = MyCalulator::minus;
    Calulator c3 = MyCalulator::multiple;
    Calulator c4 = MyCalulator::divide;

    System.out.println(c1.computer(200, 17)); // plus()
    System.out.println(c2.computer(200, 17)); // minus()
    System.out.println(c3.computer(200, 17)); // multiple()
    System.out.println(c4.computer(200, 17)); // divide()

  }
}
