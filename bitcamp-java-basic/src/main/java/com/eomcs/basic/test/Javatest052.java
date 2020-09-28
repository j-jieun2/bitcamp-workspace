// 수의 개수 n이 주어지고, 그 다음 줄에 무작위로 n개의 정수가 입력된다.
// n개의 수의 합을 출력하시오.
// 입력 - n은 자연수, 그 다음 줄에 n개의 정수들이 입력으로 들어온다. (n<=1000, 각 수는 0~100)
// 출력 - n개의 정수들의 합을 출력한다.
// 입력 예시
// 5
// 3 5 7 7 2
// 출력 예시
// 24

package com.eomcs.basic.test;

import java.util.Scanner;

public class Javatest052 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); // n에 입력 받을 수의 개수 입력 (5)
    int total = 0; // total 0으로 초기화

    for (int i = 1; i <= n; i++) {
      // i = 1로 초기화, i 값이 입력받은 n보다 작거나 같아질때까지 반복하여 실행된다.
      total = total + sc.nextInt();
      // sum = 0 으로 초기화 되어있음
      // 반복문이 실행됨.
      // i = 1
      //    - total = 0 + sc.nextInt 3 입력
      // i = 2
      //    - total(3) = 0 + sc.nextInt 5 입력
      // i = 3
      //    - total(8) = 0 + sc.nextInt 7 입력
      // i = 4
      //    - total(15) = 0 + sc.nextInt 7 입력
      // i = 5
      //    - total(22) = 0 + sc.nextInt 2 입력
      // i = 5, 입력받은 n과 같기때문에 반복문이 종료
    }
    System.out.println(total); // 반복문이 실행되면서 total에 초기화된 합계 출력
  }
}