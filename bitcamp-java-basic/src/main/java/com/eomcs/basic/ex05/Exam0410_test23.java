package com.eomcs.basic.ex05;


public class Exam0410_test23 {
  public static void main(String[] args) {
      int i = 1;
      System.out.println(i << 1);
      System.out.println(i << 2);
      System.out.println(i << 3);
      System.out.println(i << 4);
 
     i = 0b0000_1011; // 11
     System.out.println(i << 1);
     System.out.println(i << 2);
     System.out.println(i << 3);
     
     String s1 = "abc";
     String s2 = "가나다";
     String s3 = "a가a";
     System.out.println(s1.length());
     System.out.println(s2.length());
     System.out.println(s3.length());
  }
}
