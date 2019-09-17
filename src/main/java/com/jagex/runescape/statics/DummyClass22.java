package com.jagex.runescape.statics;

import com.jagex.runescape.model.SpawnedGameObject;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.FileUnpacker;
import com.jagex.runescape.opengl.GLStatics;

public final class DummyClass22 {

  public static int anInt1734;
  public static FileUnpacker particles;
  public static int anInt1736;
  public static int minimumDelta = 1;
  public static GameString aClass94_1738 = GameStringStatics
      .create("<col=ffff00>");
  public static GameString[] aClass94Array1739 = new GameString[1000];
  public static int anInt1740;
  public static int anInt1741;

  public static void method1798(int var0, SpawnedGameObject var1) {
    long var2 = 0L;
    int var4 = -1;
    if (var0 <= 17) {
      DummyClass22.anInt1740 = -43;
    }

    int var5 = 0;
    if (var1.anInt2263 == 0) {
      var2 = GlobalStatics_9
          .method2174(var1.anInt2250, var1.anInt2264, var1.anInt2248);
    }

    int var6 = 0;
    if (var1.anInt2263 == 1) {
      var2 = GlobalStatics_9
          .method1395(var1.anInt2250, var1.anInt2264, var1.anInt2248);
    }

    if (var1.anInt2263 == 2) {
      var2 = GlobalStatics_6
          .method557(var1.anInt2250, var1.anInt2264, var1.anInt2248);
    }

    if (var1.anInt2263 == 3) {
      var2 = GLStatics
          .method104(var1.anInt2250, var1.anInt2264, var1.anInt2248);
    }

    if (var2 != 0L) {
      var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
      var6 = (int) var2 >> 20 & 3;
      var5 = ((int) var2 & 516214) >> 14;
    }

    var1.anInt2254 = var4;
    var1.anInt2253 = var5;
    var1.anInt2257 = var6;
  }

  public static void method1799(byte var0, FileUnpacker var1) {
    GlobalStatics_10.aClass153_3098 = var1;
  }

  public static void method1800(byte var0) {
    DummyClass22.aClass94Array1739 = null;
    DummyClass22.aClass94_1738 = null;
    DummyClass22.particles = null;
  }

  public static void method1801(byte var0) {
    if (var0 >= -94) {
      DummyClass22.method1799((byte) -90, null);
    }

    int var1 = GlobalStatics_8.aClass3_Sub28_Sub17_2096
        .method682(GlobalStatics_9.aClass94_2667);

    int var2;
    int var3;
    for (var2 = 0; GlobalStatics_10.amountContextActions > var2; ++var2) {
      var3 = GlobalStatics_8.aClass3_Sub28_Sub17_2096.method682(
          GlobalStatics_0.method802(var2, true));
      if (var3 > var1) {
        var1 = var3;
      }
    }

    var2 = 15 * GlobalStatics_10.amountContextActions + 21;
    int var4 = DummyClass36.anInt2612;
    var1 += 8;
    var3 = GlobalStatics_9.anInt1297 - var1 / 2;
    if (var4 + var2 > GlobalStatics_9.viewHeight) {
      var4 = GlobalStatics_9.viewHeight - var2;
    }

    if (DummyClass30.viewWidth < var3 + var1) {
      var3 = -var1 + DummyClass30.viewWidth;
    }

    if (var3 < 0) {
      var3 = 0;
    }

    if (var4 < 0) {
      var4 = 0;
    }

    if (GlobalStatics_7.anInt3660 == 1) {
      if (GlobalStatics_9.anInt1297 == GlobalStatics_9.anInt3460
          && GlobalStatics_8.anInt2099 == DummyClass36.anInt2612) {
        GlobalStatics_9.anInt3537 =
            GlobalStatics_10.amountContextActions * 15 + (
                GlobalStatics_8.aBoolean1951 ? 26 : 22);
        GlobalStatics_7.anInt3660 = 0;
        GlobalStatics_10.anInt3395 = var4;
        GlobalStatics_1.anInt1462 = var3;
        DummyClass36.aBoolean2615 = true;
        GlobalStatics_9.anInt3552 = var1;
      }
    } else if (GlobalStatics_9.anInt1297 == DummyClass5.anInt2993
        && DummyClass36.anInt2612 == DummyClass36.anInt2614) {
      GlobalStatics_1.anInt1462 = var3;
      GlobalStatics_7.anInt3660 = 0;
      GlobalStatics_9.anInt3552 = var1;
      GlobalStatics_10.anInt3395 = var4;
      GlobalStatics_9.anInt3537 =
          (GlobalStatics_8.aBoolean1951 ? 26 : 22)
              + GlobalStatics_10.amountContextActions * 15;
      DummyClass36.aBoolean2615 = true;
    } else {
      GlobalStatics_8.anInt2099 = DummyClass36.anInt2614;
      GlobalStatics_9.anInt3460 = DummyClass5.anInt2993;
      GlobalStatics_7.anInt3660 = 1;
    }
  }

}
