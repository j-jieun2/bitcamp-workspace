// 다차원 배열
package com.eomcs.basic.test;

public class Javatest066 {
  public static void main(String[] args) {

   int max = 0;
   int[] array = {1, 5, 3, 8, 22};

   for (int i = 0; i < array.length; i++) {
     if (max < array[i]) {
       max = array[i];
     }
   }
   System.out.println("max : " + max);
  }
}