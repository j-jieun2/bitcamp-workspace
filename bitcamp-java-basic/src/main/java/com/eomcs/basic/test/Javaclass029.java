package com.eomcs.basic.test;

import java.util.Scanner;

public class Javaclass029 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt(); // 5
    int[] arr = new int[N]; // arr {0, 1, 2, 3, 4}

    for(int i = 0; i < N; i++) {
        arr[i] = in.nextInt();
    }

    // select sort
    for(int i = 0; i < N - 1; i++) {
        for(int j = i + 1; j < N; j++) {
            if(arr[i] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }

    for(int val : arr) {
        System.out.println(val);
    }
  }
}
