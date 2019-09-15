package com.jagex.runescape;

import com.jagex.runescape.node.Node;

public final class VariableUpdate extends Node {

  public long timestamp;


  public VariableUpdate() {
  }

  public VariableUpdate(long var1 ) {
    this.timestamp = var1;
  }

}
