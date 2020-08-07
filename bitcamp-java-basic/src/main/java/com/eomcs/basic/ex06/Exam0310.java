// 반복문: while (조건) 문장;
// do 문장 while(조건);
package com.eomcs.basic.ex06;

public class Exam0310 {
  public static void main(String[] args) {
    int count = 0;

    while (count < 5) System.out.println(count++);

    System.out.println("---------------------------");

    count = 0;
    while (count < 5)
      System.out.println(count++);

    System.out.println("---------------------------");

    count = 0;
    while (count < 5) {
      System.out.println(count);
      count++;
    }



//    int count = 0;
//    while (count++ < 20) {
//      if(count > 5) // ((count & 0x1) != 0)
//        break; // 즉시 현재 소속된 반복문을 멈춘다.
//        // continue; // 즉시 조건문으로 실행을 이동한다.
//      System.out.println(count);
//    }
//
//    /* while
//      int temp = count; // 0
//    boolean condition = temp < 10;
//    if (condition == true)
//      System.out.println("안녕"); */
//
//      int i = 0;
//
//      do {
//        System.out.println(i);
//        i++;
//      } while (i < 10);
  }
}
