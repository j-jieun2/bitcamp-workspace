// Exam0410.java
// 주제: 문자 리터럴

package com.eomcs.basic.ex031;

public class Exam430 {
    public static void main(String[] args) {
      System.out.println(0x0041);
      System.out.println(0x41);
      System.out.println((char)0x41);
      System.out.println('A');
      System.out.println((int)'A');
      System.out.println('A' + 1);
      System.out.println((char)('A' + 1));
      
      for (int i = 'A'; i <= 'z'; i++) {
        System.out.println((char)i);
      }
    
    }
}
