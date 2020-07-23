// Exam0410.java
// 주제: 문자 리터럴

package com.eomcs.basic.ex031;

public class Exam420 {
    public static void main(String[] args) {
      // 자바는 문자를 메모리에 저장할 때 Unicode 규칙에 따라
      // 2바이트 코드로 저장한다.
        System.out.println('헐'); // 0x0041
        System.out.println('가'); // 0xac00
        
        // println()에게 문자 코드임을 알려줘라
        System.out.println((char)0x41); 
        System.out.println((char)65); 
        System.out.println((char)0xd5d0); 
        
        System.out.println('A'); // 'A' = ((char)0x041)
        
        // single guatation 연산자 ''의 역할?
        // => 문자의 코드 값을 리턴해주는 일을 한다.
    
    }
}

// 문자를 메모리에 저장하려면,
// 2진수로 바꿀 수 있어야 한다.
// - 문자를 2진수로 바꾸는 규칙
// "문자집합 (Character Set)" 이라고 한다.
// - 문자 집합에는 여러 규칙이 있다.
//  - ASCII(7비트, American Standard Code for Information Interchange)
//      - 영어 대소문자, 숫자, 특수문자 등
//      - 'A' => 100_0001 = 0x41
//      - 'B' => 100_0010 = 0x42
//      - '1' => 011_0001 = 0x31
//      - '2' => 011_0002 = 0x32
//      - 한글(11172자)는 정의되어 있지 않다.
//  - ISO-8859-1(8비트)
//      - ASCII 문자 + 유럽 문자
//  - EUC-KR(16비트, KSC-5601)
//      - 한글 2350자에 대한 규칙
//      - '가' => 10110000_10100001 = 0xb0a1
//      - '각' => 10110000_10100010 = 0xb0a2
//      - 현대 통용되는 한글 음절 11172자를 모두 표현할 수 없다.
//  - Unicode(16비트, IS O10640)
//      - 영어, 한글 모두 2byte로 표현
//      - 일반적으로 통용되는 대부분의 모든 국가의 문자를 담고있다.
//      - 'A' => 0x0041
//      - 'B' => 0x0042
//      - '1' => 0x0031
//      - '2' => 0x0032
//      - '가' => 0xzc00
//      - '각' => 0xac01
//      - 영어를 바이트로 표현하기 때문에 비효율적이다.
//      - 한글은 새로 정의했기 때문에 ECU-KR과 호환되지않는다.
//  - UTF-8(8비트 ~ 32비트, Universal Coded Character Set + Transformation Format)
//      - Unicode를 문자 따라 1 ~ 4바이트로 변환한 코드다.
//      - ISO-8859-1(영어,숫자,특수문자): 1바이트로 표현한다.
//          - 'A' = 0x41
//          - 'B' = 0x42
//          - '1' = 0x31
//      - 한글 : 3바이트로 표현한다.
//          - '가' => 0xac00(10101100_00000000, Unicode
//                 => 1110xxxx 10xxxxxx 10xxxxxx (변환규칙)
//                 => 11101010 10110000 1000000 (규칙에 값 적용)
//                 => 0xEAB080 (UTF-8)
//      - 문자에 따라 바이트 크기가 다르다.
//      - 기존에 ISO-8859-1 은 1바이트로 표현한다.
//      - 한글은 규칙에 따라 3바이트로 변환한다.
