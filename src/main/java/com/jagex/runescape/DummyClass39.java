package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import java.util.Objects;

public final class DummyClass39 {

  public static FileUnpacker aClass153_737;
  public static GameString aClass94_738 = GameStringStatics.create("Monde de jeu cr-B-B");
  public static int anInt739;
  public static int anInt740;
  public static int sunPositionX;


  public static void method1085(int var0) {
    DummyClass39.aClass94_738 = null;
      if (var0 == -1) {
        DummyClass39.aClass153_737 = null;
      }
  }

  public static void method1086(FileUnpacker var0, int var1) {
    DummyClass38.aClass153_731 = var0;
      if (var1 != -6) {
        DummyClass39.aClass153_737 = null;
      }
  }

  public static void method1087(int var0, int var1) {
    GameBuffer.method819(false);
      TextureSampler23.method252(8);
      if (var0 < 38) {
        DummyClass39.sunPositionX = 118;
      }

      int var2 = Objects.requireNonNull(Unsure.getPlayerVariable(-37, var1)).anInt556;
      if (var2 != 0) {
        int var3 = DummyClass5.anIntArray2985[var1];
        if (var2 == 6) {
          FileCache.anInt688 = var3;
        }

        if ((var2 == 5)) {
          OndemandRequester.anInt998 = var3;
        }

        if ((var2 == 9)) {
          DummyCanvas.anInt15 = var3;
        }

      }
  }

}
