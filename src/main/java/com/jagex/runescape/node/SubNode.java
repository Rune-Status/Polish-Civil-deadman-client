package com.jagex.runescape.node;

public class SubNode extends Node {

  public long subnodeKey;
  public SubNode prevSubNode;
  public SubNode nextSubNode;

  public final void unlinkSubNode() {
    if (this.prevSubNode != null) {
        this.prevSubNode.nextSubNode = this.nextSubNode;
        this.nextSubNode.prevSubNode = this.prevSubNode;
        this.nextSubNode = null;
        this.prevSubNode = null;
      }
  }

}
