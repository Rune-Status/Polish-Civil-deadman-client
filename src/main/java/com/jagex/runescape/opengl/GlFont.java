package com.jagex.runescape.opengl;

import com.jagex.runescape.model.AbstractFont;
import com.jogamp.opengl.GL;
import java.nio.ByteBuffer;

public final class GlFont extends AbstractFont {

  private int anInt4083;
  private int anInt4084 = -1;
  private int[] anIntArray4085;
  private int anInt4086;
  private int anInt4087;

  public GlFont(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5,
      byte[][] var6) {
    super(var1, var2, var3, var4, var5);
    this.method708(var6);
    this.method707();
  }

  protected void finalize() throws Throwable {
    if (this.anInt4084 != -1) {
      DummyClass33.method991(this.anInt4084, this.anInt4083, this.anInt4086);
      this.anInt4084 = -1;
      this.anInt4083 = 0;
    }

    if (this.anIntArray4085 != null) {
      for (int i : this.anIntArray4085) {
        DummyClass33.method986(i, this.anInt4086);
      }

      this.anIntArray4085 = null;
    }

    super.finalize();
  }

  public void method678(int var1, int var2, int var3, int var4, int var5,
      int var6) {
    if (GlUtils.aClass3_Sub28_Sub16_Sub1_447 != null) {
      GlRenderer.method1824();
      GlRenderer.GL
          .glColor3ub((byte) (var6 >> 16), (byte) (var6 >> 8), (byte) var6);
      GlRenderer.GL.glTranslatef(var2, GlRenderer.viewHeight - var3, 0.0F);
      float var9 = (var1 % 16) / 16.0F;
      float var10 = (var1 / 16) / 16.0F;
      float var11 = var9 + (float) this.anIntArray3709[var1] / this.anInt4087;
      float var12 = var10 + (float) this.anIntArray3721[var1] / this.anInt4087;
      GlRenderer.bindTexture(this.anInt4084);
      GlDirectColorSprite var13 = GlUtils.aClass3_Sub28_Sub16_Sub1_447;
      GlRenderer.GL.glActiveTexture(0x84c1);
      GlRenderer.GL.glEnable(GL.GL_TEXTURE_2D);
      GlRenderer.GL.glBindTexture(GL.GL_TEXTURE_2D, var13.textureId);
      GlRenderer.GL.glTexEnvi(8960, 0x8571, 7681);
      GlRenderer.GL.glTexEnvi(8960, 0x8580, 0x8578);
      float var14 = (float) (var2 - GlUtils.anInt449) / var13.anInt4075;
      float var15 = (float) (var3 - GlUtils.anInt448) / var13.anInt4079;
      float var16 = (float) (var2 + var4 - GlUtils.anInt449) / var13.anInt4075;
      float var17 = (float) (var3 + var5 - GlUtils.anInt448) / var13.anInt4079;
      GlRenderer.GL.glBegin(6);
      GlRenderer.GL.glMultiTexCoord2f(0x84c1, var16, var15);
      GlRenderer.GL.glTexCoord2f(var11, var10);
      GlRenderer.GL.glVertex2f(this.anIntArray3709[var1], 0.0F);
      GlRenderer.GL.glMultiTexCoord2f(0x84c1, var14, var15);
      GlRenderer.GL.glTexCoord2f(var9, var10);
      GlRenderer.GL.glVertex2f(0.0F, 0.0F);
      GlRenderer.GL.glMultiTexCoord2f(0x84c1, var14, var17);
      GlRenderer.GL.glTexCoord2f(var9, var12);
      GlRenderer.GL.glVertex2f(0.0F, -this.anIntArray3721[var1]);
      GlRenderer.GL.glMultiTexCoord2f(0x84c1, var16, var17);
      GlRenderer.GL.glTexCoord2f(var11, var12);
      GlRenderer.GL
          .glVertex2f(this.anIntArray3709[var1], -this.anIntArray3721[var1]);
      GlRenderer.GL.glEnd();
      GlRenderer.GL.glTexEnvi(8960, 0x8571, 8448);
      GlRenderer.GL.glTexEnvi(8960, 0x8580, 5890);
      GlRenderer.GL.glDisable(GL.GL_TEXTURE_2D);
      GlRenderer.GL.glActiveTexture(0x84c0);
      GlRenderer.GL.glLoadIdentity();
    } else {
      GlRenderer.method1824();
      GlRenderer.bindTexture(this.anInt4084);
      GlRenderer.GL
          .glColor3ub((byte) (var6 >> 16), (byte) (var6 >> 8), (byte) var6);
      GlRenderer.GL.glTranslatef(var2, GlRenderer.viewHeight - var3, 0.0F);
      GlRenderer.GL.glCallList(this.anIntArray4085[var1]);
      GlRenderer.GL.glLoadIdentity();
    }

  }

