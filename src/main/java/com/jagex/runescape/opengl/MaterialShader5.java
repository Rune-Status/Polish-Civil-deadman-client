package com.jagex.runescape.opengl;

import com.jagex.runescape.model.GameObjectConfig;
import com.jagex.runescape.model.GameWorld;
import com.jagex.runescape.statics.GlobalStatics_0;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_2;
import com.jagex.runescape.statics.GlobalStatics_4;
import com.jagex.runescape.statics.GlobalStatics_5;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jagex.runescape.statics.GlobalStatics_7;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;
import com.jagex.runescape.model.GroundItemNode;
import com.jagex.runescape.model.ItemConfig;
import com.jagex.runescape.model.NPC;
import com.jagex.runescape.model.Parameter;
import com.jagex.runescape.model.Player;
import com.jagex.runescape.model.SceneGraphTile;
import com.jagex.runescape.model.SomethingSceneTile;
import com.jagex.runescape.model.SomethingTilek;
import com.jagex.runescape.model.Widget;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.FileUnpacker;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.statics.DummyClass11;
import com.jagex.runescape.statics.DummyClass13;
import com.jagex.runescape.statics.DummyClass15;
import com.jagex.runescape.statics.DummyClass17;
import com.jagex.runescape.statics.DummyClass24;
import com.jagex.runescape.statics.DummyClass28;
import com.jagex.runescape.statics.DummyClass3;
import com.jagex.runescape.statics.DummyClass35;
import com.jagex.runescape.statics.DummyClass36;
import com.jagex.runescape.statics.DummyClass42;
import com.jagex.runescape.statics.DummyClass45;
import com.jagex.runescape.statics.DummyClass54;
import com.jagex.runescape.statics.DummyClass59;
import com.jagex.runescape.statics.DummyClass6;
import com.jagex.runescape.statics.DummyClass7;
import com.jagex.runescape.statics.DummyClass8;
import com.jagex.runescape.statics.DummyClass9;
import com.jogamp.opengl.GL;

public final class MaterialShader5 implements MaterialShader {

  private static GameString aClass94_2175 = GameStringStatics.create(")4a=");
  public static boolean[] aBooleanArray2169 = new boolean[5];
  public static GameString aClass94_2170 = GameStringStatics
      .create("Fertigkeit: ");
  public static GameString aClass94_2171 = GameStringStatics.create("");
  public static FileUnpacker aClass153_2172;
  public static GameString aClass94_2176 =
      GameStringStatics.create("(U0a )2 non)2existant gosub script)2num: ");
  private int anInt2173;
  private final float[] aFloatArray2174 = new float[4];

  public MaterialShader5() {
    this.method1631(2);
  }

  public void disable() {
    GlRenderer.GL.glCallList(1 + this.anInt2173);
  }

  public void enable() {
    GlRenderer.GL.glCallList(this.anInt2173);
  }

