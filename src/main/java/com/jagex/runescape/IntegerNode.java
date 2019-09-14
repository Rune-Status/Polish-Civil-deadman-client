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
    try {
      this.anInt2467 = var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ka.<init>(" + var1 + ')');
    }
  }

  public static void method382(int var0) {
    try {
      IntegerNode.anIntArray2469 = null;
      IntegerNode.aClass61_2468 = null;
      if (var0 == 1) {
        IntegerNode.anIntArray2470 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ka.B(" + var0 + ')');
    }
  }

  public static void method383(int var0, int var1) {
    try {
      if (var1 == DummyClass30.anInt453 && ~var1 != -1) {
        MaterialShader var2 = MapScene.anInterface5Array70[var1];
        var2.set(TextureSampler37.anInt3263);
      }

      if (var0 != -32584) {
        IntegerNode.method383(60, 23);
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "ka.A(" + var0 + ',' + var1 + ')');
    }
  }

}
