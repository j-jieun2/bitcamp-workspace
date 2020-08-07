package com.eomcs.basic.ex07;

public class Exam0270 {

  // 1) 가변 파라미터는 여러 개 선언할 수 없다.
  // => 아규먼트의 시작과 끝을 구분할 수 없다.

  // 가변 파라미터를 설정하고 중간에 다른 타입이 온다고 하더라도 안됨.
  // 가변 파라미터는 무조건 맨 끝에 와야한다!

  static void m2(int a, String... names) {
    System.out.printf("%s님 오늘은 %d일 입니다.\n", names, a);
  }

  public static void main(String[] args) {

    m2(3, "지은");

  }
}
