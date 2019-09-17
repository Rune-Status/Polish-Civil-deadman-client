package com.jagex.runescape.opengl;

public final class GlEnvironment {

  private static int color = -1;
  private static float diffuseIntensity = -1.0f;
  private static float secondaryIntensity = -1.0f;
  private static float ambientIntensity;
  private static float[] diffuseLight1 = new float[4];
  private static int fogOffset = -1;
  private static int fogColor = -1;
  public static float[] diffuseLight0 = new float[4];
  public static int anInt1314;
  public static int anInt1315;
  public static int defaultFogColor = 0xc8c0a8;
  public static float[] fogColorRgb = new float[4];
  public static int defaultSunColor = 16777215;

  public static void updateSunPosition() {
    GlRenderer.GL.glLightfv(16384, 4611, GlEnvironment.diffuseLight0, 0);
    GlRenderer.GL.glLightfv(16385, 4611, GlEnvironment.diffuseLight1, 0);
  }

  public static float method1505() {
    return GlEnvironment.diffuseIntensity;
  }

  public static void setSunColor(int color, float ambientIntensity,
      float diffuseIntensity,
      float secondaryIntensity) {
    if (GlEnvironment.color != color
        || GlEnvironment.ambientIntensity != ambientIntensity
        || GlEnvironment.diffuseIntensity != diffuseIntensity
        || GlEnvironment.secondaryIntensity != secondaryIntensity) {
      GlEnvironment.color = color;
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
    GlEnvironment.diffuseLight0 = null;
    GlEnvironment.diffuseLight1 = null;
    GlEnvironment.fogColorRgb = null;
  }

  public static void setFogColor(int color, int offset) {
    if (GlEnvironment.fogColor != color || GlEnvironment.fogOffset != offset) {
      GlEnvironment.fogColor = color;
      GlEnvironment.fogOffset = offset;
      byte minimumStart = 50;
      // 7 tiles
      short fogEnd = 3584; /*3584*/
      GlEnvironment.fogColorRgb[0] = (color >> 16 & 255) / 255.0F;
      GlEnvironment.fogColorRgb[1] = (color >> 8 & 255) / 255.0F;
      GlEnvironment.fogColorRgb[2] = (color & 255) / 255.0F;
      // GL_FOG_MODE, GL_LINEAR
      GlRenderer.GL.glFogi(2917, 9729);
      GlRenderer.GL.glFogf(2914, 0.95F);
      // GL_FOG_HINT, GL_FASTEST
      GlRenderer.GL.glHint(3156, 4354);
      int fogStart = fogEnd - 512 - offset;
      if (fogStart < minimumStart) {
        fogStart = minimumStart;
      }
      GlRenderer.GL.glFogf(2915, fogStart);
      GlRenderer.GL.glFogf(2916, fogEnd - 256);
      GlRenderer.GL.glFogfv(2918, GlEnvironment.fogColorRgb, 0);
    }
  }

  public static void setSunPosition(float var0, float var1, float var2) {
    if (GlEnvironment.diffuseLight0[0] != var0
        || GlEnvironment.diffuseLight0[1] != var1 ||
        GlEnvironment.diffuseLight0[2] != var2) {
      GlEnvironment.diffuseLight0[0] = var0;
      GlEnvironment.diffuseLight0[1] = var1;
      GlEnvironment.diffuseLight0[2] = var2;
      GlEnvironment.diffuseLight1[0] = -var0;
      GlEnvironment.diffuseLight1[1] = -var1;
      GlEnvironment.diffuseLight1[2] = -var2;
      GlEnvironment.anInt1314 = (int) (var0 * 256.0F / var1);
      GlEnvironment.anInt1315 = (int) (var2 * 256.0F / var1);
    }
  }

  public static int method1510() {
    return GlEnvironment.color;
  }

  public static void method1511() {
    GlRenderer.GL.glColorMaterial(1028, 5634);
    GlRenderer.GL.glEnable(2903);
    float[] var1 = {0.0F, 0.0F, 0.0F, 1.0F};
    GlRenderer.GL.glLightfv(16384, 4608, var1, 0);
    GlRenderer.GL.glEnable(16384);
    float[] var2 = {0.0F, 0.0F, 0.0F, 1.0F};
    GlRenderer.GL.glLightfv(16385, 4608, var2, 0);
    GlRenderer.GL.glEnable(16385);
    GlEnvironment.color = -1;
    GlEnvironment.fogColor = -1;
    GlEnvironment.method1513();
  }

  public static void setFogColor(float[] var0) {
    if (var0 == null) {
      var0 = GlEnvironment.fogColorRgb;
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
