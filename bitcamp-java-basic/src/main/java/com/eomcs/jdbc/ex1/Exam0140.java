package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0140 {
  public static void main(String[] args) {

    System.out.printf("java.home=%s\n", System.getProperty("java.home"));
    System.out.printf("user.home=%s\n", System.getProperty("user.home"));

    System.setProperty("jdbc.drivers", "org.mariadb.jdbc.Driver:com.eomcs.jdbc.ex1.MyDriver");
    System.out.printf("jdbc.drivers=%s\n", System.getProperty("jdbc.drivers"));
    try {

      // DriverManager를 자동으로 로딩
      // jdbc:[DBMS]://서버주소:포트번호/데이터베이스명
      java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb://");
      System.out.println(driver);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
