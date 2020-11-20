package com.eomcs.concurrent2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam120 {
  public static void main(String[] args) {
    ExecutorService threadPool = Executors.newFixedThreadPool(3);

  threadPool.execute(() -> System.out.printf("%s - Hello!\n",
      Thread.currentThread().getName()));
  
  threadPool.shutdown();

  System.out.println("main() 종료!");
  }
}
