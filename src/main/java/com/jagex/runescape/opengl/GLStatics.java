package com.jagex.runescape.opengl;

import com.jagex.runescape.model.AbstractDirectColorSprite;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.ClientScriptCall;
import com.jagex.runescape.model.ITextureCache;
import com.jagex.runescape.model.SceneGraphTile;
import com.jagex.runescape.model.SoftwareDirectColorSprite;
import com.jagex.runescape.statics.DummyClass13;
import com.jagex.runescape.statics.DummyClass30;
import com.jagex.runescape.statics.DummyClass37;
import com.jagex.runescape.statics.DummyClass5;
import com.jagex.runescape.statics.DummyClass55;
import com.jagex.runescape.statics.GlobalStatics_0;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_11;
import com.jagex.runescape.statics.GlobalStatics_2;
import com.jagex.runescape.statics.GlobalStatics_5;
import com.jagex.runescape.statics.GlobalStatics_9;

public class GLStatics {

  public static int anInt1244 = -1;
  public static int anInt3072 = -1;
  public static SomethingGl0[][] aClass3_Sub11ArrayArray2542;
  public static int anInt3419;
  public static int anInt2456;
  public static SomethingGl0[][] aClass3_Sub11ArrayArray2199;
  public static ITextureCache textureCache;
  public static boolean aBoolean1685 = true;
  public static int cameraTileZ;
  public static int viewportLength;
  public static boolean[][] adjacentTileOnScreen;
  public static int anInt1137 = 2;
  public static float[] FOG_COLOR = new float[4];
  public static SceneGraphTile[][][] sceneGraphTiles;
  public static boolean aBoolean3207;
  public static int cameraTileX;
  public static byte[] aByteArray2111 = new byte[16384];
  public static int anInt692;
  public static GameString aClass94_699 = GameStringStatics.create("clignotant3:");
  public static GameString aClass94_700 = GameStringStatics.create("blaugr-Un:");
  public static GameString aClass94_701 =
    GameStringStatics.create("Chargement de la liste des serveurs");
  public static int anInt715;
  public static int anInt716;
  public static int[] hslTable = new int[65536];
  public static int[] SINE_TABLE = new int[2048];
  public static boolean useBumpMaps = true;
  public static int viewportLowerX;
  public static int viewportLowerZ;
  public static int viewportUpperX;
  public static int screenLowerY;
  static GameString aClass94_695 = GameStringStatics.create("Unable to find ");
  public static GameString aClass94_691 = GLStatics.aClass94_695;

  public static float[] method1705(int var0, int var1) {
    float var2 = GlEnvironment.method1514() + GlEnvironment.method1505();
    int var3 = GlEnvironment.method1510();
    float var7 = 0.58823526F;
    GLStatics.FOG_COLOR[3] = 1.0F;
    float var4 = (var3 >> 16 & 255) / 255.0F;
    float var5 = (('\uff1e' & var3) >> 8) / 255.0F;
    GLStatics.FOG_COLOR[1] =
        var2 * (var0 >> 8 & 255) / 255.0F * var5 * var7;
    GLStatics.FOG_COLOR[var1] =
        var2 * var7 * var4 * (((16754958 & var0) >> 16)
            / 255.0F);
    float var6 = (var3 & 255) / 255.0F;
    GLStatics.FOG_COLOR[2] =
        (255 & var0) / 255.0F * var6 * var7 * var2;
    return GLStatics.FOG_COLOR;
  }

  public static void method551(int var0, int var1, int var2) {
    if (var0 == 0) {
      if (var2 == 4 && !GLStatics.aBoolean1685) {
        var2 = 2;
        var1 = 2;
      }

      if (DummyClass30.anInt453 == var2) {
        if (var2 != 0 && var1 != GlobalStatics_10.anInt3263) {
          GlobalStatics_9.anInterface5Array70[var2].set(var1);
          GlobalStatics_10.anInt3263 = var1;
        }
      } else {
        if (GLStatics.aBoolean3207) {
          return;
        }

        if (DummyClass30.anInt453 != 0) {
          GlobalStatics_9.anInterface5Array70[DummyClass30.anInt453].disable();
        }

        if (var2 != 0) {
          MaterialShader var3 = GlobalStatics_9.anInterface5Array70[var2];
          var3.enable();
          var3.set(var1);
        }

        DummyClass30.anInt453 = var2;
        GlobalStatics_10.anInt3263 = var1;
      }

    }
  }

