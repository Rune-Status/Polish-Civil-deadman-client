package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.buffer.BufferStatics;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.math.MathUtilities;
import com.jagex.runescape.model.AbstractDirectColorSprite;
import com.jagex.runescape.model.AbstractFont;
import com.jagex.runescape.model.AbstractModel;
import com.jagex.runescape.model.AnimationSequence;
import com.jagex.runescape.model.AnimationSomething;
import com.jagex.runescape.model.BlockConfig;
import com.jagex.runescape.model.ClientScriptCall;
import com.jagex.runescape.cache.FileUnpacker;
import com.jagex.runescape.model.GameCanvas;
import com.jagex.runescape.model.HashTableIterator;
import com.jagex.runescape.model.HintMarker;
import com.jagex.runescape.model.Inventory;
import com.jagex.runescape.model.Mobile;
import com.jagex.runescape.model.Model;
import com.jagex.runescape.model.Mouse;
import com.jagex.runescape.model.NPC;
import com.jagex.runescape.model.NpcConfiguration;
import com.jagex.runescape.model.Player;
import com.jagex.runescape.scene.SceneGraphTile;
import com.jagex.runescape.model.SceneShadowMap;
import com.jagex.runescape.model.SignLink;
import com.jagex.runescape.model.SoftwareModel;
import com.jagex.runescape.model.SomethingPacket151;
import com.jagex.runescape.scene.SomethingScene;
import com.jagex.runescape.model.Widget;
import com.jagex.runescape.model.WidgetAccess;
import com.jagex.runescape.model.WidgetUpdate;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlEnvironment;
import com.jagex.runescape.opengl.GlModel;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.sound.FilterPossiblyStatics;
import com.jagex.runescape.sound.SomethingSoundEffectStatics;
import com.jagex.runescape.sprite.SoftwareIndexedColorSpriteStatics;
import java.util.Random;

public class GlobalStatics_8 {

  public static GameString aClass94_948 =
      GameStringStatics
          .create("You can(Wt add yourself to your own friend list)3");
  public static GameString aClass94_957 = GlobalStatics_8.aClass94_948;
  public static int anInt942;
  public static int anInt944;
  public static GameString aClass94_946 = GameStringStatics.create(")2");
  public static int drawMemoryCounter;
  public static GameString aClass94_951 = GameStringStatics
      .create("Interfaces charg-Bes");
  public static int anInt952;
  public static int anInt963;
  public static int anInt1944;
  public static FileUnpacker fileUnpacker13;
  public static int SUN_COLOR;
  public static boolean aBoolean1951;
  public static int updateMemoryCounter;
  public static int anInt2088;
  public static GameString aClass94_2089 = GameStringStatics.create("compass");
  public static Widget aClass11_2091;
  public static AbstractFont aClass3_Sub28_Sub17_2096;
  public static FileUnpacker fileUnpacker16;
  public static int anInt2099;
  public static int anInt2104;
  public static GameString aClass94_1415 = GameStringStatics
      .create("Loaded input handler");
  public static GameString aClass94_1409 = GlobalStatics_8.aClass94_1415;
  public static int anInt1405;
  public static int anInt1407;
  public static FileUnpacker fileUnpacker19;
  public static SceneShadowMap aClass136_1413 = new SceneShadowMap();
  public static int anInt1416;
  public static GameString[] titlePrefixes;
  public static int[] anIntArray3804 = new int[256];
  public static int[] anIntArray3805;
  public static GameString MAP_PREFIX = GameStringStatics.create("m");
  public static GameCanvas GAME_CANVAS;
  public static GameString aClass94_34 = GameStringStatics
      .create("flash2:");
  public static GameString aClass94_36 = GlobalStatics_8.aClass94_34;
  public static GameString aClass94_32 = GlobalStatics_8.aClass94_34;
  public static int anInt27;
  public static GameString aClass94_28 =
      GameStringStatics
          .create("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");
  public static boolean aBoolean29;
  public static int anInt30;
  public static int CURRENT_CAMERA_ZOOM;
  public static GameString aClass94_35 = GameStringStatics.create("Annuler");
  public static GameString aClass94_2198 = GameStringStatics.create("cyan:");
  public static boolean aBoolean2201;
  public static int[] anIntArray2113 = {2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0,
      0, 0, 0};
  public static HintMarker[] aClass96Array2114 = new HintMarker[4];
  public static int anInt2115 = -1;
  public static GameString aClass94_2116 = GameStringStatics
      .create("Hidden)2use");
  public static GameString[] DEFAULT_INVENTORY_OPTIONS;
  public static int anInt2120;
  public static String serverHost;
  public static GameString aClass94_2731 = GameStringStatics.create("wave:");
  public static GameString aClass94_2751 = GlobalStatics_8.aClass94_2731;
  public static GameString aClass94_2740 = GlobalStatics_8.aClass94_2731;
  public static GameString aClass94_2739 = GameStringStatics.create("Drop");
  public static GameString OPTION_DROP = GlobalStatics_8.aClass94_2739;
  public static GameString aClass94_2723 = GameStringStatics
      .create("<col=c0ff00>");
  public static FileUnpacker widgets;
  public static GameString aClass94_2735 = GameStringStatics.create(")4");
  public static int anInt2737;
  public static volatile int anInt2743;
  public static int plane;
  public static boolean[] PRESSED_KEYS = new boolean[112];
  public static int[][][] anIntArrayArrayArray1497 = new int[4][13][13];
  public static GameString aClass94_1508 = GameStringStatics
      .create("Choisir une option");
  public static GameString aClass94_1509 = GameStringStatics
      .create("Chargement des textures )2 ");
  public static int portOffset = 1;
  public static int anInt1521;
  public static GameString aClass94_1523 =
      GameStringStatics.create("Chargement en cours)3 Veuillez patienter)3");
  public static GameString aClass94_5 =
      GameStringStatics.create(" from your ignore list first)3");
  public static GameString aClass94_4 = GlobalStatics_8.aClass94_5;
  public static int anInt12;
  public static boolean aBoolean13;
  public static int anInt2;
  public static int anInt3;
  public static boolean aBoolean6;
  public static GameString aClass94_7 = GameStringStatics
      .create(" s(West d-Bconnect-B)3");
  public static GameString aClass94_8 = GameStringStatics.create("");
  public static GameString aClass94_9 = GameStringStatics.create(")3)3)3");
  public static GameString COMMAND_RECTANGLE_DEBUG = GameStringStatics
      .create("::rect_debug");
  public static boolean BIND_CANVAS;
  public static int[] anIntArray3290;
  public static GameString aClass94_3291 = GameStringStatics
      .create("Schlie-8en");
  public static NPC[] NPCS = new NPC[0x8000];
  public static int anInt3293;
  public static GameString aClass94_3295;
  public static long aLong3296;
  public static GameString aClass94_3298 = GameStringStatics
      .create("<col=ff0000>");
  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_824;
  public static long[] aLongArray826 = new long[200];
  public static int anInt820;
  public static int anInt828;

  public static void clear92(int var0) {
    GlobalStatics_8.aClass94_951 = null;
    GlobalStatics_8.aClass94_946 = null;
    if (var0 == 0) {
      GlobalStatics_8.aClass94_948 = null;
      GlobalStatics_8.aClass94_957 = null;
    }
  }

  public static void method1224(Widget var0, int var1, int var2, int var3) {
    if (var0.aByte162 == 0) {
      var0.anInt210 = var0.anInt166;
    } else {
      if (var0.aByte162 == 1) {
        var0.anInt210 = (var2 - var0.zoom) / 2 + var0.anInt166;
      } else {
        if (var0.aByte162 == 2) {
          var0.anInt210 = var2 - var0.zoom - var0.anInt166;
        } else if (var0.aByte162 != 3) {
          if (var0.aByte162 == 4) {
            var0.anInt210 =
                (var2 * var0.anInt166 >> 14) + (-var0.zoom + var2) / 2;
          } else {
            var0.anInt210 =
                -(var2 * var0.anInt166 >> 14) - var0.zoom + var2;
          }
        } else {
          var0.anInt210 = var0.anInt166 * var2 >> 14;
        }
      }
    }

    if (var0.aByte273 == 0) {
      var0.anInt306 = var0.anInt316;
    } else if (var0.aByte273 != 1) {
      if (var0.aByte273 == 2) {
        var0.anInt306 = -var0.anInt316 - var0.anInt168 + var3;
      } else if (var0.aByte273 != 3) {
        if (var0.aByte273 == 4) {
          var0.anInt306 =
              (var0.anInt316 * var3 >> 14) + (var3 - var0.anInt168) / 2;
        } else {
          var0.anInt306 =
              -(var3 * var0.anInt316 >> 14) + var3 - var0.anInt168;
        }
      } else {
        var0.anInt306 = var0.anInt316 * var3 >> 14;
      }
    } else {
      var0.anInt306 = var0.anInt316 + (var3 - var0.anInt168) / 2;
    }

    if (GlobalStatics_9.aBoolean1040 && (
        GlobalStatics_8.method44(var0).anInt2205 != 0
            || var0.anInt187 == 0)) {
      if (var0.anInt210 < 0) {
        var0.anInt210 = 0;
      } else if (var0.zoom + var0.anInt210 > var2) {
        var0.anInt210 = var2 - var0.zoom;
      }

      if (var0.anInt306 < 0) {
        var0.anInt306 = 0;
      } else if (var3 < var0.anInt306 + var0.anInt168) {
        var0.anInt306 = var3 - var0.anInt168;
      }
    }

    if (var1 != 23730) {
      GlobalStatics_8.clear92(19);
    }
  }

  public static void method1225(int var0) {
    Mouse var1 = GlobalStatics_9.INSTANCE;
    synchronized (var1) {
      if (var0 != 18074) {
        GlobalStatics_8.aClass94_946 = null;
      }

      GlobalStatics_10.anInt3069 = GlobalStatics_9.anInt549;
      GlobalStatics_9.anInt1676 = GlobalStatics_9.lastMouseX;
      GlobalStatics_0.anInt1709 = DummyClass53.lastMouseY;
      GlobalStatics_9.anInt3644 = GlobalStatics_8.anInt2743;
      DummyClass5.anInt2993 = GlobalStatics_9.anInt362;
      ++GlobalStatics_9.anInt4045;
      DummyClass36.anInt2614 = GlobalStatics_10.anInt3389;
      GlobalStatics_3.aLong1102 = GlobalStatics_9.lastMousePressedTime;
      GlobalStatics_8.anInt2743 = 0;
    }
  }

  public static void clear17(int var0) {
    if (var0 != 100) {
      GlobalStatics_8.method2143(-91, 7, -83, 24);
    }

    GlobalStatics_8.fileUnpacker13 = null;
  }

  public static void method2143(int var1, int var2, int var3,
      int var4) {
    WidgetUpdate var5 = GlobalStatics_6.method466(4, 8, var2);
    var5.g((byte) 33);
    var5.anInt3596 = var1;

    var5.anInt3598 = var4;
    var5.anInt3597 = var3;
  }

  public static void method1623() {
    FilterPossiblyStatics.aFloatArrayArray1431 = null;
    SomethingSoundEffectStatics.anIntArrayArray1435 = null;
  }

  public static void method2270(Mobile var0, byte var1) {
    if (GlobalStatics_4.updateCycle == var0.anInt2790 || var0.animationId
        == -1
        || var0.anInt2828 != 0 || 1 + var0.anInt2760 > GlobalStatics_8
        .method45(
            var0.animationId,
            (byte) -20).anIntArray1869[var0.anInt2832]) {
      int var2 = var0.anInt2790 - var0.anInt2800;
      int var3 = GlobalStatics_4.updateCycle - var0.anInt2800;
      int var4 = var0.anInt2784 * 128 + 64 * var0.getSize();
      int var5 = var0.anInt2835 * 128 + var0.getSize() * 64;
      int var6 = 128 * var0.anInt2823 + var0.getSize() * 64;
      int var7 = 128 * var0.anInt2798 + var0.getSize() * 64;
      var0.sceneX = (var3 * var6 + var4 * (var2 - var3)) / var2;
      var0.sceneY = (var7 * var3 + var5 * (var2 - var3)) / var2;
    }

    if (var1 <= -51) {
      var0.anInt2824 = 0;
      if (var0.anInt2840 == 0) {
        var0.anInt2806 = 1024;
      }

      if (var0.anInt2840 == 1) {
        var0.anInt2806 = 1536;
      }

      if (var0.anInt2840 == 2) {
        var0.anInt2806 = 0;
      }

      if (var0.anInt2840 == 3) {
        var0.anInt2806 = 512;
      }

      var0.rotationY = var0.anInt2806;
    }
  }

  public static void method2271(int var0, int var1, int var2, int var3) {
    if (var2 != 1) {
      GlobalStatics_8.method2273(null, 43);
    }

    WidgetUpdate var4 = GlobalStatics_6.method466(var2 ^ 5, 11, var1);
    var4.g((byte) 33);
    var4.anInt3597 = var3;
    var4.anInt3598 = var0;
  }

