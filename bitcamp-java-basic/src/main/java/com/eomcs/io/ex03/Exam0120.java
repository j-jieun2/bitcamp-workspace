// character stream - 문자 단위로 읽기
package com.eomcs.io.ex03;

import java.io.FileReader;

public class Exam0120 {

  public static void main(String[] args) throws Exception {
    // 1) 파일의 데이터를 읽을 객체를 준비한다.
    FileReader in = new FileReader("sample/utf8.txt"); // 41 42 ea b0 81 ea b0 81

    // 2) JVM 환경 변수 'file.encoding'에 설정된 문자코드표에 따라
    //    바이트를 읽어서 UCS2로 바꾼 후에 리턴한다.

    // 현재 JVM 환경 변수 'file.encoding' 값
    System.out.printf("file.encoding = %s\n", System.getProperty("file.encoding"));

    // file.encoding이 UTF-8로 되어있다면,
    // => 영어는 1바이트를 읽어서 2바이트 UCS2로 변환한다.
    int ch1 = in.read(); // 41 => 0041 ('A')
    int ch2 = in.read(); // 42 => 0041 ('B')

    // => 한글은 3바이트를 읽어서 2바이트 UCS2로 변환한다.
    int ch3 = in.read(); // ea b0 80 => ac00 ('가')
    int ch4 = in.read(); // ea b0 81 => ac01 ('각')

    // 3) 읽기 도구를 닫는다.
    in.close();

    System.out.printf("%x, %x, %x, %x\n", ch1, ch2, ch3, ch4);
  }
}






