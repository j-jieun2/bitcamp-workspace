package com.eomcs.basic.test;

import com.eomcs.basic.util.Student;

public class Javaclass017 {

  public static void main(String[] args) {
    Student s1 = new Student();

    System.out.println("s1 변수가 Student 객체를 참조합니다.");

    Student s2 = new Student();

    System.out.println("s2 변수가 또 다르 Studen 객체를 참조합니다.");

  }
}

/* 마무리
 * 클래스는 객체를 생성하기 위한 설계도와 같은 것 이다. O
 * new 연산자로 클래스의 생성자를 호출함으로써 객체가 생성된다.O
 * 하나의 클래스로 하나의 객체만 생성할 수 있다. X
 * 객체는 클래스의 인스턴스이다. O
 *
 * 메소드 - 객체의 동작 부분으로 실행 코드를 가지고 있는 블록
 * 필드 - 객체의 데이터를 저장한다.
 * 생성자 - 객체의 초기화를 담당한다.
 *
 * String name = 필드
 * Member(String name) {} = 생성자
 * void setName(String name) {} = 메소드
 */