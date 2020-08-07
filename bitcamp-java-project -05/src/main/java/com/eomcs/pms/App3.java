package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;


public class App3 {

  public static void main(String[] args) {
    System.out.println("[작업]");

    Scanner keyInput = new Scanner(System.in);


    final int LENGTH = 100;

    int[] no = new int[LENGTH]; // 번호?
    String[] content = new String[LENGTH]; // 내용?
    Date[] deadline = new Date[LENGTH]; // 완료일?
    String[] owner = new String[LENGTH]; // 담당자?
    String[] status = new String[LENGTH]; // 상태?

    int count = 0;

    System.out.print("프로젝트? ");
    String project = keyInput.nextLine();
    System.out.println();


    for (int i = 0; i < LENGTH; i++) {

      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyInput.nextLine());

      System.out.print("내용? ");
      content[i] = keyInput.nextLine();

      System.out.print("완료일? ");
      deadline[i] = Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");

      status[i] = keyInput.nextLine();

      System.out.print("담당자? ");
      owner[i] = keyInput.nextLine();

      count++;
      System.out.println();

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String str = keyInput.nextLine();
      if (!str.equalsIgnoreCase("y")) {
        break;
    }

    }
    keyInput.close();

    for (int i = 0; i < count; i++); {
      switch (status[i]) {
        case "1":
          System.out.println("진행중");
          break;
        case "2":
          System.out.println("완료");
          break;
        default:
          System.out.println("신규");

      System.out.printf("%d, %s, %s, %s, %s\n",
          project[i]], no[i], content[i], completedDate[i], state[i], worker[i]);
      System.out.println("-----------------------------");
        } */
      }
    }
  }
