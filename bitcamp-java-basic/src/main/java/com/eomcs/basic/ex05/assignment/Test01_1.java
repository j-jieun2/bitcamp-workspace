package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제1 : 입력 받은 두 정수 사이의 합계를 구하라.
//실행 예)
//입력? 2 5
//2에서 5까지의 합은 14입니다.
//

public class Test01_1 {
  
  public static void main (String []args){     
  int a;
  int b;
  int sum=0;

  Scanner sc =new Scanner(System.in);
      
    System.out.println("첫 번째 수를 입력하여 주세요");
    a=sc.nextInt();
     
    System.out.println("두 번째 수를 입력하여 주세요");
    b=sc.nextInt();

      if(a>b)
      {      
        int sub = a;
        a=b;
        b=sub;     
      }

      for(int i=a; i<=b ;i=i+1)
      {
         sum=sum+i;           
      }
    System.out.println();
    System.out.println("두 수"+a+"~"+b+" 사이의 합은");
    System.out.println(sum+"입니다");   
   }
}