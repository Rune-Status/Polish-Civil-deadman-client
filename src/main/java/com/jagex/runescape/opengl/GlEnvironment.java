package com.jagex.runescape.opengl;

import com.jagex.runescape.statics.GlobalStatics_11;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2ES1;
import com.jogamp.opengl.fixedfunc.GLLightingFunc;

public final class GlEnvironment {

  public static int COLOR = -1;
  public static float DIFFUSE_INTENSITY = -1.0f;
  public static float SECONDARY_INTENSITY = -1.0f;
  public static float AMBIENT_INTENSITY;
  public static float[] DIFFUSE_LIGHT_1 = new float[4];
  public static int FOG_OFFSET = -1;
  public static int FOG_COLOR = -1;
  public static float[] DIFFUSE_LIGHT_0 = new float[4];
  public static int anInt1314;
  public static int anInt1315;
  public static int DEFAULT_FOG_COLOR = 0xc8c0a8;
  public static float[] FOG_COLOR_RGB = new float[4];
  public static int DEFAULT_SUN_COLOR = 16777215;

  public static void updateSunPosition() {
    GlRenderer.GL.glLightfv(16384, 4611, GlEnvironment.DIFFUSE_LIGHT_0, 0);
    GlRenderer.GL.glLightfv(16385, 4611, GlEnvironment.DIFFUSE_LIGHT_1, 0);
  }

  public static void setSunColor(int color, float ambientIntensity,
      float diffuseIntensity,
      float secondaryIntensity) {
    if (GlEnvironment.COLOR != color
        || GlEnvironment.AMBIENT_INTENSITY != ambientIntensity
        || GlEnvironment.DIFFUSE_INTENSITY != diffuseIntensity
        || GlEnvironment.SECONDARY_INTENSITY != secondaryIntensity) {
      GlEnvironment.COLOR = color;
      GlEnvironment.AMBIENT_INTENSITY = ambientIntensity;
      GlEnvironment.DIFFUSE_INTENSITY = diffuseIntensity;
      GlEnvironment.SECONDARY_INTENSITY = secondaryIntensity;
      float red = (color >> 16 & 255) / 255.0F;
      float green = (color >> 8 & 255) / 255.0F;
      float blue = (color & 255) / 255.0F;
      float[] colors = {
          ambientIntensity * red, ambientIntensity * green,
          ambientIntensity * blue, 1.0F
      };
      GlRenderer.GL.glLightModelfv(GL2ES1.GL_LIGHT_MODEL_AMBIENT, colors, 0);
      float[] light0 = {
          diffuseIntensity * red, diffuseIntensity * green,
          diffuseIntensity * blue, 1.0F
      };
      GlRenderer.GL.glLightfv(
          GLLightingFunc.GL_LIGHT0,
          GLLightingFunc.GL_DIFFUSE,
          light0,
          0
      );
      float[] light1 = {
          -secondaryIntensity * red, -secondaryIntensity * green,
          -secondaryIntensity * blue, 1.0F
      };
      GlRenderer.GL.glLightfv(
          GLLightingFunc.GL_LIGHT1,
          GLLightingFunc.GL_DIFFUSE,
          light1,
          0
      );
    }
  }

  public static void clear() {
    GlEnvironment.DIFFUSE_LIGHT_0 = null;
    GlEnvironment.DIFFUSE_LIGHT_1 = null;
    GlEnvironment.FOG_COLOR_RGB = null;
  }

  public static void setFogColor(int color, int offset) {
    if (GlEnvironment.FOG_COLOR != color
        || GlEnvironment.FOG_OFFSET != offset) {
      GlEnvironment.FOG_COLOR = color;
      GlEnvironment.FOG_OFFSET = offset;
      GlEnvironment.FOG_COLOR_RGB[0] = (color >> 16 & 255) / 255.0F;
      GlEnvironment.FOG_COLOR_RGB[1] = (color >> 8 & 255) / 255.0F;
      GlEnvironment.FOG_COLOR_RGB[2] = (color & 255) / 255.0F;
      GlRenderer.GL.glFogi(GL2ES1.GL_FOG_MODE, GL.GL_LINEAR);
      GlRenderer.GL.glFogf(GL2ES1.GL_FOG_DENSITY, 0.95F);
      GlRenderer.GL.glHint(GL2ES1.GL_FOG_HINT, GL.GL_FASTEST);
      int fogEnd = GlobalStatics_6.FAR;
      int minimumStart = GlobalStatics_6.NEAR;
      int fogStart = fogEnd - 512 - offset;
      if (fogStart < minimumStart) {
        fogStart = minimumStart;
      }
      GlRenderer.GL.glFogf(GL2ES1.GL_FOG_START, fogStart);
      GlRenderer.GL.glFogf(GL2ES1.GL_FOG_END, fogEnd - 256);
      GlRenderer.GL
          .glFogfv(GL2ES1.GL_FOG_COLOR, GlEnvironment.FOG_COLOR_RGB, 0);
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

  public static void method1511() {
    GlRenderer.GL.glColorMaterial(1028, 5634);
    GlRenderer.GL.glEnable(2903);
    float[] light0 = {0.0F, 0.0F, 0.0F, 1.0F};
    GlRenderer.GL.glLightfv(16384, 4608, light0, 0);
    GlRenderer.GL.glEnable(16384);
    float[] light1 = {0.0F, 0.0F, 0.0F, 1.0F};
    GlRenderer.GL.glLightfv(16385, 4608, light1, 0);
    GlRenderer.GL.glEnable(16385);
    GlEnvironment.COLOR = -1;
    GlEnvironment.FOG_COLOR = -1;
    GlEnvironment.method1513();
  }

  public static void setFogColor(float[] color) {
    if (color == null) {
      color = GlEnvironment.FOG_COLOR_RGB;
    }
    GlRenderer.GL.glFogfv(GL2ES1.GL_FOG_COLOR, color, 0);
  }

  public static void method1513() {
    GlEnvironment
        .setSunColor(GlEnvironment.DEFAULT_SUN_COLOR, 1.1523438F, 0.69921875F,
            1.2F);
    GlEnvironment.setSunPosition(-50.0f, -60.0f, -50.0f);
    GlEnvironment.setFogColor(GlEnvironment.DEFAULT_FOG_COLOR, 0);
  }
}
