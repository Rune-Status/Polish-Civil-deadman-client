package com.jagex.runescape.opengl;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2ES1;

public final class GlEnvironment {

  private static int COLOR = -1;
  private static float diffuseIntensity = -1.0f;
  private static float secondaryIntensity = -1.0f;
  private static float ambientIntensity;
  private static float[] DIFFUSE_LIGHT_1 = new float[4];
  private static int fogOffset = -1;
  private static int FOG_COLOR = -1;
  public static float[] DIFFUSE_LIGHT_0 = new float[4];
  public static int anInt1314;
  public static int anInt1315;
  public static int defaultFogColor = 0xc8c0a8;
  public static float[] FOG_COLOR_RGB = new float[4];
  public static int defaultSunColor = 16777215;

  public static void updateSunPosition() {
    GlRenderer.GL.glLightfv(16384, 4611, GlEnvironment.DIFFUSE_LIGHT_0, 0);
    GlRenderer.GL.glLightfv(16385, 4611, GlEnvironment.DIFFUSE_LIGHT_1, 0);
  }

  public static float method1505() {
    return GlEnvironment.diffuseIntensity;
  }

  public static void setSunColor(int color, float ambientIntensity,
      float diffuseIntensity,
      float secondaryIntensity) {
    if (GlEnvironment.COLOR != color
        || GlEnvironment.ambientIntensity != ambientIntensity
        || GlEnvironment.diffuseIntensity != diffuseIntensity
        || GlEnvironment.secondaryIntensity != secondaryIntensity) {
      GlEnvironment.COLOR = color;
      GlEnvironment.ambientIntensity = ambientIntensity;
      GlEnvironment.diffuseIntensity = diffuseIntensity;
      GlEnvironment.secondaryIntensity = secondaryIntensity;
      float red = (color >> 16 & 255) / 255.0F;
      float green = (color >> 8 & 255) / 255.0F;
      float blue = (color & 255) / 255.0F;
      float[] colors = {
          ambientIntensity * red, ambientIntensity * green,
          ambientIntensity * blue, 1.0F
      };
      // GL_LIGHT_AMBIENT
      GlRenderer.GL.glLightModelfv(2899, colors, 0);
      // GL_LIGHT_0, DIFFUSE
      float[] var9 = {
          diffuseIntensity * red, diffuseIntensity * green,
          diffuseIntensity * blue, 1.0F
      };
      GlRenderer.GL.glLightfv(16384, 4609, var9, 0);

      // GL_LIGHT_1
      float[] var10 = {
          -secondaryIntensity * red, -secondaryIntensity * green,
          -secondaryIntensity * blue, 1.0F
      };
      GlRenderer.GL.glLightfv(16385, 4609, var10, 0);
    }
  }

  public static void method1507() {
    GlEnvironment.DIFFUSE_LIGHT_0 = null;
    GlEnvironment.DIFFUSE_LIGHT_1 = null;
    GlEnvironment.FOG_COLOR_RGB = null;
  }

  public static void setFogColor(int color, int offset) {
    if (GlEnvironment.FOG_COLOR != color || GlEnvironment.fogOffset != offset) {
      GlEnvironment.FOG_COLOR = color;
      GlEnvironment.fogOffset = offset;
      GlEnvironment.FOG_COLOR_RGB[0] = (color >> 16 & 255) / 255.0F;
      GlEnvironment.FOG_COLOR_RGB[1] = (color >> 8 & 255) / 255.0F;
      GlEnvironment.FOG_COLOR_RGB[2] = (color & 255) / 255.0F;
      GlRenderer.GL.glFogi(GL2ES1.GL_FOG_MODE, GL.GL_LINEAR);
      GlRenderer.GL.glFogf(GL2ES1.GL_FOG_DENSITY, 0.95F);
      GlRenderer.GL.glHint(GL2ES1.GL_FOG_HINT, GL.GL_NICEST);
      // 7 tiles
      int fogEnd = 3584;
      int minimumStart = 50;
      int fogStart = fogEnd - 512 - offset;
      if (fogStart < minimumStart) {
        fogStart = minimumStart;
      }
      GlRenderer.GL.glFogf(GL2ES1.GL_FOG_START, fogStart);
      GlRenderer.GL.glFogf(GL2ES1.GL_FOG_END, fogEnd - 256);
      GlRenderer.GL.glFogfv(GL2ES1.GL_FOG_COLOR, GlEnvironment.FOG_COLOR_RGB, 0);
    }
  }

  public static void setSunPosition(float x, float y, float z) {
    if (GlEnvironment.DIFFUSE_LIGHT_0[0] != x
        || GlEnvironment.DIFFUSE_LIGHT_0[1] != y ||
        GlEnvironment.DIFFUSE_LIGHT_0[2] != z) {
      GlEnvironment.DIFFUSE_LIGHT_0[0] = x;
      GlEnvironment.DIFFUSE_LIGHT_0[1] = y;
      GlEnvironment.DIFFUSE_LIGHT_0[2] = z;
      GlEnvironment.DIFFUSE_LIGHT_1[0] = -x;
      GlEnvironment.DIFFUSE_LIGHT_1[1] = -y;
      GlEnvironment.DIFFUSE_LIGHT_1[2] = -z;
      GlEnvironment.anInt1314 = (int) (x * 256.0F / y);
      GlEnvironment.anInt1315 = (int) (z * 256.0F / y);
    }
  }

  public static int method1510() {
    return GlEnvironment.COLOR;
  }

  public static void method1511() {
    GlRenderer.GL.glColorMaterial(1028, 5634);
    GlRenderer.GL.glEnable(2903);
    float[] light = {0.0F, 0.0F, 0.0F, 1.0F};
    GlRenderer.GL.glLightfv(16384, 4608, light, 0);
    GlRenderer.GL.glEnable(16384);
    GlRenderer.GL.glLightfv(16385, 4608, light, 0);
    GlRenderer.GL.glEnable(16385);
    GlEnvironment.COLOR = -1;
    GlEnvironment.FOG_COLOR = -1;
    GlEnvironment.method1513();
  }

  public static void setFogColor(float[] var0) {
    if (var0 == null) {
      var0 = GlEnvironment.FOG_COLOR_RGB;
    }

    GlRenderer.GL.glFogfv(2918, var0, 0);
  }

  private static void method1513() {
    GlEnvironment
        .setSunColor(GlEnvironment.defaultSunColor, 1.1523438F, 0.69921875F,
            1.2F);
    GlEnvironment.setSunPosition(-50.0f, -60.0f, -50.0f);
    GlEnvironment.setFogColor(GlEnvironment.defaultFogColor, 0);
  }

  public static float method1514() {
    return GlEnvironment.ambientIntensity;
  }

}
