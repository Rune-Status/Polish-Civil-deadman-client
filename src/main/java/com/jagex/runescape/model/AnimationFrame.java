package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.node.Node;

public final class AnimationFrame extends Node {

  public int anInt2454;
  public int[] anIntArray2455;
  public int[][] anIntArrayArray2460;
  public int anInt2462;
  public boolean[] aBooleanArray2463;
  public int[] anIntArray2466;

  public AnimationFrame(int var1, byte[] var2) {
    this.anInt2454 = var1;
    Buffer var3 = new Buffer(var2);
    this.anInt2462 = var3.readUnsignedByte();
    this.anIntArrayArray2460 = new int[this.anInt2462][];
    this.anIntArray2466 = new int[this.anInt2462];
    this.aBooleanArray2463 = new boolean[this.anInt2462];
    this.anIntArray2455 = new int[this.anInt2462];

    int var4;
    for (var4 = 0; var4 < this.anInt2462; ++var4) {
      this.anIntArray2466[var4] = var3.readUnsignedByte();
    }

    for (var4 = 0; this.anInt2462 > var4; ++var4) {
      this.aBooleanArray2463[var4] = var3.readUnsignedByte() == 1;
    }

    for (var4 = 0; var4 < this.anInt2462; ++var4) {
      this.anIntArray2455[var4] = var3.readUnsignedShort();
    }

    for (var4 = 0; var4 < this.anInt2462; ++var4) {
      this.anIntArrayArray2460[var4] = new int[var3.readUnsignedByte()];
    }

    for (var4 = 0; this.anInt2462 > var4; ++var4) {
      for (int var5 = 0; var5 < this.anIntArrayArray2460[var4].length; ++var5) {
        this.anIntArrayArray2460[var4][var5] = var3.readUnsignedByte();
      }
    }
  }

}
