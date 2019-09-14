package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.opengl.DummyClass46;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlUtils;

public final class GlobalStatics_0 {

  public static GameString LINE_BREAK = GameString.create("<br>");
  public static GameString aClass94_2599 =
      GameString.create("d-Broulement:");
  public static SomethingWorldMapy aClass3_Sub28_Sub3_2600;
  public static FileRequester[] aClass151_Sub1Array2601 = new FileRequester[28];
  public static GameString aClass94_2593 =
      GameString.create("Loaded interfaces");
  public static GameString LOADED_INTERFACES = GlobalStatics_0.aClass94_2593;
  public static int[] anIntArray2591;
  public static int anInt2592;
  public static GameString aClass94_2594 =
      GameString.create("Polices charg-Bes");
  public static GameString[] aClass94Array2596;
  public static int[] anIntArray634 = new int[256];
  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_637;
  public static int anInt638;
  public static int anInt639;
  public static byte[][][] aByteArrayArrayArray640;
  public static int anInt641;

  static {
    for (int var1 = 0; var1 < 256; ++var1) {
      int var0 = var1;

      for (int var2 = 0; (var2 < 8); ++var2) {
        if ((1 & var0) == 1) {
          var0 = var0 >>> 1 ^ -306674912;
        } else {
          var0 >>>= 1;
        }
      }

      GlobalStatics_0.anIntArray634[var1] = var0;
    }

    GlobalStatics_0.anInt639 = 0;
    GlobalStatics_0.anInt638 = 0;
    GlobalStatics_0.anInt641 = 0;
  }

  public static GameString method802(int var0, boolean var1) {
    if (!var1) {
      GlobalStatics_0.method746((byte) -33);
    }

    return (DummyClass8.aClass94Array4016[var0].getLength() > 0)
        ? RenderAnimation.concat(
        new GameString[]{GroundItem.aClass94Array2935[var0],
            DummyInputStream.aClass94_43,
            DummyClass8.aClass94Array4016[var0]})
        : GroundItem.aClass94Array2935[var0];
  }

  public static void method744(boolean var0) {
    if (!var0) {
      GlobalStatics_0.method784(-10, -32, -21);
    }

    ++Keyboard.anInt1908;
  }

  public static void method746(byte var0) {
    MouseRecorder.aClass93_1013.method1524(3);
  }

