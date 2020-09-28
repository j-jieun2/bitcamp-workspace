package com.eomcs.basic.test;
/* 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * 예제 입력) 5
 * *
 * **
 * ***
 * ****
 * *****
 */

import java.util.Scanner;

public class Javaclass032 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력 메소드
    System.out.print("텍스트 케이스를 입력하세요. ");
    int N = sc.nextInt(); // 5 입력

    // 출력 반복문
    for (int i = 0; i < N; i++) { // i는 n(5)만큼 출력한다.
      for(int y = 0; y <= i; y++) { // y는 i만큼 *를 출력한다
        // i[0] 일 때 y[0] 실행 * 찍고 y 반복문 종료 후 줄바꿈
        // i[1] 증가 y[1] 실행 * 찍고 y 반복문 종료 후 줄바꿈
        //
        System.out.print('*');
      }
      System.out.println();
    }
    sc.close();
  }
}
