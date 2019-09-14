package com.jagex.runescape.node;

public final class Deque {

  public Node root = new Node();
  private Node iterator;

  public Deque() {
    this.root.prevNode = this.root;
    this.root.nextNode = this.root;
  }

  public void clear(int var1) {
    while (true) {
      Node var2 = this.root.nextNode;
      if (var2 == this.root) {
        if (var1 > -47) {
          this.root = null;
        }

        this.iterator = null;
        return;
      }

      var2.unlinkNode();
    }
  }

  public Node method1212() {
    Node var2 = this.root.prevNode;
    if (this.root == var2) {
      this.iterator = null;
      return null;
    } else {
      this.iterator = var2.prevNode;
      return var2;
    }
  }

  public void addLast(Node var2) {
    if (var2.prevNode != null) {
      var2.unlinkNode();
    }

    var2.nextNode = this.root;
    var2.prevNode = this.root.prevNode;

    var2.prevNode.nextNode = var2;
    var2.nextNode.prevNode = var2;
  }

  public void method1216(int var1, Node var2) {
    if (var2.prevNode != null) {
      var2.unlinkNode();
    }

    var2.nextNode = this.root.nextNode;
    var2.prevNode = this.root;
    var2.prevNode.nextNode = var2;
    var2.nextNode.prevNode = var2;
    if (var1 != 64) {
      this.getNext();
    }
  }

  public Node method1219(int var1) {
    if (var1 < 13) {
      this.root = null;
    }

    Node var2 = this.iterator;
    if (this.root == var2) {
      this.iterator = null;
      return null;
    } else {
      this.iterator = var2.prevNode;
      return var2;
    }
  }

  public Node method1220(byte var1) {
    Node var2 = this.root.nextNode;
    if (var1 != -3) {
      return null;
    } else if (this.root != var2) {
      var2.unlinkNode();
      return var2;
    } else {
      return null;
    }
  }

  public Node getNext() {
    Node var2 = this.iterator;
    if (var2 == this.root) {
      this.iterator = null;
      return null;
    } else {
      this.iterator = var2.nextNode;
      return var2;
    }
  }

  public Node getFirst() {
    Node var2 = this.root.nextNode;
    if (this.root == var2) {
      this.iterator = null;
      return null;
    } else {
      this.iterator = var2.nextNode;
      return var2;
    }
  }

}
