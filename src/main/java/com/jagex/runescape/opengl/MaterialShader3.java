package com.jagex.runescape.opengl;

import com.jagex.runescape.statics.GlobalStatics_0;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jagex.runescape.statics.GlobalStatics_9;
import com.jogamp.opengl.GL;
import java.nio.ByteBuffer;

public final class MaterialShader3 implements MaterialShader {

  private static boolean aBoolean2191;
  private final float[] aFloatArray2190 = new float[4];
  private int anInt2192 = -1;
  private int anInt2193 = -1;

  public MaterialShader3() {
    if (GlRenderer.maxTextureUnits >= 2) {
      int[] var1 = new int[1];
      byte[] var2 = new byte[8];

      for (int var3 = 0; var3 < 8;
          var2[var3++] = (byte) (96 + var3 * 159 / 8)) {
      }

      GlRenderer.GL.glGenTextures(1, var1, 0);
      GlRenderer.GL.glBindTexture(3552, var1[0]);
      GlRenderer.GL
          .glTexImage1D(3552, 0, 6406, 8, 0, 6406, GL.GL_UNSIGNED_BYTE, ByteBuffer.wrap(var2));
      GlRenderer.GL.glTexParameteri(3552, 10241, 9729);
      GlRenderer.GL.glTexParameteri(3552, 10240, 9729);
      GlRenderer.GL.glTexParameteri(3552, 10242, 0x812f);
      this.anInt2192 = var1[0];
      MaterialShader3.aBoolean2191 =
          GlRenderer.maxTextureUnits > 2 && GlRenderer.texture3dSupport;
      this.method2251();
    }

  }

  private void method2251() {
    this.anInt2193 = GlRenderer.GL.glGenLists(2);
    GlRenderer.GL.glNewList(this.anInt2193, 4864);
    GlRenderer.GL.glActiveTexture(0x84c1);
    if (MaterialShader3.aBoolean2191) {
      GlRenderer.GL.glBindTexture(0x806f, SomethingGl.anInt1228);
      GlRenderer.GL.glTexEnvi(8960, 0x8571, 260);
      GlRenderer.GL.glTexEnvi(8960, 0x8590, 768);
      GlRenderer.GL.glTexEnvi(8960, 0x8572, 7681);
      GlRenderer.GL.glTexEnvi(8960, 0x8588, 0x8578);
      GlRenderer.GL.glTexGeni(8192, 9472, 9216);
      GlRenderer.GL.glTexGeni(8194, 9472, 9216);
      GlRenderer.GL.glTexGeni(8193, 9472, 9216);
      GlRenderer.GL.glTexGeni(8195, 9472, 9217);
      GlRenderer.GL
          .glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
      GlRenderer.GL.glEnable(3168);
      GlRenderer.GL.glEnable(3169);
      GlRenderer.GL.glEnable(3170);
      GlRenderer.GL.glEnable(3171);
      GlRenderer.GL.glEnable(0x806f);
      GlRenderer.GL.glActiveTexture(0x84c2);
      GlRenderer.GL.glTexEnvi(8960, 8704, 0x8570);
    }

    GlRenderer.GL.glBindTexture(3552, this.anInt2192);
    GlRenderer.GL.glTexEnvi(8960, 0x8571, 0x8575);
    GlRenderer.GL.glTexEnvi(8960, 0x8580, 0x8576);
    GlRenderer.GL.glTexEnvi(8960, 0x8582, 5890);
    GlRenderer.GL.glTexEnvi(8960, 0x8572, 7681);
    GlRenderer.GL.glTexEnvi(8960, 0x8588, 0x8578);
    GlRenderer.GL.glTexGeni(8192, 9472, 9216);
    GlRenderer.GL.glEnable(3552);
    GlRenderer.GL.glEnable(3168);
    GlRenderer.GL.glActiveTexture(0x84c0);
    GlRenderer.GL.glEndList();
    GlRenderer.GL.glNewList(this.anInt2193 + 1, 4864);
    GlRenderer.GL.glActiveTexture(0x84c1);
    if (MaterialShader3.aBoolean2191) {
      GlRenderer.GL.glTexEnvi(8960, 0x8571, 8448);
      GlRenderer.GL.glTexEnvi(8960, 0x8590, 768);
      GlRenderer.GL.glTexEnvi(8960, 0x8572, 8448);
      GlRenderer.GL.glTexEnvi(8960, 0x8588, 5890);
      GlRenderer.GL.glDisable(3168);
      GlRenderer.GL.glDisable(3169);
      GlRenderer.GL.glDisable(3170);
      GlRenderer.GL.glDisable(3171);
      GlRenderer.GL.glDisable(0x806f);
      GlRenderer.GL.glActiveTexture(0x84c2);
      GlRenderer.GL.glTexEnvi(8960, 8704, 8448);
    }

    GlRenderer.GL
        .glTexEnvfv(8960, 8705, new float[]{0.0F, 1.0F, 0.0F, 1.0F}, 0);
    GlRenderer.GL.glTexEnvi(8960, 0x8571, 8448);
    GlRenderer.GL.glTexEnvi(8960, 0x8580, 5890);
    GlRenderer.GL.glTexEnvi(8960, 0x8582, 0x8576);
    GlRenderer.GL.glTexEnvi(8960, 0x8572, 8448);
    GlRenderer.GL.glTexEnvi(8960, 0x8588, 5890);
    GlRenderer.GL.glDisable(3552);
    GlRenderer.GL.glDisable(3168);
    GlRenderer.GL.glActiveTexture(0x84c0);
    GlRenderer.GL.glEndList();
  }

