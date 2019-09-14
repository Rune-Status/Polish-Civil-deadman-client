package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlRenderer;

public final class DummyClass29 {

  public static GameString aClass94_434 = GameStringStatics.create("Shift)2click ENABLED(Q");
  public static short[][] aShortArrayArray435 = {
    {
      (short) 6554, (short) 115, (short) 10304, (short) 28, (short) 5702, (short) 7756,
      (short) 5681, (short) 4510, (short) -31835, (short) 22437, (short) 2859, (short) -11339,
      (short) 16, (short) 5157, (short) 10446, (short) 3658, (short) -27314, (short) -21965,
      (short) 472, (short) 580, (short) 784, (short) 21966, (short) 28950, (short) -15697,
      (short) -14002
    }, {
    (short) 9104, (short) 10275, (short) 7595, (short) 3610, (short) 7975, (short) 8526,
    (short) 918, (short) -26734, (short) 24466, (short) 10145, (short) -6882, (short) 5027,
    (short) 1457, (short) 16565, (short) -30545, (short) 25486, (short) 24, (short) 5392,
    (short) 10429, (short) 3673, (short) -27335, (short) -21957, (short) 192, (short) 687,
    (short) 412, (short) 21821, (short) 28835, (short) -15460, (short) -14019
  }, new short[0], new short[0], new short[0]
  };
  public static GameString aClass94_436 = GameStringStatics.create("com.jagex.runescape.Cache:");
  public static int anInt437;
  public static boolean aBoolean438;
  public static Widget aClass11_439;


  public static boolean addNodeToSceneGraph(int var0, int var1, int var2, int var3, int var4,
                                           SceneNode var5, int var6, long var7, boolean var9) {
    if (var5 == null) {
      return true;
    } else {
      int var10 = var1 - var4;
      int var11 = var2 - var4;
      int var12 = var1 + var4;
      int var13 = var2 + var4;
      if (var9) {
        if (var6 > 640 && var6 < 1408) {
          var13 += 128;
        }

        if (var6 > 1152 && var6 < 1920) {
          var12 += 128;
        }

        if (var6 > 1664 || var6 < 384) {
          var11 -= 128;
        }

        if (var6 > 128 && var6 < 896) {
          var10 -= 128;
        }
      }

      var10 /= 128;
      var11 /= 128;
      var12 /= 128;
      var13 /= 128;
      return DummyClass42.addNodeToSceneGraph(var0, var10, var11, var12 - var10 + 1,
        var13 - var11 + 1, var1, var2, var3, var5, var6, true, var7);
    }
  }

  public static void method908(int var0) {
    DummyClass29.aClass11_439 = null;
      if (var0 != 5157) {
        DummyClass29.aClass94_434 = null;
      }

      DummyClass29.aClass94_436 = null;
      DummyClass29.aClass94_434 = null;
      DummyClass29.aShortArrayArray435 = null;
  }

  public static void method909(int var0, Widget var1) {
    if ((SomethingOtherWorldMap.anInt2535 == var1.anInt204)) {
        GroundItemNode.aBooleanArray3674[var1.anInt292] = true;
      }

      int var2 = -100 / ((var0 - 55) / 52);
  }

