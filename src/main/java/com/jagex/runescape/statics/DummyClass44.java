package com.jagex.runescape.statics;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.NPC;

public final class DummyClass44 {

  public static GameString aClass94_931 = GameStringStatics.create("Continue");
  public static int anInt930;
  public static int anInt932;
  public static GameString aClass94_933 =
      GameStringStatics.create("Ladevorgang )2 bitte warten Sie)3");
  public static int anInt934;
  public static int pitchSine;
  public static GameString aClass94_935 = DummyClass44.aClass94_931;

  public static void method1206(byte var0) {
    int var1 = 50 % ((-41 - var0) / 57);
    DummyClass44.aClass94_931 = null;
    DummyClass44.aClass94_933 = null;
    DummyClass44.aClass94_935 = null;
  }

  public static void method1207(int var0) {
    for (int var1 = 0; (var1 < DummyClass6.anInt2046); ++var1) {
      int var2 = GlobalStatics_2.anIntArray347[var1];
      NPC var3 = GlobalStatics_8.npcs[var2];
      if (var3 != null) {
        GlobalStatics_11.method68(var3.config.size, 2279, var3);
      }
    }

    if (var0 > -4) {
      DummyClass44.method1208((byte) 25, 108);
    }
  }

  public static void method1208(byte var0, int var1) {
    if (var1 != -1) {
      if (GlobalStatics_0.aBooleanArray1703[var1]) {
        GlobalStatics_9.aClass153_3361.method2128(7561, var1);
        if (GlobalStatics_9.aClass11ArrayArray1834[var1] != null) {
          boolean var2 = true;

          for (int var3 = 0;
              GlobalStatics_9.aClass11ArrayArray1834[var1].length > var3;
              ++var3) {
            if (GlobalStatics_9.aClass11ArrayArray1834[var1][var3] != null) {
              if ((GlobalStatics_9.aClass11ArrayArray1834[var1][var3].anInt187
                  == 2)) {
                var2 = false;
              } else {
                GlobalStatics_9.aClass11ArrayArray1834[var1][var3] = null;
              }
            }
          }

          int var4 = 43 / ((-70 - var0) / 47);
          if (var2) {
            GlobalStatics_9.aClass11ArrayArray1834[var1] = null;
          }

          GlobalStatics_0.aBooleanArray1703[var1] = false;
        }
      }
    }
  }

}
