package com.eomcs.basic.test;

class Javatest031 {
  String subject; // 필드 교과서명
  int point; // 필드 점수

  void setPoint(String s, int p) { // 점수를 설정하는 메소드
    subject = s;
    point = p;
  }

  String getPoint() { // 한 과목의 점수를 가져오는 메소드
    return subject + ":" + point;
  }

}

class Student {
  int id; // 필드 학생 번호
  String name; // 필드 이름
  int subnum; // 필드 과목 수
  Javatest031[ ] test; // 필드 테스트 클래스의 오브젝트 배열


  Student (int i, String n, int s) { // 생성자
    id = i;
    name = n;
    subnum = s;
    test = new Javatest031[s];
    for(int j = 0; j < s; j++)
      test[j] = new Javatest031(); // 배열 요소 하나하나에 대해 new에서 오브젝트를 생성
  }

  String getName() { // 이름을 가져오는 메소드
    return id + ":" + name;
  }

  int getGrade() { // 총점을 가져오는 메소드
    int sum = 0;
    for (int i = 0; i < subnum; i++)
      sum =+ test[i].point;
    return sum;
  }

  // 메소드 오버로드

  int getGrade(int a) { // 성적을 평가하는 메소드
    int base = 100 * subnum / a;
    int rank = getGrade() / base + 1;
    return ( rank > a) ? a : rank;
  } // rank가 a보다 클 때는 a를
  // 그 이외에는 rank를 돌려줍니다.

  void printScore() { // 성적을 표시하는 메소드
    System.out.println(getName());
    for (int i = 0; i < subnum; i++)
      System.out.print(test[i].getPoint() + " ");
    System.out.println();
    System.out.println("총점" + getGrade());
    int rank = 5;
    System.out.println(rank + "단계 평가" + getGrade(rank));
    System.out.println();
  }

}

class Classroom {
  public static void main(String[] args) {
    Student kim = new Student(12, "김주현", 3);
    kim.test[0].setPoint("국어", 66);
    kim.test[1].setPoint("영어", 97);
    kim.test[2].setPoint("수학", 76);

    kim.printScore();

    Student lee = new Student(7,"이 진",3);
    lee.test[0].setPoint("국어", 66);
    lee.test[1].setPoint("영어", 92);
    lee.test[2].setPoint("수학", 72);
    lee.printScore();
  }


}


