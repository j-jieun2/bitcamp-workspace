// 조건문
package com.eomcs.basic.ex06;

public class Exam160_test2 {
  public static void main(String[] args) {
    int a[] = {210, 19, 72, 129, 34}; // 0, 1, 2, 3, 4
    int b = a.length;
    int i, j, k;

    System.out.println("데이터 표시");
    for (i = 0; i < b; i++) { // 0, 1, 2, 3, 4
      System.out.print(a[i] + " ");
      System.out.println();
    }

    for (j = 0; j < b-1; j++) { // 4, 3, 2, 1, 0
      for (i = j+1; i < b; i++) {
      if(a[j] > a[i]) {
        k = a[j];
        a[j] = a[i];
        a[i] = k;
        }
      }
    }

    System.out.println("정렬 후");
    for (i = 0; i < b; i++) {
      System.out.print(a[i] +" ");
      System.out.println();
    }
  }
}
