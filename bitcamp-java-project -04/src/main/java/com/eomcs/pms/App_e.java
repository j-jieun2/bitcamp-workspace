package com.eomcs.pms;

// 클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.
import java.util.Scanner;
import java.sql.Date;

// 1) 낱개의 변수를 사용하여 여러 회원 정보를 처리하기
// 2) 조건문을 사용하여 입출력 제어하기.
// - 필요한 만큼만 입력 받고 출력하고 싶다.
// 3) 배열을 사용하여 여러 개의 값을 다루기
// - 배열을 사용하면간단하게 여려 개의 변수를 선언할 수 있다.
// 4) 반복문을 사용하여 여러 개의 값을 다루기
// - 반복문을 사용하면 같은 코드를 중복해서 작성할 필요가 없다.
// 5) 배열 개수를 변수에서 관리하기
// - 변수의 값만 바꾸면 배열 개수를 바로 변경할 수 있어 편하다.


public class App_e {

  public static void main(String[] args) {
  
    Scanner keyInput = new java.util.Scanner(System.in);
    
    // 최대 5명의 회원 정보를 입력 받는 변수의 선언
    
    int maxLenght = 5;
    int[] no = new int[maxLenght];
    String[] name = new String[maxLenght];
    String[] email = new String[maxLenght];
    String[] password = new String[maxLenght];
    String[] photo = new String[maxLenght];
    String[] tel = new String[maxLenght];
    Date[] now = new Date[maxLenght];
    
    long currentMillis = 0;
    int count = 0;
    
    System.out.println("[회원]");
    
    for (int i = 0; i < maxLenght; i++) {
    count++;
    
    System.out.print("번호? ");
    no[i] = keyInput.nextInt(); 
    keyInput.nextLine();
    
    System.out.print("이름? ");
    name[i] = keyInput.nextLine();
    
    System.out.print("이메일? ");
    email[i] = keyInput.nextLine();
    
    System.out.print("암호? ");
    password[i] = keyInput.nextLine();
    
    System.out.print("사진? ");
    photo[i] = keyInput.nextLine();
    
    System.out.print("전화? ");
    tel[i] = keyInput.nextLine();
   
    currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00에서 경과된 밀리초
    now[i] = new Date(currentMillis);
    
    System.out.println("");
    
    System.out.println("계속 입력하시겠습니까?(y/N) ");
    String response = keyInput.nextLine();

    
    if (response.equalsIgnoreCase("y") == false) {
    break; // 반복문을 멈춰라 
    }
  }
  
  
    keyInput.close();
    
    System.out.println("--------------------------------------------");
    
    for (int i = 0; i < count; i++) {
    System.out.printf("%d, %s, %s, %s, %s\n", no[i], name[i], email[i], password[i], photo[i], tel[i], now[i].toString());

   }
    }
}