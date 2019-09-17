package com.jagex.runescape.opengl;

public final class CommonGL {

  public static void method403() {
    GlRenderer.GL.glDisableClientState('\u8076');
    GlRenderer.setLightingEnabled(false);
    GlRenderer.GL.glDisable(2929);
    GlRenderer.GL.glPushAttrib(128);
    GlRenderer.GL.glFogf(2915, 3072.0F);
    GlRenderer.method1851();

    for (int var1 = 0; var1 < GLStatics.aClass3_Sub11ArrayArray2199[0].length;
        ++var1) {
      SomethingGl0 var2 = GLStatics.aClass3_Sub11ArrayArray2199[0][var1];
      if (var2.materialId >= 0
          && GLStatics.textureCache.method18(var2.materialId, 255) == 4) {
        GlRenderer.GL
            .glColor4fv(GLStatics.method1705(var2.anInt2355, 0),
            0);
        float var3 = 201.5F - (var2.aBoolean2364 ? 1.0F : 0.5F);
        var2.method149(GLStatics.sceneGraphTiles, var3, true);
      }
    }

    GlRenderer.GL.glEnableClientState('\u8076');
    GlRenderer.method1846();
    GlRenderer.GL.glEnable(2929);
    GlRenderer.GL.glPopAttrib();
    GlRenderer.method1830();
  }

  public static void drawScene(int var0, int var1, int var2, boolean var22) {
    int var14;
    int var15;
    GlRenderer.GL.glPushMatrix();
    GlRenderer.GL.glTranslatef(-var0, -var1, -var2);
    if (var22) {
      CommonGL.method403();
      GLStatics.method551(0, -1, 3);
      GLStatics.aBoolean3207 = true;
      MaterialShader3.method2254();
      GLStatics.anInt1244 = -1;
      GLStatics.anInt3072 = -1;

      for (
        var14 = 0;
        var14 < GLStatics.aClass3_Sub11ArrayArray2542[0].length; ++var14) {
        SomethingGl0 var28 = GLStatics.aClass3_Sub11ArrayArray2542[0][var14];
        float var26 = 251.5F - (var28.aBoolean2364 ? 1.0F : 0.5F);
        if (var28.anInt2355 != GLStatics.anInt1244) {
          GLStatics.anInt1244 = var28.anInt2355;
          GLStatics.method535((byte) 56, var28.anInt2355);
          GlEnvironment.setFogColor(GLStatics.calculateFogColor());
        }

        var28.method149(GLStatics.sceneGraphTiles, var26, false);
      }

      MaterialShader3.method2253();
    } else {
      for (var14 = GLStatics.anInt3419; var14 < GLStatics.anInt2456; ++var14) {
        for (
          var15 = 0;
          var15 < GLStatics.aClass3_Sub11ArrayArray2542[var14].length; ++var15) {
          SomethingGl0 var25 = GLStatics.aClass3_Sub11ArrayArray2542[var14][var15];
          float var33 = 201.5F - 50.0F * var14 - (var25.aBoolean2364 ? 1.0F : 0.5F);
          if (var25.materialId != -1
            && GLStatics.textureCache.method18(var25.materialId, 255) == 4
            && GLStatics.aBoolean1685) {
            GLStatics.method535((byte) 56, var25.anInt2355);
          }

          var25.method149(GLStatics.sceneGraphTiles, var33, false);
        }

        if (var14 == 0 && GLStatics.anInt1137 > 0) {
          GlRenderer.method1832(101.5F);
          SomethingShadows.drawShadows(GLStatics.cameraTileX,
            GLStatics.cameraTileZ, GLStatics.viewportLength,
              GLStatics.adjacentTileOnScreen);
        }
      }

      DummyClass46
          .method1277(
              GLStatics.sceneGraphTiles);
    }

    GlRenderer.GL.glPopMatrix();
  }
}
