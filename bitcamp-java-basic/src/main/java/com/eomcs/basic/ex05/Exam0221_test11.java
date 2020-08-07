package com.eomcs.basic.ex05;


public class Exam0221_test11 {
  public static void main(String[] args) {
    float f1 = 0.1f;
    float f2 = 0.1f;
    
    System.out.println(f1*f2); // 0.010000001 뒤에 0. 0000001 발생
    System.out.println(f1 * f2 == 0.01f); // false
    
    // 해결책
    // 오차를 제거한 후 비교
    // 다만 계산 결과를 절대값으로 만든 후 오차 이하의 값인지 비교하라.
    
    float r = f1 * f2 - 0.01f;
    // 연산 순서
    // r = float(0.01) * float(0.01) - float(0.01)
    // r = float(0.001) - float (0.01)
    // r =  float(0.01)
    System.out.printf("%f\n", Float.POSITIVE_INFINITY);
    
    
  }
}
