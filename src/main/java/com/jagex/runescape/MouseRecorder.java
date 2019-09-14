package com.jagex.runescape;

import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.done.AnimationSequence;

public final class MouseRecorder implements Runnable {

  public static ObjectCache aClass93_1013 = new ObjectCache(100);
  public static byte[][][] aByteArrayArrayArray1014;
  public static Widget aClass11_1017;
  public boolean aBoolean1015 = true;
  public Object anObject1016 = new Object();
  public int anInt1018;
  public int[] anIntArray1019 = new int[500];
  public int[] anIntArray1020 = new int[500];

  public void run() {
    for (; this.aBoolean1015; TextureSampler25.sleep(50L)) {
        Object var1 = this.anObject1016;
        synchronized (var1) {
          if ((this.anInt1018 < 500)) {
            this.anIntArray1020[this.anInt1018] = SomethingTilek.anInt1676;
            this.anIntArray1019[this.anInt1018] = GlobalStatics_0.anInt1709;
            ++this.anInt1018;
          }
        }
      }
  }

  public static void method1257(int var0) {
    if (var0 == 25951) {
        MouseRecorder.aClass11_1017 = null;
        MouseRecorder.aByteArrayArrayArray1014 = null;
        MouseRecorder.aClass93_1013 = null;
      }
  }

  public static int method1258(byte var0) {
    SceneShadowMap.anInt1780 = 0;
      if (var0 != -53) {
        MouseRecorder.method1258((byte) -35);
      }

      return TextureSampler23.method251(-1);
  }

  public static void method1259(int var0, byte var1) {
    if (var1 > 12) {
        WidgetUpdate var2 = GlobalStatics_6.method466(4, 12, var0);
        var2.createIndexedColorSprite(true);
      }
  }

  public static void method1260(int var0, int var1, Widget[] var2) {
    for (int var3 = 0; var3 < var2.length; ++var3) {
        Widget var4 = var2[var3];
        if (var4 != null && (var4.anInt190 == var1) && (!var4.aBoolean233 || !GameClient.method51(
          var4))) {
          if ((var4.anInt187 == 0)) {
            if (!var4.aBoolean233 && GameClient.method51(var4)
              && var4 != DummyClass56.aClass11_1453) {
              continue;
            }

            MouseRecorder.method1260(var0, var4.anInt279, var2);
            if (var4.aClass11Array262 != null) {
              MouseRecorder
                  .method1260(23206, var4.anInt279, var4.aClass11Array262);
            }

            SomethingPacket151 var5 =
              (SomethingPacket151) TextureSampler23.aClass130_3208.get(
                  var4.anInt279);
            if (var5 != null) {
              PlayerAppearance.method1160(-111, var5.anInt2602);
            }
          }

          if (var4.anInt187 == 6) {
            int var6;
            if ((var4.anInt305 != -1) || (var4.anInt198 != -1)) {
              boolean var9 = InventoryConfig.method609(var4, var0 - 23173);
              if (var9) {
                var6 = var4.anInt198;
              } else {
                var6 = var4.anInt305;
              }

              if (var6 != -1) {
                AnimationSequence var7 = GameClient.method45(var6, (byte) -20);
                for (
                  var4.anInt267 += GlobalStatics_7.loopCycle;
                  var4.anInt267 > var7.anIntArray1869[var4.anInt283]; DummyClass29.method909(
                  115, var4)) {
                  var4.anInt267 -= var7.anIntArray1869[var4.anInt283];
                  ++var4.anInt283;
                  if (var7.anIntArray1851.length <= var4.anInt283) {
                    var4.anInt283 -= var7.anInt1865;
                    if ((var4.anInt283 < 0) || var7.anIntArray1851.length <= var4.anInt283) {
                      var4.anInt283 = 0;
                    }
                  }

                  var4.anInt260 = var4.anInt283 + 1;
                  if (var7.anIntArray1851.length <= var4.anInt260) {
                    var4.anInt260 -= var7.anInt1865;
                    if ((var4.anInt260 < 0) || var7.anIntArray1851.length <= var4.anInt260) {
                      var4.anInt260 = -1;
                    }
                  }
                }
              }
            }

            if (var4.anInt237 != 0 && !var4.aBoolean233) {
              int var10 = var4.anInt237 >> 16;
              var10 *= GlobalStatics_7.loopCycle;
              var6 = var4.anInt237 << 16 >> 16;
              var4.rotationX0 = 2047 & var10 + var4.rotationX0;
              var6 *= GlobalStatics_7.loopCycle;
              var4.rotationY = var4.rotationY + var6 & 2047;
              DummyClass29.method909(117, var4);
            }
          }
        }
      }

      if (var0 != 23206) {
        MouseRecorder.method1257(107);
      }
  }

  public static GameString method1261(int var0, int var1, GameString[] var2, int var3) {
    int var4 = 0;

      for (int var5 = 0; var1 > var5; ++var5) {
        if (var2[var0 + var5] == null) {
          var2[var5 + var0] = TextureSampler7.aClass94_3339;
        }

        var4 += var2[var5 + var0].length;
      }

      byte[] var10 = new byte[var4];
      int var6 = 0;

      for (int var7 = 0; var1 > var7; ++var7) {
        GameString var8 = var2[var7 + var0];
        ArrayUtils.copy(var8.bytes, 0, var10, var6, var8.length);
        var6 += var8.length;
      }

      GameString var11 = new GameString();
      var11.length = var4;
      if (var3 != 2774) {
        MouseRecorder.method1262(83, 28);
      }

      var11.bytes = var10;
      return var11;
  }

  public static int method1262(int var0, int var1) {
    if (var0 < 20) {
        MouseRecorder.method1262(15, 87);
      }

      return var1 & 127;
  }

}
