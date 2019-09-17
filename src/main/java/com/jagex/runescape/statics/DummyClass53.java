package com.jagex.runescape.statics;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.AbstractDirectColorSprite;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlTexture2d;

public final class DummyClass53 {

  public static GameString aClass94_1334 =
      GameStringStatics
          .create("You can(Wt add yourself to your own ignore list)3");
  public static GameString UM_PREFIX = GameStringStatics.create("um");
  public static int anInt1336;
  public static GameString aClass94_1337 = GameStringStatics
      .create("::breakcon");
  public static int spriteCount;
  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_1339;
  public static volatile int lastMouseY = -1;
  public static GameString LOGO = GameStringStatics.create("logo");
  public static GameString aClass94_1342 = GameStringStatics.create("details");
  public static int anInt1343;
  public static int anInt1344;
  public static GameString aClass94_1335 = DummyClass53.aClass94_1334;

  public static void method1582(int var0) {
    DummyClass53.aClass94_1335 = null;
    DummyClass53.aClass3_Sub28_Sub16_1339 = null;
    DummyClass53.aClass94_1342 = null;
    DummyClass53.UM_PREFIX = null;
    DummyClass53.LOGO = null;
    if (var0 != 3) {
      DummyClass53.lastMouseY = -18;
    }

    DummyClass53.aClass94_1334 = null;
    DummyClass53.aClass94_1337 = null;
  }

  public static void method1583(int var0, int var1, int var2, int var3,
      int var4, int var5, int var6,
      int var7, int var8, int var9) {
    if (var3 != 3) {
      DummyClass53.method1582(45);
    }

    if (var0 == var1 && var9 == var2 && var8 == var7 && var5 == var6) {
      GlobalStatics_10.method330(var4, var3 - 111, var5, var0, var9, var7);
    } else {
      int var10 = var0;
      int var13 = 3 * var9;
      int var12 = 3 * var0;
      int var11 = var9;
      int var14 = var1 * 3;
      int var15 = 3 * var2;
      int var16 = 3 * var8;
      int var17 = var6 * 3;
      int var18 = var14 + var7 - (var16 + var0);
      int var20 = var16 - (var14 + var14) + var12;
      int var19 = var15 - var17 + var5 - var9;
      int var21 = var13 - var15 - var15 + var17;
      int var22 = var14 - var12;
      int var23 = -var13 + var15;

      for (int var24 = 128; var24 <= 4096; var24 += 128) {
        int var25 = var24 * var24 >> 12;
        int var26 = var24 * var25 >> 12;
        int var30 = var21 * var25;
        int var28 = var26 * var19;
        int var29 = var25 * var20;
        int var27 = var18 * var26;
        int var31 = var22 * var24;
        int var33 = var0 + (var29 + var27 + var31 >> 12);
        int var32 = var24 * var23;
        int var34 = var9 + (var32 + var28 + var30 >> 12);
        GlobalStatics_10.method330(var4, -88, var34, var10, var11, var33);
        var10 = var33;
        var11 = var34;
      }
    }
  }

  public static void method1584(int var0, int var1, int var2, int var3,
      int var4, int var5) {
    if (var4 != -26571) {
      DummyClass53.method1586(92, 25);
    }

    if (var1 == var5) {
      GLStatics.method1058(var5, var2, var0, var3);
    } else {
      if (DummyClass55.anInt1425 <= var2 - var5
          && var2 + var5 <= GlTexture2d.anInt3765
          && -var1 + var3 >= DummyClass13.anInt2020
          && var3 + var1 <= GlobalStatics_9.anInt902) {
        GlobalStatics_6.method135(var3, var2, var5, -111, var1, var0);
      } else {
        GlobalStatics_6.method556(var0, var1, var5, (byte) -123, var2, var3);
      }

    }
  }

  public static GameString method1586(int var0, int var1) {
    if (var1 > 0 && var1 <= 255) {
      GameString var2 = new GameString();
      if (var0 != 23161) {
        DummyClass53.aClass3_Sub28_Sub16_1339 = null;
      }

      var2.length = 1;
      var2.bytes = new byte[1];
      var2.bytes[0] = (byte) var1;
      return var2;
    } else {
      throw new IllegalArgumentException();
    }
  }

}
