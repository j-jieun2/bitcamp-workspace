package com.eomcs.basic.ex07;

public class Exam0230 {

  //3) 메서드 : 리턴값(O), 파라미터(X)
  // => 메서드 블록을 실행한 후 값을 리턴하는 메서드.
  // 메서드 정의할 때 어떤 값을 리턴하는 지 그 타입을 적어야 한다.
  // 메서드에서도 종료하기 전에 반드시 그 타입의 값을 리턴해야 한다.
  // => 리턴 타입은 반드시 한 개만 가능하다.
  // 만약 여러 개의 값을 리턴하고 싶다면, 배열에 담거나 객체에 담아 리턴하라!
  // => "손들어. 돈내놔!"

  static String hello() {
    return "안녕하세요";
    // 리턴 명령을 실행하면 메서드 실행을 종료한다.
  }
  public static void main(String[] args) {

    String r = hello();
    System.out.println(r);

    // 값을 받는 변수가 없으면 리턴값은 버려진다.
    hello();

    String s = hello();

    // 리턴 타입과 다른 타입의 변수로 값을 받으려 하면 컴파일 오류!
    // int i = hello(); 컴파일 오류


  }
}
