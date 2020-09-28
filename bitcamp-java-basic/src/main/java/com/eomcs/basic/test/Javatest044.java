// 반복문 종료

package com.eomcs.basic.test;

public class Javatest044 {
  public static void main(String[] args) {

    Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
      for (char lower = 'a'; lower <= 'z'; lower++) {
        System.out.println(upper + " - " + lower);
        if (lower == 'g') {
          break Outter;
        }
      }
    }
  System.out.println("반복문 실행 종료");
  }
}