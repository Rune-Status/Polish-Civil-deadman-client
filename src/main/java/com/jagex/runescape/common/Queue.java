package com.jagex.runescape.common;

import com.jagex.runescape.node.SubNode;

public final class Queue {

  private final SubNode root = new SubNode();
  private SubNode iterator;

  public Queue() {
    this.root.nextSubNode = this.root;
    this.root.prevSubNode = this.root;
  }

  public int size() {
    int var2 = 0;
    for (SubNode node = this.root.nextSubNode; node != this.root; ++var2) {
      node = node.nextSubNode;
    }
    return var2;
  }

  public SubNode getFirst() {
    SubNode node = this.root.nextSubNode;
    if (this.root == node) {
      this.iterator = null;
      return null;
    }
    this.iterator = node.nextSubNode;
    return node;
  }

  public SubNode poll() {
    SubNode var2 = this.root.nextSubNode;
    if (this.root == var2) {
      return null;
    }
    var2.unlinkSubNode();
    return var2;
  }

  public SubNode getNext() {
    SubNode var2 = this.iterator;
    if (var2 == this.root) {
      this.iterator = null;
      return null;
    } else {
      this.iterator = var2.nextSubNode;
      return var2;
    }
  }

  public void addLast(SubNode var1) {
    if (var1.prevSubNode != null) {
      var1.unlinkSubNode();
    }

    var1.prevSubNode = this.root.prevSubNode;
    var1.nextSubNode = this.root;
    var1.prevSubNode.nextSubNode = var1;
    var1.nextSubNode.prevSubNode = var1;
  }

  public void clear() {
    while (true) {
      SubNode var2 = this.root.nextSubNode;
      if (this.root == var2) {
        this.iterator = null;
        return;
      }

      var2.unlinkSubNode();
    }
  }

}
