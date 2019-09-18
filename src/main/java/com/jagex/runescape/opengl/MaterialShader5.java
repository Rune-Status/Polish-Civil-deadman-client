package com.jagex.runescape.opengl;

import com.jagex.runescape.statics.GlobalStatics_0;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jagex.runescape.statics.GlobalStatics_9;
import com.jogamp.opengl.GL;

public final class MaterialShader5 implements MaterialShader {

  private int anInt2173;
  private final float[] aFloatArray2174 = new float[4];

  public MaterialShader5() {
    this.method1631(2);
  }

  public void disable() {
    GlRenderer.GL.glCallList(1 + this.anInt2173);
  }

  public void enable() {
    GlRenderer.GL.glCallList(this.anInt2173);
  }

  public void set(int var1) {
    float var4 = (1 + (var1 >> 3 & 3)) * 0.01F;
    float var3 = -0.01f * (1 + (var1 & 3));
    float var5 = (var1 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
    boolean var6 = (128 & var1) != 0;
    if (var6) {
      this.aFloatArray2174[0] = var5;
      this.aFloatArray2174[1] = 0.0F;
      this.aFloatArray2174[2] = 0.0F;
      this.aFloatArray2174[3] = 0.0F;
    } else {
      this.aFloatArray2174[2] = var5;
      this.aFloatArray2174[1] = 0.0F;
      this.aFloatArray2174[3] = 0.0F;
      this.aFloatArray2174[0] = 0.0F;
    }

    GlRenderer.GL.glActiveTexture(0x84c1);
    GlRenderer.GL.glMatrixMode(5888);
    GlRenderer.GL.glPushMatrix();
    GlRenderer.GL.glLoadIdentity();
    GlRenderer.GL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    GlRenderer.GL
        .glRotatef(GlobalStatics_9.anInt2938 * 360.0F / 2048.0F, 1.0F, 0.0F,
            0.0F);
    GlRenderer.GL
        .glRotatef(360.0F * GlobalStatics_9.anInt3103 / 2048.0F, 0.0F, 1.0F,
            0.0F);
    GlRenderer.GL.glTranslatef(-GlobalStatics_10.anInt144,
        -GlobalStatics_6.anInt3695, -GlobalStatics_0.anInt2587);
    GlRenderer.GL.glTexGenfv(8192, 9474, this.aFloatArray2174, 0);
    this.aFloatArray2174[3] = var3 * GlRenderer.anInt1791;
    this.aFloatArray2174[0] = 0.0F;
    this.aFloatArray2174[2] = 0.0F;
    this.aFloatArray2174[1] = var5;
    GlRenderer.GL.glTexGenfv(8193, 9474, this.aFloatArray2174, 0);
    GlRenderer.GL.glPopMatrix();
    if (SomethingGl.aBoolean1227) {
      this.aFloatArray2174[3] = GlRenderer.anInt1791 * var4;
      this.aFloatArray2174[1] = 0.0F;
      this.aFloatArray2174[0] = 0.0F;
      this.aFloatArray2174[2] = 0.0F;
      GlRenderer.GL.glTexGenfv(8194, 9473, this.aFloatArray2174, 0);
    } else {
      int var7 = (int) (GlRenderer.anInt1791 * var4 * 64.0F);
      GlRenderer.GL.glBindTexture(GL.GL_TEXTURE_2D, SomethingGl.anIntArray1223[var7 % 64]);
    }

    GlRenderer.GL.glActiveTexture(0x84c0);
  }

  public int method24() {
    return 0;
  }

  private void method1631(int var1) {
    this.anInt2173 = GlRenderer.GL.glGenLists(var1);
    GlRenderer.GL.glNewList(this.anInt2173, 4864);
    GlRenderer.GL.glActiveTexture(0x84c1);
    if (SomethingGl.aBoolean1227) {
      GlRenderer.GL.glBindTexture(0x806f, SomethingGl.anInt1229);
      GlRenderer.GL.glTexGeni(8194, 9472, 9217);
      GlRenderer.GL.glEnable(3170);
      GlRenderer.GL.glEnable(0x806f);
    } else {
      GlRenderer.GL.glEnable(GL.GL_TEXTURE_2D);
    }

    GlRenderer.GL.glTexGeni(8192, 9472, 9216);
    GlRenderer.GL.glTexGeni(8193, 9472, 9216);
    GlRenderer.GL.glEnable(3168);
    GlRenderer.GL.glEnable(3169);
    GlRenderer.GL.glActiveTexture(0x84c0);
    GlRenderer.GL.glEndList();
    GlRenderer.GL.glNewList(this.anInt2173 + 1, 4864);
    GlRenderer.GL.glActiveTexture(0x84c1);
    if (SomethingGl.aBoolean1227) {
      GlRenderer.GL.glDisable(0x806f);
      GlRenderer.GL.glDisable(3170);
    } else {
      GlRenderer.GL.glDisable(GL.GL_TEXTURE_2D);
    }

    GlRenderer.GL.glDisable(3168);
    GlRenderer.GL.glDisable(3169);
    GlRenderer.GL.glActiveTexture(0x84c0);
    GlRenderer.GL.glEndList();
  }

}
