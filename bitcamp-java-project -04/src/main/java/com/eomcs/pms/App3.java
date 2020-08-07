package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;


public class App3 {

  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);

    final int LENGTH = 100;
    String[] project = new String[LENGTH]; // 프로젝트?
    int[] no = new int[LENGTH]; // 번호?
    String[] content = new String[LENGTH]; // 내용?
    Date[] completedDate = new Date[LENGTH]; // 완료일?
    String[] state = new String[LENGTH]; // 상태?
    String[] worker = new String[LENGTH]; // 담당자?

    int count = 0;

    System.out.println("[작업]");


    for (int i = 0; i < LENGTH; i++) {

      count++;
      System.out.print("프로젝트? ");
      project[i] = keyInput.nextLine();

      System.out.print("번호? ");
      String str = keyInput.nextLine();
      no[i] = Integer.parseInt(str);

      System.out.print("내용? ");
      content[i] = keyInput.nextLine();

      System.out.print("완료일? ");
      completedDate[i] = Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");

      state[i] = keyInput.nextLine();

      System.out.print("담당자? ");
      worker[i] = keyInput.nextLine();
    }

    keyInput.close();

    for (int i = 0; i < count; i++); {
      switch (state) {
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
      }
    }
  }
