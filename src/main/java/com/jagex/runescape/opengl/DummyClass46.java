package com.jagex.runescape.opengl;

import com.jagex.runescape.statics.GlobalStatics_9;
import com.jagex.runescape.model.SceneGraphTile;

public final class DummyClass46 {

  private static float[] aFloatArray1022 = {0.0F, 0.0F, 0.0F, 1.0F};
  private static int[] anIntArray1023;
  private static int anInt1024;
  private static int anInt1025;
  private static boolean[] lightsActive;
  private static int[][][] anIntArrayArrayArray1027;
  private static int[] anIntArray1028;
  private static int anInt1029;
  private static int amountPlanes;
  private static int anInt1031;
  private static boolean[] aBooleanArray1033;
  private static int anInt1034;
  private static int sceneHeight;
  private static int sceneWidth;
  public static Light[] lights;
  public static int anInt1032;

  public static void method1263(int var0, int var1, int var2, int var3,
      int var4, int var5,
      int var6) {
    if (GLStatics.useBumpMaps) {
      if (var0 == 1 && var5 > 0) {
        DummyClass46.method1268(var1, var2, var3, var4, var5 - 1, var6);
      } else if (var0 == 4 && var5 < DummyClass46.sceneWidth - 1) {
        DummyClass46.method1268(var1, var2, var3, var4, var5 + 1, var6);
      } else if (var0 == 8 && var6 > 0) {
        DummyClass46.method1268(var1, var2, var3, var4, var5, var6 - 1);
      } else if (var0 == 2 && var6 < DummyClass46.sceneHeight - 1) {
        DummyClass46.method1268(var1, var2, var3, var4, var5, var6 + 1);
      } else if (var0 == 16 && var5 > 0
          && var6 < DummyClass46.sceneHeight - 1) {
        DummyClass46.method1268(var1, var2, var3, var4, var5 - 1, var6 + 1);
      } else if (var0 == 32 && var5 < DummyClass46.sceneWidth - 1 && var6 <
          DummyClass46.sceneHeight - 1) {
        DummyClass46.method1268(var1, var2, var3, var4, var5 + 1, var6 + 1);
      } else if (var0 == 128 && var5 > 0 && var6 > 0) {
        DummyClass46.method1268(var1, var2, var3, var4, var5 - 1, var6 - 1);
      } else if (var0 == 64 && var5 < DummyClass46.sceneWidth - 1 && var6 > 0) {
        DummyClass46.method1268(var1, var2, var3, var4, var5 + 1, var6 - 1);
      }
    }
  }

  public static void method1264(Light var0) {
    if (DummyClass46.anInt1032 >= 255) {
      System.out.println("Number of lights added exceeds maximum!");
    } else {
      DummyClass46.lights[DummyClass46.anInt1032++] = var0;
    }
  }

  public static void disableLights() {
    for (int var0 = 0; var0 < 4; ++var0) {
      DummyClass46.anIntArray1028[var0] = -1;
      DummyClass46.disableLight(var0);
    }

  }

  public static void method1266(int var0, int var1, int var2, int var3,
      int var4, int var5, int var6,
      int var7) {
    if (GLStatics.useBumpMaps) {
      if (DummyClass46.anInt1029 != var3 || DummyClass46.anInt1031 != var4
          || DummyClass46.anInt1024 != var5 ||
          DummyClass46.anInt1034 != var6
          || DummyClass46.anInt1025 != var7) {
        int var8;
        for (var8 = 0; var8 < 4; ++var8) {
          DummyClass46.aBooleanArray1033[var8] = false;
        }

        var8 = 0;
        int var9 = 0;

        int var10;
        int var11;
        label105:
        for (var10 = var4; var10 <= var6; ++var10) {
          for (var11 = var5; var11 <= var7; ++var11) {
            int var12 = DummyClass46.anIntArrayArrayArray1027[var3][var10][var11];

            label101:
            while (var12 != 0) {
              int var13 = (var12 & 255) - 1;
              var12 >>>= 8;

              int var14;
              for (var14 = 0; var14 < var9; ++var14) {
                if (var13 == DummyClass46.anIntArray1023[var14]) {
                  continue label101;
                }
              }

              for (var14 = 0; var14 < 4; ++var14) {
                if (var13 == DummyClass46.anIntArray1028[var14]) {
                  if (!DummyClass46.aBooleanArray1033[var14]) {
                    DummyClass46.aBooleanArray1033[var14] = true;
                    ++var8;
                    if (var8 == 4) {
                      break label105;
                    }
                  }
                  continue label101;
                }
              }

              DummyClass46.anIntArray1023[var9++] = var13;
              ++var8;
              if (var8 == 4) {
                break label105;
              }
            }
          }
        }

        var10 = 0;

        while (var10 < var9) {
          var11 = 0;

          while (true) {
            if (var11 < 4) {
              if (DummyClass46.aBooleanArray1033[var11]) {
                ++var11;
                continue;
              }

              DummyClass46.anIntArray1028[var11] = DummyClass46.anIntArray1023[var10];
              DummyClass46.aBooleanArray1033[var11] = true;
              DummyClass46.method1278(var11,
                  DummyClass46.lights[DummyClass46.anIntArray1023[var10]], var0,
                  var1, var2);
            }

            ++var10;
            break;
          }
        }

        for (var10 = 0; var10 < 4; ++var10) {
          if (!DummyClass46.aBooleanArray1033[var10]) {
            DummyClass46.anIntArray1028[var10] = -1;
            DummyClass46.disableLight(var10);
          }
        }

        DummyClass46.anInt1029 = var3;
        DummyClass46.anInt1031 = var4;
        DummyClass46.anInt1024 = var5;
        DummyClass46.anInt1034 = var6;
        DummyClass46.anInt1025 = var7;
      }
    }
  }

