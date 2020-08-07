
package com.eomcs.basic.ex04;

import java.util.Scanner;

public class Exam434 {
  public static void main(String[] args) {
   
    Scanner i = new Scanner(System.in);
    
    int a = 472;
    int b = 385;
    
    System.out.println(a * ( b % 10));
    System.out.println(a * ((b % 100) / 10));
    System.out.println(a * (b / 100));
    System.out.println(a * b);
    
    
    }
  }
