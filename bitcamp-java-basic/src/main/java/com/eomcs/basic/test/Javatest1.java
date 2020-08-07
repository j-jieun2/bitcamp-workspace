

package com.eomcs.basic.test;

public class Javatest1 {
  public static void main(String[] args) {
    int value;
    // int result = valeu + 10;
    //System.out.println(result);
    // 변수값을 지정하지않고는 출력이 불가함.

    int hour = 3;
    int minute = 5;
    System.out.println(hour + "시간" + minute + "분"); // 3시간 5분

    int totalMinute = (hour * 60) + minute;
    System.out.println("총" + totalMinute + "분"); // 총 185분

    int x = 3;
    int y = 5;
    System.out.println("x:" + x + "y:" + y); // x = 3 y = 5

    int temp = x;
    x = y;
    y = temp;
    System.out.println("x:" + x + "y:" + y); // x = 5 y = 3


  }
}