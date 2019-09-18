package com.jagex.runescape.opengl;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.AbstractDirectColorSprite;
import com.jagex.runescape.model.ClientScriptCall;
import com.jagex.runescape.model.FileUnpacker;
import com.jagex.runescape.model.GameObjectConfig;
import com.jagex.runescape.model.GameWorld;
import com.jagex.runescape.model.GroundItemNode;
import com.jagex.runescape.model.ITextureCache;
import com.jagex.runescape.model.ItemConfig;
import com.jagex.runescape.model.NPC;
import com.jagex.runescape.model.Parameter;
import com.jagex.runescape.model.Player;
import com.jagex.runescape.model.Widget;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.scene.SceneGraphTile;
import com.jagex.runescape.model.SoftwareDirectColorSprite;
import com.jagex.runescape.scene.SomethingSceneTile;
import com.jagex.runescape.scene.SomethingTilek;
import com.jagex.runescape.statics.DummyClass11;
import com.jagex.runescape.statics.DummyClass13;
import com.jagex.runescape.statics.DummyClass15;
import com.jagex.runescape.statics.DummyClass17;
import com.jagex.runescape.statics.DummyClass24;
import com.jagex.runescape.statics.DummyClass28;
import com.jagex.runescape.statics.DummyClass3;
import com.jagex.runescape.statics.DummyClass30;
import com.jagex.runescape.statics.DummyClass35;
import com.jagex.runescape.statics.DummyClass36;
import com.jagex.runescape.statics.DummyClass37;
import com.jagex.runescape.statics.DummyClass42;
import com.jagex.runescape.statics.DummyClass45;
import com.jagex.runescape.statics.DummyClass5;
import com.jagex.runescape.statics.DummyClass54;
import com.jagex.runescape.statics.DummyClass55;
import com.jagex.runescape.statics.DummyClass59;
import com.jagex.runescape.statics.DummyClass6;
import com.jagex.runescape.statics.DummyClass7;
import com.jagex.runescape.statics.DummyClass8;
import com.jagex.runescape.statics.DummyClass9;
import com.jagex.runescape.statics.GlobalStatics_0;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_11;
import com.jagex.runescape.statics.GlobalStatics_2;
import com.jagex.runescape.statics.GlobalStatics_4;
import com.jagex.runescape.statics.GlobalStatics_5;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jagex.runescape.statics.GlobalStatics_7;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;
import java.nio.ByteBuffer;

public class GLStatics {

  public static int anInt1244 = -1;
  public static int anInt3072 = -1;
  public static SomethingGl0[][] aClass3_Sub11ArrayArray2542;
  public static int anInt3419;
  public static int anInt2456;
  public static SomethingGl0[][] aClass3_Sub11ArrayArray2199;
  public static ITextureCache textureCache;
  public static boolean aBoolean1685 = true;
  public static int CAMERA_TILE_Y;
  public static int CURRENT_VIEWPORT_SIZE;
  public static boolean[][] adjacentTileOnScreen;
  public static int anInt1137 = 2;
  public static float[] FOG_COLOR = new float[4];
  public static SceneGraphTile[][][] sceneGraphTiles;
  public static boolean aBoolean3207;
  public static int CAMERA_TILE_X;
  public static byte[] aByteArray2111 = new byte[16384];
  public static int anInt692;
  public static int anInt715;
  public static int anInt716;
  public static int[] hslTable = new int[65536];
  public static boolean USE_BUMP_MAPS = true;
  public static int viewportLowerX;
  public static int viewportLowerZ;
  public static int viewportUpperX;
  public static int screenLowerY;
  public static boolean[] aBooleanArray2169 = new boolean[5];
  public static FileUnpacker aClass153_2172;
  static ByteBuffer aByteBuffer2361;
  static Buffer aClass3_Sub30_2362;
  static ByteBuffer aByteBuffer2368;
  static Buffer aClass3_Sub30_2372;