  public static void setSceneDimensions(int var0, int var1, int var2) {
    DummyClass46.amountPlanes = var0;
    DummyClass46.sceneWidth = var1;
    DummyClass46.sceneHeight = var2;
    DummyClass46.anIntArrayArrayArray1027 = new int[DummyClass46.amountPlanes][DummyClass46.sceneWidth][DummyClass46.sceneHeight];
  }

  public static void method1268(int var0, int var1, int var2, int var3,
      int var4, int var5) {
    if (GLStatics.useBumpMaps) {
      if (DummyClass46.anInt1029 != var3 || DummyClass46.anInt1031 != var4
          || DummyClass46.anInt1024 != var5 ||
          DummyClass46.anInt1034 != var4
          || DummyClass46.anInt1025 != var5) {
        int var6;
        for (var6 = 0; var6 < 4; ++var6) {
          DummyClass46.aBooleanArray1033[var6] = false;
        }

        var6 = 0;
        int var7 = DummyClass46.anIntArrayArrayArray1027[var3][var4][var5];

        int var8;
        int var9;
        label71:
        while (var7 != 0) {
          var8 = (var7 & 255) - 1;
          var7 >>>= 8;

          for (var9 = 0; var9 < 4; ++var9) {
            if (var8 == DummyClass46.anIntArray1028[var9]) {
              DummyClass46.aBooleanArray1033[var9] = true;
              continue label71;
            }
          }

          DummyClass46.anIntArray1023[var6++] = var8;
        }

        var8 = 0;

        while (var8 < var6) {
          var9 = 0;

          while (true) {
            if (var9 < 4) {
              if (DummyClass46.aBooleanArray1033[var9]) {
                ++var9;
                continue;
              }

              DummyClass46.anIntArray1028[var9] = DummyClass46.anIntArray1023[var8];
              DummyClass46.aBooleanArray1033[var9] = true;
              DummyClass46.method1278(var9,
                  DummyClass46.lights[DummyClass46.anIntArray1023[var8]], var0,
                  var1, var2);
            }

            ++var8;
            break;
          }
        }

        for (var8 = 0; var8 < 4; ++var8) {
          if (!DummyClass46.aBooleanArray1033[var8]) {
            DummyClass46.anIntArray1028[var8] = -1;
            DummyClass46.disableLight(var8);
          }
        }

        DummyClass46.anInt1029 = var3;
        DummyClass46.anInt1031 = var4;
        DummyClass46.anInt1024 = var5;
        DummyClass46.anInt1034 = var4;
        DummyClass46.anInt1025 = var5;
      }
    }
  }

  public static void method1269(int var0, boolean var1) {
    for (int var2 = 0; var2 < DummyClass46.anInt1032; ++var2) {
      DummyClass46.lights[var2].method1063(var1, var0, -3696);
    }

    DummyClass46.anInt1029 = -1;
    DummyClass46.anInt1031 = -1;
    DummyClass46.anInt1024 = -1;
    DummyClass46.anInt1034 = -1;
    DummyClass46.anInt1025 = -1;
  }

