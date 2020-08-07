// 조건문
package com.eomcs.basic.ex06;

public class Exam0140 {
  public static void main(String[] args) {

    int age = 17;

    if (age < 19)
      System.out.println("미성년입니다.");

    if (age >= 19)
      System.out.println("성인입니다!");
    else
      System.out.println("미성년입니다!");

    if (age >= 20) {
      System.out.println("---------------1");
      System.out.println("성인입니다!");
    } else {
      System.out.println("----------------2");
      System.out.println("미성년입니다!");
    }

    if (age >= 19)
      System.out.println("성인입니다!");
    else {
      System.out.println("미성년입니다!");
      System.out.println("-------------------------------3");
    }
  }
}
