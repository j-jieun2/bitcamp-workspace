// 조건문
package com.eomcs.basic.ex06;

public class Exam0120 {
  public static void main(String[] args) {
    int age = 17;

    if (age >= 19) // age(17)가 19세 이상일 경우
      System.out.println("성인이다.");
      System.out.println("군대 가야한다.");
      System.out.println("일해야 한다.");
      System.out.println("세금 납부해야 한다.");

      System.out.println("-------------------------------");

      if (age >= 19) {
        System.out.println("성인이다");
        System.out.println("군대 가야한다.");
        System.out.println("일해야 한다.");
        System.out.println("세금 납부해야 한다.");
      }
  }
}
