// 메서드 오버로딩(overloading) - 응용 I
package com.eomcs.oop.ex06.b;

public class Exam0310 {
  public static void main(String[] args) {

    // 다양한 파라미터 값을 받는 println()
    System.out.println(100);
    System.out.println(true);
    System.out.println("Hello");

    // 외부에서 값을 받아 Integer 객체를 생성하는 메서드들
    Integer obj1 = Integer.valueOf(100);
    // Integer 객체를 생성하여 Heap에 valueOf라는 배열을 생성, 100이라는 값을 넣고
    // 해당 주소를 obj1에 리턴하여 저장한다.

    Integer obj2 = Integer.valueOf("100");
    Integer obj3 = Integer.valueOf("64", 16); // 64를 16진수로 출력

    System.out.printf("%d, %d, %d\n", obj1, obj2, obj3);

  }
}
