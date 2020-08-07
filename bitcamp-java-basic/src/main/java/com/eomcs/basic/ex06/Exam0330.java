// 반복문: while (조건) 문장;
// do 문장 while(조건);
package com.eomcs.basic.ex06;

public class Exam0330 {
  public static void main(String[] args) {
    int x = 2, y = 1;

    // 5 * 5 까지만 출력하라!

    while (x <= 9) { // x = 9까지
      while (y <= 9) { // y = 9까지
        System.out.printf("%d x %d = %d\n", x, y, x * y);
        if (x == 5 && y == 5)
          break; // 이 break는 자신이 소속된 가장 가까운 반복문을 나간다.
        y++;
      }
      System.out.println();
      x++;
      y = 1; // y가 1부터 다시 시작할수있도록 초기화해줌
             // 10이 되면 반복문이 종료되어 9단까지 실행할 수 없음.
    }
    System.out.println("종료!");
  }
}
