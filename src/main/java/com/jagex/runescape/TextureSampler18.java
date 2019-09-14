package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.opengl.SomethingLight;
import java.awt.Component;

public final class TextureSampler18 extends TextureSampler39 {

  private static GameString aClass94_4030 = GameStringStatics.create("Allocating memory");
  public static AnimationSomething[] aClass3_Sub28_Sub5Array4031 = new AnimationSomething[14];
  public static int anInt4032;
  public static int build;
  public static int anInt4034 = -8 + (int) (17.0D * Math.random());
  public static int[] anIntArray4035 = {1, 1, 0, 0, 0, 8, 0, 0, 8};
  public static GameString aClass94_4036 =
    GameStringStatics.create("Connect-B au serveur de mise -9 jour");
  public static int anInt4037;
  public static short aShort4038 = 32767;
  public static int anInt4039;
  public static int anInt4041 = -1;
  public static int anInt4042;
  public static GameString aClass94_4040 = TextureSampler18.aClass94_4030;

  public int[][] method166(int var1, int var2 ) {
    int[][] var3 = this.triChromaticImageCache
          .method1594((byte) -119, var2);
      if (this.triChromaticImageCache.aBoolean1379 && this.method279(-128)) {
        int[] var4 = var3[0];
        int var7 = var2 % this.anInt3283 * this.anInt3283;
        int[] var5 = var3[1];
        int[] var6 = var3[2];

        for (int var8 = 0; SomethingLight0.anInt1559 > var8; ++var8) {
          int var9 = this.anIntArray3284[var7 + var8 % this.anInt3280];
          var6[var8] = ClientScript.bitAnd(255, var9) << 4;
          var5[var8] = ClientScript.bitAnd(var9 >> 4, 4080);
          var4[var8] = ClientScript.bitAnd(16711680, var9) >> 12;
        }
      }

      if (var1 != -1) {
        TextureSampler18.anInt4039 = -119;
      }

      return var3;
  }

  public static void method282(int[] var0, int var1, int var2, int var3, int var4) {
    int var5 = 116 / ((24 - var2) / 63);
      --var1;
      --var3;

      for (int var6 = -7 + var3; var6 > var1; var0[var1] = var4) {
        ++var1;
        var0[var1] = var4;
        ++var1;
        var0[var1] = var4;
        ++var1;
        var0[var1] = var4;
        ++var1;
        var0[var1] = var4;
        ++var1;
        var0[var1] = var4;
        ++var1;
        var0[var1] = var4;
        ++var1;
        var0[var1] = var4;
        ++var1;
      }

      while (var3 > var1) {
        ++var1;
        var0[var1] = var4;
      }
  }

  public static void printUsage(String var0) {
    System.out.println(
        "Bad " + var0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
      System.exit(1);
  }

  public static void method284(float[][] var0, int[][] var1, int var2, float[][] var3, int var4,
                              int[] var5, SomethingLight var6, byte var7, Light var8,
                              float[][] var9, int var10) {
    int[] var11 = new int[var5.length / 2];

      int var12;
      for (var12 = 0; (var12 < var11.length); ++var12) {
        int var13 = var5[var12 + var12];
        int var14 = var5[var12 + var12 + 1];
        int var15;
        if ((var10 == 1)) {
          var15 = var13;
          var13 = var14;
          var14 = -var15 + 128;
        } else {
          if ((var10 == 2)) {
            var14 = -var14 + 128;
            var13 = -var13 + 128;
          } else {
            if ((var10 == 3)) {
              var15 = var13;
              var13 = 128 - var14;
              var14 = var15;
            }
          }
        }

        float var17;
        float var16;
        float var24;
        if ((var13 == 0) && var14 == 0) {
          var16 = var3[var2][var4];
          var24 = var9[var2][var4];
          var17 = var0[var2][var4];
        } else if ((var13 == 128) && (var14 == 0)) {
          var17 = var0[var2 + 1][var4];
          var24 = var9[1 + var2][var4];
          var16 = var3[var2 + 1][var4];
        } else if (var13 == 128 && (var14 == 128)) {
          var16 = var3[var2 + 1][var4 + 1];
          var24 = var9[var2 + 1][var4 + 1];
          var17 = var0[var2 + 1][var4 + 1];
        } else if (var13 == 0 && var14 == 128) {
          var17 = var0[var2][1 + var4];
          var16 = var3[var2][var4 + 1];
          var24 = var9[var2][1 + var4];
        } else {
          var24 = var9[var2][var4];
          var17 = var0[var2][var4];
          float var18 = var13 / 128.0F;
          var16 = var3[var2][var4];
          var16 += (-var16 + var3[1 + var2][var4]) * var18;
          var17 += var18 * (var0[1 + var2][var4] - var17);
          var24 += (-var24 + var9[var2 + 1][var4]) * var18;
          float var20 = var9[var2][1 + var4];
          var20 += (var9[var2 + 1][var4 + 1] - var20) * var18;
          float var21 = var3[var2][1 + var4];
          float var19 = var14 / 128.0F;
          var24 += (-var24 + var20) * var19;
          float var22 = var0[var2][1 + var4];
          var22 += (var0[1 + var2][var4 + 1] - var22) * var18;
          var21 += (-var21 + var3[var2 + 1][1 + var4]) * var18;
          var16 += (-var16 + var21) * var19;
          var17 += (var22 - var17) * var19;
        }

        int var26 = (var2 << 7) + var13;
        int var25 = (var4 << 7) + var14;
        int var27 = SomethingOtherWorldMap.method408(var13, (byte) -53, var4, var1, var2, var14);
        var11[var12] = var6.method1018(var8, var26, var27, var25, var24, var16, var17);
      }

      var6.method1022(var11);
      var12 = 105 % ((-20 - var7) / 54);
  }

  public static AbstractImageProducer createImageProducer(int var0, int var1, boolean var2,
                                                         Component var3) {
    if (var2) {
        try {
          Class var4 = Class.forName(
              "com.jagex.runescape.ComponentImageProducer");
          AbstractImageProducer var8 = (AbstractImageProducer) var4
              .newInstance();
          var8.setDimensions(var0, false, var1, var3);
          return var8;
        } catch (Throwable var6) {
          DirectImageProducer var5 = new DirectImageProducer();
          var5.setDimensions(var0, false, var1, var3);
          return var5;
        }
      } else {
        return null;
      }
  }

  public static AbstractDirectColorSprite[] method286(int var0, int var1, int var2,
                                                     FileUnpacker var3) {
    if (var0 != -1) {
        TextureSampler18.createImageProducer(-95, 48, true, null);
      }

      return !SomethingTexture4.loadSprites(var3, var1, var2, -30901) ?
        null :
        AudioWorker.method891(var0 ^ 4);
  }

  public static void method287(boolean var0) {
    TextureSampler18.aClass94_4030 = null;
      TextureSampler18.aClass94_4036 = null;
      TextureSampler18.aClass94_4040 = null;
      TextureSampler18.anIntArray4035 = null;
      TextureSampler18.aClass3_Sub28_Sub5Array4031 = null;
      if (var0) {
        TextureSampler18.method282(null, -113, 119, -92, 70);
      }
  }

}
