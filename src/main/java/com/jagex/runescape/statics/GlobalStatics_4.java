package com.jagex.runescape.statics;

import com.jagex.runescape.compression.BZipDecompressorStatics;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.image_producer.AbstractImageProducerStatics;
import com.jagex.runescape.input.KeyboardStatics;
import com.jagex.runescape.model.AnimationSequence;
import com.jagex.runescape.model.FloorOverlay;
import com.jagex.runescape.model.GameException;
import com.jagex.runescape.model.GameObject;
import com.jagex.runescape.model.GameObjectConfig;
import com.jagex.runescape.model.ObjectCache;
import com.jagex.runescape.model.SomethingFont;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.GlUtils;
import com.jagex.runescape.opengl.Light;
import com.jagex.runescape.opengl.SomethingLight;
import com.jagex.runescape.scene.SceneGraphTile;
import com.jagex.runescape.scene.SceneSomething;
import com.jagex.runescape.scene.SceneSomething2;
import com.jagex.runescape.scene.SomethingSceneI;
import com.jagex.runescape.scene.SomethingSceneJ;
import com.jagex.runescape.scene.SomethingSceneTile;
import com.jagex.runescape.scene.SomethingTilek;
import com.jagex.runescape.settings.SettingsStatics;

public class GlobalStatics_4 {

  public static int anInt3746 = -1;
  public static int anInt3747 = -1;
  public static int anInt3748;
  public static int anInt3749;
  public static int anInt3750 = 256;
  public static int anInt3751 = 256;
  public static int anInt3752 = -1;
  public static int anInt3754 = -1;
  public static int anInt3755;
  public static int anInt3756;
  public static int anInt3627;
  public static int anInt3630;
  public static int anInt3631;
  public static int anInt1691 = -1;
  public static int anInt1692;
  public static int[] anIntArray1695;
  public static int usageLocation;
  public static int updateCycle;
  public static int[][][] anIntArrayArrayArray720;
  public static int[][][] heightMap;
  public static ObjectCache floorUnderlays = new ObjectCache(64);
  public static int[] anIntArray726 = new int[32];
  public static float aFloat727;
  public static int REGION_WIDTH;
  public static SomethingFont aClass33_1238;
  public static int anInt1240;
  public static Deque aClass61_1242 = new Deque();
  public static int anInt421;
  public static int anInt433;

  static {
    int var0 = 0;

    for (int var1 = 0; var1 < 256; ++var1) {
      for (int var2 = 0; var2 <= var1; ++var2) {
        GlobalStatics_10.aByteArray1364[var0++] = (byte) (int) (255.0D / Math
            .sqrt(
                (0xffff + var2 * var2 + var1 * var1) / 65535.0F));
      }
    }

    GameStringStatics.aClass94_1374 = GameStringStatics.create("zap");
    GlobalStatics_10.aClass94_1377 = GameStringStatics.create("Abbrechen");
    GlobalStatics_10.anIntArrayArray1373 = new int[104][104];
    GameStringStatics.aClass94_1380 = GameStringStatics.create(")4p=");
  }

