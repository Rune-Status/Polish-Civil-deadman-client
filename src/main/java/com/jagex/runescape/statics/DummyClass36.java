package com.jagex.runescape.statics;

import com.jagex.runescape.model.Widget;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.AbstractDirectColorSprite;
import com.jagex.runescape.model.AudioWorker;
import com.jagex.runescape.model.SoftwareDirectColorSprite;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlDirectColorSprite;
import com.jagex.runescape.opengl.GlRenderer;

public final class DummyClass36 {

  public static int[][][] anIntArrayArrayArray2609;
  public static GameString aClass94_2610 = GameStringStatics.create(")1o");
  public static String aString2611;
  public static int anInt2612;
  public static AudioWorker aClass15_2613;
  public static int anInt2614;
  public static boolean aBoolean2615;
  public static GameString aClass94_2616 = GameStringStatics
      .create("blinken3:");
  public static int updateTime;
  public static int anInt2618;

  public static void method1030(Widget var0, AbstractDirectColorSprite var1,
      int var2, int var3,
      int var4, byte var5, int var6) {
    if (var1 != null) {
      if (var5 != 11) {
        DummyClass36.clear87(true);
      }

      int var9 = var3 * var3 + var2 * var2;
      int var7 = 2047 & GlobalStatics_9.anInt3102 + GlobalStatics_9.anInt531;
      int var8 = Math.max(var0.anInt168 / 2, var0.anInt193 / 2) + 10;
      if (var8 * var8 >= var9) {
        int var10 = GLStatics.SINE_TABLE[var7];
        var10 = var10 * 256 / (GlobalStatics_9.anInt3020 + 256);
        int var11 = DummyClass40.COSINE_TABLE[var7];
        var11 = 256 * var11 / (256 + GlobalStatics_9.anInt3020);
        int var12 = var10 * var2 + var3 * var11 >> 16;
        int var13 = var11 * var2 - var3 * var10 >> 16;
        if (GlRenderer.USE_OPENGL) {
          ((GlDirectColorSprite) var1).method645(
              var0.anInt168 / 2 + var6 + var12 - var1.anInt3697 / 2,
              var0.anInt193 / 2 + var4 - (var13 + var1.anInt3706 / 2),
              (GlDirectColorSprite) var0.method866((byte) -113, false));
        } else {
          ((SoftwareDirectColorSprite) var1).method666(
              var0.anInt168 / 2 + var6 + var12 - var1.anInt3697 / 2,
              -(var1.anInt3706 / 2) + var0.anInt193 / 2 + var4 - var13,
              var0.anIntArray207,
              var0.anIntArray291);
        }

      }
    }
  }

  public static int method1031(int var0, int var1) {
    if (var1 != 2) {
      DummyClass36.aClass94_2610 = null;
    }

    return var0 >>> 7;
  }

  public static void clear87(boolean var0) {
    DummyClass36.anIntArrayArrayArray2609 = null;
    DummyClass36.aString2611 = null;
    DummyClass36.aClass94_2616 = null;
    DummyClass36.aClass94_2610 = null;
    DummyClass36.aClass15_2613 = null;
    if (var0) {
      DummyClass36.clear87(true);
    }
  }

}
