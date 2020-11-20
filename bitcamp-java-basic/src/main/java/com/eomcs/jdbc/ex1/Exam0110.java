package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0110 {
  public static void main(String[] args) {
    try {
      java.sql.Driver mariadbDriver = new org.mariadb.jdbc.Driver();
      java.sql.Driver oracleDriver = new oracle.jdbc.driver.OracleDriver();
      java.sql.Driver mssqlDriver = new com.microsoft.sqlserver.jdbc.SQLServerDriver();

      // 2) Driver 인스턴스를 드라이버 관리자에 등록한다.
      DriverManager.registerDriver(mariadbDriver);
      DriverManager.registerDriver(oracleDriver);
      DriverManager.registerDriver(mssqlDriver);
      System.out.println("JDBC 드라이버 로딩 및 등록 완료!");

      // DriverManager에 등록된 Driver 인스턴스를 확인해보자!
      // => DriverManager.getDriver(jdbcUrl);
      // => jdbcUrl
      // jdbc:[DBMS]://서버주소:포트번호/데이터베이스명
      java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb://");
      System.out.println(driver);

      java.sql.Driver driver2 = DriverManager.getDriver("jdbc:oracle:thin://");
      System.out.println(driver2);

      java.sql.Driver driver3 = DriverManager.getDriver("jdbc:sqlserver://");
      System.out.println(driver3);


    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
