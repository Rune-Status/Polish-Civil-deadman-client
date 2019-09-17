package com.jagex.runescape.opengl;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.sprite.SoftwareIndexedColorSprite;
import com.jogamp.opengl.GL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class BlockShadowMap {

  public boolean needsUpdate = true;
  private GlBufferObject elementBufferObject;
  private ByteBuffer elementBuffer;
  private final int textureId;
  private ByteBuffer vertexBuffer;
  private GlBufferObject vertexBufferObject;
  private int anInt2112 = -1;

  public BlockShadowMap() {
    int[] var2 = new int[1];
    GlRenderer.GL.glGenTextures(1, var2, 0);
    this.textureId = var2[0];
    DummyClass33.textureMemory += 16384;
    GlRenderer.bindTexture(this.textureId);
    GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10241, 9729);
    GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10240, 9729);
    GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10242, 0x812f);
    GlRenderer.GL.glTexParameteri(GL.GL_TEXTURE_2D, 10243, 0x812f);
  }

  public void update(int[][] heights, int x, int y) {
    Buffer vertexBuffers = new Buffer(1620);

    int offsetX;
    for (int offsetY = 0; offsetY <= 8; ++offsetY) {
      for (offsetX = 0; offsetX <= 8; ++offsetX) {
        if (GlRenderer.bigEndian) {
          vertexBuffers.writeFloat(offsetX / 8.0F);
          vertexBuffers.writeFloat(offsetY / 8.0F);
          vertexBuffers.writeFloat(offsetX * 128);
          vertexBuffers.writeFloat(heights[offsetX + x][offsetY + y]);
          vertexBuffers.writeFloat(offsetY * 128);
        } else {
          vertexBuffers.writeFloatLE(offsetX / 8.0F);
          vertexBuffers.writeFloatLE(offsetY / 8.0F);
          vertexBuffers.writeFloatLE(offsetX * 128);
          vertexBuffers.writeFloatLE(heights[offsetX + x][offsetY + y]);
          vertexBuffers.writeFloatLE(offsetY * 128);
        }
      }
    }

    if (GlRenderer.vertexBufferSupport) {
      ByteBuffer buffer = ByteBuffer
          .wrap(vertexBuffers.bytes, 0, vertexBuffers.position);
      this.vertexBufferObject = new GlBufferObject();
      this.vertexBufferObject.setVertexBufferData(buffer);
    } else {
      this.vertexBuffer =
          ByteBuffer.allocateDirect(vertexBuffers.position)
              .order(ByteOrder.nativeOrder());
      this.vertexBuffer.put(vertexBuffers.bytes, 0, vertexBuffers.position);
      this.vertexBuffer.flip();
    }

    Buffer var8 = new Buffer(1536);

    for (offsetX = 0; offsetX < 8; ++offsetX) {
      for (int var7 = 0; var7 < 8; ++var7) {
        if (GlRenderer.bigEndian) {
          var8.writeInt(var7 + (offsetX + 1) * 9);
          var8.writeInt(var7 + offsetX * 9);
          var8.writeInt(var7 + 1 + offsetX * 9);
          var8.writeInt(var7 + (offsetX + 1) * 9);
          var8.writeInt(var7 + 1 + offsetX * 9);
          var8.writeInt(var7 + 1 + (offsetX + 1) * 9);
        } else {
          var8.writeIntLE(var7 + (offsetX + 1) * 9, 109);
          var8.writeIntLE(var7 + offsetX * 9, 122);
          var8.writeIntLE(var7 + 1 + offsetX * 9, 67);
          var8.writeIntLE(var7 + (offsetX + 1) * 9, 116);
          var8.writeIntLE(var7 + 1 + offsetX * 9, 90);
          var8.writeIntLE(var7 + 1 + (offsetX + 1) * 9, 93);
        }
      }
    }

    if (GlRenderer.vertexBufferSupport) {
      ByteBuffer var10 = ByteBuffer.wrap(var8.bytes, 0, var8.position);
      this.elementBufferObject = new GlBufferObject();
      this.elementBufferObject.setElementBufferData(var10);
    } else {
      this.elementBuffer = ByteBuffer.allocateDirect(var8.position)
          .order(ByteOrder.nativeOrder());
      this.elementBuffer.put(var8.bytes, 0, var8.position);
      this.elementBuffer.flip();
    }

  }

  public boolean update(SoftwareIndexedColorSprite var1, int var2,
      int var3) {
    byte[] var4 = var1.aByteArray2674;
    int var5 = var1.width;
    int var6 = var2 * 128 + 1 + (var3 * 128 + 1) * var5;
    int var7 = 0;

    int var8;
    int var9;
    for (var8 = -128; var8 < 0; ++var8) {
      var7 = (var7 << 8) - var7;

      for (var9 = -128; var9 < 0; ++var9) {
        if (var4[var6++] != 0) {
          ++var7;
        }
      }

      var6 += var5 - 128;
    }

    if (var7 == this.anInt2112) {
      return false;
    } else {
      this.anInt2112 = var7;
      var6 = var2 * 128 + 1 + (var3 * 128 + 1) * var5;
      var8 = 0;

      for (var9 = -128; var9 < 0; ++var9) {
        for (int var10 = -128; var10 < 0; ++var10) {
          if (var4[var6] == 0) {
            int var11 = 0;
            if (var4[var6 - 1] != 0) {
              ++var11;
            }

            if (var4[var6 + 1] != 0) {
              ++var11;
            }

            if (var4[var6 - var5] != 0) {
              ++var11;
            }

            if (var4[var6 + var5] != 0) {
              ++var11;
            }

            GLStatics.aByteArray2111[var8++] = (byte) (17 * var11);
          } else {
            GLStatics.aByteArray2111[var8++] = 68;
          }

          ++var6;
        }

        var6 += var5 - 128;
      }

      ByteBuffer var13 = ByteBuffer.wrap(GLStatics.aByteArray2111);
      var13.limit(16384);
      GlRenderer.bindTexture(this.textureId);
      GlRenderer.GL.glTexImage2D(GL.GL_TEXTURE_2D, 0, 6406, 128, 128, 0, 6406, GL.GL_UNSIGNED_BYTE, var13);
      return true;
    }
  }

  public void draw() {
    GlRenderer.bindTexture(this.textureId);
    if (this.vertexBufferObject != null) {
      this.vertexBufferObject.bindVertexBuffer();
      GlRenderer.GL.glInterleavedArrays(10791, 20, 0L);
      GlRenderer.aBoolean1798 = false;
    } else {
      if (GlRenderer.vertexBufferSupport) {
        //TODO ARB
        GlRenderer.GL.glBindBuffer(0x8892, 0);
      }

      GlRenderer.GL.glInterleavedArrays(10791, 20, this.vertexBuffer);
      GlRenderer.aBoolean1798 = false;
    }

    if (this.elementBufferObject != null) {
      this.elementBufferObject.bindElementBuffer();
      GlRenderer.GL.glDrawElements(4, 384, 5125, 0L);
    } else {
      if (GlRenderer.vertexBufferSupport) {
        //TODO ARB
        GlRenderer.GL.glBindBuffer(0x8893, 0);
      }

      GlRenderer.GL.glDrawElements(4, 384, 5125, this.elementBuffer);
    }
  }

}
