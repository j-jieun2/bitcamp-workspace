// 반복문: while (조건) 문장;
// do 문장 while(조건);
package com.eomcs.basic.ex06;

public class Exam0331 {
  public static void main(String[] args) {
    int x = 2, y = 1;


    myloop:
      while (x <= 9) {
        while (y <= 9) {
          System.out.printf("%d x %d = %d\n", x, y, x * y);
          if (x == 5 && y == 5)
            break myloop; // myloop 라벨에 소속된 문장을 나간다.
          y++;;
        }
        System.out.println();
        x++;
        y = 1;
      }
    System.out.println("종료!");
  }
}
