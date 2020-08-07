package com.eomcs.basic.test;

import com.eomcs.basic.util.Computer;

public class Javaclass002 {
// 반복문으로 배열 더하기
  public static void main(String[] args) {
    Computer myCom = new Computer();

    int[] valuse1 = {1, 2, 3};
    int result1 = myCom.sum1(valuse1);
    System.out.println("result1: " + result1);

    int result2 = myCom.sum1(new int[] {1,2,3,4,5});
    System.out.println("result2: "+ result2);

    int result3 = myCom.sum2(1, 2, 3);
    System.out.println("result3: "+ result3);

    int result4 = myCom.sum2(1, 2, 3, 4, 5);
    System.out.println("result4: " + result4);
  }
}