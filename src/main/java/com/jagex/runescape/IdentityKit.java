package com.jagex.runescape;

import com.jagex.runescape.opengl.GlTexture2d;

public final class IdentityKit {

  private static GameString aClass94_473 =
    GameString.create("Loading title screen )2 ");
  private static GameString aClass94_477 = GameString.create("Loading)3)3)3");
  public static GameString aClass94_463 = GameString.create("Bitte entfernen Sie ");
  public static GameString aClass94_465 = GameString.create(" ");
  public static int anInt467;
  public static GameString aClass94_468 = GameString.create("(U");
  public static int lastPacketId2;
  public static int anInt472;
  public static GameString aClass94_461 = IdentityKit.aClass94_473;
  public static GameString aClass94_462 = IdentityKit.aClass94_477;
  public int anInt466 = -1;
  public boolean aBoolean476;
  private short[] aShortArray460;
  private short[] aShortArray464;
  private short[] aShortArray470;
  private short[] aShortArray471;
  private int[] anIntArray474;
  private final int[] anIntArray475 = {-1, -1, -1, -1, -1};

  public Model method941(boolean var1 ) {
    if (var1) {
        int var3 = 0;
        Model[] var2 = new Model[5];

        for (int var4 = 0; -6 < ~var4; ++var4) {
          if (0 != ~this.anIntArray475[var4]) {
            var2[var3++] =
                Model.getModel(SomethingQuickChatK.aClass153_152,
                    this.anIntArray475[var4], 0);
          }
        }

        Model var7 = new Model(var2, var3);
        int var5;
        if (this.aShortArray464 != null) {
          for (var5 = 0; ~var5 > ~this.aShortArray464.length; ++var5) {
            var7.replaceColor(this.aShortArray464[var5],
                this.aShortArray460[var5]);
          }
        }

        if (null != this.aShortArray471) {
          for (var5 = 0; ~this.aShortArray471.length < ~var5; ++var5) {
            var7.replaceMaterial(this.aShortArray471[var5],
                this.aShortArray470[var5]);
          }
        }

        return var7;
      } else {
        return null;
      }
  }

  public boolean method942(int var1 ) {
    if (null == this.anIntArray474) {
        return true;
      } else {
        boolean var2 = true;
        if (var1 < 72) {
          this.method948(44);
        }

        for (int var3 = 0; ~var3 > ~this.anIntArray474.length; ++var3) {
          if (!SomethingQuickChatK.aClass153_152.method2129((byte) -90, 0,
              this.anIntArray474[var3])) {
            var2 = false;
          }
        }

        return var2;
      }
  }

  private void method946(byte var1, Buffer var2, int var3) {
    if (var1 >= -16) {
        this.aShortArray470 = null;
      }

      if (~var3 == -2) {
        this.anInt466 = var2.readUnsignedByte();
      } else {
        int var4;
        int var5;
        if (-3 == ~var3) {
          var4 = var2.readUnsignedByte();
          this.anIntArray474 = new int[var4];

          for (var5 = 0; var4 > var5; ++var5) {
            this.anIntArray474[var5] = var2.readUnsignedShort();
          }
        } else if (-4 == ~var3) {
          this.aBoolean476 = true;
        } else if (-41 != ~var3) {
          if (-42 == ~var3) {
            var4 = var2.readUnsignedByte();
            this.aShortArray471 = new short[var4];
            this.aShortArray470 = new short[var4];

            for (var5 = 0; ~var4 < ~var5; ++var5) {
              this.aShortArray471[var5] = (short) var2.readUnsignedShort();
              this.aShortArray470[var5] = (short) var2.readUnsignedShort();
            }
          } else if (~var3 <= -61 && var3 < 70) {
            this.anIntArray475[-60 + var3] = var2.readUnsignedShort();
          }
        } else {
          var4 = var2.readUnsignedByte();
          this.aShortArray460 = new short[var4];
          this.aShortArray464 = new short[var4];

          for (var5 = 0; var5 < var4; ++var5) {
            this.aShortArray464[var5] = (short) var2.readUnsignedShort();
            this.aShortArray460[var5] = (short) var2.readUnsignedShort();
          }
        }
      }
  }

  public Model method947(byte var1 ) {
    if (this.anIntArray474 == null) {
        return null;
      } else {
        Model[] var2 = new Model[this.anIntArray474.length];

        for (int var3 = 0; ~var3 > ~this.anIntArray474.length; ++var3) {
          var2[var3] =
            Model.getModel(SomethingQuickChatK.aClass153_152, this.anIntArray474[var3], 0);
        }

        int var4 = 27 / ((var1 - 74) / 35);
        Model var7;
        if (var2.length == 1) {
          var7 = var2[0];
        } else {
          var7 = new Model(var2, var2.length);
        }

        int var5;
        if (null != this.aShortArray464) {
          for (var5 = 0; var5 < this.aShortArray464.length; ++var5) {
            assert var7 != null;
            var7.replaceColor(this.aShortArray464[var5], this.aShortArray460[var5]);
          }
        }

        if (this.aShortArray471 != null) {
          for (var5 = 0; ~var5 > ~this.aShortArray471.length; ++var5) {
            assert var7 != null;
            var7.replaceMaterial(this.aShortArray471[var5], this.aShortArray470[var5]);
          }
        }

        return var7;
      }
  }

