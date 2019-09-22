package com.jagex.runescape.opengl;

import com.jagex.runescape.settings.SettingsStatics;
import com.jagex.runescape.statics.GlobalStatics_6;

public final class CommonGL {

  public static void method403() {
    GlRenderer.GL.glDisableClientState(0x8076);
    GlRenderer.setLightingEnabled(false);
    GlRenderer.GL.glDisable(2929);
    GlRenderer.GL.glPushAttrib(128);
    GlRenderer.GL.glFogf(2915, 3072.0F);
    GlRenderer.method1851();

    for (int var1 = 0; var1 < GLStatics.aClass3_Sub11ArrayArray2199[0].length;
        ++var1) {
      SomethingGl0 var2 = GLStatics.aClass3_Sub11ArrayArray2199[0][var1];
      if (var2.material >= 0
          && GLStatics.textureCache.method18(var2.material, 255) == 4) {
        GlRenderer.GL
            .glColor4fv(GLStatics.method1705(var2.anInt2355, 0),
                0);
        //TODO 201.5FF
        float var3 = 201.5F - (var2.aBoolean2364 ? 1.0F : 0.5F);
        var2.renderSceneGroundTiles(GLStatics.sceneGraphTiles, var3);
      }
    }

    GlRenderer.GL.glEnableClientState(0x8076);
    GlRenderer.method1846();
    GlRenderer.GL.glEnable(2929);
    GlRenderer.GL.glPopAttrib();
    GlRenderer.method1830();
  }

  public static void drawScene(int tx, int ty, int tz, boolean var22) {
    SomethingGl0[][] array = GLStatics.aClass3_Sub11ArrayArray2542;
    GlRenderer.GL.glPushMatrix();
    GlRenderer.GL.glTranslatef(-tx, -ty, -tz);
    if (var22) {
      CommonGL.method403();
      GLStatics.method551(-1, 3);
      GLStatics.aBoolean3207 = true;
      MaterialShader3.method2254();
      GLStatics.anInt1244 = -1;
      GLStatics.anInt3072 = -1;

      //TODO it randomy went null after some refactoring
      //possibly synchronization issue, right now null check is fine
      //this has something todo with water
      if (array[0] != null) {
        for (int y = 0; y < array[0].length; ++y) {
          SomethingGl0 var28 = array[0][y];
          //TODO 251.5F -
          float var26 = 251.5F - (var28.aBoolean2364 ? 1.0F : 0.5F);
          if (var28.anInt2355 != GLStatics.anInt1244) {
            GLStatics.anInt1244 = var28.anInt2355;
            GLStatics.method535(var28.anInt2355);
            GlEnvironment.setFogColor(GLStatics.calculateFogColor());
          }

          var28.renderSceneGroundTiles(GLStatics.sceneGraphTiles, var26);
        }
        MaterialShader3.method2253();
      }
    } else {

//      //TODO this draws ground tiles
      for (int plane = GLStatics.anInt3419; plane < GLStatics.anInt2456; ++plane) {
        for (int y = 0; y < array[plane].length; ++y) {
          SomethingGl0 var25 = array[plane][y];
          //TODO was 201.5F
          float var33 =
              201.5F - GlobalStatics_6.NEAR * plane - (var25.aBoolean2364 ? 1.0F
                  : 0.5F);
          if (var25.material != -1
              && GLStatics.textureCache.method18(var25.material, 255) == 4
              && SettingsStatics.aBoolean1685) {
            GLStatics.method535(var25.anInt2355);
          }

          var25.renderSceneGroundTiles(GLStatics.sceneGraphTiles, var33);
        }

        if (plane == 0 && SettingsStatics.anInt1137 > 0) {
          //TODO 101.5F
          GlRenderer.method1832(101.5F);
          SomethingShadows.drawShadows(GLStatics.CAMERA_TILE_X,
              GLStatics.CAMERA_TILE_Y, GLStatics.CURRENT_VIEWPORT_SIZE,
              GLStatics.adjacentTileOnScreen);
        }
      }

      DummyClass46.method1277(GLStatics.sceneGraphTiles);
    }

    GlRenderer.GL.glPopMatrix();
  }
}
