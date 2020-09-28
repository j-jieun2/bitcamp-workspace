package com.eomcs.basic.test;

import java.util.ArrayList;
import java.util.List;

public class Exam001 {
  static class ArrayListExample {

  public static void main(String[] args) {


      List<String> list = new ArrayList<String>();

      list.add("Java"); // String 객체를 저장
      list.add("JDBC");
      list.add("Sevlet/JSP");
      list.add(2, "Database");
      list.add("iBATIS");

      int size = list.size(); // 저장된 총 객체 수 얻기
      System.out.println("총 객체 수: " + size);
      System.out.println();

      String skill = list.get(2); // 2번 인덱스의 객체 얻기
      System.out.println("2: " + skill);
      System.out.println();

      for (int i = 0; i < list.size(); i++) { // 저장된 총 객체 수만큼 반복
        // 1. i는 0으로 초기화
        // 2. i는 0부터 list의 객체 수만큼 반복된다.
        // 3. 현재 list.size의 객체 수는 (0, 1, 2, 3, 4) 총 5개, i는 0부터 4까지 증가, 반복문을 실행하고 종료되며 i=5로 끝남.
        String str = list.get(i);
        System.out.println(i + " : " + str);
      }
      System.out.println(); // 반복문 종료마다 줄바꿈

      list.remove(2); // 2번에 저장된 인덱스 객체(Database) 삭제
      list.remove(2); // 2번에 저장된 인덱스 객체(Sevlet/JSP) 삭제
      list.remove("iBATIS");

      for (int i = 0; i < list.size(); i++) { // 저장된 총 객체 수만큼 반복
        // 1. i는 0으로 초기화
        // 2. i는 0부터 list의 객체 수 만큼 반복된다.
        // 3. 현재 list.size의 객체 수는(0, 1) 총 2개, i는 0부터 1까지 증가, 반복문을 실행하고 종료되며 i=2로 끝남
        String str = list.get(i);
        System.out.println(i + " : " + str);
      }
      System.out.println();
    }
  }
}