  public boolean method948(int var1 ) {
    boolean var2 = true;
      if (var1 != 18991) {
        this.aShortArray460 = null;
      }

      for (int var3 = 0; var3 < 5; ++var3) {
        if (-1 != this.anIntArray475[var3] && !SomethingQuickChatK.aClass153_152.method2129(
          (byte) 95, 0, this.anIntArray475[var3])) {
          var2 = false;
        }
      }

      return var2;
  }

  public void method952(int var1, Buffer var2 ) {
    if (var1 == -31957) {
        while (true) {
          int var3 = var2.readUnsignedByte();
          if (0 == var3) {
            return;
          }

          this.method946((byte) -84, var2, var3);
        }
      }
  }

  public static void method943(int var0) {
    IdentityKit.aClass94_468 = null;
      IdentityKit.aClass94_473 = null;
      if (var0 == -9893) {
        IdentityKit.aClass94_477 = null;
        IdentityKit.aClass94_465 = null;
        IdentityKit.aClass94_462 = null;
        IdentityKit.aClass94_463 = null;
        IdentityKit.aClass94_461 = null;
      }
  }

  public static boolean method944(byte var0, int var1, int var2, byte[] var3) {
    int var4 = 106 % ((-11 - var0) / 51);
      boolean var5 = true;
      int var7 = -1;
      Buffer var6 = new Buffer(var3);

      while (true) {
        int var8 = var6.method773((byte) -121);
        if (0 == var8) {
          return var5;
        }

        int var9 = 0;
        var7 += var8;
        boolean var10 = false;

        while (true) {
          int var11;
          if (var10) {
            var11 = var6.readUnsignedShortSmart();
            if (~var11 == -1) {
              break;
            }

            var6.readUnsignedByte();
          } else {
            var11 = var6.readUnsignedShortSmart();
            if (0 == var11) {
              break;
            }

            var9 += var11 + -1;
            int var12 = 63 & var9;
            int var13 = (4088 & var9) >> 6;
            int var16 = var2 + var12;
            int var15 = var1 + var13;
            int var14 = var6.readUnsignedByte() >> 2;
            if (~var15 < -1 && var16 > 0 && 103 > var15 && 103 > var16) {
              GameObjectConfig var17 = DummyClass11.method2207(4, var7);
              if (var14 != 22 || Keyboard.aBoolean1905 || 0 != var17.anInt1529
                  || ~var17.anInt1538 == -2 || var17.aBoolean1483) {
                var10 = true;
                if (!var17.method1694(false)) {
                  var5 = false;
                  ++DummyClass11.anInt2038;
                }
              }
            }
          }
        }
      }
  }

  public static void method945(byte var0) {
    SpotAnimationConfig.gameBuffer.method807((byte) -98);
      int var1 = SpotAnimationConfig.gameBuffer.readBits(8);
      int var2;
      if (~DummyClass6.anInt2046 < ~var1) {
        for (var2 = var1; var2 < DummyClass6.anInt2046; ++var2) {
          VariableUpdate.anIntArray2292[DummyClass17.anInt1829++] = AudioWorker.anIntArray347[var2];
        }
      }

      if (DummyClass6.anInt2046 < var1) {
        throw new RuntimeException("gnpov1");
      } else {
        DummyClass6.anInt2046 = 0;

        for (var2 = 0; ~var2 > ~var1; ++var2) {
          int var3 = AudioWorker.anIntArray347[var2];
          NPC var4 = TextureSampler5.npcs[var3];
          int var5 = SpotAnimationConfig.gameBuffer.readBits(1);
          if (0 == var5) {
            AudioWorker.anIntArray347[DummyClass6.anInt2046++] = var3;
            var4.anInt2838 = AbstractGameWorld.updateCycle;
          } else {
            int var6 = SpotAnimationConfig.gameBuffer.readBits(2);
            if (-1 == ~var6) {
              AudioWorker.anIntArray347[DummyClass6.anInt2046++] = var3;
              var4.anInt2838 = AbstractGameWorld.updateCycle;
              DummyClass60.anIntArray441[OndemandRequester.anInt997++] = var3;
            } else {
              int var7;
              int var8;
              if (1 == var6) {
                AudioWorker.anIntArray347[DummyClass6.anInt2046++] = var3;
                var4.anInt2838 = AbstractGameWorld.updateCycle;
                var7 = SpotAnimationConfig.gameBuffer.readBits(3);
                var4.method1968(1, (byte) 32, var7);
                var8 = SpotAnimationConfig.gameBuffer.readBits(1);
                if (1 == var8) {
                  DummyClass60.anIntArray441[OndemandRequester.anInt997++] = var3;
                }
              } else {
                if (var6 == 2) {
                  AudioWorker.anIntArray347[DummyClass6.anInt2046++] = var3;
                  var4.anInt2838 = AbstractGameWorld.updateCycle;
                  if (-2 == ~SpotAnimationConfig.gameBuffer.readBits(1)) {
                    var7 = SpotAnimationConfig.gameBuffer.readBits(3);
                    var4.method1968(2, (byte) -122, var7);
                    var8 = SpotAnimationConfig.gameBuffer.readBits(3);
                    var4.method1968(2, (byte) 85, var8);
                  } else {
                    var7 = SpotAnimationConfig.gameBuffer.readBits(3);
                    var4.method1968(0, (byte) -80, var7);
                  }

                  var7 = SpotAnimationConfig.gameBuffer.readBits(1);
                  if (var7 == 1) {
                    DummyClass60.anIntArray441[OndemandRequester.anInt997++] = var3;
                  }
                } else if (var6 == 3) {
                  VariableUpdate.anIntArray2292[DummyClass17.anInt1829++] = var3;
                }
              }
            }
          }
        }

      }
  }

