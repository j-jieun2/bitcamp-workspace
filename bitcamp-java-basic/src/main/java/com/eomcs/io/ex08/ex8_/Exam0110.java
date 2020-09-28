// 포함 관계로 기능 확장하기 - ByteArrayInpuStream + DataInputStream
package com.eomcs.io.ex08.ex8_;

import java.io.ByteArrayInputStream;

public class Exam0110 {
  public static void main(String[] args) throws Exception {
    byte[] buf = {
        0x0b, 0x41, 0x42, (byte) 0xea, (byte) 0xb0, (byte) 0x80, (byte) 0xea, (byte) 0xb0,
        (byte) 0x81, (byte) 0xea, (byte) 0xb0, (byte) 0x84, 0x00, 0x00, 0x00, 0x1b, 0x01};

    // 바이트 배열을 읽는 것은 ByteArrayInputStream 에게 맡긴다.
    ByteArrayInputStream in = new ByteArrayInputStream(buf);

    // 문자열, int, long, boolean 값을 읽는 것은 DataInputStream 에 맡긴다.
    // => DataInputStream에 ByteArrayInputStream을 포함시킨다.
    DataInputStream in2 = new DataInputStream(in);

    Member member = new Member();

    member.name = in2.readUTF();
    member.age = in2.readInt();
    member.gender = in2.readBoolean();

    in.close();

    System.out.println(member);
  }
}