  public static float[] method1705(int var0, int var1) {
    float var2 =
        GlEnvironment.AMBIENT_INTENSITY + GlEnvironment.DIFFUSE_INTENSITY;
    int var3 = GlEnvironment.COLOR;
    float var7 = 0.58823526F;
    GLStatics.FOG_COLOR[3] = 1.0F;
    float var4 = (var3 >> 16 & 255) / 255.0F;
    float var5 = ((0xff1e & var3) >> 8) / 255.0F;
    GLStatics.FOG_COLOR[1] =
        var2 * (var0 >> 8 & 255) / 255.0F * var5 * var7;
    GLStatics.FOG_COLOR[var1] =
        var2 * var7 * var4 * (((16754958 & var0) >> 16)
            / 255.0F);
    float var6 = (var3 & 255) / 255.0F;
    GLStatics.FOG_COLOR[2] =
        (255 & var0) / 255.0F * var6 * var7 * var2;
    return GLStatics.FOG_COLOR;
  }

  public static void method551(int var1, int var2) {
    if (var2 == 4 && !GLStatics.aBoolean1685) {
      var2 = 2;
      var1 = 2;
    }

    if (DummyClass30.anInt453 == var2) {
      if (var2 != 0 && var1 != GlobalStatics_10.anInt3263) {
        GlobalStatics_9.anInterface5Array70[var2].set(var1);
        GlobalStatics_10.anInt3263 = var1;
      }
    } else {
      if (GLStatics.aBoolean3207) {
        return;
      }

      if (DummyClass30.anInt453 != 0) {
        GlobalStatics_9.anInterface5Array70[DummyClass30.anInt453].disable();
      }

      if (var2 != 0) {
        MaterialShader var3 = GlobalStatics_9.anInterface5Array70[var2];
        var3.enable();
        var3.set(var1);
      }

      DummyClass30.anInt453 = var2;
      GlobalStatics_10.anInt3263 = var1;
    }

  }

  public static float[] calculateFogColor() {
    float var1 =
        GlEnvironment.AMBIENT_INTENSITY + GlEnvironment.DIFFUSE_INTENSITY;
    int var2 = GlEnvironment.COLOR;
    float var3 = (255 & var2 >> 16) / 255.0F;
    GLStatics.FOG_COLOR[3] = 1.0F;
    float var4 = ((0xff59 & var2) >> 8) / 255.0F;
    float var6 = 0.58823526F;
    float var5 = (255 & var2) / 255.0F;
    GLStatics.FOG_COLOR[2] =
        GlobalStatics_5.aFloatArray1934[2] * var5 * var6 * var1;
    GLStatics.FOG_COLOR[0] =
        GlobalStatics_5.aFloatArray1934[0] * var3 * var6 * var1;
    GLStatics.FOG_COLOR[1] =
        var1 * var6 * var4 * GlobalStatics_5.aFloatArray1934[1];
    return GLStatics.FOG_COLOR;
  }

  public static long method104(int x, int y, int z) {
    SceneGraphTile tile = GLStatics.sceneGraphTiles[x][y][z];
    if (tile == null || tile.aClass12_2230 == null) {
      return 0L;
    }
    return tile.aClass12_2230.aLong328;
  }

  public static void method535(int var1) {
    GlobalStatics_5.aFloatArray1934[0] = (255 & var1 >> 16) / 255.0F;
    GlobalStatics_5.aFloatArray1934[1] = (var1 >> 8 & 255) / 255.0F;
    GlobalStatics_5.aFloatArray1934[2] = (255 & var1) / 255.0F;
    GlobalStatics_9.method383(-32584, 3);
    GlobalStatics_9.method383(-32584, 4);
  }

  public static void method1058(int var0, int var1, int var2, int var3) {
    if (var1 - var0 >= DummyClass55.anInt1425
        && GlTexture2d.anInt3765 >= var0 + var1
        && var3 - var0 >= DummyClass13.anInt2020
        && GlobalStatics_9.anInt902 >= var0 + var3) {
      GlobalStatics_9.method949(var1, var0, var2, var3);
    } else {
      GlobalStatics_9.method1129(var2, var3, var0, 0, var1);
    }
  }

  public static void clear90(byte var0) {
    GameStringStatics.aClass94_695 = null;
    GameStringStatics.aClass94_701 = null;
    GameStringStatics.aClass94_699 = null;
    GameStringStatics.aClass94_691 = null;
  }

