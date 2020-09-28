// 클라이언트 만들기
package com.eomcs.net.ex02.ex022;

import java.net.Socket;

public class Client0110 {
  public static void main(String[] args) throws Exception {

    Socket socket = new Socket("localhost", 8888);

    System.out.println("서버와 연결되었음!");
    socket.close();
    System.out.println("서버와 연결을 끊었음!");
  }
}
