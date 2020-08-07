// 조건문
package com.eomcs.basic.ex06;

public class Exam0150 {
  public static void main(String[] args) {

    int age = 15;

    if (age >= 10)
      if(age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
    else
      System.out.println("미성년입니다.");

    System.out.println("----------------------------1");

    if (age >= 19)
      if(age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
      else
        System.out.println("미성년입니다.");

    System.out.println("----------------------------2");

    if (age >= 19) {
      if(age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
    } else
        System.out.println("미성년입니다.");
  }
}
