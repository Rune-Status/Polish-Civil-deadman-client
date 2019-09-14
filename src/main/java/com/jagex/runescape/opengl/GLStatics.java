package com.jagex.runescape.opengl;

import com.jagex.runescape.AbstractFileRequester;
import com.jagex.runescape.ClientScript;
import com.jagex.runescape.DummyClass30;
import com.jagex.runescape.ITextureCache;
import com.jagex.runescape.IntegerNode;
import com.jagex.runescape.MapScene;
import com.jagex.runescape.SceneGraphTile;
import com.jagex.runescape.TextureSampler37;

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

  public static float[] method1705(int var0, int var1) {
    float var2 = GlEnvironment.method1514() + GlEnvironment.method1505();
    int var3 = GlEnvironment.method1510();
    float var7 = 0.58823526F;
    FOG_COLOR[3] = 1.0F;
    float var4 = (var3 >> 16 & 255) / 255.0F;
    float var5 = (('\uff1e' & var3) >> 8) / 255.0F;
    FOG_COLOR[1] =
        var2 * ClientScript.bitAnd(var0 >> 8, 255) / 255.0F * var5 * var7;
    FOG_COLOR[var1] =
        var2 * var7 * var4 * ((ClientScript.bitAnd(16754958, var0) >> 16)
            / 255.0F);
    float var6 = (var3 & 255) / 255.0F;
    FOG_COLOR[2] =
        ClientScript.bitAnd(255, var0) / 255.0F * var6 * var7 * var2;
    return FOG_COLOR;
  }

  public static void method551(int var0, int var1, int var2) {
    if (var0 == 0) {
      if (var2 == 4 && !aBoolean1685) {
        var2 = 2;
        var1 = 2;
      }

      if ((DummyClass30.anInt453 == var2)) {
        if (var2 != 0 && var1 != TextureSampler37.anInt3263) {
          MapScene.anInterface5Array70[var2].set(var1);
          TextureSampler37.anInt3263 = var1;
        }
      } else {
        if (aBoolean3207) {
          return;
        }

        if ((DummyClass30.anInt453 != 0)) {
          MapScene.anInterface5Array70[DummyClass30.anInt453].disable();
        }

        if ((var2 != 0)) {
          MaterialShader var3 = MapScene.anInterface5Array70[var2];
          var3.enable();
          var3.set(var1);
        }

        DummyClass30.anInt453 = var2;
        TextureSampler37.anInt3263 = var1;
      }

    }
  }

  public static float[] calculateFogColor() {
    float var1 = GlEnvironment.method1514() + GlEnvironment.method1505();
    int var2 = GlEnvironment.method1510();
    float var3 = (255 & var2 >> 16) / 255.0F;
    FOG_COLOR[3] = 1.0F;
    float var4 = (('\uff59' & var2) >> 8) / 255.0F;
    float var6 = 0.58823526F;
    float var5 = (255 & var2) / 255.0F;
    FOG_COLOR[2] =
        AbstractFileRequester.aFloatArray1934[2] * var5 * var6 * var1;
    FOG_COLOR[0] =
        AbstractFileRequester.aFloatArray1934[0] * var3 * var6 * var1;
    FOG_COLOR[1] =
        var1 * var6 * var4 * AbstractFileRequester.aFloatArray1934[1];
    return FOG_COLOR;
  }

  public static long method104(int var0, int var1, int var2) {
    SceneGraphTile var3 = sceneGraphTiles[var0][var1][var2];
    return var3 != null && var3.aClass12_2230 != null ? var3.aClass12_2230.aLong328 : 0L;
  }

  public static void method535(byte var0, int var1) {
    AbstractFileRequester.aFloatArray1934[0] =
        ClientScript.bitAnd(255, var1 >> 16) / 255.0F;
    AbstractFileRequester.aFloatArray1934[1] =
        ClientScript.bitAnd(var1 >> 8, 255) / 255.0F;
    AbstractFileRequester.aFloatArray1934[2] = ClientScript.bitAnd(255, var1)
        / 255.0F;
    IntegerNode.method383(-32584, 3);
    IntegerNode.method383(-32584, 4);
    if (var0 != 56) {
      method535((byte) 127, 99);
    }
  }
}
