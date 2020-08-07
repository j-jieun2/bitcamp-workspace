package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;


public class App3 {

  public static void main(String[] args) {
    class Task {
      String project;
      int no;
      String content;
      Date completedDate;
      String state;
      String worker;
    }

    final int LENGTH = 100;
    Task[] task = new Task[LENGTH];
    Scanner keyInput = new Scanner(System.in);

    int count = 0;

    System.out.println("[작업]");

    /* for (int i = 0; i < 100; i++) {

      count++;*/

    for (int i = 0; i < LENGTH; i++) {
      Task t = new Task();
      count++;

      System.out.print("프로젝트? ");
      t.project = keyInput.nextLine();

      System.out.print("번호? ");
      String str = keyInput.nextLine();
      t.no = Integer.parseInt(str);

      System.out.print("내용? ");
      t.content = keyInput.nextLine();

      System.out.print("완료일? ");
      t.completedDate = Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");

      t.state = keyInput.nextLine();

      System.out.print("담당자? ");
      t.worker = keyInput.nextLine();

      /*
      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String str = keyboardScan.nextLine();
      if (!str.equalsIgnoreCase("y")) {
        break; */

      task[i] = t;

        System.out.print("계속 입력하시겠습니까?(y/N) ");
        String response = keyInput.nextLine();
        if (!response.equalsIgnoreCase("y"))
          break;
    }

    keyInput.close();
    for (int i = 0; i < count; i++) {
      Task t = task[i];
      String stateTitle;
      switch (t.state) {
        case "0":
          stateTitle = "신규";
          break;
        case "1":
          stateTitle = "진행중";
          break;
        default:
          stateTitle = "완료";
      }
      System.out.printf("%d, %s, %s, %s, %s\n",
          t.no,
          t.content,
          t.completedDate,
          stateTitle,
          t.worker);
    }

    /* for (int i = 0; i < count; i++); {
       switch (stateTitle) {
        case "0":
          System.out.println("신규");
          break;
        case "1":
          System.out.println("진행중");
          break;
        default:
          System.out.println("완료");

      System.out.printf("%d, %s, %s, %s, %s\n",
          project[i]], no[i], content[i], completedDate[i], state[i], worker[i]);
      System.out.println("-----------------------------");
        }
      }*/
    }
  }
