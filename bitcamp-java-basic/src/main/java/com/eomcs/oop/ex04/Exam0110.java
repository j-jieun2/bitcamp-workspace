package com.eomcs.oop.ex04;

public class Exam0110 {
  public static void mian(String[] args) throws Exception {

    String s2 = new String("Hello");

    char[] chars = new char[] {'H', 'e', 'l','l', 'o'};
    String s3 = new String(chars);
    System.out.println("=> " + s3);

    byte[] bytes = new byte[] {
        0x41, // A
        0x42, // B
        (byte) 0xEA, // 가 ==> AC00
        (byte) 0xB0,
        (byte) 0x80,
        (byte) 0xEA, // 각 ==> AC01
        (byte) 0xB0,
        (byte) 0x81,
    };
    String s4 = new String(bytes, "UTF-8");
    System.out.println("=>" + s4);

    byte[] bytes2 = new byte[] {
        0x41, // A
        0x42, // B
        (byte) 0xB0, // 가 ==> AC00
        (byte) 0xA1,
        (byte) 0xB0, // 각 ==> AC01
        (byte) 0xA2,
        (byte) 0xB6, // 똘 (EUC-KR)
        (byte) 0xCA,
        (byte) 0x8C, // 똠 (MS949/CP949)
        (byte) 0x63,
        (byte) 0xB6, // 똥 ( EUC-KR)
        (byte) 0xCB
    };
    String s5 = new String(bytes2, "MSM949"); // MS949 = EUC-KR(
    System.out.println("=>" + s5);
  }
}

// UTF-8? // ICS2(UTF-16) == UTF - 8
// 비트 암호
// 문자 ---> 암호
// A    ---> 1
// B    ---> 2
// C    ---> 3
// 가    ---> 100
// 각    --- > 101

// 다음 암호를 원래의 문자로 표현하시오!
// 1 --> A
// 5 --> E
// 7 --> G
// 100 --> 가
// 101 --> 각
