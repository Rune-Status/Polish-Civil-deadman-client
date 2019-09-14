package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.shader.MaterialShader5;

public final class TextureSampler13 extends AbstractTextureSampler {

  public static int anInt3362 = -1;
  public static int cameraZ;
  public static Deque projectiles = new Deque();
  public static int anInt3365;
  public static long lastWrittenTime;
  public static int[] anIntArray3367 = new int[64];
  public static GameString aClass94_3368 = GameString.create(":clanreq:");


  public TextureSampler13() {
    super(0, true);
  }

  private int method314(int var1, int var2, int var3) {
    if (var2 != 7001) {
        this.method314(-83, 92, 48);
      }

      int var4 = var3 - -(57 * var1);
      var4 ^= var4 << 1;
      return 4096 + -((var4 * (var4 * var4 * 15731 - -789221) - -1376312589 & Integer.MAX_VALUE)
        / 262144);
  }

  public int[] method154(int var1, byte var2 ) {
    int var4 = 104 % ((30 - var2) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int var5 = DummyClass4.anIntArray2999[var1];

        for (int var6 = 0; var6 < SomethingLight0.anInt1559; ++var6) {
          var3[var6] =
              this.method314(var5, 7001, TextureCache.anIntArray2125[var6]) % 4096;
        }
      }

      return var3;
  }

  public static void method312(int var0, int var1, int var2, Player var3, int var4) {
    if (TextureCache.localPlayer != var3) {
        if (TextureSampler25.amountContextActions < 400) {
          GameString var5;
          if (~var3.skillTotal == -1) {
            boolean var6 = true;
            if (~TextureCache.localPlayer.anInt3970 != 0 && var3.anInt3970
                != -1) {
              int var7 = var3.combatLevel < TextureCache.localPlayer.combatLevel ?
                TextureCache.localPlayer.combatLevel :
                var3.combatLevel;
              int var8 = ~TextureCache.localPlayer.anInt3970 > ~var3.anInt3970 ?
                TextureCache.localPlayer.anInt3970 :
                var3.anInt3970;
              int var9 = 5 - -(var7 * 10 / 100) + var8;
              int var10 = -var3.combatLevel + TextureCache.localPlayer.combatLevel;
              if (var10 < 0) {
                var10 = -var10;
              }

              if (var9 < var10) {
                var6 = false;
              }
            }

            GameString var13 = AbstractImageProducer.gameId != 1 ?
              DummyClass32.aClass94_525 :
              AudioSomethingSomething.aClass94_2526;
            if (var3.combatLevel < var3.anInt3965) {
              var5 = RenderAnimation.concat(new GameString[] {
                var3.getFullName(), var6 ?
                SomethingScene.method1295(var3.combatLevel, (byte) -73,
                  TextureCache.localPlayer.combatLevel) :
                MonoChromaticImageBuffer.aClass94_2562, SomethingScene.aClass94_1072, var13,
                SomethingScene.toString(var3.combatLevel), DummyClass59.aClass94_673,
                SomethingScene.toString(var3.anInt3965 + -var3.combatLevel),
                AreaSoundEffect.aClass94_2335
              });
            } else {
              var5 = RenderAnimation.concat(new GameString[] {
                var3.getFullName(), var6 ?
                SomethingScene.method1295(var3.combatLevel, (byte) -128,
                  TextureCache.localPlayer.combatLevel) :
                MonoChromaticImageBuffer.aClass94_2562, SomethingScene.aClass94_1072, var13,
                SomethingScene.toString(var3.combatLevel), AreaSoundEffect.aClass94_2335
              });
            }
          } else {
            var5 = RenderAnimation.concat(new GameString[] {
              var3.getFullName(), SomethingScene.aClass94_1072, DummyClass32.SKILL,
              SomethingScene.toString(var3.skillTotal), AreaSoundEffect.aClass94_2335
            });
          }

          int var12;
          if (~Something3d.anInt3012 == -2) {
            ScriptState.method1177(DummyClass54.anInt1403, var0, (byte) -80,
              RenderAnimation.concat(
                new GameString[] {RenderAnimation.aClass94_378, DummyClass42.aClass94_892, var5}),
              var4, (short) 1, TextureSampler14.aClass94_3388, var2);
            ++MilliFrameRegulator.anInt2684;
          } else if (!SceneNode.aBoolean1837) {
            for (var12 = 7; (var12 >= 1 -1); --var12) {
              if (CollisionMap.playerOptions[var12] != null) {
                ++Cursor.anInt880;
                short var14 = 0;
                boolean var16 = false;
                if (~AbstractImageProducer.gameId == -1
                  && CollisionMap.playerOptions[var12].method1531(TextureSampler36.aClass94_3427)) {
                  if (var3.combatLevel > TextureCache.localPlayer.combatLevel) {
                    var14 = 2000;
                  }

                  if ((TextureCache.localPlayer.anInt3956 != 1 -1)
                      && (var3.anInt3956 != 1 -1)) {
                    if (~TextureCache.localPlayer.anInt3956
                        == ~var3.anInt3956) {
                      var14 = 2000;
                    } else {
                      var14 = 0;
                    }
                  }
                } else if (DummyClass3.aBooleanArray54[var12]) {
                  var14 = 2000;
                }

                short var15 = EnumStringFetcher.aShortArray2167[var12];
                var15 += var14;
                ScriptState.method1177(TextureSampler35.anIntArray3328[var12],
                    var0,
                  (byte) -73, RenderAnimation.concat(
                    new GameString[] {MonoChromaticImageBuffer.aClass94_2562, var5}), var4, var15,
                  CollisionMap.playerOptions[var12], var2);
              }
            }
          } else if ((8 & Something3dRoot.anInt2051) != 0) {
            ++TextureSampler20.anInt3151;
            ScriptState.method1177(BufferObject.anInt1887, var0, (byte) -58,
              RenderAnimation.concat(
                new GameString[] {DummyClass59.aClass94_676, DummyClass42.aClass94_892, var5}),
              var4, (short) 15, Parameter.aClass94_3621, var2);
          }

          if (var1 <= 0) {
            TextureSampler13.lastWrittenTime = -79L;
          }

          for (var12 = 0; TextureSampler25.amountContextActions > var12; ++var12) {
            if (~TextureSampler27.aShortArray3095[var12] == -61) {
              DummyClass8.aClass94Array4016[var12] = RenderAnimation.concat(
                new GameString[] {MonoChromaticImageBuffer.aClass94_2562, var5});
              break;
            }
          }

        }
      }
  }

