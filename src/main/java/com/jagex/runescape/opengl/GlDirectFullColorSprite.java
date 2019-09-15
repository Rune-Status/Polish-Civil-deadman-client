package com.jagex.runescape.opengl;

import com.jagex.runescape.model.SoftwareDirectColorSprite;
import java.nio.ByteBuffer;

public final class GlDirectFullColorSprite extends GlDirectColorSprite {

  public GlDirectFullColorSprite(int var1, int var2, int var3, int var4,
      int var5,
      int var6,
      int[] var7) {
    super(var1, var2, var3, var4, var5, var6, var7);
  }

  public GlDirectFullColorSprite(SoftwareDirectColorSprite var1) {
    super(var1);
  }

  public void initialize(int[] var1) {
    this.anInt4075 = GLStatics.nearestPo2((byte) 111, this.anInt3707);
    this.anInt4079 = GLStatics.nearestPo2((byte) 76, this.anInt3696);
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
          var2[var3++] = (byte) (var8 >> 24);
        }
      }

      var3 += var5;
    }

    ByteBuffer var9 = ByteBuffer.wrap(var2);
    if (this.textureId == -1) {
      int[] var11 = new int[1];
      GlRenderer.GL.glGenTextures(1, var11, 0);
      this.textureId = var11[0];
    }

    GlRenderer.bindTexture(this.textureId);
    GlRenderer.GL
        .glTexImage2D(3553, 0, 6408, this.anInt4075, this.anInt4079, 0, 6408,
            5121, var9);
    DummyClass33.texture2dMemory += var9.limit() - this.anInt4074;
    this.anInt4074 = var9.limit();
  }
}
