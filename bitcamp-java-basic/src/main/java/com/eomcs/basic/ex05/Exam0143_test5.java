package com.eomcs.basic.ex05;


public class Exam0143_test5 {
  public static void main(String[] args) {
    
    float f1 = 987.6543f;
    float f2 = 1.111111f;
    System.out.println(f1);
    System.out.println(f2);
  
    float r1 = f1 + f2; // 원래 나와야 할 값 - 988.765411
    System.out.println(r1);  // 출력된 값 - 988.7654
    // float 연산자는 최대 7자리까지 출력 가능
    // 7자리를 넘어간 숫자 11은 사라지게된다.
    
    // float에서 담지 못한 값을 double로 담아서 출력해보기.
    double r2 = f1 + f2; // 원래 나와야 할 값 - 988.765411
    System.out.println(r2); // 출력된 값 - 988.765380859375
    // 이미 float으로 연산되어 double으로 넘어가기때문에 
    // 왜곡된 값이 출력됨.
    
    // IEEE 754 이진수의 변환 문제로 인해
    // 4바이트 float 부동소수점을 8바이트 double 부동소수점으로 저장하는 과정에서
    // 왜곡이 발생함.
    // 처음부터 큰 수는 double으로 저장하여 출력하자.
    
    double d1 = 987.6543;
    double d2 = 1.111111;
    double r5 = d1 + d2;
    System.out.println(r5); // 출력된 값 - 988.7654110000001
    // 11 뒤에 붙은 극한의 수는 그냥 신경쓰지않고 잘라버린다.
    
    
    
  }
}
