package com.jagex.runescape.common;

import com.jagex.runescape.node.Node;

public final class HashTable {

  public Node[] nodes;
  public int capacity;
  private Node iterator;
  private long lastFetchedKey;
  private Node aClass3_1713;
  private int iteratorBucketId;

  public HashTable(int var1) {
    this.nodes = new Node[var1];
    this.capacity = var1;

    for (int var2 = 0; var2 < var1; ++var2) {
      Node var3 = this.nodes[var2] = new Node();
      var3.prevNode = var3;
      var3.nextNode = var3;
    }
  }

  public void clear(int var1) {
    int var2 = 0;

    while (var2 < this.capacity) {
      Node var3 = this.nodes[var2];

      while (true) {
        Node var4 = var3.nextNode;
        if (var3 == var4) {
          ++var2;
          break;
        }

        var4.unlinkNode();
      }
    }

    this.aClass3_1713 = null;
    var2 = 1 % ((73 - var1) / 34);
    this.iterator = null;
  }

  public Node getFirst(int var1) {
    this.iteratorBucketId = 0;
    return this.getNext(-66);
  }

  public Node getNext(int var1) {
    Node var2;
    if ((this.iteratorBucketId > 0) && this.aClass3_1713 != this.nodes[
        this.iteratorBucketId
            - 1]) {
      var2 = this.aClass3_1713;
      this.aClass3_1713 = var2.nextNode;
      return var2;
    } else {
      do {
        if ((this.iteratorBucketId >= this.capacity)) {
          if (var1 > -61) {
            this.clear(119);
          }

          return null;
        }

        var2 = this.nodes[this.iteratorBucketId++].nextNode;
      } while (this.nodes[this.iteratorBucketId - 1] == var2);

      this.aClass3_1713 = var2.nextNode;
      return var2;
    }
  }

  public void put(long var3, Node var2) {
    if (var2.prevNode != null) {
      var2.unlinkNode();
    }

    Node var5 = this.nodes[(int) (var3 & (this.capacity - 1))];
    var2.nextNode = var5;
    var2.key = var3;
    var2.prevNode = var5.prevNode;
    var2.prevNode.nextNode = var2;
    var2.nextNode.prevNode = var2;
  }

  public Node get(long var1) {
    this.lastFetchedKey = var1;
    Node var4 = this.nodes[(int) (var1 & (-1 + this.capacity))];
    for (
        this.iterator = var4.nextNode;
        var4 != this.iterator; this.iterator = this.iterator.nextNode) {
      if ((var1 == this.iterator.key)) {
        Node var5 = this.iterator;
        this.iterator = this.iterator.nextNode;
        return var5;
      }
    }

    this.iterator = null;
    return null;
  }

  public int getSize() {
    int var3 = 0;

    for (int var4 = 0; var4 < this.capacity; ++var4) {
      Node var5 = this.nodes[var4];

      for (Node var6 = var5.nextNode; var6 != var5; ++var3) {
        var6 = var6.nextNode;
      }
    }

    return var3;
  }

  public int getNodes(Node[] var1) {
    int var3 = 0;

    for (int var4 = 0; var4 < this.capacity; ++var4) {
      Node var5 = this.nodes[var4];

      for (Node var6 = var5.nextNode; var6 != var5; var6 = var6.nextNode) {
        var1[var3++] = var6;
      }
    }

    return var3;
  }

  public Node getLastFetchedNode() {
    if (this.iterator != null) {
      Node var2 = this.nodes[(int) (this.lastFetchedKey
          & (-1 + this.capacity))];
      while (var2 != this.iterator) {
        if (this.iterator.key == this.lastFetchedKey) {
          Node var3 = this.iterator;
          this.iterator = this.iterator.nextNode;
          return var3;
        }

        this.iterator = this.iterator.nextNode;
      }

      this.iterator = null;
      return null;
    } else {
      return null;
    }
  }

  public int getCapacity() {
    return this.capacity;
  }

}
