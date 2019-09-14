package com.jagex.runescape.opengl;

import com.jagex.runescape.DisplayMode;
import com.jagex.runescape.opengl.shader.MaterialShader;
import java.nio.ByteBuffer;

public final class SkyboxMaterialShader implements MaterialShader {

  private int listId = -1;
  private boolean insufficientTextureUnits;
  private int[] textureIds;

  public SkyboxMaterialShader() {
    if (GlRenderer.cubemapSupport && GlRenderer.maxTextureUnits >= 2) {
      this.initializeTextures();
      GlRenderer.GL.glBindTexture('\u8513', this.textureIds[0]);
      GlRenderer.GL.glTexParameteri('\u8513', 10241, 9729);
      GlRenderer.GL.glTexParameteri('\u8513', 10240, 9729);
      GlRenderer.GL.glTexParameteri('\u8513', '\u8072', '\u812f');
      GlRenderer.GL.glTexParameteri('\u8513', 10242, '\u812f');
      GlRenderer.GL.glTexParameteri('\u8513', 10243, '\u812f');
      GlRenderer.GL.glBindTexture('\u8513', this.textureIds[1]);
      GlRenderer.GL.glTexParameteri('\u8513', 10241, 9729);
      GlRenderer.GL.glTexParameteri('\u8513', 10240, 9729);
      GlRenderer.GL.glTexParameteri('\u8513', '\u8072', '\u812f');
      GlRenderer.GL.glTexParameteri('\u8513', 10242, '\u812f');
      GlRenderer.GL.glTexParameteri('\u8513', 10243, '\u812f');
      GlRenderer.GL.glBindTexture('\u8513', this.textureIds[2]);
      GlRenderer.GL.glTexParameteri('\u8513', 10241, 9729);
      GlRenderer.GL.glTexParameteri('\u8513', 10240, 9729);
      GlRenderer.GL.glTexParameteri('\u8513', '\u8072', '\u812f');
      GlRenderer.GL.glTexParameteri('\u8513', 10242, '\u812f');
      GlRenderer.GL.glTexParameteri('\u8513', 10243, '\u812f');
      this.insufficientTextureUnits = GlRenderer.maxTextureUnits < 3;
    }

    this.initializeCallLists();
  }

  private void initializeCallLists() {
    this.listId = GlRenderer.GL.glGenLists(2);
    GlRenderer.GL.glNewList(this.listId, 4864);
    if (this.textureIds != null) {
      GlRenderer.GL.glActiveTexture('\u84c1');
      GlRenderer.GL.glTexGeni(8192, 9472, '\u8511');
      GlRenderer.GL.glTexGeni(8193, 9472, '\u8511');
      GlRenderer.GL.glTexGeni(8194, 9472, '\u8511');
      GlRenderer.GL.glEnable(3168);
      GlRenderer.GL.glEnable(3169);
      GlRenderer.GL.glEnable(3170);
      GlRenderer.GL.glEnable('\u8513');
      GlRenderer.GL.glMatrixMode(5890);
      GlRenderer.GL.glLoadIdentity();
      GlRenderer.GL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
      GlRenderer.GL.glMatrixMode(5888);
      if (this.insufficientTextureUnits) {
        GlRenderer.GL.glTexEnvi(8960, '\u8571', 260);
        GlRenderer.GL.glTexEnvi(8960, '\u8590', 770);
        GlRenderer.GL.glTexEnvi(8960, '\u8572', 7681);
        GlRenderer.GL.glTexEnvi(8960, '\u8588', '\u8577');
      } else {
        GlRenderer.GL.glTexEnvi(8960, '\u8571', 7681);
        GlRenderer.GL.glTexEnvi(8960, '\u8580', '\u8578');
        GlRenderer.GL.glTexEnvi(8960, '\u8572', 8448);
        GlRenderer.GL.glActiveTexture('\u84c2');
        GlRenderer.GL.glTexEnvi(8960, 8704, '\u8570');
        GlRenderer.GL.glTexEnvi(8960, '\u8571', 260);
        GlRenderer.GL.glTexEnvi(8960, '\u8580', '\u8578');
        GlRenderer.GL.glTexEnvi(8960, '\u8581', '\u8578');
        GlRenderer.GL.glTexEnvi(8960, '\u8591', 770);
        GlRenderer.GL.glTexEnvi(8960, '\u8572', 7681);
        GlRenderer.GL.glTexEnvi(8960, '\u8588', '\u8577');
        GlRenderer.GL.glBindTexture(3553, GlRenderer.anInt1810);
        GlRenderer.GL.glEnable(3553);
      }

      GlRenderer.GL.glActiveTexture('\u84c0');
    } else {
      GlRenderer.GL.glTexEnvi(8960, '\u8588', '\u8577');
    }

    GlRenderer.GL.glEndList();
    GlRenderer.GL.glNewList(this.listId + 1, 4864);
    if (this.textureIds != null) {
      GlRenderer.GL.glActiveTexture('\u84c1');
      GlRenderer.GL.glDisable(3168);
      GlRenderer.GL.glDisable(3169);
      GlRenderer.GL.glDisable(3170);
      GlRenderer.GL.glDisable('\u8513');
      GlRenderer.GL.glMatrixMode(5890);
      GlRenderer.GL.glLoadIdentity();
      GlRenderer.GL.glMatrixMode(5888);
      if (this.insufficientTextureUnits) {
        GlRenderer.GL.glTexEnvi(8960, '\u8571', 8448);
        GlRenderer.GL.glTexEnvi(8960, '\u8590', 768);
        GlRenderer.GL.glTexEnvi(8960, '\u8572', 8448);
        GlRenderer.GL.glTexEnvi(8960, '\u8588', 5890);
      } else {
        GlRenderer.GL.glTexEnvi(8960, '\u8571', 8448);
        GlRenderer.GL.glTexEnvi(8960, '\u8580', 5890);
        GlRenderer.GL.glActiveTexture('\u84c2');
        GlRenderer.GL.glTexEnvi(8960, 8704, 8448);
        GlRenderer.GL.glTexEnvi(8960, '\u8571', 8448);
        GlRenderer.GL.glTexEnvi(8960, '\u8580', 5890);
        GlRenderer.GL.glTexEnvi(8960, '\u8591', 768);
        GlRenderer.GL.glTexEnvi(8960, '\u8572', 8448);
        GlRenderer.GL.glTexEnvi(8960, '\u8588', 5890);
        GlRenderer.GL.glDisable(3553);
      }

      GlRenderer.GL.glActiveTexture('\u84c0');
    } else {
      GlRenderer.GL.glTexEnvi(8960, '\u8588', 5890);
    }

    GlRenderer.GL.glEndList();
  }

