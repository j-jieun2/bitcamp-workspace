package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

// 1) 명령 프롬프트를 출력한다
// 2) 명령어를 입력 받아 출력한다
public class App {
  static Scanner keyInput = new Scanner(System.in);

  // 회원
  static final int LENGTH = 5;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tel = new String[LENGTH];
  static Date[] now = new Date[LENGTH];
  static long currentMillis = 0;
  static int count = 0;

  // 프로젝트
  static final int PLENGTH = 100;
  static int[] pno = new int[PLENGTH];
  static String[] ptitle = new String[PLENGTH];
  static String[] pcontent = new String[PLENGTH];
  static Date[] pstartDate = new Date[PLENGTH];
  static Date[] pendDate = new Date[PLENGTH];
  static String[] powner = new String[PLENGTH];
  static String[] pmembers = new String[PLENGTH];
  static int pcount = 0;

  // 작업
  static final int TLENGTH = 100;
  static int[] tno = new int[TLENGTH];
  static String[] tcontent = new String[TLENGTH];
  static Date[] tdeadline = new Date[TLENGTH];
  static String[] towner = new String[TLENGTH];
  static int[] tstatus = new int[TLENGTH];
  static int tcount = 0;

  public static void main(String[] args) {




    loop:
      while (true) {
        String command = promptString("명령> ");

        switch (command.toLowerCase()) {
          case "/member/add":
            addMember();
            break;
          case "/member/list":
            listMember();
            break;
          case "/project/add":
            addProject();
            break;
          case "/project/list":
            listProject();
            break;
          case "/task/add":
            addTask();
            break;
          case "/task/list":
            listTask();
            break;
          case "exit":
          case "quit":
            System.out.println("안녕!");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }

        System.out.println();

      }
  keyInput.close();
  System.out.println("종료!");
  }

  static void addMember() {
    System.out.println("[회원 등록]");

    no[count] = promptInt("번호? ");
    name[count] = promptString("이름? ");
    email[count] = promptString("이메일? ");
    password[count] = promptString("암호? ");
    photo[count] = promptString("사진? ");
    tel[count] = promptString("전화? ");
    now[count] = new Date(System.currentTimeMillis());

    count++;
  }

  static void listMember() {
    System.out.println("[회원 목록]");

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          no[i],
          name[i],
          email[i],
          password[i],
          photo[i],
          tel[i],
          now[i].toString());
    }
  }
  static void addProject() {
    System.out.println("[프로젝트 등록]");

    pno[pcount] = promptInt("번호? ");
    ptitle[pcount] = promptString("프로젝트명? ");
    pcontent[pcount] = promptString("내용? ");
    pstartDate[pcount] = promptDate("시작일? ");
    pendDate[pcount] = promptDate("종료일? ");
    powner[pcount] = promptString("만든이? ");
    pmembers[pcount] = promptString("팀원? ");

    pcount++;
  }
  static void listProject() {
    System.out.println("[프로젝트 목록]");

    for (int i = 0; i < pcount; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          pno[i],
          ptitle[i],
          pstartDate[i],
          pendDate[i],
          powner[i] );
    }
  }
  static void addTask() {
    System.out.println("[작업 등록]");

    tno[tcount] = promptInt("번호? ");
    tcontent[tcount] = promptString("내용? ");
    tdeadline[tcount] = promptDate("마감일? ");
    tstatus[tcount] = promptInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
    towner[tcount] = promptString("담당자? ");

    tcount++;
  }
  static void listTask() {
    for (int i = 0; i < tcount; i++) {
      System.out.printf("%d, %s, %s, %s\n",
          tno[i],
          tcontent[i],
          tdeadline[i],
          towner[i]);
    }
  }

  static String promptString(String title) {
    System.out.print(title);
    return keyInput.nextLine(); // title String 값을 리턴하여 출력
  }

  static int promptInt(String title) {
    return Integer.parseInt(promptString(title)); // String 문자열을 int 숫자로 변환 후 리턴 출력
  }

  static Date promptDate(String title) {
    return Date.valueOf(promptString(title)); // String 문자열을 Date 값으로 변환 후 리턴 출력
  }
}