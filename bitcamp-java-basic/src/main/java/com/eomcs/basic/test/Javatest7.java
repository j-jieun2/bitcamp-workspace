

package com.eomcs.basic.test;

public class Javatest7 {
  public static void main(String[] args) {
    // float var1 = 3.14; 컴파일 오류, float 실수 타입에는 f를 붙여줘야 저장 가능함
    float var2 = 3.14f;
    double var3 = 3.14;

    float var4 = 0.1234567890123456789f;
    double var5 = 0.1234567890123456789;

    System.out.println("var2: " + var2);
    System.out.println("var3: " + var3);
    System.out.println("var4: " + var4);
    System.out.println("var5: " + var5);

    double var6 = 3e6;
    float var7 = 3e6F;
    double var8 = 2e-3;

    System.out.println("var6: " + var6);
    System.out.println("var7: " + var7);
    System.out.println("var8: " + var8);
  }
}