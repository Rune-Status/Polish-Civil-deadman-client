package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.SomethingGl0;

public final class SceneSomething {

  private static GameString aClass94_492 =
    GameStringStatics.create("RuneScape is loading )2 please wait)3)3)3");
  public static Cache aClass47_480 = new Cache(16);
  public static int anInt486 = 5063219;
  public static boolean aBoolean488 = true;
  public static int anInt491;
  public static int anInt494;
  public static int anInt497;
  public static int[][] anIntArrayArray499 = {
    new int[0], {128, 0, 128, 128, 0, 128}, {0, 0, 128, 0, 128, 128, 64, 128},
    {0, 128, 0, 0, 128, 0, 64, 128}, {0, 0, 64, 128, 0, 128}, {128, 128, 64, 128, 128, 0},
    {64, 0, 128, 0, 128, 128, 64, 128}, {128, 0, 128, 128, 0, 128, 0, 64, 64, 0},
    {0, 0, 64, 0, 0, 64}, {0, 0, 128, 0, 128, 128, 64, 96, 32, 64},
    {0, 128, 0, 0, 32, 64, 64, 96, 128, 128}, {0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128}
  };
  public static GameString aClass94_485 = SceneSomething.aClass94_492;
  public int anInt478;
  public SceneNode sceneNode;
  public int anInt481;
  public int anInt482;
  public int anInt483;
  public int anInt484;
  public int anInt487;
  public int anInt489;
  public int anInt490;
  public int anInt493;
  public int anInt495;
  public int anInt496;
  public long aLong498;

  public static void method953(int var0, int var1) {
    MonoChromaticImageCache.aClass93_1569.method1522(var0 ^ 13501, var1);
      if (var0 != -13508) {
        SceneSomething.aClass94_485 = null;
      }

      SomethingVolume15.aClass93_2428.method1522(-126, var1);
      Cache.aClass93_743.method1522(-126, var1);
  }

  public static void method954(int var0) {
    SceneSomething.aClass47_480 = null;
      SceneSomething.anIntArrayArray499 = null;
      SceneSomething.aClass94_492 = null;
      if (var0 != 128) {
        SceneSomething.method954(113);
      }

      SceneSomething.aClass94_485 = null;
  }

  public static void method955(int[][] var0, boolean var1, int var2, SomethingGl0 var3, int[] var4,
                              int var5, int var6, int var7, boolean var8, float[][] var9,
                              boolean var10, int var11, float[][] var12, int var13, int var14,
                              int var15, boolean var16, int[][] var17, float[][] var18, byte var19,
                              int var20, boolean[] var21) {
    int var22 = (var2 << 8) + (var1 ? 255 : 0);
      int var24 = (!var8 ? 0 : 255) + (var15 << 8);
      int[] var26 = new int[var4.length / var11];
      int var25 = (var10 ? 255 : 0) + (var14 << 8);
      int var23 = (var20 << 8) + (!var16 ? 0 : 255);

      for (int var27 = 0; (var27 < var26.length); ++var27) {
        int var28 = var4[var27 + var27];
        int[][] var30 =
            var0 != null && var21 != null && var21[var27] ? var0 : var17;
        int var29 = var4[var27 + var27 + 1];
        var26[var27] =
          BufferData.method1734(var25, var13, var22, var23, var0, var30, var7, var18, var24,
            (byte) -116, var19, false, var3, var9, var5, var28, var12, var29);
      }

      var3.method150(var6, var7, var5, var26, null, false);
  }

  public static void method956(Object[] var0, int var1, int[] var2, int var3, int var4) {
    if (var4 < var1) {
        int var5 = (var4 + var1) / 2;
        int var7 = var2[var5];
        int var6 = var4;
        var2[var5] = var2[var1];
        var2[var1] = var7;
        Object var8 = var0[var5];
        var0[var5] = var0[var1];
        var0[var1] = var8;

        for (int var9 = var4; (var9 < var1); ++var9) {
          if (((var9 & 1) + var7) > var2[var9]) {
            int var10 = var2[var9];
            var2[var9] = var2[var6];
            var2[var6] = var10;
            Object var11 = var0[var9];
            var0[var9] = var0[var6];
            var0[var6++] = var11;
          }
        }

        var2[var1] = var2[var6];
        var2[var6] = var7;
        var0[var1] = var0[var6];
        var0[var6] = var8;
        SceneSomething.method956(var0, var6 - 1, var2, 47, var4);
        SceneSomething.method956(var0, var1, var2, 100, 1 + var6);
      }

      if (var3 < 16) {
        SceneSomething
            .method955(null, true, 94, null, null, -50, -107, -51, false, null, true, 73, null, -92, -7,
          -23, true, null, null, (byte) 52, 41, null);
      }
  }

  public static void method957(int var0, boolean var1) {
    if (var0 == 96) {
        ClientScriptEnum.aBoolean3665 = var1;
        Cache.aBoolean742 = !NPC.method1986(42);
      }
  }

  public static void method958(byte var0) {
    if (SceneNode.aBoolean1837) {
        int var2 = 88 / ((57 - var0) / 59);
        Widget var1 =
          GlobalStatics_2.method638((byte) -19, ScriptState.anInt872, Widget.anInt278);
        if (var1 != null && var1.anObjectArray303 != null) {
          ClientScriptCall var3 = new ClientScriptCall();
          var3.arguments = var1.anObjectArray303;
          var3.aClass11_2449 = var1;
          GLStatics.executeScript(var3);
        }

        SceneNode.aBoolean1837 = false;
        AnimationSomething.anInt3590 = -1;
        DummyClass29.method909(-107, var1);
      }
  }

  public static void method959(int var0) {
    ClientScriptCall.aClass93_2450.method1524(3);
      if (var0 != 0) {
        SceneSomething.method957(121, true);
      }
  }

}
