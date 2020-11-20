package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0141 {
  public static void main(String[] args) {

    // 현재 jdbc.drivers에 등록된
    System.out.printf("jdbc.drivers=%s\n", System.getProperty("jdbc.drivers"));
    try {
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
