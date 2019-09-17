package com.jagex.runescape.opengl;

import com.jagex.runescape.model.AbstractDirectColorSprite;
import com.jagex.runescape.model.SoftwareDirectColorSprite;
import com.jogamp.opengl.GL;
import java.nio.ByteBuffer;

public class GlDirectColorSprite extends AbstractDirectColorSprite {

  public int anInt4074;
  public int anInt4075;
  public int textureId = -1;
  public int anInt4079;
  private int anInt4076 = -1;
  private int anInt4078;
  private int anInt4080;

  public GlDirectColorSprite(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int[] var7) {
    this.anInt3697 = var1;
    this.anInt3706 = var2;
    this.anInt3701 = var3;
    this.anInt3698 = var4;
    this.anInt3707 = var5;
    this.anInt3696 = var6;
    this.initialize(var7);
    this.method651();
  }

  public GlDirectColorSprite(SoftwareDirectColorSprite var1) {
    this.anInt3697 = var1.anInt3697;
    this.anInt3706 = var1.anInt3706;
    this.anInt3701 = var1.anInt3701;
    this.anInt3698 = var1.anInt3698;
    this.anInt3707 = var1.anInt3707;
    this.anInt3696 = var1.anInt3696;
    this.initialize(var1.pixels);
    this.method651();
  }

