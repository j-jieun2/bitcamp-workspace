package com.eomcs.basic.ex05;


public class Exam0141_test3 {
  public static void main(String[] args) {
    
    // 두 값을 계산했을 때 메모리 안에 담아질 경우 연산 가능
    // int를 float로 형변환하여 2.5를 r에 저장.
    int i = 5;
    int j = 2;
    
    float r = i / j;
    System.out.println(r);
    
    r = (float) i / (float) j;
    System.out.println(r);
    
    
  }
}
