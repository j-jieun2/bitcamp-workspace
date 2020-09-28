// 제네릭(Generic) 문법 정리 - 제네릭 파라미터
package com.eomcs.generic.ex01.exam;

import java.util.ArrayList;

public class Exam0223 {

  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}
  /*
   *   Object
   *     |
   *     A
   *    / \
   *   B1 B2
   *   |
   *   C
   */

  public static void main(String[] args) {
    // m1(ArrayList<? extends B1>)
    // => A 타입 및 그 하위 타입에 대하여 ArrayList 객체를 파라미터로 넘길 수 있다.
    //
  }

  static void m1(ArrayList<B1> list) {
    // 컴파일러는 파라미터로 넘어온 ArrayList가  어떤 타입이든 간에
    // 문법적으로 B1 타입의 값만 다룬다.
    // list.add(new Object()); // 컴파일 오류
    // list.add(new A()); // 컴파일 오류
    list.add(new B1());
    // list.add(new B2()); // 컴파일 오류
    list.add(new C());
  }
}