  private void initializeParameters(int var1) {
    if (this.anInt4078 != var1) {
      this.anInt4078 = var1;
      if (var1 == 2) {
        GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10241, 9729);
        GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10240, 9729);
      } else {
        GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10241, 9728);
        GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10240, 9728);
      }

    }
  }

  public final void method645(int var1, int var2, GlDirectColorSprite var3) {
    if (var3 != null) {
      GlRenderer.method1822();
      GlRenderer.bindTexture(var3.textureId);
      var3.initializeParameters(1);
      GlRenderer.bindTexture(this.textureId);
      this.initializeParameters(1);
      GlRenderer.GL.glActiveTexture(0x84c1);
      GlRenderer.GL.glEnable(GL.GL_TEXTURE_2D);
      GlRenderer.GL.glBindTexture(GL.GL_TEXTURE_2D, var3.textureId);
      GlRenderer.GL.glTexEnvi(8960, 0x8571, 7681);
      GlRenderer.GL.glTexEnvi(8960, 0x8580, 0x8578);
      float var5 = (float) (var1 - GlUtils.anInt449) / var3.anInt4075;
      float var6 = (float) (var2 - GlUtils.anInt448) / var3.anInt4079;
      float var7 =
          (float) (var1 + this.anInt3707 - GlUtils.anInt449) / var3.anInt4075;
      float var8 =
          (float) (var2 + this.anInt3696 - GlUtils.anInt448) / var3.anInt4079;
      var1 += this.anInt3701;
      var2 += this.anInt3698;
      GlRenderer.GL.glBegin(6);
      GlRenderer.GL.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var9 = (float) this.anInt3707 / this.anInt4075;
      float var10 = (float) this.anInt3696 / this.anInt4079;
      GlRenderer.GL.glMultiTexCoord2f(0x84c1, var7, var6);
      GlRenderer.GL.glTexCoord2f(var9, 0.0F);
      GlRenderer.GL
          .glVertex2f(var1 + this.anInt3707, GlRenderer.viewHeight - var2);
      GlRenderer.GL.glMultiTexCoord2f(0x84c1, var5, var6);
      GlRenderer.GL.glTexCoord2f(0.0F, 0.0F);
      GlRenderer.GL.glVertex2f(var1, GlRenderer.viewHeight - var2);
      GlRenderer.GL.glMultiTexCoord2f(0x84c1, var5, var8);
      GlRenderer.GL.glTexCoord2f(0.0F, var10);
      GlRenderer.GL
          .glVertex2f(var1, GlRenderer.viewHeight - (var2 + this.anInt3696));
      GlRenderer.GL.glMultiTexCoord2f(0x84c1, var7, var8);
      GlRenderer.GL.glTexCoord2f(var9, var10);
      GlRenderer.GL.glVertex2f(var1 + this.anInt3707,
          GlRenderer.viewHeight - (var2 + this.anInt3696));
      GlRenderer.GL.glEnd();
      GlRenderer.GL.glTexEnvi(8960, 0x8571, 8448);
      GlRenderer.GL.glTexEnvi(8960, 0x8580, 5890);
      GlRenderer.GL.glDisable(GL.GL_TEXTURE_2D);
      GlRenderer.GL.glActiveTexture(0x84c0);
    }
  }

  public final void method646(int var1, int var2, int var3, int var4,
      int var5) {
    GlRenderer.method1828();
    GlRenderer.bindTexture(this.textureId);
    this.initializeParameters(1);
    float var7 = (float) this.anInt3707 / this.anInt4075;
    float var8 = (float) this.anInt3696 / this.anInt4079;
    var7 *= var4;
    var8 *= var5;
    int var9 = var1 + this.anInt3701;
    int var10 = var9 + this.anInt3707 * var4;
    int var11 = GlRenderer.viewHeight - var2 - this.anInt3698;
    int var12 = var11 - this.anInt3696 * var5;
    float var13 = var3 / 256.0F;
    GlRenderer.GL.glBegin(6);
    GlRenderer.GL.glColor4f(1.0F, 1.0F, 1.0F, var13);
    GlRenderer.GL.glTexCoord2f(var7, 0.0F);
    GlRenderer.GL.glVertex2f(var10, var11);
    GlRenderer.GL.glTexCoord2f(0.0F, 0.0F);
    GlRenderer.GL.glVertex2f(var9, var11);
    GlRenderer.GL.glTexCoord2f(0.0F, var8);
    GlRenderer.GL.glVertex2f(var9, var12);
    GlRenderer.GL.glTexCoord2f(var7, var8);
    GlRenderer.GL.glVertex2f(var10, var12);
    GlRenderer.GL.glEnd();
  }

  public final void draw(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int angle,
      int var8,
      GlDirectColorSprite sprite) {
    if (sprite != null) {
      GlRenderer.method1822();
      GlRenderer.bindTexture(sprite.textureId);
      sprite.initializeParameters(1);
      GlRenderer.bindTexture(this.textureId);
      this.initializeParameters(1);
      GlRenderer.GL.glActiveTexture(0x84c1);
      GlRenderer.GL.glEnable(GL.GL_TEXTURE_2D);
      GlRenderer.GL.glBindTexture(GL.GL_TEXTURE_2D, sprite.textureId);
      GlRenderer.GL.glTexEnvi(8960, 0x8571, 7681);
      GlRenderer.GL.glTexEnvi(8960, 0x8580, 0x8578);
      int var11 = -var3 / 2;
      int var12 = -var4 / 2;
      int var13 = -var11;
      int var14 = -var12;
      int var15 = (int) (Math.sin(angle / 326.11D) * 65536.0D);
      int var16 = (int) (Math.cos(angle / 326.11D) * 65536.0D);
      var15 = var15 * var8 >> 8;
      var16 = var16 * var8 >> 8;
      int var17 = (var5 << 16) + var12 * var15 + var11 * var16;
      int var18 = (var6 << 16) + var12 * var16 - var11 * var15;
      int var19 = (var5 << 16) + var12 * var15 + var13 * var16;
      int var20 = (var6 << 16) + var12 * var16 - var13 * var15;
      int var21 = (var5 << 16) + var14 * var15 + var11 * var16;
      int var22 = (var6 << 16) + var14 * var16 - var11 * var15;
      int var23 = (var5 << 16) + var14 * var15 + var13 * var16;
      int var24 = (var6 << 16) + var14 * var16 - var13 * var15;
      float var25 = (float) sprite.anInt3707 / sprite.anInt4075;
      float var26 = (float) sprite.anInt3696 / sprite.anInt4079;
      GlRenderer.GL.glBegin(6);
      GlRenderer.GL.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var27 = 65536.0F * this.anInt4075;
      float var28 = 65536 * this.anInt4079;
      GlRenderer.GL.glMultiTexCoord2f(0x84c1, var25, 0.0F);
      GlRenderer.GL.glTexCoord2f(var19 / var27, var20 / var28);
      GlRenderer.GL.glVertex2f(var1 + var3, GlRenderer.viewHeight - var2);
      GlRenderer.GL.glMultiTexCoord2f(0x84c1, 0.0F, 0.0F);
      GlRenderer.GL.glTexCoord2f(var17 / var27, var18 / var28);
      GlRenderer.GL.glVertex2f(var1, GlRenderer.viewHeight - var2);
      GlRenderer.GL.glMultiTexCoord2f(0x84c1, 0.0F, var26);
      GlRenderer.GL.glTexCoord2f(var21 / var27, var22 / var28);
      GlRenderer.GL.glVertex2f(var1, GlRenderer.viewHeight - (var2 + var4));
      GlRenderer.GL.glMultiTexCoord2f(0x84c1, var25, var26);
      GlRenderer.GL.glTexCoord2f(var23 / var27, var24 / var28);
      GlRenderer.GL
          .glVertex2f(var1 + var3, GlRenderer.viewHeight - (var2 + var4));
      GlRenderer.GL.glEnd();
      GlRenderer.GL.glTexEnvi(8960, 0x8571, 8448);
      GlRenderer.GL.glTexEnvi(8960, 0x8580, 5890);
      GlRenderer.GL.glDisable(GL.GL_TEXTURE_2D);
      GlRenderer.GL.glActiveTexture(0x84c0);
    }
  }

  public final void method648(int var1, int var2, int var3, int var4, int var5,
      int var6) {
    GlRenderer.method1822();
    GlRenderer.bindTexture(this.textureId);
    this.initializeParameters(2);
    var1 -= this.anInt3701 << 4;
    var2 -= this.anInt3698 << 4;
    GlRenderer.GL
        .glTranslatef(var3 / 16.0F, GlRenderer.viewHeight - var4 / 16.0F,
            0.0F);
    GlRenderer.GL.glRotatef(-var5 * 0.005493164F, 0.0F, 0.0F, 1.0F);
    if (var6 != 4096) {
      GlRenderer.GL.glScalef(var6 / 4096.0F, var6 / 4096.0F, 0.0F);
    }

    GlRenderer.GL.glTranslatef(-var1 / 16.0F, var2 / 16.0F, 0.0F);
    GlRenderer.GL.glCallList(this.anInt4076);
    GlRenderer.GL.glLoadIdentity();
  }

  public final void method635(int var1, int var2) {
    GlRenderer.method1822();
    var1 += this.anInt3701;
    var2 += this.anInt3698;
    GlRenderer.bindTexture(this.textureId);
    this.initializeParameters(1);
    GlRenderer.GL.glTranslatef(var1, GlRenderer.viewHeight - var2, 0.0F);
    GlRenderer.GL.glCallList(this.anInt4076);
    GlRenderer.GL.glLoadIdentity();
  }

  public final void method636(int var1, int var2, int var3, int var4, int var5,
      int var6) {
    GlRenderer.method1822();
    GlRenderer.bindTexture(this.textureId);
    this.initializeParameters(1);
    var1 -= this.anInt3701 << 4;
    var2 -= this.anInt3698 << 4;
    GlRenderer.GL
        .glTranslatef(var3 / 16.0F, GlRenderer.viewHeight - var4 / 16.0F,
            0.0F);
    GlRenderer.GL.glRotatef(var5 * 0.005493164F, 0.0F, 0.0F, 1.0F);
    if (var6 != 4096) {
      GlRenderer.GL.glScalef(var6 / 4096.0F, var6 / 4096.0F, 0.0F);
    }

    GlRenderer.GL.glTranslatef(-var1 / 16.0F, var2 / 16.0F, 0.0F);
    GlRenderer.GL.glCallList(this.anInt4076);
    GlRenderer.GL.glLoadIdentity();
  }

  public final void method637(int var1, int var2, int var3) {
    GlRenderer.method1828();
    var1 += this.anInt3701;
    var2 += this.anInt3698;
    GlRenderer.bindTexture(this.textureId);
    this.initializeParameters(1);
    GlRenderer.GL.glColor4f(1.0F, 1.0F, 1.0F, var3 / 256.0F);
    GlRenderer.GL.glTranslatef(var1, GlRenderer.viewHeight - var2, 0.0F);
    GlRenderer.GL.glCallList(this.anInt4076);
    GlRenderer.GL.glLoadIdentity();
  }

  public final void draw(int var1, int var2, int var3, int var4) {
    if (var3 > 0 && var4 > 0) {
      GlRenderer.method1822();
      int var5 = this.anInt3707;
      int var6 = this.anInt3696;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.anInt3697;
      int var10 = this.anInt3706;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.anInt3701 > 0) {
        var13 = ((this.anInt3701 << 16) + var11 - 1) / var11;
        var1 += var13;
        var7 += var13 * var11 - (this.anInt3701 << 16);
      }

      if (this.anInt3698 > 0) {
        var13 = ((this.anInt3698 << 16) + var12 - 1) / var12;
        var2 += var13;
        var8 += var13 * var12 - (this.anInt3698 << 16);
      }

      if (var5 < var9) {
        var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
        var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      GlRenderer.bindTexture(this.textureId);
      this.initializeParameters(2);
      float var14 = var1;
      float var15 = var14 + var3;
      float var16 = GlRenderer.viewHeight - var2;
      float var17 = var16 - var4;
      float var18 = (float) this.anInt3707 / this.anInt4075;
      float var19 = (float) this.anInt3696 / this.anInt4079;
      GlRenderer.GL.glBegin(6);
      GlRenderer.GL.glTexCoord2f(var18, 0.0F);
      GlRenderer.GL.glVertex2f(var15, var16);
      GlRenderer.GL.glTexCoord2f(0.0F, 0.0F);
      GlRenderer.GL.glVertex2f(var14, var16);
      GlRenderer.GL.glTexCoord2f(0.0F, var19);
      GlRenderer.GL.glVertex2f(var14, var17);
      GlRenderer.GL.glTexCoord2f(var18, var19);
      GlRenderer.GL.glVertex2f(var15, var17);
      GlRenderer.GL.glEnd();
    }
  }

  public final void method641(int var1, int var2) {
    GlRenderer.method1822();
    var1 += this.anInt3701;
    var2 += this.anInt3698;
    GlRenderer.bindTexture(this.textureId);
    this.initializeParameters(1);
    GlRenderer.GL.glTranslatef(var1, GlRenderer.viewHeight - var2, 0.0F);
    float var4 = (float) this.anInt3707 / this.anInt4075;
    float var5 = (float) this.anInt3696 / this.anInt4079;
    GlRenderer.GL.glBegin(6);
    GlRenderer.GL.glTexCoord2f(0.0F, 0.0F);
    GlRenderer.GL.glVertex2f(this.anInt3707, 0.0F);
    GlRenderer.GL.glTexCoord2f(var4, 0.0F);
    GlRenderer.GL.glVertex2f(0.0F, 0.0F);
    GlRenderer.GL.glTexCoord2f(var4, var5);
    GlRenderer.GL.glVertex2f(0.0F, -this.anInt3696);
    GlRenderer.GL.glTexCoord2f(0.0F, var5);
    GlRenderer.GL.glVertex2f(this.anInt3707, -this.anInt3696);
    GlRenderer.GL.glEnd();
    GlRenderer.GL.glLoadIdentity();
  }

  public final void method642(int var1, int var2, int var3, int var4,
      int var5) {
    if (var3 > 0 && var4 > 0) {
      GlRenderer.method1828();
      int var6 = this.anInt3707;
      int var7 = this.anInt3696;
      int var8 = 0;
      int var9 = 0;
      int var10 = this.anInt3697;
      int var11 = this.anInt3706;
      int var12 = (var10 << 16) / var3;
      int var13 = (var11 << 16) / var4;
      int var14;
      if (this.anInt3701 > 0) {
        var14 = ((this.anInt3701 << 16) + var12 - 1) / var12;
        var1 += var14;
        var8 += var14 * var12 - (this.anInt3701 << 16);
      }

      if (this.anInt3698 > 0) {
        var14 = ((this.anInt3698 << 16) + var13 - 1) / var13;
        var2 += var14;
        var9 += var14 * var13 - (this.anInt3698 << 16);
      }

      if (var6 < var10) {
        var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      if (var7 < var11) {
        var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
      }

      GlRenderer.bindTexture(this.textureId);
      this.initializeParameters(1);
      float var15 = var1;
      float var16 = var15 + var3;
      float var17 = GlRenderer.viewHeight - var2;
      float var18 = var17 - var4;
      float var19 = (float) this.anInt3707 / this.anInt4075;
      float var20 = (float) this.anInt3696 / this.anInt4079;
      float var21 = var5 / 256.0F;
      GlRenderer.GL.glBegin(6);
      GlRenderer.GL.glColor4f(1.0F, 1.0F, 1.0F, var21);
      GlRenderer.GL.glTexCoord2f(var19, 0.0F);
      GlRenderer.GL.glVertex2f(var16, var17);
      GlRenderer.GL.glTexCoord2f(0.0F, 0.0F);
      GlRenderer.GL.glVertex2f(var15, var17);
      GlRenderer.GL.glTexCoord2f(0.0F, var20);
      GlRenderer.GL.glVertex2f(var15, var18);
      GlRenderer.GL.glTexCoord2f(var19, var20);
      GlRenderer.GL.glVertex2f(var16, var18);
      GlRenderer.GL.glEnd();
    }
  }

  public final void method643(int var1, int var2) {
    GlRenderer.method1822();
    var1 += this.anInt3701;
    var2 += this.anInt3698;
    GlRenderer.bindTexture(this.textureId);
    this.initializeParameters(1);
    GlRenderer.GL.glTranslatef(var1, GlRenderer.viewHeight - var2, 0.0F);
    GlRenderer.GL.glCallList(this.anInt4076);
    GlRenderer.GL.glLoadIdentity();
  }

  protected final void finalize() throws Throwable {
    if (this.textureId != -1) {
      DummyClass33.method991(this.textureId, this.anInt4074, this.anInt4080);
      this.textureId = -1;
      this.anInt4074 = 0;
    }

    if (this.anInt4076 != -1) {
      DummyClass33.method986(this.anInt4076, this.anInt4080);
      this.anInt4076 = -1;
    }

    super.finalize();
  }

  public final void method649(int var1, int var2, int var3, int var4) {
    GlRenderer.method1822();
    GlRenderer.bindTexture(this.textureId);
    this.initializeParameters(1);
    float var6 = (float) this.anInt3707 / this.anInt4075;
    float var7 = (float) this.anInt3696 / this.anInt4079;
    var6 *= var3;
    var7 *= var4;
    int var8 = var1 + this.anInt3701;
    int var9 = var8 + this.anInt3707 * var3;
    int var10 = GlRenderer.viewHeight - var2 - this.anInt3698;
    int var11 = var10 - this.anInt3696 * var4;
    GlRenderer.GL.glBegin(6);
    GlRenderer.GL.glTexCoord2f(var6, 0.0F);
    GlRenderer.GL.glVertex2f(var9, var10);
    GlRenderer.GL.glTexCoord2f(0.0F, 0.0F);
    GlRenderer.GL.glVertex2f(var8, var10);
    GlRenderer.GL.glTexCoord2f(0.0F, var7);
    GlRenderer.GL.glVertex2f(var8, var11);
    GlRenderer.GL.glTexCoord2f(var6, var7);
    GlRenderer.GL.glVertex2f(var9, var11);
    GlRenderer.GL.glEnd();
  }

  public void initialize(int[] var1) {
    this.anInt4075 = GLStatics.nearestPo2((byte) 125, this.anInt3707);
    this.anInt4079 = GLStatics.nearestPo2((byte) 59, this.anInt3696);
    byte[] var2 = new byte[this.anInt4075 * this.anInt4079 * 4];
    int var3 = 0;
    int var4 = 0;
    int var5 = (this.anInt4075 - this.anInt3707) * 4;

    for (int var6 = 0; var6 < this.anInt3696; ++var6) {
      for (int var7 = 0; var7 < this.anInt3707; ++var7) {
        int var8 = var1[var4++];
        if (var8 == 0) {
          var3 += 4;
        } else {
          var2[var3++] = (byte) (var8 >> 16);
          var2[var3++] = (byte) (var8 >> 8);
          var2[var3++] = (byte) var8;
          var2[var3++] = -1;
        }
      }

      var3 += var5;
    }

    ByteBuffer var9 = ByteBuffer.wrap(var2);
    if (this.textureId == -1) {
      int[] var11 = new int[1];
      GlRenderer.GL.glGenTextures(1, var11, 0);
      this.textureId = var11[0];
      this.anInt4080 = DummyClass33.anInt582;
    }

    GlRenderer.bindTexture(this.textureId);
    GlRenderer.GL
        .glTexImage2D(GL.GL_TEXTURE_2D, 0, GL.GL_RGBA, this.anInt4075, this.anInt4079, 0, GL.GL_RGBA,
            GL.GL_UNSIGNED_BYTE, var9);
    DummyClass33.texture2dMemory += var9.limit() - this.anInt4074;
    this.anInt4074 = var9.limit();
  }

  private void method651() {
    float var1 = (float) this.anInt3707 / this.anInt4075;
    float var2 = (float) this.anInt3696 / this.anInt4079;
    if (this.anInt4076 == -1) {
      this.anInt4076 = GlRenderer.GL.glGenLists(1);
      this.anInt4080 = DummyClass33.anInt582;
    }

    GlRenderer.GL.glNewList(this.anInt4076, 4864);
    GlRenderer.GL.glBegin(6);
    GlRenderer.GL.glTexCoord2f(var1, 0.0F);
    GlRenderer.GL.glVertex2f(this.anInt3707, 0.0F);
    GlRenderer.GL.glTexCoord2f(0.0F, 0.0F);
    GlRenderer.GL.glVertex2f(0.0F, 0.0F);
    GlRenderer.GL.glTexCoord2f(0.0F, var2);
    GlRenderer.GL.glVertex2f(0.0F, -this.anInt3696);
    GlRenderer.GL.glTexCoord2f(var1, var2);
    GlRenderer.GL.glVertex2f(this.anInt3707, -this.anInt3696);
    GlRenderer.GL.glEnd();
    GlRenderer.GL.glEndList();
  }
}
