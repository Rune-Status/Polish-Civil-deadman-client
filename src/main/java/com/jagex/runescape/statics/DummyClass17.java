package com.jagex.runescape.statics;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.AbstractDirectColorSprite;
import java.awt.FontMetrics;

public final class DummyClass17 {

  public static FontMetrics aFontMetrics1822;
  public static int screenLowerX;
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array1825;
  public static GameString aClass94_1826 = GameStringStatics
      .create("<col=00ffff>");
  public static boolean aBoolean1827;
  public static byte[][][] tileFloors;
  public static int anInt1829;
  public static GameString aClass94_1830 = GameStringStatics
      .create("::pcachesize");

  public static void clear102(int var0) {
    DummyClass17.aClass94_1830 = null;
    DummyClass17.tileFloors = null;
    DummyClass17.aFontMetrics1822 = null;
    DummyClass17.aClass94_1826 = null;

    DummyClass17.aClass3_Sub28_Sub16Array1825 = null;
  }

}
