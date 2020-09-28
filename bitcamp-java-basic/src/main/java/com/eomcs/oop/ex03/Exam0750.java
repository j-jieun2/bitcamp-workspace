package com.eomcs.oop.ex03;

public class Exam0750 {

  static class A { // 객체를 만들기 위한 설계도
    int a; // 인스턴스 변수
    int b;
    int c;

    // 여러 개의 인스턴스 초기화 블록이 있을 때,
    // - 선언된 순서대로 생성자의 앞 부분에 삽입된다.
    // - 인스턴스 초기화 블록이 선언된 위치는 상관없다.
    // - 바이트코드(Exam0750$A.class)를 확인해 보라!

    {
      this.a = 101;
      System.out.println("첫 번째 인스턴스 초기화 블록");
    }

    A() {
      // 인스턴스 초기화 블록은 선언된 순서대로 삽입한다.
      // 즉 다음과 같다.
      // this.a = 101;
      // System.out.println("첫 번째 인스턴스 초기화 블록");
      // this.a = 102;
      // System.out.println("두 번째 인스턴스 초기화 블록");
      // this.a = 103;
      // System.out.println("세 번째 인스턴스 초기화 블록");

      System.out.println("A()");
      b = 200;
      c = 300;
    }

    {
      this.a = 102;
      System.out.println("두 번째 인스턴스 초기화 블록");
    }

    {
      this.a = 103;
      System.out.println("세 번째 인스턴스 초기화 블록");
    }
  }

  public static void main(String[] args) {

    A obj1 = new A(); // 객체. 인스턴스 생성자를 호출하고 객체 생성 번지를 리턴한다.
    System.out.printf("a=%d, b=%d, c=%d\n", obj1.a, obj1.b, obj1.c);

  }
}