  public void method679(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int var7) {
    GlRenderer.method1824();
    GlRenderer.bindTexture(this.anInt4084);
    GlRenderer.GL
        .glColor4ub((byte) (var6 >> 16), (byte) (var6 >> 8), (byte) var6,
            var7 > 255 ? -1 : (byte) var7);
    GlRenderer.GL.glTranslatef(var2, GlRenderer.viewHeight - var3, 0.0F);
    GlRenderer.GL.glCallList(this.anIntArray4085[var1]);
    GlRenderer.GL.glLoadIdentity();
  }

  private void method707() {
    if (this.anIntArray4085 == null) {
      this.anIntArray4085 = new int[256];

      for (int var2 = 0; var2 < 256; ++var2) {
        float var3 = (var2 % 16) / 16.0F;
        float var4 = (var2 / 16) / 16.0F;
        float var5 = var3 + (float) this.anIntArray3709[var2] / this.anInt4087;
        float var6 = var4 + (float) this.anIntArray3721[var2] / this.anInt4087;
        this.anIntArray4085[var2] = GlRenderer.GL.glGenLists(1);
        GlRenderer.GL.glNewList(this.anIntArray4085[var2], 4864);
        GlRenderer.GL.glBegin(6);
        GlRenderer.GL.glTexCoord2f(var5, var4);
        GlRenderer.GL.glVertex2f(this.anIntArray3709[var2], 0.0F);
        GlRenderer.GL.glTexCoord2f(var3, var4);
        GlRenderer.GL.glVertex2f(0.0F, 0.0F);
        GlRenderer.GL.glTexCoord2f(var3, var6);
        GlRenderer.GL.glVertex2f(0.0F, -this.anIntArray3721[var2]);
        GlRenderer.GL.glTexCoord2f(var5, var6);
        GlRenderer.GL.glVertex2f(this.anIntArray3709[var2],
            -this.anIntArray3721[var2]);
        GlRenderer.GL.glEnd();
        GlRenderer.GL.glEndList();
      }

      this.anInt4086 = DummyClass33.anInt582;
    }
  }

  private void method708(byte[][] var1) {
    if (this.anInt4084 == -1) {
      this.anInt4087 = 0;

      int var2;
      for (var2 = 0; var2 < 256; ++var2) {
        if (this.anIntArray3721[var2] > this.anInt4087) {
          this.anInt4087 = this.anIntArray3721[var2];
        }

        if (this.anIntArray3709[var2] > this.anInt4087) {
          this.anInt4087 = this.anIntArray3709[var2];
        }
      }

      this.anInt4087 *= 16;
      this.anInt4087 = GLStatics.nearestPo2((byte) 104, this.anInt4087);
      var2 = this.anInt4087 / 16;
      byte[] var3 = new byte[this.anInt4087 * this.anInt4087 * 2];

      for (int var4 = 0; var4 < 256; ++var4) {
        int var5 = var4 % 16 * var2;
        int var6 = var4 / 16 * var2;
        int var7 = (var6 * this.anInt4087 + var5) * 2;
        int var8 = 0;
        int var9 = this.anIntArray3721[var4];
        int var10 = this.anIntArray3709[var4];
        byte[] var11 = var1[var4];

        for (int var12 = 0; var12 < var9; ++var12) {
          for (int var13 = 0; var13 < var10; ++var13) {
            if (var11[var8++] == 0) {
              var7 += 2;
            } else {
              var3[var7++] = -1;
              var3[var7++] = -1;
            }
          }

          var7 += (this.anInt4087 - var10) * 2;
        }
      }

      ByteBuffer var14 = ByteBuffer.wrap(var3);
      if (this.anInt4084 == -1) {
        int[] var16 = new int[1];
        GlRenderer.GL.glGenTextures(1, var16, 0);
        this.anInt4084 = var16[0];
        this.anInt4086 = DummyClass33.anInt582;
      }

      GlRenderer.bindTexture(this.anInt4084);
      GlRenderer.GL
          .glTexImage2D(GL.GL_TEXTURE_2D, 0, 6410, this.anInt4087, this.anInt4087, 0, 6410,
              GL.GL_UNSIGNED_BYTE, var14);
      DummyClass33.texture2dMemory += var14.limit() - this.anInt4083;
      this.anInt4083 = var14.limit();
      GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10241, 9728);
      GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10240, 9728);
    }
  }
}