  public static void method1131(int var0, int var1, int var2, int var3,
      int var4, int var5, int var6,
      int var7) {
    if (var6 >= 0 && var4 >= 0 && var6 < 103 && var4 < 103) {
      int var9;
      if (var5 == 0) {
        SceneSomething2 var8 = DummyClass14.method2147(var0, var6, var4);
        if (var8 != null) {
          var9 = Integer.MAX_VALUE & (int) (var8.key >>> 32);
          if (var3 == 2) {
            var8.sceneNode0 =
                new GameObject(var9, 2, 4 + var2, var0, var6, var4, var7, false,
                    var8.sceneNode0);
            var8.sceneNode1 = new GameObject(var9, 2, 3 & 1 + var2, var0, var6,
                var4, var7, false,
                var8.sceneNode1);
          } else {
            var8.sceneNode0 =
                new GameObject(var9, var3, var2, var0, var6, var4, var7, false,
                    var8.sceneNode0);
          }
        }
      }

      if (var5 == 1) {
        SomethingSceneI var12 = GlobalStatics_4.method1068(var0, var6, var4);
        if (var12 != null) {
          var9 = (int) (var12.aLong428 >>> 32) & Integer.MAX_VALUE;
          if (var3 != 4 && var3 != 5) {
            if (var3 == 6) {
              var12.aClass140_429 =
                  new GameObject(var9, 4, var2 + 4, var0, var6, var4, var7,
                      false,
                      var12.aClass140_429);
            } else {
              if (var3 == 7) {
                var12.aClass140_429 =
                    new GameObject(var9, 4, (var2 + 2 & 3) + 4, var0, var6,
                        var4, var7, false,
                        var12.aClass140_429);
              } else if (var3 == 8) {
                var12.aClass140_429 =
                    new GameObject(var9, 4, 4 + var2, var0, var6, var4, var7,
                        false,
                        var12.aClass140_429);
                var12.aClass140_423 =
                    new GameObject(var9, 4, (2 + var2 & 3) + 4, var0, var6,
                        var4, var7, false,
                        var12.aClass140_423);
              }
            }
          } else {
            var12.aClass140_429 =
                new GameObject(var9, 4, var2, var0, var6, var4, var7, false,
                    var12.aClass140_429);
          }
        }
      }

      if (var5 == 2) {
        if (var3 == 11) {
          var3 = 10;
        }

        SceneSomething var11 = GlobalStatics_3.method1336(var0, var6, var4);
        if (var11 != null) {
          var11.sceneNode =
              new GameObject((int) (var11.aLong498 >>> 32) & Integer.MAX_VALUE,
                  var3, var2, var0,
                  var6, var4, var7, false, var11.sceneNode);
        }
      }

      if (var5 == 3) {
        SomethingSceneJ var13 = GlobalStatics_0.method784(var0, var6, var4);
        if (var13 != null) {
          var13.aClass140_320 =
              new GameObject(Integer.MAX_VALUE & (int) (var13.aLong328 >>> 32),
                  22, var2, var0,
                  var6, var4, var7, false, var13.aClass140_320);
        }
      }
    }

    if (var1 <= 104) {
      GlobalStatics_4.method1132(-79);
    }
  }

  public static void method1132(int var0) {
    GlobalStatics_10.aClass93_1683.method1523();
    if (var0 != 103) {
      GlobalStatics_4.method1132(14);
    }
  }

  public static void method1133(byte var0) {
    GameStringStatics.aClass94_833 = null;
    GameStringStatics.aClass94_822 = null;
    GameStringStatics.aClass94_827 = null;
    GameStringStatics.aClass94_829 = null;
    GameStringStatics.aClass94_832 = null;
    GameStringStatics.aClass94_825 = null;
    GlobalStatics_8.aLongArray826 = null;
    GlobalStatics_8.aClass3_Sub28_Sub16_824 = null;
  }

  public static void clear81() {
    GameStringStatics.aClass94_3712 = null;
    GameStringStatics.aClass94_3711 = null;
    GameStringStatics.aClass94_3732 = null;
    GameStringStatics.aClass94_3714 = null;
    GameStringStatics.aClass94_3729 = null;
    GameStringStatics.aClass94_3718 = null;
    GameStringStatics.aClass94_3741 = null;
    GameStringStatics.aClass94_3743 = null;
    GameStringStatics.aClass94_3739 = null;
    GameStringStatics.aClass94_3737 = null;
    GameStringStatics.LT = null;
    GameStringStatics.GT = null;
    GameStringStatics.aClass94_3725 = null;
    GameStringStatics.aClass94_3720 = null;
    GameStringStatics.aClass94_3715 = null;
    GameStringStatics.aClass94_3731 = null;
    GameStringStatics.aClass94_3716 = null;
    GameStringStatics.aClass94_3728 = null;
    GameStringStatics.aClass94_3735 = null;
    GameStringStatics.aClass94_3713 = null;
    GameStringStatics.aClass94_3738 = null;
    GameStringStatics.aClass94_3724 = null;
    GameStringStatics.aClass94_3717 = null;
    GameStringStatics.aClass94_3744 = null;
    GameStringStatics.aClass94_3742 = null;
    GameStringStatics.aClass94_3745 = null;
    GameStringStatics.aClass94Array3753 = null;
  }

