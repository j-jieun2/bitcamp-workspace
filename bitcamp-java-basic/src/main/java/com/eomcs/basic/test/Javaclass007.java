package com.eomcs.basic.test;

import com.eomcs.basic.util.MemberService;

public class Javaclass007 {
  public static void main(String[] args) {
    MemberService MemberService = new MemberService();
    boolean result = MemberService.login("hong", "12345");
    if(result) {
      System.out.println("로그인되었습니다.");
      MemberService.logout("hong");
    } else {
      System.out.println("id 또는 password가 올바르지 않습니다.");
    }


  }
}
