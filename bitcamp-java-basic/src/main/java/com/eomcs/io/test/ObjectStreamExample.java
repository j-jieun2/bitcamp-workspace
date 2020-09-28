package com.eomcs.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamExample {
  public static void main(String[] args) throws Exception {
    writeList(); // List를 파일에 저장
    List<Board> list = readList(); // 파일에 저장된 List 읽기

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    for (Board board : list) {
      System.out.println(
          board.getBno() + "\t" + board.getTitle() + "\t"
              + board.getContent() + "\t" + board.getWriter() + "\t"
              + sdf.format(board.getDate()));
    }
  }

  public static void writeList() throws Exception {
    List<Board> list = new ArrayList<>(); // List 생성

    // list에 Board 객체 저장
    list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
    list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
    list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));

    // 객체 출력 스트림을 이용해서 list 출력
    ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream("temp/board.db"));
    out2.writeObject(list);
    out2.flush();
    out2.close();
  }

  public static List<Board> readList() throws Exception {
    // 객체 입력 스트림을 이용해서 list 읽기
    ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("temp/board.db"));
    List<Board> list = (List<Board>) in2.readObject();
    return list;
  }
}
