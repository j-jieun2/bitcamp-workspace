package com.eomcs.basic.ex05;


public class Exam0353_test19 {
  public static void main(String[] args) {
   
    int data = 0b1111_1001_0111_1111;
    System.out.println(Integer.toBinaryString(data & 0b0000_1111_1100_0000)); //100101000000
    //int data에 있는 2진수에서 xxxx_1111_x1xx_0000 해당 부분의 값이 1일 경우
    // true로 뽑아낸다.
    
    //   1111_1001_0111_1111
    // & 0000_1111_1100_0000
    //-----------------------
    //   0000_1001_0100_0000
    
    
  }
}