  public static int method694(byte[][] var0, byte[][] var1, int[] var2,
      int[] var3,
      int[] var4, int var5, int var6) {
    int var7 = var2[var5];
    int var8 = var7 + var4[var5];
    int var9 = var2[var6];
    int var10 = var9 + var4[var6];
    int var11 = var7;
    if (var9 > var7) {
      var11 = var9;
    }

    int var12 = var8;
    if (var10 < var8) {
      var12 = var10;
    }

    int var13 = var3[var5];
    if (var3[var6] < var13) {
      var13 = var3[var6];
    }

    byte[] var14 = var1[var5];
    byte[] var15 = var0[var6];
    int var16 = var11 - var7;
    int var17 = var11 - var9;

    for (int var18 = var11; var18 < var12; ++var18) {
      int var19 = var14[var16++] + var15[var17++];
      if (var19 < var13) {
        var13 = var19;
      }
    }

    return -var13;
  }

  public static void clear93(byte var0) {
    GameStringStatics.aClass94_3626 = null;
    GameStringStatics.aClass94_3634 = null;
    if (var0 != 120) {
      GameStringStatics.aClass94_3633 = null;
    }

    GameStringStatics.aClass94_3633 = null;
    GameStringStatics.aClass94_3629 = null;
  }

  public static void method589(int var0, int var1, int var2) {
    GlobalStatics_10.aBoolean3261 = true;
    GlobalStatics_7.anInt1302 = var0;
    GlobalStatics_9.anInt819 = var1;
    GlobalStatics_10.anInt4039 = var2;
    DummyClass32.anInt515 = -1;
    GlobalStatics_9.anInt999 = -1;
  }

  public static boolean method590(byte var0, int var1, int var2) {
    if (var2 == 11) {
      var2 = 10;
    }

    if (var2 >= 5 && var2 <= 8) {
      var2 = 4;
    }

    GameObjectConfig var4 = DummyClass11.method2207(4, var1);
    return var4.method1684(115, var2);
  }

  public static int method1765(int var0, int var1) {
    if (var1 != -1732504441) {
      GlobalStatics_4.method1765(97, -97);
    }

    return var0 >>> 7;
  }

  public static void clear7(int var0) {
    GlobalStatics_4.anIntArray1695 = null;
    if (var0 != 24241) {
      GlobalStatics_4.clear7(84);
    }

    BZipDecompressorStatics.anIntArray1690 = null;
    KeyboardStatics.KEY_QUEUE = null;
    GameStringStatics.aClass94_1694 = null;
    GameStringStatics.aClass94_1696 = null;
  }

  public static void method1768(int var0, int var1, int var2) {
    if (GlobalStatics_9.anInt1908 > 0) {
      DummyClass13.method2195(GlobalStatics_9.anInt1908, 0);
      GlobalStatics_9.anInt1908 = 0;
    }

    short var3 = 256;
    int var4 = 0;
    int var5 = AbstractImageProducerStatics.anInt1092 * var2;
    int var6 = 0;

    for (int var7 = 1; var7 < var3 - 1; ++var7) {
      int var8 = (var3 - var7) * GlobalStatics_6.anIntArray3592[var7] / var3;
      if (var8 < 0) {
        var8 = 0;
      }

      var4 += var8;

      int var9;
      for (var9 = var8; var9 < 128; ++var9) {
        int var11 = AbstractImageProducerStatics.anIntArray1100[var5++
            + var0];
        int var10 = DummyClass2.anIntArray1681[var4++];
        if (var10 == 0) {
          GlobalStatics_10.aClass3_Sub28_Sub16_Sub2_1381.pixels[var6++] = var11;
        } else {
          int var12 = 18 + var10;
          if (var12 > 255) {
            var12 = 255;
          }

          int var13 = 256 - var10 - 18;
          if (var13 > 255) {
            var13 = 255;
          }

          var10 = GlobalStatics_9.anIntArray861[var10];
          GlobalStatics_10.aClass3_Sub28_Sub16_Sub2_1381.pixels[var6++] =
              (var13 * (var11 & 16711935)
                  + (16711935 & var10) * var12 & -16711936)
                  + ((var10 & (int) 0xff00) * var12
                  + ((int) 0xff00 & var11) * var13
                  & 16711680)
                  >> 8;
        }
      }

      for (var9 = 0; var9 < var8; ++var9) {
        GlobalStatics_10.aClass3_Sub28_Sub16_Sub2_1381.pixels[var6++] =
            AbstractImageProducerStatics.anIntArray1100[var0 + var5++];
      }

      var5 += AbstractImageProducerStatics.anInt1092 - 128;
    }

    if (var1 > 70) {
      if (GlRenderer.USE_OPENGL) {
        GlUtils.drawImage(
            GlobalStatics_10.aClass3_Sub28_Sub16_Sub2_1381.pixels, var0,
            var2,
            GlobalStatics_10.aClass3_Sub28_Sub16_Sub2_1381.anInt3707,
            GlobalStatics_10.aClass3_Sub28_Sub16_Sub2_1381.anInt3696);
      } else {
        GlobalStatics_10.aClass3_Sub28_Sub16_Sub2_1381
            .method635(var0, var2);
      }

    }
  }

