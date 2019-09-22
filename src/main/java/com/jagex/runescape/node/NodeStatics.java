package com.jagex.runescape.node;

public class NodeStatics {

  public static void addLast(Node first, Node second) {
    if (first.prevNode != null) {
      first.unlinkNode();
    }

    first.nextNode = second;
    first.prevNode = second.prevNode;
    first.prevNode.nextNode = first;
    first.nextNode.prevNode = first;
  }
}
