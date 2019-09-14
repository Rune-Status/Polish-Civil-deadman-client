package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.node.Node;

public class GlobalStatics_1 {

  public static int anInt1462;
  public static int anInt1463 = -16 + (int) (Math.random() * 33.0D);
  public static long aLong1465;
  public static GameString aClass94_1466 = GameStringStatics.create("Lade Titelbild )2 ");
  static SoftwareModel aClass140_Sub1_Sub2_3902 = new SoftwareModel();
  static int[] anIntArray3904 = new int[1];
  static int[] anIntArray3905 = new int[1];
  static SoftwareModel aClass140_Sub1_Sub2_3906 = new SoftwareModel();
  static byte[] aByteArray3907 = new byte[1];
  static int[] anIntArray3909 = new int[1];
  static short[] aShortArray3910 = new short[1];
  static int[] anIntArray3911 = new int[1];
  static short[] aShortArray3912 = new short[1];
  static int[] anIntArray3913 = new int[1];
  static byte[] aByteArray3914 = new byte[1];
  static SoftwareModel aClass140_Sub1_Sub2_3915 = new SoftwareModel();
  static int[] anIntArray3916 = new int[1];
  static boolean[] aBooleanArray3917 = new boolean[4096];
  static int[] anIntArray3918 = new int[12];
  static int[] anIntArray3919 = new int[10];
  static int[] anIntArray3920 = new int[4096];
  static int[] anIntArray3921;
  static int[] anIntArray3922 = new int[4096];
  static int[][] anIntArrayArray3923;
  static int[] anIntArray3924;
  static int[] anIntArray3925 = new int[10];
  static int[][] anIntArrayArray3926;
  static boolean aBoolean3927;
  static int[] anIntArray3928;
  static int[] anIntArray3929;
  static int anInt3930;
  static int[] anIntArray3931;
  static int[] anIntArray3932 = new int[4096];
  static byte[] aByteArray3933 = new byte[1];
  static int anInt3934;
  static int[] anIntArray3935;
  static int[] anIntArray3936 = new int[10];
  static boolean[] aBooleanArray3937 = new boolean[4096];
  static int[][] anIntArrayArray3938;
  static int[] anIntArray3939;
  static int anInt3940;
  static int[] anIntArray3941 = new int[4096];
  static boolean aBoolean3942;
  static int[] anIntArray3943;
  static int[] anIntArray3944 = new int[12];
  static int anInt3945;
  static int[] anIntArray3946;
  static int[] anIntArray3947 = new int[1];
  static int[] anIntArray3948 = new int[4096];
  static short[] aShortArray3949;
  static int[] anIntArray3950;

  public static void addLast(Node first, Node second) {
    if (first.prevNode != null) {
      first.unlinkNode();
    }

    first.nextNode = second;
    first.prevNode = second.prevNode;
    first.prevNode.nextNode = first;
    first.nextNode.prevNode = first;
  }

  public static void method1663(int var0) {
    aClass94_1466 = null;
    if (var0 != 33) {
      anInt1463 = 15;
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

  public static void method1665(int var0, int var1, int var2, int var3, int var4, int var5,
                               int var6) {
    int var7 = var5 + var2;
    int var8 = -var5 + var4;
    if (var0 != -19619) {
      method1665(-17, 11, -118, -38, 115, -2, 113);
    }

    int var9 = var5 + var6;

    int var11;
    for (var11 = var2; (var11 < var7); ++var11) {
      TextureSampler18
          .method282(DummyClass35.anIntArrayArray663[var11], var6, -91, var1,
              var3);
    }

    for (var11 = var4; var8 < var11; --var11) {
      TextureSampler18
          .method282(DummyClass35.anIntArrayArray663[var11], var6, -113, var1,
              var3);
    }

    int var10 = -var5 + var1;

    for (var11 = var7; (var8 >= var11); ++var11) {
      int[] var12 = DummyClass35.anIntArrayArray663[var11];
      TextureSampler18.method282(var12, var6, -111, var9, var3);
      TextureSampler18.method282(var12, var10, -124, var1, var3);
    }
  }

  public static void method1935() {
    aBoolean3942 = true;
    anIntArray3931 = new int[4096];
    anIntArray3929 = new int[4096];
    anIntArray3946 = null;
    anIntArrayArray3926 = null;
    anIntArray3935 = null;
    anIntArrayArray3923 = null;
  }

  static int method1937(int var0) {
    if (var0 < 2) {
      var0 = 2;
    } else if (var0 > 126) {
      var0 = 126;
    }

    return var0;
  }

  public static void method1938() {
    aBoolean3942 = false;
    anIntArray3931 = null;
    anIntArray3929 = null;
    anIntArray3946 = new int[1600];
    anIntArrayArray3926 = new int[1600][64];
    anIntArray3935 = new int[32];
    anIntArrayArray3923 = new int[32][512];
  }

  public static int repackHSL(int hsl, int lightness) {
    lightness = lightness * (hsl & 127) >> 7;
    if (lightness < 2) {
      lightness = 2;
    } else if (lightness > 126) {
      lightness = 126;
    }

    return (hsl & '\uff80') + lightness;
  }

  public static void method1948() {
    aClass140_Sub1_Sub2_3902 = null;
    aByteArray3907 = null;
    aShortArray3910 = null;
    anIntArray3905 = null;
    anIntArray3909 = null;
    anIntArray3904 = null;
    aClass140_Sub1_Sub2_3906 = null;
    aByteArray3914 = null;
    aShortArray3912 = null;
    anIntArray3913 = null;
    anIntArray3916 = null;
    anIntArray3911 = null;
    aClass140_Sub1_Sub2_3915 = null;
    aByteArray3933 = null;
    aShortArray3949 = null;
    anIntArray3939 = null;
    anIntArray3947 = null;
    anIntArray3924 = null;
    aBooleanArray3937 = null;
    aBooleanArray3917 = null;
    anIntArray3943 = null;
    anIntArray3932 = null;
    anIntArray3920 = null;
    anIntArray3950 = null;
    anIntArray3948 = null;
    anIntArray3928 = null;
    anIntArray3921 = null;
    anIntArray3946 = null;
    anIntArrayArray3926 = null;
    anIntArray3935 = null;
    anIntArrayArray3923 = null;
    anIntArray3931 = null;
    anIntArray3929 = null;
    anIntArray3918 = null;
    anIntArrayArray3938 = null;
    anIntArray3922 = null;
    anIntArray3941 = null;
    anIntArray3944 = null;
    anIntArray3919 = null;
    anIntArray3925 = null;
    anIntArray3936 = null;
  }
}