  public static void method1769(float[][] var0, byte[][] var1, byte[][] var2,
      Light[] var3, int var4,
      int var5, float[][] var6, byte[][] var7, byte[][] var8, int[][] var9,
      int var10, float[][] var11) {
    for (int var12 = 0; var12 < var5; ++var12) {
      Light var13 = var3[var12];
      if (var13.anInt704 == var4) {
        int var15 = 0;
        SomethingLight var14 = new SomethingLight();
        int var16 = -var13.anInt698 + (var13.anInt703 >> 7);
        int var17 = -var13.anInt698 + (var13.anInt708 >> 7);
        if (var17 < 0) {
          var15 -= var17;
          var17 = 0;
        }

        int var18 = var13.anInt698 + (var13.anInt708 >> 7);
        if (var18 > 103) {
          var18 = 103;
        }

        int var19;
        int var21;
        short var20;
        int var23;
        int var22;
        int var25;
        int var35;
        boolean var32;
        for (var19 = var17; var18 >= var19; ++var19) {
          var20 = var13.aShortArray706[var15];
          var21 = var16 + (var20 >> 8);
          var22 = -1 + var21 + (255 & var20);
          if (var22 > 103) {
            var22 = 103;
          }

          if (var21 < 0) {
            var21 = 0;
          }

          for (var23 = var21; var23 <= var22; ++var23) {
            int var24 = 255 & var1[var23][var19];
            var25 = 255 & var8[var23][var19];
            boolean var26 = false;
            FloorOverlay var27;
            int[] var29;
            int[] var28;
            if (var24 == 0) {
              if (var25 == 0) {
                continue;
              }

              var27 = GlobalStatics_9.method350((byte) -103, var25 - 1);
              if (var27.anInt2103 == -1) {
                continue;
              }

              if (var7[var23][var19] != 0) {
                var28 = DummyClass21.anIntArrayArray1763[var7[var23][var19]];
                var14.anInt651 += 3 * (-2 + (var28.length >> 1));
                var14.anInt657 += var28.length >> 1;
                continue;
              }
            } else if (var25 != 0) {
              var27 = GlobalStatics_9.method350((byte) 123, var25 - 1);
              byte var42;
              if (var27.anInt2103 == -1) {
                var42 = var7[var23][var19];
                if (var42 != 0) {
                  var29 = GlobalStatics_9.anIntArrayArray499[var42];
                  var14.anInt651 += 3 * (-2 + (var29.length >> 1));
                  var14.anInt657 += var29.length >> 1;
                }
                continue;
              }

              var42 = var7[var23][var19];
              if (var42 != 0) {
                var26 = true;
              }
            }

            SceneSomething var40 = GlobalStatics_3
                .method1336(var4, var23, var19);
            if (var40 != null) {
              int var41 = (int) (var40.aLong498 >> 14) & 63;
              if (var41 == 9) {
                var29 = null;
                int var30 = 3 & (int) (var40.aLong498 >> 20);
                boolean var31;
                int var34;
                short var33;
                if ((1 & var30) == 0) {
                  var32 = var22 >= 1 + var23;
                  var31 = var23 - 1 >= var21;
                  if (!var31 && var19 + 1 <= var18) {
                    var33 = var13.aShortArray706[1 + var15];
                    var34 = var16 + (var33 >> 8);
                    var35 = var34 + (255 & var33);
                    var31 = var34 < var23 && var23 < var35;
                  }

                  if (!var32 && -1 + var19 >= var17) {
                    var33 = var13.aShortArray706[var15 - 1];
                    var34 = var16 + (var33 >> 8);
                    var35 = var34 + (var33 & 255);
                    var32 = var23 > var34 && var23 < var35;
                  }

                  if (var31 && var32) {
                    var29 = DummyClass21.anIntArrayArray1763[0];
                  } else if (var31) {
                    var29 = DummyClass21.anIntArrayArray1763[1];
                  } else if (var32) {
                    var29 = DummyClass21.anIntArrayArray1763[1];
                  }
                } else {
                  var31 = var21 <= -1 + var23;
                  var32 = var23 + 1 <= var22;
                  if (!var31 && -1 + var19 >= var17) {
                    var33 = var13.aShortArray706[-1 + var15];
                    var34 = (var33 >> 8) + var16;
                    var35 = var34 + (255 & var33);
                    var31 = var34 < var23 && var23 < var35;
                  }

                  if (!var32 && 1 + var19 <= var18) {
                    var33 = var13.aShortArray706[var15 + 1];
                    var34 = (var33 >> 8) + var16;
                    var35 = var34 + (255 & var33);
                    var32 = var34 < var23 && var35 > var23;
                  }

                  if (var31 && var32) {
                    var29 = DummyClass21.anIntArrayArray1763[0];
                  } else if (!var31) {
                    if (var32) {
                      var29 = DummyClass21.anIntArrayArray1763[1];
                    }
                  } else {
                    var29 = DummyClass21.anIntArrayArray1763[1];
                  }
                }

                if (var29 != null) {
                  var14.anInt651 += 3 * (var29.length >> 1) - 6;
                  var14.anInt657 += var29.length >> 1;
                }
                continue;
              }
            }

            if (var26) {
              var29 = GlobalStatics_9.anIntArrayArray499[var7[var23][var19]];
              var28 = DummyClass21.anIntArrayArray1763[var7[var23][var19]];
              var14.anInt651 += (-2 + (var28.length >> 1)) * 3;
              var14.anInt651 += ((var29.length >> 1) - 2) * 3;
              var14.anInt657 += var28.length >> 1;
              var14.anInt657 += var29.length >> 1;
            } else {
              var28 = DummyClass21.anIntArrayArray1763[0];
              var14.anInt651 += (-2 + (var28.length >> 1)) * 3;
              var14.anInt657 += var28.length >> 1;
            }
          }

          ++var15;
        }

        var15 = 0;
        var14.method1020();
        if (-var13.anInt698 + (var13.anInt708 >> 7) < 0) {
          var15 -= -var13.anInt698 + (var13.anInt708 >> 7);
        }

        for (var19 = var17; var19 <= var18; ++var19) {
          var20 = var13.aShortArray706[var15];
          var21 = (var20 >> 8) + var16;
          var22 = -1 + (255 & var20) + var21;
          if (var22 > 103) {
            var22 = 103;
          }

          if (var21 < 0) {
            var21 = 0;
          }

          for (var23 = var21; var23 <= var22; ++var23) {
            int var43 = 255 & var8[var23][var19];
            var25 = 255 & var1[var23][var19];
            byte var38 = var2[var23][var19];
            boolean var39 = false;
            FloorOverlay var46;
            if (var25 == 0) {
              if (var43 == 0) {
                continue;
              }

              var46 = GlobalStatics_9.method350((byte) -49, var43 - 1);
              if (var46.anInt2103 == -1) {
                continue;
              }

              if (var7[var23][var19] != 0) {
                GlobalStatics_10.method284(var0, var9, var23, var6, var19,
                    DummyClass21.anIntArrayArray1763[var7[var23][var19]],
                    var14, (byte) -88, var13,
                    var11, var2[var23][var19]);
                continue;
              }
            } else {
              if (var43 != 0) {
                var46 = GlobalStatics_9.method350((byte) 113, -1 + var43);
                if (var46.anInt2103 == -1) {
                  GlobalStatics_10.method284(var0, var9, var23, var6, var19,
                      GlobalStatics_9.anIntArrayArray499[var7[var23][var19]],
                      var14, (byte) 116,
                      var13, var11, var2[var23][var19]);
                  continue;
                }

                byte var48 = var7[var23][var19];
                if (var48 != 0) {
                  var39 = true;
                }
              }
            }

            SceneSomething var44 = GlobalStatics_3
                .method1336(var4, var23, var19);
            if (var44 != null) {
              int var49 = (int) (var44.aLong498 >> 14) & 63;
              if (var49 == 9) {
                int[] var45 = null;
                int var47 = 3 & (int) (var44.aLong498 >> 20);
                int var36;
                boolean var51;
                short var50;
                if ((1 & var47) == 0) {
                  var32 = -1 + var23 >= var21;
                  var51 = var22 >= var23 + 1;
                  if (!var32 && var18 >= var19 + 1) {
                    var50 = var13.aShortArray706[1 + var15];
                    var35 = (var50 >> 8) + var16;
                    var36 = (var50 & 255) + var35;
                    var32 = var23 > var35 && var36 > var23;
                  }

                  if (!var51 && var19 - 1 >= var17) {
                    var50 = var13.aShortArray706[-1 + var15];
                    var35 = var16 + (var50 >> 8);
                    var36 = (255 & var50) + var35;
                    var51 = var35 < var23 && var36 > var23;
                  }

                  if (var32 && var51) {
                    var45 = DummyClass21.anIntArrayArray1763[0];
                  } else if (var32) {
                    var45 = DummyClass21.anIntArrayArray1763[1];
                    var38 = 1;
                  } else if (var51) {
                    var45 = DummyClass21.anIntArrayArray1763[1];
                    var38 = 3;
                  }
                } else {
                  var32 = var23 - 1 >= var21;
                  var51 = var22 >= 1 + var23;
                  if (!var32 && var17 <= var19 - 1) {
                    var50 = var13.aShortArray706[var15 - 1];
                    var35 = var16 + (var50 >> 8);
                    var36 = (255 & var50) + var35;
                    var32 = var23 > var35 && var36 > var23;
                  }

                  if (!var51 && var18 >= var19 + 1) {
                    var50 = var13.aShortArray706[var15 + 1];
                    var35 = var16 + (var50 >> 8);
                    var36 = (255 & var50) + var35;
                    var51 = var23 > var35 && var36 > var23;
                  }

                  if (var32 && var51) {
                    var45 = DummyClass21.anIntArrayArray1763[0];
                  } else if (!var32) {
                    if (var51) {
                      var45 = DummyClass21.anIntArrayArray1763[1];
                      var38 = 2;
                    }
                  } else {
                    var38 = 0;
                    var45 = DummyClass21.anIntArrayArray1763[1];
                  }
                }

                if (var45 != null) {
                  GlobalStatics_10
                      .method284(var0, var9, var23, var6, var19, var45, var14,
                          (byte) 98, var13, var11, var38);
                }
                continue;
              }
            }

            if (var39) {
              GlobalStatics_10.method284(var0, var9, var23, var6, var19,
                  GlobalStatics_9.anIntArrayArray499[var7[var23][var19]], var14,
                  (byte) 96, var13,
                  var11, var2[var23][var19]);
              GlobalStatics_10.method284(var0, var9, var23, var6, var19,
                  DummyClass21.anIntArrayArray1763[var7[var23][var19]], var14,
                  (byte) -117, var13,
                  var11, var2[var23][var19]);
            } else {
              GlobalStatics_10.method284(var0, var9, var23, var6, var19,
                  DummyClass21.anIntArrayArray1763[0], var14, (byte) 61, var13,
                  var11, var38);
            }
          }

          ++var15;
        }

        if (var14.anInt653 > 0 && var14.anInt655 > 0) {
          var14.method1019();
          var13.aClass37_712 = var14;
        }
      }
    }

    if (var10 != -8771) {
      GlobalStatics_4.method1765(-30, -124);
    }
  }

