package com.eomcs.oop.ex03;

public class Exam0691 {

  public static class A {
    static int a = 7;

    static {
      // a = 7;
      System.out.println("A.static{}");
      a += B.b;
      // 1) 현재 a값은 7, B클래스 값이 없기 때문에 잠깐 멈추고 B 클래스로 이동,
      // 6) B클래스의 b값이 0이여서 로딩을 잠시 중단하였고
      //    B클래스 로딩을 완료하여 다시 이 블록으로 돌아옴.
      //    현재 B.b = 29;
      // 7) 7 =+ 29;
      // 8) A.a = 36으로 A클래스 로딩 종료
    }
  }

  static class B {
    static int b = 22;

    static {
      // b = 22;
      // 2) A클래스 로딩 중 B.b 값을 위해 B클래스 로딩
      System.out.println("B.static{}");
      b += A.a;
      // 3) A.a; 값은 현재 7, 해당 값을 b에 넣는다.
      // 4) 22 += 7
      // 5) B.b = 29로 B클래스 로딩 종료.
      //

    }
  }

  public static void main(String[] args) {
    System.out.println(A.a); // 36
    System.out.println(B.b); // 29

    // 클래스 로딩 절차
    // 1) 클래스를 Method Area에 로딩한다.
    // 2) 스태틱 변수를 만든다.
    // 3) 스태틱 블록을 실행한다.
    //

    // 클래스 로딩
    // => 클래스 멤버(변수, 메서드)를 사용할 때
    // => Class.forName("클래스명") 을 통해 임의로 로딩할 때
    // => 단 한 번 로딩된 클래스는 다시 로딩하지 않는다.
    //

    // 스태틱 블록의 목적
    // => 클래스 멤버(스태틱 변수, 스태틱 메서드)를 사용하기 전에 유효한 값으로 초기화 시키는 것이다.
  }
}
