package com.eomcs.basic.ex05;


public class Exam0411_test24 {
  public static void main(String[] args) {

      int a = -0x7f_ff_ff_fa; //  0111 1111_1111 1111_1111 1111_1111 1010
                              //  1000 0000 0000 0000 0000 0000 0000 0110
                              //                                     
      System.out.println(a); // -21_4748_3642
      System.out.println(a << 1);
      //   1000 0000 0000 0000 0000 0000 0000 0110
      // 1|0000 0000 0000 0000 0000 0000 0000 0110
      
      System.out.println(a << 2);
      System.out.println(a << 3);
      System.out.println(a << 4);
  }
}
