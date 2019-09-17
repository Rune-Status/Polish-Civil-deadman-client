package com.jagex.runescape.opengl;

import com.jagex.runescape.statics.GlobalStatics_5;
import com.jagex.runescape.statics.GlobalStatics_9;

import com.jogamp.opengl.GL;
import java.nio.ByteBuffer;

public final class MaterialShader4 implements MaterialShader {

  private static float[] aFloatArray2178 = {0.1F, 0.1F, 0.15F, 0.1F};
  private int anInt2177 = -1;
  private final float[] aFloatArray2179 = new float[4];
  private int anInt2180 = -1;
  private int anInt2181 = -1;


  public MaterialShader4() {
    this.method1699();
    this.method1701();
  }

  private void method1699() {
    byte[] var1 = {(byte) 0, (byte) -1};
    int[] var3 = new int[1];
    GlRenderer.GL.glGenTextures(1, var3, 0);
    GlRenderer.GL.glBindTexture(3552, var3[0]);
    GlRenderer.GL.glTexImage1D(3552, 0, 6406, 2, 0, 6406, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(var1));
    GlRenderer.GL.glTexParameteri(3552, 10241, 9729);
    GlRenderer.GL.glTexParameteri(3552, 10240, 9729);
    GlRenderer.GL.glTexParameteri(3552, 10242, 0x812f);
    this.anInt2180 = var3[0];
  }

  private void method1701() {
    this.anInt2177 = GlRenderer.GL.glGenLists(2);
    GlRenderer.GL.glNewList(this.anInt2177, 4864);
    GlRenderer.GL.glTexEnvi(8960, 0x8590, 768);
    GlRenderer.GL.glTexEnvi(8960, 0x8581, 0x8576);
    GlRenderer.GL.glTexEnvf(8960, 0x8573, 2.0F);
    GlRenderer.GL.glTexEnvi(8960, 0x8589, 0x8576);
    GlRenderer.GL.glTexGeni(8192, 9472, 9217);
    GlRenderer.GL.glTexGeni(8193, 9472, 9217);
    GlRenderer.GL
        .glTexGenfv(8192, 9473, new float[] {9.765625E-4F, 0.0F, 0.0F, 0.0F}, 0);
    GlRenderer.GL
        .glTexGenfv(8193, 9473, new float[] {0.0F, 0.0F, 9.765625E-4F, 0.0F}, 0);
    GlRenderer.GL.glEnable(3168);
    GlRenderer.GL.glEnable(3169);
    if (SomethingGl.aBoolean1227) {
      GlRenderer.GL.glBindTexture(0x806f, SomethingGl.anInt1228);
      GlRenderer.GL.glTexGeni(8194, 9472, 9217);
      GlRenderer.GL.glTexGeni(8195, 9472, 9217);
      GlRenderer.GL
          .glTexGenfv(8195, 9473, new float[] {0.0F, 0.0F, 0.0F, 1.0F}, 0);
      GlRenderer.GL.glEnable(3170);
      GlRenderer.GL.glEnable(3171);
      GlRenderer.GL.glEnable(0x806f);
    }

    GlRenderer.GL.glActiveTexture(0x84c1);
    GlRenderer.GL.glEnable(3552);
    GlRenderer.GL.glBindTexture(3552, this.anInt2180);
    GlRenderer.GL.glTexEnvi(8960, 0x8571, 0x8575);
    GlRenderer.GL.glTexEnvi(8960, 0x8580, 0x8576);
    GlRenderer.GL.glTexEnvi(8960, 0x8582, 5890);
    GlRenderer.GL.glTexEnvi(8960, 0x8572, 0x8575);
    GlRenderer.GL.glTexEnvi(8960, 0x8588, 0x8576);
    GlRenderer.GL.glTexEnvi(8960, 0x858a, 5890);
    GlRenderer.GL.glEnable(3168);
    GlRenderer.GL.glTexGeni(8192, 9472, 9216);
    GlRenderer.GL.glPushMatrix();
    GlRenderer.GL.glLoadIdentity();
    GlRenderer.GL.glEndList();
    GlRenderer.GL.glNewList(this.anInt2177 + 1, 4864);
    GlRenderer.GL.glActiveTexture(0x84c1);
    GlRenderer.GL.glDisable(3552);
    GlRenderer.GL.glDisable(3168);
    GlRenderer.GL.glTexEnvi(8960, 0x8571, 8448);
    GlRenderer.GL.glTexEnvi(8960, 0x8580, 5890);
    GlRenderer.GL.glTexEnvi(8960, 0x8582, 0x8576);
    GlRenderer.GL.glTexEnvi(8960, 0x8572, 8448);
    GlRenderer.GL.glTexEnvi(8960, 0x8588, 5890);
    GlRenderer.GL.glTexEnvi(8960, 0x858a, 0x8576);
    GlRenderer.GL.glActiveTexture(0x84c0);
    GlRenderer.GL.glTexEnvi(8960, 0x8590, 768);
    GlRenderer.GL.glTexEnvi(8960, 0x8581, 0x8578);
    GlRenderer.GL.glTexEnvf(8960, 0x8573, 1.0F);
    GlRenderer.GL.glTexEnvi(8960, 0x8589, 0x8578);
    GlRenderer.GL.glDisable(3168);
    GlRenderer.GL.glDisable(3169);
    if (SomethingGl.aBoolean1227) {
      GlRenderer.GL.glDisable(3170);
      GlRenderer.GL.glDisable(3171);
      GlRenderer.GL.glDisable(0x806f);
    }

    GlRenderer.GL.glEndList();
  }

