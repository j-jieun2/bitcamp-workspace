package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    class Project {
      int no;
      String title;
      String content;
      Date startDate;
      Date endDate;
      String owner;
      String members;
    }
    final int LENGTH = 100;
    Project[] project = new Project[LENGTH];

    Scanner keyInput = new Scanner(System.in);

    System.out.println("[프로젝트]");
    int count = 0;


    for (int i = 0; i < LENGTH; i++) {
      count++;

    Project m = new Project();

    System.out.print("번호? ");
    m.no = keyInput.nextInt(); // 번호 1201 출력하고 엔터키가 남는다
    keyInput.nextLine(); // 엔터를 읽는다.

    System.out.print("프로젝트명? ");
    m.title = keyInput.nextLine();

    System.out.print("내용? ");
    m.content = keyInput.nextLine();

    System.out.print("시작일? ");
    m.startDate = Date.valueOf(keyInput.nextLine());

    System.out.print("종료일? ");
    m.endDate = Date.valueOf(keyInput.nextLine());

    System.out.print("만든이? ");
    m.owner = keyInput.nextLine();

    System.out.print("팀원? ");
    m.members = keyInput.nextLine();

    System.out.println();

    project[i] = m;

    System.out.print("계속 입력하시겠습니까?(y/N)");
    String response = keyInput.nextLine();
    if(!response.equalsIgnoreCase("y")) // 응답이 y가 아니라면 멈춰라.
      break;

    System.out.println();

    }

    keyInput.close();

    System.out.println("--------------------------------------------");

    for (int i = 0; i < count; i++) {
      Project m = project[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          m.no,
          m.title,
          m.startDate,
          m.endDate,
          m.owner);
    }
  }
}

