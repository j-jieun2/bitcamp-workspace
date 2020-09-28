package com.eomcs.basic.test;

import java.util.Arrays;
/* N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
 * 둘째 줄부터 N개의 줄에는 숫자가 주어진다.
 * 이 수는 절댓값이 1,000보다 작거나 같은 정수이다.
 * 수는 중복되지 않는다.
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * 5
 * 5
 * 2
 * 3
 * 4
 * 1
 *
 * 1
 * 2
 * 3
 * 4
 * 5
 */
import java.util.Scanner;

public class Javaclass028 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력 메소드
    System.out.print("입력? ");
    int n = sc.nextInt();
    int arr[] = new int[n]; // 배열의 갯수 입력

    for (int i = 0; i < n; i++) {
      System.out.print("배열 입력? ");
      arr[i] = sc.nextInt(); // 배열 입력
    }

    // 정렬 메소드
    Arrays.sort(arr);

    for (int a : arr) {
      System.out.println(a + " ");
    }
  }
}
