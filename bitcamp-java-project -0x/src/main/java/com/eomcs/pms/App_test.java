package com.eomcs.pms;

import java.sql.Date;

// 1) 회원의 번호, 이름, 이메일, 암호, 사진, 전화번호, 등록일을 담을 수 있는
//    메모리를 설계한다 => Member 클래스 정의
// 2)


public class App_test {

  public static void main(String[] args) {
    // 값을 담기위해 메모리를 준비할 때
    // 어떤 종류의 메모리를 준비해야 하는지 설계도를 작성한다.
    // => 이것을 "클래스 정의"라고 부른다.
    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date createdDate;
    }

    // Member 설계도에 따라 주소를 담을 변수 선언
    Member m;

    // Member 설계도에 따라 메모리 생성
    m = new Member();

    // m에 저장된 주소로 찾아가서 해당 인스턴스의 각 항목에 데이터 넣기
    m.no = 1;
    m.name = "홍길동";
    m.email = "hong@test.com";
    m.password = "1111";
    m.photo = "hong.gif";
    m.tel = "010-1111-2222";
    m.createdDate = Date.valueOf("2020-1-1");

    // m에 저장된 주소로 찾아가서 해당 인스턴스의 각 항목의 값을 꺼내기
    System.out.println(m.no);
    System.out.println(m.name);
    System.out.println(m.email);
    System.out.println(m.password);
    System.out.println(m.photo);
    System.out.println(m.tel);
    System.out.println(m.createdDate);
    // => m이라는 변수에 저장된 주소로 찾아가서 no이라는 이름의 항목 값을 꺼내기
    // => 레퍼런스 m이 가리키는 인스턴스의 no 항목의 값을 꺼내기
    // => 래퍼런스 m이 가리키는 인스턴스의 no 필드 값 꺼내기
    // => m 객체의 no 필드 값 꺼내기

    Member m2;
    m2 = m;
    m2.name = "임꺽정";

    System.out.println(m.name);

    // 인스턴스를 담을 레퍼런스의 배열을 만듬, 인스턴스의 배열은 만들 수 없다.
    Member[] members = new Member[4];

    members[0] = new Member();
    members[1] = new Member();
    members[2] = new Member();
    members[3] = new Member();

    members[0].name = "홍길동";
    members[1].name = "임꺽정";
    members[2].name = "유관순";
    members[3].name = "안중근";

    Member x;
    x = members[2];
    x.name = "오호라";
    x = members[0];
    x.name = "우헤헤";

    Member x2;
    x2 = x;
    x2.name = "헐..";

    System.out.println(members[0].name);
    System.out.println(members[1].name);
    System.out.println(members[2].name);
    System.out.println(members[3].name);


    /*
    Scanner keyInput = new Scanner(System.in);

    System.out.println("[회원]");

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