  public static boolean method1066(int var0, int var1) {
    if (var0 >= 97 && var0 <= 122) {
      return true;
    } else {
      return var0 >= 65 && var0 <= 90 || var0 >= 48 && var0 <= 57;
    }
  }

  public static GameException cascadeException(Throwable throwable,
      String source) {
    throwable.printStackTrace();
    GameException ex;
    if (throwable instanceof GameException) {
      ex = (GameException) throwable;
      ex.source = ex.source + ' ' + source;
    } else {
      ex = new GameException(throwable, source);
    }
    return ex;
  }

  public static SomethingSceneI method1068(int var0, int var1, int var2) {
    SceneGraphTile var3 = GLStatics.sceneGraphTiles[var0][var1][var2];
    return var3 == null ? null : var3.aClass19_2233;
  }

  public static void method1069(long[] var0, int var1, int var2, int[] var3,
      int var4) {
    if (var4 != -24337) {
      GlobalStatics_4.cascadeException(null, null);
    }

    if (var1 < var2) {
      int var6 = var1;
      int var5 = (var2 + var1) / 2;
      long var7 = var0[var5];
      var0[var5] = var0[var2];
      var0[var2] = var7;
      int var9 = var3[var5];
      var3[var5] = var3[var2];
      var3[var2] = var9;

      for (int var10 = var1; var2 > var10; ++var10) {
        if (var0[var10] < var7 + (1 & var10)) {
          long var11 = var0[var10];
          var0[var10] = var0[var6];
          var0[var6] = var11;
          int var13 = var3[var10];
          var3[var10] = var3[var6];
          var3[var6++] = var13;
        }
      }

      var0[var2] = var0[var6];
      var0[var6] = var7;
      var3[var2] = var3[var6];
      var3[var6] = var9;
      GlobalStatics_4.method1069(var0, var1, -1 + var6, var3, -24337);
      GlobalStatics_4.method1069(var0, 1 + var6, var2, var3, -24337);
    }
  }

