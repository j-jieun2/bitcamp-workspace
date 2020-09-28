package com.eomcs.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
  public static void main(String[] args) throws Exception {
    write("문자 변환 스트림을 사용합니다.");
    String data = read();
    System.out.println(data);
  }

  public static void write(String str) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/test1.data");
    // FileOutputStream에 OutputStreamWriter 보조 스트림을 연결
    Writer writer = new OutputStreamWriter(out);
    // OutputStreamWriter 보조 스트림을 이용해서 문자 출력
    writer.write(str);
    writer.flush();
    writer.close();
  }

  public static String read() throws Exception {
    FileInputStream in = new FileInputStream("temp/test1.data");
    // FileInputStream에 InputStreamReader 보조 스트림을 연결
    Reader reader = new InputStreamReader(in);
    char[] buffer = new char[100];
    // InputStreamReader 보조 스트림을 이용해서 문자 출력
    int readCharNum = reader.read(buffer);
    // char 배열에서 읽은 수만큼 문자열로 변환
    String data = new String(buffer, 0, readCharNum);
    return data;
  }
}
