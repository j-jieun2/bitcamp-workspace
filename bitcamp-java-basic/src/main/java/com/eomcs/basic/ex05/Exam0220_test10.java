package com.eomcs.basic.ex05;


public class Exam0220_test10 {
  public static void main(String[] args) {
    double d1 = 987.6543;
    double d2 = 1.111111;
    System.out.println((d1 + d2) == 988.765411);
    // 결과는 false.
    // 이유?
    // 부동소수점 값을 연산할 때 IEEE 754에 따라
    // 작업을 수행하는 과정에서 값을 왜곡함.
    
    System.out.println(d1 + d2); // 988.7654110000001
    
    double x = 234.765411;
    double y = 754.9;
    System.out.println((x + y) == 988.765411);
    System.out.println(x + y); // 989.665411
    // 왜곡없이 정확한 값으로 출력되나 false.
    
    System.out.println((d1 + d2) == (x + y)); // false
    
    double EPSILON = 0.00001;
    System.out.println(Math.abs((d1 + d2)- (x + y)) < EPSILON);
    
    
  }
}
