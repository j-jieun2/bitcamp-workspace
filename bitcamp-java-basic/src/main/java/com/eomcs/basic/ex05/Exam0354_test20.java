package com.eomcs.basic.ex05;


public class Exam0354_test20 {
  public static void main(String[] args) {
    int pixel = 0x003f4478;
    // pixel
    //  00000000_00111111_01000100_01111000
    //& 00000000_00000000_11111111_11111111
    //  ------------------------------------
    //  00000000_00000000_01000100_01111000
    
    System.out.println(pixel & 0x0000ffff);
    
    
  }
}