  public static AbstractDirectColorSprite method1062(int var0) {
    byte[] var2 = DummyClass5.aByteArrayArray2987[0];
    int var1 =
        GlobalStatics_9.anIntArray2931[0] * GlobalStatics_10.anIntArray3076[0];
    int[] var3 = new int[var1];
    if (var0 < 70) {
      GLStatics.method1062(67);
    }

    for (int var4 = 0; var1 > var4; ++var4) {
      var3[var4] = GlobalStatics_10.anIntArray3446[(int) var2[var4] & 255];
    }

    AbstractDirectColorSprite var6;
    if (GlRenderer.USE_OPENGL) {
      var6 = new GlDirectColorSprite(GlobalStatics_9.anInt2426,
          GlobalStatics_9.anInt1748,
          GlobalStatics_9.anIntArray2048[0], GlobalStatics_0.anIntArray2591[0],
          GlobalStatics_9.anIntArray2931[0],
          GlobalStatics_10.anIntArray3076[0], var3);
    } else {
      var6 =
          new SoftwareDirectColorSprite(GlobalStatics_9.anInt2426,
              GlobalStatics_9.anInt1748,
              GlobalStatics_9.anIntArray2048[0],
              GlobalStatics_0.anIntArray2591[0],
              GlobalStatics_9.anIntArray2931[0],
              GlobalStatics_10.anIntArray3076[0],
              var3
          );
    }

    DummyClass37.method1035((byte) 111);
    return var6;
  }

  public static void executeScript(ClientScriptCall var1) {
    GlobalStatics_11.callScript((byte) -93, 200000, var1);
  }

  public static void method1083() {
    GlobalStatics_10.anIntArray3107 =
        GlobalStatics_2.method62(true, 14585, 8, 2048, 4, 0.4F, 8, 35);
  }

  public static int nearestPo2(int var1) {
    --var1;
    var1 |= var1 >>> 1;
    var1 |= var1 >>> 2;
    var1 |= var1 >>> 4;
    var1 |= var1 >>> 8;
    var1 |= var1 >>> 16;
    return 1 + var1;
  }

  public static void method144() {
    aClass3_Sub30_2372 = null;
    aClass3_Sub30_2362 = null;
    aByteBuffer2368 = null;
    aByteBuffer2361 = null;
  }

  public static void method147() {
    aClass3_Sub30_2372 = null;
    aClass3_Sub30_2362 = null;
    aByteBuffer2368 = null;
    aByteBuffer2361 = null;
  }

  public static void method1626(byte var0) {
    GlobalStatics_9.aClass93_3572.method1524(3);
    DummyClass15.aClass93_1874.method1524(3);
    if (var0 <= -124) {
      GlobalStatics_9.aClass93_1013.method1524(3);
    }
  }

  public static boolean method1627(int var0, byte var1) {
    GameWorld var2 = GlobalStatics_6.method130(97, var0);
    if (var2 != null) {
      if (GlobalStatics_9.anInt1214 != 1 && GlobalStatics_9.anInt1214 != 2
          && GlobalStatics_4.usageLocation != 2) {
        GameString var9 = GlobalStatics_8.aClass94_8;
        if (GlobalStatics_4.usageLocation != 0) {
          var9 = GlobalStatics_9.concat(new GameString[]{
              DummyClass9.aClass94_4007,
              GlobalStatics_9.toString(var2.anInt2621 + 7000)
          });
        }

        if (var1 > -2) {
          return false;
        } else {
          GameString var4 = GlobalStatics_8.aClass94_8;
          if (DummyClass7.settings != null) {
            var4 = GlobalStatics_9.concat(
                new GameString[]{GameStringStatics.aClass94_1380,
                    DummyClass7.settings});
          }

          GameString var5 = GlobalStatics_9.concat(new GameString[]{
              DummyClass45.aClass94_992, var2.aClass94_2625, var9,
              GameStringStatics.aClass94_2608,
              GlobalStatics_9.toString(GlobalStatics_10.languageId),
              GameStringStatics.aClass94_2175,
              GlobalStatics_9.toString(GlobalStatics_9.affiliateId), var4,
              GameStringStatics.aClass94_1133,
              GlobalStatics_9.aBoolean3641 ? DummyClass28.aClass94_339
                  : GameStringStatics.ZERO,
              DummyClass36.aClass94_2610,
              DummyClass8.aBoolean4018 ? DummyClass28.aClass94_339
                  : GameStringStatics.ZERO,
              GlobalStatics_5.aClass94_1617,
              GlobalStatics_9.aBoolean3779 ? DummyClass28.aClass94_339
                  : GameStringStatics.ZERO
          });

          try {
            GlobalStatics_9.client.getAppletContext()
                .showDocument(var5.method1527(false), "_self");
          } catch (Exception var7) {
            return false;
          }

          return true;
        }
      } else {
        byte[] var3 = var2.aClass94_2625.method1568(0);
        DummyClass36.aString2611 = new String(var3, 0, var3.length);
        GlobalStatics_7.anInt2451 = var2.anInt2621;
        if (GlobalStatics_4.usageLocation != 0) {
          DummyClass11.anInt2036 = 0x9c40 + GlobalStatics_7.anInt2451;
          GlobalStatics_9.anInt2894 = DummyClass11.anInt2036;
          GlobalStatics_9.anInt506 = GlobalStatics_7.anInt2451 + 0xc350;
        }

        return true;
      }
    } else {
      return false;
    }
  }

