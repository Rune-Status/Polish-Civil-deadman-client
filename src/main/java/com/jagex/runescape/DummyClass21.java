package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.node.Deque;

public final class DummyClass21 {

  public static Deque aClass61_1758 = new Deque();
  public static int anInt1759;
  public static int anInt1761 = -1;
  public static int anInt1762;
  public static int[][] anIntArrayArray1763 = {
    {0, 128, 0, 0, 128, 0, 128, 128}, {0, 128, 0, 0, 128, 0}, {0, 0, 64, 128, 0, 128},
    {128, 128, 64, 128, 128, 0}, {0, 0, 128, 0, 128, 128, 64, 128}, {0, 128, 0, 0, 128, 0, 64, 128},
    {64, 128, 0, 128, 0, 0, 64, 0}, {0, 0, 64, 0, 0, 64}, {128, 0, 128, 128, 0, 128, 0, 64, 64, 0},
    {0, 128, 0, 0, 32, 64, 64, 96, 128, 128}, {0, 0, 128, 0, 128, 128, 64, 96, 32, 64},
    {0, 0, 128, 0, 96, 32, 32, 32}
  };
  public static GameString HEAD_ICONS_PRAYER = GameStringStatics.create("headicons_prayer");
  public static boolean aBoolean1765;
  public static long[] updateMemory = new long[32];

  public static void method1808(int var0, boolean var1, byte var2, int var3, boolean var4) {
    GlobalStatics_7.method1047(var0, var3, TextureSampler15.aClass44_Sub1Array3201.length - 1, var4, 0,
        var1, false);
      if (var2 != 30) {
        GameStringStatics.aClass94_1760 = null;
      }
  }

  public static void method1809(int var0, long[] var1, int var2, int var3, Object[] var4) {
    if (var2 < 85) {
        DummyClass21.aClass61_1758 = null;
      }

      if ((var3 < var0)) {
        int var6 = var3;
        int var5 = (var3 + var0) / 2;
        long var7 = var1[var5];
        var1[var5] = var1[var0];
        var1[var0] = var7;
        Object var9 = var4[var5];
        var4[var5] = var4[var0];
        var4[var0] = var9;

        for (int var10 = var3; var0 > var10; ++var10) {
          if (var7 + (1 & var10) > var1[var10]) {
            long var11 = var1[var10];
            var1[var10] = var1[var6];
            var1[var6] = var11;
            Object var13 = var4[var10];
            var4[var10] = var4[var6];
            var4[var6++] = var13;
          }
        }

        var1[var0] = var1[var6];
        var1[var6] = var7;
        var4[var0] = var4[var6];
        var4[var6] = var9;
        DummyClass21.method1809(-1 + var6, var1, 107, var3, var4);
        DummyClass21.method1809(var0, var1, 89, var6 + 1, var4);
      }
  }

  public static void method1806() {
    DummyClass21.HEAD_ICONS_PRAYER = null;
    DummyClass21.aClass61_1758 = null;
    DummyClass21.anIntArrayArray1763 = null;
    DummyClass21.updateMemory = null;
    GameStringStatics.aClass94_1760 = null;
  }
}
