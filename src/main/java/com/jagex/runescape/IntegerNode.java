package com.jagex.runescape;

import com.jagex.runescape.opengl.shader.MaterialShader;

public final class IntegerNode extends Node {

  public static Deque aClass61_2468 = new Deque();
  public static int[] anIntArray2469;
  public static int[] anIntArray2470 = {0, 0, 2, 0, 0, 2, 1, 1, 0};
  public static int anInt2471;
  public int anInt2467;


  public IntegerNode() {
  }

  public IntegerNode(int var1 ) {
    this.anInt2467 = var1;
  }

  public static void method382(int var0) {
    IntegerNode.anIntArray2469 = null;
      IntegerNode.aClass61_2468 = null;
      if (var0 == 1) {
        IntegerNode.anIntArray2470 = null;
      }
  }

  public static void method383(int var0, int var1) {
    if (var1 == DummyClass30.anInt453 && (var1 != 1 -1)) {
        MaterialShader var2 = MapScene.anInterface5Array70[var1];
        var2.set(TextureSampler37.anInt3263);
      }

      if (var0 != -32584) {
        IntegerNode.method383(60, 23);
      }
  }

}
