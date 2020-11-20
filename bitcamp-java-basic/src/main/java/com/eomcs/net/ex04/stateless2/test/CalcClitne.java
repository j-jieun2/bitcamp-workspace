// stateless 방식에서 클라이언트를 구분하고 작업 결과를 유지하는 방법
package com.eomcs.net.ex04.stateless2.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcClitne {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);

    // 서버에서 이 클라이언트로 구분할 때 사용하는 번호이다.
    // => 0 번으로 서버를 요청하면, 서버가 신규 번호를 발급해 줄 것이다.
    long clientId = 0;

    while (true) {
      System.out.print("연산자? ");
      String op = keyScan.nextLine();

      System.out.print("값? ");
      int value = Integer.parseInt(keyScan.nextLine());

      try (Socket socket = new Socket("localhost", 8888);
          DataOutputStream out = new DataOutputStream(socket.getOutputStream());
          DataInputStream in = new DataInputStream(socket.getInputStream())) {

        // => 서버에 클라이언트 아이디를 보낸다.
        out.writeLong(clientId);

        out.writeUTF(op);
        out.writeInt(value);
        out.flush();

        clientId = in.readLine();

        int result = in.readInt();

      }
    }
  }
}
