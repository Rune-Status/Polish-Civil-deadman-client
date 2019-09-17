package com.jagex.runescape.opengl;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.HashTable;
import com.jagex.runescape.model.IntegerNode;
import com.jagex.runescape.node.Node;
import com.jagex.runescape.model.SceneGraphTile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class SomethingGl0 extends Node {

  private static ByteBuffer aByteBuffer2361;
  private static Buffer aClass3_Sub30_2362;
  private static ByteBuffer aByteBuffer2368;
  private static Buffer aClass3_Sub30_2372;
  public int anInt2342;
  public int anInt2343;
  public int anInt2344;
  public int materialId;
  public int anInt2355;
  public boolean aBoolean2364;
  private ByteBuffer aByteBuffer2345;
  private float[] aFloatArray2346;
  private final boolean aBoolean2347;
  private int[] anIntArray2348;
  private int[] anIntArray2349;
  private int[] anIntArray2350;
  private int[] anIntArray2352;
  private HashTable aClass130_2353;
  private float[] aFloatArray2354;
  private int anInt2356;
  private int[][] anIntArrayArray2357;
  private int[] anIntArray2358;
  private int anInt2359;
  private int[][] anIntArrayArray2360;
  private GlBufferObject aClass156_2363;
  private float[] aFloatArray2365;
  private int anInt2366;
  private int[] anIntArray2367;
  private float[] aFloatArray2369;
  private boolean[] aBooleanArray2370;
  private int[] anIntArray2371;
  private final float aFloat2373;

  public SomethingGl0(int var1, float var2, boolean var3, boolean var4,
      int var5) {
    this.materialId = var1;
    this.aFloat2373 = var2;
    this.aBoolean2364 = var3;
    this.aBoolean2347 = var4;
    this.anInt2355 = var5;
  }

  public void method145() {
    this.anIntArray2371 = new int[this.anInt2342];
    this.anIntArray2358 = new int[this.anInt2342];
    this.anIntArray2352 = new int[this.anInt2342];
    if (this.aBoolean2347) {
      this.aFloatArray2346 = new float[this.anInt2342];
    }

    this.anIntArray2348 = new int[this.anInt2342];
    this.aFloatArray2369 = new float[this.anInt2342];
    this.aFloatArray2365 = new float[this.anInt2342];
    this.aFloatArray2354 = new float[this.anInt2342];
    this.anIntArray2350 = new int[this.anInt2344];
    this.anIntArray2349 = new int[this.anInt2344];
    this.anIntArray2367 = new int[this.anInt2344];
    this.anIntArrayArray2357 = new int[this.anInt2344][];
    this.aClass130_2353 = new HashTable(GLStatics.nearestPo2((byte) 123,
        this.anInt2342));
    if (this.aBoolean2364) {
      this.anIntArrayArray2360 = new int[this.anInt2344][];
      this.aBooleanArray2370 = new boolean[this.anInt2344];
    }

  }

  public int method146(int var1, int var2, int var3, float var4, float var5,
      float var6,
      int var7,
      float var8) {
    long var9 = 0L;
    if ((var1 & 127) == 0 || (var3 & 127) == 0) {
      var9 = (var1 + (var3 << 16)) + ((long) var7 << 32);
      IntegerNode var11 = (IntegerNode) this.aClass130_2353.get(var9);
      if (var11 != null) {
        if (var2 < this.anIntArray2358[var11.anInt2467]) {
          this.anIntArray2358[var11.anInt2467] = var2;
        }

        return var11.anInt2467;
      }
    }

    this.anIntArray2371[this.anInt2343] = var1;
    this.anIntArray2358[this.anInt2343] = var2;
    this.anIntArray2352[this.anInt2343] = var3;
    if (this.aBoolean2347) {
      this.aFloatArray2346[this.anInt2343] = var8;
    }

    this.aFloatArray2369[this.anInt2343] = var4;
    this.aFloatArray2365[this.anInt2343] = var5;
    this.aFloatArray2354[this.anInt2343] = var6;
    this.anIntArray2348[this.anInt2343] = var7;
    if (var9 != 0L) {
      this.aClass130_2353.put(var9, new IntegerNode(this.anInt2343));
    }

    return this.anInt2343++;
  }

  public void method148() {
    Buffer var1 = new Buffer((this.aBoolean2347
        ? 40 : 36) * this.anInt2343);

    for (int var2 = 0; var2 < this.anInt2343; ++var2) {
      if (GlRenderer.bigEndian) {
        var1.writeFloat(this.anIntArray2371[var2]);
        var1.writeFloat(this.anIntArray2358[var2]);
        var1.writeFloat(this.anIntArray2352[var2]);
        var1.writeInt(this.anIntArray2348[var2]);
        var1.writeFloat(this.aFloatArray2369[var2]);
        var1.writeFloat(this.aFloatArray2365[var2]);
        var1.writeFloat(this.aFloatArray2354[var2]);
        var1.writeFloat(this.anIntArray2371[var2] / this.aFloat2373);
        var1.writeFloat(this.anIntArray2352[var2] / this.aFloat2373);
        if (this.aBoolean2347) {
          var1.writeFloat(this.aFloatArray2346[var2]);
        }
      } else {
        var1.writeFloatLE(this.anIntArray2371[var2]);
        var1.writeFloatLE(this.anIntArray2358[var2]);
        var1.writeFloatLE(this.anIntArray2352[var2]);
        var1.writeInt(this.anIntArray2348[var2]);
        var1.writeFloatLE(this.aFloatArray2369[var2]);
        var1.writeFloatLE(this.aFloatArray2365[var2]);
        var1.writeFloatLE(this.aFloatArray2354[var2]);
        var1.writeFloatLE(this.anIntArray2371[var2] / this.aFloat2373);
        var1.writeFloatLE(this.anIntArray2352[var2] / this.aFloat2373);
        if (this.aBoolean2347) {
          var1.writeFloatLE(this.aFloatArray2346[var2]);
        }
      }
    }

    if (GlRenderer.vertexBufferSupport) {
      ByteBuffer var3 = ByteBuffer.wrap(var1.bytes, 0, var1.position);
      this.aClass156_2363 = new GlBufferObject();
      this.aClass156_2363.setVertexBufferData(var3);
    } else {
      this.aByteBuffer2345 =
          ByteBuffer.allocateDirect(var1.position)
              .order(ByteOrder.nativeOrder());
      this.aByteBuffer2345.put(var1.bytes, 0, var1.position);
      this.aByteBuffer2345.flip();
    }

    this.anIntArray2371 = null;
    this.anIntArray2358 = null;
    this.anIntArray2352 = null;
    this.anIntArray2348 = null;
    this.aFloatArray2369 = null;
    this.aFloatArray2365 = null;
    this.aFloatArray2354 = null;
    this.aClass130_2353 = null;
    this.aFloatArray2346 = null;
  }

  public void method149(SceneGraphTile[][][] var1, float var2,
      boolean var3) {
    if (SomethingGl0.aClass3_Sub30_2372 != null
        && SomethingGl0.aClass3_Sub30_2372.bytes.length >=
        this.anInt2359 * 4) {
      SomethingGl0.aClass3_Sub30_2372.position = 0;
    } else {
      SomethingGl0.aClass3_Sub30_2372 = new Buffer(this.anInt2359 * 4);
    }

    if (SomethingGl0.aClass3_Sub30_2362 != null
        && SomethingGl0.aClass3_Sub30_2362.bytes.length >=
        this.anInt2356 * 4) {
      SomethingGl0.aClass3_Sub30_2362.position = 0;
    } else {
      SomethingGl0.aClass3_Sub30_2362 = new Buffer(this.anInt2356 * 4);
    }

    int var4;
    SceneGraphTile var5;
    Buffer var6;
    int[] var7;
    int[] var8;
    int var9;
    int var12;
    if (GlRenderer.bigEndian) {
      for (var4 = 0; var4 < this.anInt2366; ++var4) {
        var5 =
            var1[this.anIntArray2367[var4]][this.anIntArray2350[var4]][this.anIntArray2349[var4]];
        if (var5 != null && var5.aBoolean2222) {
          var7 = this.anIntArrayArray2357[var4];
          if (this.aBoolean2364) {
            var8 = this.anIntArrayArray2360[var4];
            if (var8 != null) {
              for (var9 = 0; var9 < var8.length; ++var9) {
                SomethingGl0.aClass3_Sub30_2362.writeInt(var8[var9]);
              }
            }

            var6 =
                this.aBooleanArray2370[var4] ? SomethingGl0.aClass3_Sub30_2362
                    : SomethingGl0.aClass3_Sub30_2372;
          } else {
            var6 = SomethingGl0.aClass3_Sub30_2372;
          }

          for (var12 = 1; var12 < var7.length - 1; ++var12) {
            var6.writeInt(var7[0]);
            var6.writeInt(var7[var12]);
            var6.writeInt(var7[var12 + 1]);
          }
        }
      }
    } else {
      for (var4 = 0; var4 < this.anInt2366; ++var4) {
        var5 =
            var1[this.anIntArray2367[var4]][this.anIntArray2350[var4]][this.anIntArray2349[var4]];
        if (var5 != null && var5.aBoolean2222) {
          var7 = this.anIntArrayArray2357[var4];
          if (this.aBoolean2364) {
            var8 = this.anIntArrayArray2360[var4];
            if (var8 != null) {
              for (var9 = 0; var9 < var8.length; ++var9) {
                SomethingGl0.aClass3_Sub30_2362.writeIntLE(var8[var9], 79);
              }
            }

            var6 =
                this.aBooleanArray2370[var4] ? SomethingGl0.aClass3_Sub30_2362
                    : SomethingGl0.aClass3_Sub30_2372;
          } else {
            var6 = SomethingGl0.aClass3_Sub30_2372;
          }

          for (var12 = 1; var12 < var7.length - 1; ++var12) {
            var6.writeIntLE(var7[0], 84);
            var6.writeIntLE(var7[var12], 103);
            var6.writeIntLE(var7[var12 + 1], 82);
          }
        }
      }
    }

    if (SomethingGl0.aClass3_Sub30_2372.position != 0
        || SomethingGl0.aClass3_Sub30_2362.position != 0) {
      if (this.materialId != -1 && !var3) {
        GLStatics.textureCache.initializeMaterial(this.materialId, true);
      } else {
        GlRenderer.bindTexture(-1);
        GLStatics.method551(0, 0, 0);
      }

      int var11 = this.aBoolean2347 ? 40 : 36;
      if (this.aClass156_2363 != null) {
        this.aClass156_2363.bindVertexBuffer();
        GlRenderer.GL.glVertexPointer(3, 5126, var11, 0L);
        GlRenderer.GL.glColorPointer(4, 5121, var11, 12L);
        if (GLStatics.useBumpMaps) {
          GlRenderer.GL.glNormalPointer(5126, var11, 16L);
        }

        GlRenderer.GL.glTexCoordPointer(2, 5126, var11, 28L);
        if (this.aBoolean2347) {
          GlRenderer.GL.glClientActiveTexture(MaterialShader3.method2252());
          GlRenderer.GL.glTexCoordPointer(1, 5126, var11, 36L);
          GlRenderer.GL.glClientActiveTexture('\u84c0');
        }
      } else {
        if (GlRenderer.vertexBufferSupport) {
          //TODO ARB
          GlRenderer.GL.glBindBuffer(0x8892, 0);
        }

        this.aByteBuffer2345.position(0);
        GlRenderer.GL.glVertexPointer(3, 5126, var11, this.aByteBuffer2345);
        this.aByteBuffer2345.position(12);
        GlRenderer.GL.glColorPointer(4, 5121, var11, this.aByteBuffer2345);
        if (GLStatics.useBumpMaps) {
          this.aByteBuffer2345.position(16);
          GlRenderer.GL.glNormalPointer(5126, var11, this.aByteBuffer2345);
        }

        this.aByteBuffer2345.position(28);
        GlRenderer.GL.glTexCoordPointer(2, 5126, var11, this.aByteBuffer2345);
        if (this.aBoolean2347) {
          GlRenderer.GL.glClientActiveTexture(MaterialShader3.method2252());
          this.aByteBuffer2345.position(36);
          GlRenderer.GL.glTexCoordPointer(1, 5126, var11, this.aByteBuffer2345);
          GlRenderer.GL.glClientActiveTexture('\u84c0');
        }
      }

      if (GlRenderer.vertexBufferSupport) {
        //TODO ARB
        GlRenderer.GL.glBindBuffer(0x8893, 0);
      }

      if (SomethingGl0.aClass3_Sub30_2372.position != 0) {
        if (SomethingGl0.aByteBuffer2368 != null
            && SomethingGl0.aByteBuffer2368.capacity()
            >= SomethingGl0.aClass3_Sub30_2372.position) {
          SomethingGl0.aByteBuffer2368.clear();
        } else {
          SomethingGl0.aByteBuffer2368 =
              ByteBuffer
                  .allocateDirect(SomethingGl0.aClass3_Sub30_2372.position)
                  .order(ByteOrder.nativeOrder());
        }

        SomethingGl0.aByteBuffer2368
            .put(SomethingGl0.aClass3_Sub30_2372.bytes, 0,
                SomethingGl0.aClass3_Sub30_2372.position);
        SomethingGl0.aByteBuffer2368.flip();
        GlRenderer.method1832(var2);
        GlRenderer.GL
            .glDrawElements(4, SomethingGl0.aClass3_Sub30_2372.position / 4,
                5125,
                SomethingGl0.aByteBuffer2368);
      }

      if (SomethingGl0.aClass3_Sub30_2362.position != 0) {
        if (SomethingGl0.aByteBuffer2361 != null
            && SomethingGl0.aByteBuffer2361.capacity()
            >= SomethingGl0.aClass3_Sub30_2362.position) {
          SomethingGl0.aByteBuffer2361.clear();
        } else {
          SomethingGl0.aByteBuffer2361 =
              ByteBuffer
                  .allocateDirect(SomethingGl0.aClass3_Sub30_2362.position)
                  .order(ByteOrder.nativeOrder());
        }

        SomethingGl0.aByteBuffer2361
            .put(SomethingGl0.aClass3_Sub30_2362.bytes, 0,
                SomethingGl0.aClass3_Sub30_2362.position);
        SomethingGl0.aByteBuffer2361.flip();
        GlRenderer.method1832(var2 - 100.0F);
        GlRenderer.method1851();
        GlRenderer.GL
            .glDrawElements(4, SomethingGl0.aClass3_Sub30_2362.position / 4,
                5125,
                SomethingGl0.aByteBuffer2361);
        GlRenderer.method1830();
      }

    }
  }

  public int method150(int var1, int var2, int var3, int[] var4, int[] var5,
      boolean var6) {
    if (this.aBoolean2364) {
      this.anIntArrayArray2360[this.anInt2366] = var5;
      this.aBooleanArray2370[this.anInt2366] = var6;
      if (var5 != null) {
        this.anInt2356 += var5.length;
      }

      if (var6) {
        this.anInt2356 += 3 * (var4.length - 2);
      } else {
        this.anInt2359 += 3 * (var4.length - 2);
      }
    } else {
      this.anInt2359 += 3 * (var4.length - 2);
    }

    this.anIntArray2367[this.anInt2366] = var1;
    this.anIntArray2350[this.anInt2366] = var2;
    this.anIntArray2349[this.anInt2366] = var3;
    this.anIntArrayArray2357[this.anInt2366] = var4;
    return this.anInt2366++;
  }

  public static void method144() {
    SomethingGl0.aClass3_Sub30_2372 = null;
    SomethingGl0.aClass3_Sub30_2362 = null;
    SomethingGl0.aByteBuffer2368 = null;
    SomethingGl0.aByteBuffer2361 = null;
  }

  public static void method147() {
    SomethingGl0.aClass3_Sub30_2372 = null;
    SomethingGl0.aClass3_Sub30_2362 = null;
    SomethingGl0.aByteBuffer2368 = null;
    SomethingGl0.aByteBuffer2361 = null;
  }
}
