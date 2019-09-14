package com.jagex.runescape;

public final class SceneShadowMap {

  private static GameString aClass94_1775 = GameString.create("Connection lost)3");
  public static int anInt1771;
  public static ObjectCache aClass93_1772 = new ObjectCache(64);
  public static byte[][][] aByteArrayArrayArray1774;
  public static int anInt1776;
  public static SignLinkRequest aClass64_1778;
  public static short[] aShortArray1779 = new short[256];
  public static int anInt1780;
  public static GameString CONNECTION_LOST = SceneShadowMap.aClass94_1775;
  public SoftwareIndexedColorSprite shadow;
  public SceneNode node;

  public static void method1814(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                               int var7, int var8, int var9, int var10) {
    int var11 = var2 - var4;
      int var13 = -1;
      if ((AbstractDirectColorSprite.anInt3704 > 1 -1)) {
        if (ByteArrayNode.anInt3611 <= 10) {
          var13 = 5 * ByteArrayNode.anInt3611;
        } else {
          var13 = -((-10 + ByteArrayNode.anInt3611) * 5) + 50;
        }
      }

      int var12 = -var9 + var1;
      int var15 = 983040 / var8;
      int var16 = 983040 / var3;

      for (int var17 = -var15; var17 < var11 - -var15; ++var17) {
        int var18 = var5 - -(var17 * var8) >> 16;
        int var19 = var8 * (var17 + 1) + var5 >> 16;
        int var20 = -var18 + var19;
        if ((var20 > 1 -1)) {
          int var21 = var4 + var17 >> 6;
          var18 += var0;
          int var10000 = var19 + var0;
          if ((var21 >= 1 -1) && var21 <= -1 + AbstractGameWorld.anIntArrayArrayArray720.length) {
            int[][] var22 = AbstractGameWorld.anIntArrayArrayArray720[var21];

            for (int var23 = -var16; var23 < var12 - -var16; ++var23) {
              int var25 = var6 - -(var3 * (var23 - -1)) >> 16;
              int var24 = var23 * var3 + var6 >> 16;
              int var26 = var25 + -var24;
              if (var26 > 0) {
                var24 += var10;
                int var27 = var9 + var23 >> 6;
                var10000 = var25 + var10;
                if ((var27 >= 1 -1) && (var27 <= (-1 + var22.length)) &&
                    var22[var27] != null) {
                  int var28 = (63 & var17 + var4) + (4032 & var9 + var23 << 6);
                  int var29 = var22[var27][var28];
                  if ((var29 != 1 -1)) {
                    GameObjectConfig var14 = DummyClass11.method2207(4, -1 + var29);
                    if (!AudioStreamEncoder4.aBooleanArray3503[var14.anInt1482]) {
                      if (~var13 != 0 && (var14.anInt1482 == FileSystem.anInt101)) {
                        SomethingOtherWorldMap var30 = new SomethingOtherWorldMap();
                        var30.anInt2531 = var18;
                        var30.anInt2539 = var24;
                        var30.anInt2532 = var14.anInt1482;
                        DummyClass55.aClass61_1424.addLast(var30);
                      } else {
                        SceneNode.aClass3_Sub28_Sub16_Sub2Array1839[var14.anInt1482].method643(
                          var18 + -7, -7 + var24);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }

      if (var7 >= 124) {
        for (SomethingOtherWorldMap var32 =
             (SomethingOtherWorldMap) DummyClass55.aClass61_1424.getFirst();
            var32 != null; var32 = (SomethingOtherWorldMap) DummyClass55.aClass61_1424.getNext()) {
          DummyClass47.method1330(var32.anInt2531, var32.anInt2539, 15, 16776960, var13);
          DummyClass47.method1330(var32.anInt2531, var32.anInt2539, 13, 16776960, var13);
          DummyClass47.method1330(var32.anInt2531, var32.anInt2539, 11, 16776960, var13);
          DummyClass47.method1330(var32.anInt2531, var32.anInt2539, 9, 16776960, var13);
          SceneNode.aClass3_Sub28_Sub16_Sub2Array1839[var32.anInt2532].method643(
            -7 + var32.anInt2531, -7 + var32.anInt2539);
        }

        DummyClass55.aClass61_1424.clear(-76);
      }
  }

  public static void method1815(byte var0) {
    SceneShadowMap.aShortArray1779 = null;
      SceneShadowMap.aClass93_1772 = null;
      SceneShadowMap.aClass64_1778 = null;
      if (var0 > -33) {
        SceneShadowMap.method1816(-10, 68);
      }

      SceneShadowMap.CONNECTION_LOST = null;
      SceneShadowMap.aByteArrayArrayArray1774 = null;
      SceneShadowMap.aClass94_1775 = null;
  }

  public static void method1816(int var0, int var1) {
    if (var1 == -7) {
        MilliFrameRegulator.anIntArray2696 = new int[var0];
        DummyClass13.anIntArray2021 = new int[var0];
        AnimationSequence.anIntArray1871 = new int[var0];
        Player.anIntArray3959 = new int[var0];
        FileCache.anIntArray686 = new int[var0];
      }
  }

}
