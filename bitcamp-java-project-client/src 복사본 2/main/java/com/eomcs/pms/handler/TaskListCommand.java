package com.eomcs.pms.handler;

import java.util.List;
import java.util.Map;
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.service.TaskService;

public class TaskListCommand implements Command {
  TaskService taskService;

  public TaskListCommand(TaskService taskService) {
    this.taskService = taskService;
  }

  @Override
  public void execute(Map<String,Object> context) {
    System.out.println("[작업 목록]");

    try {
      List<Task> list = taskService.list(null);
      System.out.println("번호, 작업내용, 마감일, 작업자, 상태");

      for (Task task : list) {
        String stateLabel = null;
        switch (task.getStatus()) {
          case 1:
            stateLabel = "진행중";
            break;
          case 2:
            stateLabel = "완료";
            break;
          default:
            stateLabel = "신규";
        }
        System.out.printf("%d, %s, %s, %s, %s\n",
            task.getNo(),
            task.getContent(),
            task.getDeadline(),
            task.getOwner().getName(),
            stateLabel);
      }
    } catch (Exception e) {
      System.out.println("작업 목록 조회 중 오류 발생!");
      e.printStackTrace();
    }
  }
}
