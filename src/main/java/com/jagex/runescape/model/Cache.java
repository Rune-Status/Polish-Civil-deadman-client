package com.jagex.runescape.model;

import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.common.Queue;
import com.jagex.runescape.node.Node;
import com.jagex.runescape.node.SubNode;
import com.jagex.runescape.statics.GlobalStatics_6;

public final class Cache {

  private SubNode aClass3_Sub28_744 = new SubNode();
  private final HashTable table;
  private final int size;
  private final Queue queue = new Queue();
  private int capacity;

  public Cache(int size) {
    int tableSize = 1;
    for (this.capacity = size; tableSize + tableSize < size;
        tableSize += tableSize) {
    }
    this.size = size;
    this.table = new HashTable(tableSize);
  }

  public SubNode get(long var1, int var3) {
    if (var3 != 1400) {
      this.capacity = -79;
    }

    SubNode var4 = (SubNode) this.table.get(var1);
    if (var4 != null) {
      this.queue.addLast(var4);
    }

    return var4;
  }

  public Node method1094(int var1) {
    return var1 != 0 ? null : this.table.getFirst(38);
  }

  public void put(long var2, SubNode var1) {
    if (this.capacity == 0) {
      SubNode var5 = this.queue.poll();
      var5.unlinkNode();
      var5.unlinkSubNode();
      if (this.aClass3_Sub28_744 == var5) {
        var5 = this.queue.poll();
        var5.unlinkNode();
        var5.unlinkSubNode();
      }
    } else {
      --this.capacity;
    }

    this.table.put(var2, var1);
    this.queue.addLast(var1);
  }

  public Node method1099(int var1) {
    if (var1 != -1) {
      GlobalStatics_6.aClass93_743 = null;
    }

    return this.table.getNext(-119);
  }

  public void method1101(int var1) {
    this.queue.clear();
    this.table.clear(-112);
    this.aClass3_Sub28_744 = new SubNode();
    if (var1 != 2) {
      this.get(-36L, 52);
    }

    this.capacity = this.size;
  }

}
