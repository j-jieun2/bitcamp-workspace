// 조건문
package com.eomcs.basic.ex06;

public class Exam160_test {
  public static void main(String[] args) {
   int a = 60;

   if (a > 80) {
     if (a == 100)
       System.out.println("만점입니다!");
     else
       System.out.println("조금 더 노력하세요.");
   }
   else
     System.out.println("힘내세요!");

   int s = 0, i = 0;

   do {
     i = ++i;
     s = s + i;
   } while (i < 10); // 1, 2, 3, 4, 5, 6, 7, 8 , 9 까지 실행 후 10에서 조건멈춤
     System.out.printf("1에서 %d 까지의 합은 %d\n", i, s);
  }
}