  public static void method2272(int[] var0, int var1, int var2, int var3,
      int var4, int var5,
      int var6, int var7, int var8, boolean var9, byte var10) {
    int var11 = var2;
    if (SoftwareIndexedColorSpriteStatics.anInt1096 > var2) {
      if (var2 < SoftwareIndexedColorSpriteStatics.anInt1093) {
        var11 = SoftwareIndexedColorSpriteStatics.anInt1093;
      }

      int var12 = var7 + var2;
      if (SoftwareIndexedColorSpriteStatics.anInt1093 < var12) {
        if (SoftwareIndexedColorSpriteStatics.anInt1096 < var12) {
          var12 = SoftwareIndexedColorSpriteStatics.anInt1096;
        }

        int var13 = var8;
        if (SoftwareIndexedColorSpriteStatics.anInt1099 > var8) {
          int var14 = var8 + var6;
          if (var8 < SoftwareIndexedColorSpriteStatics.anInt1095) {
            var13 = SoftwareIndexedColorSpriteStatics.anInt1095;
          }

          if (var14 > SoftwareIndexedColorSpriteStatics.anInt1095) {
            if (var10 == 21) {
              int var15 =
                  var11 + SoftwareIndexedColorSpriteStatics.anInt1092 * var13;
              if (var5 == 9) {
                var3 = 3 & var3 + 1;
                var5 = 1;
              }

              int var16 =
                  -var12 + var11 + SoftwareIndexedColorSpriteStatics.anInt1092;
              var13 -= var8;
              int var20 = var6 - var13;
              if (SoftwareIndexedColorSpriteStatics.anInt1099 < var14) {
                var14 = SoftwareIndexedColorSpriteStatics.anInt1099;
              }

              if (var5 == 10) {
                var3 = var3 + 3 & 3;
                var5 = 1;
              }

              var11 -= var2;
              int var18 = -var11 + var7;
              if (var5 == 11) {
                var3 = 3 & var3 + 3;
                var5 = 8;
              }

              var12 -= var2;
              int var17 = var7 - var12;
              var14 -= var8;
              int var19 = var6 - var14;
              int var21;
              int var22;
              if (var5 != 1) {
                if (var5 == 2) {
                  if (var3 == 0) {
                    for (var21 = var20 - 1; var19 <= var21; --var21) {
                      for (var22 = var11; var22 < var12; ++var22) {
                        if (var21 >> 1 >= var22) {
                          var0[var15] = var1;
                        } else if (var9) {
                          var0[var15] = var4;
                        }

                        ++var15;
                      }

                      var15 += var16;
                    }

                  } else {
                    if (var3 == 1) {
                      for (var21 = var13; var21 < var14; ++var21) {
                        for (var22 = var11; var12 > var22; ++var22) {
                          if (var15 >= 0 && var15 < var0.length) {
                            if (var21 << 1 <= var22) {
                              var0[var15] = var1;
                            } else if (var9) {
                              var0[var15] = var4;
                            }

                            ++var15;
                          } else {
                            ++var15;
                          }
                        }

                        var15 += var16;
                      }

                    } else if (var3 != 2) {
                      if (var3 == 3) {
                        for (var21 = var20 - 1; var19 <= var21; --var21) {
                          for (var22 = -1 + var18; var17 <= var22; --var22) {
                            if (var21 << 1 > var22) {
                              if (var9) {
                                var0[var15] = var4;
                              }
                            } else {
                              var0[var15] = var1;
                            }

                            ++var15;
                          }

                          var15 += var16;
                        }

                      }
                    } else {
                      for (var21 = var13; var14 > var21; ++var21) {
                        for (var22 = var18 - 1; var17 <= var22; --var22) {
                          if (var21 >> 1 >= var22) {
                            var0[var15] = var1;
                          } else if (var9) {
                            var0[var15] = var4;
                          }

                          ++var15;
                        }

                        var15 += var16;
                      }

                    }
                  }
                } else if (var5 != 3) {
                  if (var5 != 4) {
                    if (var5 != 5) {
                      if (var5 == 6) {
                        if (var3 == 0) {
                          for (var21 = var13; var14 > var21; ++var21) {
                            for (var22 = var11; var12 > var22; ++var22) {
                              if (var22 > var7 / 2) {
                                if (var9) {
                                  var0[var15] = var4;
                                }
                              } else {
                                var0[var15] = var1;
                              }

                              ++var15;
                            }

                            var15 += var16;
                          }

                          return;
                        }

                        if (var3 == 1) {
                          for (var21 = var13; var21 < var14; ++var21) {
                            for (var22 = var11; var12 > var22; ++var22) {
                              if (var21 > var6 / 2) {
                                if (var9) {
                                  var0[var15] = var4;
                                }
                              } else {
                                var0[var15] = var1;
                              }

                              ++var15;
                            }

                            var15 += var16;
                          }

                          return;
                        }

                        if (var3 == 2) {
                          for (var21 = var13; var21 < var14; ++var21) {
                            for (var22 = var11; var12 > var22; ++var22) {
                              if (var22 >= var7 / 2) {
                                var0[var15] = var1;
                              } else if (var9) {
                                var0[var15] = var4;
                              }

                              ++var15;
                            }

                            var15 += var16;
                          }

                          return;
                        }

                        if (var3 == 3) {
                          for (var21 = var13; var21 < var14; ++var21) {
                            for (var22 = var11; var22 < var12; ++var22) {
                              if (var21 < var6 / 2) {
                                if (var9) {
                                  var0[var15] = var4;
                                }
                              } else {
                                var0[var15] = var1;
                              }

                              ++var15;
                            }

                            var15 += var16;
                          }

                          return;
                        }
                      }

                      if (var5 == 7) {
                        if (var3 == 0) {
                          for (var21 = var13; var14 > var21; ++var21) {
                            for (var22 = var11; var12 > var22; ++var22) {
                              if (var22 <= var21 - var6 / 2) {
                                var0[var15] = var1;
                              } else if (var9) {
                                var0[var15] = var4;
                              }

                              ++var15;
                            }

                            var15 += var16;
                          }

                          return;
                        }

                        if (var3 == 1) {
                          for (var21 = var20 - 1; var21 >= var19; --var21) {
                            for (var22 = var11; var12 > var22; ++var22) {
                              if (-(var6 / 2) + var21 < var22) {
                                if (var9) {
                                  var0[var15] = var4;
                                }
                              } else {
                                var0[var15] = var1;
                              }

                              ++var15;
                            }

                            var15 += var16;
                          }

                          return;
                        }

                        if (var3 == 2) {
                          for (var21 = var20 - 1; var19 <= var21; --var21) {
                            for (var22 = -1 + var18; var17 <= var22;
                                --var22) {
                              if (var22 > var21 - var6 / 2) {
                                if (var9) {
                                  var0[var15] = var4;
                                }
                              } else {
                                var0[var15] = var1;
                              }

                              ++var15;
                            }

                            var15 += var16;
                          }

                          return;
                        }

                        if (var3 == 3) {
                          for (var21 = var13; var21 < var14; ++var21) {
                            for (var22 = -1 + var18; var22 >= var17;
                                --var22) {
                              if (var21 - var6 / 2 >= var22) {
                                var0[var15] = var1;
                              } else if (var9) {
                                var0[var15] = var4;
                              }

                              ++var15;
                            }

                            var15 += var16;
                          }

                          return;
                        }
                      }

                      if (var5 == 8) {
                        if (var3 == 0) {
                          for (var21 = var13; var14 > var21; ++var21) {
                            for (var22 = var11; var12 > var22; ++var22) {
                              if (-(var6 / 2) + var21 <= var22) {
                                var0[var15] = var1;
                              } else if (var9) {
                                var0[var15] = var4;
                              }

                              ++var15;
                            }

                            var15 += var16;
                          }

                          return;
                        }

                        if (var3 == 1) {
                          for (var21 = -1 + var20; var21 >= var19; --var21) {
                            for (var22 = var11; var12 > var22; ++var22) {
                              if (-(var6 / 2) + var21 > var22) {
                                if (var9) {
                                  var0[var15] = var4;
                                }
                              } else {
                                var0[var15] = var1;
                              }

                              ++var15;
                            }

                            var15 += var16;
                          }

                          return;
                        }

                        if (var3 == 2) {
                          for (var21 = var20 - 1; var21 >= var19; --var21) {
                            for (var22 = -1 + var18; var17 <= var22;
                                --var22) {
                              if (var22 < var21 - var6 / 2) {
                                if (var9) {
                                  var0[var15] = var4;
                                }
                              } else {
                                var0[var15] = var1;
                              }

                              ++var15;
                            }

                            var15 += var16;
                          }

                          return;
                        }

                        if (var3 == 3) {
                          for (var21 = var13; var14 > var21; ++var21) {
                            for (var22 = -1 + var18; var22 >= var17;
                                --var22) {
                              if (var21 - var6 / 2 > var22) {
                                if (var9) {
                                  var0[var15] = var4;
                                }
                              } else {
                                var0[var15] = var1;
                              }

                              ++var15;
                            }

                            var15 += var16;
                          }

                          return;
                        }
                      }

                    } else if (var3 == 0) {
                      for (var21 = var20 - 1; var21 >= var19; --var21) {
                        for (var22 = -1 + var18; var17 <= var22; --var22) {
                          if (var21 >> 1 <= var22) {
                            var0[var15] = var1;
                          } else if (var9) {
                            var0[var15] = var4;
                          }

                          ++var15;
                        }

                        var15 += var16;
                      }

                    } else if (var3 == 1) {
                      for (var21 = -1 + var20; var19 <= var21; --var21) {
                        for (var22 = var11; var22 < var12; ++var22) {
                          if (var22 > var21 << 1) {
                            if (var9) {
                              var0[var15] = var4;
                            }
                          } else {
                            var0[var15] = var1;
                          }

                          ++var15;
                        }

                        var15 += var16;
                      }

                    } else if (var3 != 2) {
                      if (var3 == 3) {
                        for (var21 = var13; var14 > var21; ++var21) {
                          for (var22 = var18 - 1; var17 <= var22; --var22) {
                            if (var21 << 1 >= var22) {
                              var0[var15] = var1;
                            } else if (var9) {
                              var0[var15] = var4;
                            }

                            ++var15;
                          }

                          var15 += var16;
                        }

                      }
                    } else {
                      for (var21 = var13; var14 > var21; ++var21) {
                        for (var22 = var11; var12 > var22; ++var22) {
                          if (var22 < var21 >> 1) {
                            if (var9) {
                              var0[var15] = var4;
                            }
                          } else {
                            var0[var15] = var1;
                          }

                          ++var15;
                        }

                        var15 += var16;
                      }

                    }
                  } else if (var3 != 0) {
                    if (var3 == 1) {
                      for (var21 = var13; var21 < var14; ++var21) {
                        for (var22 = var11; var22 < var12; ++var22) {
                          if (var21 << 1 >= var22) {
                            var0[var15] = var1;
                          } else if (var9) {
                            var0[var15] = var4;
                          }

                          ++var15;
                        }

                        var15 += var16;
                      }

                    } else if (var3 == 2) {
                      for (var21 = var13; var21 < var14; ++var21) {
                        for (var22 = var18 - 1; var17 <= var22; --var22) {
                          if (var22 >= var21 >> 1) {
                            var0[var15] = var1;
                          } else if (var9) {
                            var0[var15] = var4;
                          }

                          ++var15;
                        }

                        var15 += var16;
                      }

                    } else if (var3 == 3) {
                      for (var21 = -1 + var20; var19 <= var21; --var21) {
                        for (var22 = -1 + var18; var17 <= var22; --var22) {
                          if (var22 <= var21 << 1) {
                            var0[var15] = var1;
                          } else if (var9) {
                            var0[var15] = var4;
                          }

                          ++var15;
                        }

                        var15 += var16;
                      }

                    }
                  } else {
                    for (var21 = var20 - 1; var19 <= var21; --var21) {
                      for (var22 = var11; var22 < var12; ++var22) {
                        if (var21 >> 1 > var22) {
                          if (var9) {
                            var0[var15] = var4;
                          }
                        } else {
                          var0[var15] = var1;
                        }

                        ++var15;
                      }

                      var15 += var16;
                    }

                  }
                } else if (var3 == 0) {
                  for (var21 = var20 - 1; var19 <= var21; --var21) {
                    for (var22 = -1 + var18; var17 <= var22; --var22) {
                      if (var21 >> 1 >= var22) {
                        var0[var15] = var1;
                      } else if (var9) {
                        var0[var15] = var4;
                      }

                      ++var15;
                    }

                    var15 += var16;
                  }

                } else if (var3 == 1) {
                  for (var21 = -1 + var20; var21 >= var19; --var21) {
                    for (var22 = var11; var22 < var12; ++var22) {
                      if (var22 >= var21 << 1) {
                        var0[var15] = var1;
                      } else if (var9) {
                        var0[var15] = var4;
                      }

                      ++var15;
                    }

                    var15 += var16;
                  }

                } else if (var3 == 2) {
                  for (var21 = var13; var14 > var21; ++var21) {
                    for (var22 = var11; var22 < var12; ++var22) {
                      if (var22 <= var21 >> 1) {
                        var0[var15] = var1;
                      } else if (var9) {
                        var0[var15] = var4;
                      }

                      ++var15;
                    }

                    var15 += var16;
                  }

                } else if (var3 == 3) {
                  for (var21 = var13; var14 > var21; ++var21) {
                    for (var22 = var18 - 1; var22 >= var17; --var22) {
                      if (var21 << 1 > var22) {
                        if (var9) {
                          var0[var15] = var4;
                        }
                      } else {
                        var0[var15] = var1;
                      }

                      ++var15;
                    }

                    var15 += var16;
                  }

                }
              } else if (var3 == 0) {
                for (var21 = var13; var14 > var21; ++var21) {
                  for (var22 = var11; var12 > var22; ++var22) {
                    if (var22 <= var21) {
                      var0[var15] = var1;
                    } else if (var9) {
                      var0[var15] = var4;
                    }

                    ++var15;
                  }

                  var15 += var16;
                }

              } else if (var3 != 1) {
                if (var3 == 2) {
                  for (var21 = var13; var21 < var14; ++var21) {
                    for (var22 = var11; var12 > var22; ++var22) {
                      if (var22 >= var21) {
                        var0[var15] = var1;
                      } else if (var9) {
                        var0[var15] = var4;
                      }

                      ++var15;
                    }

                    var15 += var16;
                  }

                } else {
                  if (var3 == 3) {
                    for (var21 = var20 - 1; var19 <= var21; --var21) {
                      for (var22 = var11; var22 < var12; ++var22) {
                        if (var22 < var21) {
                          if (var9) {
                            var0[var15] = var4;
                          }
                        } else {
                          var0[var15] = var1;
                        }

                        ++var15;
                      }

                      var15 += var16;
                    }

                  }
                }
              } else {
                for (var21 = var20 - 1; var21 >= var19; --var21) {
                  for (var22 = var11; var12 > var22; ++var22) {
                    if (var21 >= var22) {
                      var0[var15] = var1;
                    } else if (var9) {
                      var0[var15] = var4;
                    }

                    ++var15;
                  }

                  var15 += var16;
                }

              }
            }
          }
        }
      }
    }
  }

  public static Widget method2273(Widget var0, int var1) {
    if (var1 < 57) {
      GlobalStatics_8.method2273(null, -22);
    }

    if (var0.anInt190 == -1) {
      int var3 = var0.anInt279 >>> 16;
      HashTableIterator var4 = new HashTableIterator(
          GlobalStatics_10.aClass130_3208);

      for (SomethingPacket151 var2 = (SomethingPacket151) var4.getFirst();
          var2 != null; var2 = (SomethingPacket151) var4.getNext()) {
        if (var3 == var2.anInt2602) {
          return GlobalStatics_7.getWidget((byte) 127, (int) var2.key);
        }
      }

      return null;
    } else {
      return GlobalStatics_7.getWidget((byte) 118, var0.anInt190);
    }
  }

  public static void method2275(int var0, byte var1, int var2, int var3,
      int var4, int var5,
      int var6) {
    if (var1 <= 68) {
      GlobalStatics_8.method2273(null, 38);
    }

    int var8 = -var5 + var3;
    GlobalStatics_9.method2091(var3, 4);
    int var7 = 0;
    if (var8 < 0) {
      var8 = 0;
    }

    int var9 = var3;
    int var10 = -var3;
    int var12 = -var8;
    int var11 = var8;
    int var13 = -1;
    int var17;
    int var16;
    int var19;
    int var18;
    if (var2 >= DummyClass13.anInt2020 && GlobalStatics_9.anInt902 >= var2) {
      int[] var15 = DummyClass35.anIntArrayArray663[var2];
      var16 = DummyClass59
          .method1040(GlTexture2d.anInt3765, -var3 + var6, (byte) 0,
              DummyClass55.anInt1425);
      var17 = DummyClass59
          .method1040(GlTexture2d.anInt3765, var3 + var6, (byte) 0,
              DummyClass55.anInt1425);
      var18 = DummyClass59
          .method1040(GlTexture2d.anInt3765, var6 - var8, (byte) 0,
              DummyClass55.anInt1425);
      var19 = DummyClass59
          .method1040(GlTexture2d.anInt3765, var6 + var8, (byte) 0,
              DummyClass55.anInt1425);
      GlobalStatics_10.method282(var15, var16, 102, var18, var4);
      GlobalStatics_10.method282(var15, var18, -44, var19, var0);
      GlobalStatics_10.method282(var15, var19, -61, var17, var4);
    }

    int var14 = -1;

    while (var7 < var9) {
      var13 += 2;
      var14 += 2;
      var12 += var14;
      var10 += var13;
      if (var12 >= 0 && var11 >= 1) {
        --var11;
        GlobalStatics_9.anIntArray1838[var11] = var7;
        var12 -= var11 << 1;
      }

      ++var7;
      int var21;
      int var20;
      int[] var22;
      int var24;
      if (var10 >= 0) {
        --var9;
        var10 -= var9 << 1;
        var24 = var2 - var9;
        var16 = var2 + var9;
        if (DummyClass13.anInt2020 <= var16 && GlobalStatics_9.anInt902
            >= var24) {
          if (var9 >= var8) {
            var17 = DummyClass59
                .method1040(GlTexture2d.anInt3765, var7 + var6, (byte) 0,
                    DummyClass55.anInt1425);
            var18 = DummyClass59
                .method1040(GlTexture2d.anInt3765, -var7 + var6, (byte) 0,
                    DummyClass55.anInt1425);
            if (GlobalStatics_9.anInt902 >= var16) {
              GlobalStatics_10
                  .method282(DummyClass35.anIntArrayArray663[var16], var18, -53,
                      var17, var4);
            }

            if (var24 >= DummyClass13.anInt2020) {
              GlobalStatics_10
                  .method282(DummyClass35.anIntArrayArray663[var24], var18, 96,
                      var17,
                      var4);
            }
          } else {
            var17 = GlobalStatics_9.anIntArray1838[var9];
            var18 = DummyClass59
                .method1040(GlTexture2d.anInt3765, var7 + var6, (byte) 0,
                    DummyClass55.anInt1425);
            var19 = DummyClass59
                .method1040(GlTexture2d.anInt3765, -var7 + var6, (byte) 0,
                    DummyClass55.anInt1425);
            var20 = DummyClass59
                .method1040(GlTexture2d.anInt3765, var6 + var17, (byte) 0,
                    DummyClass55.anInt1425);
            var21 = DummyClass59
                .method1040(GlTexture2d.anInt3765, -var17 + var6, (byte) 0,
                    DummyClass55.anInt1425);
            if (GlobalStatics_9.anInt902 >= var16) {
              var22 = DummyClass35.anIntArrayArray663[var16];
              GlobalStatics_10.method282(var22, var19, 116, var21, var4);
              GlobalStatics_10.method282(var22, var21, 125, var20, var0);
              GlobalStatics_10.method282(var22, var20, 87, var18, var4);
            }

            if (var24 >= DummyClass13.anInt2020) {
              var22 = DummyClass35.anIntArrayArray663[var24];
              GlobalStatics_10.method282(var22, var19, 110, var21, var4);
              GlobalStatics_10.method282(var22, var21, -114, var20, var0);
              GlobalStatics_10.method282(var22, var20, -88, var18, var4);
            }
          }
        }
      }

      var24 = -var7 + var2;
      var16 = var2 + var7;
      if (DummyClass13.anInt2020 <= var16 && GlobalStatics_9.anInt902
          >= var24) {
        var17 = var6 + var9;
        var18 = var6 - var9;
        if (var17 >= DummyClass55.anInt1425 && GlTexture2d.anInt3765
            >= var18) {
          var17 = DummyClass59
              .method1040(GlTexture2d.anInt3765, var17, (byte) 0,
                  DummyClass55.anInt1425);
          var18 = DummyClass59
              .method1040(GlTexture2d.anInt3765, var18, (byte) 0,
                  DummyClass55.anInt1425);
          if (var7 < var8) {
            var19 =
                var11 >= var7 ? var11 : GlobalStatics_9.anIntArray1838[var7];
            var20 = DummyClass59
                .method1040(GlTexture2d.anInt3765, var19 + var6, (byte) 0,
                    DummyClass55.anInt1425);
            var21 = DummyClass59
                .method1040(GlTexture2d.anInt3765, var6 - var19, (byte) 0,
                    DummyClass55.anInt1425);
            if (GlobalStatics_9.anInt902 >= var16) {
              var22 = DummyClass35.anIntArrayArray663[var16];
              GlobalStatics_10.method282(var22, var18, 126, var21, var4);
              GlobalStatics_10.method282(var22, var21, 103, var20, var0);
              GlobalStatics_10.method282(var22, var20, -61, var17, var4);
            }

            if (var24 >= DummyClass13.anInt2020) {
              var22 = DummyClass35.anIntArrayArray663[var24];
              GlobalStatics_10.method282(var22, var18, 102, var21, var4);
              GlobalStatics_10.method282(var22, var21, -94, var20, var0);
              GlobalStatics_10.method282(var22, var20, 99, var17, var4);
            }
          } else {
            if (GlobalStatics_9.anInt902 >= var16) {
              GlobalStatics_10
                  .method282(DummyClass35.anIntArrayArray663[var16], var18, 94,
                      var17,
                      var4);
            }

            if (var24 >= DummyClass13.anInt2020) {
              GlobalStatics_10
                  .method282(DummyClass35.anIntArrayArray663[var24], var18, 126,
                      var17, var4);
            }
          }
        }
      }
    }
  }

