package com.eomcs.basic.ex06;

import java.util.Scanner;

public class Exam0210 {
  public static void main(String[] args) {
    Scanner KeyScan = new Scanner(System.in);

    System.out.println("[지원부서]");
    System.out.println("1. S/W개발");
    System.out.println("2. 일반관리");
    System.out.println("3. 시설관리");
    System.out.print("지원 분야의 번호를 입력하세요? ");
    int no = KeyScan.nextInt();

    System.out.println("제출하실 서류는 다음과 같습니다.");
    if (no == 1) {
      System.out.println("정보처리자격증");
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (no == 2) {
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (no ==3) {
      System.out.println("이력서");
    } else {
      System.out.println("올바른 번호를 입력하세요!");
    }

    KeyScan.close();

    final int DEVELOPER = 1;
    final int GENEARL_MANAGER = 2;
    final int BUILDING_MANAGER = 3;
    int type = GENEARL_MANAGER;

    if (type == DEVELOPER) {
      System.out.println("정보처리자격증");
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == GENEARL_MANAGER) {
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == BUILDING_MANAGER) {
      System.out.println("이력서");
    } else {
      System.out.println("잘못된 지원입니다.");
    }

    System.out.println("-----------------------------");

    switch (type) {
      case DEVELOPER :
        System.out.println("정보처리자격증");
      case GENEARL_MANAGER :
        System.out.println("졸업증명서");
      case BUILDING_MANAGER :
        System.out.println("이력서");
        break;
      default:
        System.out.println("잘못된 지원입니다.");

    }
    System.out.println("-----------------------------");

    int score = 70;

    switch (score) {
      case 100:
      case 90:
      System.out.println("A");
      break;
      case 80:
      case 70:
        System.out.println("B");
        break;
      case 60:
      case 50:
        System.out.println("C");
        break;
      default:
      System.out.println("F");

    }

    System.out.println("-----------------------------");

    String value = "dvevloper";
    final String value2 = "dvevloper2";

    switch (value) { // 4byte 이하 정수(byte, short, int, char), 문자열
      case value2:
        break;
      case "dvevloper":
        break;
      case "manager":
        break;
      case "ok" + "haha":
        break;
        default:
    }

    int value3 = 100;
    final int x = 200;

    switch (value3) {
      case 100:
        break;
      case 100 + 3:
        break;
      case x:
      break;
      case x + 3:
      default:
    }

    System.out.println("-----------------------------");


    Job type2 = Job.DEV;
    switch (type2) {
      case DEV:
        break;
      case GM:
        break;
      case BM:
        break;
    }

  }

  enum Job {
    DEV, GM, BM
  }

}
