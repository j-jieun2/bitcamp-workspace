

package com.eomcs.basic.test;

public class Javatest13 {
  public static void main(String[] args) {
    byte byteValue1 = 10;
    byte byteValue2 = 20;
    // byte byteValue3 = byteValue1 + byteValue2; 컴파일 에러, byte + byte는 int로 형변환됨
    int intValue1 = byteValue1 + byteValue2;
    System.out.println(intValue1);

    char charValue1 = 'A';
    char charValue2 = 1;
    // char charValue3 = charValue1 + charValue2; 컴파일 에러, char + char는 int로 형변환됨
    int intValue2 = charValue1 + charValue2;
    System.out.println("유니코드= " + intValue2);
    System.out.println("출력문자= " + (char)intValue2 ); // int에 저장된 값을 char로 강제형변환함

    int intValue3 = 10;
    int intValue4 = intValue3/4;
    System.out.println(intValue4);

    int intValue5 = 10;
    // int intValue6 = 10 / 4.0; 컴파일 오류, int값에는 실수를 사용할 수 없음.
    double doubleValue = intValue5 / 4.0;
    System.out.println(doubleValue);

    int x = 1;
    int y = 2;
    double result = (double) x / y;
    System.out.println(result);

  }
}