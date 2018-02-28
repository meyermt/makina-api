package com.meyermt.makina.makinaapi.beans;

import java.util.List;

public class MakinateRequest {

  private int level;
  private List<String> instructions;

  public MakinateRequest(int level, List<String> instructions) {
    this.level = level;
    this.instructions = instructions;
  }

  public int getLevel() {
    return level;
  }

  public List<String> getInstructions() {
    return instructions;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public void setInstructions(List<String> instructions) {
    this.instructions = instructions;
  }
}
