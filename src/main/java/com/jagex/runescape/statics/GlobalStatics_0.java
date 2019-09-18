package com.jagex.runescape.statics;

import com.jagex.runescape.math.MathUtilities;
import com.jagex.runescape.model.VariableUpdate;
import com.jagex.runescape.model.Widget;
import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.buffer.BufferStatics;
import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.AbstractDirectColorSprite;
import com.jagex.runescape.model.AbstractFrameRegulator;
import com.jagex.runescape.model.AbstractTextureSampler;
import com.jagex.runescape.model.AnimationSequence;
import com.jagex.runescape.model.AreaSoundEffect;
import com.jagex.runescape.model.AudioStreamEncoder4;
import com.jagex.runescape.model.BlockConfig;
import com.jagex.runescape.model.CollisionMap;
import com.jagex.runescape.model.DisplayMode;
import com.jagex.runescape.model.FileCache;
import com.jagex.runescape.model.FileRequester;
import com.jagex.runescape.model.FileUnpacker;
import com.jagex.runescape.model.FloorOverlay;
import com.jagex.runescape.model.GameObjectConfig;
import com.jagex.runescape.model.GameStub;
import com.jagex.runescape.model.GameWorld;
import com.jagex.runescape.model.ItemConfig;
import com.jagex.runescape.model.LightIntensity;
import com.jagex.runescape.model.MilliFrameRegulator;
import com.jagex.runescape.model.NPC;
import com.jagex.runescape.model.ObjectCache;
import com.jagex.runescape.model.Parameter;
import com.jagex.runescape.model.RenderAnimation;
import com.jagex.runescape.scene.SceneGraphTile;
import com.jagex.runescape.scene.SceneSomething;
import com.jagex.runescape.scene.SceneSomething2;
import com.jagex.runescape.model.SoftwareDirectColorSprite;
import com.jagex.runescape.model.SoftwareFont;
import com.jagex.runescape.model.SoftwareModel;
import com.jagex.runescape.model.SomethingQuickChat;
import com.jagex.runescape.scene.SomethingSceneJ;
import com.jagex.runescape.model.SomethingWorldMapy;
import com.jagex.runescape.model.TextureSampler0;
import com.jagex.runescape.model.TextureSampler1;
import com.jagex.runescape.model.TextureSampler10;
import com.jagex.runescape.model.TextureSampler11;
import com.jagex.runescape.model.TextureSampler12;
import com.jagex.runescape.model.TextureSampler13;
import com.jagex.runescape.model.TextureSampler14;
import com.jagex.runescape.model.TextureSampler15;
import com.jagex.runescape.model.TextureSampler16;
import com.jagex.runescape.model.TextureSampler17;
import com.jagex.runescape.model.TextureSampler18;
import com.jagex.runescape.model.TextureSampler19;
import com.jagex.runescape.model.TextureSampler2;
import com.jagex.runescape.model.TextureSampler20;
import com.jagex.runescape.model.TextureSampler21;
import com.jagex.runescape.model.TextureSampler22;
import com.jagex.runescape.model.TextureSampler23;
import com.jagex.runescape.model.TextureSampler24;
import com.jagex.runescape.model.TextureSampler25;
import com.jagex.runescape.model.TextureSampler26;
import com.jagex.runescape.model.TextureSampler27;
import com.jagex.runescape.model.TextureSampler28;
import com.jagex.runescape.model.TextureSampler29;
import com.jagex.runescape.model.TextureSampler3;
import com.jagex.runescape.model.TextureSampler30;
import com.jagex.runescape.model.TextureSampler31;
import com.jagex.runescape.model.TextureSampler32;
import com.jagex.runescape.model.TextureSampler33;
import com.jagex.runescape.model.TextureSampler34;
import com.jagex.runescape.model.TextureSampler35;
import com.jagex.runescape.model.TextureSampler36;
import com.jagex.runescape.model.TextureSampler37;
import com.jagex.runescape.model.TextureSampler38;
import com.jagex.runescape.model.TextureSampler39;
import com.jagex.runescape.model.TextureSampler4;
import com.jagex.runescape.model.TextureSampler5;
import com.jagex.runescape.model.TextureSampler6;
import com.jagex.runescape.model.TextureSampler7;
import com.jagex.runescape.model.TextureSampler8;
import com.jagex.runescape.model.TextureSampler9;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.opengl.DummyClass46;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlDirectColorSprite;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.GlUtils;
import com.jagex.runescape.opengl.Light;
import com.jagex.runescape.opengl.MaterialShader5;
import com.jagex.runescape.opengl.SomethingGl0;
import com.jagex.runescape.sprite.SoftwareIndexedColorSprite;
import com.jagex.runescape.sprite.SoftwareIndexedColorSpriteStatics;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public final class GlobalStatics_0 {

  public static GameString LINE_BREAK = GameStringStatics.create("<br>");
  public static GameString aClass94_2599 =
      GameStringStatics.create("d-Broulement:");
  public static SomethingWorldMapy aClass3_Sub28_Sub3_2600;
  public static FileRequester[] aClass151_Sub1Array2601 = new FileRequester[28];
  public static GameString aClass94_2593 =
      GameStringStatics.create("Loaded interfaces");
  public static GameString LOADED_INTERFACES = GlobalStatics_0.aClass94_2593;
  public static int[] anIntArray2591;
  public static int anInt2592;
  public static GameString aClass94_2594 =
      GameStringStatics.create("Polices charg-Bes");
  public static GameString[] aClass94Array2596;
  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_637;
  public static int anInt638;
  public static int anInt639;
  public static byte[][][] aByteArrayArrayArray640;
  public static int anInt641;
  public static int anInt72;
  public static boolean[] aBooleanArray73 = new boolean[200];
  public static GameString[] aClass94Array75 = new GameString[1000];
  public static GameString aClass94_77 = GameStringStatics
      .create("Objet d(Wabonn-Bs");
  public static Deque aClass61_78 = new Deque();
  public static GameString aClass94_2158 =
      GameStringStatics.create("Allocated memory");
  public static GameString aClass94_2151 = GlobalStatics_0.aClass94_2158;
  public static int anInt2145;
  public static boolean SAFE_MODE;
  public static int packetId;
  public static int anInt2148;
  public static boolean stereo;
  public static boolean aBoolean2154;
  public static int[] anIntArray2157 = new int[50];
  public static GameString aClass94_2149 = GameStringStatics.create(
      "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");
  public static GameString aClass94_2155 = GameStringStatics
      .create(":allyreq:");
  public static FileUnpacker aClass153_2581;
  public static GameString aClass94_2584 = GameStringStatics.create("<)4col>");
  public static GameString aClass94_2585 =
      GameStringStatics.create("Connexion au serveur de mise -9 jour en cours");
  public static int anInt2587;
  public static GameStub applet;
  public static int anInt2589;
  public static int anInt2579 = 1;
  public static GameString[] aClass94Array2580 = new GameString[100];
  public static int lastPacketId0;
  public static boolean dynamicScene;
  public static GameString aClass94_1710 = GameStringStatics
      .create("Loaded sprites");
  public static GameString aClass94_1707 = GlobalStatics_0.aClass94_1710;
  public static GameString aClass94_1698 = GameStringStatics.create("(R");
  public static GameString aClass94_1699 = GameStringStatics
      .create(" )2> <col=ff9040>");
  public static int anInt1701;
  public static GameString aClass94_1702 = GameStringStatics
      .create("Hierhin drehen");
  public static boolean[] aBooleanArray1703;
  public static int packetLength;
  public static int anInt1705;
  public static int anInt1709;
  public static int anInt1711 = -2;
  public static boolean[] aBooleanArray1712 = new boolean[100];
  public static GameString aClass94_1714 = GameStringStatics
      .create("<col=ff7000>");
  public static CollisionMap[] collisionMaps = new CollisionMap[4];
  public static FileCache tableCache;
  public static int sunPositionZ;
  public static AudioStreamEncoder4 aClass3_Sub24_Sub4_1193;
  public static GameString aClass94_1179 = GameStringStatics
      .create("Veuillez patienter)3)3)3");
  public static GameString COMMAND_REBUILD = GameStringStatics
      .create("::rebuild");
  public static int anInt937;
  public static int anInt938;
  public static ObjectCache aClass93_939 = new ObjectCache(4);
  public static int anInt14;
  public static int anInt15;
  public static int anInt16;
  public static int anInt17;
  public static int anInt18;
  public static int anInt19;
  public static int[][] anIntArrayArray20 = new int[5][5000];
  public static ObjectCache aClass93_21 = new ObjectCache(64);
  public static GameString aClass94_22 = GameStringStatics.create("leuchten3:");
  public static int anInt23;
  public static GameString aClass94_24 =
      GameStringStatics.create(
          "Chargement de RuneScape en cours )2 veuillez patienter)3)3)3");
  public static int anInt25 = 1;
  public static GameString aClass94_26 = GameStringStatics.create("n");
  static GameString aClass94_1176 = GameStringStatics
      .create("Loading wordpack )2 ");
  public static GameString aClass94_1183 = GlobalStatics_0.aClass94_1176;
  static GameString aClass94_1192 = GameStringStatics.create("Examine");
  public static GameString aClass94_1180 = GlobalStatics_0.aClass94_1192;

  static {
    for (int var1 = 0; var1 < 256; ++var1) {
      int var0 = var1;

      for (int var2 = 0; var2 < 8; ++var2) {
        if ((1 & var0) == 1) {
          var0 = var0 >>> 1 ^ -306674912;
        } else {
          var0 >>>= 1;
        }
      }

      BufferStatics.anIntArray634[var1] = var0;
    }

    GlobalStatics_0.anInt639 = 0;
    GlobalStatics_0.anInt638 = 0;
    GlobalStatics_0.anInt641 = 0;

    int var0 = 0;

    for (int var1 = 0; var1 < 99; ++var1) {
      int var2 = 1 + var1;
      int var3 = (int) (Math.pow(2.0D, var2 / 7.0D) * 300.0D + var2);
      var0 += var3;
      GlobalStatics_11.anIntArray781[var1] = var0 / 4;
    }

    GlobalStatics_11.aClass94_808 = GameStringStatics
        .create(" zuerst von Ihrer Ignorieren)2Liste(Q");
    GlobalStatics_11.aClass94_811 = GameStringStatics.create("green:");
    GlobalStatics_11.aClass94_809 = GlobalStatics_11.aClass94_811;
    GlobalStatics_11.aClass94_806 = GlobalStatics_11.aClass94_811;

    for (int var2 = 0; var2 < 256; ++var2) {
      long var4 = var2;

      for (int var3 = 0; var3 < 8; ++var3) {
        if ((1L & var0) == 1L) {
          var4 = var4 >>> 1 ^ -3932672073523589310L;
        } else {
          var4 >>>= 1;
        }
      }
      GlobalStatics_7.aLongArray1631[var2] = var0;
    }

    GlobalStatics_7.aClass94_1637 = GameStringStatics
        .create("Texturen geladen)3");
    GlobalStatics_7.aClass94_1636 = GameStringStatics.create("rouge:");
    GlobalStatics_7.anIntArray1638 = new int[128];

    GlobalStatics_1.anIntArray3946 = new int[1600];
    GlobalStatics_1.anIntArrayArray3926 = new int[1600][64];
    GlobalStatics_1.anIntArray3935 = new int[32];
    GlobalStatics_1.anIntArrayArray3923 = new int[32][512];

    GlobalStatics_1.anIntArray3924 = new int[1];
    GlobalStatics_1.anIntArray3939 = new int[1];
    GlobalStatics_1.anIntArray3928 = new int[4096];
    GlobalStatics_1.aShortArray3949 = new short[1];
    GlobalStatics_1.anIntArray3943 = new int[4096];
    GlobalStatics_1.anIntArrayArray3938 = new int[12][4096];
    GlobalStatics_1.anIntArray3921 = new int[4096];
    GlobalStatics_1.anIntArray3950 = new int[8192];

    Random random = new Random(0L);

    int var1;
    for (var1 = 0; var1 < 0x8000; ++var1) {
      GlobalStatics_9.anIntArray1594[var1] = (random.nextInt() & 2) - 1;
    }

    GlobalStatics_9.anIntArray1591 = new int[0x8000];

    for (var1 = 0; var1 < 0x8000; ++var1) {
      GlobalStatics_9.anIntArray1591[var1] = (int) (Math.sin(var1 / 5215.1903D)
          * 16384.0D);
    }

    GlobalStatics_9.anIntArray1598 = new int[220500];
    GlobalStatics_9.anIntArray1599 = new int[5];
    GlobalStatics_9.anIntArray1600 = new int[5];
    GlobalStatics_9.anIntArray1601 = new int[5];
    GlobalStatics_9.anIntArray1603 = new int[5];
    GlobalStatics_9.anIntArray1602 = new int[5];
  }

  public static GameString method802(int var0, boolean var1) {
    if (!var1) {
      GlobalStatics_0.method746((byte) -33);
    }

    return DummyClass8.aClass94Array4016[var0].getLength() > 0
        ? GlobalStatics_9.concat(
        new GameString[]{GlobalStatics_9.aClass94Array2935[var0],
            GlobalStatics_2.aClass94_43,
            DummyClass8.aClass94Array4016[var0]})
        : GlobalStatics_9.aClass94Array2935[var0];
  }

  public static void method744(boolean var0) {
    if (!var0) {
      GlobalStatics_0.method784(-10, -32, -21);
    }

    ++GlobalStatics_9.anInt1908;
  }

  public static void method746(byte var0) {
    GlobalStatics_9.aClass93_1013.method1524(3);
  }

  public static void clear11(int var0) {
    GlobalStatics_0.aClass94_2599 = null;
    GlobalStatics_0.anIntArray2591 = null;
    GlobalStatics_0.LOADED_INTERFACES = null;
    GlobalStatics_0.aClass3_Sub28_Sub3_2600 = null;
    GlobalStatics_0.aClass94_2594 = null;
    GlobalStatics_0.aClass94Array2596 = null;
    GlobalStatics_0.aClass94_2593 = null;
    GlobalStatics_0.aClass151_Sub1Array2601 = null;
    GlobalStatics_0.LINE_BREAK = null;
  }

  public static void method777(CollisionMap[] collisionMaps, boolean var1,
      int var2, int var3, int var4, int var5, int var6,
      byte[] bytes) {
    int var10;
    int var11;
    if (!var1) {
      for (int var9 = 0; var9 < 4; ++var9) {
        for (var10 = 0; var10 < 64; ++var10) {
          for (var11 = 0; var11 < 64; ++var11) {
            if (var5 + var10 > 0 && var10 + var5 < 103 &&
                var3 + var11 > 0 && var11 + var3 < 103) {
              collisionMaps[var9]
                  .anIntArrayArray1304[var10 + var5][var3 + var11] =
                  collisionMaps[var9]
                      .anIntArrayArray1304[var10 + var5][var3 + var11]
                      & -16777217;
            }
          }
        }
      }
    }

    Buffer var20 = new Buffer(bytes);
    byte var8;
    if (var1) {
      var8 = 1;
    } else {
      var8 = 4;
    }

    int var12;
    for (var10 = 0; var8 > var10; ++var10) {
      for (var11 = 0; var11 < 64; ++var11) {
        for (var12 = 0; var12 < 64; ++var12) {
          DummyClass10.readTileData(var2, var6, var1, var20, var12 + var3,
              var5 + var11, (byte) 91, 0, var10);
        }
      }
    }

    int var14;
    int var15;
    int var17;
    boolean var21;
    int var24;
    for (var21 = false; var20.position < var20.bytes.length; var21 = true) {
      var11 = var20.readUnsignedByte();
      if (var11 != 129) {
        --var20.position;
        break;
      }

      for (var12 = 0; var12 < 4; ++var12) {
        byte var13 = var20.readByte();
        if (var13 == 0) {
          var14 = var5;
          if (var5 >= 0) {
            if (var5 >= 104) {
              var14 = 104;
            }
          } else {
            var14 = 0;
          }

          var24 = var3;
          if (var3 < 0) {
            var24 = 0;
          } else if (var3 >= 104) {
            var24 = 104;
          }

          var15 = 64 + var5;
          var17 = var3 + 64;
          if (var17 >= 0) {
            if (var17 >= 104) {
              var17 = 104;
            }
          } else {
            var17 = 0;
          }

          if (var15 < 0) {
            var15 = 0;
          } else if (var15 >= 104) {
            var15 = 104;
          }

          while (var14 < var15) {
            while (var24 < var17) {
              GlobalStatics_9.aByteArrayArrayArray1774[var12][var14][var24] =
                  0;
              ++var24;
            }

            ++var14;
          }
        } else {
          if (var13 == 1) {
            for (var14 = 0; var14 < 64; var14 += 4) {
              for (var15 = 0; var15 < 64; var15 += 4) {
                byte var16 = var20.readByte();

                for (var17 = var14 + var5; 4 + var5 + var14 > var17;
                    ++var17) {
                  for (int var18 = var3 + var15; var18 < 4 + var3 + var15;
                      ++var18) {
                    if (var17 >= 0 && var17 < 104 && var18 >= 0 &&
                        var18 < 104) {
                      GlobalStatics_9
                          .aByteArrayArrayArray1774[var12][var17][var18] =
                          var16;
                    }
                  }
                }
              }
            }
          } else {
            if (var13 == 2 && var12 > 0) {
              var15 = var5 + 64;
              var24 = var3;
              var17 = var3 + 64;
              if (var15 < 0) {
                var15 = 0;
              } else if (var15 >= 104) {
                var15 = 104;
              }

              if (var3 >= 0) {
                if (var3 >= 104) {
                  var24 = 104;
                }
              } else {
                var24 = 0;
              }

              if (var17 >= 0) {
                if (var17 >= 104) {
                  var17 = 104;
                }
              } else {
                var17 = 0;
              }

              var14 = var5;
              if (var5 >= 0) {
                if (var5 >= 104) {
                  var14 = 104;
                }
              } else {
                var14 = 0;
              }

              while (var15 > var14) {
                while (var24 < var17) {
                  GlobalStatics_9
                      .aByteArrayArrayArray1774[var12][var14][var24] =
                      GlobalStatics_9
                          .aByteArrayArrayArray1774[var12 - 1][var14][var24];
                  ++var24;
                }

                ++var14;
              }
            }
          }
        }
      }
    }

    if (var4 == 4) {
      int var23;
      if (GlRenderer.USE_OPENGL && !var1) {
        BlockConfig var22 = null;

        while (var20.position < var20.bytes.length) {
          var12 = var20.readUnsignedByte();
          if (var12 == 0) {
            var22 = new BlockConfig(var20);
          } else {
            if (var12 != 1) {
              throw new IllegalStateException();
            }

            var23 = var20.readUnsignedByte();
            if (var23 > 0) {
              for (var14 = 0; var23 > var14; ++var14) {
                Light var25 = new Light(var20);
                if (var25.anInt705 == 31) {
                  LightIntensity var26 = DummyClass50.method1401(
                      1001, var20.readUnsignedShort());
                  var25.method1060((byte) -67, var26.anInt896, var26.anInt908,
                      var26.anInt899, var26.anInt907);
                }

                var25.anInt708 += var3 << 7;
                var25.anInt703 += var5 << 7;
                var17 = var25.anInt708 >> 7;
                var24 = var25.anInt703 >> 7;
                if (var24 >= 0 && var17 >= 0 && var24 < 104 &&
                    var17 < 104) {
                  var25.aBoolean696 =
                      (GlobalStatics_10.tileFlags[1][var24][var17]
                          & 2) != 0;
                  var25.anInt697 =
                      GlobalStatics_4
                          .heightMap[var25.anInt704][var24][var17] +
                          -var25.anInt697;
                  DummyClass46.method1264(var25);
                }
              }
            }
          }
        }

        if (var22 == null) {
          var22 = new BlockConfig();
        }

        for (var12 = 0; var12 < 8; ++var12) {
          for (var23 = 0; var23 < 8; ++var23) {
            var14 = var12 + (var5 >> 3);
            var15 = (var3 >> 3) + var23;
            if (var14 >= 0 && var14 < 13 && var15 >= 0 && var15 < 13) {
              DummyClass27.blockConfigs[var14][var15] = var22;
            }
          }
        }
      }

      if (!var21) {
        for (var11 = 0; var11 < 4; ++var11) {
          for (var12 = 0; var12 < 16; ++var12) {
            for (var23 = 0; var23 < 16; ++var23) {
              var14 = (var5 >> 2) + var12;
              var15 = var23 + (var3 >> 2);
              if (var14 >= 0 && var14 < 26 && var15 >= 0 && var15 < 26) {
                GlobalStatics_9.aByteArrayArrayArray1774[var11][var14][var15] =
                    0;
              }
            }
          }
        }
      }
    }
  }

  public static SomethingSceneJ method784(int var0, int var1, int var2) {
    SceneGraphTile var3 = GLStatics.sceneGraphTiles[var0][var1][var2];
    return var3 != null && var3.aClass12_2230 != null ? var3.aClass12_2230
        : null;
  }

  public static void method792(int var0) {
    if (var0 == 9179409) {
      int var1 = DummyClass20.method1817((byte) 70);
      if (var1 == 0) {
        GlobalStatics_5.aByteArrayArrayArray2008 = null;
        GlobalStatics_9.method1816(0, -7);
      } else if (var1 == 1) {
        GlobalStatics_9.method112((byte) 0, (byte) 55);
        GlobalStatics_9.method1816(512, -7);
        GlobalStatics_10.method257((byte) 125);
      } else {
        GlobalStatics_9.method112(
            (byte) (-4 + GlobalStatics_6.anInt1127 & 255), (byte) 55);
        GlobalStatics_9.method1816(2, -7);
      }
    }
  }

  public static void method795(byte var0, int var1) {
    if (var0 != 14) {
      GlobalStatics_0.anIntArray2591 = null;
    }

    GlobalStatics_7.aClass93_2450.method1522(var0 ^ -114, var1);
  }

  public static void method799(int var0, int var1, int var2, int var3,
      int var4) {
    if (GlobalStatics_8.anInt2737 < 100) {
      GlobalStatics_9.method626(64);
    }

    if (GlRenderer.USE_OPENGL) {
      GlUtils.clip(var0, var2, var0 + var4, var3 + var2);
    } else {
      DummyClass47.method1324(var0, var2, var0 + var4, var3 + var2);
    }

    int var6;
    int var7;
    if (GlobalStatics_8.anInt2737 >= 100) {
      DummyClass1.anInt410 =
          (int) ((var3 * 2) / GlobalStatics_4.aFloat727);
      DummyClass44.anInt930 =
          GlobalStatics_9.anInt3536 +
              -((int) (var4 / GlobalStatics_4.aFloat727));
      int var15 = -((int) (var4 / GlobalStatics_4.aFloat727)) +
          GlobalStatics_9.anInt3536;
      var6 = GlobalStatics_9.anInt2251 -
          (int) (var3 / GlobalStatics_4.aFloat727);
      DummyClass44.anInt934 =
          GlobalStatics_9.anInt2251 +
              -((int) (var3 / GlobalStatics_4.aFloat727));
      int var8 = GlobalStatics_9.anInt2251 +
          (int) (var3 / GlobalStatics_4.aFloat727);
      var7 = (int) (var4 / GlobalStatics_4.aFloat727) +
          GlobalStatics_9.anInt3536;
      GlobalStatics_9.anInt817 =
          (int) ((var4 * 2) / GlobalStatics_4.aFloat727);
      if (var1 != 64) {
        GlobalStatics_0.aClass94Array2596 = null;
      }

      if (GlRenderer.USE_OPENGL) {
        if (GlobalStatics_9.aClass3_Sub28_Sub16_Sub2_3221 == null ||
            GlobalStatics_9.aClass3_Sub28_Sub16_Sub2_3221.anInt3707 != var4 ||
            GlobalStatics_9.aClass3_Sub28_Sub16_Sub2_3221.anInt3696 != var3) {
          GlobalStatics_9.aClass3_Sub28_Sub16_Sub2_3221 = null;
          GlobalStatics_9.aClass3_Sub28_Sub16_Sub2_3221 =
              new SoftwareDirectColorSprite(var4, var3);
        }

        DummyClass47.method1319(
            GlobalStatics_9.aClass3_Sub28_Sub16_Sub2_3221.pixels, var4, var3);
        GlobalStatics_2.method523(var4, 0, 0, var7, var6, 0, var8, var3, var15);
        DummyClass30.method938(var4, 0, var7, var8, var3, 0, 1, var15, var6);
        GlobalStatics_9.method111((byte) -54, 0, 0, var15, var4,
            var8, var6, var7, var3);
        GlUtils.drawImage(
            GlobalStatics_9.aClass3_Sub28_Sub16_Sub2_3221.pixels, var0, var2,
            var4, var3);
        SoftwareIndexedColorSpriteStatics.anIntArray1100 = null;
      } else {
        GlobalStatics_2.method523(var4 + var0, var2, 0, var7, var6, var0, var8,
            var2 + var3, var15);
        DummyClass30.method938(var0 + var4, var0, var7, var8, var3 + var2,
            var2, 1, var15, var6);
        GlobalStatics_9.method111((byte) -100, var0, var2, var15,
            var0 + var4, var8, var6, var7,
            var3 + var2);
      }

      if (GlobalStatics_2.anInt3704 > 0) {
        --GlobalStatics_6.anInt3611;
        if (GlobalStatics_6.anInt3611 == 0) {
          GlobalStatics_6.anInt3611 = 20;
          --GlobalStatics_2.anInt3704;
        }
      }

      if (DummyClass29.aBoolean438) {
        int var10 = -8 + var2 + var3;
        int var9 = -5 + var0 + var4;
        GlobalStatics_9.p12Font.method688(
            GlobalStatics_9.concat(new GameString[]{
                DummyClass45.aClass94_985,
                GlobalStatics_9.toString(GlobalStatics_3.fps)}),
            var9, var10, 16776960, -1);
        Runtime var11 = Runtime.getRuntime();
        int var12 = (int) ((var11.totalMemory() - var11.freeMemory())
            / 1024L);
        int var13 = 16776960;
        var10 -= 15;
        if (var12 > 65536) {
          var13 = 16711680;
        }

        GlobalStatics_9.p12Font.method688(
            GlobalStatics_9.concat(new GameString[]{
                DummyClass25.MEMORY_PREFIX, GlobalStatics_9.toString(var12),
                GlobalStatics_10.aClass94_3055}),
            var9, var10, var13, -1);
        var10 -= 15;
      }

    } else {
      byte var5 = 20;
      var6 = var0 + var4 / 2;
      var7 = var3 / 2 + var2 - 18 - var5;
      if (GlRenderer.USE_OPENGL) {
        GlUtils.fillQuad(var0, var2, var4, var3, 0);
        GlUtils.drawQuad(var6 - 152, var7, 304, 34, 9179409);
        GlUtils.drawQuad(var6 - 151, var7 + 1, 302, 32, 0);
        GlUtils
            .fillQuad(-150 + var6, var7 + 2, 3 * GlobalStatics_8.anInt2737, 30,
                9179409);
        GlUtils.fillQuad(-150 + var6 + GlobalStatics_8.anInt2737 * 3, var7 + 2,
            300 - 3 * GlobalStatics_8.anInt2737, 30, 0);
      } else {
        DummyClass47.method1323(var0, var2, var4, var3, 0);
        DummyClass47.method1311(var6 - 152, var7, 304, 34, 9179409);
        DummyClass47.method1311(var6 - 151, 1 + var7, 302, 32, 0);
        DummyClass47.method1323(var6 - 150, var7 + 2,
            GlobalStatics_8.anInt2737 * 3, 30, 9179409);
        DummyClass47.method1323(3 * GlobalStatics_8.anInt2737 - 150 + var6,
            var7 + 2, -(GlobalStatics_8.anInt2737 * 3) + 300,
            30, 0);
      }

      GlobalStatics_8.aClass3_Sub28_Sub17_2096.draw(
          GlobalStatics_9.aClass94_462, var6, var5 + var7, 16777215, -1);
    }
  }

  public static AbstractFrameRegulator method1012(byte var0) {
    try {
      if (var0 != -31) {
        GlobalStatics_0.aClass3_Sub28_Sub16_637 = null;
      }

      return (AbstractFrameRegulator) Class.forName(
          "com.jagex.runescape.model.NanoFrameRegulator").newInstance();
    } catch (Throwable var2) {
      return new MilliFrameRegulator();
    }
  }

  public static GameString method1013(byte var0, int var1) {
    GameString var2 = GlobalStatics_9.toString(var1);
    if (var0 >= -87) {
      return null;
    } else {
      for (int var3 = var2.getLength() - 3; var3 > 0; var3 -= 3) {
        var2 = GlobalStatics_9.concat(new GameString[]{
            var2.substring(var3, 0, 0), GlobalStatics_9.aClass94_3268,
            var2.substring(var3)
        });
      }

      return var2.getLength() > 9 ? GlobalStatics_9.concat(new GameString[]{
          GlobalStatics_9.aClass94_1917,
          var2.substring(-8 + var2.getLength(), 0, 0),
          GlobalStatics_10.aClass94_3124, GlobalStatics_9.aClass94_1072, var2,
          GlobalStatics_9.aClass94_995
      }) : var2.getLength() > 6 ?
          GlobalStatics_9.concat(new GameString[]{
              GlobalStatics_10.aClass94_3211,
              var2.substring(-4 + var2.getLength(), 0, 0),
              GameStringStatics.aClass94_3586, GlobalStatics_9.aClass94_1072,
              var2,
              GlobalStatics_9.aClass94_995
          }) :
          GlobalStatics_9.concat(
              new GameString[]{DummyClass10.aClass94_2082, var2,
                  GlobalStatics_0.aClass94_2584});
    }
  }

  public static void method1014(int var0, int var1, int var2) {
    int var3 = 120 / ((15 - var0) / 41);

    for (int var4 = 0; var4 < GlobalStatics_9.amountFloors; ++var4) {
      FloorOverlay var5 = GlobalStatics_9.method350((byte) 120, var4);
      if (var5 != null) {
        int var6 = var5.anInt2095;
        if (var6 >= 0 && !GLStatics.textureCache.method17(var6, 126)) {
          var6 = -1;
        }

        int var7;
        int var8;
        int var9;
        int var10;
        if (var5.anInt2098 < 0) {
          if (var6 >= 0) {
            var7 = GLStatics.hslTable[GlobalStatics_0.method729((byte) -74,
                GLStatics.textureCache.method15(var6, 0xffff), 96)];
          } else if (var5.anInt2103 == -1) {
            var7 = -1;
          } else {
            var8 = var5.anInt2103;
            var9 = var1 + (var8 & 127);
            if (var9 < 0) {
              var9 = 0;
            } else if (var9 > 127) {
              var9 = 127;
            }

            var10 = var9 + (896 & var8) + (0xfc00 & var8 + var2);
            var7 = GLStatics.hslTable[GlobalStatics_0
                .method729((byte) -127, var10, 96)];
          }
        } else {
          var8 = var5.anInt2098;
          var9 = (127 & var8) + var1;
          if (var9 < 0) {
            var9 = 0;
          } else if (var9 > 127) {
            var9 = 127;
          }

          var10 = (896 & var8) + (0xfc00 & var2 + var8) + var9;
          var7 = GLStatics.hslTable[GlobalStatics_0
              .method729((byte) -63, var10, 96)];
        }

        DummyClass51.anIntArray1161[1 + var4] = var7;
      }
    }
  }

  public static void method1016(byte var0) {
    GlobalStatics_0.aByteArrayArrayArray640 = null;
    if (var0 <= 85) {
      GlobalStatics_0.anInt638 = 33;
    }

    BufferStatics.anIntArray634 = null;
    GlobalStatics_0.aClass3_Sub28_Sub16_637 = null;
  }

  public static void clear45(byte var0) {
    GlobalStatics_0.aClass94_77 = null;
    GlobalStatics_0.aClass94Array75 = null;
    if (var0 != 30) {
      GlobalStatics_0.method84(null, 89);
    }

    GlobalStatics_0.aClass61_78 = null;
    GlobalStatics_0.aBooleanArray73 = null;
  }

  public static void method84(GameString var0, int var1) {
    if (var1 != -801) {
      GlobalStatics_0.aClass94_77 = null;
    }

    int var2 = GlobalStatics_8.method1602(0, var0);
    if (var2 != -1) {
      GlobalStatics_2.method565((byte) 86,
          DummyClass25.aClass131_1624.aShortArray1727[var2],
          DummyClass25.aClass131_1624.aShortArray1718[var2]);
    }
  }

  public static void method85(byte var0) {
    GlobalStatics_9.aClass93_1772.method1523();
  }

  public static void setupLanguagePacket(int var1) {
    if (var1 != 0) {
      if (var1 == 1) {
        GlobalStatics_9.method607(false);
      } else {
        if (var1 != 2) {
          throw new RuntimeException("Invalid language ID.");
        }
        GlobalStatics_10.method850((byte) 121);
      }

    }
  }

  public static DisplayMode[] method88(byte var0) {
    if (var0 != 28) {
      GlobalStatics_0.aBooleanArray73 = null;
    }

    if (DummyClass42.aClass106Array890 == null) {
      DisplayMode[] var1 = GlobalStatics_9
          .method596(var0 ^ 22, DummyClass35.signLink);
      DisplayMode[] var2 = new DisplayMode[var1.length];
      int var3 = 0;

      label58:
      for (DisplayMode var5 : var1) {
        if ((var5.anInt1450 <= 0 || var5.anInt1450 >= 24)
            && var5.anInt1447 >= 800
            && var5.anInt1449 >= 600) {
          for (int var6 = 0; var3 > var6; ++var6) {
            DisplayMode var7 = var2[var6];
            if (var5.anInt1447 == var7.anInt1447
                && var7.anInt1449 == var5.anInt1449) {
              if (var5.anInt1450 > var7.anInt1450) {
                var2[var6] = var5;
              }
              continue label58;
            }
          }

          var2[var3] = var5;
          ++var3;
        }
      }

      DummyClass42.aClass106Array890 = new DisplayMode[var3];
      ArrayUtils.copy(var2, 0, DummyClass42.aClass106Array890, 0, var3);
      int[] var9 = new int[DummyClass42.aClass106Array890.length];

      for (int var10 = 0; DummyClass42.aClass106Array890.length > var10;
          ++var10) {
        DisplayMode var11 = DummyClass42.aClass106Array890[var10];
        var9[var10] = var11.anInt1449 * var11.anInt1447;
      }

      DummyClass58.method1658(21, var9, DummyClass42.aClass106Array890);
    }

    return DummyClass42.aClass106Array890;
  }

  public static void method89(boolean var0, FileUnpacker var1,
      FileUnpacker var2, FileUnpacker var3,
      FileUnpacker var4) {
    GlobalStatics_9.aClass153_323 = var2;
    GlobalStatics_10.aClass153_1378 = var1;
    GlobalStatics_9.aClass153_3361 = var3;
    DummyClass25.aClass153_1628 = var4;
    if (!var0) {
      GlobalStatics_0.setupLanguagePacket(11);
    }

    GlobalStatics_9.aClass11ArrayArray1834 = new Widget[GlobalStatics_9.aClass153_3361
        .method2121(0)][];
    GlobalStatics_0.aBooleanArray1703 = new boolean[GlobalStatics_9.aClass153_3361
        .method2121(0)];
  }

  public static boolean method1529(int var0, int var1, int var2, int var3,
      int var4, int var5, int var6, boolean var7) {
    long var8 = GlobalStatics_9.method2174(var6, var1 + var5, var3 + var0);
    int var10;
    int var11;
    int var12;
    GameObjectConfig var13;
    int var14;
    int[] var15;
    int var16;
    if (var8 != 0L) {
      var10 = 3 & (int) var8 >> 20;
      var11 = (508650 & (int) var8) >> 14;
      var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
      var13 = DummyClass11.method2207(4, var12);
      if (var13.anInt1516 == -1) {
        var14 = var2;
        if (var8 > 0L) {
          var14 = var4;
        }

        var15 = SoftwareIndexedColorSpriteStatics.anIntArray1100;
        var16 = 4 * (-(var3 * 512) + 0xce00) + var1 * 4 + 24624;
        if (var11 == 0 || var11 == 2) {
          if (var10 == 0) {
            var15[var16] = var14;
            var15[512 + var16] = var14;
            var15[var16 + 1024] = var14;
            var15[1536 + var16] = var14;
          } else if (var10 != 1) {
            if (var10 == 2) {
              var15[var16 + 3] = var14;
              var15[var16 + 3 + 512] = var14;
              var15[var16 + 3 + 1024] = var14;
              var15[var16 + 3 + 1536] = var14;
            } else {
              if (var10 == 3) {
                var15[var16 + 1536] = var14;
                var15[1536 + var16 + 1] = var14;
                var15[var16 + 1538] = var14;
                var15[3 + var16 + 1536] = var14;
              }
            }
          } else {
            var15[var16] = var14;
            var15[1 + var16] = var14;
            var15[var16 + 2] = var14;
            var15[var16 + 3] = var14;
          }
        }

        if (var11 == 3) {
          if (var10 == 0) {
            var15[var16] = var14;
          } else if (var10 == 1) {
            var15[var16 + 3] = var14;
          } else if (var10 == 2) {
            var15[var16 + 3 + 1536] = var14;
          } else if (var10 == 3) {
            var15[var16 + 1536] = var14;
          }
        }

        if (var11 == 2) {
          if (var10 == 3) {
            var15[var16] = var14;
            var15[var16 + 512] = var14;
            var15[var16 + 1024] = var14;
            var15[1536 + var16] = var14;
          } else {
            if (var10 == 0) {
              var15[var16] = var14;
              var15[1 + var16] = var14;
              var15[2 + var16] = var14;
              var15[3 + var16] = var14;
            } else {
              if (var10 == 1) {
                var15[var16 + 3] = var14;
                var15[512 + 3 + var16] = var14;
                var15[3 + var16 + 1024] = var14;
                var15[1536 + var16 + 3] = var14;
              } else {
                if (var10 == 2) {
                  var15[1536 + var16] = var14;
                  var15[var16 + 1536 + 1] = var14;
                  var15[1536 + var16 + 2] = var14;
                  var15[var16 + 1539] = var14;
                }
              }
            }
          }
        }
      } else {
        if (!GlobalStatics_2.method888(var1, var13, false, var0, var5, var3,
            var10)) {
          return false;
        }
      }
    }

    var8 = GlobalStatics_6.method557(var6, var1 + var5, var0 + var3);
    if (var8 != 0L) {
      var10 = (int) var8 >> 20 & 3;
      var11 = ((int) var8 & 520964) >> 14;
      var12 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
      var13 = DummyClass11.method2207(4, var12);
      if (var13.anInt1516 != -1) {
        if (!GlobalStatics_2.method888(var1, var13, false, var0, var5, var3,
            var10)) {
          return false;
        }
      } else if (var11 == 9) {
        var14 = 15658734;
        if (var8 > 0L) {
          var14 = 15597568;
        }

        var16 = var1 * 4 + 24624 + 2048 * (103 - var3);
        var15 = SoftwareIndexedColorSpriteStatics.anIntArray1100;
        if (var10 != 0 && var10 != 2) {
          var15[var16] = var14;
          var15[var16 + 512 + 1] = var14;
          var15[var16 + 1024 + 2] = var14;
          var15[1536 + var16 + 3] = var14;
        } else {
          var15[1536 + var16] = var14;
          var15[var16 + 1025] = var14;
          var15[var16 + 512 + 2] = var14;
          var15[var16 + 3] = var14;
        }
      }
    }

    var8 = GLStatics.method104(var6, var1 + var5, var3 + var0);
    if (var8 != 0L) {
      var10 = (int) var8 >> 20 & 3;
      var11 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
      GameObjectConfig var18 = DummyClass11.method2207(4, var11);
      if (var18.anInt1516 != -1 &&
          !GlobalStatics_2.method888(var1, var18, !var7, var0, var5, var3,
              var10)) {
        return false;
      }
    }

    if (!var7) {
      GlobalStatics_0.stereo = true;
    }

    return true;
  }

  public static int method1535(GameWorld var0, GameWorld var1, int var2,
      int var3, int var4, boolean var5, boolean var6) {
    int var7 = DummyClass12.method2201(var1, var4, var2 - 5638, var0, var6);
    if (var7 == 0) {
      if (var2 != 5730) {
        return -76;
      } else if (var3 != -1) {
        int var8 =
            DummyClass12.method2201(var1, var3, var2 ^ 5651, var0, var5);
        return var5 ? -var8 : var8;
      } else {
        return 0;
      }
    } else {
      return var6 ? -var7 : var7;
    }
  }

  public static SoftwareDirectColorSprite method1537(FileUnpacker var0,
      int var1,
      boolean var2) {
    if (GlobalStatics_9.loadSprites(var0, var1)) {
      if (var2) {
        GlobalStatics_0.createSprite(-39, true, -93, null);
      }

      return DummyClass26.method1722(-93);
    } else {
      return null;
    }
  }

  public static SoftwareIndexedColorSprite createSprite(int var0, boolean var1,
      int var2,
      FileUnpacker var3) {
    if (!var1) {
      GlobalStatics_0.method1535(null, null, -64, -40, 23, false, false);
    }

    return GlobalStatics_9.loadSprites(var3, var0, var2, -30901)
        ? DummyClass49.method1364((byte) 82)
        : null;
  }

  public static void clear1(int var0) {
    GlobalStatics_0.aClass94_2151 = null;

    GlobalStatics_0.anIntArray2157 = null;
    GlobalStatics_0.aClass94_2155 = null;
    GlobalStatics_0.aClass94_2149 = null;
    GlobalStatics_0.aClass94_2158 = null;
  }

  public static AbstractDirectColorSprite method1570(int var0, byte var1,
      boolean var2, int var3,
      boolean var4, int var5,
      int var6, boolean var7) {
    ItemConfig var8 = DummyClass35.getItemConfig(var3, (byte) 106);
    if (var6 > 1 && var8.anIntArray804 != null) {
      int var9 = -1;

      for (int var10 = 0; var10 < 10; ++var10) {
        if (var6 >= var8.anIntArray766[var10] &&
            var8.anIntArray766[var10] != 0) {
          var9 = var8.anIntArray804[var10];
        }
      }

      if (var9 != -1) {
        var8 = DummyClass35.getItemConfig(var9, (byte) 84);
      }
    }

    SoftwareModel var21 = var8.method1120(18206);
    if (var21 == null) {
      return null;
    } else {
      SoftwareDirectColorSprite var22 = null;
      if (var8.anInt791 == -1) {
        if (var8.anInt762 != -1) {
          var22 = (SoftwareDirectColorSprite) GlobalStatics_0.method1570(
              var0, (byte) -107, true, var8.anInt795, false, var5, var6,
              false);
          if (var22 == null) {
            return null;
          }
        }
      } else {
        var22 = (SoftwareDirectColorSprite) GlobalStatics_0.method1570(
            0, (byte) 116, true, var8.anInt789, false, 1, 10, true);
        if (var22 == null) {
          return null;
        }
      }

      int[] var11 = SoftwareIndexedColorSpriteStatics.anIntArray1100;
      int var12 = SoftwareIndexedColorSpriteStatics.anInt1092;
      int var13 = DummyClass47.anInt1094;
      int[] var14 = new int[4];
      DummyClass47.method1325(var14);
      SoftwareDirectColorSprite var15 = new SoftwareDirectColorSprite(36, 32);
      DummyClass47.method1319(var15.pixels, 36, 32);
      DummyClass40.method1134();
      DummyClass40.method1145(16, 16);
      int var16 = var8.anInt810;
      DummyClass40.aBoolean843 = false;
      if (var7) {
        var16 = (int) (var16 * 1.5D);
      } else if (var5 == 2) {
        var16 = (int) (1.04D * var16);
      }

      int var18 = MathUtilities.COSINE_TABLE[var8.rotationX] * var16 >> 16;
      int var17 = MathUtilities.SINE_TABLE[var8.rotationX] * var16 >> 16;
      var21.draw(0, var8.rotationY, var8.rotationZ, var8.rotationX,
          var8.translateX,
          var17 - (var21.getMinimumY() / 2 - var8.translateOther),
          var8.translateOther + var18, -1L);
      if (var5 >= 1) {
        var15.method657(1);
        if (var5 >= 2) {
          var15.method657(16777215);
        }

        DummyClass47.method1319(var15.pixels, 36, 32);
      }

      if (var0 != 0) {
        var15.method668(var0);
      }

      int var19 = 73 / ((-56 - var1) / 47);
      if (var8.anInt791 != -1) {
        assert var22 != null;
        var22.method643(0, 0);
      } else if (var8.anInt762 != -1) {
        assert var22 != null;
        DummyClass47.method1319(var22.pixels, 36, 32);
        var15.method643(0, 0);
        var15 = var22;
      }

      if (var4 && (var8.anInt764 == 1 || var6 != 1) && var6 != -1) {
        GlobalStatics_9.aClass3_Sub28_Sub17_Sub1_3440.method681(
            GlobalStatics_10.method123(1000, var6), 0, 9, 16776960, 1);
      }

      DummyClass47.method1319(var11, var12, var13);
      DummyClass47.method1316(var14);
      DummyClass40.method1134();
      DummyClass40.aBoolean843 = true;
      return GlRenderer.USE_OPENGL && !var2
          ? new GlDirectColorSprite(var15)
          : var15;
    }
  }

  public static void method727(int var0) {
    GlobalStatics_9.aClass93_1911.method1524(3);
    int var1 = 56 / ((var0 - 7) / 54);
    GlobalStatics_9.aClass93_1131.method1524(3);
  }

  public static void method728(boolean var0) {
    if (var0) {
      GlobalStatics_0.method731(null, (byte) 118);
    }

    try {
      if (GlobalStatics_9.anInt154 == 1) {
        int var1 = DummyClass55.aClass3_Sub24_Sub4_1421.method499(var0);
        if (var1 > 0 && DummyClass55.aClass3_Sub24_Sub4_1421
            .method473(-124)) {
          var1 -= GlobalStatics_9.anInt546;
          if (var1 < 0) {
            var1 = 0;
          }

          DummyClass55.aClass3_Sub24_Sub4_1421.method506(128, var1);
          return;
        }

        DummyClass55.aClass3_Sub24_Sub4_1421.method505((byte) -128);
        DummyClass55.aClass3_Sub24_Sub4_1421.method485(-110);
        GlobalStatics_9.aClass3_Sub27_1154 = null;
        GlobalStatics_9.aClass83_3579 = null;
        if (DummyClass55.aClass153_1423 != null) {
          GlobalStatics_9.anInt154 = 2;
        } else {
          GlobalStatics_9.anInt154 = 0;
        }
      }
    } catch (Exception var2) {
      var2.printStackTrace();
      DummyClass55.aClass3_Sub24_Sub4_1421.method505((byte) -127);
      DummyClass55.aClass153_1423 = null;
      GlobalStatics_9.aClass3_Sub27_1154 = null;
      GlobalStatics_9.anInt154 = 0;
      GlobalStatics_9.aClass83_3579 = null;
    }
  }

  public static int method729(byte var0, int var1, int var2) {
    if (var0 > -32) {
      return 88;
    } else if (var1 == -2) {
      return 12345678;
    } else if (var1 == -1) {
      if (var2 < 2) {
        var2 = 2;
      } else if (var2 > 126) {
        var2 = 126;
      }

      return var2;
    } else {
      var2 = (127 & var1) * var2 >> 7;
      if (var2 < 2) {
        var2 = 2;
      } else if (var2 > 126) {
        var2 = 126;
      }

      return (var1 & 0xff80) + var2;
    }
  }

  public static void method730(int var0, int var1, byte var2, int var3,
      int var4, int var5) {
    int var6 = 19 % ((var2 + 44) / 47);
    if (var0 >= DummyClass55.anInt1425 && var4 <= GlTexture2d.anInt3765
        && DummyClass13.anInt2020 <= var5
        && GlobalStatics_9.anInt902 >= var3) {
      MaterialShader5.method1632(95, var3, var4, var5, var0, var1);
    } else {
      GlobalStatics_9.method1525(3074, var1, var4, var5, var0, var3);
    }
  }

  public static void method731(FileUnpacker var0, byte var1) {
    int var2 = 3 / ((var1 + 62) / 37);
    GlobalStatics_10.aClass153_3154 = var0;
    DummyClass53.anInt1344 = GlobalStatics_10.aClass153_3154
        .getAmountChildren(16, (byte) 71);
  }

  public static GameString method732(String var0, int var1) {
    if (var1 != 27307) {
      GlobalStatics_0.anInt2589 = -93;
    }

    byte[] var2;
    var2 = var0.getBytes(StandardCharsets.ISO_8859_1);

    GameString var3 = new GameString();
    var3.bytes = var2;
    var3.length = 0;

    for (int var4 = 0; var4 < var2.length; ++var4) {
      if (var2[var4] != 0) {
        var2[var3.length++] = var2[var4];
      }
    }

    return var3;
  }

  public static SomethingQuickChat method733(int var0, int var1) {
    SomethingQuickChat var2 =
        (SomethingQuickChat) GlobalStatics_9.aClass47_3776.get(var1, 1400);
    if (var2 == null) {
      byte[] var3;
      if (var1 < 32768) {
        var3 = GlobalStatics_6.aClass153_3490.getBytes(1, var1);
      } else {
        var3 = DummyClass14.aClass153_1967.getBytes(1, 32767 & var1);
      }

      var2 = new SomethingQuickChat();
      if (var0 != 12345678) {
        GlobalStatics_0.lastPacketId0 = 56;
      }

      if (var3 != null) {
        var2.method546(new Buffer(var3), -1);
      }

      if (var1 >= 0x8000) {
        var2.method548(60);
      }

      GlobalStatics_9.aClass47_3776.put(var1, var2);
      return var2;
    } else {
      return var2;
    }
  }

  public static void setSettings(int var0, GameString var1) {
  }

  public static void method735(int var0) {
    GlobalStatics_0.aClass153_2581 = null;
    GlobalStatics_0.aClass94Array2580 = null;
    GlobalStatics_0.aClass94_2584 = null;
    if (var0 != -22749) {
      GlobalStatics_0.anInt2579 = 66;
    }

    GlobalStatics_0.aClass94_2585 = null;
  }

  public static void method736(int var0, int var1) {
    if (var1 <= 61) {
      GlobalStatics_0.method736(-60, -93);
    }

    if (GlobalStatics_9.anInt154 == 0) {
      DummyClass55.aClass3_Sub24_Sub4_1421.method506(128, var0);
    } else {
      GlobalStatics_10.anInt3423 = var0;
    }
  }

  public static void method1772(int var0, int var1, int var2, NPC var3) {
    if (var3.animationId == var1 && var1 != -1) {
      AnimationSequence var4 = GlobalStatics_8.method45(var1, (byte) -20);
      int var5 = var4.anInt1845;
      if (var5 == 1) {
        var3.anInt2776 = 1;
        var3.anInt2832 = 0;
        var3.anInt2760 = 0;
        var3.anInt2773 = 0;
        var3.anInt2828 = var0;
        GlobalStatics_4
            .method1470(var3.sceneY, var4, 183921384, var3.sceneX, false,
                var3.anInt2832);
      }

      if (var5 == 2) {
        var3.anInt2773 = 0;
      }
    } else if (var1 == -1 || var3.animationId == -1
        || GlobalStatics_8.method45(var1, (byte) -20).anInt1857
        >= GlobalStatics_8
        .method45(var3.animationId,
            (byte) -20).anInt1857) {
      var3.anInt2760 = 0;
      var3.animationId = var1;
      var3.anInt2776 = 1;
      var3.anInt2773 = 0;
      var3.anInt2828 = var0;
      var3.anInt2811 = var3.anInt2816;
      var3.anInt2832 = 0;
      if (var3.animationId != -1) {
        GlobalStatics_4.method1470(var3.sceneY,
            GlobalStatics_8.method45(var3.animationId, (byte) -20),
            var2 + 183921345, var3.sceneX, false, var3.anInt2832);
      }
    }

    if (var2 != 39) {
      GlobalStatics_0.anInt1711 = 41;
    }
  }

  public static void clear29(int var0) {
    GlobalStatics_0.aClass94_1698 = null;
    GlobalStatics_0.aClass94_1707 = null;
    GlobalStatics_0.aBooleanArray1712 = null;
    GlobalStatics_0.aClass94_1702 = null;
    GlobalStatics_0.aBooleanArray1703 = null;
    GlobalStatics_0.aClass94_1699 = null;
    GlobalStatics_0.aClass94_1714 = null;
    if (var0 <= 96) {
      GlobalStatics_9.unbind(null);
    }

    GlobalStatics_0.aClass94_1710 = null;
  }

  public static void method1775() {
    for (int var0 = 0; var0 < GlobalStatics_10.anInt3070; ++var0) {
      SceneSomething var1 = GlobalStatics_3.aClass25Array1868[var0];
      GlobalStatics_5.method2186(var1);
      GlobalStatics_3.aClass25Array1868[var0] = null;
    }

    GlobalStatics_10.anInt3070 = 0;
  }

  public static AbstractTextureSampler createTextureSampler(int type,
      boolean var1) {
    if (type == 0) {
      return new TextureSampler0();
    } else if (type != 1) {
      if (type == 2) {
        return new TextureSampler2();
      } else {
        if (type == 3) {
          return new TextureSampler3();
        } else if (type != 4) {
          if (type == 5) {
            return new TextureSampler5();
          } else if (type == 6) {
            return new TextureSampler6();
          } else if (type != 7) {
            if (type == 8) {
              return new TextureSampler8();
            } else {
              if (type == 9) {
                return new TextureSampler9();
              } else {
                if (type == 10) {
                  return new TextureSampler10();
                } else if (type != 11) {
                  if (type == 12) {
                    return new TextureSampler12();
                  } else if (type != 13) {
                    if (type == 14) {
                      return new TextureSampler14();
                    } else if (type != 15) {
                      if (type == 16) {
                        return new TextureSampler16();
                      } else if (type != 17) {
                        if (type == 18) {
                          return new TextureSampler18();
                        } else if (type == 19) {
                          return new TextureSampler19();
                        } else if (type == 20) {
                          return new TextureSampler20();
                        } else if (type == 21) {
                          return new TextureSampler21();
                        } else if (type != 22) {
                          if (type == 23) {
                            return new TextureSampler23();
                          } else {
                            if (type == 24) {
                              return new TextureSampler24();
                            } else {
                              if (type == 25) {
                                return new TextureSampler25();
                              } else {
                                if (type == 26) {
                                  return new TextureSampler26();
                                } else {
                                  if (type == 27) {
                                    return new TextureSampler27();
                                  } else {
                                    if (type == 28) {
                                      return new TextureSampler28();
                                    } else if (type != 29) {
                                      if (type == 30) {
                                        return new TextureSampler30();
                                      } else {
                                        if (type == 31) {
                                          return new TextureSampler31();
                                        } else {
                                          if (type == 32) {
                                            return new TextureSampler32();
                                          } else {
                                            if (type == 33) {
                                              return new TextureSampler33();
                                            } else if (type == 34) {
                                              return new TextureSampler34();
                                            } else if (type == 35) {
                                              return new TextureSampler35();
                                            } else if (type != 36) {
                                              if (type == 37) {
                                                return new TextureSampler37();
                                              } else if (type != 38) {
                                                if (type == 39) {
                                                  return new TextureSampler39();
                                                } else {
                                                  if (!var1) {
                                                    GlobalStatics_0
                                                        .method1772(8, 6, 81,
                                                        null);
                                                  }

                                                  return null;
                                                }
                                              } else {
                                                return new TextureSampler38();
                                              }
                                            } else {
                                              return new TextureSampler36();
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      return new TextureSampler29();
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          return new TextureSampler22();
                        }
                      } else {
                        return new TextureSampler17();
                      }
                    } else {
                      return new TextureSampler15();
                    }
                  } else {
                    return new TextureSampler13();
                  }
                } else {
                  return new TextureSampler11();
                }
              }
            }
          } else {
            return new TextureSampler7();
          }
        } else {
          return new TextureSampler4();
        }
      }
    } else {
      return new TextureSampler1();
    }
  }

  public static void method1427(boolean var0, int var1) {
    if (var1 == -1 && !GlobalStatics_9.aBoolean1158) {
      GlobalStatics_9.method1870(false);
    } else if (var1 != -1 && (GlobalStatics_4.anInt1691 != var1
        || !GlobalStatics_6.method1391(
        -1)) && GlobalStatics_10.anInt120 != 0
        && !GlobalStatics_9.aBoolean1158) {
      GlobalStatics_5
          .method2099(true, var1, 0, GlobalStatics_9.fileUnpacker6, false,
              GlobalStatics_10.anInt120, 2);
    }

    if (!var0) {
      GlobalStatics_0.aClass94_1192 = null;
    }

    GlobalStatics_4.anInt1691 = var1;
  }

  public static void method1428(int var0, int var1, int var2) {
    if (var1 < 21) {
      GlobalStatics_0.method1430(34, -13);
    }

    DummyClass5.anIntArray2985[var0] = var2;
    VariableUpdate var3 = (VariableUpdate) GlobalStatics_6.variableUpdates.get(
        var0);
    if (var3 == null) {
      var3 = new VariableUpdate(GlobalStatics_10.getCurrentTimeMillis() + 500L);
      GlobalStatics_6.variableUpdates.put(var0, var3);
    } else {
      var3.timestamp = 500L + GlobalStatics_10.getCurrentTimeMillis();
    }
  }

  public static void method1429(byte var0) {
    GlobalStatics_0.aClass3_Sub24_Sub4_1193 = null;
    GlobalStatics_0.COMMAND_REBUILD = null;
    GlobalStatics_0.collisionMaps = null;
    GlobalStatics_0.aClass94_1192 = null;
    GlobalStatics_0.aClass94_1183 = null;
    GlobalStatics_0.aClass94_1179 = null;
    GlobalStatics_0.aClass94_1176 = null;
    GlobalStatics_0.tableCache = null;
    GameStringStatics.aClass130_1194 = null;
    GlobalStatics_0.aClass94_1180 = null;
  }

  public static SoftwareFont method1430(int var0, int var1) {
    if (var0 == -28922) {
      SoftwareFont var2 = (SoftwareFont) GlobalStatics_9.aClass93_1135.get(
          var1);
      if (var2 != null) {
        return var2;
      } else {
        byte[] var3 = GlobalStatics_8.fileUnpacker13.getBytes(var1, 0);
        var2 = new SoftwareFont(var3);
        var2.method697(GlobalStatics_9.aClass109Array3270, null);
        GlobalStatics_9.aClass93_1135.get((byte) -96, var2, var1);
        return var2;
      }
    } else {
      return null;
    }
  }

  public static void clear() {
    GLStatics.aByteArray2111 = null;
  }

  public static SceneSomething2 method1209(int var0, int var1, int var2) {
    SceneGraphTile var3 = GLStatics.sceneGraphTiles[var0][var1][var2];
    if (var3 == null) {
      return null;
    } else {
      SceneSomething2 var4 = var3.aClass70_2234;
      var3.aClass70_2234 = null;
      return var4;
    }
  }

  public static Parameter method1210(int var0, int var1) {
    Parameter var2 = (Parameter) DummyClass6.aClass47_2041.get(var1, 1400);
    if (var0 != 64) {
      GlobalStatics_0.method1218(false, -77, -82);
    }

    if (var2 == null) {
      byte[] var3 = GlobalStatics_10.aClass153_3098.getBytes(11, var1);
      var2 = new Parameter();
      if (var3 != null) {
        var2.method583(207, new Buffer(var3));
      }

      DummyClass6.aClass47_2041.put(var1, var2);
      return var2;
    } else {
      return var2;
    }
  }

  public static void method1213(int plane, SomethingGl0[] var1) {
    GLStatics.aClass3_Sub11ArrayArray2542[plane] = var1;
  }

  public static void method1214(int var0, int var1, int var2, int var3,
      int var4) {
    AreaSoundEffect var5;
    for (
        var5 = (AreaSoundEffect) GlobalStatics_0.aClass61_78.getFirst();
        var5 != null; var5 = (AreaSoundEffect) GlobalStatics_0.aClass61_78.getNext()) {
      GlobalStatics_9.method606(var1, var5, var3, var0, var2, 126);
    }

    byte var6;
    RenderAnimation var7;
    int var8;
    for (
        var5 = (AreaSoundEffect) GlobalStatics_4.aClass61_1242.getFirst();
        var5 != null;
        var5 = (AreaSoundEffect) GlobalStatics_4.aClass61_1242.getNext()) {
      var6 = 1;
      var7 = var5.aClass140_Sub4_Sub2_2324.getRenderAnimationId(false);
      assert var7 != null;
      if (var7.anInt368 == var5.aClass140_Sub4_Sub2_2324.anInt2764) {
        var6 = 0;
      } else {
        if (var7.anInt393 != var5.aClass140_Sub4_Sub2_2324.anInt2764
            && var7.anInt386 != var5.aClass140_Sub4_Sub2_2324.anInt2764
            && var7.anInt375 != var5.aClass140_Sub4_Sub2_2324.anInt2764
            && var7.anInt373 != var5.aClass140_Sub4_Sub2_2324.anInt2764) {
          if (var7.anInt398 == var5.aClass140_Sub4_Sub2_2324.anInt2764
              || var7.anInt372 == var5.aClass140_Sub4_Sub2_2324.anInt2764
              || var5.aClass140_Sub4_Sub2_2324.anInt2764 == var7.anInt379
              || var7.anInt406 == var5.aClass140_Sub4_Sub2_2324.anInt2764) {
            var6 = 3;
          }
        } else {
          var6 = 2;
        }
      }

      if (var5.anInt2322 != var6) {
        var8 = GlobalStatics_9.method1232(var5.aClass140_Sub4_Sub2_2324, -1);
        if (var8 != var5.anInt2332) {
          if (var5.aClass3_Sub24_Sub1_2312 != null) {
            GlobalStatics_9.aClass3_Sub24_Sub2_2563.method461(
                var5.aClass3_Sub24_Sub1_2312);
            var5.aClass3_Sub24_Sub1_2312 = null;
          }

          var5.anInt2332 = var8;
        }

        var5.anInt2322 = var6;
      }

      var5.anInt2326 = var5.aClass140_Sub4_Sub2_2324.sceneX;
      var5.anInt2321 =
          var5.aClass140_Sub4_Sub2_2324.sceneX
              + var5.aClass140_Sub4_Sub2_2324.getSize() * 64;
      var5.anInt2308 = var5.aClass140_Sub4_Sub2_2324.sceneY;
      var5.anInt2307 =
          var5.aClass140_Sub4_Sub2_2324.sceneY
              + var5.aClass140_Sub4_Sub2_2324.getSize() * 64;
      GlobalStatics_9.method606(var1, var5, var3, var0, var2, var4 ^ 113);
    }

    if (var4 == 1) {
      for (
          var5 = (AreaSoundEffect) GlobalStatics_9.aClass130_4046.getFirst(88);
          var5 != null;
          var5 = (AreaSoundEffect) GlobalStatics_9.aClass130_4046.getNext(
              -91)) {
        var6 = 1;
        var7 = var5.aClass140_Sub4_Sub1_2327.getRenderAnimationId(false);
        assert var7 != null;
        if (var5.aClass140_Sub4_Sub1_2327.anInt2764 == var7.anInt368) {
          var6 = 0;
        } else {
          if (var5.aClass140_Sub4_Sub1_2327.anInt2764 != var7.anInt393
              && var5.aClass140_Sub4_Sub1_2327.anInt2764 != var7.anInt386
              && var5.aClass140_Sub4_Sub1_2327.anInt2764 != var7.anInt375
              && var7.anInt373 != var5.aClass140_Sub4_Sub1_2327.anInt2764) {
            if (var7.anInt398 == var5.aClass140_Sub4_Sub1_2327.anInt2764
                || var5.aClass140_Sub4_Sub1_2327.anInt2764 == var7.anInt372
                || var5.aClass140_Sub4_Sub1_2327.anInt2764 == var7.anInt379
                || var5.aClass140_Sub4_Sub1_2327.anInt2764 == var7.anInt406) {
              var6 = 3;
            }
          } else {
            var6 = 2;
          }
        }

        if (var5.anInt2322 != var6) {
          var8 = DummyClass50.method1398(0, var5.aClass140_Sub4_Sub1_2327);
          if (var5.anInt2332 != var8) {
            if (var5.aClass3_Sub24_Sub1_2312 != null) {
              GlobalStatics_9.aClass3_Sub24_Sub2_2563.method461(
                  var5.aClass3_Sub24_Sub1_2312);
              var5.aClass3_Sub24_Sub1_2312 = null;
            }

            var5.anInt2332 = var8;
          }

          var5.anInt2322 = var6;
        }

        var5.anInt2326 = var5.aClass140_Sub4_Sub1_2327.sceneX;
        var5.anInt2321 =
            var5.aClass140_Sub4_Sub1_2327.sceneX
                + 64 * var5.aClass140_Sub4_Sub1_2327.getSize();
        var5.anInt2308 = var5.aClass140_Sub4_Sub1_2327.sceneY;
        var5.anInt2307 =
            var5.aClass140_Sub4_Sub1_2327.sceneY
                + var5.aClass140_Sub4_Sub1_2327.getSize() * 64;
        GlobalStatics_9.method606(var1, var5, var3, var0, var2, 110);
      }

    }
  }

  public static void clear27() {
    GlobalStatics_0.aClass93_939 = null;
  }

  public static GameString method1218(boolean var0, int var1, int var2) {
    return var1 <= 122 ? null
        : GlobalStatics_5.method1723((byte) -128, var0, 10, var2);
  }

  public static void clear78() {
    GlobalStatics_0.aClass93_21 = null;
    GlobalStatics_0.aClass94_24 = null;
    GlobalStatics_0.aClass94_22 = null;
    GlobalStatics_0.anIntArrayArray20 = null;
    GlobalStatics_0.aClass94_26 = null;
  }

  public static int method54(int var0, boolean var1) {
    return var1 ? -81 : var0 & 127;
  }

  public static void method55() {
    GlobalStatics_0.aClass93_21.method1523();
    DummyClass54.aClass93_1401.method1523();
    GlobalStatics_9.aClass93_4051.method1523();
    DummyClass14.aClass93_1965.method1523();
  }
}
