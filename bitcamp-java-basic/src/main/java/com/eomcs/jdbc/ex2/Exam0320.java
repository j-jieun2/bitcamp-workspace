package com.eomcs.jdbc.ex2;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Exam0320 {
  public static void main(String[] args) throws Exception {

    // DBMS 연결하기
    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");

        // 당장 select 할 때 파라미터 값을 넣지 않는다 하더라도,
        // 나중에 넣을 것을 대비해서 그냥 PreparedStatement를 사용하라!
        PreparedStatement stmt = con.prepareStatement(
            "select * from x_board order by board_id desc");
        java.sql.ResultSet rs = stmt.executeQuery();) {

      System.out.println("번호, 제목, 등록일, 조회수");
      // 반복문을 사용하여 서버에서 여러 개의 데이터를 가져올 수 있다.
      while (rs.next()) {
        System.out.printf("%d, %s, %s, %d\n",
        rs.getInt("board_id"),
        rs.getString("title"),
        rs.getDate("created_date"),
        rs.getInt("view_count"));
      }
    }
  }
}
