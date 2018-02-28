package com.meyermt.makina.makinaapi.beans;

import java.util.List;

public class MakinaReply {

  private boolean isCorrect;
  private int percentCorrect;
  private List<String> pixiInstructions;

  public MakinaReply(boolean isCorrect, int percentCorrect, List<String> pixiInstructions) {
    this.isCorrect = isCorrect;
    this.percentCorrect = percentCorrect;
    this.pixiInstructions = pixiInstructions;
  }

  public boolean isCorrect() {
    return isCorrect;
  }

  public int getPercentCorrect() {
    return percentCorrect;
  }

  public List<String> getPixiInstructions() {
    return pixiInstructions;
  }

  public void setCorrect(boolean correct) {
    isCorrect = correct;
  }

  public void setPercentCorrect(int percentCorrect) {
    this.percentCorrect = percentCorrect;
  }

  public void setPixiInstructions(List<String> pixiInstructions) {
    this.pixiInstructions = pixiInstructions;
  }
}