  public static void method313(byte var0) {
    if (var0 <= 51) {
        TextureSampler13.method312(77, -52, -42, null, 120);
      }

      SomethingIndex150.method2257(96);
      ClassCheckRequest.method128(2);
      DummyClass8.method2220(0);
      StringNode0.method139(69);
      MonoChromaticImageBuffer.method512((byte) -108);
      MaterialShader5.method1626((byte) -128);
      TextureSampler33.method182(true);
      Unsure.method2077(true);
      SceneSomething.method959(0);
      ProjectileNode.method716(14073);
      SomethingVolume15.method370((byte) -73);
      TextureSampler3.method304(6799);
      DummyClass59.method1045(-19761);
      TextureSampler33.method183(-108);
      StringNode.method727(91);
      SomethingWorldMappy.method397((byte) -41);
      if ((TextureSampler20.usageMode != 1 -1)) {
        for (int var1 = 0; SomethingMidiFile.byteArrayPool.length > var1; ++var1) {
          SomethingMidiFile.byteArrayPool[var1] = null;
        }

        DummyClass42.anInt893 = 0;
      }

      DummyClass58.method1659(16712751);
      StringNode0.method142(true);
      HashTableIterator.aClass93_1135.method1524(3);
      if (!GlRenderer.useOpenGlRenderer) {
        ((TextureCache) DummyClass40.textureCache).method1618(0);
      }

      DummyClass42.aClass47_885.method1101(2);
      SomethingTexture3.animationFrames.method2137((byte) 56);
      ProjectileNode.animationBases.method2137((byte) 56);
      GameObject.widgets.method2137((byte) 56);
      AbstractMouseWheel.soundEffects.method2137((byte) 56);
      TextureSampler26.maps.method2137((byte) 56);
      SomethingTexture1.fileUnpacker6.method2137((byte) 56);
      DummyClass13.models.method2137((byte) 56);
      Projectile.sprites.method2137((byte) 56);
      TextureSampler28.fileUnpacker10.method2137((byte) 56);
      SubNode.fileUnpacker11.method2137((byte) 56);
      WidgetAccess.scripts.method2137((byte) 56);
      TextureSampler1.aClass93_3130.method1524(3);
  }

  public static void method315(int var0) {
    TextureSampler13.projectiles = null;
      TextureSampler13.anIntArray3367 = null;

      TextureSampler13.aClass94_3368 = null;
  }

  public static void method316(CollisionMap[] var0, int var1, byte[] var2, int var3, int var4,
                              int var5, int var6, boolean var7, int var8, int var9, byte var10) {
    if (var10 == -54) {
        int var12 = -1;
        Buffer var11 = new Buffer(var2);

        while (true) {
          int var13 = var11.method773((byte) -127);
          if (~var13 == -1) {
            return;
          }

          var12 += var13;
          int var14 = 0;

          while (true) {
            int var15 = var11.readUnsignedShortSmart();
            if (~var15 == -1) {
              break;
            }

            var14 += -1 + var15;
            int var16 = 63 & var14;
            int var17 = var14 >> 6 & 63;
            int var18 = var14 >> 12;
            int var19 = var11.readUnsignedByte();
            int var20 = var19 >> 2;
            int var21 = 3 & var19;
            if (~var3 == ~var18 && ~var17 <= ~var8 && var17 < 8 + var8 && var9 <= var16
              && 8 + var9 > var16) {
              GameObjectConfig var22 = DummyClass11.method2207(4, var12);
              int var23 =
                VariableUpdate.method121(var16 & 7, var4, var21, var22.anInt1485, var22.anInt1480,
                  1, 7 & var17) + var5;
              int var24 =
                SceneNode.method1863(var22.anInt1480, var4, (byte) 126, var22.anInt1485, 7 & var17,
                  var21, 7 & var16) + var6;
              if ((var23 > 1 -1) && var24 > 0 && ~var23 > -104 && var24 < 103) {
                CollisionMap var25 = null;
                if (!var7) {
                  int var26 = var1;
                  if ((BZipDecompressorState.tileFlags[1][var23][var24] & 2)
                      == 2) {
                    var26 = var1 - 1;
                  }

                  if (var26 >= 0) {
                    var25 = var0[var26];
                  }
                }

                DummyClass31.method1683(var1, !var7, var1, var7, var25, var12, var20, var23,
                  (byte) 50, var24, 3 & var21 + var4);
              }
            }
          }
        }
      }
  }

}