  public void set(int var1) {
    float var4 = (1 + (var1 >> 3 & 3)) * 0.01F;
    float var3 = -0.01f * (1 + (var1 & 3));
    float var5 = (var1 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
    boolean var6 = (128 & var1) != 0;
    if (var6) {
      this.aFloatArray2174[0] = var5;
      this.aFloatArray2174[1] = 0.0F;
      this.aFloatArray2174[2] = 0.0F;
      this.aFloatArray2174[3] = 0.0F;
    } else {
      this.aFloatArray2174[2] = var5;
      this.aFloatArray2174[1] = 0.0F;
      this.aFloatArray2174[3] = 0.0F;
      this.aFloatArray2174[0] = 0.0F;
    }

    GlRenderer.GL.glActiveTexture(0x84c1);
    GlRenderer.GL.glMatrixMode(5888);
    GlRenderer.GL.glPushMatrix();
    GlRenderer.GL.glLoadIdentity();
    GlRenderer.GL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    GlRenderer.GL
        .glRotatef(GlobalStatics_9.anInt2938 * 360.0F / 2048.0F, 1.0F, 0.0F,
            0.0F);
    GlRenderer.GL
        .glRotatef(360.0F * GlobalStatics_9.anInt3103 / 2048.0F, 0.0F, 1.0F,
            0.0F);
    GlRenderer.GL.glTranslatef(-GlobalStatics_10.anInt144,
        -GlobalStatics_6.anInt3695, -GlobalStatics_0.anInt2587);
    GlRenderer.GL.glTexGenfv(8192, 9474, this.aFloatArray2174, 0);
    this.aFloatArray2174[3] = var3 * GlRenderer.anInt1791;
    this.aFloatArray2174[0] = 0.0F;
    this.aFloatArray2174[2] = 0.0F;
    this.aFloatArray2174[1] = var5;
    GlRenderer.GL.glTexGenfv(8193, 9474, this.aFloatArray2174, 0);
    GlRenderer.GL.glPopMatrix();
    if (SomethingGl.aBoolean1227) {
      this.aFloatArray2174[3] = GlRenderer.anInt1791 * var4;
      this.aFloatArray2174[1] = 0.0F;
      this.aFloatArray2174[0] = 0.0F;
      this.aFloatArray2174[2] = 0.0F;
      GlRenderer.GL.glTexGenfv(8194, 9473, this.aFloatArray2174, 0);
    } else {
      int var7 = (int) (GlRenderer.anInt1791 * var4 * 64.0F);
      GlRenderer.GL.glBindTexture(GL.GL_TEXTURE_2D, SomethingGl.anIntArray1223[var7 % 64]);
    }

    GlRenderer.GL.glActiveTexture(0x84c0);
  }

  public int method24() {
    return 0;
  }

  private void method1631(int var1) {
    this.anInt2173 = GlRenderer.GL.glGenLists(var1);
    GlRenderer.GL.glNewList(this.anInt2173, 4864);
    GlRenderer.GL.glActiveTexture(0x84c1);
    if (SomethingGl.aBoolean1227) {
      GlRenderer.GL.glBindTexture(0x806f, SomethingGl.anInt1229);
      GlRenderer.GL.glTexGeni(8194, 9472, 9217);
      GlRenderer.GL.glEnable(3170);
      GlRenderer.GL.glEnable(0x806f);
    } else {
      GlRenderer.GL.glEnable(GL.GL_TEXTURE_2D);
    }

    GlRenderer.GL.glTexGeni(8192, 9472, 9216);
    GlRenderer.GL.glTexGeni(8193, 9472, 9216);
    GlRenderer.GL.glEnable(3168);
    GlRenderer.GL.glEnable(3169);
    GlRenderer.GL.glActiveTexture(0x84c0);
    GlRenderer.GL.glEndList();
    GlRenderer.GL.glNewList(this.anInt2173 + 1, 4864);
    GlRenderer.GL.glActiveTexture(0x84c1);
    if (SomethingGl.aBoolean1227) {
      GlRenderer.GL.glDisable(0x806f);
      GlRenderer.GL.glDisable(3170);
    } else {
      GlRenderer.GL.glDisable(GL.GL_TEXTURE_2D);
    }

    GlRenderer.GL.glDisable(3168);
    GlRenderer.GL.glDisable(3169);
    GlRenderer.GL.glActiveTexture(0x84c0);
    GlRenderer.GL.glEndList();
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
                new GameString[]{GlobalStatics_10.aClass94_1380,
                    DummyClass7.settings});
          }

