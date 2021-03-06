// 포함 관계로 기능 확장 하기 - FileInputStrem + BufferedInputStream
package com.eomcs.io.ex08.ex8_;

import java.io.FileInputStream;

public class Exam0210 {
  public static void main(String[] args) throws Exception {

    FileInputStream in = new FileInputStream("temp/jls11.pdf");

    // 기존의 FileInputStream에 버퍼 기능을 덧붙이기 위해서 상속 대신 포함하는 방식을 사용한다.
    // 다음 BufferedInputStream 은 FileInputStream을 포함한다.
    BufferedInputStream in2 = new BufferedInputStream(in);

    int b;

    long startTime = System.currentTimeMillis();

    int callCount = 0;
    while((b = in2.read()) != -1)
      callCount++; // 파일을 끝까지 읽는다.

    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);
    System.out.println(callCount);

    in.close();
  }
}