  public static void method1270() {
    for (int var0 = 0; var0 < DummyClass46.anInt1032; ++var0) {
      Light var1 = DummyClass46.lights[var0];
      int var2 = var1.anInt704;
      if (var1.aBoolean690) {
        var2 = 0;
      }

      int var3 = var1.anInt704;
      if (var1.aBoolean711) {
        var3 = 3;
      }

      for (int var4 = var2; var4 <= var3; ++var4) {
        int var5 = 0;
        int var6 = (var1.anInt708 >> 7) - var1.anInt698;
        if (var6 < 0) {
          var5 -= var6;
          var6 = 0;
        }

        int var7 = (var1.anInt708 >> 7) + var1.anInt698;
        if (var7 > DummyClass46.sceneHeight - 1) {
          var7 = DummyClass46.sceneHeight - 1;
        }

        for (int var8 = var6; var8 <= var7; ++var8) {
          short var9 = var1.aShortArray706[var5++];
          int var10 = (var1.anInt703 >> 7) - var1.anInt698 + (var9 >> 8);
          int var11 = var10 + (var9 & 255) - 1;
          if (var10 < 0) {
            var10 = 0;
          }

          if (var11 > DummyClass46.sceneWidth - 1) {
            var11 = DummyClass46.sceneWidth - 1;
          }

          for (int var12 = var10; var12 <= var11; ++var12) {
            int var13 = DummyClass46.anIntArrayArrayArray1027[var4][var12][var8];
            if ((var13 & 255) == 0) {
              DummyClass46.anIntArrayArrayArray1027[var4][var12][var8] =
                  var13 | var0 + 1;
            } else if ((var13 & 0xff00) == 0) {
              DummyClass46.anIntArrayArrayArray1027[var4][var12][var8] =
                  var13 | var0 + 1 << 8;
            } else if ((var13 & 16711680) == 0) {
              DummyClass46.anIntArrayArrayArray1027[var4][var12][var8] =
                  var13 | var0 + 1 << 16;
            } else if ((var13 & -16777216) == 0) {
              DummyClass46.anIntArrayArrayArray1027[var4][var12][var8] =
                  var13 | var0 + 1 << 24;
            }
          }
        }
      }
    }

  }

  private static void disableLight(int id) {
    if (DummyClass46.lightsActive[id]) {
      DummyClass46.lightsActive[id] = false;
      int var1 = id + 16384 + 4;
      GlRenderer.GL.glDisable(var1);
    }
  }

  public static void method1272(int var0, int var1, int var2, int var3,
      int var4) {
    if (GLStatics.useBumpMaps) {
      label44:
      for (int var5 = 0; var5 < 4; ++var5) {
        if (DummyClass46.anIntArray1028[var5] != -1) {
          int var6 = DummyClass46.anIntArrayArrayArray1027[var0][var1][var2];

          int var7;
          while (var6 != 0) {
            var7 = (var6 & 255) - 1;
            var6 >>>= 8;
            if (var7 == DummyClass46.anIntArray1028[var5]) {
              continue label44;
            }
          }

          var6 = DummyClass46.anIntArrayArrayArray1027[var0][var3][var4];

          while (var6 != 0) {
            var7 = (var6 & 255) - 1;
            var6 >>>= 8;
            if (var7 == DummyClass46.anIntArray1028[var5]) {
              continue label44;
            }
          }
        }

        DummyClass46.anIntArray1028[var5] = -1;
        DummyClass46.disableLight(var5);
      }

    }
  }

  public static void method1273() {
    DummyClass46.lights = null;
    DummyClass46.anIntArray1028 = null;
    DummyClass46.lightsActive = null;
    DummyClass46.anIntArray1023 = null;
    DummyClass46.aBooleanArray1033 = null;
    DummyClass46.anIntArrayArrayArray1027 = null;
  }

  public static void method1274() {
    DummyClass46.lights = null;
    DummyClass46.anIntArrayArrayArray1027 = null;
    DummyClass46.anIntArray1028 = null;
    DummyClass46.lightsActive = null;
    DummyClass46.aFloatArray1022 = null;
    DummyClass46.anIntArray1023 = null;
    DummyClass46.aBooleanArray1033 = null;
  }

