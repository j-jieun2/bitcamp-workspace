package com.eomcs.basic.test;

public class Javaclass019 {
  public static void main(String[] args) {
    FieldInitValue fiv = new FieldInitValue();

    System.out.println("byteField: " + fiv.byteField);
    System.out.println("shorField: " + fiv.shortField);
    System.out.println("intField: " + fiv.intField);
    System.out.println("longField: " + fiv.longField);
    System.out.println("booleanField: " + fiv.booleanField);
    System.out.println("charField: " + fiv.charField);
    System.out.println("floatField: " + fiv.flaotField);
    System.out.println("doubleField: " + fiv.doubleField);
    System.out.println("arrField: " + fiv.arrField);
    System.out.println("referenceField: " + fiv.referenecField);
  }
}

/* 확인 문제
 * 필드는 메소드에서 사용할 수 있다. X - o
 * 필드는 클래스 블록 어디서든 선언할 수 있다.(생성자, 메소드 내부 외) O
 * 필드는 객체 외부에서 접근할 수 없다. X
 * 필드는 초기값을 주지 않더라도 기본값으로 자동 초기화된다. O
 *
 */