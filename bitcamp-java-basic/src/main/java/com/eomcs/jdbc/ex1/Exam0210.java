package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0210 {
  public static void main(String[] args) throws Exception {
    java.sql.Connection con = null;

    try {
      // DBMS 연결하기
       con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/studydb", // jdbcURL
          "study", // username
          "1111"); // password
      System.out.println("DBMS와 연결됨");

      System.out.println(con.getClass().getName());

    } finally {
      try {
        con.close();
        // 자원해제
        // => 파일과 마찬가지로 DBMS에 연결한 후 더이상 사용하지 않으면 연결을 해제해야 한다.
      } catch (Exception e) {

      }
      System.out.println("DBMS와 연결 해제됨!");
    }
  }
}
