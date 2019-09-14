package com.jagex.runescape;

public final class DummyClass44 {

  private static GameString aClass94_931 = GameString.create("Continue");
  public static int anInt930;
  public static int anInt932;
  public static GameString aClass94_933 =
    GameString.create("Ladevorgang )2 bitte warten Sie)3");
  public static int anInt934;
  public static int pitchSine;
  public static GameString aClass94_935 = DummyClass44.aClass94_931;

  public static void method1206(byte var0) {
    try {
      int var1 = 50 % ((-41 - var0) / 57);
      DummyClass44.aClass94_931 = null;
      DummyClass44.aClass94_933 = null;
      DummyClass44.aClass94_935 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "ig.C(" + var0 + ')');
    }
  }

  public static void method1207(int var0) {
    try {
      for (int var1 = 0; ~var1 > ~DummyClass6.anInt2046; ++var1) {
        int var2 = AudioWorker.anIntArray347[var1];
        NPC var3 = TextureSampler5.npcs[var2];
        if (null != var3) {
          DummyOutputStream.method68(var3.config.size, 2279, var3);
        }
      }

      if (var0 > -4) {
        DummyClass44.method1208((byte) 25, 108);
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "ig.A(" + var0 + ')');
    }
  }

  public static void method1208(byte var0, int var1) {
    try {
      if (-1 != var1) {
        if (HashTable.aBooleanArray1703[var1]) {
          TextureSampler3.aClass153_3361.method2128(7561, var1);
          if (null != SceneNode.aClass11ArrayArray1834[var1]) {
            boolean var2 = true;

            for (int var3 = 0; SceneNode.aClass11ArrayArray1834[var1].length > var3; ++var3) {
              if (SceneNode.aClass11ArrayArray1834[var1][var3] != null) {
                if (~SceneNode.aClass11ArrayArray1834[var1][var3].anInt187 == -3) {
                  var2 = false;
                } else {
                  SceneNode.aClass11ArrayArray1834[var1][var3] = null;
                }
              }
            }

            int var4 = 43 / ((-70 - var0) / 47);
            if (var2) {
              SceneNode.aClass11ArrayArray1834[var1] = null;
            }

            HashTable.aBooleanArray1703[var1] = false;
          }
        }
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "ig.B(" + var0 + ',' + var1 + ')');
    }
  }

}
