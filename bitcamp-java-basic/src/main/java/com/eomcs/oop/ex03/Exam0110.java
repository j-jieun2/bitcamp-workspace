package com.eomcs.oop.ex03;

public class Exam0110 {
  public static void main(String[] args) {
    // 인스턴스(instance field) 변수 = non-static variable
    class A {
      int v1;
      boolean v2;
      // heap에 A 클래스가 저장됨
      // A의 인스턴스 = 객체
      // => v1, v2
    }

    // A opj1 = new A();
    // A 객체의 주소를 Stack 저장
    // opj1 = 레퍼런스

    A obj1 = new A();
    A obj2 = new A();
    A obj3 = new A();

    // obj1(레퍼런스) v1(인스턴스) 객체에 값을 넣음
    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;

    System.out.println(obj1.v1);
    System.out.println(obj2.v1);
    System.out.println(obj3.v1);


  }
}
