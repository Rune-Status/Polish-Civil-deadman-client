package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import java.awt.Canvas;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public final class DummyCanvas extends Canvas implements FocusListener {

  public static int anInt14;
  public static int anInt15;
  public static int anInt16;
  public static int anInt17;
  public static int anInt18;
  public static int anInt19;
  public static int[][] anIntArrayArray20 = new int[5][5000];
  public static ObjectCache aClass93_21 = new ObjectCache(64);
  public static GameString aClass94_22 = GameStringStatics.create("leuchten3:");
  public static int anInt23;
  public static GameString aClass94_24 =
    GameStringStatics.create("Chargement de RuneScape en cours )2 veuillez patienter)3)3)3");
  public static int anInt25 = 1;
  public static GameString aClass94_26 = GameStringStatics.create("n");

  @Override
  public void focusGained(FocusEvent e) {
  }

  @Override
  public void focusLost(FocusEvent e) {
  }

  public static void method53(int var0) {
    DummyCanvas.aClass93_21 = null;
      DummyCanvas.aClass94_24 = null;
      DummyCanvas.aClass94_22 = null;
      DummyCanvas.anIntArrayArray20 = null;
      DummyCanvas.aClass94_26 = null;
  }

  public static int method54(int var0, boolean var1) {
    return var1 ? -81 : var0 & 127;
  }

  public static void method55(int var0) {
    if (var0 != 22683) {
        DummyCanvas.method53(43);
      }

      DummyCanvas.aClass93_21.method1523((byte) -100);
      DummyClass54.aClass93_1401.method1523((byte) -105);
      GlobalStatics_9.aClass93_4051.method1523((byte) -101);
      DummyClass14.aClass93_1965.method1523((byte) -119);
  }

}