  public void disable() {
    if (DisplayMode.useBumpMaps) {
      GlRenderer.GL.glCallList(this.listId + 1);
    } else {
      GlRenderer.GL.glTexEnvi(8960, '\u8588', 5890);
    }

  }

  public void enable() {
    GlRenderer.method1847(1);
    if (DisplayMode.useBumpMaps) {
      GlRenderer.GL.glCallList(this.listId);
    } else {
      GlRenderer.GL.glTexEnvi(8960, '\u8588', '\u8577');
    }

  }

  public void set(int tex) {
    if (DisplayMode.useBumpMaps && this.textureIds != null) {
      GlRenderer.GL.glActiveTexture('\u84c1');
      GlRenderer.GL.glBindTexture('\u8513', this.textureIds[tex - 1]);
      GlRenderer.GL.glActiveTexture('\u84c0');
    }

  }

  public int method24() {
    return 4;
  }

  private void initializeTextures() {
    if (this.textureIds == null) {
      this.textureIds = new int[3];
      GlRenderer.GL.glGenTextures(3, this.textureIds, 0);
    }

    short var9 = 4096;
    byte[] var10 = new byte[var9];
    byte[] var11 = new byte[var9];
    byte[] var12 = new byte[var9];

    for (int side = 0; side < 6; ++side) {
      int var14 = 0;

      for (int y = 0; y < 64; y++) {
        for (int x = 0; x < 64; x++) {
          float var5 = 2.0F * x / 64.0F - 1.0F;
          float var6 = 2.0F * y / 64.0F - 1.0F;
          float var7 = (float) (1.0D / Math
              .sqrt(var5 * var5 + 1.0F + var6 * var6));
          var5 *= var7;
          var6 *= var7;
          float var4;
          if (side == 0) {
            var4 = -var5;
          } else if (side == 1) {
            var4 = var5;
          } else if (side == 2) {
            var4 = var6;
          } else if (side == 3) {
            var4 = -var6;
          } else if (side == 4) {
            var4 = var7;
          } else {
            var4 = -var7;
          }

          int var1;
          int var2;
          int var3;
          if (var4 > 0.0F) {
            var1 = (int) (Math.pow(var4, 96.0D) * 255.0D);
            var2 = (int) (Math.pow(var4, 36.0D) * 255.0D);
            var3 = (int) (Math.pow(var4, 12.0D) * 255.0D);
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
          }

          if (GlRenderer.maxTextureUnits < 3) {
            var1 /= 5;
            var2 /= 5;
            var3 /= 5;
          } else {
            var1 /= 2;
            var2 /= 2;
            var3 /= 2;
          }

          var11[var14] = (byte) var1;
          var12[var14] = (byte) var2;
          var10[var14] = (byte) var3;
          ++var14;
        }
      }

      // GL_TEXTURE_CUBE_MAP
      GlRenderer.GL.glBindTexture('\u8513', this.textureIds[0]);
      GlRenderer.GL
          .glTexImage2D('\u8515' + side, 0, 6406, 64, 64, 0, 6406, 5121,
              ByteBuffer.wrap(var11));
      GlRenderer.GL.glBindTexture('\u8513', this.textureIds[1]);
      GlRenderer.GL
          .glTexImage2D('\u8515' + side, 0, 6406, 64, 64, 0, 6406, 5121,
              ByteBuffer.wrap(var12));
      GlRenderer.GL.glBindTexture('\u8513', this.textureIds[2]);
      GlRenderer.GL
          .glTexImage2D('\u8515' + side, 0, 6406, 64, 64, 0, 6406, 5121,
              ByteBuffer.wrap(var10));
      DummyClass33.textureMemory += var9 * 3;
    }

  }
}
