// 중첩 for문
// for (1.초기화식; 2. 조건식; 4. 증감식) { // 해당 for문이 한번씩 실행될 때 마다 중첩 for문 실행
//          3. 실행문
//      for (1. 초기화식; 2. 조건식; 4. 증감식) { // 바깥 for문 한번 실행 시 지정된 횟수만큼 돌아간 뒤 바깥 for문으로 빠짐
//          3. 실행문
//
package com.eomcs.basic.test;

public class Javatest042 {
  public static void main(String[] args) {

    for (int m = 2; m <= 9; m++) { // 바깥쪽 for문
      System.out.println("*** " + m + "단 ***");
      // 바깥 for m(2)가  실행문으로 빠짐
      for (int n = 1; n <= 9; n++) { // 이중 for문
        // 바깥 for m(2) x n(1) ~ n(9)까지 실행 후 종료되면 다시 바깥 for문으로 이동
        // m(3) x n(1) ~ n(9)까지 반복  . . .
        System.out.println(m + " x " + n + " = " + (m * n));
      }
    }
  }
}