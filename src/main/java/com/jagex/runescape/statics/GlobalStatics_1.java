package com.jagex.runescape.statics;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.common.Queue;
import com.jagex.runescape.model.SoftwareModel;
import com.jagex.runescape.model.SomethingWorldMapy;
import com.jagex.runescape.node.Deque;

public class GlobalStatics_1 {

  public static int anInt1462;
  public static int anInt1463 = -16 + (int) (Math.random() * 33.0D);
  public static long aLong1465;
  public static GameString aClass94_1466 = GameStringStatics
      .create("Lade Titelbild )2 ");
  public static HashTable aClass130_2194 = new HashTable(16);
  public static int anInt2195;
  public static int[] mapFileIds;
  public static GameString aClass94_2196 = GlobalStatics_8.aClass94_2198;
  public static GameString aClass94_2197 = GlobalStatics_8.aClass94_2198;
  public static SoftwareModel aClass140_Sub1_Sub2_3902 = new SoftwareModel();
  public static int[] anIntArray3904 = new int[1];
  public static int[] anIntArray3905 = new int[1];
  public static SoftwareModel aClass140_Sub1_Sub2_3906 = new SoftwareModel();
  public static byte[] aByteArray3907 = new byte[1];
  public static int[] anIntArray3909 = new int[1];
  public static short[] aShortArray3910 = new short[1];
  public static int[] anIntArray3911 = new int[1];
  public static short[] aShortArray3912 = new short[1];
  public static int[] anIntArray3913 = new int[1];
  public static byte[] aByteArray3914 = new byte[1];
  public static SoftwareModel aClass140_Sub1_Sub2_3915 = new SoftwareModel();
  public static int[] anIntArray3916 = new int[1];
  public static boolean[] aBooleanArray3917 = new boolean[4096];
  public static int[] anIntArray3918 = new int[12];
  public static int[] anIntArray3919 = new int[10];
  public static int[] anIntArray3920 = new int[4096];
  public static int[] anIntArray3921;
  public static int[] anIntArray3922 = new int[4096];
  public static int[][] anIntArrayArray3923;
  public static int[] anIntArray3924;
  public static int[] anIntArray3925 = new int[10];
  public static int[][] anIntArrayArray3926;
  public static boolean aBoolean3927;
  public static int[] anIntArray3928;
  public static int[] anIntArray3929;
  public static int anInt3930;
  public static int[] anIntArray3931;
  public static int[] anIntArray3932 = new int[4096];
  public static byte[] aByteArray3933 = new byte[1];
  public static int anInt3934;
  public static int[] anIntArray3935;
  public static int[] anIntArray3936 = new int[10];
  public static boolean[] aBooleanArray3937 = new boolean[4096];
  public static int[][] anIntArrayArray3938;
  public static int[] anIntArray3939;
  public static int anInt3940;
  public static int[] anIntArray3941 = new int[4096];
  public static boolean aBoolean3942;
  public static int[] anIntArray3943;
  public static int[] anIntArray3944 = new int[12];
  public static int anInt3945;
  public static int[] anIntArray3946;
  public static int[] anIntArray3947 = new int[1];
  public static int[] anIntArray3948 = new int[4096];
  public static short[] aShortArray3949;
  public static int[] anIntArray3950;
  public static Deque stillGraphics = new Deque();
  public static int REGION_HEIGHT;
  public static int[] updatedMapIds;
  public static GameString COMMAND_WM3 = GameStringStatics.create("::wm3");
  public static int[] anIntArray3185 = new int[25];
  public static int anInt3187;

  static {
    for (int var0 = 0; var0 < 256; ++var0) {
      int var1 = GlobalStatics_2.aString597.indexOf(var0);
      if (var1 == -1) {
        var1 = 74;
      }

      GlobalStatics_2.anIntArray599[var0] = var1 * 9;
    }

    int var0 = 2;
    for (int var1 = 0; var1 < 32; ++var1) {
      GlobalStatics_9.BIT_MASKS[var1] = -1 + var0;
      var0 += var0;
    }
    GlobalStatics_9.anInt2291 = 1;
  }

  public static void clear80(int var0) {
    GlobalStatics_1.aClass94_1466 = null;
    if (var0 != 33) {
      GlobalStatics_1.anInt1463 = 15;
    }
  }

  public static Queue method1664(int var0, int var1, byte var2) {
    Queue var3 = new Queue();

    for (
        SomethingWorldMapy var4 = (SomethingWorldMapy) DummyClass21.aClass61_1758
            .getFirst();
        var4 != null;
        var4 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getNext()) {
      if (var4.aBoolean3553 && var4.method537(var1, (byte) 97, var0)) {
        var3.addLast(var4);
      }
    }

    return var3;
  }

  public static void method1665(int var0, int var1, int var2, int var3,
      int var4, int var5,
      int var6) {
    int var7 = var5 + var2;
    int var8 = -var5 + var4;
    if (var0 != -19619) {
      GlobalStatics_1.method1665(-17, 11, -118, -38, 115, -2, 113);
    }

    int var9 = var5 + var6;

    int var11;
    for (var11 = var2; var11 < var7; ++var11) {
      GlobalStatics_10
          .method282(DummyClass35.anIntArrayArray663[var11], var6, -91, var1,
              var3);
    }

    for (var11 = var4; var8 < var11; --var11) {
      GlobalStatics_10
          .method282(DummyClass35.anIntArrayArray663[var11], var6, -113, var1,
              var3);
    }

    int var10 = -var5 + var1;

    for (var11 = var7; var8 >= var11; ++var11) {
      int[] var12 = DummyClass35.anIntArrayArray663[var11];
      GlobalStatics_10.method282(var12, var6, -111, var9, var3);
      GlobalStatics_10.method282(var12, var10, -124, var1, var3);
    }
  }

