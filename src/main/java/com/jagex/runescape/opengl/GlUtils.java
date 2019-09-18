package com.jagex.runescape.opengl;

import com.jogamp.opengl.GL;
import java.nio.IntBuffer;

public final class GlUtils {

  private static int anInt450;
  public static GlDirectColorSprite aClass3_Sub28_Sub16_Sub1_447;
  public static int anInt448;
  public static int anInt449;
  public static int anInt451;

  public static void method921() {
    GlUtils.aClass3_Sub28_Sub16_Sub1_447 = null;
  }

  public static void drawHorizontalLine(int x, int y, int length, int var3) {
    GlRenderer.resetState();
    float xx0 = x + 0.3F;
    float xx1 = xx0 + length;
    float yy0 = GlRenderer.viewHeight - (y + 0.3F);
    GlRenderer.GL.glBegin(1);
    GlRenderer.GL.glColor3ub((byte) (var3 >> 16), (byte) (var3 >> 8), (byte) var3);
    GlRenderer.GL.glVertex2f(xx0, yy0);
    GlRenderer.GL.glVertex2f(xx1, yy0);
    GlRenderer.GL.glEnd();
  }

  public static void method923() {
    GlUtils.aClass3_Sub28_Sub16_Sub1_447 = null;
  }

  public static void drawVerticalLine(int var0, int var1, int var2, int var3) {
    GlRenderer.resetState();
    float var4 = var0 + 0.3F;
    float var5 = GlRenderer.viewHeight - (var1 + 0.3F);
    float var6 = var5 - var2;
    GlRenderer.GL.glBegin(1);
    GlRenderer.GL.glColor3ub((byte) (var3 >> 16), (byte) (var3 >> 8), (byte) var3);
    GlRenderer.GL.glVertex2f(var4, var5);
    GlRenderer.GL.glVertex2f(var4, var6);
    GlRenderer.GL.glEnd();
  }

  public static void resetClip() {
    GlUtils.anInt449 = 0;
    GlUtils.anInt448 = 0;
    GlUtils.anInt450 = GlRenderer.viewWidth;
    GlUtils.anInt451 = GlRenderer.viewHeight;
    GlRenderer.GL.glDisable(3089);
    GlUtils.method921();
  }

  public static void drawImage(int[] var0, int var1, int var2, int var3, int var4) {
    GlRenderer.resetState();
    GlRenderer.GL.glRasterPos2i(var1, GlRenderer.viewHeight - var2);
    GlRenderer.GL.glPixelZoom(1.0F, -1.0f);
    GlRenderer.GL.glDisable(3042);
    GlRenderer.GL.glDisable(3008);
    GlRenderer.GL
        .glDrawPixels(var3, var4, 0x80e1, GlRenderer.USE_BIG_ENDIAN ? 0x8367 : GL.GL_UNSIGNED_BYTE,
      IntBuffer.wrap(var0));
    GlRenderer.GL.glEnable(3008);
    GlRenderer.GL.glEnable(3042);
    GlRenderer.GL.glPixelZoom(1.0F, 1.0F);
  }

