// Queue 구현과 사용
package com.eomcs.corelib.ex06;

import java.util.concurrent.ArrayBlockingQueue;

public class Exam0111 {
  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("ddd");
    String s5 = new String("eee");

    // 초기 파라미터 값을 줘야한다.
    ArrayBlockingQueue queue = new ArrayBlockingQueue(10);
    queue.offer(s1); // aaa
    queue.offer(s2); // aaa, bbb
    queue.offer(s3); // aaa, bbb, ccc
    print(queue);

    // 제일 처음 들어온 값 부터 나간다.
    // FIFO
    System.out.println("==> " + queue.poll()); // aaa
    System.out.println("==> " + queue.poll()); // bbb
    print(queue); // ccc

    System.out.println("-------------------------");

    String value;
    while ((value = (String) queue.poll()) !=null ) {
      System.out.println(value);
    }
  }


  static void print(ArrayBlockingQueue queue) {
    Object[] arr = queue.toArray(); // queue의 배열 생성
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }
}





















