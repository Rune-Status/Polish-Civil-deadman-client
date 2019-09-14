package com.jagex.runescape;

public final class SomethingMidiFile extends Node {


  private static GameString aClass94_2286 =
    GameString.create("wishes to trade with you)3");
  public static byte[][] byteArrayPool;
  public static int[] BIT_MASKS = new int[32];
  public static int anInt2290;
  public static int anInt2291;
  public static GameString aClass94_2285 = SomethingMidiFile.aClass94_2286;

  static {
    int var0 = 2;

    for (int var1 = 0; var1 < 32; ++var1) {
      SomethingMidiFile.BIT_MASKS[var1] = -1 + var0;
      var0 += var0;
    }

    SomethingMidiFile.anInt2291 = 1;
  }

  public byte[] aByteArray2289;

  public SomethingMidiFile(byte[] var1 ) {
    try {
      this.aByteArray2289 = var1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "ea.<init>(" + (var1 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method118(int var0) {
    try {
      SomethingMidiFile.BIT_MASKS = null;
      SomethingMidiFile.byteArrayPool = null;
      SomethingMidiFile.aClass94_2285 = null;
      if (var0 != 2) {
        SomethingMidiFile.method119(null, 91);
      }

      SomethingMidiFile.aClass94_2286 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ea.A(" + var0 + ')');
    }
  }

  public static float[] method119(float[] var0, int var1) {
    try {
      if (var0 != null) {
        float[] var2 = new float[var0.length];
        ArrayUtils.method1360(var0, var1, var2, 0, var0.length);
        return var2;
      } else {
        return null;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
          "ea.B(" + "{...}" + ',' + var1 + ')');
    }
  }
}