  public static void method1275() {

    int var1;
    for (var1 = 0; var1 < 4; ++var1) {
      int var2 = 16388 + var1;
      GlRenderer.GL
          .glLightfv(var2, 4608, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
      GlRenderer.GL.glLightf(var2, 4616, 0.0F);
      GlRenderer.GL.glLightf(var2, 4615, 0.0F);
    }

    for (var1 = 0; var1 < 4; ++var1) {
      DummyClass46.anIntArray1028[var1] = -1;
      DummyClass46.disableLight(var1);
    }

  }

  public static void setupSceneGl() {
    DummyClass46.lights = new Light[255];
    DummyClass46.anIntArray1028 = new int[4];
    DummyClass46.lightsActive = new boolean[4];
    DummyClass46.anIntArray1023 = new int[4];
    DummyClass46.aBooleanArray1033 = new boolean[4];
    DummyClass46.anIntArrayArrayArray1027 = new int[DummyClass46.amountPlanes][DummyClass46.sceneWidth][DummyClass46.sceneHeight];
  }

  public static void method1277(SceneGraphTile[][][] var2) {
    if (GLStatics.useBumpMaps) {
      GLStatics.method551(0, 0);
      GlRenderer.method1856(0);
      GlRenderer.loadIdentityTextureMatrix();
      GlRenderer.bindTexture(GlRenderer.anInt1810);
      GlRenderer.GL.glDepthMask(false);
      GlRenderer.setLightingEnabled(false);
      GlRenderer.GL.glBlendFunc(774, 1);
      // GL_FOG_COLOR
      GlRenderer.GL.glFogfv(2918, new float[]{0.0F, 0.0F, 0.0F, 0.0F}, 0);
      GlRenderer.GL.glTexEnvi(8960, 0x8580, 0x8576);
      GlRenderer.GL.glTexEnvi(8960, 0x8590, 770);

      label69:
      for (int var4 = 0; var4 < DummyClass46.anInt1032; ++var4) {
        Light var5 = DummyClass46.lights[var4];
        int var6 = var5.anInt704;
        if (var5.aBoolean696) {
          --var6;
        }

        if (var5.aClass37_712 != null) {
          int var7 = 0;
          int var8 = (var5.anInt708 >> 7) - var5.anInt698;
          int var9 = (var5.anInt708 >> 7) + var5.anInt698;
          if (var9 >= GlobalStatics_9.viewportUpperZ) {
            var9 = GlobalStatics_9.viewportUpperZ - 1;
          }

          if (var8 < GLStatics.viewportLowerZ) {
            var7 += GLStatics.viewportLowerZ - var8;
            var8 = GLStatics.viewportLowerZ;
          }

          int var10 = var8;

          while (var10 <= var9) {
            short var11 = var5.aShortArray706[var7++];
            int var12 = (var5.anInt703 >> 7) - var5.anInt698 + (var11 >> 8);
            int var13 = var12 + (var11 & 255) - 1;
            if (var12 < GLStatics.viewportLowerX) {
              var12 = GLStatics.viewportLowerX;
            }

            if (var13 >= GLStatics.viewportUpperX) {
              var13 = GLStatics.viewportUpperX - 1;
            }

            int var14 = var12;

            while (true) {
              if (var14 <= var13) {
                SceneGraphTile var15 = null;
                if (var6 >= 0) {
                  var15 = var2[var6][var14][var10];
                }

                if (var6 >= 0 && (var15 == null || !var15.aBoolean2222)) {
                  ++var14;
                  continue;
                }

                GlRenderer.method1832(201.5F - var5.anInt704 * 50.0F - 1.5F);
                GlRenderer.GL
                    .glTexEnvfv(8960, 8705,
                        new float[]{0.0F, 0.0F, 0.0F, var5.aFloat707}, 0);
                var5.aClass37_712.draw();
                continue label69;
              }

              ++var10;
              break;
            }
          }
        }
      }

      GlRenderer.GL.glTexEnvi(8960, 0x8580, 5890);
      GlRenderer.GL.glTexEnvi(8960, 0x8590, 768);
      GlRenderer.GL.glBlendFunc(770, 771);
      GlRenderer.GL.glDepthMask(true);
      GlRenderer.GL.glFogfv(2918, GlEnvironment.fogColorRgb, 0);
      GlRenderer.GL.glEnableClientState(0x8078);
      GlRenderer.method1846();
    }
  }

  private static void method1278(int var0, Light var1, int var2, int var3,
      int var4) {
    int var5 = var0 + 16384 + 4;
    if (!DummyClass46.lightsActive[var0]) {
      GlRenderer.GL.glEnable(var5);
      DummyClass46.lightsActive[var0] = true;
    }

    GlRenderer.GL.glLightf(var5, 4617, var1.aFloat710);
    GlRenderer.GL.glLightfv(var5, 4609, var1.colors, 0);
    DummyClass46.aFloatArray1022[0] = var1.anInt703 - var2;
    DummyClass46.aFloatArray1022[1] = var1.anInt697 - var3;
    DummyClass46.aFloatArray1022[2] = var1.anInt708 - var4;
    GlRenderer.GL.glLightfv(var5, 4611, DummyClass46.aFloatArray1022, 0);
  }

  public static void method1279() {
    DummyClass46.anInt1032 = 0;

    for (int var0 = 0; var0 < DummyClass46.amountPlanes; ++var0) {
      for (int var1 = 0; var1 < DummyClass46.sceneWidth; ++var1) {
        for (int var2 = 0; var2 < DummyClass46.sceneHeight; ++var2) {
          DummyClass46.anIntArrayArrayArray1027[var0][var1][var2] = 0;
        }
      }
    }

  }

}
