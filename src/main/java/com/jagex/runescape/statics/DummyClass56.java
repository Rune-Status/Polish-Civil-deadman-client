package com.jagex.runescape.statics;

import com.jagex.runescape.model.Widget;
import com.jagex.runescape.model.WidgetUpdate;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.FileUnpacker;
import com.jagex.runescape.model.Mobile;

public final class DummyClass56 {

  public static int spawnSceneY;
  public static Widget aClass11_1453;
  public static GameString[] aClass94Array1454;
  public static GameString aClass94_1455 = GameStringStatics
      .create(" loggt sich aus)3");

  public static void method1645(FileUnpacker var0, FileUnpacker var1,
      byte var2) {
    GlobalStatics_9.sprites = var1;
    int var4 = (int) (21.0D * Math.random()) - 10;
    GlobalStatics_9.configs = var0;
    int var5 = (int) (21.0D * Math.random()) - 10;
    GlobalStatics_9.configs.getAmountChildren(34, (byte) 103);
    int var3 = (int) (Math.random() * 21.0D) - 10;
    int var6 = -20 + (int) (41.0D * Math.random());
    GlobalStatics_5.anInt2015 = var6 + var5;
    if (var2 == -67) {
      DummyClass39.anInt740 = var4 + var6;
      GlobalStatics_9.anInt2136 = var6 + var3;
    }
  }

  public static void method1646(boolean var0) {
    DummyClass56.aClass94_1455 = null;

    DummyClass56.aClass94Array1454 = null;
    DummyClass56.aClass11_1453 = null;
  }

  public static void method1647(byte var0, int var1, int var2, Mobile var3,
      int var4, int var5,
      int var6) {
    if (var0 != 122) {
      DummyClass56.method1648(null, 7);
    }

    GlobalStatics_5
        .method1724(var6, var2, var3.anInt2829, var5, var1, var3.anInt2819,
            (byte) -85, var4);
  }

  public static void method1648(FileUnpacker var0, int var1) {
    DummyClass55.aClass153_1420 = var0;
    if (var1 != 255) {
      DummyClass56.spawnSceneY = -56;
    }
  }

  public static void method1649(int var0, int var1) {
    if (var1 <= -65) {
      WidgetUpdate var2 = GlobalStatics_6.method466(4, 10, var0);
      var2.createIndexedColorSprite(true);
    }
  }

  public static void method1650(int var0) {
    GlobalStatics_0.aClass93_939.method1523();
    if (var0 != 21) {
      DummyClass56.aClass11_1453 = null;
    }
  }

  public static int method1651(int var0, int var1, int var2) {
    int var3;
    if (var2 < var1) {
      var3 = var2;
      var2 = var1;
      var1 = var3;
    }

    while (var1 != 0) {
      var3 = var2 % var1;
      var2 = var1;
      var1 = var3;
    }

    if (var0 != 19067) {
      DummyClass56.aClass94Array1454 = null;
    }

    return var2;
  }

}
