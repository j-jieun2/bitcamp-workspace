// DataByteArrayInputStream 을 사용하기 - 바이트 배열에서 String, int, boolean 값 읽기
package com.eomcs.io.ex07.ex07_;

public class Exam0220 {
  public static void main(String[] args) throws Exception {
    byte[] buf =  {
        0x0b, 0x41, 0x42, (byte) 0xea, (byte) 0xb0, (byte) 0x80, (byte) 0xea, (byte) 0xb0,
        (byte) 0x81, (byte) 0xea, (byte) 0xb0, (byte) 0x84, 0x00, 0x00, 0x00, 0x1b, 0x01};

    // 바이트 배열에서 데이터를 읽는 도구
    DataByteArrayInputStream in = new DataByteArrayInputStream(buf);

    Member member = new Member();

    member.name = in.readUTF();
    member.age = in.readInt();
    member.gender = in.readBoolean();

    in.close();

    System.out.println(member);
  }
}
