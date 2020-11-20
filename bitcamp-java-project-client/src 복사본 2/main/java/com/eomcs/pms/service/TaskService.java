package com.eomcs.pms.service;

import java.util.List;
import java.util.Map;
import com.eomcs.pms.domain.Task;

public interface TaskService {
 List<Task> listByProject(int projectNo) throws Exception;
 int add(Task task) throws Exception;
 Task get(int no) throws Exception;
 int delete(int no) throws Exception;
 List<Task> list(Map<String,Object> keyword) throws Exception;
 int update(Task task) throws Exception;
}
