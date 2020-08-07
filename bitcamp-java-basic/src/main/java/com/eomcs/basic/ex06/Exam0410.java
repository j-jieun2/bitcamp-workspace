// 반복문은 for
package com.eomcs.basic.ex06;

public class Exam0410 {
  public static void main(String[] args) {
    // for(변수 선언 및 초기화; 조건; 증감문) 문장;
    // for(변수 선언 및 초기화; 조건; 증감문) {문장; 문장; ....}

//    for (int i = 0; i < 10; i++) {
//      System.out.println("=> ");
//      System.out.println(i);
//    }
//      int i = 0;
//      for (;;) {
//        if (i >= 10)
//          break;
//        System.out.println("=> ");
//        System.out.println(i);
//        i++;
//     }
//      System.out.println(i);
//    int i;
//    for (i =0; i < 10; i++) {
//      System.out.println("=> ");
//      System.out.println(i);
//    }
//
//    i = 0;
//   System.out.println("---------------------");
//   while (i < 5) {
//     System.out.println("=>");
//     System.out.println(i);
//     i++;
//   }

    for (int i = 1, j = 2; i <= 10; i += 2, j += 2) {
      System.out.printf("=> %d, %d\n", i, j);
    }
  }
}
