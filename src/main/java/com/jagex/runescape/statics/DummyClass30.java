package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.Mouse;
import com.jagex.runescape.opengl.GLStatics;

public final class DummyClass30 {

  public static GameString aClass94_458 = GameStringStatics
      .create("Opened title screen");
  public static int anInt452;
  public static int anInt453;
  public static int viewWidth;
  public static int anInt455;
  public static int anInt456;
  public static GameString aClass94_459 = DummyClass30.aClass94_458;

  public static void method937(int var0) {
    GLStatics.adjacentTileOnScreen = null;
    DummyClass30.aClass94_458 = null;

    DummyClass30.aClass94_459 = null;
  }

  public static void method938(int var0, int var1, int var2, int var3, int var4,
      int var5, int var6,
      int var7, int var8) {
    if (var6 != 1) {
      DummyClass30.aClass94_458 = null;
    }

    int var9 = var2 - var7;
    int var10 = var3 - var8;
    int var11 = (-var1 + var0 << 16) / var9;
    int var12 = (-var5 + var4 << 16) / var10;
    GlobalStatics_9
        .method1814(var1, var3, var2, var12, var7, 0, 0, 127, var11, var8,
            var5);
  }

  public static void method940(int var0, int var1) {
    if (var0 >= 101) {
      Mouse var2 = GlobalStatics_9.INSTANCE;
      synchronized (var2) {
        GlobalStatics_9.anInt4045 = var1;
      }
    }
  }

}