  public static float[] calculateFogColor() {
    float var1 = GlEnvironment.method1514() + GlEnvironment.method1505();
    int var2 = GlEnvironment.method1510();
    float var3 = (255 & var2 >> 16) / 255.0F;
    GLStatics.FOG_COLOR[3] = 1.0F;
    float var4 = (('\uff59' & var2) >> 8) / 255.0F;
    float var6 = 0.58823526F;
    float var5 = (255 & var2) / 255.0F;
    GLStatics.FOG_COLOR[2] =
        GlobalStatics_5.aFloatArray1934[2] * var5 * var6 * var1;
    GLStatics.FOG_COLOR[0] =
        GlobalStatics_5.aFloatArray1934[0] * var3 * var6 * var1;
    GLStatics.FOG_COLOR[1] =
        var1 * var6 * var4 * GlobalStatics_5.aFloatArray1934[1];
    return GLStatics.FOG_COLOR;
  }

  public static long method104(int var0, int var1, int var2) {
    SceneGraphTile var3 = GLStatics.sceneGraphTiles[var0][var1][var2];
    return var3 != null && var3.aClass12_2230 != null ? var3.aClass12_2230.aLong328 : 0L;
  }

  public static void method535(byte var0, int var1) {
    GlobalStatics_5.aFloatArray1934[0] =
        (255 & var1 >> 16) / 255.0F;
    GlobalStatics_5.aFloatArray1934[1] =
        (var1 >> 8 & 255) / 255.0F;
    GlobalStatics_5.aFloatArray1934[2] = (255 & var1)
        / 255.0F;
    GlobalStatics_9.method383(-32584, 3);
    GlobalStatics_9.method383(-32584, 4);
    if (var0 != 56) {
      GLStatics.method535((byte) 127, 99);
    }
  }

  public static void method1058(int var0, int var1, int var2, int var3, byte var4) {
    int var5 = 25 % ((25 - var4) / 52);
    if (var1 - var0 >= DummyClass55.anInt1425
        && GlTexture2d.anInt3765 >= var0 + var1
        && var3 - var0 >= DummyClass13.anInt2020
        && GlobalStatics_9.anInt902 >= var0 + var3) {
      GlobalStatics_9.method949(var1, (byte) 118, var0, var2, var3);
    } else {
      GlobalStatics_9.method1129(var2, var3, var0, 0, var1);
    }
  }

  public static void method1059(byte var0) {
    GLStatics.aClass94_695 = null;
    GLStatics.aClass94_701 = null;
    GLStatics.aClass94_699 = null;
    GLStatics.aClass94_691 = null;
    if (var0 == -2) {
      GLStatics.aClass94_700 = null;
    }
  }

  public static AbstractDirectColorSprite method1062(int var0) {
    byte[] var2 = DummyClass5.aByteArrayArray2987[0];
    int var1 =
        GlobalStatics_9.anIntArray2931[0] * GlobalStatics_10.anIntArray3076[0];
    int[] var3 = new int[var1];
    if (var0 < 70) {
      GLStatics.method1062(67);
    }

    for (int var4 = 0; var1 > var4; ++var4) {
      var3[var4] = GlobalStatics_10.anIntArray3446[(int) var2[var4] & 255];
    }

    AbstractDirectColorSprite var6;
    if (GlRenderer.useOpenGlRenderer) {
      var6 = new GlDirectColorSprite(GlobalStatics_9.anInt2426,
          GlobalStatics_9.anInt1748,
          GlobalStatics_9.anIntArray2048[0], GlobalStatics_0.anIntArray2591[0],
          GlobalStatics_9.anIntArray2931[0],
          GlobalStatics_10.anIntArray3076[0], var3);
    } else {
      var6 =
          new SoftwareDirectColorSprite(GlobalStatics_9.anInt2426,
              GlobalStatics_9.anInt1748,
              GlobalStatics_9.anIntArray2048[0],
              GlobalStatics_0.anIntArray2591[0],
              GlobalStatics_9.anIntArray2931[0],
              GlobalStatics_10.anIntArray3076[0], var3);
    }

    DummyClass37.method1035((byte) 111);
    return var6;
  }

  public static void executeScript(ClientScriptCall var1) {
    GlobalStatics_11.callScript((byte) -93, 200000, var1);
  }

  public static void method1083() {
    GlobalStatics_10.anIntArray3107 =
        GlobalStatics_2.method62(true, 14585, 8, 2048, 4, 0.4F, 8, 35);
  }

  public static int nearestPo2(byte var0, int var1) {
    --var1;
    var1 |= var1 >>> 1;
    var1 |= var1 >>> 2;
    var1 |= var1 >>> 4;
    var1 |= var1 >>> 8;
    var1 |= var1 >>> 16;
    return 1 + var1;
  }
}
