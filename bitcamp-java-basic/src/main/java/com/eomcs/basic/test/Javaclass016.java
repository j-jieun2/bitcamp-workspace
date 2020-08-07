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
    int n = keyInput.nextInt();
    int sum = 0;

    for (int i = 1; i <= n; i++) {
    sum += i;
    }
    System.out.println(sum);
  }
}