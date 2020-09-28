package com.eomcs.basic.test;

import java.util.Scanner;

/* n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * 1부터 n까지 합을 출력한다.
 * 예제1) 입력 3 출력 6
 */
public class Javaclass016 {
  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);

    System.out.print("입력? ");
    int n = keyInput.nextInt(); // int n에 숫자를 입력 받는다.
    int sum = 0; // int sum에 정수 0으로 초기화

    // for문 - 반복문
    // int i = 1로 초기화; i는 보다 작거나 같다. i 증가(1,2,3);
    for (int i = 1; i <= n; i++) {
    sum += i;
    // sum += 1
    // sum += 2
    // sum += 3
    // sum = 6 초기화
    }
    System.out.println(sum); // sum 출력
    keyInput.close();
  }
}