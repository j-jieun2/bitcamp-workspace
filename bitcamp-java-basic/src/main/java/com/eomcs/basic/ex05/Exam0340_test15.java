package com.eomcs.basic.ex05;


public class Exam0340_test15 {
  public static void main(String[] args) {
    
    boolean a = true;
    boolean b = false;
    boolean r = a || (b = true);
    // 계산 순서
    // r = a || ( b = true)
    // r = true || ( b = true)
    // || 연산자는 앞에서 이미 계산을 예측할 수 있기때문에
    // 괄호안에 b를 실행하지않음.
    // r = true || false
    // r = ture
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    
    a = true;
    b = false;
    r = a | ( b = true );
    // 계산 순서
    // r = ture | ( b = ture);
    // | 연산자는 앞에서 이미 결과를 예측할 수 있어도
    // 괄호까지 전부 실행함.
    // r = true | true
    // r = ture
    
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    
    
  }
}
