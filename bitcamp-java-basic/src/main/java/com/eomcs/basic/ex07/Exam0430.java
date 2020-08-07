//# 메서드 : 인스턴스와 Heap 메모리 영역
//
package com.eomcs.basic.ex07;

public class Exam0430 {

  static class MyObject {
    int a;
    int b;
  }

  static MyObject getMyObject() {
    MyObject ref = new MyObject(); // Heap에는 new 배열을 저장
    ref.a = 100;
    ref.b = 200;

    return ref;
  }

  public static void main(String[] args) {
    MyObject ref;
    ref = getMyObject(); // ref 배열 주소를 리턴
    System.out.println(ref.a); // 100, ref 주소에 들어있는 a 이름
    System.out.println(ref.b); // 200
  }
}