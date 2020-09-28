// character stream - 문자 단위로 출력하기
package com.eomcs.io.ex03.ex033;

import java.io.FileWriter;

public class Exam0110 {
  public static void main(String[] args) throws Exception {

    FileWriter out = new FileWriter("temp/test2.txt");

    System.out.printf("file.encoding = %s\n", System.getProperty("file.encodung"));

    out.write(0x7a6bac00);
    out.write(0x7a5f0041);
    out.close();
    System.out.println("출력 완료!");

  }
}
