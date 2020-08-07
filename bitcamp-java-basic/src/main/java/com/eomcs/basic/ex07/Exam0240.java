package com.eomcs.basic.ex07;

public class Exam0240 {

  static String hello(String name, int age) {
    String retVal = String.format("%d살 %s님을 환영합니다!", age, name);
    return retVal;
  }
  public static void main(String[] args) {

    String r = hello("홍길동", 20);
    System.out.println(r);

    // 리턴값을 받지않으면 리턴값은 버려짐
    hello("임꺽정", 30);
    System.out.println(r);
  }
}