  public static void method910(int var0, int var1, int var2, int var3, int var4, int var5,
                              CollisionMap var6) {
    boolean var9 = true;
      long var7 = 0L;
      if (var4 == 0) {
        var7 = SomethingAudio.method2174(var3, var2, var1);
      } else if (var4 != 1) {
        if ((var4 == 2)) {
          var7 = AnimationSomething.method557(var3, var2, var1);
        } else if (var4 == 3) {
          var7 = GLStatics.method104(var3, var2, var1);
        }
      } else {
        var7 = HashTableIterator.method1395(var3, var2, var1);
      }

      boolean var10 = false;
      int var19 = (519128 & (int) var7) >> 14;
      if (var0 < -94) {
        boolean var11 = false;
        int var17 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        GameObjectConfig var12 = DummyClass11.method2207(4, var17);
        if (var12.method1690(28933)) {
          Projectile.method2020(var2, var12, (byte) -73, var1, var3);
        }

        int var18 = ((int) var7 & 4109484) >> 20;
        if ((var7 != 0L)) {
          SceneNode var13 = null;
          SceneNode var14 = null;
          if (var4 == 0) {
            SceneSomething2 var15 = Deque.method1209(var3, var2, var1);
            if (var15 != null) {
              var13 = var15.sceneNode0;
              var14 = var15.sceneNode1;
            }

            if ((var12.anInt1538 != 0)) {
              var6.method1485(var18, var12.aBoolean1486, -104, var1, var19, var2);
            }
          } else if (var4 != 1) {
            if (var4 == 2) {
              SceneSomething var20 = DummyClass7.method2217(var3, var2, var1);
              if (var20 != null) {
                var13 = var20.sceneNode;
              }

              if (var12.anInt1538 != 0 && var12.anInt1480 + var2 < 104 &&
                  ((var12.anInt1480
                      + var1) < 104) && var2 + var12.anInt1485 < 104
                  && ((var1 + var12.anInt1485) < 104)) {
                var6.method1502(20851, var2, var12.anInt1480, var12.aBoolean1486, var18,
                  var12.anInt1485, var1);
              }
            } else if ((var4 == 3)) {
              SomethingSceneJ var22 = DummyClass13.method2193(var3, var2, var1);
              if (var22 != null) {
                var13 = var22.aClass140_320;
              }

              if (var12.anInt1538 == 1) {
                var6.method1499(var1, (byte) -73, var2);
              }
            }
          } else {
            SomethingSceneI var21 = DummyClass37.method1037(var3, var2, var1);
            if (var21 != null) {
              var13 = var21.aClass140_429;
              var14 = var21.aClass140_423;
            }
          }

          if (GlRenderer.useOpenGlRenderer && var12.aBoolean1503) {
            if (var19 == 2) {
              if (var13 instanceof GameObject) {
                ((GameObject) var13).method1960(-1);
              } else {
                FileSystem
                    .method840(var12, (byte) -76, 0, var18 + 4, 0, var19, var2,
                        var1, var5);
              }

              if (var14 instanceof GameObject) {
                ((GameObject) var14).method1960(-1);
              } else {
                FileSystem
                    .method840(var12, (byte) -100, 0, 3 & var18 + 1, 0, var19,
                        var2, var1,
                        var5);
              }
            } else {
              if (var19 != 5) {
                if ((var19 == 6)) {
                  if (var13 instanceof GameObject) {
                    ((GameObject) var13).method1960(-1);
                  } else {
                    FileSystem.method840(var12, (byte) -28,
                        8 * DummyClass4.anIntArray3007[var18],
                        4 + var18,
                        8 * AbstractTextureSampler.anIntArray2386[var18], 4,
                        var2, var1,
                        var5);
                  }
                } else if ((var19 == 7)) {
                  if (var13 instanceof GameObject) {
                    ((GameObject) var13).method1960(-1);
                  } else {
                    FileSystem
                        .method840(var12, (byte) -120, 0, 4 + (3 & 2 + var18),
                            0, 4, var2,
                            var1, var5);
                  }
                } else if (var19 == 8) {
                  if (var13 instanceof GameObject) {
                    ((GameObject) var13).method1960(-1);
                  } else {
                    FileSystem.method840(var12, (byte) -45,
                        DummyClass4.anIntArray3007[var18] * 8,
                        var18 + 4,
                        8 * AbstractTextureSampler.anIntArray2386[var18], 4,
                        var2, var1,
                        var5);
                  }

                  if (var14 instanceof GameObject) {
                    ((GameObject) var14).method1960(-1);
                  } else {
                    FileSystem.method840(var12, (byte) -24,
                        DummyClass4.anIntArray3007[var18] * 8,
                        4 + (3 & 2 + var18),
                        AbstractTextureSampler.anIntArray2386[var18] * 8, 4,
                        var2, var1, var5);
                  }
                } else if (var19 != 11) {
                  if (var13 instanceof GameObject) {
                    ((GameObject) var13).method1960(-1);
                  } else {
                    FileSystem
                        .method840(var12, (byte) -113, 0, var18, 0, var19, var2,
                            var1, var5);
                  }
                } else if (var13 instanceof GameObject) {
                  ((GameObject) var13).method1960(-1);
                } else {
                  FileSystem
                      .method840(var12, (byte) -115, 0, 4 + var18, 0, 10, var2,
                          var1, var5);
                }
              } else if (var13 instanceof GameObject) {
                ((GameObject) var13).method1960(-1);
              } else {
                FileSystem.method840(var12, (byte) -119,
                    AudioStreamEncoder3.anIntArray3491[var18] * 8, var18,
                    RenderAnimation.anIntArray356[var18] * 8, 4, var2, var1,
                    var5);
              }
            }
          }
        }

      }
  }

}
