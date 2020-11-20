package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0340 {
  public static void main(String[] args) throws Exception {

    // DBMS 연결하기
    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");

        java.sql.Statement stmt = con.createStatement();
        java.sql.ResultSet rs = stmt.executeQuery(
            // 최신 게시물 번호를 보려면 역순으로 정렬해야 한다.
            "select * from x_board order by board_id desc");
        ) {


      // 반복문을 사용하여 서버에서 여러 개의 데이터를 가져올 수 있다.
      while (rs.next()) {
        System.out.printf("%d, %s, %s, %s, %d\n",
        rs.getInt("board_id"),
        rs.getString("title"),
        rs.getString("contents"),
        rs.getDate("created_date"),
        rs.getInt("view_count"));
      }
    }
  }
}
