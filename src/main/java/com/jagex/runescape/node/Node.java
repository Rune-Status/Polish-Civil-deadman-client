package com.jagex.runescape.node;

public class Node {

  public long key;
  public Node nextNode;
  public Node prevNode;

  public final boolean method82(int var1) {
    return var1 == 0 && this.prevNode != null;
  }

  public final void unlinkNode() {
    if (this.prevNode != null) {
      this.prevNode.nextNode = this.nextNode;
      this.nextNode.prevNode = this.prevNode;
      this.prevNode = null;
      this.nextNode = null;
    }
  }

}