  public static void method1071(byte var0) {
    GlobalStatics_4.anIntArray726 = null;
    GlobalStatics_4.floorUnderlays = null;
    GlobalStatics_4.heightMap = null;
    if (var0 >= -82) {
      GlobalStatics_4.method1071((byte) 3);
    }

    GlobalStatics_4.anIntArrayArrayArray720 = null;
  }

  public static void method1073(int var0) {
    GLStatics.method551(0, 0);
    if (var0 != 97) {
      GlobalStatics_4.method1068(-108, 80, 18);
    }
  }

  public static void method1460(int var0, int var1, byte var2, int var3,
      int var4, int var5,
      int var6) {
    if (var5 - var4 >= DummyClass55.anInt1425
        && GlTexture2d.anInt3765 >= var5 + var4
        && DummyClass13.anInt2020 <= -var4 + var1
        && GlobalStatics_9.anInt902 >= var4 + var1) {
      GlobalStatics_9.method175(var6, var0, var1, true, var3, var4, var5);
    } else {
      GlobalStatics_8
          .method2275(var3, (byte) 109, var1, var4, var6, var0, var5);
    }

    if (var2 > -107) {
      GLStatics.anInt1244 = 89;
    }
  }

  public static void clear12(int var0) {
    if (var0 != 0) {
      GlobalStatics_4.aClass61_1242 = null;
    }

    GlobalStatics_4.aClass61_1242 = null;
    GlobalStatics_4.aClass33_1238 = null;
  }

