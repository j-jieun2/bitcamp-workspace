package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0360 {
  public static void main(String[] args) throws Exception {

    // DBMS 연결하기
    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");

        java.sql.Statement stmt = con.createStatement();) {

      System.out.println(stmt.getClass().getName());

      int count = stmt.executeUpdate(
          "delete from x_board where board_id = 4");
      System.out.printf("%d 개 삭제 성공!", count);

    }
  }
}
