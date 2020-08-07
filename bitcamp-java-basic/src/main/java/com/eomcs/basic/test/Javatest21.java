package com.eomcs.basic.test;

import java.util.Scanner;

/* (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 * 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 * 예제 출력 472 / 385
 * 2360
 * 3776
 * 1416
 * 181720
 */

public class Javatest21 {
  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);

    System.out.print("입력? ");
    int a = keyInput.nextInt();
    System.out.print("입력? ");
    int b = keyInput.nextInt();

    System.out.println(a * (b % 10)); // b를 10으로 나눈 나머지 - 5, 472 * 5
    System.out.println(a * ((b % 100) / 10)); // b를 100으로 나눈 뒤 나머지 85를 10으로 나누기
    // 나머지가 8.5가 남는데 int값이여서 소수점은 제거됨, 472 * 8
    System.out.println(a * (b / 100)); // 472 * 3
    System.out.println(a * b);

    keyInput.close();


  }
}