// 서버 만들기
package com.eomcs.net.ex02.ex022;

import java.net.ServerSocket;
import java.util.Scanner;

public class Server0110 {
  public static void main(String[] args) throws Exception {
    // 중간에 실행을 잠깐 멈출 때 사용하기 위함
    Scanner keyboard = new Scanner(System.in);

    System.out.println("서버 실행!");

    ServerSocket ss = new ServerSocket(8888);

    System.out.println("클라이언트 연결을 기다리는 중...");

    keyboard.nextLine();

    ss.close();
    System.out.println("서버 종료!");

    keyboard.close();

  }
}
