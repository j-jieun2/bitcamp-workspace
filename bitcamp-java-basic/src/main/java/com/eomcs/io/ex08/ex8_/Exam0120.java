// 포함 관계로 기능 확장하기 - FileInputStream + DataInputStream
package com.eomcs.io.ex08.ex8_;

import java.io.FileInputStream;

public class Exam0120 {
  public static void main(String[] args) throws Exception {
    // 바이트 배열 입력 스트림 대신 파일 입력 스트림으로 교체하기
    FileInputStream in = new FileInputStream("temp/test4.data");

    // 문자열, int, long, boolean 값을 읽는 것은 DataInputStream 에 맡긴다.
    // => DataInputStream에 DataInputStream을 포함시킨다.
    DataInputStream in2 = new DataInputStream(in);

    Member member = new Member();

    member.name = in2.readUTF();
    member.age = in2.readInt();
    member.gender = in2.readBoolean();

    in.close();

    System.out.println(member);
  }
}
