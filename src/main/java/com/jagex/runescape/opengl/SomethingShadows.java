package com.jagex.runescape.opengl;

import com.jagex.runescape.sprite.SoftwareIndexedColorSprite;

public final class SomethingShadows {

  public static BlockShadowMap[][] blockShadows;
  public static SoftwareIndexedColorSprite shadowsSprite;
  public static SoftwareIndexedColorSprite[] floorShadows;
  private static int sceneHeightBlocks;
  private static int sceneWidthBlocks;

  private static void method2035(byte[] var0, byte[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7) {
    int var8 = -(var4 >> 2);
    var4 = -(var4 & 3);

    for (int var9 = -var5; var9 < 0; ++var9) {
      int var10;
      int var10001;
      for (var10 = var8; var10 < 0; ++var10) {
        var10001 = var3++;
        var0[var10001] -= var1[var2++];
        var10001 = var3++;
        var0[var10001] -= var1[var2++];
        var10001 = var3++;
        var0[var10001] -= var1[var2++];
        var10001 = var3++;
        var0[var10001] -= var1[var2++];
      }

      for (var10 = var4; var10 < 0; ++var10) {
        var10001 = var3++;
        var0[var10001] -= var1[var2++];
      }

      var3 += var6;
      var2 += var7;
    }

  }

  public static void drawShadows(int var0, int var1, int var2,
      boolean[][] var4) {
    GlRenderer.method1856(1);
    GlRenderer.method1847(1);
    GlRenderer.loadIdentityTextureMatrix();
    GlRenderer.setLightingEnabled(false);
    GLStatics.method551(0, 0);
    GlRenderer.GL.glDepthMask(false);

    for (int blockX = 0; blockX < SomethingShadows.sceneWidthBlocks; ++blockX) {
      int blockY = 0;
      while (blockY < SomethingShadows.sceneHeightBlocks) {
        int var9 = blockX * 8;
        while (true) {
          if (var9 < blockX * 8 + 8) {
            label42:
            {
              if (var9 - var0 >= -var2 && var9 - var0 <= var2) {
                for (int var10 = blockY * 8; var10 < blockY * 8 + 8; ++var10) {
                  if (var10 - var1 >= -var2 && var10 - var1 <= var2 && var4[
                      var9 - var0 + var2][
                      var10 - var1 + var2]) {
                    BlockShadowMap shadows = SomethingShadows.blockShadows[blockX][blockY];
                    if (shadows.needsUpdate) {
                      shadows
                          .update(SomethingShadows.shadowsSprite, blockX,
                              blockY);
                      shadows.needsUpdate = false;
                    }
                    GlRenderer.GL.glPushMatrix();
                    GlRenderer.GL
                        .glTranslatef(blockX * 1024, 0.0F, blockY * 1024);
                    shadows.draw();
                    GlRenderer.GL.glPopMatrix();
                    break label42;
                  }
                }
              }

              ++var9;
              continue;
            }
          }

          ++blockY;
          break;
        }
      }
    }

    GlRenderer.GL.glEnableClientState(0x8076);
    GlRenderer.GL.glDepthMask(true);
    GlRenderer.method1846();
  }

  public static void initializeShadows(int var0, int var1) {
    SomethingShadows.sceneWidthBlocks = var0 + 7 >> 3;
    SomethingShadows.sceneHeightBlocks = var1 + 7 >> 3;
    SomethingShadows.shadowsSprite =
        new SoftwareIndexedColorSprite(
            SomethingShadows.sceneWidthBlocks * 128 + 2,
            SomethingShadows.sceneHeightBlocks * 128 + 2, 0);
    SomethingShadows.blockShadows = new BlockShadowMap[SomethingShadows.sceneWidthBlocks][SomethingShadows.sceneHeightBlocks];

    for (int var2 = 0; var2 < SomethingShadows.sceneWidthBlocks; ++var2) {
      for (int var3 = 0; var3 < SomethingShadows.sceneHeightBlocks; ++var3) {
        SomethingShadows.blockShadows[var2][var3] = new BlockShadowMap();
      }
    }

  }

  private static void method2042(SoftwareIndexedColorSprite var0,
      SoftwareIndexedColorSprite var1, int var2, int var3) {
    var2 += var0.offsetX;
    var3 += var0.offsetY;
    int var4 = var2 + var3 * var1.width;
    int var5 = 0;
    int var6 = var0.height;
    int var7 = var0.width;
    int var8 = var1.width - var7;
    int var9 = 0;
    int var10;
    if (var3 <= 0) {
      var10 = 1 - var3;
      var6 -= var10;
      var5 += var10 * var7;
      var4 += var10 * var1.width;
      var3 = 1;
    }

    if (var3 + var6 >= var1.height) {
      var10 = var3 + var6 + 1 - var1.height;
      var6 -= var10;
    }

    if (var2 <= 0) {
      var10 = 1 - var2;
      var7 -= var10;
      var5 += var10;
      var4 += var10;
      var9 += var10;
      var8 += var10;
      var2 = 1;
    }

    if (var2 + var7 >= var1.width) {
      var10 = var2 + var7 + 1 - var1.width;
      var7 -= var10;
      var9 += var10;
      var8 += var10;
    }

    if (var7 > 0 && var6 > 0) {
      SomethingShadows
          .method2035(var1.aByteArray2674, var0.aByteArray2674, var5, var4,
              var7, var6, var8, var9);
      SomethingShadows.method2036(var2, var3, var7, var6);
    }
  }

  public static void method2043() {
    SomethingShadows.shadowsSprite = null;
    SomethingShadows.floorShadows = null;
    SomethingShadows.blockShadows = null;
  }

  public static void method2045() {
    SomethingShadows.shadowsSprite = null;
    SomethingShadows.floorShadows = null;
    SomethingShadows.blockShadows = null;
  }

  public static void method2047(SoftwareIndexedColorSprite var0, int var1,
      int var2, int var3) {
    if (var0 != null) {
      int var4 = var1 - (var2 * GlEnvironment.anInt1314 >> 8) >> 3;
      int var5 = var3 - (var2 * GlEnvironment.anInt1315 >> 8) >> 3;
      SomethingShadows
          .method2042(var0, SomethingShadows.shadowsSprite, var4 + 1, var5 + 1);
    }
  }

  public static boolean method2049(SoftwareIndexedColorSprite var0, int var1,
      int var2, int var3) {
    if (var0 == null) {
      return false;
    } else {
      int var4 = var1 - (var2 * GlEnvironment.anInt1314 >> 8) >> 3;
      int var5 = var3 - (var2 * GlEnvironment.anInt1315 >> 8) >> 3;
      return SomethingShadows
          .method2040(var0, SomethingShadows.shadowsSprite, var4 + 1, var5 + 1);
    }
  }

  public static void method2051(SoftwareIndexedColorSprite var0, int var1,
      int var2, int var3) {
    if (var0 != null) {
      int var4 = var1 - (var2 * GlEnvironment.anInt1314 >> 8) >> 3;
      int var5 = var3 - (var2 * GlEnvironment.anInt1315 >> 8) >> 3;
      SomethingShadows
          .method2034(var0, SomethingShadows.shadowsSprite, var4 + 1, var5 + 1);
    }
  }

  public static void method2036(int var0, int var1, int var2, int var3) {
    int var4 = var0 - 1 >> 7;
    int var5 = var0 - 1 + var2 - 1 >> 7;
    int var6 = var1 - 1 >> 7;
    int var7 = var1 - 1 + var3 - 1 >> 7;

    for (int var8 = var4; var8 <= var5; ++var8) {
      for (int var9 = var6; var9 <= var7; ++var9) {
        SomethingShadows.blockShadows[var8][var9].needsUpdate = true;
      }
    }

  }

  public static void method2034(SoftwareIndexedColorSprite var0,
      SoftwareIndexedColorSprite var1, int var2, int var3) {
    var2 += var0.offsetX;
    var3 += var0.offsetY;
    int var4 = var2 + var3 * var1.width;
    int var5 = 0;
    int var6 = var0.height;
    int var7 = var0.width;
    int var8 = var1.width - var7;
    int var9 = 0;
    int var10;
    if (var3 <= 0) {
      var10 = 1 - var3;
      var6 -= var10;
      var5 += var10 * var7;
      var4 += var10 * var1.width;
      var3 = 1;
    }

    if (var3 + var6 >= var1.height) {
      var10 = var3 + var6 + 1 - var1.height;
      var6 -= var10;
    }

    if (var2 <= 0) {
      var10 = 1 - var2;
      var7 -= var10;
      var5 += var10;
      var4 += var10;
      var9 += var10;
      var8 += var10;
      var2 = 1;
    }

    if (var2 + var7 >= var1.width) {
      var10 = var2 + var7 + 1 - var1.width;
      var7 -= var10;
      var9 += var10;
      var8 += var10;
    }

    if (var7 > 0 && var6 > 0) {
      SomethingShadows
          .method2044(var1.aByteArray2674, var0.aByteArray2674, var5, var4,
              var7, var6, var8, var9);
      SomethingShadows.method2036(var2, var3, var7, var6);
    }
  }

  private static void method2044(byte[] var0, byte[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7) {
    int var8 = -(var4 >> 2);
    var4 = -(var4 & 3);

    for (int var9 = -var5; var9 < 0; ++var9) {
      int var10;
      int var10001;
      for (var10 = var8; var10 < 0; ++var10) {
        var10001 = var3++;
        var0[var10001] += var1[var2++];
        var10001 = var3++;
        var0[var10001] += var1[var2++];
        var10001 = var3++;
        var0[var10001] += var1[var2++];
        var10001 = var3++;
        var0[var10001] += var1[var2++];
      }

      for (var10 = var4; var10 < 0; ++var10) {
        var10001 = var3++;
        var0[var10001] += var1[var2++];
      }

      var3 += var6;
      var2 += var7;
    }

  }

  public static boolean method2039(byte[] var0, int var1, int var2, int var3,
      int var4,
      int var5) {
    int var6 = var2 % var5;
    int var7;
    if (var6 == 0) {
      var7 = 0;
    } else {
      var7 = var5 - var6;
    }

    int var8 = -((var3 + var5 - 1) / var5);
    int var9 = -((var2 + var5 - 1) / var5);

    for (int var10 = var8; var10 < 0; ++var10) {
      for (int var11 = var9; var11 < 0; ++var11) {
        if (var0[var1] == 0) {
          return true;
        }

        var1 += var5;
      }

      var1 -= var7;
      if (var0[var1 - 1] == 0) {
        return true;
      }

      var1 += var4;
    }

    return false;
  }

  public static boolean method2040(SoftwareIndexedColorSprite var0,
      SoftwareIndexedColorSprite var1, int var2, int var3) {
    var2 += var0.offsetX;
    var3 += var0.offsetY;
    int var4 = var2 + var3 * var1.width;
    int var5 = var0.height;
    int var6 = var0.width;
    int var7 = var1.width - var6;
    int var8;
    if (var3 <= 0) {
      var8 = 1 - var3;
      var5 -= var8;
      var4 += var8 * var1.width;
      var3 = 1;
    }

    if (var3 + var5 >= var1.height) {
      var8 = var3 + var5 + 1 - var1.height;
      var5 -= var8;
    }

    if (var2 <= 0) {
      var8 = 1 - var2;
      var6 -= var8;
      var4 += var8;
      var7 += var8;
      var2 = 1;
    }

    if (var2 + var6 >= var1.width) {
      var8 = var2 + var6 + 1 - var1.width;
      var6 -= var8;
      var7 += var8;
    }

    if (var6 > 0 && var5 > 0) {
      byte var9 = 8;
      var7 += (var9 - 1) * var1.width;
      SomethingShadows.method2036(var2, var3, var6, var5);
      return SomethingShadows
          .method2039(var1.aByteArray2674, var4, var6, var5, var7, var9);
    } else {
      return false;
    }
  }
}