  public void disable() {
    GlRenderer.GL.glCallList(this.anInt2193 + 1);
  }

  public void enable() {
    GlRenderer.GL.glCallList(this.anInt2193);
  }

  public void set(int var1) {
    GlRenderer.GL.glActiveTexture(0x84c1);
    if (!MaterialShader3.aBoolean2191 && var1 < 0) {
      GlRenderer.GL.glDisable(3168);
    } else {
      GlRenderer.GL.glPushMatrix();
      GlRenderer.GL.glLoadIdentity();
      GlRenderer.GL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GlRenderer.GL
          .glRotatef(GlobalStatics_9.anInt2938 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
      GlRenderer.GL
          .glRotatef(GlobalStatics_9.anInt3103 * 360.0F / 2048.0F, 0.0F, 1.0F,
              0.0F);
      GlRenderer.GL.glTranslatef(-GlobalStatics_10.anInt144,
          -GlobalStatics_6.anInt3695, -GlobalStatics_0.anInt2587);
      if (MaterialShader3.aBoolean2191) {
        this.aFloatArray2190[0] = 0.0010F;
        this.aFloatArray2190[1] = 9.0E-4F;
        this.aFloatArray2190[2] = 0.0F;
        this.aFloatArray2190[3] = 0.0F;
        GlRenderer.GL.glTexGenfv(8192, 9474, this.aFloatArray2190, 0);
        this.aFloatArray2190[0] = 0.0F;
        this.aFloatArray2190[1] = 9.0E-4F;
        this.aFloatArray2190[2] = 0.0010F;
        this.aFloatArray2190[3] = 0.0F;
        GlRenderer.GL.glTexGenfv(8193, 9474, this.aFloatArray2190, 0);
        this.aFloatArray2190[0] = 0.0F;
        this.aFloatArray2190[1] = 0.0F;
        this.aFloatArray2190[2] = 0.0F;
        this.aFloatArray2190[3] = GlRenderer.anInt1791 * 0.0050F;
        GlRenderer.GL.glTexGenfv(8194, 9474, this.aFloatArray2190, 0);
        GlRenderer.GL.glActiveTexture(0x84c2);
      }

      GlRenderer.GL
          .glTexEnvfv(8960, 8705, GLStatics.calculateFogColor(), 0);
      if (var1 >= 0) {
        this.aFloatArray2190[0] = 0.0F;
        this.aFloatArray2190[1] = 1.0F / GlobalStatics_10.anInt3285;
        this.aFloatArray2190[2] = 0.0F;
        this.aFloatArray2190[3] = 1.0F * var1 / GlobalStatics_10.anInt3285;
        GlRenderer.GL.glTexGenfv(8192, 9474, this.aFloatArray2190, 0);
        GlRenderer.GL.glEnable(3168);
      } else {
        GlRenderer.GL.glDisable(3168);
      }

      GlRenderer.GL.glPopMatrix();
    }

    GlRenderer.GL.glActiveTexture(0x84c0);
  }

  public int method24() {
    return 0;
  }

  public static int method2252() {
    return MaterialShader3.aBoolean2191 ? 0x84c2 : 0x84c1;
  }

  public static void method2253() {
    GlRenderer.GL.glClientActiveTexture(MaterialShader3.method2252());
    GlRenderer.GL.glDisableClientState(0x8078);
    GlRenderer.GL.glClientActiveTexture(0x84c0);
  }

  public static void method2254() {
    GlRenderer.GL.glClientActiveTexture(MaterialShader3.method2252());
    GlRenderer.GL.glEnableClientState(0x8078);
    GlRenderer.GL.glClientActiveTexture(0x84c0);
  }

}
