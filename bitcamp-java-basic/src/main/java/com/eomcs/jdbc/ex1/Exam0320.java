package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0320 {
  public static void main(String[] args) throws Exception {

    // DBMS 연결하기
    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");

        java.sql.Statement stmt = con.createStatement();
        java.sql.ResultSet rs = stmt.executeQuery(
            // 최신 게시물 번호를 보려면 역순으로 정렬해야 한다.
            "select * from x_board order by board_id desc");) {


      // ResultsSet 객체를 사용하여 서버에서 selec의 결과를
      // 가져왔으면 true, 아니면 false
      boolean isReceived = rs.next();

      if (isReceived) {
        System.out.printf("%s, %s, %s, %s, %s\n",
            rs.getString(1), // board_id
            rs.getString(2), // title
            rs.getString(3), // context
            rs.getString(4), // creadted_date
            rs.getString(5)); // view_count
        // getString(컬럼번호);
        // => DBMS에 설정된 컬럼의 값을 문자열로 리턴한다.
        //    1번부터 시작한다.
      } else {
        System.out.println("서버에서 한 개의 레코드를 가져오지 못했다!");
      }
    }
  }
}
