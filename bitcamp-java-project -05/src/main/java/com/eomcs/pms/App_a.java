package com.eomcs.pms;

// 1) 명령 프롬프트를 출력한다
public class App_a {

  public static void main(String[] args) {

    System.out.print("명령> ");

    /*
    Scanner keyInput = new Scanner(System.in);

    // 최대 5명의 회원 정보를 입력 받는 변수의 선언

    final int MAX_LENGTH = 5;
    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] password = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    Date[] now = new Date[MAX_LENGTH];

    long currentMillis = 0;
    int count = 0;

    System.out.println("[회원]");

    for (int i = 0; i < MAX_LENGTH; i++) {
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
 // 출력이 안되는 이유, 회원가입 할 때 현재의 시간으로 자동 입력 됨

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
     */
  }
}