  public static void clear101(int var0) {
    GlobalStatics_8.aClass3_Sub28_Sub17_2096 = null;
    if (var0 == -2) {
      GlobalStatics_8.aClass94_2089 = null;
      GlobalStatics_8.fileUnpacker16 = null;
      GlobalStatics_8.aClass11_2091 = null;
    }
  }

  public static void method2277(int var0, int var1, int var2, int var3,
      byte var4) {
    Inventory var5 = (Inventory) GlobalStatics_2.aClass130_2220.get(var3);
    if (var5 == null) {
      var5 = new Inventory();
      GlobalStatics_2.aClass130_2220.put(var3, var5);
    }

    if (var4 > 16) {
      if (var1 >= var5.ids.length) {
        int[] var6 = new int[var1 + 1];
        int[] var7 = new int[1 + var1];

        int var8;
        for (var8 = 0; var5.ids.length > var8; ++var8) {
          var6[var8] = var5.ids[var8];
          var7[var8] = var5.counts[var8];
        }

        for (var8 = var5.ids.length; var8 < var1; ++var8) {
          var6[var8] = -1;
          var7[var8] = 0;
        }

        var5.ids = var6;
        var5.counts = var7;
      }

      var5.ids[var1] = var0;
      var5.counts[var1] = var2;
    }
  }

  public static void method2278(int var0) {
    boolean var1 = false;

    while (!var1) {
      var1 = true;

      for (int var2 = 0; var2 < -1 + GlobalStatics_10.amountContextActions;
          ++var2) {
        if (GlobalStatics_10.aShortArray3095[var2] < 1000
            && GlobalStatics_10.aShortArray3095[1 + var2] > 1000) {
          GameString var3 = DummyClass8.aClass94Array4016[var2];
          var1 = false;
          DummyClass8.aClass94Array4016[var2] = DummyClass8.aClass94Array4016[1
              + var2];
          DummyClass8.aClass94Array4016[1 + var2] = var3;
          GameString var4 = GameStringStatics.aClass94Array2935[var2];
          GameStringStatics.aClass94Array2935[var2] = GameStringStatics.aClass94Array2935[
              var2 + 1];
          GameStringStatics.aClass94Array2935[var2 + 1] = var4;
          int var5 = DummyClass26.anIntArray1613[var2];
          DummyClass26.anIntArray1613[var2] = DummyClass26.anIntArray1613[1
              + var2];
          DummyClass26.anIntArray1613[var2 + 1] = var5;
          var5 = DummyClass32.anIntArray512[var2];
          DummyClass32.anIntArray512[var2] = DummyClass32.anIntArray512[var2
              + 1];
          DummyClass32.anIntArray512[1 + var2] = var5;
          var5 = GlobalStatics_9.anIntArray1578[var2];
          GlobalStatics_9.anIntArray1578[var2] =
              GlobalStatics_9.anIntArray1578[1 + var2];
          GlobalStatics_9.anIntArray1578[var2 + 1] = var5;
          short var6 = GlobalStatics_10.aShortArray3095[var2];
          GlobalStatics_10.aShortArray3095[var2] = GlobalStatics_10.aShortArray3095[
              1 + var2];
          GlobalStatics_10.aShortArray3095[var2 + 1] = var6;
          long var7 = GlobalStatics_9.aLongArray3271[var2];
          GlobalStatics_9.aLongArray3271[var2] = GlobalStatics_9.aLongArray3271[
              var2 + 1];
          GlobalStatics_9.aLongArray3271[var2 + 1] = var7;
        }
      }
    }

    if (var0 <= 103) {
      GlobalStatics_8.aClass94_2089 = null;
    }
  }

  public static void method2280(int var0, int var1) {
    if (var0 != 2714) {
      GlobalStatics_8.method2277(-80, -123, -59, 60, (byte) 40);
    }

    WidgetUpdate var2 = GlobalStatics_6.method466(4, 11, var1);
    var2.createIndexedColorSprite(true);
  }

  public static int method1602(int var0, GameString var1) {
    if (DummyClass25.aClass131_1624 != null && var1.getLength() != 0) {
      for (int var2 = var0; DummyClass25.aClass131_1624.anInt1720 > var2;
          ++var2) {
        if (DummyClass25.aClass131_1624.aClass94Array1721[var2].method1560(
            GameStringStatics.aClass94_3192, true, GameStringStatics.aClass94_4066)
            .method1562((byte) -32, var1)) {
          return var2;
        }
      }

      return -1;
    } else {
      return -1;
    }
  }

  public static int method1603(byte var0, int var1, Random var2) {
    if (var1 <= 0) {
      throw new IllegalArgumentException();
    } else if (GlobalStatics_9.isPo2((byte) -115, var1)) {
      return (int) ((var2.nextInt() & 4294967295L) * var1 >> 32);
    } else {
      int var3 = -((int) (4294967296L % var1)) + Integer.MIN_VALUE;

      int var4;
      do {
        var4 = var2.nextInt();
      } while (var3 <= var4);

      int var5 = -101 % ((var0 + 52) / 33);
      return GlobalStatics_10.method201(var4, var1, -58);
    }
  }

  public static void method1605(int var0, GameString var1, int var2) {
    ++GlobalStatics_4.anInt421;
    GlobalStatics_9.SECURE_BUFFER.writePacket(188);
    GlobalStatics_9.SECURE_BUFFER.method790(var2, var0 - 13326);
    if (var0 == 255) {
      GlobalStatics_9.SECURE_BUFFER.writeLong(var1.toBase37());
    }
  }

  public static void method1606(byte var0) {
    GlobalStatics_8.aClass94_1415 = null;
    GlobalStatics_8.aClass94_1409 = null;
    int var1 = 86 % ((49 - var0) / 48);
    GlobalStatics_8.fileUnpacker19 = null;
    GlobalStatics_8.aClass136_1413 = null;
  }

  public static void printMessage(GameString var0, int var1, GameString var2,
      int var3) {
    GlobalStatics_9.method611(var3, var1, var2, null, (byte) 50, var0);
  }

  public static void method806(int var0, int var1) {
    if (var1 >= 0) {
      int var2 = DummyClass26.anIntArray1613[var1];
      int var3 = DummyClass32.anIntArray512[var1];
      int var4 = GlobalStatics_10.aShortArray3095[var1];
      if (var4 >= 2000) {
        var4 -= 2000;
      }

      long var6 = GlobalStatics_9.aLongArray3271[var1];
      int var5 = (int) GlobalStatics_9.aLongArray3271[var1];
      Player var8;
      if (var4 == 31) {
        var8 = GlobalStatics_9.PLAYERS[var5];
        if (var8 != null) {
          ++GlobalStatics_9.anInt2059;
          GlobalStatics_9
              .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                  GlobalStatics_9.localPlayer.waypointsX[0]);
          GlobalStatics_0.anInt638 = 2;
          GlobalStatics_7.anInt2958 = 0;
          GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
          GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
          GlobalStatics_9.SECURE_BUFFER.writePacket(71);
          GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
        }
      }

      if (var4 == 46) {
        ++GlobalStatics_9.anInt2534;
        DummyClass8.method2224((byte) 39, var6, var3, var2);
        GlobalStatics_9.SECURE_BUFFER.writePacket(247);
        GlobalStatics_9.SECURE_BUFFER
            .writeShortLE(-1, GlobalStatics_9.REGION_BASE_Y + var3);
        GlobalStatics_9.SECURE_BUFFER
            .method765(var2 + GlobalStatics_10.REGION_BASE_X, (byte) 3);
        GlobalStatics_9.SECURE_BUFFER
            .writeShort(Integer.MAX_VALUE & (int) (var6 >>> 32));
      }

      if (var4 == 40) {
        GlobalStatics_9.SECURE_BUFFER.writePacket(27);
        GlobalStatics_9.SECURE_BUFFER.writeShort(DummyClass31.anInt1473);
        ++GlobalStatics_9.anInt1776;
        GlobalStatics_9.SECURE_BUFFER.method785(var3, (byte) -122);
        GlobalStatics_9.SECURE_BUFFER.writeShortLE(-1, var2);
        GlobalStatics_9.SECURE_BUFFER
            .method785(GlTexture2d.anInt3764, (byte) -122);
        GlobalStatics_9.SECURE_BUFFER
            .method765(GlobalStatics_9.anInt2050, (byte) 3);
        GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
        GlobalStatics_6.anInt2330 = 0;
        GlobalStatics_5.aClass11_1933 = GlobalStatics_7
            .getWidget((byte) 120, var3);
        GlobalStatics_9.anInt1918 = var2;
      }

      NPC var11;
      if (var4 == 19) {
        var11 = GlobalStatics_8.NPCS[var5];
        if (var11 != null) {
          GlobalStatics_9
              .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var11.waypointsX[0], 1, 0, 2, var11.waypointsY[0],
                  GlobalStatics_9.localPlayer.waypointsX[0]);
          ++DummyClass32.anInt513;
          GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
          GlobalStatics_0.anInt638 = 2;
          GlobalStatics_7.anInt2958 = 0;
          GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
          GlobalStatics_9.SECURE_BUFFER.writePacket(30);
          GlobalStatics_9.SECURE_BUFFER.writeShort(var5);
        }
      }

