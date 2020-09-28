// 다차원 배열
package com.eomcs.basic.test;

public class Javatest065 {
  public static void main(String[] args) {

    int[][] array = { // 3행 5열
      {95, 86},
      {83, 92, 96},
      {78, 83, 93, 87, 88}
    };

    int sum = 0;
    double avg = 0.0;

    int count = 0;
    for (int i = 0; i < array.length; i++) { // 3
      for (int y = 0; y < array[i].length; y++) {
        // array[0].length
        // array[1].length
        // array[2].length
        sum += array[i][y];
        count++;
      }
    }

    avg = (double) sum / count;

    System.out.println("sum : " + sum);
    System.out.println("avg : " + avg);
  }
}