          GameString var5 = GlobalStatics_9.concat(new GameString[]{
              DummyClass45.aClass94_992, var2.aClass94_2625, var9,
              GlobalStatics_9.aClass94_2608,
              GlobalStatics_9.toString(GlobalStatics_10.languageId),
              MaterialShader5.aClass94_2175,
              GlobalStatics_9.toString(GlobalStatics_9.affiliateId), var4,
              GlobalStatics_9.aClass94_1133,
              GlobalStatics_9.aBoolean3641 ? DummyClass28.aClass94_339
                  : GlobalStatics_9.ZERO,
              DummyClass36.aClass94_2610,
              DummyClass8.aBoolean4018 ? DummyClass28.aClass94_339
                  : GlobalStatics_9.ZERO,
              GlobalStatics_5.aClass94_1617,
              GlobalStatics_9.aBoolean3779 ? DummyClass28.aClass94_339
                  : GlobalStatics_9.ZERO
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
      int var10 = GLStatics.screenLowerY;
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
              GlobalStatics_10.aClass94_1724, var11, (short) 11,
              GlobalStatics_9.aClass94_3621, var12);
        } else {
          GlobalStatics_9.method958((byte) -87);
        }
      } else {
        ++GlobalStatics_2.anInt2571;
        if (GlobalStatics_5.gameId == 1) {
          GlobalStatics_9
              .method1177(-1, 0L, (byte) -62, GlobalStatics_9.EMPTY_STRING,
                  var11,
                  (short) 36, GlTexture2d.aClass94_3762, var12);
        }

        GlobalStatics_9
            .method1177(-1, 0L, (byte) -75, GlobalStatics_9.EMPTY_STRING, var11,
                (short) 60,
                GlobalStatics_10.walkTooltip, var12);
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
                          GlobalStatics_9.aClass94_378,
                          GlobalStatics_9.aClass94_3573,
                          var16.aClass94_1504
                      }), var12, (short) 14, GlobalStatics_10.aClass94_3388,
                      var27);
              ++GLStatics.anInt715;
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
                            GlobalStatics_9.aClass94_3573,
                            var16.aClass94_1504
                        }), var12, (short) 38, GlobalStatics_9.aClass94_3621,
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
            NPC var31 = GlobalStatics_8.npcs[var15];
            if ((var31.config.size & 1) == 0 && (127 & var31.anInt2819) == 0
                && (var31.anInt2829 & 127) == 0
                || (var31.config.size & 1) == 1 && (127 & var31.anInt2819) == 64
                &&
                (
                    var31.anInt2829 & 127) == 64) {
              var33 = var31.anInt2819 + 64 - 64 * var31.config.size;
              var18 = -((-1 + var31.config.size) * 64) + var31.anInt2829;

              for (var37 = 0; var37 < DummyClass6.anInt2046; ++var37) {
                var36 = GlobalStatics_8.npcs[GlobalStatics_2.anIntArray347[var37]];
                var21 = -(var36.config.size * 64) + 64 + var36.anInt2819;
                var22 = var36.anInt2829 - var36.config.size * 64 + 64;
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
                var21 = var38.anInt2819 + 64 - 64 * var38.getSize();
                var22 = var38.anInt2829 - (var38.getSize() * 64 - 64);
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
            if ((127 & var30.anInt2819) == 64 && (127 & var30.anInt2829)
                == 64) {
              var33 = var30.anInt2819 - 64 * (-1 + var30.getSize());
              var18 = var30.anInt2829 + 64 - var30.getSize() * 64;

              for (var37 = 0; var37 < DummyClass6.anInt2046; ++var37) {
                var36 = GlobalStatics_8.npcs[GlobalStatics_2.anIntArray347[var37]];
                var21 = var36.anInt2819 - var36.config.size * 64 + 64;
                var22 = var36.anInt2829 - 64 * var36.config.size + 64;
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
                var21 = var38.anInt2819 - (var38.getSize() - 1) * 64;
                var22 = var38.anInt2829 - (-64 + 64 * var38.getSize());
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
                              GlobalStatics_9.aClass94_378,
                              GlobalStatics_0.aClass94_1699, var40.aClass94_770
                          }), var12, (short) 33, GlobalStatics_10.aClass94_3388,
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
                              new GameString[]{GlobalStatics_9.aClass94_3042,
                                  var40.aClass94_770}),
                          var12, var35, var34[var21], var27);
                    }
                  }

                  GlobalStatics_9
                      .method1177(GlobalStatics_10.anInt1719, var18, (byte) -43,
                          GlobalStatics_9.concat(
                              new GameString[]{GlobalStatics_9.aClass94_3042,
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
                        }), var12, (short) 39, GlobalStatics_9.aClass94_3621,
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
        if (GLStatics.sceneGraphTiles[var21][var1][var2] == null) {
          GLStatics.sceneGraphTiles[var21][var1][var2] =
              new SceneGraphTile(var21, var1, var2);
        }
      }

      GLStatics.sceneGraphTiles[var0][var1][var2].aClass126_2240 = var20;
    } else if (var3 != 1) {
      SomethingSceneTile var22 =
          new SomethingSceneTile(var3, var4, var5, var1, var2, var6, var7, var8,
              var9, var10, var11,
              var12, var13, var14, var15, var16, var17, var18, var19);

      for (var21 = var0; var21 >= 0; --var21) {
        if (GLStatics.sceneGraphTiles[var21][var1][var2] == null) {
          GLStatics.sceneGraphTiles[var21][var1][var2] =
              new SceneGraphTile(var21, var1, var2);
        }
      }

      GLStatics.sceneGraphTiles[var0][var1][var2].aClass35_2226 = var22;
    } else {
      var20 = new SomethingTilek(var14, var15, var16, var17, var5, var19,
          var6 == var7 && var6 == var8 && var6 == var9);

      for (var21 = var0; var21 >= 0; --var21) {
        if (GLStatics.sceneGraphTiles[var21][var1][var2] == null) {
          GLStatics.sceneGraphTiles[var21][var1][var2] =
              new SceneGraphTile(var21, var1, var2);
        }
      }

      GLStatics.sceneGraphTiles[var0][var1][var2].aClass126_2240 = var20;
    }
  }

  public static void method1630(byte var0) {
    MaterialShader5.aClass94_2171 = null;
    MaterialShader5.aClass153_2172 = null;
    MaterialShader5.aBooleanArray2169 = null;
    MaterialShader5.aClass94_2176 = null;
    if (var0 > -112) {
      MaterialShader5.method1632(-116, 108, 54, -120, 44, 6);
    }

    MaterialShader5.aClass94_2170 = null;
    MaterialShader5.aClass94_2175 = null;
  }

  public static void method1632(int var0, int var1, int var2, int var3,
      int var4, int var5) {
    if (var0 <= 66) {
      MaterialShader5.method1630((byte) -33);
    }

    for (int var6 = var3; var1 >= var6; ++var6) {
      GlobalStatics_10
          .method282(DummyClass35.anIntArrayArray663[var6], var4, 121, var2,
              var5);
    }
  }

}
