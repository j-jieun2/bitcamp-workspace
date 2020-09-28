// 반복문
// for (1.초기화식; 2. 조건식; 4. 증감식) {
//          3. 실행문!!!
// } 반복문 종료 후 false 일경우 해당 분을 실행
// 4. 증감식 이후 반복할 때 2. 조건식, 3. 실행문, 4. 증감식으로 반복한다.
package com.eomcs.basic.test;

public class Javatest041 {
  public static void main(String[] args) {
    int sum = 0;

    int i = 0;
    for (i = 1; i <= 100; i++) {
      sum += i;
    }

    System.out.println("1 ~ " + (i - 1) + " 합: " + sum);
    // (i - 1) - 루프 카운트 변수


    for (float x = 0.1f; x <= 1.0f; x+=0.1f) {
      System.out.println(x);
    }
  }
}