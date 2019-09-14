package com.jagex.runescape.opengl;

import com.jagex.runescape.AbstractDirectColorSprite;
import com.jagex.runescape.AbstractFileRequester;
import com.jagex.runescape.ClientScriptCall;
import com.jagex.runescape.DummyClass13;
import com.jagex.runescape.DummyClass30;
import com.jagex.runescape.DummyClass37;
import com.jagex.runescape.DummyClass5;
import com.jagex.runescape.DummyClass55;
import com.jagex.runescape.GZipDecompressor;
import com.jagex.runescape.GlobalStatics_0;
import com.jagex.runescape.GlobalStatics_2;
import com.jagex.runescape.GroundItem;
import com.jagex.runescape.ITextureCache;
import com.jagex.runescape.IdentityKit;
import com.jagex.runescape.IntegerNode;
import com.jagex.runescape.ItemConfig;
import com.jagex.runescape.LightIntensity;
import com.jagex.runescape.MapScene;
import com.jagex.runescape.SceneGraphTile;
import com.jagex.runescape.SoftwareDirectColorSprite;
import com.jagex.runescape.Something3dRoot;
import com.jagex.runescape.SomethingPacket116;
import com.jagex.runescape.SomethingVolume15;
import com.jagex.runescape.TextureSampler16;
import com.jagex.runescape.TextureSampler26;
import com.jagex.runescape.TextureSampler37;
import com.jagex.runescape.TextureSampler38;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;

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
  public static GameString aClass94_691 = aClass94_695;

  public static float[] method1705(int var0, int var1) {
    float var2 = GlEnvironment.method1514() + GlEnvironment.method1505();
    int var3 = GlEnvironment.method1510();
    float var7 = 0.58823526F;
    FOG_COLOR[3] = 1.0F;
    float var4 = (var3 >> 16 & 255) / 255.0F;
    float var5 = (('\uff1e' & var3) >> 8) / 255.0F;
    FOG_COLOR[1] =
        var2 * (var0 >> 8 & 255) / 255.0F * var5 * var7;
    FOG_COLOR[var1] =
        var2 * var7 * var4 * (((16754958 & var0) >> 16)
            / 255.0F);
    float var6 = (var3 & 255) / 255.0F;
    FOG_COLOR[2] =
        (255 & var0) / 255.0F * var6 * var7 * var2;
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
        (255 & var1 >> 16) / 255.0F;
    AbstractFileRequester.aFloatArray1934[1] =
        (var1 >> 8 & 255) / 255.0F;
    AbstractFileRequester.aFloatArray1934[2] = (255 & var1)
        / 255.0F;
    IntegerNode.method383(-32584, 3);
    IntegerNode.method383(-32584, 4);
    if (var0 != 56) {
      method535((byte) 127, 99);
    }
  }

  public static void method1058(int var0, int var1, int var2, int var3, byte var4) {
    int var5 = 25 % ((25 - var4) / 52);
    if (((var1 - var0) >= DummyClass55.anInt1425)
        && GlTexture2d.anInt3765 >= var0 + var1
        && var3 - var0 >= DummyClass13.anInt2020
        && LightIntensity.anInt902 >= var0 + var3) {
      IdentityKit.method949(var1, (byte) 118, var0, var2, var3);
    } else {
      GZipDecompressor.method1129(var2, var3, var0, 0, var1);
    }
  }

  public static void method1059(byte var0) {
    aClass94_695 = null;
    aClass94_701 = null;
    aClass94_699 = null;
    aClass94_691 = null;
    if (var0 == -2) {
      aClass94_700 = null;
    }
  }

  public static AbstractDirectColorSprite method1062(int var0) {
    byte[] var2 = DummyClass5.aByteArrayArray2987[0];
    int var1 =
        GroundItem.anIntArray2931[0] * TextureSampler26.anIntArray3076[0];
    int[] var3 = new int[var1];
    if (var0 < 70) {
      method1062(67);
    }

    for (int var4 = 0; var1 > var4; ++var4) {
      var3[var4] = TextureSampler38.anIntArray3446[(int) var2[var4] & 255];
    }

    AbstractDirectColorSprite var6;
    if (GlRenderer.useOpenGlRenderer) {
      var6 = new GlDirectColorSprite(SomethingVolume15.anInt2426,
          SomethingPacket116.anInt1748,
          Something3dRoot.anIntArray2048[0], GlobalStatics_0.anIntArray2591[0],
          GroundItem.anIntArray2931[0],
          TextureSampler26.anIntArray3076[0], var3);
    } else {
      var6 =
          new SoftwareDirectColorSprite(SomethingVolume15.anInt2426,
              SomethingPacket116.anInt1748,
              Something3dRoot.anIntArray2048[0],
              GlobalStatics_0.anIntArray2591[0],
              GroundItem.anIntArray2931[0],
              TextureSampler26.anIntArray3076[0], var3);
    }

    DummyClass37.method1035((byte) 111);
    return var6;
  }

  public static void executeScript(ClientScriptCall var1) {
    ItemConfig.callScript((byte) -93, 200000, var1);
  }

  public static void method1083() {
    TextureSampler16.anIntArray3107 =
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