  public static void method767(int var0) {
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
        for (var10 = 0; (var10 < 64); ++var10) {
          for (var11 = 0; (var11 < 64); ++var11) {
            if (((var5 + var10) > 0) && var10 + var5 < 103 &&
                ((var3 + var11) > 0) && ((var11 + var3) < 103)) {
              collisionMaps[var9]
                  .anIntArrayArray1304[var10 + var5][var3 + var11] =
                  ClientScript.bitAnd(
                      collisionMaps[var9]
                          .anIntArrayArray1304[var10 + var5][var3 + var11],
                      -16777217);
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
      for (var11 = 0; (var11 < 64); ++var11) {
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
            if ((var5 >= 104)) {
              var14 = 104;
            }
          } else {
            var14 = 0;
          }

          var24 = var3;
          if ((var3 < 0)) {
            var24 = 0;
          } else if ((var3 >= 104)) {
            var24 = 104;
          }

          var15 = 64 + var5;
          var17 = var3 + 64;
          if ((var17 >= 0)) {
            if (var17 >= 104) {
              var17 = 104;
            }
          } else {
            var17 = 0;
          }

          if ((var15 < 0)) {
            var15 = 0;
          } else if (var15 >= 104) {
            var15 = 104;
          }

          while ((var14 < var15)) {
            while (var24 < var17) {
              SceneShadowMap.aByteArrayArrayArray1774[var12][var14][var24] =
                  0;
              ++var24;
            }

            ++var14;
          }
        } else {
          if (var13 == 1) {
            for (var14 = 0; (var14 < 64); var14 += 4) {
              for (var15 = 0; var15 < 64; var15 += 4) {
                byte var16 = var20.readByte();

                for (var17 = var14 + var5; 4 + var5 + var14 > var17;
                    ++var17) {
                  for (int var18 = var3 + var15; (var18 < (4 + var3 + var15));
                      ++var18) {
                    if (var17 >= 0 && (var17 < 104) && var18 >= 0 &&
                        (var18 < 104)) {
                      SceneShadowMap
                          .aByteArrayArrayArray1774[var12][var17][var18] =
                          var16;
                    }
                  }
                }
              }
            }
          } else {
            if (var13 == 2 && (var12 > 0)) {
              var15 = var5 + 64;
              var24 = var3;
              var17 = var3 + 64;
              if ((var15 < 0)) {
                var15 = 0;
              } else if (var15 >= 104) {
                var15 = 104;
              }

              if ((var3 >= 0)) {
                if ((var3 >= 104)) {
                  var24 = 104;
                }
              } else {
                var24 = 0;
              }

              if ((var17 >= 0)) {
                if ((var17 >= 104)) {
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
                while ((var24 < var17)) {
                  SceneShadowMap
                      .aByteArrayArrayArray1774[var12][var14][var24] =
                      SceneShadowMap
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
      if (GlRenderer.useOpenGlRenderer && !var1) {
        BlockConfig var22 = null;

        while ((var20.position < var20.bytes.length)) {
          var12 = var20.readUnsignedByte();
          if (var12 == 0) {
            var22 = new BlockConfig(var20);
          } else {
            if ((var12 != 1)) {
              throw new IllegalStateException();
            }

            var23 = var20.readUnsignedByte();
            if (var23 > 0) {
              for (var14 = 0; var23 > var14; ++var14) {
                Light var25 = new Light(var20);
                if ((var25.anInt705 == 31)) {
                  LightIntensity var26 = DummyClass50.method1401(
                      1001, var20.readUnsignedShort());
                  var25.method1060((byte) -67, var26.anInt896, var26.anInt908,
                      var26.anInt899, var26.anInt907);
                }

                var25.anInt708 += var3 << 7;
                var25.anInt703 += var5 << 7;
                var17 = var25.anInt708 >> 7;
                var24 = var25.anInt703 >> 7;
                if ((var24 >= 0) && var17 >= 0 && (var24 < 104) &&
                    (var17 < 104)) {
                  var25.aBoolean696 =
                      (BZipDecompressorState.tileFlags[1][var24][var17]
                          & 2) != 0;
                  var25.anInt697 =
                      AbstractGameWorld
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

        for (var12 = 0; (var12 < 8); ++var12) {
          for (var23 = 0; (var23 < 8); ++var23) {
            var14 = var12 + (var5 >> 3);
            var15 = (var3 >> 3) + var23;
            if (var14 >= 0 && var14 < 13 && (var15 >= 0) && (var15 < 13)) {
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
                SceneShadowMap.aByteArrayArrayArray1774[var11][var14][var15] =
                    0;
              }
            }
          }
        }
      }
    }
  }

  public static SomethingSceneJ method784(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    return var3 != null && var3.aClass12_2230 != null ? var3.aClass12_2230
        : null;
  }

  public static void method792(int var0) {
    if (var0 == 9179409) {
      int var1 = DummyClass20.method1817((byte) 70);
      if (var1 == 0) {
        AbstractImageProducer.aByteArrayArrayArray2008 = null;
        SceneShadowMap.method1816(0, -7);
      } else if ((var1 == 1)) {
        SomethingInScenePacket202.method112((byte) 0, (byte) 55);
        SceneShadowMap.method1816(512, -7);
        TextureSampler19.method257((byte) 125);
      } else {
        SomethingInScenePacket202.method112(
            (byte) (-4 + BitVariable.anInt1127 & 255), (byte) 55);
        SceneShadowMap.method1816(2, -7);
      }
    }
  }

  public static void method795(byte var0, int var1) {
    if (var0 != 14) {
      GlobalStatics_0.anIntArray2591 = null;
    }

    ClientScriptCall.aClass93_2450.method1522(var0 ^ -114, var1);
  }

  public static void method799(int var0, int var1, int var2, int var3,
      int var4) {
    if ((GameObject.anInt2737 < 100)) {
      GroundItemNode.method626(64);
    }

    if (GlRenderer.useOpenGlRenderer) {
      GlUtils.clip(var0, var2, var0 + var4, var3 + var2);
    } else {
      DummyClass47.method1324(var0, var2, var0 + var4, var3 + var2);
    }

    int var6;
    int var7;
    if ((GameObject.anInt2737 >= 100)) {
      DummyClass1.anInt410 =
          (int) ((var3 * 2) / AbstractGameWorld.aFloat727);
      DummyClass44.anInt930 =
          SomethingQuickChat2.anInt3536 +
              -((int) (var4 / AbstractGameWorld.aFloat727));
      int var15 = -((int) (var4 / AbstractGameWorld.aFloat727)) +
          SomethingQuickChat2.anInt3536;
      var6 = SpawnedGameObject.anInt2251 -
          (int) (var3 / AbstractGameWorld.aFloat727);
      DummyClass44.anInt934 =
          SpawnedGameObject.anInt2251 +
              -((int) (var3 / AbstractGameWorld.aFloat727));
      int var8 = SpawnedGameObject.anInt2251 +
          (int) (var3 / AbstractGameWorld.aFloat727);
      var7 = (int) (var4 / AbstractGameWorld.aFloat727) +
          SomethingQuickChat2.anInt3536;
      GZipDecompressor.anInt817 =
          (int) ((var4 * 2) / AbstractGameWorld.aFloat727);
      if (var1 != 64) {
        GlobalStatics_0.aClass94Array2596 = null;
      }

      if (GlRenderer.useOpenGlRenderer) {
        if (TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221 == null ||
            (TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221.anInt3707 != var4) ||
            (TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221.anInt3696 != var3)) {
          TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221 = null;
          TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221 =
              new SoftwareDirectColorSprite(var4, var3);
        }

        DummyClass47.method1319(
            TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221.pixels, var4, var3);
        SubNode.method523(var4, 0, 0, var7, var6, 0, var8, var3, var15);
        DummyClass30.method938(var4, 0, var7, var8, var3, 0, 1, var15, var6);
        SomethingInScenePacket202.method111((byte) -54, 0, 0, var15, var4,
            var8, var6, var7, var3);
        GlUtils.drawImage(
            TextureSampler4.aClass3_Sub28_Sub16_Sub2_3221.pixels, var0, var2,
            var4, var3);
        DummyClass47.anIntArray1100 = null;
      } else {
        SubNode.method523(var4 + var0, var2, 0, var7, var6, var0, var8,
            var2 + var3, var15);
        DummyClass30.method938(var0 + var4, var0, var7, var8, var3 + var2,
            var2, 1, var15, var6);
        SomethingInScenePacket202.method111((byte) -100, var0, var2, var15,
            var0 + var4, var8, var6, var7,
            var3 + var2);
      }

      if (AbstractDirectColorSprite.anInt3704 > 0) {
        --ByteArrayNode.anInt3611;
        if ((ByteArrayNode.anInt3611 == 0)) {
          ByteArrayNode.anInt3611 = 20;
          --AbstractDirectColorSprite.anInt3704;
        }
      }

      if (DummyClass29.aBoolean438) {
        int var10 = -8 + var2 + var3;
        int var9 = -5 + (var0 + var4);
        SomethingTilek.p12Font.method688(
            RenderAnimation.concat(new GameString[]{
                DummyClass45.aClass94_985,
                SomethingScene.toString(AnimationSequence.fps)}),
            var9, var10, 16776960, -1);
        Runtime var11 = Runtime.getRuntime();
        int var12 = (int) ((var11.totalMemory() - var11.freeMemory())
            / 1024L);
        int var13 = 16776960;
        var10 -= 15;
        if ((var12 > 65536)) {
          var13 = 16711680;
        }

        SomethingTilek.p12Font.method688(
            RenderAnimation.concat(new GameString[]{
                DummyClass25.MEMORY_PREFIX, SomethingScene.toString(var12),
                TextureSampler34.aClass94_3055}),
            var9, var10, var13, -1);
        var10 -= 15;
      }

    } else {
      byte var5 = 20;
      var6 = var0 + (var4 / 2);
      var7 = var3 / 2 + (var2 - 18) - var5;
      if (GlRenderer.useOpenGlRenderer) {
        GlUtils.fillQuad(var0, var2, var4, var3, 0);
        GlUtils.drawQuad(var6 - 152, var7, 304, 34, 9179409);
        GlUtils.drawQuad(var6 - 151, var7 + 1, 302, 32, 0);
        GlUtils.fillQuad(-150 + var6, var7 + 2, 3 * GameObject.anInt2737, 30,
            9179409);
        GlUtils.fillQuad(-150 + var6 + GameObject.anInt2737 * 3, var7 + 2,
            300 - (3 * GameObject.anInt2737), 30, 0);
      } else {
        DummyClass47.method1323(var0, var2, var4, var3, 0);
        DummyClass47.method1311(var6 - 152, var7, 304, 34, 9179409);
        DummyClass47.method1311(var6 - 151, 1 + var7, 302, 32, 0);
        DummyClass47.method1323(var6 - 150, var7 + 2,
            GameObject.anInt2737 * 3, 30, 9179409);
        DummyClass47.method1323(3 * GameObject.anInt2737 - 150 + var6,
            var7 + 2, -(GameObject.anInt2737 * 3) + 300,
            30, 0);
      }

      FloorOverlay.aClass3_Sub28_Sub17_2096.draw(
          IdentityKit.aClass94_462, var6, var5 + var7, 16777215, -1);
    }
  }

  public static AbstractFrameRegulator method1012(byte var0) {
    try {
      if (var0 != -31) {
        aClass3_Sub28_Sub16_637 = null;
      }

      return (AbstractFrameRegulator) Class.forName(
          "com.jagex.runescape.NanoFrameRegulator").newInstance();
    } catch (Throwable var2) {
      return new MilliFrameRegulator();
    }
  }

  public static GameString method1013(byte var0, int var1) {
    GameString var2 = SomethingScene.toString(var1);
    if (var0 >= -87) {
      return null;
    } else {
      for (int var3 = var2.getLength() - 3; var3 > 0; var3 -= 3) {
        var2 = RenderAnimation.concat(new GameString[]{
            var2.substring(var3, 0, 0), TextureSampler0.aClass94_3268,
            var2.substring(var3)
        });
      }

      return var2.getLength() > 9 ? RenderAnimation.concat(new GameString[]{
          Keyboard.aClass94_1917, var2.substring(-8 + var2.getLength(), 0, 0),
          TextureSampler30.aClass94_3124, SomethingScene.aClass94_1072, var2,
          OndemandRequester.aClass94_995
      }) : (var2.getLength() > 6 ?
          RenderAnimation.concat(new GameString[]{
              TextureSampler23.aClass94_3211,
              var2.substring(-4 + var2.getLength(), 0, 0),
              AnimationSomething.aClass94_3586, SomethingScene.aClass94_1072,
              var2,
              OndemandRequester.aClass94_995
          }) :
          RenderAnimation.concat(
              new GameString[]{DummyClass10.aClass94_2082, var2,
                  StringNode.aClass94_2584}));
    }
  }

  public static void method1014(int var0, int var1, int var2) {
    int var3 = 120 / ((15 - var0) / 41);

    for (int var4 = 0; var4 < ScriptState.amountFloors; ++var4) {
      FloorOverlay var5 = TextureSampler10.method350((byte) 120, var4);
      if (var5 != null) {
        int var6 = var5.anInt2095;
        if (var6 >= 0 && !DummyClass40.textureCache.method17(var6, 126)) {
          var6 = -1;
        }

        int var7;
        int var8;
        int var9;
        int var10;
        if ((var5.anInt2098 < 0)) {
          if (var6 >= 0) {
            var7 = DummyClass40.hslTable[StringNode.method729((byte) -74,
                DummyClass40.textureCache.method15(var6, '\uffff'), 96)];
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

            var10 = var9 + (896 & var8) + ('\ufc00' & var8 + var2);
            var7 = DummyClass40.hslTable[StringNode
                .method729((byte) -127, var10, 96)];
          }
        } else {
          var8 = var5.anInt2098;
          var9 = (127 & var8) + var1;
          if ((var9 < 0)) {
            var9 = 0;
          } else if ((var9 > 127)) {
            var9 = 127;
          }

          var10 = (896 & var8) + ('\ufc00' & var2 + var8) + var9;
          var7 = DummyClass40.hslTable[StringNode
              .method729((byte) -63, var10, 96)];
        }

        DummyClass51.anIntArray1161[1 + var4] = var7;
      }
    }
  }

  public static void method1016(byte var0) {
    aByteArrayArrayArray640 = null;
    if (var0 <= 85) {
      anInt638 = 33;
    }

    anIntArray634 = null;
    aClass3_Sub28_Sub16_637 = null;
  }
}
