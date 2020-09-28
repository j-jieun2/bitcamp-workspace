package com.eomcs.basic.test;

// 배열의 데이터를 정렬하자.

public class Javaclass026 {
  public static void main(String[] args) {

    int a[] = {210, 19, 72, 129, 34}; // a에 해당 배열을 넣음
    int b = a.length; // a 배열의 갯수를 b에 넣음. {0, 1, 2, 3, 4}
    int i, j, k;

    System.out.println("데이터 표시");
    for (i = 0; i < b; i++) { // int i는 b(5, 배열의 갯수)까지 증가.
      System.out.println(a[i] + " ");
    }
    System.out.println();

    for (j = 0; j < b - 1; j++) { // int j는 b(5) - 1 보다 작다.
      // j는 0, 1, 2, 3, 4 까지 증가
      for (i = j + 1; i < b; i++) { // int i는 j + 1의 값이다. i는 b(5) 보다 작다.
        // i = 0 + 1, 1 + 1, 2 + 1, 3 + 1, 여기까지 출력 //4 + 1.
        if(a[j] > a[i]) {
          k = a[j]; // k(0) = a[j] // 210 19 72 129 34
          a[j] = a[i];  // a[i] // 19, 72, 129, 34
          a[i] = k; // a[i] // 19, 72, 129, 34 = k: 210 19 72 129 34
        }
      }
    }

    System.out.println("정렬 후");
    for (i = 0; i < b; i++) { //
      System.out.println(a[i] + " ");
    }
    System.out.println();
  }
}


