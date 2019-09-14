package com.jagex.runescape.opengl;

import com.jagex.runescape.AnimationFrame;
import com.jagex.runescape.DummyClass30;
import com.jagex.runescape.DummyClass40;
import com.jagex.runescape.DummyHashTable;
import com.jagex.runescape.GameClient;
import com.jagex.runescape.HashTableIterator;
import com.jagex.runescape.MonoChromaticImageCache;
import com.jagex.runescape.SocketStream;
import com.jagex.runescape.SomethingOtherWorldMap;
import com.jagex.runescape.SomethingQuickChat;
import com.jagex.runescape.SomethingScene;
import com.jagex.runescape.SomethingTexture1;
import com.jagex.runescape.StillGraphicNode;
import com.jagex.runescape.TextureSampler21;
import com.jagex.runescape.TextureSampler22;
import com.jagex.runescape.TextureSampler23;
import com.jagex.runescape.TextureSampler7;
import com.jagex.runescape.TextureSampler8;
import com.jagex.runescape.TriChromaticImageCache;
import com.jogamp.opengl.GL2;

public final class CommonGL {

  public static void method403() {
    GL2 var0 = GlRenderer.GL;
    var0.glDisableClientState('\u8076');
    GlRenderer.setLightingEnabled(false);
    var0.glDisable(2929);
    var0.glPushAttrib(128);
    var0.glFogf(2915, 3072.0F);
    GlRenderer.method1851();

    for (int var1 = 0; var1 < GameClient.aClass3_Sub11ArrayArray2199[0].length;
        ++var1) {
      SomethingGl0 var2 = GameClient.aClass3_Sub11ArrayArray2199[0][var1];
      if (var2.materialId >= 0
          && DummyClass40.textureCache.method18(var2.materialId, 255) == 4) {
        var0.glColor4fv(MonoChromaticImageCache.method1705(var2.anInt2355, 0),
            0);
        float var3 = 201.5F - (var2.aBoolean2364 ? 1.0F : 0.5F);
        var2.method149(SomethingTexture1.sceneGraphTiles, var3, true);
      }
    }

    var0.glEnableClientState('\u8076');
    GlRenderer.method1846();
    var0.glEnable(2929);
    var0.glPopAttrib();
    GlRenderer.method1830();
  }

  public static void drawScene(int var0, int var1, int var2, boolean var22) {
    int var14;
    int var15;
    GlRenderer.GL.glPushMatrix();
    GlRenderer.GL.glTranslatef((-var0), (-var1), (-var2));
    if (var22) {
      CommonGL.method403();
      SomethingQuickChat.method551(0, -1, 3);
      TextureSampler23.aBoolean3207 = true;
      MaterialShader3.method2254();
      SocketStream.anInt1244 = -1;
      TextureSampler21.anInt3072 = -1;

      for (
        var14 = 0;
        var14 < SomethingOtherWorldMap.aClass3_Sub11ArrayArray2542[0].length; ++var14) {
        SomethingGl0 var28 = SomethingOtherWorldMap.aClass3_Sub11ArrayArray2542[0][var14];
        float var26 = 251.5F - (var28.aBoolean2364 ? 1.0F : 0.5F);
        if (var28.anInt2355 != SocketStream.anInt1244) {
          SocketStream.anInt1244 = var28.anInt2355;
          StillGraphicNode.method535((byte) 56, var28.anInt2355);
          GlEnvironment.setFogColor(SomethingScene.method1297((byte) -50));
        }

        var28.method149(SomethingTexture1.sceneGraphTiles, var26, false);
      }

      MaterialShader3.method2253();
    } else {
      for (var14 = TextureSampler22.anInt3419; var14 < AnimationFrame.anInt2456; ++var14) {
        for (
          var15 = 0;
          var15 < SomethingOtherWorldMap.aClass3_Sub11ArrayArray2542[var14].length; ++var15) {
          SomethingGl0 var25 = SomethingOtherWorldMap.aClass3_Sub11ArrayArray2542[var14][var15];
          float var33 = 201.5F - 50.0F * var14 - (var25.aBoolean2364 ? 1.0F : 0.5F);
          if (var25.materialId != -1
            && DummyClass40.textureCache.method18(var25.materialId, 255) == 4
            && DummyHashTable.aBoolean1685) {
            StillGraphicNode.method535((byte) 56, var25.anInt2355);
          }

          var25.method149(SomethingTexture1.sceneGraphTiles, var33, false);
        }

        if (var14 == 0 && HashTableIterator.anInt1137 > 0) {
          GlRenderer.method1832(101.5F);
          DummyClass16.drawShadows(TriChromaticImageCache.cameraTileX,
            TextureSampler7.cameraTileZ, TextureSampler8.viewportLength,
              DummyClass30.adjacentTileOnScreen);
        }
      }

      DummyClass46
          .method1277(
              SomethingTexture1.sceneGraphTiles);
    }

    GlRenderer.GL.glPopMatrix();
  }
}
