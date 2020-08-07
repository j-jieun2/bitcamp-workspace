package com.eomcs.basic.ex05;


public class Exam0150_test6 {
  public static void main(String[] args) {
   byte b = 1;
   short s = 2;
   int i = 3;
   long l = 4;
   float f = 5;
   double d = 6;
   boolean bool = true;
   char c = 7;
   
   // byte + byte = itn
   // 연산을 하기 전 byte 값이 int으로 형변환 된다.
   // byte r1 = b + b; // 컴파일 오류!
   // 작은 그릇에 더 큰 그릇을 담을 수 없다.
   
   // short + short = int
   // byte와 동일, int으로 암시적 형변환 된다.
   // 작은 그릇에 더 큰 그릇을 담을 수 없다.
   
   // btye + short = int 
   // byte와 short는 int로 암시적 형변환 된다.

   // byte + int = int
   // byte가 int로 암시적 형변환 후 연산을 수행한다.
   int r4 = b + i;
   
   // short + int = int
   // byte와 동일, short가 int로 암시적 형변환 후 연산을 수행한다.
   int r5 = s + i;
   
   // int + lont = long
   // int가 long으로 암시적 형변환 후 연산을 수행한다.
   // int는 4바이트, long은 8바이트 이므로 더 크다.
   // int r6 = l + i; // 컴파일 오류!
   
   // long + float = float 
   // long가 float으로 암시적 형변환 후 연산을 수행한다.
   // 정수는 부동소수점으로 변환된다.
   // long r7 = l + f; // 컴파일 오류!
   
   // int + float = float
   // int가 float으로 암시적 형변환 후 연산을 수행한다.
   // 정수는 부동소수점으로 변환된다.
   // int r8 = i + f; // 컴파일 오류!
   
   // float + double = double
   // float가 double으로 암시적 형변환 후 연산을 수행한다.
   // float r9 = f + d; // 컴파일 오류!
   
   // byte + short + int + long + float + double = double
   // long r10 = b + s + i + l + f + d; // 컴파일 오류!
   
   // float + int + long = float 
   // int와 long 이 float으로 암시적 형변환 후 연산을 수행한다.
   // 정수는 부동소수점으로 변환된다.
   
   // int + boolean = 컴파일 오류!
   // 산술 연산자는 정수타입(byte, short, int, long)와
   // 부동소수점(float, double)에 대해서만 실행할 수 있다.
   
  }
}
