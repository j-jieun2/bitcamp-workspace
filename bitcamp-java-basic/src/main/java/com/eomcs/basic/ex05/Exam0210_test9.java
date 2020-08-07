package com.eomcs.basic.ex05;


public class Exam0210_test9 {
  public static void main(String[] args) {
  
    int a = 10;
    int b = 20;
    
    boolean r1 = a < b; // true
    
    // int r2 = a <  b; // 컴파일 오류!
    // 정수는 boolean 사용 불가
    
    System.out.println(a < b); // a는 b보다 다. true
    System.out.println(a <= b); // a는 b보다 작나 같다. true
    System.out.println(a > b); // a는 b보다 크다. false
    System.out.println(a >= b); // a는 b보다 크거나 같다. false
    System.out.println(a == b); // a는 b와 같다. false
    System.out.println(a != b); // a는 b와 같지않다. true
  }
}
