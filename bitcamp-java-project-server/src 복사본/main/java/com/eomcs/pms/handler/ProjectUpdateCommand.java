package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Map;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.service.MemberService;
import com.eomcs.pms.service.ProjectService;
import com.eomcs.util.Prompt;

public class ProjectUpdateCommand implements Command {

  ProjectService projectService;
  MemberService memberService;

  public ProjectUpdateCommand(ProjectService projectService, MemberService memberService) {
    this.projectService = projectService;
    this.memberService = memberService;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in, Map<String,Object> context) {

    out.println("[프로젝트 변경]");
    int no = Prompt.inputInt("번호? ");

    try {
      Project project = projectService.get(no);
      if (project == null) {
        out.println("해당 번호의 프로젝트가 없습니다.");
        return;
      }

      String value = Prompt.inputString(
          String.format("프로젝트명(%s)? ", project.getTitle()), out, in);
      if (value.length() > 0) {
        project.setTitle(value);
      }

      value = Prompt.inputString(String.format(
          "내용(%s)? ", project.getContent()), out, in);
      if (value.length() > 0) {
        project.setContent(value);
      }

      value = Prompt.inputString(
          String.format("시작일(%s)? ", project.getStartDate()), out, in);
      if (value.length() > 0) {
        project.setStartDate(Date.valueOf(value));
      }

      value = Prompt.inputString(
          String.format("종료일(%s)? ", project.getEndDate()), out, in);
      if (value.length() > 0) {
        project.setEndDate(Date.valueOf(value));
      }

      String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ", out, in);
      if (!response.equalsIgnoreCase("y")) {
        out.println("프로젝트 변경을 취소하였습니다.");
        return;
      }

      if (projectService.update(project) == 0) {
        System.out.println("해당 번호의 프로젝트가 존재하지 않습니다.");
      } else {
        System.out.println("프로젝트를 변경하였습니다.");
      }
    } catch (Exception e) {
      System.out.println("프로젝트 변경 중 오류 발생!");
      e.printStackTrace();
    }
  }
}
