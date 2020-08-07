package com.eomcs.basic.ex05;


public class Exam0352_test18 {
  public static void main(String[] args) {
    // % 연산자를 이용하여 짝수/홀수 알아내기
    System.out.println(57 % 2 == 0 ? "짝수" : "홀수");
    
    // & 연산자를 이용하여 짝수/홀수 알아내기
    System.out.println((57 & 0x01) == 0? "짝수" : "홀수");
    
    
  }
}
