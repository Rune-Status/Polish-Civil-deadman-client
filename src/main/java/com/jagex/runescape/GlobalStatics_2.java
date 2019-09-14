package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.opengl.SomethingShadows;
import com.jagex.runescape.opengl.GlEnvironment;
import com.jagex.runescape.sprite.SoftwareIndexedColorSprite;

public class GlobalStatics_2 {

  public static GameString aClass94_2215 = GameStringStatics.create("Konfig geladen)3");
  public static int anInt2217 = 2;
  public static int anInt2218 = -1;
  public static short[] aShortArray2219 =
      {(short) -4160, (short) -4163, (short) -8256, (short) -8259, (short) 22461};
  public static HashTable aClass130_2220 = new HashTable(32);
  public static GameString aClass94_2242 = GameStringStatics.create("welle2:");
  public static int anInt2243 = 3353893;
  public static int anInt2246;
  static GameString aClass94_2224 = GameStringStatics.create("Please wait)3)3)3");
  public static GameString aClass94_2216 = aClass94_2224;

  public static void method102(int var0) {
    aClass130_2220 = null;
    if (var0 != 3353893) {
      aClass94_2216 = null;
    }

    aShortArray2219 = null;
    aClass94_2242 = null;
    aClass94_2215 = null;
    aClass94_2224 = null;
    aClass94_2216 = null;
  }

  public static void method103(byte var0) {
    GlobalStatics_1.aClass130_2194.clear(122);
    if (var0 <= 18) {
      aClass94_2224 = null;
    }

    DummyClass50.aClass13_1139.clear();
    SomethingTilek.aClass13_1666.clear();
  }

  public static void method2037(int var0, int var1, boolean var2, boolean var3,
      int var4, int var5,
      int var6, int var7, int var8, int var9) {
    if (!var2 || !var3) {
      if (!var2 || var0 != 1) {
        if (!var3 || var0 != 0) {
          int var10 = var4 << 7;
          int var11 = var6 + var7 + var8 + var9 >> 2;
          int var12 = var5 << 7;
          int var13 = var10 - (var11 * GlEnvironment.anInt1314 >> 8) >> 3;
          int var14 = var12 - (var11 * GlEnvironment.anInt1315 >> 8) >> 3;
          if (var0 != 0 && var0 != 1 && (var2 || var3)) {
            method2050(SomethingShadows.floorShadows[var0],
                SomethingShadows.shadowsSprite, var13 + 1, var14 + 1, var1,
                    var2);
          } else {
            SomethingShadows.method2034(SomethingShadows.floorShadows[1],
                SomethingShadows.shadowsSprite, var13 + 1, var14 + 1);
          }
        }
      }
    }
  }

  public static void method2046(byte[] var0, byte[] var1, int var2, int var3,
      int var4,
      int var5, int var6) {
    for (int var7 = -16; var7 < 0; ++var7) {
      for (int var8 = -4; var8 < 0; ++var8) {
        int var10001 = var3++;
        var0[var10001] = (byte) (var0[var10001] + (1 - var1[var2]));
        var2 += var5;
        var10001 = var3++;
        var0[var10001] = (byte) (var0[var10001] + (1 - var1[var2]));
        var2 += var5;
        var10001 = var3++;
        var0[var10001] = (byte) (var0[var10001] + (1 - var1[var2]));
        var2 += var5;
        var10001 = var3++;
        var0[var10001] = (byte) (var0[var10001] + (1 - var1[var2]));
        var2 += var5;
      }

      var3 += var4;
      var2 += var6;
    }

  }

  public static void method2048(byte[] var0, byte[] var1, int var2, int var3,
      int var4,
      int var5, int var6) {
    for (int var7 = -16; var7 < 0; ++var7) {
      for (int var8 = -4; var8 < 0; ++var8) {
        int var10001 = var3++;
        var0[var10001] += var1[var2];
        var2 += var5;
        var10001 = var3++;
        var0[var10001] += var1[var2];
        var2 += var5;
        var10001 = var3++;
        var0[var10001] += var1[var2];
        var2 += var5;
        var10001 = var3++;
        var0[var10001] += var1[var2];
        var2 += var5;
      }

      var3 += var4;
      var2 += var6;
    }

  }

  private static void method2050(SoftwareIndexedColorSprite var0,
      SoftwareIndexedColorSprite var1, int var2, int var3,
      int var4, boolean var5) {
    if (var2 > 0 && var3 > 0 && var2 + 16 < var1.width
        && var3 + 16 < var1.height) {
      int var6 = var2 + var3 * var1.width;
      int var7 = var1.width - 16;
      short var8;
      byte var9;
      int var10;
      if (var4 == 0) {
        var8 = 240;
        var9 = 1;
        var10 = -var9 * 16 - 16;
      } else if (var4 == 1) {
        var8 = 255;
        var9 = -16;
        var10 = -var9 * 16 - 1;
      } else if (var4 == 2) {
        var8 = 15;
        var9 = -1;
        var10 = -var9 * 16 + 16;
      } else {
        var8 = 0;
        var9 = 16;
        var10 = -var9 * 16 + 1;
      }

      if (var5) {
        method2046(var1.aByteArray2674, var0.aByteArray2674, var8, var6,
                var7, var9, var10);
      } else {
        method2048(var1.aByteArray2674, var0.aByteArray2674, var8, var6,
                var7, var9, var10);
      }

      SomethingShadows.method2036(var2, var3, 16, 16);
    }
  }
}