  public static void method1628(int var0, int var1, int var2, int var3,
      int var4, int var5,
      byte var6) {
    int var9;
    int var12;
    if (GlobalStatics_9.anInt3012 == 0) {
      int var10 = screenLowerY;
      var9 = DummyClass3.screenUpperY;
      int var8 = GlobalStatics_10.screenUpperX;
      int var7 = DummyClass17.screenLowerX;
      int var11 = (var5 - var3) * (-var7 + var8) / var1 + var7;
      var12 = var9 + (var10 - var9) * (-var0 + var4) / var2;
      if (GlobalStatics_9.aBoolean1837 && (64 & GlobalStatics_9.anInt2051)
          != 0) {
        Widget var13 =
            GlobalStatics_2
                .method638((byte) -19, GlobalStatics_9.anInt872,
                    GlobalStatics_10.anInt278);
        if (var13 != null) {
          GlobalStatics_9.method1177(GlobalStatics_6.anInt1887, 0L, (byte) -53,
              GameStringStatics.aClass94_1724, var11, (short) 11,
              GameStringStatics.aClass94_3621, var12);
        } else {
          GlobalStatics_9.method958();
        }
      } else {
        ++GlobalStatics_2.anInt2571;
        if (GlobalStatics_5.gameId == 1) {
          GlobalStatics_9
              .method1177(-1, 0L, (byte) -62, GameStringStatics.EMPTY_STRING,
                  var11,
                  (short) 36, GlTexture2d.aClass94_3762, var12);
        }

        GlobalStatics_9
            .method1177(-1, 0L, (byte) -75, GameStringStatics.EMPTY_STRING, var11,
                (short) 60,
                GameStringStatics.walkTooltip, var12);
      }
    }

    if (var6 > 48) {
      long var25 = -1L;

      for (var9 = 0; GlobalStatics_9.anInt59 > var9; ++var9) {
        long var26 = GlobalStatics_10.entityKeys[var9];
        var12 = (int) var26 & 127;
        int var14 = ((int) var26 & 2009320690) >> 29;
        int var15 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
        int var27 = 127 & (int) var26 >> 7;
        if (var26 != var25) {
          var25 = var26;
          int var18;
          if (var14 == 2 && GlobalStatics_5
              .method2096(GlobalStatics_9.currentPlane,
                  var12, var27, var26)) {
            GameObjectConfig var16 = DummyClass11.method2207(4, var15);
            if (var16.anIntArray1524 != null) {
              var16 = var16.method1685(0);
            }

            if (var16 == null) {
              continue;
            }

            if (GlobalStatics_9.anInt3012 == 1) {
              GlobalStatics_9
                  .method1177(DummyClass54.anInt1403, var26, (byte) -58,
                      GlobalStatics_9.concat(new GameString[]{
                          GameStringStatics.aClass94_378,
                          GameStringStatics.aClass94_3573,
                          var16.aClass94_1504
                      }), var12, (short) 14, GameStringStatics.aClass94_3388,
                      var27);
              ++anInt715;
            } else if (!GlobalStatics_9.aBoolean1837) {
              ++DummyClass28.anInt336;
              GameString[] var29 = var16.aClass94Array1499;
              if (DummyClass24.aBoolean1656) {
                var29 = GlobalStatics_9.method822(19406, var29);
              }

              if (var29 != null) {
                for (var18 = 4; var18 >= 0; --var18) {
                  if (var29[var18] != null) {
                    ++GlobalStatics_9.anInt2337;
                    short var19 = 0;
                    if (var18 == 0) {
                      var19 = 42;
                    }

                    if (var18 == 1) {
                      var19 = 50;
                    }

                    int var20 = -1;
                    if (var18 == 2) {
                      var19 = 49;
                    }

                    if (var16.anInt1493 == var18) {
                      var20 = var16.anInt1517;
                    }

                    if (var18 == 3) {
                      var19 = 46;
                    }

                    if (var18 == var16.anInt1520) {
                      var20 = var16.anInt1522;
                    }

                    if (var18 == 4) {
                      var19 = 1001;
                    }

                    GlobalStatics_9.method1177(var20, var26, (byte) -91,
                        GlobalStatics_9.concat(
                            new GameString[]{DummyClass17.aClass94_1826,
                                var16.aClass94_1504}), var12,
                        var19, var29[var18], var27);
                  }
                }
              }

              GlobalStatics_9
                  .method1177(GlobalStatics_10.anInt1719, var16.anInt1527,
                      (byte) -26,
                      GlobalStatics_9.concat(
                          new GameString[]{DummyClass17.aClass94_1826,
                              var16.aClass94_1504}), var12,
                      (short) 1004, GlobalStatics_0.aClass94_1180, var27);
            } else {
              Parameter var17 = GlobalStatics_9.anInt1038 == -1 ?
                  null :
                  GlobalStatics_0.method1210(64, GlobalStatics_9.anInt1038);
              if ((GlobalStatics_9.anInt2051 & 4) != 0 && (var17 == null
                  || var16
                  .method1691(var17.anInt3614, GlobalStatics_9.anInt1038,
                      (byte) 98) != var17.anInt3614)) {
                GlobalStatics_9
                    .method1177(GlobalStatics_6.anInt1887, var26, (byte) -77,
                        GlobalStatics_9.concat(new GameString[]{
                            DummyClass59.aClass94_676,
                            GameStringStatics.aClass94_3573,
                            var16.aClass94_1504
                        }), var12, (short) 38, GameStringStatics.aClass94_3621,
                        var27);
                ++DummyClass9.anInt4011;
              }
            }
          }

          int var21;
          int var22;
          int var33;
          Player var38;
          NPC var36;
          int var37;
          if (var14 == 1) {
            NPC var31 = GlobalStatics_8.NPCS[var15];
            if ((var31.config.size & 1) == 0 && (127 & var31.sceneX) == 0
                && (var31.sceneY & 127) == 0
                || (var31.config.size & 1) == 1 && (127 & var31.sceneX) == 64
                &&
                (
                    var31.sceneY & 127) == 64) {
              var33 = var31.sceneX + 64 - 64 * var31.config.size;
              var18 = -((-1 + var31.config.size) * 64) + var31.sceneY;

              for (var37 = 0; var37 < DummyClass6.anInt2046; ++var37) {
                var36 = GlobalStatics_8.NPCS[GlobalStatics_2.anIntArray347[var37]];
                var21 = -(var36.config.size * 64) + 64 + var36.sceneX;
                var22 = var36.sceneY - var36.config.size * 64 + 64;
                if (var31 != var36 && var21 >= var33
                    && var31.config.size - (-var33 + var21 >> 7)
                    >= var36.config.size && var18 <= var22
                    && var36.config.size
                    <= -(-var18 + var22 >> 7) + var31.config.size) {
                  GlobalStatics_6.method2068(var36.config, var12, -126,
                      GlobalStatics_2.anIntArray347[var37], var27);
                }
              }

              for (var37 = 0; DummyClass13.anInt2022 > var37; ++var37) {
                var38 = GlobalStatics_9.players[DummyClass42.anIntArray887[var37]];
                var21 = var38.sceneX + 64 - 64 * var38.getSize();
                var22 = var38.sceneY - (var38.getSize() * 64 - 64);
                if (var21 >= var33 && var38.getSize() <= var31.config.size
                    - (
                    var21 - var33 >> 7) && var22 >= var18
                    && var38.getSize()
                    <= -(-var18 + var22 >> 7) + var31.config.size) {
                  GlobalStatics_9
                      .method312(DummyClass42.anIntArray887[var37], 5, var27,
                          var38,
                          var12);
                }
              }
            }

            GlobalStatics_6.method2068(var31.config, var12, -108, var15, var27);
          }

          if (var14 == 0) {
            Player var30 = GlobalStatics_9.players[var15];
            if ((127 & var30.sceneX) == 64 && (127 & var30.sceneY)
                == 64) {
              var33 = var30.sceneX - 64 * (-1 + var30.getSize());
              var18 = var30.sceneY + 64 - var30.getSize() * 64;

              for (var37 = 0; var37 < DummyClass6.anInt2046; ++var37) {
                var36 = GlobalStatics_8.NPCS[GlobalStatics_2.anIntArray347[var37]];
                var21 = var36.sceneX - var36.config.size * 64 + 64;
                var22 = var36.sceneY - 64 * var36.config.size + 64;
                if (var21 >= var33
                    && var36.config.size <= -(var21 - var33 >> 7) + var30
                    .getSize() && var22 >= var18 &&
                    var36.config.size <= -(-var18 + var22 >> 7) + var30.getSize()) {
                  GlobalStatics_6.method2068(var36.config, var12, -121,
                      GlobalStatics_2.anIntArray347[var37], var27);
                }
              }

              for (var37 = 0; var37 < DummyClass13.anInt2022; ++var37) {
                var38 = GlobalStatics_9.players[DummyClass42.anIntArray887[var37]];
                var21 = var38.sceneX - (var38.getSize() - 1) * 64;
                var22 = var38.sceneY - (-64 + 64 * var38.getSize());
                if (var38 != var30 && var33 <= var21
                    && var38.getSize() <= var30.getSize() - (var21 - var33
                    >> 7) && var22 >= var18 &&
                    var38.getSize() <= -(var22 - var18 >> 7) + var30.getSize()) {
                  GlobalStatics_9
                      .method312(DummyClass42.anIntArray887[var37], 9, var27,
                          var38,
                          var12);
                }
              }
            }

            GlobalStatics_9.method312(var15, 31, var27, var30, var12);
          }

          if (var14 == 3) {
            Deque var28 =
                GlobalStatics_9.groundItems[GlobalStatics_9.currentPlane][var12][var27];
            if (var28 != null) {
              for (GroundItemNode var32 = (GroundItemNode) var28.method1212();
                  var32 != null;
                  var32 = (GroundItemNode) var28.method1219(41)) {
                var18 = var32.aClass140_Sub7_3676.anInt2936;
                ItemConfig var40 = DummyClass35.getItemConfig(var18, (byte) 71);
                if (GlobalStatics_9.anInt3012 == 1) {
                  ++GlobalStatics_9.anInt2290;
                  GlobalStatics_9
                      .method1177(DummyClass54.anInt1403, var18, (byte) -75,
                          GlobalStatics_9.concat(new GameString[]{
                              GameStringStatics.aClass94_378,
                              GlobalStatics_0.aClass94_1699, var40.aClass94_770
                          }), var12, (short) 33, GameStringStatics.aClass94_3388,
                          var27);
                } else if (!GlobalStatics_9.aBoolean1837) {
                  ++GlobalStatics_9.anInt2901;
                  GameString[] var34 = var40.aClass94Array801;
                  if (DummyClass24.aBoolean1656) {
                    var34 = GlobalStatics_9.method822(19406, var34);
                  }

                  for (var21 = 4; var21 >= 0; --var21) {
                    if (var34 != null && var34[var21] != null) {
                      ++GlobalStatics_8.anInt27;
                      byte var35 = 0;
                      if (var21 == 0) {
                        var35 = 21;
                      }

                      if (var21 == 1) {
                        var35 = 34;
                      }

                      int var23 = -1;
                      if (var21 == var40.anInt767) {
                        var23 = var40.anInt758;
                      }

                      if (var21 == 2) {
                        var35 = 18;
                      }

                      if (var40.anInt788 == var21) {
                        var23 = var40.anInt756;
                      }

                      if (var21 == 3) {
                        var35 = 20;
                      }

                      if (var21 == 4) {
                        var35 = 24;
                      }

                      GlobalStatics_9.method1177(var23, var18, (byte) -43,
                          GlobalStatics_9.concat(
                              new GameString[]{GameStringStatics.aClass94_3042,
                                  var40.aClass94_770}),
                          var12, var35, var34[var21], var27);
                    }
                  }

                  GlobalStatics_9
                      .method1177(GlobalStatics_10.anInt1719, var18, (byte) -43,
                          GlobalStatics_9.concat(
                              new GameString[]{GameStringStatics.aClass94_3042,
                                  var40.aClass94_770}),
                          var12, (short) 1002, GlobalStatics_0.aClass94_1180,
                          var27);
                } else {
                  Parameter var39 = GlobalStatics_9.anInt1038 == -1 ?
                      null :
                      GlobalStatics_0.method1210(64, GlobalStatics_9.anInt1038);
                  if ((GlobalStatics_9.anInt2051 & 1) != 0 && (var39 == null
                      || var40.method1115(var39.anInt3614, 100,
                      GlobalStatics_9.anInt1038) != var39.anInt3614)) {
                    ++GlobalStatics_7.anInt1439;
                    GlobalStatics_9.method1177(GlobalStatics_6.anInt1887, var18,
                        (byte) -70,
                        GlobalStatics_9.concat(new GameString[]{
                            DummyClass59.aClass94_676,
                            GlobalStatics_0.aClass94_1699, var40.aClass94_770
                        }), var12, (short) 39, GameStringStatics.aClass94_3621,
                        var27);
                  }
                }
              }
            }
          }
        }
      }

    }
  }

