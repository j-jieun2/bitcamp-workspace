package com.eomcs.basic.test;

import java.util.Scanner;

/* 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며,
 * 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다.
 * 테스트 케이스 번호는 1부터 시작한다.
 *
 * 5
 * 1 1
 * 2 3
 * 3 4
 * 9 8
 * 5 2
 *
 * Case #1: 2
 * Case #2: 5
 * Case #3: 7
 * Case #4: 17
 * Case #5: 7
 */
public class Javaclass025 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("입력? ");
    int c = sc.nextInt(); // case 숫자 입력 할 스캐너.

    for (int i = 1; i <= c; i++) { // i는 1, i는 c보다 작거나 같다.
      // 5를 c에 입력함. 1부터 5까지 증가함.
      System.out.print("입력? ");
      int a = sc.nextInt();
      System.out.print("입력? ");
      int b = sc.nextInt();
      System.out.println("Case #" + i + ": " + (a + b));
    }
    sc.close();
  }
}
