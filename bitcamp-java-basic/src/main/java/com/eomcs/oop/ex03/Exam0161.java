package com.eomcs.oop.ex03;

public class Exam0161 {

  static class Member {
    String id;
    String password;
    int tpye; // 0: 손님. 1: 회원, 2:관리자
  }

  public static void main(String[] args) {

    // 이전 예제의 문제점을 해결하기 위해 나온 것이 상수이다.
    // - 즉 의미있는 이름으로 변수를 만들어 놓고 그 변수에 숫자를 저장한다.
    // - 그리고 그 값을 사용할 때는 변수를 통해 사용한다.
    // - 조회 용으로 사용할 변수이기에 final 로 선언한다.
    // - 상수라는 것을 직관적으로 알리기 위해 변수 이름을 대문자로 선언한다.
    //
    final int GUEST = 0;
    final int MEMBER = 1;
    final int MANAGER = 2;

    // 다음은 상수를 사용한 예
    Member m1 = new Member();
    m1.id = "aaa";
    m1.password = "1111";
    m1.tpye = GUEST;

    Member m2 = new Member();
    m2.id = "bbb";
    m2.password = "1111";
    m2.tpye = MANAGER;

    Member m3 = new Member();
    m3.id = "ccc";
    m3.password = "1111";
    m3.tpye = MEMBER;
  }

}
