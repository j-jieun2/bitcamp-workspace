package com.eomcs.basic.ex05;


public class Exam0130_test {
  public static void main(String[] args) {
    byte b;
    b = 5;
    b = 6;
    
    b = 5 + 6; // 연산을 할 때 int로 변경 됨
    System.out.println(b);
    
    byte x = 5, y = 6, z;
    z = x;
    z = y;
    // z = x + y; // 컴파일 오류!
    // "자바의 정수 연산은 최소 단위가 4바이트이다."
    // "그래서 byte나 short의 연산 단위가 기본으로 4바이트이다."
    
    short s1 = 5;
    short s2 = 6;
    short s3;
    s3 = s1;
    s3 = s2;
    // s3 = s1 + s2; // 컴파일 오류!
    // 연산할 때 4바이트로 변경되어있음.
    
    int s4 = s1 + s2; // 가능
    System.out.println(s4);
    
    
  }
}
