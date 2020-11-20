package com.eomcs.design_pattern.flyweight.before;

import java.util.HashMap;
import java.util.Map;

public class BrushPool {
  Map<String, Brush> brushMap = new HashMap<>();

  // 브러시를 리턴하는 메서드
  public Brush getBrush(String pattern) {
    Brush brush = brushMap.get(pattern);
    if (brush == null) {
      brush = new Brush(pattern);
      brushMap.put(pattern, brush);
    }
    return brush;
  }
}
