package com.jagex.runescape.opengl;

import com.jagex.runescape.sprite.AbstractIndexedColorSprite;
import com.jogamp.opengl.GL;
import java.nio.ByteBuffer;

public final class GlIndexedColorSprite extends AbstractIndexedColorSprite {

  private int texture = -1;
  private int textureWidth;
  private int textureHeight;
  private int list = -1;
  private int linear = 0;
  private int anInt2678;
  private int anInt2679;

  public GlIndexedColorSprite(int var1, int var2, int var3, int var4, int width,
      int height,
      byte[] index,
      int[] palette) {
    this.anInt1469 = var1;
    this.anInt1467 = var2;
    this.offsetX = var3;
    this.offsetY = var4;
    this.width = width;
    this.height = height;
    this.initialize(index, palette);
    this.initializeList();
  }

  private void initialize(byte[] index, int[] palette) {
    this.textureWidth = GLStatics.nearestPo2((byte) 62, this.width);
    this.textureHeight = GLStatics.nearestPo2((byte) 99, this.height);
    byte[] dest = new byte[this.textureWidth * this.textureHeight * 4];
    int destOff = 0;
    int indexOff = 0;

    for (int y = 0; y < this.height; ++y) {
      for (int x = 0; x < this.width; ++x) {
        byte i = index[indexOff++];
        if (i == 0) {
          destOff += 4;
        } else {
          int color = palette[i];
          dest[destOff++] = (byte) (color >> 16);
          dest[destOff++] = (byte) (color >> 8);
          dest[destOff++] = (byte) color;
          dest[destOff++] = -1;
        }
      }

      destOff += (this.textureWidth - this.width) * 4;
    }

    ByteBuffer buffer = ByteBuffer.wrap(dest);
    if (this.texture == -1) {
      int[] var12 = new int[1];
      GlRenderer.GL.glGenTextures(1, var12, 0);
      this.texture = var12[0];
      this.anInt2679 = DummyClass33.anInt582;
    }

    GlRenderer.bindTexture(this.texture);
    GlRenderer.GL
        .glTexImage2D(GL.GL_TEXTURE_2D, 0, GL.GL_RGBA, this.textureWidth,
            this.textureHeight, 0,
            GL.GL_RGBA, GL.GL_UNSIGNED_BYTE, buffer);
    DummyClass33.texture2dMemory += buffer.limit() - this.anInt2678;
    this.anInt2678 = buffer.limit();
  }

  public void draw(int x, int y, int alpha) {

    GlRenderer.method1828();
    x += this.offsetX;
    y += this.offsetY;
    GlRenderer.bindTexture(this.texture);
    this.initializeParameters(1);
    GlRenderer.GL.glColor4f(1.0F, 1.0F, 1.0F, alpha / 256.0F);
    GlRenderer.GL.glTranslatef(x, GlRenderer.viewHeight - y, 0.0F);
    GlRenderer.GL.glCallList(this.list);
    GlRenderer.GL.glLoadIdentity();
  }

  public void draw(int x, int y) {

    GlRenderer.method1822();
    x += this.offsetX;
    y += this.offsetY;
    GlRenderer.bindTexture(this.texture);
    this.initializeParameters(1);
    GlRenderer.GL.glTranslatef(x, GlRenderer.viewHeight - y, 0.0F);
    GlRenderer.GL.glCallList(this.list);
    GlRenderer.GL.glLoadIdentity();
  }

  private void initializeParameters(int linear) {
    if (this.linear != linear) {
      this.linear = linear;
      if (linear == 2) {
        GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10241, GL.GL_LINEAR);
        GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10240, GL.GL_LINEAR);
      } else {
        GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10241, GL.GL_NEAREST);
        GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10240, GL.GL_NEAREST);
      }
    }
  }

  protected void finalize() throws Throwable {
    if (this.texture != -1) {
      DummyClass33.method991(this.texture, this.anInt2678, this.anInt2679);
      this.texture = -1;
      this.anInt2678 = 0;
    }

    if (this.list != -1) {
      DummyClass33.method986(this.list, this.anInt2679);
      this.list = -1;
    }

    super.finalize();
  }

  private void initializeList() {
    float u = (float) this.width / this.textureWidth;
    float v = (float) this.height / this.textureHeight;
    if (this.list == -1) {
      this.list = GlRenderer.GL.glGenLists(1);
      this.anInt2679 = DummyClass33.anInt582;
    }

    GlRenderer.GL.glNewList(this.list, 4864);
    GlRenderer.GL.glBegin(6);
    GlRenderer.GL.glTexCoord2f(u, 0.0F);
    GlRenderer.GL.glVertex2f(this.width, 0.0F);
    GlRenderer.GL.glTexCoord2f(0.0F, 0.0F);
    GlRenderer.GL.glVertex2f(0.0F, 0.0F);
    GlRenderer.GL.glTexCoord2f(0.0F, v);
    GlRenderer.GL.glVertex2f(0.0F, -this.height);
    GlRenderer.GL.glTexCoord2f(u, v);
    GlRenderer.GL.glVertex2f(this.width, -this.height);
    GlRenderer.GL.glEnd();
    GlRenderer.GL.glEndList();
  }
}
