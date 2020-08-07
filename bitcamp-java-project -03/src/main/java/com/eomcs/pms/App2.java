package com.eomcs.pms;

import java.sql.Date;

public class App2 {

  public static void main(String[] args) {
    
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    

    System.out.print("[");
    System.out.print("프로젝트");
    System.out.println("]");

    System.out.print("번호? ");
    int no = keyInput.nextInt(); // 번호 1201 출력하고 엔터키가 남는다
    keyInput.nextLine(); // 엔터를 읽는다.

    System.out.print("프로젝트명? ");
    String title = keyInput.nextLine();

    System.out.print("내용? ");
    String content = keyInput.nextLine();

    System.out.print("시작일? ");
    java.sql.Date starDate = java.sql.Date.valueOf(keyInput.nextLine());
    
    System.out.print("종료일? ");
    java.sql.Date endDate = java.sql.Date.valueOf(keyInput.nextLine());
    
    System.out.print("만든이? ");
    String name = keyInput.nextLine();
    
    System.out.print("팀원? ");
    String tem = keyInput.nextLine();
    
    keyInput.close();
    
    System.out.println("-------------------------------------------------");
    System.out.printf("번호: %s\n", no);
    System.out.printf("프로젝트명: %s\n", title);
    System.out.printf("내용: %s\n", content);
    System.out.printf("시작일: %s\n", starDate.toString());
    System.out.printf("종료일: %s\n", endDate.toString());
    System.out.printf("만든이: %s\n", name);
    System.out.printf("팀원: %s\n", tem);
    
  }
}

    