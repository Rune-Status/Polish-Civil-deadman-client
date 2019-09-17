package com.jagex.runescape.statics;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.ObjectCache;
import com.jagex.runescape.opengl.GlTexture2d;

public final class DummyClass15 {

  public static GameString aClass94_1876 = GameStringStatics
      .create("Loaded fonts");
  public static int anInt1873;
  public static ObjectCache aClass93_1874 = new ObjectCache(50);
  public static int state;
  public static GameString aClass94_1877 = GameStringStatics.create(":assist:");
  public static GameString aClass94_1878 = GameStringStatics
      .create("tremblement:");
  public static GameString aClass94_1880 = GameStringStatics.create(")1");
  public static GameString aClass94_1879 = DummyClass15.aClass94_1876;

  public static void method2062(int var0, int var1, int var2, int var3,
      int var4, int var5, int var6,
      int var7) {
    int var12 =
        DummyClass59.method1040(GlobalStatics_9.anInt902, var6, (byte) 0,
            DummyClass13.anInt2020);
    int var13 =
        DummyClass59.method1040(GlobalStatics_9.anInt902, var3, (byte) 0,
            DummyClass13.anInt2020);
    int var14 =
        DummyClass59.method1040(GlTexture2d.anInt3765, var7, (byte) 0,
            DummyClass55.anInt1425);
    int var15 =
        DummyClass59.method1040(GlTexture2d.anInt3765, var0, (byte) 0,
            DummyClass55.anInt1425);
    int var8 = DummyClass59
        .method1040(GlobalStatics_9.anInt902, var4 + var6, (byte) 0,
            DummyClass13.anInt2020);
    int var9 = DummyClass59
        .method1040(GlobalStatics_9.anInt902, -var4 + var3, (byte) 0,
            DummyClass13.anInt2020);

    int var16;
    for (var16 = var12; var16 < var8; ++var16) {
      GlobalStatics_10
          .method282(DummyClass35.anIntArrayArray663[var16], var14, 97, var15,
              var5);
    }

    for (var16 = var13; var16 > var9; --var16) {
      GlobalStatics_10
          .method282(DummyClass35.anIntArrayArray663[var16], var14, 94, var15,
              var5);
    }

    int var10 = DummyClass59
        .method1040(GlTexture2d.anInt3765, var4 + var7, (byte) 0,
            DummyClass55.anInt1425);
    int var11 = DummyClass59
        .method1040(GlTexture2d.anInt3765, -var4 + var0, (byte) 0,
            DummyClass55.anInt1425);
    if (var2 >= -88) {
      DummyClass15.aClass94_1876 = null;
    }

    for (var16 = var8; var16 <= var9; ++var16) {
      int[] var17 = DummyClass35.anIntArrayArray663[var16];
      GlobalStatics_10.method282(var17, var14, 105, var10, var5);
      GlobalStatics_10.method282(var17, var10, 111, var11, var1);
      GlobalStatics_10.method282(var17, var11, 109, var15, var5);
    }
  }

  public static void method2063(int var0) {
    DummyClass15.aClass94_1878 = null;
    DummyClass15.aClass93_1874 = null;
    DummyClass15.aClass94_1880 = null;
    DummyClass15.aClass94_1877 = null;
    DummyClass15.aClass94_1876 = null;
    if (var0 == 0) {
      DummyClass15.aClass94_1879 = null;
    }
  }

}
