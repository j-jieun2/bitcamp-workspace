// call by value vs. call by reference
package com.eomcs.basic.ex07;

public class Exam0310 {

  static class Person {
    String name;
    int age;
    boolean working;
  }

  public static void main(String[] args) {

    // Heap
    // - new 명령으로 만든 메모리(인스턴스=객체)를 둔다.
    // - Garbage Collector(GC)가 관리하는 영역이다.


    int a = 200;

    m1(a); // call by value

    System.out.println(a); // 200

    a = 300;

    m1(a);

    System.out.println(a); // 300

    int[] arr = new int [3];
    arr[0] = 100;
    arr[1] = 200;
    arr[2] = 300;

    m2(arr); // call by reference

    System.out.println(arr[0]); // 200
    System.out.println(arr[1]); // 600
    System.out.println(arr[2]); // 1200

    System.out.println("--------------------------");

    Person p;
    p = new Person();

    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);

    m3(p); // call by reference

    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);

  }

  static void m3(Person p) {
    p.name = "홍길동";
    p.age = 20;
    p.working = true;
  }

  static void m1(int a) {
    a = 100;
  }

  static void m2(int[] arr) {
    arr[0] *= 2;
    arr[1] *= 3;
    arr[2] *= 4;
  }
}



// 시험지:
// 1. 다음 계산을 수행하라.
//    a 변수에 100을 넣어라.
//    b 변수에 200을 넣어라.
//    a와 b를 더해 그 결과를 출력하라.
//