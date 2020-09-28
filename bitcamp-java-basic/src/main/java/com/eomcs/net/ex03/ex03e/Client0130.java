// 서버와 입출력 테스트 - byte stream : 바이트 배열 보내고 받기
package com.eomcs.net.ex03.ex03e;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client0130 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    try (Socket socket = new Socket("localhost", 8888);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream())) {
      System.out.println("서버와 연결되었음!");

      // 데이터를 보내기 전에 잠깐 멈춤
      System.out.print("> ");
      keyScan.nextLine();

      // 서버에 int 값을 전송한다.
      out.writeInt(156789123);
      System.out.println("서버에 데이터를 보냈음!");

      // 서버에 보낸 int 값을 읽는다
      int value = in.readInt();
      System.out.println(value);

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