      if (var4 == 17) {
        var11 = GlobalStatics_8.NPCS[var5];
        if (var11 != null) {
          GlobalStatics_9
              .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var11.waypointsX[0], 1, 0, 2, var11.waypointsY[0],
                  GlobalStatics_9.localPlayer.waypointsX[0]);
          GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
          GlobalStatics_7.anInt2958 = 0;
          ++GlobalStatics_4.anInt3627;
          GlobalStatics_0.anInt638 = 2;
          GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
          GlobalStatics_9.SECURE_BUFFER.writePacket(78);
          GlobalStatics_9.SECURE_BUFFER.writeShortLE(-1, var5);
        }
      }

      if (var4 == 44) {
        var8 = GlobalStatics_9.PLAYERS[var5];
        if (var8 != null) {
          ++GlobalStatics_6.anInt3517;
          GlobalStatics_9
              .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                  GlobalStatics_9.localPlayer.waypointsX[0]);
          GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
          GlobalStatics_0.anInt638 = 2;
          GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
          GlobalStatics_7.anInt2958 = 0;
          GlobalStatics_9.SECURE_BUFFER.writePacket(133);
          GlobalStatics_9.SECURE_BUFFER.writeShortLE(-1, var5);
        }
      }

      if (var4 == 58) {
        GlobalStatics_9.SECURE_BUFFER.writePacket(135);
        GlobalStatics_9.SECURE_BUFFER.method783(var5, -268435456);
        ++GlobalStatics_10.anInt3255;
        GlobalStatics_9.SECURE_BUFFER.method783(var2, -268435456);
        GlobalStatics_9.SECURE_BUFFER.method759(-68, var3);
        GlobalStatics_6.anInt2330 = 0;
        GlobalStatics_5.aClass11_1933 = GlobalStatics_7
            .getWidget((byte) 117, var3);
        GlobalStatics_9.anInt1918 = var2;
      }

      if (var4 == 42) {
        DummyClass8.method2224((byte) 39, var6, var3, var2);
        GlobalStatics_9.SECURE_BUFFER.writePacket(254);
        GlobalStatics_9.SECURE_BUFFER
            .writeShortLE(-1, var2 + GlobalStatics_10.REGION_BASE_X);
        ++GlobalStatics_9.anInt3248;
        GlobalStatics_9.SECURE_BUFFER
            .method783((int) (var6 >>> 32) & Integer.MAX_VALUE,
                -268435456);
        GlobalStatics_9.SECURE_BUFFER
            .writeShort(var3 + GlobalStatics_9.REGION_BASE_Y);
      }

      if (var4 == 28) {
        GlobalStatics_9.method264((byte) 122);
      }

      if (var4 == 45) {
        var11 = GlobalStatics_8.NPCS[var5];
        if (var11 != null) {
          GlobalStatics_9
              .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var11.waypointsX[0], 1, 0, 2, var11.waypointsY[0],
                  GlobalStatics_9.localPlayer.waypointsX[0]);
          GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
          GlobalStatics_0.anInt638 = 2;
          ++GlobalStatics_10.anInt3205;
          GlobalStatics_7.anInt2958 = 0;
          GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
          GlobalStatics_9.SECURE_BUFFER.writePacket(239);
          GlobalStatics_9.SECURE_BUFFER
              .method785(GlobalStatics_9.anInt872, (byte) -123);
          GlobalStatics_9.SECURE_BUFFER
              .method783(GlobalStatics_10.anInt278, -268435456);
          GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
        }
      }

      boolean var14;
      if (var4 == 18) {
        if (GlobalStatics_5.gameId == 1) {
          GlobalStatics_9
              .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2, var2, 1,
                  0, 2, var3, GlobalStatics_9.localPlayer.waypointsX[0]);
        } else {
          var14 = GlobalStatics_9
              .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 0, false,
                  0,
                  var0 ^ 2599, var2, 0, 0, 2, var3,
                  GlobalStatics_9.localPlayer.waypointsX[0]);
          if (!var14) {
            GlobalStatics_9
                .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                    false, 0, 2, var2,
                    1, 0, 2, var3, GlobalStatics_9.localPlayer.waypointsX[0]);
          }
        }

        ++GlobalStatics_9.anInt3615;
        GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
        GlobalStatics_7.anInt2958 = 0;
        GlobalStatics_0.anInt638 = 2;
        GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
        GlobalStatics_9.SECURE_BUFFER.writePacket(66);
        GlobalStatics_9.SECURE_BUFFER
            .writeShortLE(-1, GlobalStatics_10.REGION_BASE_X + var2);
        GlobalStatics_9.SECURE_BUFFER.writeShort(var5);
        GlobalStatics_9.SECURE_BUFFER
            .method765(var3 + GlobalStatics_9.REGION_BASE_Y, (byte) 3);
      }

      if (var4 == 1001) {
        ++GlobalStatics_10.anInt1896;
        DummyClass8.method2224((byte) 39, var6, var3, var2);
        GlobalStatics_9.SECURE_BUFFER.writePacket(170);
        GlobalStatics_9.SECURE_BUFFER
            .method765(Integer.MAX_VALUE & (int) (var6 >>> 32),
                (byte) 3);
        GlobalStatics_9.SECURE_BUFFER
            .method765(var2 + GlobalStatics_10.REGION_BASE_X, (byte) 3);
        GlobalStatics_9.SECURE_BUFFER
            .method765(var3 + GlobalStatics_9.REGION_BASE_Y, (byte) 3);
      }

      if (var4 == 1002) {
        GlobalStatics_0.anInt638 = 2;
        GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
        GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
        ++GlobalStatics_0.anInt1701;
        GlobalStatics_7.anInt2958 = 0;
        GlobalStatics_9.SECURE_BUFFER.writePacket(92);
        GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
      }

      Widget var13;
      if (var4 == 1006) {
        var13 = GlobalStatics_7.getWidget((byte) 119, var3);
        if (var13 != null && var13.anIntArray317[var2] >= 100000) {
          GlobalStatics_8.printMessage(GameStringStatics.EMPTY_STRING, 0,
              GlobalStatics_9.concat(new GameString[]{
                  GlobalStatics_9.toString(var13.anIntArray317[var2]),
                  GameStringStatics.aClass94_3777,
                  DummyClass35
                      .getItemConfig(var5).aClass94_770
              }), -1);
        } else {
          GlobalStatics_9.SECURE_BUFFER.writePacket(92);
          ++GlobalStatics_0.anInt1701;
          GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
        }

        GlobalStatics_6.anInt2330 = 0;
        GlobalStatics_5.aClass11_1933 = GlobalStatics_7
            .getWidget((byte) 123, var3);
        GlobalStatics_9.anInt1918 = var2;
      }

      if (var4 == 60) {
        if (var5 == 0) {
          GlobalStatics_4
              .method589(GlobalStatics_9.currentPlane, var2, var3);
        } else {
          if (var5 == 1) {
            if (GlobalStatics_10.PLAYER_RIGHTS > 0
                && GlobalStatics_8.PRESSED_KEYS[82]
                && GlobalStatics_8.PRESSED_KEYS[81]) {
              GlobalStatics_6.method979(GlobalStatics_10.REGION_BASE_X + var2,
                  GlobalStatics_9.REGION_BASE_Y + var3,
                  GlobalStatics_9.currentPlane, (byte) -4);
            } else if (GlobalStatics_9
                .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 0,
                    true,
                    0,
                    2, var2, 0, 0, 1, var3,
                    GlobalStatics_9.localPlayer.waypointsX[0])) {
              GlobalStatics_9.SECURE_BUFFER.writeByte(DummyClass3.anInt56);
              GlobalStatics_9.SECURE_BUFFER.writeByte(DummyClass43.anInt916);
              GlobalStatics_9.SECURE_BUFFER
                  .writeShort(GlobalStatics_9.NEXT_CAMERA_YAW);
              GlobalStatics_9.SECURE_BUFFER.writeByte(57);
              GlobalStatics_9.SECURE_BUFFER
                  .writeByte(GlobalStatics_9.anInt3102);
              GlobalStatics_9.SECURE_BUFFER.writeByte(GlobalStatics_9.anInt3020);
              GlobalStatics_9.SECURE_BUFFER.writeByte(89);
              GlobalStatics_9.SECURE_BUFFER
                  .writeShort(GlobalStatics_9.localPlayer.sceneX);
              GlobalStatics_9.SECURE_BUFFER
                  .writeShort(GlobalStatics_9.localPlayer.sceneY);
              GlobalStatics_9.SECURE_BUFFER
                  .writeByte(GlobalStatics_4.anInt1692);
              GlobalStatics_9.SECURE_BUFFER.writeByte(63);
            }
          }
        }
      }

      if (var4 == 1007) {
        GlobalStatics_7.anInt2958 = 0;
        GlobalStatics_0.anInt638 = 2;
        GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
        GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
        var11 = GlobalStatics_8.NPCS[var5];
        if (var11 != null) {
          NpcConfiguration var9 = var11.config;
          if (var9.anIntArray1292 != null) {
            var9 = var9.method1471((byte) 80);
          }

          if (var9 != null) {
            ++GlobalStatics_9.anInt2549;
            GlobalStatics_9.SECURE_BUFFER.writePacket(72);
            GlobalStatics_9.SECURE_BUFFER.writeShort(var9.anInt1284);
          }
        }
      }

      if (var4 == 47) {
        GlobalStatics_9.SECURE_BUFFER.writePacket(156);
        GlobalStatics_9.SECURE_BUFFER.method765(var2, (byte) 3);
        GlobalStatics_9.SECURE_BUFFER.method783(var5, -268435456);
        GlobalStatics_9.SECURE_BUFFER.method785(var3, (byte) -120);
        GlobalStatics_6.anInt2330 = 0;
        GlobalStatics_5.aClass11_1933 = GlobalStatics_7
            .getWidget((byte) 109, var3);
        GlobalStatics_9.anInt1918 = var2;
      }

      if (var4 == 3) {
        GlobalStatics_9.SECURE_BUFFER.writePacket(253);
        ++GlobalStatics_9.anInt555;
        GlobalStatics_9.SECURE_BUFFER
            .method785(GlobalStatics_9.anInt872, (byte) -126);
        GlobalStatics_9.SECURE_BUFFER.method765(var2, (byte) 3);
        GlobalStatics_9.SECURE_BUFFER.method785(var3, (byte) -124);
        GlobalStatics_9.SECURE_BUFFER.method783(var5, -268435456);
        GlobalStatics_9.SECURE_BUFFER
            .writeShortLE(var0 ^ -2598, GlobalStatics_10.anInt278);
        GlobalStatics_6.anInt2330 = 0;
        GlobalStatics_5.aClass11_1933 = GlobalStatics_7
            .getWidget((byte) 120, var3);
        GlobalStatics_9.anInt1918 = var2;
      }

      if (var4 == 10) {
        var8 = GlobalStatics_9.PLAYERS[var5];
        if (var8 != null) {
          ++GlobalStatics_4.anInt1240;
          GlobalStatics_9
              .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                  GlobalStatics_9.localPlayer.waypointsX[0]);
          GlobalStatics_0.anInt638 = 2;
          GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
          GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
          GlobalStatics_7.anInt2958 = 0;
          GlobalStatics_9.SECURE_BUFFER.writePacket(4);
          GlobalStatics_9.SECURE_BUFFER.writeShortLE(-1, var5);
        }
      }

      if (var4 == 41 && GlobalStatics_10.aClass11_3087 == null) {
        GlobalStatics_9.method78(var2, false, var3);
        GlobalStatics_10.aClass11_3087 =
            GlobalStatics_2.method638((byte) -19, var3, var2);
        DummyClass29.method909(var0 - 2470, GlobalStatics_10.aClass11_3087);
      }

      if (var4 == 49) {
        ++GlobalStatics_4.anInt3630;
        DummyClass8.method2224((byte) 39, var6, var3, var2);
        GlobalStatics_9.SECURE_BUFFER.writePacket(84);
        GlobalStatics_9.SECURE_BUFFER
            .method765(Integer.MAX_VALUE & (int) (var6 >>> 32),
                (byte) 3);
        GlobalStatics_9.SECURE_BUFFER
            .method765(GlobalStatics_9.REGION_BASE_Y + var3, (byte) 3);
        GlobalStatics_9.SECURE_BUFFER
            .writeShortLE(var0 - 2598, var2 + GlobalStatics_10.REGION_BASE_X);
      }

      if (var4 == 23) {
        ++GlobalStatics_6.anInt1886;
        GlobalStatics_9.SECURE_BUFFER.writePacket(206);
        GlobalStatics_9.SECURE_BUFFER.method783(var5, -268435456);
        GlobalStatics_9.SECURE_BUFFER.writeShortLE(var0 ^ -2598, var2);
        GlobalStatics_9.SECURE_BUFFER.method785(var3, (byte) -127);
        GlobalStatics_6.anInt2330 = 0;
        GlobalStatics_5.aClass11_1933 = GlobalStatics_7
            .getWidget((byte) 115, var3);
        GlobalStatics_9.anInt1918 = var2;
      }

      if (var4 == 14 && DummyClass8
          .method2224((byte) 39, var6, var3, var2)) {
        ++GlobalStatics_9.anInt4065;
        GlobalStatics_9.SECURE_BUFFER.writePacket(134);
        GlobalStatics_9.SECURE_BUFFER
            .method783(GlobalStatics_10.REGION_BASE_X + var2,
                var0 ^ -268432859);
        GlobalStatics_9.SECURE_BUFFER.writeShort(GlobalStatics_9.anInt2050);
        GlobalStatics_9.SECURE_BUFFER
            .writeShortLE(-1, var3 + GlobalStatics_9.REGION_BASE_Y);
        GlobalStatics_9.SECURE_BUFFER.writeShort(DummyClass31.anInt1473);
        GlobalStatics_9.SECURE_BUFFER
            .method759(var0 ^ -2588, GlTexture2d.anInt3764);
        GlobalStatics_9.SECURE_BUFFER
            .method783((int) (var6 >>> 32) & Integer.MAX_VALUE,
                -268435456);
      }

      if (var4 == 37) {
        var8 = GlobalStatics_9.PLAYERS[var5];
        if (var8 != null) {
          GlobalStatics_9
              .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                  GlobalStatics_9.localPlayer.waypointsX[0]);
          GlobalStatics_7.anInt2958 = 0;
          ++DummyClass29.anInt437;
          GlobalStatics_0.anInt638 = 2;
          GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
          GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
          GlobalStatics_9.SECURE_BUFFER.writePacket(114);
          GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
        }
      }

      if (var4 == 9 || var4 == 1003) {
        GlobalStatics_11
            .method66(DummyClass8.aClass94Array4016[var1], var2, var5,
                (byte) -19,
                var3);
      }

      if (var4 == 5) {
        GlobalStatics_9.SECURE_BUFFER.writePacket(55);
        GlobalStatics_9.SECURE_BUFFER.writeShortLE(-1, var5);
        GlobalStatics_9.SECURE_BUFFER.method783(var2, -268435456);
        ++GlobalStatics_10.anInt3084;
        GlobalStatics_9.SECURE_BUFFER.method775(var3, 1437452424);
        GlobalStatics_6.anInt2330 = 0;
        GlobalStatics_5.aClass11_1933 = GlobalStatics_7
            .getWidget((byte) 116, var3);
        GlobalStatics_9.anInt1918 = var2;
      }

      if (var4 == 21) {
        if (GlobalStatics_5.gameId == 1) {
          GlobalStatics_9
              .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1, false,
                  0,
                  var0 - 2595, var2, 1, 0, 2, var3,
                  GlobalStatics_9.localPlayer.waypointsX[0]);
        } else {
          var14 = GlobalStatics_9
              .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 0, false,
                  0,
                  var0 - 2595, var2, 0, 0, 2, var3,
                  GlobalStatics_9.localPlayer.waypointsX[0]);
          if (!var14) {
            GlobalStatics_9
                .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                    false, 0,
                    var0 - 2595, var2, 1, 0, 2, var3,
                    GlobalStatics_9.localPlayer.waypointsX[0]);
          }
        }

        GlobalStatics_0.anInt638 = 2;
        GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
        GlobalStatics_7.anInt2958 = 0;
        GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
        GlobalStatics_9.SECURE_BUFFER.writePacket(228);
        ++DummyClass10.anInt2085;
        GlobalStatics_9.SECURE_BUFFER.writeShort(var5);
        GlobalStatics_9.SECURE_BUFFER
            .writeShortLE(var0 ^ -2598, GlobalStatics_10.REGION_BASE_X + var2);
        GlobalStatics_9.SECURE_BUFFER
            .method765(GlobalStatics_9.REGION_BASE_Y + var3, (byte) 3);
      }

      if (var4 == 4) {
        var11 = GlobalStatics_8.NPCS[var5];
        if (var11 != null) {
          GlobalStatics_9
              .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1, false,
                  0, 2,
                  var11.waypointsX[0], 1, 0, 2, var11.waypointsY[0],
                  GlobalStatics_9.localPlayer.waypointsX[0]);
          GlobalStatics_0.anInt638 = 2;
          GlobalStatics_7.anInt2958 = 0;
          GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
          GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
          ++GlobalStatics_10.anInt3259;
          GlobalStatics_9.SECURE_BUFFER.writePacket(148);
          GlobalStatics_9.SECURE_BUFFER.method783(var5, var0 - 268438053);
        }
      }

      if (var4 == 32) {
        var13 = GlobalStatics_2.method638((byte) -19, var3, var2);
        if (var13 != null) {
          GlobalStatics_9.method958();
          WidgetAccess var16 = GlobalStatics_8.method44(var13);
          GlobalStatics_10
              .method2074(var3, var2, var16.method101(-120), var16.anInt2202,
                  var13.anInt266,
                  -120, var13.anInt238);
          GlobalStatics_9.anInt3012 = 0;
          GameStringStatics.aClass94_3621 = DummyClass41
              .method1174(var13, (byte) -94);
          if (GameStringStatics.aClass94_3621 == null) {
            GameStringStatics.aClass94_3621 = GameStringStatics.aClass94_1915;
          }

          if (var13.aBoolean233) {
            DummyClass59.aClass94_676 = GlobalStatics_9.concat(
                new GameString[]{var13.aClass94_277,
                    GameStringStatics.aClass94_2562});
          } else {
            DummyClass59.aClass94_676 = GlobalStatics_9
                .concat(new GameString[]{
                    GameStringStatics.aClass94_431, var13.aClass94_243,
                    GameStringStatics.aClass94_2562
                });
          }
        }

      } else {
        if (var4 == 29) {
          var8 = GlobalStatics_9.PLAYERS[var5];
          if (var8 != null) {
            ++GlobalStatics_9.anInt1910;
            GlobalStatics_9
                .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                    false, 0, 2,
                    var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                    GlobalStatics_9.localPlayer.waypointsX[0]);
            GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
            GlobalStatics_7.anInt2958 = 0;
            GlobalStatics_0.anInt638 = 2;
            GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
            GlobalStatics_9.SECURE_BUFFER.writePacket(180);
            GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
          }
        }

        if (var4 == 35) {
          GlobalStatics_9.SECURE_BUFFER.writePacket(161);
          GlobalStatics_9.SECURE_BUFFER.method785(var3, (byte) -119);
          GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
          GlobalStatics_9.SECURE_BUFFER.method765(var2, (byte) 3);
          ++GlobalStatics_9.anInt3459;
          GlobalStatics_6.anInt2330 = 0;
          GlobalStatics_5.aClass11_1933 = GlobalStatics_7
              .getWidget((byte) 124, var3);
          GlobalStatics_9.anInt1918 = var2;
        }

        if (var4 == 15) {
          var8 = GlobalStatics_9.PLAYERS[var5];
          if (var8 != null) {
            GlobalStatics_9
                .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                    false, 0, 2,
                    var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                    GlobalStatics_9.localPlayer.waypointsX[0]);
            GlobalStatics_7.anInt2958 = 0;
            GlobalStatics_0.anInt638 = 2;
            GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
            GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
            GlobalStatics_9.SECURE_BUFFER.writePacket(195);
            ++GlobalStatics_9.anInt3542;
            GlobalStatics_9.SECURE_BUFFER
                .method783(GlobalStatics_10.anInt278, -268435456);
            GlobalStatics_9.SECURE_BUFFER
                .method785(GlobalStatics_9.anInt872, (byte) -124);
            GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
          }
        }

        if (var4 == 34) {
          if (GlobalStatics_5.gameId == 1) {
            GlobalStatics_9
                .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                    false, 0, 2, var2,
                    1, 0, 2, var3, GlobalStatics_9.localPlayer.waypointsX[0]);
          } else {
            var14 = GlobalStatics_9
                .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 0,
                    false, 0,
                    var0 ^ 2599, var2, 0, 0, 2, var3,
                    GlobalStatics_9.localPlayer.waypointsX[0]);
            if (!var14) {
              GlobalStatics_9
                  .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                      false, 0, 2, var2,
                      1, 0, 2, var3, GlobalStatics_9.localPlayer.waypointsX[0]);
            }
          }

          GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
          GlobalStatics_0.anInt638 = 2;
          ++GlobalStatics_9.anInt3277;
          GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
          GlobalStatics_7.anInt2958 = 0;
          GlobalStatics_9.SECURE_BUFFER.writePacket(109);
          GlobalStatics_9.SECURE_BUFFER
              .writeShortLE(-1, var3 + GlobalStatics_9.REGION_BASE_Y);
          GlobalStatics_9.SECURE_BUFFER
              .writeShort(var2 + GlobalStatics_10.REGION_BASE_X);
          GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
        }

        if (var4 == 25) {
          ++DummyClass1.anInt411;
          GlobalStatics_9.SECURE_BUFFER.writePacket(81);
          GlobalStatics_9.SECURE_BUFFER.method783(var2, -268435456);
          GlobalStatics_9.SECURE_BUFFER.writeShort(var5);
          GlobalStatics_9.SECURE_BUFFER.method775(var3, 1437452424);
          GlobalStatics_6.anInt2330 = 0;
          GlobalStatics_5.aClass11_1933 = GlobalStatics_7
              .getWidget((byte) 126, var3);
          GlobalStatics_9.anInt1918 = var2;
        }

        if (var4 == 2) {
          var11 = GlobalStatics_8.NPCS[var5];
          if (var11 != null) {
            GlobalStatics_9
                .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                    false, 0,
                    var0 - 2595, var11.waypointsX[0], 1, 0, 2,
                    var11.waypointsY[0],
                    GlobalStatics_9.localPlayer.waypointsX[0]);
            GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
            GlobalStatics_0.anInt638 = 2;
            GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
            ++GlobalStatics_10.anInt2204;
            GlobalStatics_7.anInt2958 = 0;
            GlobalStatics_9.SECURE_BUFFER.writePacket(218);
            GlobalStatics_9.SECURE_BUFFER.writeShortLE(-1, var5);
          }
        }

        int var12;
        if (var4 == 51) {
          GlobalStatics_9.SECURE_BUFFER.writePacket(10);
          ++GlobalStatics_6.anInt3681;
          GlobalStatics_9.SECURE_BUFFER.writeInt(var3);
          var13 = GlobalStatics_7.getWidget((byte) 117, var3);
          assert var13 != null;
          if (var13.anIntArrayArray298 != null
              && var13.anIntArrayArray298[0][0] == 5) {
            var12 = var13.anIntArrayArray298[0][1];
            if (DummyClass5.anIntArray2985[var12] != var13.anIntArray307[0]) {
              DummyClass5.anIntArray2985[var12] = var13.anIntArray307[0];
              DummyClass39.method1087(98, var12);
            }
          }
        }

        if (var4 == 26) {
          var11 = GlobalStatics_8.NPCS[var5];
          if (var11 != null) {
            ++GlobalStatics_9.anInt3439;
            GlobalStatics_9
                .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                    false, 0, 2,
                    var11.waypointsX[0], 1, 0, 2, var11.waypointsY[0],
                    GlobalStatics_9.localPlayer.waypointsX[0]);
            GlobalStatics_0.anInt638 = 2;
            GlobalStatics_7.anInt2958 = 0;
            GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
            GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
            GlobalStatics_9.SECURE_BUFFER.writePacket(115);
            GlobalStatics_9.SECURE_BUFFER
                .method759(var0 ^ -2667, GlTexture2d.anInt3764);
            GlobalStatics_9.SECURE_BUFFER
                .writeShortLE(-1, DummyClass31.anInt1473);
            GlobalStatics_9.SECURE_BUFFER.writeShortLE(var0 ^ -2598, var5);
            GlobalStatics_9.SECURE_BUFFER
                .method765(GlobalStatics_9.anInt2050, (byte) 3);
          }
        }

        if (var4 == 59) {
          GlobalStatics_9.SECURE_BUFFER.writePacket(10);
          ++GlobalStatics_6.anInt3681;
          GlobalStatics_9.SECURE_BUFFER.writeInt(var3);
          var13 = GlobalStatics_7.getWidget((byte) 122, var3);
          assert var13 != null;
          if (var13.anIntArrayArray298 != null
              && var13.anIntArrayArray298[0][0] == 5) {
            var12 = var13.anIntArrayArray298[0][1];
            DummyClass5.anIntArray2985[var12] =
                -DummyClass5.anIntArray2985[var12] + 1;
            DummyClass39.method1087(68, var12);
          }
        }

        if (var4 == 33) {
          var14 =
              GlobalStatics_9
                  .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 0,
                      false, 0, 2, var2,
                      0, 0, 2, var3, GlobalStatics_9.localPlayer.waypointsX[0]);
          ++GlobalStatics_0.anInt938;
          if (!var14) {
            GlobalStatics_9
                .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                    false, 0,
                    var0 - 2595, var2, 1, 0, 2, var3,
                    GlobalStatics_9.localPlayer.waypointsX[0]);
          }

          GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
          GlobalStatics_7.anInt2958 = 0;
          GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
          GlobalStatics_0.anInt638 = 2;
          GlobalStatics_9.SECURE_BUFFER.writePacket(101);
          GlobalStatics_9.SECURE_BUFFER
              .method765(var2 + GlobalStatics_10.REGION_BASE_X, (byte) 3);
          GlobalStatics_9.SECURE_BUFFER
              .writeShortLE(var0 ^ -2598, DummyClass31.anInt1473);
          GlobalStatics_9.SECURE_BUFFER
              .writeShortLE(-1, GlobalStatics_9.anInt2050);
          GlobalStatics_9.SECURE_BUFFER.writeShortLE(-1, var5);
          GlobalStatics_9.SECURE_BUFFER
              .method765(GlobalStatics_9.REGION_BASE_Y + var3, (byte) 3);
          GlobalStatics_9.SECURE_BUFFER
              .method759(-118, GlTexture2d.anInt3764);
        }

        if (var4 == 1004) {
          GlobalStatics_7.anInt2958 = 0;
          GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
          GlobalStatics_0.anInt638 = 2;
          GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
          GlobalStatics_9.SECURE_BUFFER.writePacket(94);
          ++GlobalStatics_9.anInt2770;
          GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
        }

        if (var4 == 11) {
          if (var5 == 0) {
            GlobalStatics_7.anInt2440 = 1;
            GlobalStatics_4
                .method589(GlobalStatics_9.currentPlane, var2, var3);
          } else {
            if (var5 == 1) {
              GlobalStatics_9.SECURE_BUFFER.writePacket(131);
              ++GlobalStatics_9.anInt994;
              GlobalStatics_9.SECURE_BUFFER
                  .method759(-57, GlobalStatics_9.anInt872);
              GlobalStatics_9.SECURE_BUFFER
                  .method783(GlobalStatics_10.REGION_BASE_X + var2,
                      var0 - 268438053);
              GlobalStatics_9.SECURE_BUFFER
                  .method765(GlobalStatics_10.anInt278, (byte) 3);
              GlobalStatics_9.SECURE_BUFFER
                  .method783(var3 + GlobalStatics_9.REGION_BASE_Y,
                      -268435456);
            }
          }
        }

        if (var4 == 8) {
          var13 = GlobalStatics_7.getWidget((byte) 109, var3);
          boolean var15 = true;
          assert var13 != null;
          if (var13.anInt189 > 0) {
            var15 = GlobalStatics_9.method715(205, var13);
          }

          if (var15) {
            ++GlobalStatics_6.anInt3681;
            GlobalStatics_9.SECURE_BUFFER.writePacket(10);
            GlobalStatics_9.SECURE_BUFFER.writeInt(var3);
          }
        }

        if (var4 == 1) {
          var8 = GlobalStatics_9.PLAYERS[var5];
          if (var8 != null) {
            ++GlobalStatics_9.anInt969;
            GlobalStatics_9
                .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                    false, 0, 2,
                    var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                    GlobalStatics_9.localPlayer.waypointsX[0]);
            GlobalStatics_7.anInt2958 = 0;
            GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
            GlobalStatics_0.anInt638 = 2;
            GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
            GlobalStatics_9.SECURE_BUFFER.writePacket(248);
            GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
            GlobalStatics_9.SECURE_BUFFER
                .writeShort(GlobalStatics_9.anInt2050);
            GlobalStatics_9.SECURE_BUFFER.writeShort(DummyClass31.anInt1473);
            GlobalStatics_9.SECURE_BUFFER
                .method759(-110, GlTexture2d.anInt3764);
          }
        }

        if (var4 == 7) {
          GlobalStatics_9.SECURE_BUFFER.writePacket(85);
          ++GlobalStatics_10.anInt3144;
          GlobalStatics_9.SECURE_BUFFER.method775(var3, 1437452424);
          GlobalStatics_9.SECURE_BUFFER.writeShort(var2);
          GlobalStatics_9.SECURE_BUFFER.method783(var5, -268435456);
          GlobalStatics_6.anInt2330 = 0;
          GlobalStatics_5.aClass11_1933 = GlobalStatics_7
              .getWidget((byte) 125, var3);
          GlobalStatics_9.anInt1918 = var2;
        }

        if (var4 == 24) {
          if (GlobalStatics_5.gameId == 1) {
            GlobalStatics_9
                .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                    false, 0,
                    var0 - 2595, var2, 1, 0, 2, var3,
                    GlobalStatics_9.localPlayer.waypointsX[0]);
          } else {
            var14 =
                GlobalStatics_9
                    .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 0,
                        false, 0, 2, var2,
                        0, 0, 2, var3,
                        GlobalStatics_9.localPlayer.waypointsX[0]);
            if (!var14) {
              GlobalStatics_9
                  .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                      false, 0, 2, var2,
                      1, 0, 2, var3, GlobalStatics_9.localPlayer.waypointsX[0]);
            }
          }

          GlobalStatics_0.anInt638 = 2;
          ++GlobalStatics_9.anInt1060;
          GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
          GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
          GlobalStatics_7.anInt2958 = 0;
          GlobalStatics_9.SECURE_BUFFER.writePacket(48);
          GlobalStatics_9.SECURE_BUFFER
              .method783(var2 + GlobalStatics_10.REGION_BASE_X, -268435456);
          GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
          GlobalStatics_9.SECURE_BUFFER
              .writeShortLE(-1, GlobalStatics_9.REGION_BASE_Y + var3);
        }

        if (var4 == 38 && DummyClass8
            .method2224((byte) 39, var6, var3, var2)) {
          GlobalStatics_9.SECURE_BUFFER.writePacket(233);
          GlobalStatics_9.SECURE_BUFFER
              .method765(var3 + GlobalStatics_9.REGION_BASE_Y, (byte) 3);
          ++GlobalStatics_9.anInt3017;
          GlobalStatics_9.SECURE_BUFFER
              .method783(GlobalStatics_10.REGION_BASE_X + var2, -268435456);
          GlobalStatics_9.SECURE_BUFFER
              .method765(GlobalStatics_10.anInt278, (byte) 3);
          GlobalStatics_9.SECURE_BUFFER
              .method775(GlobalStatics_9.anInt872, 1437452424);
          GlobalStatics_9.SECURE_BUFFER
              .method783((int) (var6 >>> 32) & Integer.MAX_VALUE,
                  var0 ^ -268432859);
        }

        if (var4 == 13) {
          GlobalStatics_9.SECURE_BUFFER.writePacket(6);
          GlobalStatics_9.SECURE_BUFFER.writeInt(var3);
          GlobalStatics_9.SECURE_BUFFER.method783(var2, -268435456);
          ++GlobalStatics_8.anInt2088;
          GlobalStatics_9.SECURE_BUFFER.writeShortLE(-1, var5);
          GlobalStatics_6.anInt2330 = 0;
          GlobalStatics_5.aClass11_1933 = GlobalStatics_7
              .getWidget((byte) 115, var3);
          GlobalStatics_9.anInt1918 = var2;
        }

        if (var4 == 57) {
          var8 = GlobalStatics_9.PLAYERS[var5];
          if (var8 != null) {
            GlobalStatics_9
                .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                    false, 0, 2,
                    var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                    GlobalStatics_9.localPlayer.waypointsX[0]);
            GlobalStatics_0.anInt638 = 2;
            GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
            ++GlobalStatics_7.anInt685;
            GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
            GlobalStatics_7.anInt2958 = 0;
            GlobalStatics_9.SECURE_BUFFER.writePacket(175);
            GlobalStatics_9.SECURE_BUFFER.method783(var5, -268435456);
          }
        }

        if (var4 == 22) {
          GlobalStatics_9.method958();
          var13 = GlobalStatics_7.getWidget((byte) 123, var3);
          GlTexture2d.anInt3764 = var3;
          DummyClass31.anInt1473 = var2;
          GlobalStatics_9.anInt3012 = 1;
          GlobalStatics_9.anInt2050 = var5;
          DummyClass29.method909(var0 ^ -2612, var13);
          GameStringStatics.aClass94_378 = GlobalStatics_9
              .concat(new GameString[]{
                  GameStringStatics.aClass94_3042,
                  DummyClass35.getItemConfig(var5).aClass94_770,
                  GameStringStatics.aClass94_2562
              });

        } else {
          if (var4 == 50) {
            ++GlobalStatics_3.anInt1858;
            DummyClass8.method2224((byte) 39, var6, var3, var2);
            GlobalStatics_9.SECURE_BUFFER.writePacket(194);
            GlobalStatics_9.SECURE_BUFFER
                .method765(var3 + GlobalStatics_9.REGION_BASE_Y, (byte) 3);
            GlobalStatics_9.SECURE_BUFFER
                .writeShortLE(-1, GlobalStatics_10.REGION_BASE_X + var2);
            GlobalStatics_9.SECURE_BUFFER
                .writeShort((int) (var6 >>> 32) & Integer.MAX_VALUE);
          }

          if (var4 == 48) {
            ++GlobalStatics_9.anInt1677;
            GlobalStatics_9.SECURE_BUFFER.writePacket(154);
            GlobalStatics_9.SECURE_BUFFER.writeShortLE(-1, var2);
            GlobalStatics_9.SECURE_BUFFER.method775(var3, 1437452424);
            GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
            GlobalStatics_6.anInt2330 = 0;
            GlobalStatics_5.aClass11_1933 = GlobalStatics_7
                .getWidget((byte) 119, var3);
            GlobalStatics_9.anInt1918 = var2;
          }

          if (var4 == 30) {
            var8 = GlobalStatics_9.PLAYERS[var5];
            if (var8 != null) {
              ++GlobalStatics_11.anInt759;
              GlobalStatics_9
                  .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                      false, 0, 2,
                      var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                      GlobalStatics_9.localPlayer.waypointsX[0]);
              GlobalStatics_7.anInt2958 = 0;
              GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
              GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
              GlobalStatics_0.anInt638 = 2;
              GlobalStatics_9.SECURE_BUFFER.writePacket(68);
              GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
            }
          }

          if (var4 == 43) {
            ++GlobalStatics_9.anInt3442;
            GlobalStatics_9.SECURE_BUFFER.writePacket(153);
            GlobalStatics_9.SECURE_BUFFER.method785(var3, (byte) -124);
            GlobalStatics_9.SECURE_BUFFER.writeShortLE(-1, var2);
            GlobalStatics_9.SECURE_BUFFER.writeShortLE(var0 - 2598, var5);
            GlobalStatics_6.anInt2330 = 0;
            GlobalStatics_5.aClass11_1933 = GlobalStatics_7
                .getWidget((byte) 112, var3);
            GlobalStatics_9.anInt1918 = var2;
          }

          if (var4 == 39) {
            ++GlobalStatics_6.anInt1883;
            var14 =
                GlobalStatics_9
                    .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 0,
                        false, 0, 2, var2,
                        0, 0, 2, var3,
                        GlobalStatics_9.localPlayer.waypointsX[0]);
            if (!var14) {
              GlobalStatics_9
                  .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                      false, 0, 2, var2,
                      1, 0, 2, var3, GlobalStatics_9.localPlayer.waypointsX[0]);
            }

            GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
            GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
            GlobalStatics_0.anInt638 = 2;
            GlobalStatics_7.anInt2958 = 0;
            GlobalStatics_9.SECURE_BUFFER.writePacket(73);
            GlobalStatics_9.SECURE_BUFFER
                .method775(GlobalStatics_9.anInt872, 1437452424);
            GlobalStatics_9.SECURE_BUFFER
                .writeShort(GlobalStatics_9.REGION_BASE_Y + var3);
            GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
            GlobalStatics_9.SECURE_BUFFER
                .method765(var2 + GlobalStatics_10.REGION_BASE_X, (byte) 3);
            GlobalStatics_9.SECURE_BUFFER
                .writeShortLE(-1, GlobalStatics_10.anInt278);
          }

          if (var0 == 2597) {
            if (var4 == 12) {
              ++DummyClass18.anInt79;
              GlobalStatics_9.SECURE_BUFFER.writePacket(82);
              GlobalStatics_9.SECURE_BUFFER
                  .writeShort(GlobalStatics_10.anInt278);
              GlobalStatics_9.SECURE_BUFFER
                  .method775(var3, 1437452424);
              GlobalStatics_9.SECURE_BUFFER.writeInt(GlobalStatics_9.anInt872);
              GlobalStatics_9.SECURE_BUFFER.method765(var2, (byte) 3);
            }

            if (var4 == 36) {
              if (var5 == 0) {
                GlobalStatics_8.anInt1521 = 1;
                GlobalStatics_4
                    .method589(GlobalStatics_9.currentPlane, var2, var3);
              } else {
                if (GlobalStatics_10.PLAYER_RIGHTS > 0
                    && GlobalStatics_8.PRESSED_KEYS[82]
                    && GlobalStatics_8.PRESSED_KEYS[81]) {
                  GlobalStatics_6.method979(var2 + GlobalStatics_10.REGION_BASE_X,
                      GlobalStatics_9.REGION_BASE_Y + var3,
                      GlobalStatics_9.currentPlane,
                      (byte) -4);
                } else {
                  ++GlobalStatics_6.anInt2479;
                  GlobalStatics_9.SECURE_BUFFER.writePacket(179);
                  GlobalStatics_9.SECURE_BUFFER
                      .writeShort(var3 + GlobalStatics_9.REGION_BASE_Y);
                  GlobalStatics_9.SECURE_BUFFER
                      .writeShort(var2 + GlobalStatics_10.REGION_BASE_X);
                }
              }
            }

            if (var4 == 6) {
              var8 = GlobalStatics_9.PLAYERS[var5];
              if (var8 != null) {
                GlobalStatics_9
                    .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                        false, 0, 2,
                        var8.waypointsX[0], 1, 0, 2, var8.waypointsY[0],
                        GlobalStatics_9.localPlayer.waypointsX[0]);
                GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
                ++GlobalStatics_9.anInt3640;
                GlobalStatics_7.anInt2958 = 0;
                GlobalStatics_0.anInt638 = 2;
                GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
                GlobalStatics_9.SECURE_BUFFER.writePacket(106);
                GlobalStatics_9.SECURE_BUFFER.writeShort(var5);
              }
            }

            if (var4 == 20) {
              ++GlobalStatics_9.anInt2640;
              if (GlobalStatics_5.gameId == 1) {
                GlobalStatics_9
                    .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                        false, 0, 2,
                        var2, 1, 0, 2, var3,
                        GlobalStatics_9.localPlayer.waypointsX[0]);
              } else {
                var14 =
                    GlobalStatics_9
                        .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0,
                            0, false, 0, 2,
                            var2, 0, 0, 2, var3,
                            GlobalStatics_9.localPlayer.waypointsX[0]);
                if (!var14) {
                  GlobalStatics_9
                      .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0,
                          1,
                          false, 0, 2,
                          var2, 1, 0, 2, var3,
                          GlobalStatics_9.localPlayer.waypointsX[0]);
                }
              }

              GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
              GlobalStatics_7.anInt2958 = 0;
              GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
              GlobalStatics_0.anInt638 = 2;
              GlobalStatics_9.SECURE_BUFFER.writePacket(33);
              GlobalStatics_9.SECURE_BUFFER.writeShort(var5);
              GlobalStatics_9.SECURE_BUFFER
                  .writeShort(GlobalStatics_10.REGION_BASE_X + var2);
              GlobalStatics_9.SECURE_BUFFER
                  .writeShortLE(-1, GlobalStatics_9.REGION_BASE_Y + var3);
            }

            if (var4 == 16) {
              var11 = GlobalStatics_8.NPCS[var5];
              if (var11 != null) {
                ++GlobalStatics_9.anInt3677;
                GlobalStatics_9
                    .method582(GlobalStatics_9.localPlayer.waypointsY[0], 0, 1,
                        false, 0, 2,
                        var11.waypointsX[0], 1, 0, 2, var11.waypointsY[0],
                        GlobalStatics_9.localPlayer.waypointsX[0]);
                GlobalStatics_9.anInt1053 = DummyClass5.anInt2993;
                GlobalStatics_7.anInt2958 = 0;
                GlobalStatics_7.anInt4062 = DummyClass36.anInt2614;
                GlobalStatics_0.anInt638 = 2;
                GlobalStatics_9.SECURE_BUFFER.writePacket(3);
                GlobalStatics_9.SECURE_BUFFER.method765(var5, (byte) 3);
              }
            }

            if (GlobalStatics_9.anInt3012 != 0) {
              GlobalStatics_9.anInt3012 = 0;
              DummyClass29.method909(120,
                  GlobalStatics_7
                      .getWidget((byte) 121, GlTexture2d.anInt3764));
            }

            if (GlobalStatics_9.aBoolean1837) {
              GlobalStatics_9.method958();
            }

            if (GlobalStatics_5.aClass11_1933 != null
                && GlobalStatics_6.anInt2330 == 0) {
              DummyClass29
                  .method909(-106, GlobalStatics_5.aClass11_1933);
            }

          }
        }
      }
    }
  }

  public static void clear22(int var0) {
    GlobalStatics_8.MAP_PREFIX = null;
    if (var0 != 1) {
      GlobalStatics_8.anIntArray3804 = null;
    }

    GlobalStatics_8.anIntArray3805 = null;
    GlobalStatics_8.anIntArray3804 = null;
    GlobalStatics_8.titlePrefixes = null;
  }

  public static int method809(int var0, int y, int var2, int x, int var4) {
    if (GlobalStatics_10.aBoolean3387) {
      var0 = 1000000;
      GlobalStatics_10.aBoolean3387 = false;
    }

    BlockConfig config = DummyClass27.blockConfigs[x][y];
    float var7 = (var2 * 0.1F + 0.7F) * config.aFloat1187;
    float var8 = config.aFloat1190;
    int var6 = config.anInt1177;
    int var11 = config.anInt1184;
    int var10 = config.anInt1175;
    if (!DummyClass35.aBoolean661) {
      var11 = 0;
    }

    float var9 = config.aFloat1189;
    if (var6 != DummyClass44.anInt932 || GlobalStatics_3.aFloat2457 != var7
        || GlobalStatics_9.aFloat3044 != var8
        || var9 != GlobalStatics_10.aFloat246
        || GlobalStatics_9.anInt1345 != var10
        || DummyClass22.anInt1736 != var11) {
      GlobalStatics_3.aFloat2457 = var7;
      GlobalStatics_10.aFloat3435 = GlobalStatics_10.diffuseIntensity;
      GlobalStatics_9.aFloat3105 = GlobalStatics_6.ambientIntensity;
      DummyClass44.anInt932 = var6;
      GlobalStatics_5.anInt1971 = GlobalStatics_9.fogColor;
      GlobalStatics_8.anInt1407 = GlobalStatics_7.fogOffset;
      GlobalStatics_10.aFloat246 = var9;
      GlobalStatics_0.anInt72 = 0;
      GlobalStatics_10.anInt4037 = GlobalStatics_8.SUN_COLOR;
      DummyClass22.anInt1736 = var11;
      GlobalStatics_9.aFloat3044 = var8;
      GlobalStatics_9.anInt1345 = var10;
      DummyClass31.aFloat1475 = GlobalStatics_9.aFloat319;
    }

    if (GlobalStatics_0.anInt72 < 65536) {
      GlobalStatics_0.anInt72 += 250 * var0;
      if (GlobalStatics_0.anInt72 >= 65536) {
        GlobalStatics_0.anInt72 = 65536;
      }

      float var15 = GlobalStatics_0.anInt72 / 65536.0F;
      int var13 = GlobalStatics_0.anInt72 >> 8;
      int var12 = GlobalStatics_0.anInt72 + 65536 >> 8;
      GlobalStatics_9.fogColor =
          (-16711936 & var13 * (GlobalStatics_9.anInt1345 & 16711935)
              + (16711935 & GlobalStatics_5.anInt1971) * var12) + (
              16711680
                  & var12 * (GlobalStatics_5.anInt1971 & 0xff00)
                  + (0xff00 & GlobalStatics_9.anInt1345) * var13) >> 8;
      GlobalStatics_9.fogColor = GlEnvironment.DEFAULT_FOG_COLOR;
      float var14 =
          (65536 - GlobalStatics_0.anInt72)
              / 65536.0F;
      GlobalStatics_6.ambientIntensity =
          var14 * GlobalStatics_9.aFloat3105
              + var15 * GlobalStatics_3.aFloat2457;
      GlobalStatics_10.diffuseIntensity =
          GlobalStatics_10.aFloat3435 * var14
              + var15 * GlobalStatics_9.aFloat3044;
      GlobalStatics_9.aFloat319 =
          var15 * GlobalStatics_10.aFloat246 + var14 * DummyClass31.aFloat1475;

      //TODO there is something wrong with this sun color updating
      GlobalStatics_8.SUN_COLOR =
          (16711680 & (DummyClass44.anInt932 & 0xff00) * var13 + var12 * (
              GlobalStatics_10.anInt4037 & 0xff00)) + (
              (16711935 & GlobalStatics_10.anInt4037) * var12 +
                  (DummyClass44.anInt932 & 0xff00ff)
                      * var13 & -16711936) >> 8;
      GlobalStatics_7.fogOffset =
          var13 * DummyClass22.anInt1736 + var12 * GlobalStatics_8.anInt1407
              >> 8;
    }

    GlEnvironment
        .setSunColor(GlobalStatics_8.SUN_COLOR,
            GlobalStatics_6.ambientIntensity,
            GlobalStatics_10.diffuseIntensity, GlobalStatics_9.aFloat319);
    GlEnvironment
        .setFogColor(GlobalStatics_9.fogColor, GlobalStatics_7.fogOffset);
    GlEnvironment.setSunPosition(DummyClass39.sunPositionX,
        GlobalStatics_9.sunPositionY,
        GlobalStatics_0.sunPositionZ);
    GlEnvironment.updateSunPosition();
    return GlobalStatics_9.fogColor;
  }

  public static int method810(byte var0, int var1) {
    return var0 == 3 ? 255 & var1 : 74;
  }

  public static void method813(int var0) {
    GlobalStatics_9.aClass93_3572.method1523();
    if (var0 == 1974) {
      DummyClass15.aClass93_1874.method1523();
      GlobalStatics_9.aClass93_1013.method1523();
    }
  }

  public static void method819(boolean var0) {
    SomethingPacket151 var1 = (SomethingPacket151) GlobalStatics_10.aClass130_3208
        .getFirst(73);
    if (!var0) {
      for (; var1 != null;
          var1 = (SomethingPacket151) GlobalStatics_10.aClass130_3208
              .getNext(-76)) {
        int var2 = var1.anInt2602;
        if (GlobalStatics_11.method57(var2, 104)) {
          boolean var3 = true;
          Widget[] var4 = GlobalStatics_9.aClass11ArrayArray1834[var2];

          int var5;
          for (var5 = 0; var4.length > var5; ++var5) {
            if (var4[var5] != null) {
              var3 = var4[var5].aBoolean233;
              break;
            }
          }

          if (!var3) {
            var5 = (int) var1.key;
            Widget var6 = GlobalStatics_7.getWidget((byte) 123, var5);
            if (var6 != null) {
              DummyClass29.method909(117, var6);
            }
          }
        }
      }

    }
  }

  public static Widget method42(Widget var0) {
    int var1 = GlobalStatics_8.method44(var0).method94((byte) -74);
    if (var1 == 0) {
      return null;
    } else {
      for (int var2 = 0; var2 < var1; ++var2) {
        var0 = GlobalStatics_7.getWidget((byte) 127, var0.anInt190);
        if (var0 == null) {
          return null;
        }
      }

      return var0;
    }
  }

  public static void clear0(boolean var0) {
    if (!var0) {
      GLStatics.aClass3_Sub11ArrayArray2199 = null;
    }

    GlobalStatics_1.mapFileIds = null;
    GlobalStatics_1.aClass94_2196 = null;
    GlobalStatics_8.aClass94_2198 = null;
    GlobalStatics_1.aClass130_2194 = null;
    GlobalStatics_1.aClass94_2197 = null;
    GLStatics.aClass3_Sub11ArrayArray2199 = null;
  }

  public static WidgetAccess method44(Widget var0) {
    WidgetAccess var1 = (WidgetAccess) DummyClass23.aClass130_1659.get(
        ((long) var0.anInt279 << 32) + var0.anInt191);
    return var1 != null ? var1 : var0.aClass3_Sub1_257;
  }

  public static AnimationSequence method45(int id, byte var1) {
    if (var1 != -20) {
      GLStatics.aClass3_Sub11ArrayArray2199 = null;
    }

    AnimationSequence var2 = (AnimationSequence) GlobalStatics_9.aClass93_1146
        .get(
            id);
    if (var2 == null) {
      byte[] var3 = GlobalStatics_3.animationSequences.getBytes(
          GlobalStatics_4.method1765(id, -1732504441),
          GlobalStatics_9.method1262(117, id));
      var2 = new AnimationSequence();
      var2.anInt1864 = id;
      if (var3 != null) {
        var2.method2053(new Buffer(var3), (byte) -102);
      }

      var2.method2058((byte) -41);
      GlobalStatics_9.aClass93_1146.get((byte) -103, var2, id);
      return var2;
    } else {
      return var2;
    }

  }

  public static void method50(Widget[] var0, int var1, int var2, int var3,
      int var4, int var5,
      int var6, int var7) {
    for (Widget var9 : var0) {
      if (var9 != null && var9.anInt190 == var1 && (!var9.aBoolean233
          || var9.anInt187 == 0
          || var9.aBoolean195 || GlobalStatics_8.method44(var9).anInt2205 != 0
          || var9 == DummyClass18.aClass11_88
          || var9.anInt189 == 1338) && (!var9.aBoolean233 || !GlobalStatics_8
          .method51(var9))) {
        int var10 = var9.anInt306 + var6;
        int var11 = var9.anInt210 + var7;
        int var12;
        int var13;
        int var14;
        int var15;
        if (var9.anInt187 == 2) {
          var12 = var2;
          var13 = var3;
          var14 = var4;
          var15 = var5;
        } else {
          int var16 = var10 + var9.anInt168;
          int var17 = var11 + var9.zoom;
          if (var9.anInt187 == 9) {
            ++var16;
            ++var17;
          }

          var12 = var10 > var2 ? var10 : var2;
          var13 = var11 > var3 ? var11 : var3;
          var14 = var16 < var4 ? var16 : var4;
          var15 = var17 < var5 ? var17 : var5;
        }

        if (var9 == DummyClass42.aClass11_886) {
          DummyClass60.aBoolean440 = true;
          GlobalStatics_9.anInt2421 = var10;
          GlobalStatics_2.anInt2218 = var11;
        }

        if (!var9.aBoolean233 || var12 < var14 && var13 < var15) {
          if (var9.anInt187 == 0) {
            if (!var9.aBoolean233 && GlobalStatics_8.method51(var9)
                && DummyClass56.aClass11_1453 != var9) {
              continue;
            }

            if (var9.aBoolean219 && GlobalStatics_9.anInt1676 >= var12
                && GlobalStatics_0.anInt1709
                >= var13
                && GlobalStatics_9.anInt1676 < var14
                && GlobalStatics_0.anInt1709
                < var15) {
              for (ClientScriptCall var27 =
                  (ClientScriptCall) DummyClass31.aClass61_1471.getFirst();
                  var27 != null;
                  var27 = (ClientScriptCall) DummyClass31.aClass61_1471
                      .getNext()) {
                if (var27.aBoolean2446) {
                  var27.unlinkNode();
                  var27.aClass11_2449.aBoolean163 = false;
                }
              }

              if (GlobalStatics_9.anInt2658 == 0) {
                DummyClass42.aClass11_886 = null;
                DummyClass18.aClass11_88 = null;
              }

              GlobalStatics_6.anInt2475 = 0;
            }
          }

          if (var9.aBoolean233) {
            boolean var26;
            var26 = GlobalStatics_9.anInt1676 >= var12
                && GlobalStatics_0.anInt1709
                >= var13
                && GlobalStatics_9.anInt1676 < var14
                && GlobalStatics_0.anInt1709
                < var15;

            boolean var25 = false;
            if (GlobalStatics_10.anInt3069 == 1 && var26) {
              var25 = true;
            }

            boolean var18 = false;
            if (GlobalStatics_9.anInt3644 == 1 && DummyClass5.anInt2993 >= var12
                && DummyClass36.anInt2614 >= var13
                && DummyClass5.anInt2993 < var14
                && DummyClass36.anInt2614 < var15) {
              var18 = true;
            }

            int var19;
            int var21;
            if (var9.aByteArray263 != null) {
              for (var19 = 0; var19 < var9.aByteArray263.length; ++var19) {
                if (!GlobalStatics_8.PRESSED_KEYS[var9.aByteArray263[var19]]) {
                  if (var9.anIntArray310 != null) {
                    var9.anIntArray310[var19] = 0;
                  }
                } else if (var9.anIntArray310 == null
                    || GlobalStatics_4.updateCycle
                    >= var9.anIntArray310[var19]) {
                  byte var20 = var9.aByteArray231[var19];
                  if (var20 == 0
                      || ((var20 & 2) == 0
                      || GlobalStatics_8.PRESSED_KEYS[86]) && (
                      (var20 & 1) == 0
                          || GlobalStatics_8.PRESSED_KEYS[82]) && (
                      (var20 & 4) == 0
                          || GlobalStatics_8.PRESSED_KEYS[81])) {
                    GlobalStatics_11
                        .method66(GameStringStatics.EMPTY_STRING, -1, var19 + 1,
                            (byte) -29, var9.anInt279);
                    var21 = var9.anIntArray299[var19];
                    if (var9.anIntArray310 == null) {
                      var9.anIntArray310 = new int[var9.aByteArray263.length];
                    }

                    if (var21 == 0) {
                      var9.anIntArray310[var19] = Integer.MAX_VALUE;
                    } else {
                      var9.anIntArray310[var19] =
                          GlobalStatics_4.updateCycle + var21;
                    }
                  }
                }
              }
            }

            if (var18) {
              GlobalStatics_10
                  .createIndexedColorSprite(DummyClass36.anInt2614 - var11,
                      DummyClass5.anInt2993 - var10, 97, var9);
            }

            if (DummyClass42.aClass11_886 != null
                && DummyClass42.aClass11_886 != var9 && var26
                && GlobalStatics_8.method44(var9).method98(false)) {
              DummyClass32.aClass11_526 = var9;
            }

            if (var9 == DummyClass18.aClass11_88) {
              DummyClass52.aBoolean1167 = true;
              GlobalStatics_10.anInt3156 = var10;
              DummyClass21.anInt1761 = var11;
            }

            if (var9.aBoolean195 || var9.anInt189 != 0) {
              ClientScriptCall var30;
              if (var26 && GlobalStatics_9.mouseWheelOffset != 0
                  && var9.anObjectArray183 != null) {
                var30 = new ClientScriptCall();
                var30.aBoolean2446 = true;
                var30.aClass11_2449 = var9;
                var30.anInt2441 = GlobalStatics_9.mouseWheelOffset;
                var30.arguments = var9.anObjectArray183;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (DummyClass42.aClass11_886 != null
                  || GlobalStatics_9.aClass11_1017 != null
                  || DummyClass36.aBoolean2615
                  || var9.anInt189 != 1400 && GlobalStatics_6.anInt2475 > 0) {
                var18 = false;
                var25 = false;
                var26 = false;
              }

              int var29;
              if (var9.anInt189 != 0) {
                if (var9.anInt189 == 1337) {
                  GlobalStatics_8.aClass11_2091 = var9;
                  DummyClass29.method909(124, var9);
                  continue;
                }

                if (var9.anInt189 == 1338) {
                  if (var18) {
                    DummyClass3.anInt56 = DummyClass5.anInt2993 - var10;
                    DummyClass43.anInt916 = DummyClass36.anInt2614 - var11;
                  }
                  continue;
                }

                if (var9.anInt189 == 1400) {
                  GlobalStatics_9.aClass11_3551 = var9;
                  if (var18) {
                    if (GlobalStatics_8.PRESSED_KEYS[82]
                        && GlobalStatics_10.PLAYER_RIGHTS > 0) {
                      var19 =
                          (int) ((DummyClass5.anInt2993 - var10
                              - var9.anInt168 / 2)
                              * 2.0D
                              / GlobalStatics_4.aFloat727);
                      var29 =
                          (int) ((DummyClass36.anInt2614 - var11
                              - var9.zoom / 2)
                              * 2.0D
                              / GlobalStatics_4.aFloat727);
                      var21 = GlobalStatics_9.anInt3536 + var19;
                      int var32 = GlobalStatics_9.anInt2251 + var29;
                      int var23 = var21 + GlobalStatics_10.anInt3256;
                      int var24 =
                          DummyClass58.anInt1460 - 1 - var32
                              + GlobalStatics_9.anInt65;
                      GlobalStatics_6.method979(var23, var24, 0, (byte) -4);
                      GlobalStatics_9.method264((byte) 126);
                      continue;
                    }

                    GlobalStatics_6.anInt2475 = 1;
                    GlobalStatics_6.anInt1881 = GlobalStatics_9.anInt1676;
                    DummyClass53.anInt1336 = GlobalStatics_0.anInt1709;
                    continue;
                  }

                  if (var25 && GlobalStatics_6.anInt2475 > 0) {
                    if (GlobalStatics_6.anInt2475 == 1 && (
                        GlobalStatics_6.anInt1881 != GlobalStatics_9.anInt1676
                            || DummyClass53.anInt1336
                            != GlobalStatics_0.anInt1709)) {
                      GlobalStatics_9.anInt4073 = GlobalStatics_9.anInt3536;
                      DummyClass35.anInt660 = GlobalStatics_9.anInt2251;
                      GlobalStatics_6.anInt2475 = 2;
                    }

                    if (GlobalStatics_6.anInt2475 == 2) {
                      GlobalStatics_9
                          .method1175(GlobalStatics_9.anInt4073 + (int) (
                              (GlobalStatics_6.anInt1881
                                  - GlobalStatics_9.anInt1676) * 2.0D
                                  / GlobalStatics_9.aFloat3979), 112);
                      GlobalStatics_9
                          .method354(-126, DummyClass35.anInt660 + (int) (
                              (DummyClass53.anInt1336
                                  - GlobalStatics_0.anInt1709)
                                  * 2.0D
                                  / GlobalStatics_9.aFloat3979));
                    }
                    continue;
                  }

                  GlobalStatics_6.anInt2475 = 0;
                  continue;
                }

                if (var9.anInt189 == 1401) {
                  if (var25) {
                    GlobalStatics_10.method253(-22611, var9.anInt168,
                        GlobalStatics_0.anInt1709
                            - var11,
                        GlobalStatics_9.anInt1676 - var10, var9.zoom);
                  }
                  continue;
                }

                if (var9.anInt189 == 1402) {
                  if (!GlRenderer.USE_OPENGL) {
                    DummyClass29.method909(113, var9);
                  }
                  continue;
                }
              }

              if (!var9.aBoolean188 && var18) {
                var9.aBoolean188 = true;
                if (var9.anObjectArray165 != null) {
                  var30 = new ClientScriptCall();
                  var30.aBoolean2446 = true;
                  var30.aClass11_2449 = var9;
                  var30.anInt2447 = DummyClass5.anInt2993 - var10;
                  var30.anInt2441 = DummyClass36.anInt2614 - var11;
                  var30.arguments = var9.anObjectArray165;
                  DummyClass31.aClass61_1471.addLast(var30);
                }
              }

              if (var9.aBoolean188 && var25 && var9.anObjectArray170 != null) {
                var30 = new ClientScriptCall();
                var30.aBoolean2446 = true;
                var30.aClass11_2449 = var9;
                var30.anInt2447 = GlobalStatics_9.anInt1676 - var10;
                var30.anInt2441 =
                    GlobalStatics_0.anInt1709
                        - var11;
                var30.arguments = var9.anObjectArray170;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (var9.aBoolean188 && !var25) {
                var9.aBoolean188 = false;
                if (var9.anObjectArray239 != null) {
                  var30 = new ClientScriptCall();
                  var30.aBoolean2446 = true;
                  var30.aClass11_2449 = var9;
                  var30.anInt2447 = GlobalStatics_9.anInt1676 - var10;
                  var30.anInt2441 =
                      GlobalStatics_0.anInt1709
                          - var11;
                  var30.arguments = var9.anObjectArray239;
                  DummyClass45.aClass61_983.addLast(var30);
                }
              }

              if (var25 && var9.anObjectArray180 != null) {
                var30 = new ClientScriptCall();
                var30.aBoolean2446 = true;
                var30.aClass11_2449 = var9;
                var30.anInt2447 = GlobalStatics_9.anInt1676 - var10;
                var30.anInt2441 =
                    GlobalStatics_0.anInt1709
                        - var11;
                var30.arguments = var9.anObjectArray180;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (!var9.aBoolean163 && var26) {
                var9.aBoolean163 = true;
                if (var9.anObjectArray248 != null) {
                  var30 = new ClientScriptCall();
                  var30.aBoolean2446 = true;
                  var30.aClass11_2449 = var9;
                  var30.anInt2447 = GlobalStatics_9.anInt1676 - var10;
                  var30.anInt2441 =
                      GlobalStatics_0.anInt1709
                          - var11;
                  var30.arguments = var9.anObjectArray248;
                  DummyClass31.aClass61_1471.addLast(var30);
                }
              }

              if (var9.aBoolean163 && var26 && var9.anObjectArray276 != null) {
                var30 = new ClientScriptCall();
                var30.aBoolean2446 = true;
                var30.aClass11_2449 = var9;
                var30.anInt2447 = GlobalStatics_9.anInt1676 - var10;
                var30.anInt2441 =
                    GlobalStatics_0.anInt1709
                        - var11;
                var30.arguments = var9.anObjectArray276;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (var9.aBoolean163 && !var26) {
                var9.aBoolean163 = false;
                if (var9.anObjectArray281 != null) {
                  var30 = new ClientScriptCall();
                  var30.aBoolean2446 = true;
                  var30.aClass11_2449 = var9;
                  var30.anInt2447 = GlobalStatics_9.anInt1676 - var10;
                  var30.anInt2441 =
                      GlobalStatics_0.anInt1709
                          - var11;
                  var30.arguments = var9.anObjectArray281;
                  DummyClass45.aClass61_983.addLast(var30);
                }
              }

              if (var9.anObjectArray269 != null) {
                var30 = new ClientScriptCall();
                var30.aClass11_2449 = var9;
                var30.arguments = var9.anObjectArray269;
                DummyClass18.aClass61_82.addLast(var30);
              }

              ClientScriptCall var22;
              if (var9.anObjectArray161 != null
                  && DummyClass18.anInt87 > var9.anInt284) {
                if (var9.anIntArray211 != null
                    && DummyClass18.anInt87 - var9.anInt284 <= 32) {
                  label531:
                  for (var19 = var9.anInt284; var19 < DummyClass18.anInt87;
                      ++var19) {
                    var29 = GlobalStatics_9.anIntArray3986[var19 & 31];

                    for (var21 = 0; var21 < var9.anIntArray211.length;
                        ++var21) {
                      if (var9.anIntArray211[var21] == var29) {
                        var22 = new ClientScriptCall();
                        var22.aClass11_2449 = var9;
                        var22.arguments = var9.anObjectArray161;
                        DummyClass31.aClass61_1471.addLast(var22);
                        break label531;
                      }
                    }
                  }
                } else {
                  var30 = new ClientScriptCall();
                  var30.aClass11_2449 = var9;
                  var30.arguments = var9.anObjectArray161;
                  DummyClass31.aClass61_1471.addLast(var30);
                }

                var9.anInt284 = DummyClass18.anInt87;
              }

              if (var9.anObjectArray221 != null
                  && GlobalStatics_6.anInt2317 > var9.anInt242) {
                if (var9.anIntArray185 != null
                    && GlobalStatics_6.anInt2317 - var9.anInt242 <= 32) {
                  label512:
                  for (var19 = var9.anInt242; var19 < GlobalStatics_6.anInt2317;
                      ++var19) {
                    var29 = DummyClass8.anIntArray4025[var19 & 31];

                    for (var21 = 0; var21 < var9.anIntArray185.length;
                        ++var21) {
                      if (var9.anIntArray185[var21] == var29) {
                        var22 = new ClientScriptCall();
                        var22.aClass11_2449 = var9;
                        var22.arguments = var9.anObjectArray221;
                        DummyClass31.aClass61_1471.addLast(var22);
                        break label512;
                      }
                    }
                  }
                } else {
                  var30 = new ClientScriptCall();
                  var30.aClass11_2449 = var9;
                  var30.arguments = var9.anObjectArray221;
                  DummyClass31.aClass61_1471.addLast(var30);
                }

                var9.anInt242 = GlobalStatics_6.anInt2317;
              }

              if (var9.anObjectArray282 != null
                  && GlobalStatics_0.anInt641
                  > var9.anInt213) {
                if (var9.anIntArray286 != null
                    && GlobalStatics_0.anInt641
                    - var9.anInt213 <= 32) {
                  label493:
                  for (var19 = var9.anInt213; var19
                      < GlobalStatics_0.anInt641;
                      ++var19) {
                    var29 = GlobalStatics_4.anIntArray726[var19 & 31];

                    for (var21 = 0; var21 < var9.anIntArray286.length;
                        ++var21) {
                      if (var9.anIntArray286[var21] == var29) {
                        var22 = new ClientScriptCall();
                        var22.aClass11_2449 = var9;
                        var22.arguments = var9.anObjectArray282;
                        DummyClass31.aClass61_1471.addLast(var22);
                        break label493;
                      }
                    }
                  }
                } else {
                  var30 = new ClientScriptCall();
                  var30.aClass11_2449 = var9;
                  var30.arguments = var9.anObjectArray282;
                  DummyClass31.aClass61_1471.addLast(var30);
                }

                var9.anInt213 = GlobalStatics_0.anInt641;
              }

              if (var9.anObjectArray174 != null
                  && GlobalStatics_8.anInt944 > var9.anInt255) {
                if (var9.anIntArray175 != null
                    && GlobalStatics_8.anInt944 - var9.anInt255 <= 32) {
                  label474:
                  for (var19 = var9.anInt255; var19 < GlobalStatics_8.anInt944;
                      ++var19) {
                    var29 = GlobalStatics_9.anIntArray3565[var19 & 31];

                    for (var21 = 0; var21 < var9.anIntArray175.length;
                        ++var21) {
                      if (var9.anIntArray175[var21] == var29) {
                        var22 = new ClientScriptCall();
                        var22.aClass11_2449 = var9;
                        var22.arguments = var9.anObjectArray174;
                        DummyClass31.aClass61_1471.addLast(var22);
                        break label474;
                      }
                    }
                  }
                } else {
                  var30 = new ClientScriptCall();
                  var30.aClass11_2449 = var9;
                  var30.arguments = var9.anObjectArray174;
                  DummyClass31.aClass61_1471.addLast(var30);
                }

                var9.anInt255 = GlobalStatics_8.anInt944;
              }

              if (var9.anObjectArray158 != null
                  && GlobalStatics_9.anInt815 > var9.anInt311) {
                if (var9.anIntArray274 != null
                    && GlobalStatics_9.anInt815 - var9.anInt311 <= 32) {
                  label455:
                  for (var19 = var9.anInt311; var19 < GlobalStatics_9.anInt815;
                      ++var19) {
                    var29 = GlobalStatics_9.anIntArray3780[var19 & 31];

                    for (var21 = 0; var21 < var9.anIntArray274.length;
                        ++var21) {
                      if (var9.anIntArray274[var21] == var29) {
                        var22 = new ClientScriptCall();
                        var22.aClass11_2449 = var9;
                        var22.arguments = var9.anObjectArray158;
                        DummyClass31.aClass61_1471.addLast(var22);
                        break label455;
                      }
                    }
                  }
                } else {
                  var30 = new ClientScriptCall();
                  var30.aClass11_2449 = var9;
                  var30.arguments = var9.anObjectArray158;
                  DummyClass31.aClass61_1471.addLast(var30);
                }

                var9.anInt311 = GlobalStatics_9.anInt815;
              }

              if (GlobalStatics_9.anInt472 > var9.anInt234
                  && var9.anObjectArray256 != null) {
                var30 = new ClientScriptCall();
                var30.aClass11_2449 = var9;
                var30.arguments = var9.anObjectArray256;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (DummyClass31.anInt1472 > var9.anInt234
                  && var9.anObjectArray156 != null) {
                var30 = new ClientScriptCall();
                var30.aClass11_2449 = var9;
                var30.arguments = var9.anObjectArray156;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (DummyClass10.anInt2087 > var9.anInt234
                  && var9.anObjectArray313 != null) {
                var30 = new ClientScriptCall();
                var30.aClass11_2449 = var9;
                var30.arguments = var9.anObjectArray313;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (GlobalStatics_6.anInt1642 > var9.anInt234
                  && var9.anObjectArray268 != null) {
                var30 = new ClientScriptCall();
                var30.aClass11_2449 = var9;
                var30.arguments = var9.anObjectArray268;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              if (GlobalStatics_9.anInt2905 > var9.anInt234
                  && var9.anObjectArray315 != null) {
                var30 = new ClientScriptCall();
                var30.aClass11_2449 = var9;
                var30.arguments = var9.anObjectArray315;
                DummyClass31.aClass61_1471.addLast(var30);
              }

              var9.anInt234 = GlobalStatics_10.anInt3213;
              if (var9.anObjectArray220 != null) {
                for (var19 = 0; var19 < GlobalStatics_9.anInt2537;
                    ++var19) {
                  ClientScriptCall var31 = new ClientScriptCall();
                  var31.aClass11_2449 = var9;
                  var31.anInt2444 = GlobalStatics_9.anIntArray1755[var19];
                  var31.anInt2443 = GlobalStatics_7.anIntArray1638[var19];
                  var31.arguments = var9.anObjectArray220;
                  DummyClass31.aClass61_1471.addLast(var31);
                }
              }

              if (GlobalStatics_9.aBoolean3531
                  && var9.anObjectArray217 != null) {
                var30 = new ClientScriptCall();
                var30.aClass11_2449 = var9;
                var30.arguments = var9.anObjectArray217;
                DummyClass31.aClass61_1471.addLast(var30);
              }
            }
          }

          if (!var9.aBoolean233 && DummyClass42.aClass11_886 == null
              && GlobalStatics_9.aClass11_1017 == null
              && !DummyClass36.aBoolean2615) {
            if ((var9.anInt212 >= 0 || var9.anInt228 != 0)
                && GlobalStatics_9.anInt1676 >= var12
                && GlobalStatics_0.anInt1709
                >= var13
                && GlobalStatics_9.anInt1676 < var14
                && GlobalStatics_0.anInt1709
                < var15) {
              if (var9.anInt212 >= 0) {
                DummyClass56.aClass11_1453 = var0[var9.anInt212];
              } else {
                DummyClass56.aClass11_1453 = var9;
              }
            }

            if (var9.anInt187 == 8 && GlobalStatics_9.anInt1676 >= var12
                && GlobalStatics_0.anInt1709
                >= var13
                && GlobalStatics_9.anInt1676 < var14
                && GlobalStatics_0.anInt1709
                < var15) {
              DummyClass29.aClass11_439 = var9;
            }

            if (var9.anInt252 > var9.zoom) {
              DummyClass20
                  .method1819(
                      GlobalStatics_0.anInt1709,
                      var9.zoom, var9,
                      (byte) -101,
                      GlobalStatics_9.anInt1676, var10 + var9.anInt168, var11,
                      var9.anInt252);
            }
          }

          if (var9.anInt187 == 0) {
            GlobalStatics_8
                .method50(var0, var9.anInt279, var12, var13, var14, var15,
                    var10 - var9.anInt247,
                    var11 - var9.anInt208);
            if (var9.aClass11Array262 != null) {
              GlobalStatics_8
                  .method50(var9.aClass11Array262, var9.anInt279, var12, var13,
                      var14, var15,
                      var10 - var9.anInt247, var11 - var9.anInt208);
            }

            SomethingPacket151 var28 =
                (SomethingPacket151) GlobalStatics_10.aClass130_3208.get(
                    var9.anInt279);
            if (var28 != null) {
              GlobalStatics_9
                  .method967(var10, var13, 2, var11, var14, var28.anInt2602,
                      var12,
                      var15);
            }
          }
        }
      }
    }

  }

  public static boolean method51(Widget var0) {
    if (GlobalStatics_9.aBoolean1040) {
      if (GlobalStatics_8.method44(var0).anInt2205 != 0) {
        return false;
      }

      if (var0.anInt187 == 0) {
        return false;
      }
    }

    return var0.aBoolean155;
  }

  public static void method2285(int var0, int var1, int var2, int var3,
      int var5) {
    GlobalStatics_0.anInt2587 = var1;
    GlobalStatics_9.anInt3103 = var5;
    GlobalStatics_9.anInt2938 = var0;
    GlobalStatics_10.anInt144 = var3;
    GlobalStatics_6.anInt3695 = var2;
  }

  public static int method2286(byte var0) {
    if (var0 != -5) {
      GlobalStatics_8.serverHost = null;
    }

    return 6;
  }

  public static int method2287(int var0, byte var1) {
    return (var0 < 97 || var0 > 122) && (var0 < 224 || var0 > 254 ||
        var0 == 247) ?
        var0 == 255 ? 159 : var0 == 156 ? 140 : var1 == 59 ? var0 : 72 :
        var0 - 32;
  }

  public static void clear59(boolean var0) {
    GlobalStatics_8.anIntArray2113 = null;
    GlobalStatics_8.aClass94_2116 = null;
    GlobalStatics_8.aClass96Array2114 = null;
    GlobalStatics_8.DEFAULT_INVENTORY_OPTIONS = null;
    if (var0) {
      GlobalStatics_8.method2287(-64, (byte) -87);
    }

    GlobalStatics_8.serverHost = null;
  }

  public static AbstractModel method1957(int var0, boolean var1,
      AnimationSequence var2, int var3,
      int var4, int var5, int var6, int var7, AbstractModel var8,
      int var9, int var10, int var11, int var12, byte var13) {
    long var14 =
        ((long) var4 << 48) + (var7 + (var0 << 16) + (var12 << 24)) + (
            (long) var6 << 32);
    AbstractModel var16 = (AbstractModel) GlobalStatics_7.aClass93_2982
        .get(var14);
    int var21;
    int var23;
    int var25;
    int var24;
    int var28;
    if (var16 == null) {
      byte var17;
      if (var7 == 1) {
        var17 = 9;
      } else if (var7 == 2) {
        var17 = 12;
      } else if (var7 != 3) {
        if (var7 == 4) {
          var17 = 18;
        } else {
          var17 = 21;
        }
      } else {
        var17 = 15;
      }

      int[] var19 = {64, 96, 128};
      byte var18 = 3;
      Model var20 = new Model(1 + var18 * var17, -var17 + var17 * var18 * 2, 0);
      var21 = var20.addVertex(0, 0, 0);
      int[][] var22 = new int[var18][var17];

      for (var23 = 0; var23 < var18; ++var23) {
        var24 = var19[var23];
        var25 = var19[var23];

        for (int var26 = 0; var26 < var17; ++var26) {
          int var27 = (var26 << 11) / var17;
          int var29 = var5 + MathUtilities.COSINE_TABLE[var27] * var25 >> 16;
          var28 = var3 + MathUtilities.SINE_TABLE[var27] * var24 >> 16;
          var22[var23][var26] = var20.addVertex(var28, 0, var29);
        }
      }

      for (var23 = 0; var23 < var18; ++var23) {
        var24 = (256 * var23 + 128) / var18;
        var25 = 256 - var24;
        byte var38 = (byte) (var12 * var24 + var0 * var25 >> 8);
        short var39 = (short) (
            ((var6 & 127) * var25 + (127 & var4) * var24 & 32512) + (
                var25 * (var6 & 896) + var24 * (var4 & 896) & 229376) + (
                var24 * (var4 & 0xfc00) + (0xfc00 & var6) * var25
                    & 16515072) >> 8);

        for (var28 = 0; var28 < var17; ++var28) {
          if (var23 == 0) {
            var20.appendFace(var21, var22[0][(1 + var28) % var17],
                var22[0][var28], (byte) 1,
                var39, var38);
          } else {
            var20.appendFace(var22[var23 - 1][var28],
                var22[var23 - 1][(var28 + 1) % var17],
                var22[var23][(var28 + 1) % var17], (byte) 1, var39, var38);
            var20.appendFace(var22[-1 + var23][var28],
                var22[var23][(1 + var28) % var17],
                var22[var23][var28], (byte) 1, var39, var38);
          }
        }
      }

      var16 = var20.method2008(64, 768, -50, -10, -50);
      GlobalStatics_7.aClass93_2982.get((byte) -125, var16, var14);
    }

    int var32 = var7 * 64 - 1;
    if (var13 == -49) {
      int var33 = -var32;
      int var31 = -var32;
      int var34 = var32;
      int var35 = var8.method1884();
      AnimationSomething var40 = null;
      var23 = var8.method1883();
      var24 = var8.method1898();
      var25 = var8.method1872();
      if (var2 != null) {
        var10 = var2.anIntArray1851[var10];
        var40 = GlobalStatics_6.method133(var10 >> 16, 0);
        var10 &= 0xffff;
      }

      var21 = var32;
      if (var1) {
        if (var9 > 1664 || var9 < 384) {
          var31 -= 128;
        }

        if (var9 > 1152 && var9 < 1920) {
          var34 = var32 + 128;
        }

        if (var9 > 640 && var9 < 1408) {
          var21 = var32 + 128;
        }

        if (var9 > 128 && var9 < 896) {
          var33 -= 128;
        }
      }

      if (var21 < var25) {
        var25 = var21;
      }

      if (var34 < var23) {
        var23 = var34;
      }

      if (var40 == null) {
        var16 = var16.method1882(true, true, true);
        var16.scale((var23 - var35) / 2, 128, (var25 - var24) / 2);
        var16.method1897((var35 + var23) / 2, 0, (var24 + var25) / 2);
      } else {
        var16 = var16.method1882(!var40.method559(1317095745, var10),
            !var40.method561(var10, (byte) 115), true);
        var16.scale((var23 - var35) / 2, 128, (var25 - var24) / 2);
        var16.method1897((var35 + var23) / 2, 0, (var24 + var25) / 2);
        var16.method1877(var40, var10);
      }

      if (var9 != 0) {
        var16.method1876(var9);
      }

      if (GlRenderer.USE_OPENGL) {
        GlModel var36 = (GlModel) var16;
        if (GlobalStatics_6
            .method1736(GlobalStatics_9.currentPlane, var13 ^ -50,
                var3 + var35,
                var24 + var5) != var11 ||
            GlobalStatics_6
                .method1736(GlobalStatics_9.currentPlane, 1, var23 + var3,
                    var5 + var25) != var11) {
          for (var28 = 0; var28 < var36.vertexCCC; ++var28) {
            var36.vy[var28] += -var11 + GlobalStatics_6
                .method1736(GlobalStatics_9.currentPlane,
                    GlobalStatics_9.bitXor(var13, -50), var36.vx[var28] + var3,
                    var5 + var36.vz[var28]);
          }

          var36.aClass6_3835.aBoolean98 = false;
          var36.vertexPositionData.updated = false;
        }
      } else {
        SoftwareModel var37 = (SoftwareModel) var16;
        if (
            GlobalStatics_6
                .method1736(GlobalStatics_9.currentPlane, 1, var3 + var35,
                    var5 + var24) != var11 || var11 != GlobalStatics_6
                .method1736(GlobalStatics_9.currentPlane, 1,
                    var3 + var23, var5 + var25)) {
          for (var28 = 0; var37.anInt3891 > var28; ++var28) {
            var37.anIntArray3883[var28] +=
                -var11 + GlobalStatics_6
                    .method1736(GlobalStatics_9.currentPlane, 1,
                        var3 + var37.anIntArray3885[var28],
                        var5 + var37.anIntArray3895[var28]);
          }

          var37.aBoolean3897 = false;
        }
      }

      return var16;
    } else {
      return null;
    }
  }

  public static void method1958(int var0) {
    GlobalStatics_8.aClass94_2751 = null;
    GlobalStatics_8.OPTION_DROP = null;
    GlobalStatics_8.aClass94_2723 = null;
    GlobalStatics_8.widgets = null;
    GlobalStatics_8.aClass94_2731 = null;
    if (var0 != 2) {
      GlobalStatics_8.method1958(64);
    }

    GlobalStatics_8.aClass94_2740 = null;
    BufferStatics.aByteArrayArray2747 = null;
    GlobalStatics_8.aClass94_2735 = null;
    GlobalStatics_8.aClass94_2739 = null;
  }

  public static void method1959(int var0, int var1, int var2, boolean var3) {
    if (var2 >= 8000 && var2 <= 0xbb80) {
      GlobalStatics_6.anInt3507 = var1;
      if (var0 != 256) {
        GlobalStatics_8.OPTION_DROP = null;
      }

      GlobalStatics_0.stereo = var3;
      DummyClass60.sampleRate = var2;
    } else {
      throw new IllegalArgumentException();
    }
  }

  public static void method1964(boolean var0) {
    int var1 = GlobalStatics_9.GAME_BUFFER.readBits(8);
    int var2;
    if (DummyClass13.anInt2022 > var1) {
      for (var2 = var1; var2 < DummyClass13.anInt2022; ++var2) {
        GlobalStatics_10.anIntArray2292[DummyClass17.anInt1829++] =
            DummyClass42.anIntArray887[var2];
      }
    }

    if (var1 <= DummyClass13.anInt2022) {
      DummyClass13.anInt2022 = 0;
      var2 = 0;
      if (var0) {
        GlobalStatics_8.method1959(-121, -69, 115, false);
      }

      for (; var2 < var1; ++var2) {
        int var3 = DummyClass42.anIntArray887[var2];
        Player var4 = GlobalStatics_9.PLAYERS[var3];
        int var5 = GlobalStatics_9.GAME_BUFFER.readBits(1);
        if (var5 == 0) {
          DummyClass42.anIntArray887[DummyClass13.anInt2022++] = var3;
          var4.anInt2838 = GlobalStatics_4.updateCycle;
        } else {
          int var6 = GlobalStatics_9.GAME_BUFFER.readBits(2);
          if (var6 == 0) {
            DummyClass42.anIntArray887[DummyClass13.anInt2022++] = var3;
            var4.anInt2838 = GlobalStatics_4.updateCycle;
            DummyClass60.anIntArray441[GlobalStatics_9.anInt997++] = var3;
          } else {
            int var7;
            int var8;
            if (var6 == 1) {
              DummyClass42.anIntArray887[DummyClass13.anInt2022++] = var3;
              var4.anInt2838 = GlobalStatics_4.updateCycle;
              var7 = GlobalStatics_9.GAME_BUFFER.readBits(3);
              var4.method1968(1, (byte) 46, var7);
              var8 = GlobalStatics_9.GAME_BUFFER.readBits(1);
              if (var8 == 1) {
                DummyClass60.anIntArray441[GlobalStatics_9.anInt997++] = var3;
              }
            } else {
              if (var6 == 2) {
                DummyClass42.anIntArray887[DummyClass13.anInt2022++] = var3;
                var4.anInt2838 = GlobalStatics_4.updateCycle;
                if (GlobalStatics_9.GAME_BUFFER.readBits(1) == 1) {
                  var7 = GlobalStatics_9.GAME_BUFFER.readBits(3);
                  var4.method1968(2, (byte) -92, var7);
                  var8 = GlobalStatics_9.GAME_BUFFER.readBits(3);
                  var4.method1968(2, (byte) 88, var8);
                } else {
                  var7 = GlobalStatics_9.GAME_BUFFER.readBits(3);
                  var4.method1968(0, (byte) 113, var7);
                }

                var7 = GlobalStatics_9.GAME_BUFFER.readBits(1);
                if (var7 == 1) {
                  DummyClass60.anIntArray441[GlobalStatics_9.anInt997++] = var3;
                }
              } else {
                if (var6 == 3) {
                  GlobalStatics_10.anIntArray2292[DummyClass17.anInt1829++] = var3;
                }
              }
            }
          }
        }
      }

    } else {
      throw new RuntimeException("gppov1");
    }
  }

  public static void clear40(int var0) {
    GlobalStatics_8.aClass94_1508 = null;
    GlobalStatics_8.aClass94_1523 = null;
    GlobalStatics_8.anIntArrayArrayArray1497 = null;
    GlobalStatics_8.PRESSED_KEYS = null;
    GlobalStatics_8.aClass94_1509 = null;
    if (var0 != -11) {
      GlobalStatics_8.anInt1521 = -96;
    }
  }

  public static SomethingScene method1688(int var0, int var1, int var2) {
    SceneGraphTile var3 = GLStatics.sceneGraphTiles[var0][var1][var2];
    if (var3 == null) {
      return null;
    } else {
      SomethingScene var4 = var3.aClass72_2245;
      var3.aClass72_2245 = null;
      return var4;
    }
  }

  public static void clear5(int var0) {
    if (var0 < 15) {
      GlobalStatics_8.method27(null, true);
    }

    GlobalStatics_8.aClass94_7 = null;
    GlobalStatics_8.aClass94_8 = null;
    GlobalStatics_8.COMMAND_RECTANGLE_DEBUG = null;
    GlobalStatics_8.aClass94_9 = null;
    GlobalStatics_8.aClass94_5 = null;
    GlobalStatics_8.aClass94_4 = null;
  }

  public static GameString method27(GameString var0, boolean var1) {
    if (!var1) {
      GlobalStatics_8.clear5(-78);
    }

    int var2 = GlobalStatics_8.method1602(0, var0);
    return var2 == -1 ? GameStringStatics.aClass94_4049
        : DummyClass25.aClass131_1624.aClass94Array1721[var2].method1560(
            GameStringStatics.aClass94_3192, true,
            GameStringStatics.aClass94_4066);
  }

  public static void method28(boolean var0) {
    DummyClass15.aClass93_1874.method1524(3);
    if (!var0) {
      GlobalStatics_8.BIND_CANVAS = false;
    }
  }

  public static void method34(int var0) {
    if (GlobalStatics_9.audioOutputStream0 != null) {
      GlobalStatics_9.audioOutputStream0.method2163(false);
    }

    if (var0 != -32589) {
      GlobalStatics_8.clear5(-25);
    }

    if (GlobalStatics_9.audioOutputStream1 != null) {
      GlobalStatics_9.audioOutputStream1.method2163(false);
    }

    GlobalStatics_8.method1959(256, 2, 22050, GlobalStatics_1.aBoolean3184);
    GlobalStatics_9.audioOutputStream0 =
        DummyClass43.createAudioOutputStream(22050, DummyClass35.signLink,
            GlobalStatics_8.GAME_CANVAS,
            0, 14);
    GlobalStatics_9.audioOutputStream0
        .method2154(114,
            GlobalStatics_0.aClass3_Sub24_Sub4_1193);
    GlobalStatics_9.audioOutputStream1 =
        DummyClass43.createAudioOutputStream(2048, DummyClass35.signLink,
            GlobalStatics_8.GAME_CANVAS, 1,
            14);
    GlobalStatics_9.audioOutputStream1.method2154(-126,
        GlobalStatics_9.aClass3_Sub24_Sub2_2563);
  }

  public static void provideSignLink(SignLink var0) {
    DummyClass35.signLink = var0;
    GlobalStatics_10.signLink = var0;
  }

  public static void method288(byte var0) {
    if (var0 < 31) {
      GlobalStatics_8.method289(false);
    }

    GlobalStatics_8.anIntArray3290 = null;
    GlobalStatics_8.aClass94_3298 = null;
    GlobalStatics_8.aClass94_3291 = null;
    GlobalStatics_8.NPCS = null;
    GlobalStatics_8.aClass94_3295 = null;
  }

  public static void method289(boolean var0) {
    if (var0) {
      GlobalStatics_8.aClass94_3295 = null;
    }

    if (DummyClass13.anInt2023 > 0) {
      DummyClass10.destroyGame((byte) 46);
    } else {
      DummyClass8.aClass89_4012 = GlobalStatics_9.GAME_SOCKET;
      GlobalStatics_9.GAME_SOCKET = null;
      DummyClass26.setState(40, 5);
    }
  }
}