  public static void method1935() {
    GlobalStatics_1.aBoolean3942 = true;
    GlobalStatics_1.anIntArray3931 = new int[4096];
    GlobalStatics_1.anIntArray3929 = new int[4096];
    GlobalStatics_1.anIntArray3946 = null;
    GlobalStatics_1.anIntArrayArray3926 = null;
    GlobalStatics_1.anIntArray3935 = null;
    GlobalStatics_1.anIntArrayArray3923 = null;
  }

  public static int method1937(int var0) {
    if (var0 < 2) {
      var0 = 2;
    } else if (var0 > 126) {
      var0 = 126;
    }

    return var0;
  }

  public static void method1938() {
    GlobalStatics_1.aBoolean3942 = false;
    GlobalStatics_1.anIntArray3931 = null;
    GlobalStatics_1.anIntArray3929 = null;
    GlobalStatics_1.anIntArray3946 = new int[1600];
    GlobalStatics_1.anIntArrayArray3926 = new int[1600][64];
    GlobalStatics_1.anIntArray3935 = new int[32];
    GlobalStatics_1.anIntArrayArray3923 = new int[32][512];
  }

  public static int repackHSL(int hsl, int lightness) {
    lightness = lightness * (hsl & 127) >> 7;
    if (lightness < 2) {
      lightness = 2;
    } else if (lightness > 126) {
      lightness = 126;
    }

    return (hsl & 0xff80) + lightness;
  }

  public static void lear71() {
    GlobalStatics_1.aClass140_Sub1_Sub2_3902 = null;
    GlobalStatics_1.aByteArray3907 = null;
    GlobalStatics_1.aShortArray3910 = null;
    GlobalStatics_1.anIntArray3905 = null;
    GlobalStatics_1.anIntArray3909 = null;
    GlobalStatics_1.anIntArray3904 = null;
    GlobalStatics_1.aClass140_Sub1_Sub2_3906 = null;
    GlobalStatics_1.aByteArray3914 = null;
    GlobalStatics_1.aShortArray3912 = null;
    GlobalStatics_1.anIntArray3913 = null;
    GlobalStatics_1.anIntArray3916 = null;
    GlobalStatics_1.anIntArray3911 = null;
    GlobalStatics_1.aClass140_Sub1_Sub2_3915 = null;
    GlobalStatics_1.aByteArray3933 = null;
    GlobalStatics_1.aShortArray3949 = null;
    GlobalStatics_1.anIntArray3939 = null;
    GlobalStatics_1.anIntArray3947 = null;
    GlobalStatics_1.anIntArray3924 = null;
    GlobalStatics_1.aBooleanArray3937 = null;
    GlobalStatics_1.aBooleanArray3917 = null;
    GlobalStatics_1.anIntArray3943 = null;
    GlobalStatics_1.anIntArray3932 = null;
    GlobalStatics_1.anIntArray3920 = null;
    GlobalStatics_1.anIntArray3950 = null;
    GlobalStatics_1.anIntArray3948 = null;
    GlobalStatics_1.anIntArray3928 = null;
    GlobalStatics_1.anIntArray3921 = null;
    GlobalStatics_1.anIntArray3946 = null;
    GlobalStatics_1.anIntArrayArray3926 = null;
    GlobalStatics_1.anIntArray3935 = null;
    GlobalStatics_1.anIntArrayArray3923 = null;
    GlobalStatics_1.anIntArray3931 = null;
    GlobalStatics_1.anIntArray3929 = null;
    GlobalStatics_1.anIntArray3918 = null;
    GlobalStatics_1.anIntArrayArray3938 = null;
    GlobalStatics_1.anIntArray3922 = null;
    GlobalStatics_1.anIntArray3941 = null;
    GlobalStatics_1.anIntArray3944 = null;
    GlobalStatics_1.anIntArray3919 = null;
    GlobalStatics_1.anIntArray3925 = null;
    GlobalStatics_1.anIntArray3936 = null;
  }

  public static int method1878(int[][] var0, int var1, int var2) {
    int var3 = var1 >> 7;
    int var4 = var2 >> 7;
    if (var3 >= 0 && var4 >= 0 && var3 < var0.length && var4 < var0[0].length) {
      int var5 = var1 & 127;
      int var6 = var2 & 127;
      int var7 =
          var0[var3][var4] * (128 - var5) + var0[var3 + 1][var4] * var5 >> 7;
      int var8 =
          var0[var3][var4 + 1] * (128 - var5) + var0[var3 + 1][var4 + 1] * var5
              >> 7;
      return var7 * (128 - var6) + var8 * var6 >> 7;
    } else {
      return 0;
    }
  }

  public static void method241(byte var0) {
    GlobalStatics_1.updatedMapIds = null;
    GlobalStatics_1.stillGraphics = null;

    GlobalStatics_1.anIntArray3185 = null;
    GlobalStatics_1.COMMAND_WM3 = null;
  }
}
