package com.jagex.runescape.model;

import com.jagex.runescape.node.SubNode;

public final class DummyHashTable {

  private final SubNode[] aClass3_Sub28Array1684;


  public DummyHashTable(int var1 ) {
    this.aClass3_Sub28Array1684 = new SubNode[var1];

      for (int var2 = 0; (var2 < var1); ++var2) {
        SubNode var3 = this.aClass3_Sub28Array1684[var2] = new SubNode();
        var3.prevSubNode = var3;
        var3.nextSubNode = var3;
      }
  }

}
