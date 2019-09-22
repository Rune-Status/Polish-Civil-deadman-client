package com.jagex.runescape.model;

import com.jagex.runescape.node.Node;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class SomethingWorldMappy extends Node {

  public int anInt2492;
  public int anInt2494;
  public int anInt2495;
  public int anInt2497;

  public SomethingWorldMappy(int var1, int var2, int var3, int var4) {
    this.anInt2497 = var4;
    this.anInt2494 = var2;
    this.anInt2495 = var3;
    this.anInt2492 = var1;
  }

  public boolean method393(byte var1, int var2, int var3) {
    if (var1 != -45) {
      GlobalStatics_9.method394(6, -105);
    }

    return var3 >= this.anInt2492
        && this.anInt2495 >= var3 && this.anInt2494 <= var2
        && var2 <= this.anInt2497;
  }

}
