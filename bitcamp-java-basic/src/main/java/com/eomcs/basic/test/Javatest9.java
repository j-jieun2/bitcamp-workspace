

package com.eomcs.basic.test;

public class Javatest9 {
  public static void main(String[] args) {
    byte byteValue = 10;
    int intvalue = byteValue;
    System.out.println("intValue: " + intvalue);

    char charValue = '가';
    int intValue = charValue;
    System.out.println("가의 유니코드: " + intValue);

    intValue = 50;
    long longValue = intValue;
    System.out.println("longValue: " + longValue);

    longValue = 100;
    float floatValue = longValue;
    System.out.println("falotValue: " + floatValue);

    floatValue = 100.5F;
    double doubleValue = floatValue;
    System.out.println("doubleValue" + doubleValue);
  }
}