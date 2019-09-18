package com.jagex.runescape.statics;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.AbstractModel;
import com.jagex.runescape.model.CollisionMap;
import com.jagex.runescape.model.GameObject;
import com.jagex.runescape.model.GameObjectConfig;
import com.jagex.runescape.model.SceneShadowMap;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.SomethingShadows;
import com.jagex.runescape.scene.SceneNode;

public final class DummyClass31 {

  public static Deque aClass61_1471 = new Deque();
  public static int anInt1472;
  public static int anInt1473;
  public static GameString SERVER_JS5_DROP = GameStringStatics
      .create("::serverjs5drop");
  public static float aFloat1475;

  public static void method1681(int var0) {
    if (GlobalStatics_10.loginState == 5) {
      if (var0 != -1) {
        DummyClass31.SERVER_JS5_DROP = null;
      }

      GlobalStatics_10.loginState = 6;
    }
  }

  public static void method1682(int var0) {
    DummyClass31.SERVER_JS5_DROP = null;
    DummyClass31.aClass61_1471 = null;
    if (var0 >= -65) {
      DummyClass31.method1681(-121);
    }
  }

  public static void method1683(int var0, boolean var1, int regionLevel,
      boolean var3,
      CollisionMap var4,
      int var5, int var6, int regionX, byte var8, int regionY, int var10) {
    if (var1 && !GlobalStatics_9.method1986(103) && (2
        & GlobalStatics_10.tileFlags[0][regionX][regionY]) == 0) {
      if ((16 & GlobalStatics_10.tileFlags[regionLevel][regionX][regionY])
          != 0) {
        return;
      }

      if (DummyClass18.method823(regionY, regionX, regionLevel)
          != GlobalStatics_8.plane) {
        return;
      }
    }

    if (regionLevel < DummyClass52.anInt1174) {
      DummyClass52.anInt1174 = regionLevel;
    }

    GameObjectConfig var11 = DummyClass11.method2207(4, var5);
    if (!GlRenderer.USE_OPENGL || !var11.aBoolean1530) {
      int var12;
      int var13;
      if (var10 != 1 && var10 != 3) {
        var12 = var11.anInt1480;
        var13 = var11.anInt1485;
      } else {
        var13 = var11.anInt1480;
        var12 = var11.anInt1485;
      }

      int var14;
      int var15;
      if (regionX + var12 <= 104) {
        var14 = regionX + (var12 >> 1);
        var15 = regionX + (1 + var12 >> 1);
      } else {
        var15 = 1 + regionX;
        var14 = regionX;
      }

      int var17;
      int var16;
      if (var13 + regionY > 104) {
        var16 = regionY;
        var17 = regionY + 1;
      } else {
        var16 = (var13 >> 1) + regionY;
        var17 = regionY + (var13 + 1 >> 1);
      }

      int[][] var18 = GlobalStatics_4.heightMap[var0];
      if (var8 == GlobalStatics_6.NEAR) {
        int var20 = (var12 << 6) + (regionX << 7);
        int var21 = (var13 << 6) + (regionY << 7);
        int var19 =
            var18[var14][var17] + var18[var15][var16] + var18[var14][var16]
                + var18[var15][var17]
                >> 2;
        int var22 = 0;
        int[][] var23;
        if (GlRenderer.USE_OPENGL && var0 != 0) {
          var23 = GlobalStatics_4.heightMap[0];
          var22 = var19 - (
              var23[var15][var17] + var23[var15][var16] + var23[var14][var16]
                  + var23[var14][var17]
                  >> 2);
        }

        var23 = null;
        long var24 =
            1073741824 | regionX | regionY << 7 | var6 << 14 | var10 << 20;
        if (var3) {
          var23 = DummyClass43.somethingHeightMap[0];
        } else if (var0 < 3) {
          var23 = GlobalStatics_4.heightMap[1 + var0];
        }

        if (var11.anInt1529 == 0 || var3) {
          var24 |= Long.MIN_VALUE;
        }

        if (var11.anInt1540 == 1) {
          var24 |= 4194304L;
        }

        if (var11.aBoolean1507) {
          var24 |= 2147483648L;
        }

        if (var11.method1690(28933)) {
          GlobalStatics_9
              .method1286(regionY, false, var11, var10, null, regionX,
                  regionLevel, null);
        }

        boolean var26 = var11.aBoolean1503 & !var3;
        var24 |= (long) var5 << 32;
        SceneNode var27;
        SceneShadowMap var28;
        if (var6 != 22) {
          if (var6 != 10 && var6 != 11) {
            if (var6 >= 12) {
              if (var11.anInt1531 == -1 && var11.anIntArray1524 == null
                  && !var11.aBoolean1510) {
                var28 = var11
                    .method1696(var10, var20, var18, var6, var19, var23, var1,
                        null,
                        (byte) -82, var26, var21);
                if (GlRenderer.USE_OPENGL && var26) {
                  SomethingShadows
                      .method2051(var28.shadow, var20, var22, var21);
                }

                assert var28 != null;
                var27 = var28.node;
              } else {
                var27 = new GameObject(var5, var6, var10, var0, regionX,
                    regionY,
                    var11.anInt1531,
                    var11.aBoolean1492, null);
              }

              GlobalStatics_7
                  .method835(regionLevel, regionX, regionY, var19, 1, 1,
                      var27, 0,
                      var24);
              if (var1 && var6 <= 17 && var6 != 13 && regionLevel > 0) {
                DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][regionY] =
                    DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][regionY]
                        | 4;
              }

              if (var11.anInt1538 != 0 && var4 != null) {
                var4.method1489(regionX, var11.aBoolean1486, (byte) 73, regionY,
                    var12, var13);
              }

            } else if (var6 == 0) {
              if (var11.anInt1531 == -1 && var11.anIntArray1524 == null
                  && !var11.aBoolean1510) {
                var28 =
                    var11.method1696(var10, var20, var18, 0, var19, var23, var1,
                        null, (byte) -74,
                        var26, var21);
                if (GlRenderer.USE_OPENGL && var26) {
                  assert var28 != null;
                  SomethingShadows
                      .method2051(var28.shadow, var20, var22, var21);
                }

                assert var28 != null;
                var27 = var28.node;
              } else {
                var27 = new GameObject(var5, 0, var10, var0, regionX, regionY,
                    var11.anInt1531,
                    var11.aBoolean1492, null);
              }

              DummyClass14
                  .method2146(regionLevel, regionX, regionY, var19, var27, null,
                      DummyClass13.anIntArray2017[var10], 0, var24);
              if (var1) {
                if (var10 == 0) {
                  if (var11.aBoolean1525) {
                    GlobalStatics_9.SCENE_SHADOW[regionLevel][regionX][regionY] = 50;
                    GlobalStatics_9.SCENE_SHADOW[regionLevel][regionX][1
                        + regionY] = 50;
                  }

                  if (var11.aBoolean1542) {
                    DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][regionY] =
                        DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][regionY]
                            | 1;
                  }
                } else if (var10 != 1) {
                  if (var10 == 2) {
                    if (var11.aBoolean1525) {
                      GlobalStatics_9.SCENE_SHADOW[regionLevel][regionX
                          + 1][regionY] = 50;
                      GlobalStatics_9.SCENE_SHADOW[regionLevel][1 + regionX][1
                          + regionY] = 50;
                    }

                    if (var11.aBoolean1542) {
                      DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX
                          + 1][regionY] =
                          DummyClass36.anIntArrayArrayArray2609[regionLevel][
                              regionX
                                  + 1][regionY] | 1;
                    }
                  } else {
                    if (var10 == 3) {
                      if (var11.aBoolean1525) {
                        GlobalStatics_9.SCENE_SHADOW[regionLevel][regionX][regionY] = 50;
                        GlobalStatics_9.SCENE_SHADOW[regionLevel][1
                            + regionX][regionY] = 50;
                      }

                      if (var11.aBoolean1542) {
                        DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][regionY] =
                            DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][regionY]
                                | 2;
                      }
                    }
                  }
                } else {
                  if (var11.aBoolean1525) {
                    GlobalStatics_9.SCENE_SHADOW[regionLevel][regionX][regionY
                        + 1] = 50;
                    GlobalStatics_9.SCENE_SHADOW[regionLevel][regionX + 1][
                        regionY + 1] = 50;
                  }

                  if (var11.aBoolean1542) {
                    DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][
                        1
                            + regionY] =
                        DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][
                            1
                                + regionY] | 2;
                  }
                }
              }

              if (var11.anInt1538 != 0 && var4 != null) {
                var4.method1486(var10, 2, 0, var11.aBoolean1486, regionY,
                    regionX);
              }

              if (var11.anInt1528 != 16) {
                GlobalStatics_9
                    .method1956(regionLevel, regionX, regionY, var11.anInt1528);
              }

            } else if (var6 == 1) {
              if (var11.anInt1531 == -1 && var11.anIntArray1524 == null
                  && !var11.aBoolean1510) {
                var28 =
                    var11.method1696(var10, var20, var18, 1, var19, var23, var1,
                        null, (byte) -83,
                        var26, var21);
                if (GlRenderer.USE_OPENGL && var26) {
                  assert var28 != null;
                  SomethingShadows
                      .method2051(var28.shadow, var20, var22, var21);
                }

                assert var28 != null;
                var27 = var28.node;
              } else {
                var27 = new GameObject(var5, 1, var10, var0, regionX, regionY,
                    var11.anInt1531,
                    var11.aBoolean1492, null);
              }

              DummyClass14
                  .method2146(regionLevel, regionX, regionY, var19, var27, null,
                      DummyClass59.anIntArray675[var10], 0, var24);
              if (var11.aBoolean1525 && var1) {
                if (var10 == 0) {
                  GlobalStatics_9.SCENE_SHADOW[regionLevel][regionX][regionY
                      + 1] = 50;
                } else {
                  if (var10 == 1) {
                    GlobalStatics_9.SCENE_SHADOW[regionLevel][regionX + 1][1
                        + regionY] = 50;
                  } else {
                    if (var10 == 2) {
                      GlobalStatics_9.SCENE_SHADOW[regionLevel][1
                          + regionX][regionY] = 50;
                    } else if (var10 == 3) {
                      GlobalStatics_9.SCENE_SHADOW[regionLevel][regionX][regionY] = 50;
                    }
                  }
                }
              }

              if (var11.anInt1538 != 0 && var4 != null) {
                var4.method1486(var10, 2, var6, var11.aBoolean1486, regionY,
                    regionX);
              }

            } else {
              int var43;
              if (var6 == 2) {
                var43 = 1 + var10 & 3;
                SceneNode var38;
                SceneNode var42;
                if (var11.anInt1531 == -1 && var11.anIntArray1524 == null
                    && !var11.aBoolean1510) {
                  SceneShadowMap var45 =
                      var11.method1696(var10 + 4, var20, var18, 2, var19, var23,
                          var1, null,
                          (byte) -108, var26, var21);
                  if (GlRenderer.USE_OPENGL && var26) {
                    assert var45 != null;
                    SomethingShadows
                        .method2051(var45.shadow, var20, var22, var21);
                  }

                  assert var45 != null;
                  var42 = var45.node;
                  var45 =
                      var11.method1696(var43, var20, var18, 2, var19, var23,
                          var1, null, (byte) -69,
                          var26, var21);
                  if (GlRenderer.USE_OPENGL && var26) {
                    assert var45 != null;
                    SomethingShadows
                        .method2051(var45.shadow, var20, var22, var21);
                  }

                  assert var45 != null;
                  var38 = var45.node;
                } else {
                  var42 = new GameObject(var5, 2, 4 + var10, var0, regionX,
                      regionY,
                      var11.anInt1531,
                      var11.aBoolean1492, null);
                  var38 = new GameObject(var5, 2, var43, var0, regionX, regionY,
                      var11.anInt1531,
                      var11.aBoolean1492, null);
                }

                DummyClass14
                    .method2146(regionLevel, regionX, regionY, var19, var42,
                        var38, DummyClass13.anIntArray2017[var10],
                        DummyClass13.anIntArray2017[var43], var24);
                if (var11.aBoolean1542 && var1) {
                  if (var10 == 0) {
                    DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][regionY] =
                        DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][regionY]
                            | 1;
                    DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][
                        1
                            + regionY] =
                        DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][
                            1 + regionY] | 2;
                  } else {
                    if (var10 == 1) {
                      DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][
                          regionY
                              + 1] =
                          DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][
                              regionY + 1] | 2;
                      DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX
                          + 1][regionY] =
                          DummyClass36.anIntArrayArrayArray2609[regionLevel][
                              regionX
                                  + 1][regionY] | 1;
                    } else {
                      if (var10 == 2) {
                        DummyClass36.anIntArrayArrayArray2609[regionLevel][1
                            + regionX][regionY] =
                            DummyClass36.anIntArrayArrayArray2609[regionLevel][1
                                + regionX][regionY] | 1;
                        DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][regionY] =
                            DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][regionY]
                                | 2;
                      } else if (var10 == 3) {
                        DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][regionY] =
                            DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][regionY]
                                | 2;
                        DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][regionY] =
                            DummyClass36.anIntArrayArrayArray2609[regionLevel][regionX][regionY]
                                | 1;
                      }
                    }
                  }
                }

                if (var11.anInt1538 != 0 && var4 != null) {
                  var4.method1486(var10, 2, var6, var11.aBoolean1486, regionY,
                      regionX);
                }

                if (var11.anInt1528 != 16) {
                  GlobalStatics_9.method1956(regionLevel, regionX, regionY,
                      var11.anInt1528);
                }

              } else if (var6 == 3) {
                if (var11.anInt1531 == -1 && var11.anIntArray1524 == null
                    && !var11.aBoolean1510) {
                  var28 =
                      var11.method1696(var10, var20, var18, 3, var19, var23,
                          var1, null, (byte) -54,
                          var26, var21);
                  if (GlRenderer.USE_OPENGL && var26) {
                    assert var28 != null;
                    SomethingShadows
                        .method2051(var28.shadow, var20, var22, var21);
                  }

                  assert var28 != null;
                  var27 = var28.node;
                } else {
                  var27 = new GameObject(var5, 3, var10, var0, regionX, regionY,
                      var11.anInt1531,
                      var11.aBoolean1492, null);
                }

                DummyClass14
                    .method2146(regionLevel, regionX, regionY, var19, var27,
                        null,
                        DummyClass59.anIntArray675[var10], 0, var24);
                if (var11.aBoolean1525 && var1) {
                  if (var10 == 0) {
                    GlobalStatics_9.SCENE_SHADOW[regionLevel][regionX][regionY
                        + 1] = 50;
                  } else {
                    if (var10 == 1) {
                      GlobalStatics_9.SCENE_SHADOW[regionLevel][1 + regionX][
                          regionY + 1] = 50;
                    } else if (var10 != 2) {
                      if (var10 == 3) {
                        GlobalStatics_9.SCENE_SHADOW[regionLevel][regionX][regionY] = 50;
                      }
                    } else {
                      GlobalStatics_9.SCENE_SHADOW[regionLevel][1
                          + regionX][regionY] = 50;
                    }
                  }
                }

                if (var11.anInt1538 != 0 && var4 != null) {
                  var4.method1486(var10, 2, 3, var11.aBoolean1486, regionY,
                      regionX);
                }

              } else if (var6 != 9) {
                if (var6 == 4) {
                  if (var11.anInt1531 == -1 && var11.anIntArray1524 == null
                      && !var11.aBoolean1510) {
                    var28 = var11
                        .method1696(var10, var20, var18, 4, var19, var23,
                            var1, null,
                            (byte) -103, var26, var21);
                    if (GlRenderer.USE_OPENGL && var26) {
                      assert var28 != null;
                      SomethingShadows
                          .method2051(var28.shadow, var20, var22, var21);
                    }

                    assert var28 != null;
                    var27 = var28.node;
                  } else {
                    var27 = new GameObject(var5, 4, var10, var0, regionX,
                        regionY,
                        var11.anInt1531,
                        var11.aBoolean1492, null);
                  }

                  GlobalStatics_6
                      .method577(regionLevel, regionX, regionY, var19, var27,
                          null,
                          DummyClass13.anIntArray2017[var10], 0, 0, 0, var24);
                } else {
                  SceneNode var39;
                  SceneShadowMap var47;
                  long var44;
                  if (var6 == 5) {
                    var43 = 16;
                    var44 = GlobalStatics_9
                        .method2174(regionLevel, regionX, regionY);
                    if (var44 != 0L) {
                      var43 = DummyClass11.method2207(4,
                          Integer.MAX_VALUE & (int) (var44 >>> 32)).anInt1528;
                    }

                    if (var11.anInt1531 == -1 && var11.anIntArray1524 == null
                        && !var11.aBoolean1510) {
                      var47 = var11
                          .method1696(var10, var20, var18, 4, var19, var23,
                              var1, null,
                              (byte) -125, var26, var21);
                      if (GlRenderer.USE_OPENGL && var26) {
                        assert var47 != null;
                        SomethingShadows.method2051(var47.shadow,
                            var20 - GlobalStatics_9.anIntArray356[var10]
                                * 8, var22,
                            -(GlobalStatics_6.anIntArray3491[var10] * 8)
                                + var21);
                      }

                      assert var47 != null;
                      var39 = var47.node;
                    } else {
                      var39 = new GameObject(var5, 4, var10, var0, regionX,
                          regionY,
                          var11.anInt1531,
                          var11.aBoolean1492, null);
                    }

                    GlobalStatics_6
                        .method577(regionLevel, regionX, regionY, var19, var39,
                            null,
                            DummyClass13.anIntArray2017[var10], 0,
                            var43 * GlobalStatics_9.anIntArray356[var10],
                            GlobalStatics_6.anIntArray3491[var10] * var43,
                            var24);
                  } else {
                    if (var6 == 6) {
                      var43 = 8;
                      var44 = GlobalStatics_9
                          .method2174(regionLevel, regionX, regionY);
                      if (var44 != 0L) {
                        var43 = DummyClass11.method2207(4,
                            Integer.MAX_VALUE & (int) (var44
                                >>> 32)).anInt1528 / 2;
                      }

                      if (var11.anInt1531 == -1
                          && var11.anIntArray1524 == null
                          && !var11.aBoolean1510) {
                        var47 =
                            var11
                                .method1696(var10 + 4, var20, var18, 4, var19,
                                    var23, var1, null,
                                    (byte) -65, var26, var21);
                        if (GlRenderer.USE_OPENGL && var26) {
                          assert var47 != null;
                          SomethingShadows.method2051(var47.shadow,
                              -(8
                                  * GlobalStatics_3.anIntArray2386[var10])
                                  + var20, var22,
                              -(8 * DummyClass4.anIntArray3007[var10])
                                  + var21);
                        }

                        assert var47 != null;
                        var39 = var47.node;
                      } else {
                        var39 =
                            new GameObject(var5, 4, 4 + var10, var0, regionX,
                                regionY, var11.anInt1531,
                                var11.aBoolean1492, null);
                      }

                      GlobalStatics_6
                          .method577(regionLevel, regionX, regionY, var19,
                              var39, null,
                              256, var10, var43
                                  * GlobalStatics_3.anIntArray2386[var10],
                              var43 * DummyClass4.anIntArray3007[var10], var24);
                    } else {
                      if (var6 == 7) {
                        int var40 = 3 & var10 + 2;
                        if (var11.anInt1531 == -1
                            && var11.anIntArray1524 == null
                            && !var11.aBoolean1510) {
                          SceneShadowMap var41 =
                              var11.method1696(var40 + 4, var20, var18, 4,
                                  var19, var23, var1,
                                  null, (byte) -39, var26, var21);
                          if (GlRenderer.USE_OPENGL && var26) {
                            assert var41 != null;
                            SomethingShadows
                                .method2051(var41.shadow, var20, var22,
                                    var21);
                          }

                          assert var41 != null;
                          var27 = var41.node;
                        } else {
                          var27 =
                              new GameObject(var5, 4, var40 + 4, var0, regionX,
                                  regionY, var11.anInt1531,
                                  var11.aBoolean1492, null);
                        }

                        GlobalStatics_6
                            .method577(regionLevel, regionX, regionY, var19,
                                var27, null,
                                256, var40, 0, 0, var24);
                      } else {
                        if (var6 == 8) {
                          var43 = 8;
                          var44 = GlobalStatics_9
                              .method2174(regionLevel, regionX, regionY);
                          if (var44 != 0L) {
                            var43 = DummyClass11.method2207(4,
                                Integer.MAX_VALUE & (int) (var44
                                    >>> 32)).anInt1528 / 2;
                          }

                          int var32 = var10 + 2 & 3;
                          SceneNode var46;
                          if (var11.anInt1531 == -1
                              && var11.anIntArray1524 == null
                              && !var11.aBoolean1510) {
                            int var34 = 8 * DummyClass4.anIntArray3007[var10];
                            int var33 =
                                GlobalStatics_3.anIntArray2386[var10]
                                    * 8;
                            SceneShadowMap var35 =
                                var11.method1696(4 + var10, var20, var18, 4,
                                    var19, var23, var1,
                                    null, (byte) -25, var26, var21);
                            if (GlRenderer.USE_OPENGL && var26) {
                              assert var35 != null;
                              SomethingShadows
                                  .method2051(var35.shadow, var20 - var33,
                                      var22,
                                      -var34 + var21);
                            }

                            assert var35 != null;
                            var39 = var35.node;
                            var35 =
                                var11.method1696(var32 + 4, var20, var18, 4,
                                    var19, var23, var1,
                                    null, (byte) -101, var26, var21);
                            if (GlRenderer.USE_OPENGL && var26) {
                              assert var35 != null;
                              SomethingShadows
                                  .method2051(var35.shadow, var20 - var33,
                                      var22,
                                      -var34 + var21);
                            }

                            assert var35 != null;
                            var46 = var35.node;
                          } else {
                            var39 = new GameObject(var5, 4, 4 + var10, var0,
                                regionX, regionY,
                                var11.anInt1531, var11.aBoolean1492, null);
                            var46 = new GameObject(var5, 4, var32 + 4, var0,
                                regionX, regionY,
                                var11.anInt1531, var11.aBoolean1492, null);
                          }

                          GlobalStatics_6
                              .method577(regionLevel, regionX, regionY, var19,
                                  var39,
                                  var46, 256, var10,
                                  var43
                                      * GlobalStatics_3.anIntArray2386[var10],
                                  DummyClass4.anIntArray3007[var10] * var43,
                                  var24);
                        }
                      }
                    }
                  }
                }
              } else {
                if (var11.anInt1531 == -1 && var11.anIntArray1524 == null
                    && !var11.aBoolean1510) {
                  var28 = var11
                      .method1696(var10, var20, var18, var6, var19, var23, var1,
                          null,
                          (byte) -30, var26, var21);
                  if (GlRenderer.USE_OPENGL && var26) {
                    assert var28 != null;
                    SomethingShadows
                        .method2051(var28.shadow, var20, var22, var21);
                  }

                  assert var28 != null;
                  var27 = var28.node;
                } else {
                  var27 = new GameObject(var5, var6, var10, var0, regionX,
                      regionY,
                      var11.anInt1531,
                      var11.aBoolean1492, null);
                }

                GlobalStatics_7
                    .method835(regionLevel, regionX, regionY, var19, 1, 1,
                        var27, 0,
                        var24);
                if (var11.anInt1538 != 0 && var4 != null) {
                  var4.method1489(regionX, var11.aBoolean1486, (byte) 127,
                      regionY,
                      var12, var13);
                }

                if (var11.anInt1528 != 16) {
                  GlobalStatics_9.method1956(regionLevel, regionX, regionY,
                      var11.anInt1528);
                }

              }
            }
          } else {
            if (var11.anInt1531 == -1 && var11.anIntArray1524 == null
                && !var11.aBoolean1510) {
              var28 =
                  var11.method1696(var6 == 11 ? 4 + var10 : var10, var20, var18,
                      10, var19, var23,
                      var1, null, (byte) -26, var26, var21);
              if (GlRenderer.USE_OPENGL && var26) {
                assert var28 != null;
                SomethingShadows.method2051(var28.shadow, var20, var22, var21);
              }

              assert var28 != null;
              var27 = var28.node;
            } else {
              var27 = new GameObject(var5, 10, var6 == 11 ? 4 + var10 : var10,
                  var0, regionX, regionY,
                  var11.anInt1531, var11.aBoolean1492, null);
            }

            if (var27 != null) {
              boolean var37 = GlobalStatics_7
                  .method835(regionLevel, regionX, regionY, var19, var12, var13,
                      var27, 0, var24);
              if (var11.aBoolean1525 && var37 && var1) {
                int var29 = 15;
                if (var27 instanceof AbstractModel) {
                  var29 = ((AbstractModel) var27).method1888() / 4;
                  if (var29 > 30) {
                    var29 = 30;
                  }
                }

                for (int var30 = 0; var30 <= var12; ++var30) {
                  for (int var31 = 0; var13 >= var31; ++var31) {
                    if (GlobalStatics_9.SCENE_SHADOW[regionLevel][regionX
                        + var30][var31 + regionY] < var29) {
                      GlobalStatics_9.SCENE_SHADOW[regionLevel][regionX
                          + var30][regionY + var31] =
                          (byte) var29;
                    }
                  }
                }
              }
            }

            if (var11.anInt1538 != 0 && var4 != null) {
              var4.method1489(regionX, var11.aBoolean1486, (byte) 96, regionY,
                  var12,
                  var13);
            }

          }
        } else if (GlobalStatics_9.aBoolean1905 || var11.anInt1529 != 0 ||
            var11.anInt1538 == 1
            || var11.aBoolean1483) {
          if (var11.anInt1531 == -1 && var11.anIntArray1524 == null
              && !var11.aBoolean1510) {
            var28 =
                var11.method1696(var10, var20, var18, 22, var19, var23, var1,
                    null, (byte) -126,
                    var26, var21);
            if (GlRenderer.USE_OPENGL && var26) {
              assert var28 != null;
              SomethingShadows.method2051(var28.shadow, var20, var22, var21);
            }

            assert var28 != null;
            var27 = var28.node;
          } else {
            var27 = new GameObject(var5, 22, var10, var0, regionX, regionY,
                var11.anInt1531,
                var11.aBoolean1492, null);
          }

          GlobalStatics_10
              .method276(regionLevel, regionX, regionY, var19, var27, var24,
                  var11.aBoolean1502);
          if (var11.anInt1538 == 1 && var4 != null) {
            var4.method1503(regionX, regionY);
          }

        }
      }
    }
  }

}