  public void disable() {
    GlRenderer.GL.glCallList(this.anInt2177 + 1);
  }

  public void enable() {
    GlRenderer.method1856(2);
    GlRenderer.method1847(2);
    GlRenderer.loadIdentityTextureMatrix();
    GlRenderer.GL.glCallList(this.anInt2177);
    float var2 = 2662.4001F;
    var2 += (GlobalStatics_9.anInt2938 - 128) * 0.5F;
    if (var2 >= 3328.0F) {
      var2 = 3327.0F;
    }

    this.aFloatArray2179[0] = 0.0F;
    this.aFloatArray2179[1] = 0.0F;
    this.aFloatArray2179[2] = 1.0F / (var2 - 3328.0F);
    this.aFloatArray2179[3] = var2 / (var2 - 3328.0F);
    GlRenderer.GL.glTexGenfv(8192, 9474, this.aFloatArray2179, 0);
    GlRenderer.GL.glPopMatrix();
    GlRenderer.GL.glActiveTexture(0x84c0);
    GlRenderer.GL.glTexEnvfv(8960, 8705, MaterialShader4.aFloatArray2178, 0);
  }

  public void set(int var1) {
    GlRenderer.GL.glActiveTexture(0x84c1);
    GlRenderer.GL
        .glTexEnvfv(8960, 8705, GlobalStatics_5.aFloatArray1934, 0);
    GlRenderer.GL.glActiveTexture(0x84c0);
    if ((var1 & 1) == 1) {
      if (SomethingGl.aBoolean1227) {
        if (this.anInt2181 != GlRenderer.anInt1791) {
          this.aFloatArray2179[0] = 0.0F;
          this.aFloatArray2179[1] = 0.0F;
          this.aFloatArray2179[2] = 0.0F;
          this.aFloatArray2179[3] = GlRenderer.anInt1791 * 0.0050F;
          GlRenderer.GL.glTexGenfv(8194, 9473, this.aFloatArray2179, 0);
          this.anInt2181 = GlRenderer.anInt1791;
        }
      } else {
        GlRenderer.bindTexture(SomethingGl.anIntArray1224[GlRenderer.anInt1791 * 64 / 100 % 64]);
      }
    } else if (SomethingGl.aBoolean1227) {
      this.aFloatArray2179[0] = 0.0F;
      this.aFloatArray2179[1] = 0.0F;
      this.aFloatArray2179[2] = 0.0F;
      this.aFloatArray2179[3] = 0.0F;
      GlRenderer.GL.glTexGenfv(8194, 9473, this.aFloatArray2179, 0);
    } else {
      GlRenderer.bindTexture(SomethingGl.anIntArray1224[0]);
    }

  }

  public int method24() {
    return 15;
  }

  public static void method1700() {
    MaterialShader4.aFloatArray2178 = null;
  }

}
