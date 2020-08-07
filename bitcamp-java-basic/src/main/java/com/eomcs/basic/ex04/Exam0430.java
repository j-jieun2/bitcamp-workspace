package com.eomcs.basic.ex04;

public class Exam0430 {
  public static void main(String[] args) {
    char c; 
    
    c = 8;
    c = 65535;
    // c = -1;
    // c = 65536
    
    // 128 64 32 16 8 4 2 1
    c = 65; // 0100 0001
    c = 0x41;
    c = 0b01000001;
    System.out.println(c);
    
    short s = 65;
    System.out.println(s);
    
    c = '헐'; // '' 연산자는 문자의 유니코드 값을 리턴한다.
    System.out.println(c);
    
    int i = '헐'; 
    System.out.println(i);
    
    for (int x = 65; x < 80; x++) {
      System.out.println((char)x);
    }
    
    boolean b1, b2;
    b1 = true;
    b2 = false;
    
    System.out.println(b1);
    System.out.println(b2);
    
    // 논리 값은 정수로 다를 수 없다.
    //i = b1;
    //i = b2;
    //b1 = 1;
    
    }
  }
