package com.eomcs.basic.ex05;


public class Exam0412_test25 {
  public static void main(String[] args) {
        
    System.out.println(3 << 1);
    //   00000000 00000000 00000000 00000011 = 3
    // 0|00000000 00000000 00000000 00000110 = 1칸 비트 이동 6
    
    System.out.println(3 << 33); // 나머지 값 1
    System.out.println(3 << 65); // 나머지 값 1
    System.out.println(3 << 97); // 나머지 값 1
    // int 값의 비트 이동은 0~31까지 유효
    // 31을 넘을 경우 32로 나눈 나머지 값만큼 이동
    System.out.println(33%32);
    
  }
}