  public static void method1629(int var0, int var1, int var2, int var3,
      int var4, int var5, int var6,
      int var7, int var8, int var9, int var10, int var11, int var12,
      int var13, int var14, int var15, int var16, int var17, int var18,
      int var19) {
    int var21;
    SomethingTilek var20;
    if (var3 == 0) {
      var20 = new SomethingTilek(var10, var11, var12, var13, -1, var18, false);

      for (var21 = var0; var21 >= 0; --var21) {
        if (sceneGraphTiles[var21][var1][var2] == null) {
          sceneGraphTiles[var21][var1][var2] =
              new SceneGraphTile(var21, var1, var2);
        }
      }

      sceneGraphTiles[var0][var1][var2].aClass126_2240 = var20;
    } else if (var3 != 1) {
      SomethingSceneTile var22 =
          new SomethingSceneTile(var3, var4, var5, var1, var2, var6, var7, var8,
              var9, var10, var11,
              var12, var13, var14, var15, var16, var17, var18, var19);

      for (var21 = var0; var21 >= 0; --var21) {
        if (sceneGraphTiles[var21][var1][var2] == null) {
          sceneGraphTiles[var21][var1][var2] =
              new SceneGraphTile(var21, var1, var2);
        }
      }

      sceneGraphTiles[var0][var1][var2].aClass35_2226 = var22;
    } else {
      var20 = new SomethingTilek(var14, var15, var16, var17, var5, var19,
          var6 == var7 && var6 == var8 && var6 == var9);

      for (var21 = var0; var21 >= 0; --var21) {
        if (sceneGraphTiles[var21][var1][var2] == null) {
          sceneGraphTiles[var21][var1][var2] =
              new SceneGraphTile(var21, var1, var2);
        }
      }

      sceneGraphTiles[var0][var1][var2].aClass126_2240 = var20;
    }
  }

  public static void method1630(byte var0) {
    GameStringStatics.aClass94_2171 = null;
    aClass153_2172 = null;
    aBooleanArray2169 = null;
    GameStringStatics.aClass94_2176 = null;
    if (var0 > -112) {
      method1632(-116, 108, 54, -120, 44, 6);
    }

    GameStringStatics.aClass94_2170 = null;
    GameStringStatics.aClass94_2175 = null;
  }

  public static void method1632(int var0, int var1, int var2, int var3,
      int var4, int var5) {
    if (var0 <= 66) {
      method1630((byte) -33);
    }

    for (int var6 = var3; var1 >= var6; ++var6) {
      GlobalStatics_10
          .method282(DummyClass35.anIntArrayArray663[var6], var4, 121, var2,
              var5);
    }
  }
}