  public static void method1469(int[] var0, int var1, int var2, int var3,
      int var4, int var5) {
    SceneGraphTile var6 = GLStatics.sceneGraphTiles[var3][var4][var5];
    if (var6 != null) {
      SomethingTilek var7 = var6.aClass126_2240;
      int var9;
      if (var7 != null) {
        int var17 = var7.anInt1673;
        if (var17 != 0) {
          for (var9 = 0; var9 < 4; ++var9) {
            var0[var1] = var17;
            var0[var1 + 1] = var17;
            var0[var1 + 2] = var17;
            var0[var1 + 3] = var17;
            var1 += var2;
          }

        }
      } else {
        SomethingSceneTile var8 = var6.aClass35_2226;
        if (var8 != null) {
          var9 = var8.anInt611;
          int var10 = var8.anInt612;
          int var11 = var8.anInt626;
          int var12 = var8.anInt621;
          int[] var13 = GlobalStatics_10.anIntArrayArray3215[var9];
          int[] var14 = DummyClass11.anIntArrayArray2039[var10];
          int var15 = 0;
          int var16;
          if (var11 == 0) {
            for (var16 = 0; var16 < 4; ++var16) {
              if (var13[var14[var15++]] != 0) {
                var0[var1] = var12;
              }

              if (var13[var14[var15++]] != 0) {
                var0[var1 + 1] = var12;
              }

              if (var13[var14[var15++]] != 0) {
                var0[var1 + 2] = var12;
              }

              if (var13[var14[var15++]] != 0) {
                var0[var1 + 3] = var12;
              }

              var1 += var2;
            }
          } else {
            for (var16 = 0; var16 < 4; ++var16) {
              var0[var1] = var13[var14[var15++]] == 0 ? var11 : var12;
              var0[var1 + 1] = var13[var14[var15++]] == 0 ? var11 : var12;
              var0[var1 + 2] = var13[var14[var15++]] == 0 ? var11 : var12;
              var0[var1 + 3] = var13[var14[var15++]] == 0 ? var11 : var12;
              var1 += var2;
            }
          }

        }
      }
    }
  }

