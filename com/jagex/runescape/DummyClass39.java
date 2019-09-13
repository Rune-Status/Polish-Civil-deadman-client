package com.jagex.runescape;

import java.util.Objects;

public final class DummyClass39 {

  public static FileUnpacker aClass153_737;
  public static GameString aClass94_738 = GameString.create("Monde de jeu cr-B-B");
  public static int anInt739;
  public static int anInt740;
  public static int sunPositionX;


  public static void method1085(int var0) {
    try {
      DummyClass39.aClass94_738 = null;
      if (var0 == -1) {
        DummyClass39.aClass153_737 = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "gl.B(" + var0 + ')');
    }
  }

  public static void method1086(FileUnpacker var0, int var1) {
    try {
      DummyClass38.aClass153_731 = var0;
      if (var1 != -6) {
        DummyClass39.aClass153_737 = null;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "gl.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  public static void method1087(int var0, int var1) {
    try {
      GameBuffer.method819(false);
      TextureSampler23.method252(8);
      if (var0 < 38) {
        DummyClass39.sunPositionX = 118;
      }

      int var2 = Objects.requireNonNull(Unsure.getPlayerVariable(-37, var1)).anInt556;
      if (var2 != 0) {
        int var3 = DummyClass5.anIntArray2985[var1];
        if (6 == var2) {
          FileCache.anInt688 = var3;
        }

        if (-6 == ~var2) {
          OndemandRequester.anInt998 = var3;
        }

        if (-10 == ~var2) {
          DummyCanvas.anInt15 = var3;
        }

      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "gl.A(" + var0 + ',' + var1 + ')');
    }
  }

}