  public static void drawQuad(int var0, int var1, int var2, int var3, int var4) {
    GlRenderer.resetState();
    float var5 = var0 + 0.3F;
    float var6 = var5 + (var2 - 1);
    float var7 = GlRenderer.viewHeight - (var1 + 0.3F);
    float var8 = var7 - (var3 - 1);
    GlRenderer.GL.glBegin(2);
    GlRenderer.GL.glColor3ub((byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4);
    GlRenderer.GL.glVertex2f(var5, var7);
    GlRenderer.GL.glVertex2f(var5, var8);
    GlRenderer.GL.glVertex2f(var6, var8);
    GlRenderer.GL.glVertex2f(var6, var7);
    GlRenderer.GL.glEnd();
  }

  public static void drawQuad(int x0, int y0, int width, int height, int color, int alpha) {
    GlRenderer.resetState();
    float var6 = x0 + 0.3F;
    float var7 = var6 + (width - 1);
    float var8 = GlRenderer.viewHeight - (y0 + 0.3F);
    float var9 = var8 - (height - 1);
    GlRenderer.GL.glBegin(2);
    GlRenderer.GL.glColor4ub((byte) (color >> 16), (byte) (color >> 8), (byte) color,
      alpha > 255 ? -1 : (byte) alpha);
    GlRenderer.GL.glVertex2f(var6, var8);
    GlRenderer.GL.glVertex2f(var6, var9);
    GlRenderer.GL.glVertex2f(var7, var9);
    GlRenderer.GL.glVertex2f(var7, var8);
    GlRenderer.GL.glEnd();
  }

  public static void method929(int var0, int var1, int var2, int var3, int color, int var5) {
    int var6 = var2 - var0;
    int var7 = var3 - var1;
    int var8 = var6 >= 0 ? var6 : -var6;
    int var9 = var7 >= 0 ? var7 : -var7;
    int var10 = var8;
    if (var8 < var9) {
      var10 = var9;
    }

    if (var10 != 0) {
      int var11 = (var6 << 16) / var10;
      int var12 = (var7 << 16) / var10;
      if (var12 <= var11) {
        var11 = -var11;
      } else {
        var12 = -var12;
      }

      int var13 = var5 * var12 >> 17;
      int var14 = var5 * var12 + 1 >> 17;
      int var15 = var5 * var11 >> 17;
      int var16 = var5 * var11 + 1 >> 17;
      int x3 = var0 + var13;
      int x2 = var0 - var14;
      int x1 = var0 + var6 - var14;
      int x0 = var0 + var6 + var13;
      int y3 = var1 + var15;
      int y2 = var1 - var16;
      int y1 = var1 + var7 - var16;
      int y0 = var1 + var7 + var15;
      GlRenderer.resetState();
      GlRenderer.GL.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
      GlRenderer.GL.glBegin(6);
      if (var12 <= var11) {
        GlRenderer.GL.glVertex2f(x0, GlRenderer.viewHeight - y0);
        GlRenderer.GL.glVertex2f(x1, GlRenderer.viewHeight - y1);
        GlRenderer.GL.glVertex2f(x2, GlRenderer.viewHeight - y2);
        GlRenderer.GL.glVertex2f(x3, GlRenderer.viewHeight - y3);
      } else {
        GlRenderer.GL.glVertex2f(x3, GlRenderer.viewHeight - y3);
        GlRenderer.GL.glVertex2f(x2, GlRenderer.viewHeight - y2);
        GlRenderer.GL.glVertex2f(x1, GlRenderer.viewHeight - y1);
        GlRenderer.GL.glVertex2f(x0, GlRenderer.viewHeight - y0);
      }

      GlRenderer.GL.glEnd();
    }
  }

  public static void fillQuad(int x0, int y0, int x1, int y1, int color, int alpha) {
    GlRenderer.resetState();
    float xx0 = x0;
    float xx1 = xx0 + x1;
    float yy0 = GlRenderer.viewHeight - y0;
    float yy1 = yy0 - y1;
    GlRenderer.GL.glBegin(6);
    GlRenderer.GL.glColor4ub((byte) (color >> 16), (byte) (color >> 8), (byte) color,
      alpha > 255 ? -1 : (byte) alpha);
    GlRenderer.GL.glVertex2f(xx0, yy0);
    GlRenderer.GL.glVertex2f(xx0, yy1);
    GlRenderer.GL.glVertex2f(xx1, yy1);
    GlRenderer.GL.glVertex2f(xx1, yy0);
    GlRenderer.GL.glEnd();
  }

  public static void method931(int var0, int var1, int var2, int var3) {
    if (GlUtils.anInt449 < var0) {
      GlUtils.anInt449 = var0;
    }

    if (GlUtils.anInt448 < var1) {
      GlUtils.anInt448 = var1;
    }

    if (GlUtils.anInt450 > var2) {
      GlUtils.anInt450 = var2;
    }

    if (GlUtils.anInt451 > var3) {
      GlUtils.anInt451 = var3;
    }

    GlRenderer.GL.glEnable(3089);
    if (GlUtils.anInt449 <= GlUtils.anInt450 && GlUtils.anInt448 <= GlUtils.anInt451) {
      GlRenderer.GL.glScissor(GlUtils.anInt449, GlRenderer.viewHeight - GlUtils.anInt451,
          GlUtils.anInt450 - GlUtils.anInt449,
          GlUtils.anInt451 - GlUtils.anInt448);
    } else {
      GlRenderer.GL.glScissor(0, 0, 0, 0);
    }

    GlUtils.method921();
  }

  public static void clear() {
    // 	GL_DEPTH_BUFFER_BIT	256
    // GL_COLOR_BUFFER_BIT	16384
    GlRenderer.GL.glClear(16640);
  }

  public static void method933(int var0, int var1, int var2, int var3, int var4) {
    GlRenderer.resetState();
    float var5 = var0 + 0.3F;
    float var6 = var2 + 0.3F;
    float var7 = GlRenderer.viewHeight - (var1 + 0.3F);
    float var8 = GlRenderer.viewHeight - (var3 + 0.3F);
    GlRenderer.GL.glBegin(2);
    GlRenderer.GL.glColor3ub((byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4);
    GlRenderer.GL.glVertex2f(var5, var7);
    GlRenderer.GL.glVertex2f(var6, var8);
    GlRenderer.GL.glEnd();
  }

  public static void fillQuad(int x0, int y0, int x1, int y1, int color) {
    GlRenderer.resetState();
    float xx0 = x0;
    float xx1 = xx0 + x1;
    float yy0 = GlRenderer.viewHeight - y0;
    float yy1 = yy0 - y1;
    GlRenderer.GL.glBegin(6);
    GlRenderer.GL.glColor3ub((byte) (color >> 16), (byte) (color >> 8), (byte) color);
    GlRenderer.GL.glVertex2f(xx0, yy0);
    GlRenderer.GL.glVertex2f(xx0, yy1);
    GlRenderer.GL.glVertex2f(xx1, yy1);
    GlRenderer.GL.glVertex2f(xx1, yy0);
    GlRenderer.GL.glEnd();
  }

  public static void clip(int var0, int var1, int var2, int var3) {
    if (var0 < 0) {
      var0 = 0;
    }

    if (var1 < 0) {
      var1 = 0;
    }

    if (var2 > GlRenderer.viewWidth) {
      var2 = GlRenderer.viewWidth;
    }

    if (var3 > GlRenderer.viewHeight) {
      var3 = GlRenderer.viewHeight;
    }

    GlUtils.anInt449 = var0;
    GlUtils.anInt448 = var1;
    GlUtils.anInt450 = var2;
    GlUtils.anInt451 = var3;
    GlRenderer.GL.glEnable(3089);
    if (GlUtils.anInt449 <= GlUtils.anInt450 && GlUtils.anInt448 <= GlUtils.anInt451) {
      GlRenderer.GL.glScissor(GlUtils.anInt449, GlRenderer.viewHeight - GlUtils.anInt451,
          GlUtils.anInt450 - GlUtils.anInt449,
          GlUtils.anInt451 - GlUtils.anInt448);
    } else {
      GlRenderer.GL.glScissor(0, 0, 0, 0);
    }

    GlUtils.method921();
  }

  public static void method936(GlDirectColorSprite var0) {
    if (var0.anInt3696 == GlUtils.anInt451 - GlUtils.anInt448) {
      GlUtils.aClass3_Sub28_Sub16_Sub1_447 = var0;
    } else {
      throw new IllegalArgumentException();
    }
  }

}