  public static void method1470(int var0, AnimationSequence var1, int var2,
      int var3, boolean var4,
      int var5) {
    if (GlobalStatics_9.anInt1552 < GlobalStatics_6.NEAR) {
      if (var1.anIntArrayArray1867 != null
          && var5 < var1.anIntArrayArray1867.length
          && var1.anIntArrayArray1867[var5] != null) {
        int var6 = var1.anIntArrayArray1867[var5][0];
        int var7 = var6 >> 8;
        int var10;
        if (var1.anIntArrayArray1867[var5].length > 1) {
          var10 = (int) (var1.anIntArrayArray1867[var5].length * Math
              .random());
          if (var10 > 0) {
            var7 = var1.anIntArrayArray1867[var5][var10];
          }
        }

        int var8 = var6 >> 5 & 7;
        int var9 = var6 & 31;
        if (var9 == 0) {
          if (var4) {
            GlobalStatics_10.method199(var8, var7, 0, -799);
          }

        } else {
          if (SettingsStatics.anInt340 != 0) {
            GlobalStatics_9.anIntArray2550[GlobalStatics_9.anInt1552] = var7;
            GlobalStatics_9.anIntArray2068[GlobalStatics_9.anInt1552] = var8;
            int var11 = (-64 + var0) / 128;
            var10 = (var3 - 64) / 128;
            GlobalStatics_0.anIntArray2157[GlobalStatics_9.anInt1552] = 0;
            GlobalStatics_9.aClass135Array2131[GlobalStatics_9.anInt1552] = null;
            GlobalStatics_10.anIntArray3083[GlobalStatics_9.anInt1552] =
                var9 + (var10 << 16) + (var11 << 8);
            if (var2 != 183921384) {
              GlobalStatics_4.aClass33_1238 = null;
            }

            ++GlobalStatics_9.anInt1552;
          }
        }
      }
    }
  }

  public static void method906(byte var0) {
    GameStringStatics.aClass94_422 = null;
    if (var0 != 112) {
      GlobalStatics_4.method906((byte) -42);
    }

    GameStringStatics.aClass94_431 = null;
  }

}
