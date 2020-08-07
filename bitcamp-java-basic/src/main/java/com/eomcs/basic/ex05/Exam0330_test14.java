package com.eomcs.basic.ex05;


public class Exam0330_test14 {
  public static void main(String[] args) {
    boolean a = false;
    boolean b = false;
    boolean r = a && ( b = true);
    // 계산 순서
    // r = a && ( b = true);
    // r = false && ( b = true);
    // && 연산자는 a에서부터 이미 false이기때문에
    // 결과를 확정하였으므로 b는 실행하지않음
    // r = false;
    
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    
    a = false;
    b = false;
    r = a & (b = true);
    // 계산 순서
    // r = a & (b = true)
    // r = false & (b = true)
    // & 연산자는 결과를 예측할 수 있다 하더라도 
    // 결과에 상관없이 오른쪽 문장을 무조건 실행
    // r = false & (b = true) > b에 true 값 대입
    // r = false & true
    // r = false
    
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    
  }
}
