// 반복문 종료, continue

package com.eomcs.basic.test;

public class Javatest046 {
  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
      if (i % 2 != 0) { // 만약 i %(나머지) 2 가 0이 아닐 경우
        continue; // 아래를 출력하지않고 for 문으로 이동
      }
      System.out.println(i); // 홀수는 실행되지않음
    }
  }
}

/* 반복문의 종류 - for, while, do - while
 *
 *
 */