  public static void method949(int var0, byte var1, int var2, int var3, int var4) {
    int var5 = -44 / ((24 - var1) / 59);
      int var6 = 0;
      TextureSampler18.method282(DummyClass35.anIntArrayArray663[var4], -var2 + var0, 100,
        var0 - -var2, var3);
      int var8 = -var2;
      int var7 = var2;
      int var9 = -1;

      while (~var6 > ~var7) {
        ++var6;
        var9 += 2;
        var8 += var9;
        if (var8 >= 0) {
          --var7;
          var8 -= var7 << 1;
          int[] var10 = DummyClass35.anIntArrayArray663[var4 - -var7];
          int[] var11 = DummyClass35.anIntArrayArray663[var4 - var7];
          int var12 = var0 - -var6;
          int var13 = -var6 + var0;
          TextureSampler18.method282(var10, var13, 115, var12, var3);
          TextureSampler18.method282(var11, var13, 114, var12, var3);
        }

        int var16 = var7 + var0;
        int var15 = -var7 + var0;
        int[] var17 = DummyClass35.anIntArrayArray663[var4 - -var6];
        int[] var18 = DummyClass35.anIntArrayArray663[-var6 + var4];
        TextureSampler18.method282(var17, var15, -61, var16, var3);
        TextureSampler18.method282(var18, var15, -93, var16, var3);
      }
  }

  public static void method950(Widget var0, int var1, int var2, int var3) {
    if (2 <= TextureSampler25.amountContextActions || ~Something3d.anInt3012 != -1
        || SceneNode.aBoolean1837) {
        if (var1 > -55) {
          IdentityKit.aClass94_473 = null;
        }

        GameString var4 = SomethingQuickChat2.method531((byte) 94);
        if (var0 == null) {
          int var5 =
            FloorOverlay.aClass3_Sub28_Sub17_2096.method683(var4, 4 + var3, var2 - -15, 16777215, 0,
              TextureSampler27.random, DummyClass36.anInt2618);
          AbstractSomethingTexture.method1340(4 + var3,
            FloorOverlay.aClass3_Sub28_Sub17_2096.method682(var4) + var5, (byte) -40, var2, 15);
        } else {
          AbstractFont var7 = var0.method868(TextureSampler0.aClass109Array3270, 0);
          if (null == var7) {
            var7 = FloorOverlay.aClass3_Sub28_Sub17_2096;
          }

          var7.method702(var4, var3, var2, var0.anInt168, var0.anInt193, var0.anInt218,
            var0.anInt287, var0.anInt194, var0.anInt225, TextureSampler27.random,
            DummyClass36.anInt2618, Player.anIntArray3951);
          AbstractSomethingTexture.method1340(Player.anIntArray3951[0], Player.anIntArray3951[2],
            (byte) -40, Player.anIntArray3951[1], Player.anIntArray3951[3]);
        }

      }
  }

  public static void method951(int var0) {
    GlTexture2d.aBoolean3769 = false;
      TextureSampler25.anInt3413 = 0;
      AbstractImageProducer.loginResponse = -3;
      VertexNormal.anInt820 = 0;
      TextureSampler28.loginState = 1;
      SomethingIndex150.anInt2079 = var0;
      MonoChromaticImageBuffer.anInt2561 = -1;
  }

}
