package com.jagex.runescape;

import com.jagex.runescape.opengl.SomethingGl;

public final class DummyClass55 {

  public static boolean aBoolean1419;
  public static FileUnpacker aClass153_1420;
  public static AudioStreamEncoder4 aClass3_Sub24_Sub4_1421;
  public static BufferedFile cacheDataFile;
  public static FileUnpacker aClass153_1423;
  public static Deque aClass61_1424 = new Deque();
  public static int anInt1425;
  public static int[] landscapeFileIds;
  public static int anInt1427;
  public static FileUnpacker fileUnpacker18;
  public static short[][] aShortArrayArray1429;


  public static void method1607(int var0, int var1, boolean var2, int[] var3, int[] var4) {
    if (var2) {
        DummyClass55.method1608((byte) 106);
      }

      if (~var0 > ~var1) {
        int var5 = (var1 + var0) / 2;
        int var6 = var0;
        int var7 = var3[var5];
        var3[var5] = var3[var1];
        var3[var1] = var7;
        int var8 = var4[var5];
        var4[var5] = var4[var1];
        var4[var1] = var8;

        for (int var9 = var0; var1 > var9; ++var9) {
          if (var3[var9] > ((var9 & 1) + var7)) {
            int var10 = var3[var9];
            var3[var9] = var3[var6];
            var3[var6] = var10;
            int var11 = var4[var9];
            var4[var9] = var4[var6];
            var4[var6++] = var11;
          }
        }

        var3[var1] = var3[var6];
        var3[var6] = var7;
        var4[var1] = var4[var6];
        var4[var6] = var8;
        DummyClass55.method1607(var0, var6 - 1, var2, var3, var4);
        DummyClass55.method1607(var6 + 1, var1, var2, var3, var4);
      }
  }

  public static void method1608(byte var0) {
    DummyClass55.fileUnpacker18 = null;
      DummyClass55.aClass61_1424 = null;
      DummyClass55.aShortArrayArray1429 = null;
      DummyClass55.landscapeFileIds = null;
      DummyClass55.aClass3_Sub24_Sub4_1421 = null;
      DummyClass55.cacheDataFile = null;
      DummyClass55.aClass153_1423 = null;
      if (var0 != 110) {
        DummyClass55.method1607(46, 78, true, null, null);
      }

      DummyClass55.aClass153_1420 = null;
  }

  public static void method1609(int var0) {
    MapScene.anInterface5Array70 = null;
      if (var0 <= 49) {
        DummyClass55.method1608((byte) 96);
      }

      SomethingGl.method1455();
  }

}
