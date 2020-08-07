package com.eomcs.basic.ex05;


public class Exam0142_test4 {
  public static void main(String[] args) {
      
    int x = Integer.MAX_VALUE; // 2147483647
    int y = Integer.MAX_VALUE; // 2147483647
    
    int r1 = x + y;
    
    System.out.println(r1); // -2가 출력됨
    // int가 포함되어있는 단위가 넘어가서 의도한 결과가 출력되지않음.
    
    long r2 = x + y;
    System.out.println(r2); // -2가 출력됨
    // x, y 연산 값은 4바이트 int 값임.
    // 연산된 int값을 long 8바이트 값에 저장하기때문에 정상출력이 되지않음
    
    // 크기가 넘어갈 것 같으면 큰 메모리에 담아 연산하라.
    long r3 = (long) x + (long) y;
    System.out.println(r3);
    
    // int + int = int
    // byte + byte = int
    // short + short = int
    // long + long = long >> int(4바이트)보다 더 큰 long(8바이트)로 저장됨
    // long + int = long // 위의 내용과 동일
    // int + float = float 
    // float + float = float
    // float + long = float
    // double + double = double
    // double + float = double
    // 
    
    
  }
}
