package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlUtils;
import com.jagex.runescape.opengl.MaterialShader5;

public final class ProceduralTexture {

  public static ObjectCache aClass93_1146 = new ObjectCache(64);
  public static int anInt1150 = -1;
  public static GameString SETTINGS_EQ = GameStringStatics.create("settings=");
  public static int anInt1152;
  private int[] anIntArray1144;
  private final AbstractTextureSampler aClass3_Sub13_1145;
  private final AbstractTextureSampler[] aClass3_Sub13Array1147;
  private final AbstractTextureSampler aClass3_Sub13_1148;
  private final int[] anIntArray1149;


  public ProceduralTexture() {
    this.anIntArray1149 = new int[0];
      this.anIntArray1144 = new int[0];
      this.aClass3_Sub13_1145 = new TextureSampler0();
      this.aClass3_Sub13_1145.cacheSize = 1;
      this.aClass3_Sub13_1148 = new TextureSampler0();
      this.aClass3_Sub13Array1147 =
        new AbstractTextureSampler[] {this.aClass3_Sub13_1145,
            this.aClass3_Sub13_1148};
      this.aClass3_Sub13_1148.cacheSize = 1;
  }

  public ProceduralTexture(Buffer var1 ) {
    int var2 = var1.readUnsignedByte();
      this.aClass3_Sub13Array1147 = new AbstractTextureSampler[var2];
      int[][] var5 = new int[var2][];
      int var4 = 0;
      int var3 = 0;

      int var6;
      AbstractTextureSampler var7;
      int var8;
      int var9;
      for (var6 = 0; var2 > var6; ++var6) {
        var7 = GlobalStatics_2.method63((byte) -67, var1);
        if (var7.method159(4) >= 0) {
          ++var3;
        }

        if ((var7.method155((byte) 19) >= 0)) {
          ++var4;
        }

        var8 = var7.samplers.length;
        var5[var6] = new int[var8];

        for (var9 = 0; var8 > var9; ++var9) {
          var5[var6][var9] = var1.readUnsignedByte();
        }

        this.aClass3_Sub13Array1147[var6] = var7;
      }

      this.anIntArray1144 = new int[var3];
      this.anIntArray1149 = new int[var4];
      var3 = 0;
      var4 = 0;

      for (var6 = 0; var6 < var2; ++var6) {
        var7 = this.aClass3_Sub13Array1147[var6];
        var8 = var7.samplers.length;

        for (var9 = 0; (var9 < var8); ++var9) {
          var7.samplers[var9] = this.aClass3_Sub13Array1147[var5[var6][var9]];
        }

        var9 = var7.method159(4);
        int var10 = var7.method155((byte) 19);
        if ((var9 > 0)) {
          this.anIntArray1144[var3++] = var9;
        }

        if ((var10 > 0)) {
          this.anIntArray1149[var4++] = var10;
        }

        var5[var6] = null;
      }

      this.aClass3_Sub13_1145 = this.aClass3_Sub13Array1147[var1.readUnsignedByte()];
      var5 = null;
      this.aClass3_Sub13_1148 = this.aClass3_Sub13Array1147[var1.readUnsignedByte()];
  }

  public int[] method1404(int var1, boolean var2, int var3, double var4,
      int var6,
      FileUnpacker var7,
      ITextureCache var8,
      boolean var9 ) {
    SceneNode.method1859(var4, var6 ^ 359938);
      DummyClass1.anInterface2_408 = var8;
      MaterialShader5.aClass153_2172 = var7;
      TextureSampler33.method180(-1, var1, var3);

      int var11;
      for (var11 = 0; this.aClass3_Sub13Array1147.length > var11; ++var11) {
        this.aClass3_Sub13Array1147[var11].method160(var1, var3, 250);
      }

      if (var6 != 327680) {
        ProceduralTexture.method1405(68, 8, 20, -51, 31, 61, -34);
      }

      int[] var10 = new int[var1 * var3];
      int var12;
      byte var13;
      if (var9) {
        var13 = -1;
        var12 = -1;
        var11 = var3 - 1;
      } else {
        var13 = 1;
        var11 = 0;
        var12 = var3;
      }

      int var14 = 0;

      int var15;
      for (var15 = 0; (var15 < var1); ++var15) {
        if (var2) {
          var14 = var15;
        }

        int[] var17;
        int[] var16;
        int[] var18;
        if (this.aClass3_Sub13_1145.monoChromatic) {
          int[] var19 = this.aClass3_Sub13_1145.method154(var15, (byte) 109);
          var16 = var19;
          var17 = var19;
          var18 = var19;
        } else {
          int[][] var24 = this.aClass3_Sub13_1145.method166(-1, var15);
          var16 = var24[0];
          var18 = var24[2];
          var17 = var24[1];
        }

        for (int var25 = var11; var25 != var12; var25 += var13) {
          int var20 = var16[var25] >> 4;
          if (var20 > 255) {
            var20 = 255;
          }

          if ((var20 < 0)) {
            var20 = 0;
          }

          var20 = GameBuffer.anIntArray3804[var20];
          int var22 = var18[var25] >> 4;
          int var21 = var17[var25] >> 4;
          if (var21 > 255) {
            var21 = 255;
          }

          if (var21 < 0) {
            var21 = 0;
          }

          if ((var22 > 255)) {
            var22 = 255;
          }

          var21 = GameBuffer.anIntArray3804[var21];
          if ((var22 < 0)) {
            var22 = 0;
          }

          var22 = GameBuffer.anIntArray3804[var22];
          var10[var14++] = (var20 << 16) + (var21 << 8) + var22;
          if (var2) {
            var14 += var3 - 1;
          }
        }
      }

      for (var15 = 0; var15 < this.aClass3_Sub13Array1147.length; ++var15) {
        this.aClass3_Sub13Array1147[var15].method161((byte) -45);
      }

      return var10;
  }

  public byte[] method1407(int var1, int var2, boolean var3,
      ITextureCache var4,
      double var5,
      int var7,
      FileUnpacker var8 ) {
    byte[] var9 = new byte[4 * var2 * var1];
      if (var7 == 8839) {
        SceneNode.method1859(var5, 32258);
        MaterialShader5.aClass153_2172 = var8;
        DummyClass1.anInterface2_408 = var4;
        TextureSampler33.method180(-32, var1, var2);

        int var10;
        for (var10 = 0; this.aClass3_Sub13Array1147.length > var10; ++var10) {
          this.aClass3_Sub13Array1147[var10]
              .method160(var1, var2, var7 - 8589);
        }

        var10 = 0;

        int var11;
        for (var11 = 0; var1 > var11; ++var11) {
          if (var3) {
            var10 = var11 << 2;
          }

          int[] var12;
          int[] var13;
          int[] var14;
          int[] var15;
          if (this.aClass3_Sub13_1145.monoChromatic) {
            var15 = this.aClass3_Sub13_1145.method154(var11, (byte) -98);
            var12 = var15;
            var13 = var15;
            var14 = var15;
          } else {
            int[][] var22 = this.aClass3_Sub13_1145.method166(-1, var11);
            var12 = var22[0];
            var13 = var22[1];
            var14 = var22[2];
          }

          if (this.aClass3_Sub13_1148.monoChromatic) {
            var15 = this.aClass3_Sub13_1148.method154(var11, (byte) -103);
          } else {
            var15 = this.aClass3_Sub13_1148.method166(-1, var11)[0];
          }

          for (int var16 = var2 - 1; (var16 >= 0); --var16) {
            int var17 = var12[var16] >> 4;
            if (var17 > 255) {
              var17 = 255;
            }

            if (var17 < 0) {
              var17 = 0;
            }

            int var18 = var13[var16] >> 4;
            if ((var18 > 255)) {
              var18 = 255;
            }

            int var19 = var14[var16] >> 4;
            if (var19 > 255) {
              var19 = 255;
            }

            var17 = GameBuffer.anIntArray3804[var17];
            if ((var19 < 0)) {
              var19 = 0;
            }

            if ((var18 < 0)) {
              var18 = 0;
            }

            var18 = GameBuffer.anIntArray3804[var18];
            var19 = GameBuffer.anIntArray3804[var19];
            int var20;
            if ((var17 == 0) && (var18 == 0) && (var19 == 0)) {
              var20 = 0;
            } else {
              var20 = var15[var16] >> 4;
              if (var20 > 255) {
                var20 = 255;
              }

              if ((var20 < 0)) {
                var20 = 0;
              }
            }

            var9[var10++] = (byte) var17;
            var9[var10++] = (byte) var18;
            var9[var10++] = (byte) var19;
            var9[var10++] = (byte) var20;
            if (var3) {
              var10 += -4 + (var2 << 2);
            }
          }
        }

        for (var11 = 0; (var11 < this.aClass3_Sub13Array1147.length); ++var11) {
          this.aClass3_Sub13Array1147[var11].method161((byte) -45);
        }

        return var9;
      } else {
        return null;
      }
  }

  public boolean method1408(boolean var1, ITextureCache var2,
      FileUnpacker var3 ) {
    int var4;
      if (SomethingTilek.anInt1668 > 0) {
        for (var4 = 0; (var4 < this.anIntArray1144.length); ++var4) {
          if (!var3.method2129((byte) -78, this.anIntArray1144[var4], SomethingTilek.anInt1668)) {
            return false;
          }
        }
      } else {
        for (var4 = 0; (var4 < this.anIntArray1144.length); ++var4) {
          if (!var3.isLoaded(this.anIntArray1144[var4])) {
            return false;
          }
        }
      }

      if (!var1) {
        this.anIntArray1144 = null;
      }

      for (var4 = 0; this.anIntArray1149.length > var4; ++var4) {
        if (!var2.method11(21, this.anIntArray1149[var4])) {
          return false;
        }
      }

      return true;
  }

  public static void method1405(int var0, int var1, int var2, int var3, int var4, int var5,
                               int var6) {
    TextureSampler8.anInt3464 = 0;

      int var7;
      int var15;
      int var19;
      int var21;
      int var22;
      int var29;
      int var32;
      for (var7 = -1; var7 < DummyClass13.anInt2022 + DummyClass6.anInt2046; ++var7) {
        Mobile var8;
        if ((var7 == -1)) {
          var8 = TextureCache.localPlayer;
        } else if (DummyClass13.anInt2022 > var7) {
          var8 = TextureSampler0.players[DummyClass42.anIntArray887[var7]];
        } else {
          var8 = TextureSampler5.npcs[GlobalStatics_2.anIntArray347[-DummyClass13.anInt2022 + var7]];
        }

        if (var8 != null && var8.hasConfiguration((byte) 17)) {
          NpcConfiguration var9;
          if (var8 instanceof NPC) {
            var9 = ((NPC) var8).config;
            if (var9.anIntArray1292 != null) {
              var9 = var9.method1471((byte) -93);
            }

            if (var9 == null) {
              continue;
            }
          }

          int var12;
          if (var7 < DummyClass13.anInt2022) {
            var19 = 30;
            assert var8 instanceof Player;
            Player var10 = (Player) var8;
            if (var10.anInt3972 != -1 || var10.anInt3955 != -1) {
              DummyClass56.method1647((byte) 122, var4 >> 1, var3, var8, var5,
                var8.method1975(var6 ^ -28716) + 15, var1 >> 1);
              if (DummyClass34.anInt590 > -1) {
                if ((var10.anInt3972 != -1)) {
                  TextureSampler2.aClass3_Sub28_Sub16Array3373[var10.anInt3972].method643(
                    -12 + DummyClass34.anInt590 + var2, -var19 + var0 + WidgetAccess.anInt2208);
                  var19 += 25;
                }

                if (var10.anInt3955 != -1) {
                  NPC.aClass3_Sub28_Sub16Array3977[var10.anInt3955].method643(
                    -12 + var2 + DummyClass34.anInt590, var0 - (-WidgetAccess.anInt2208 + var19));
                  var19 += 25;
                }
              }
            }

            if ((var7 >= 0)) {
              HintMarker[] var11 = GameException.aClass96Array2114;

              for (var12 = 0; var11.length > var12; ++var12) {
                HintMarker var13 = var11[var12];
                if (var13 != null && (var13.anInt1360 == 10)
                  && DummyClass42.anIntArray887[var7] == var13.anInt1359) {
                  DummyClass56.method1647((byte) 122, var4 >> 1, var3, var8, var5,
                    var8.method1975(var6 ^ -28716) + 15, var1 >> 1);
                  if (DummyClass34.anInt590 > -1) {
                    SomethingIndex150.aClass3_Sub28_Sub16Array2072[var13.anInt1351].method643(
                      var2 - (-DummyClass34.anInt590 + 12),
                      var0 + (WidgetAccess.anInt2208 - var19));
                  }
                }
              }
            }
          } else {
            assert var8 instanceof NPC;
            var9 = ((NPC) var8).config;
            if (var9.anIntArray1292 != null) {
              var9 = var9.method1471((byte) 102);
            }

            assert var9 != null;
            if ((var9.anInt1269 >= 0) && NPC.aClass3_Sub28_Sub16Array3977.length > var9.anInt1269) {
              if ((var9.anInt1265 == -1)) {
                var22 = 15 + var8.method1975(27855);
              } else {
                var22 = 15 + var9.anInt1265;
              }

              DummyClass56.method1647((byte) 122, var4 >> 1, var3, var8, var5, var22,
                var1 >> 1);
              if ((DummyClass34.anInt590 > 0)) {
                NPC.aClass3_Sub28_Sub16Array3977[var9.anInt1269].method643(
                  var2 + DummyClass34.anInt590 - 12, -30 + var0 + WidgetAccess.anInt2208);
              }
            }

            HintMarker[] var20 = GameException.aClass96Array2114;

            for (var21 = 0; (var21 < var20.length); ++var21) {
              HintMarker var24 = var20[var21];
              if (var24 != null && var24.anInt1360 == 1
                && (var24.anInt1359 == GlobalStatics_2.anIntArray347[-DummyClass13.anInt2022 + var7])
                && ((AbstractGameWorld.updateCycle % 20) < 10)) {
                if (var9.anInt1265 == -1) {
                  var29 = 15 + var8.method1975(var6 + '\u89b4');
                } else {
                  var29 = 15 + var9.anInt1265;
                }

                DummyClass56.method1647((byte) 122, var4 >> 1, var3, var8, var5, var29,
                  var1 >> 1);
                if ((DummyClass34.anInt590 > 0)) {
                  SomethingIndex150.aClass3_Sub28_Sub16Array2072[var24.anInt1351].method643(
                    -12 + var2 + DummyClass34.anInt590, -28 + WidgetAccess.anInt2208 + var0);
                }
              }
            }
          }

          assert var8 instanceof Player;
          if (var8.aClass94_2825 != null && (var7 >= DummyClass13.anInt2022
            || (TextureSampler9.anInt3101 == 0) || TextureSampler9.anInt3101
              == 3
            || TextureSampler9.anInt3101 == 1 && ScriptState.method1176(((Player) var8).name,
            (byte) -82))) {
            DummyClass56.method1647((byte) 122, var4 >> 1, var3, var8, var5,
              var8.method1975(27855), var1 >> 1);
            if (DummyClass34.anInt590 > -1
              && TextureSampler8.anInt3464 < TextureSampler35.anInt3332) {
              TextureSampler35.anIntArray3329[TextureSampler8.anInt3464] =
                FloorOverlay.aClass3_Sub28_Sub17_2096.method682(var8.aClass94_2825) / 2;
              TextureSampler35.anIntArray3327[TextureSampler8.anInt3464] =
                FloorOverlay.aClass3_Sub28_Sub17_2096.anInt3727;
              TextureSampler35.anIntArray3319[TextureSampler8.anInt3464] = DummyClass34.anInt590;
              TextureSampler35.anIntArray3337[TextureSampler8.anInt3464] = WidgetAccess.anInt2208;
              TextureSampler35.anIntArray3331[TextureSampler8.anInt3464] =
                var8.anInt2837;
              TextureSampler35.anIntArray3336[TextureSampler8.anInt3464] =
                var8.anInt2753;
              TextureSampler35.anIntArray3318[TextureSampler8.anInt3464] =
                var8.anInt2814;
              TextureSampler35.aClass94Array3317[TextureSampler8.anInt3464] =
                var8.aClass94_2825;
              ++TextureSampler8.anInt3464;
            }
          }

          if (var8.anInt2781 > AbstractGameWorld.updateCycle) {
            AbstractDirectColorSprite var23 = OndemandRequester.aClass3_Sub28_Sub16Array996[0];
            AbstractDirectColorSprite var25 = OndemandRequester.aClass3_Sub28_Sub16Array996[1];
            if (var8 instanceof NPC) {
              NPC var28 = (NPC) var8;
              AbstractDirectColorSprite[] var31 =
                (AbstractDirectColorSprite[]) TextureSampler1.aClass93_3130.get(
                    var28.config.anInt1279);
              if (var31 == null) {
                var31 =
                  Projectile.method2027(0, (byte) 11, var28.config.anInt1279, Projectile.sprites);
                if (var31 != null) {
                  TextureSampler1.aClass93_3130.get((byte) -98, var31,
                      var28.config.anInt1279);
                }
              }

              if (var31 != null && (var31.length == 2)) {
                var25 = var31[1];
                var23 = var31[0];
              }

              NpcConfiguration var14 = var28.config;
              if (var14.anInt1265 == -1) {
                var21 = var8.method1975(27855);
              } else {
                var21 = var14.anInt1265;
              }
            } else {
              var21 = var8.method1975(27855);
            }

            DummyClass56.method1647((byte) 122, var4 >> 1, var3, var8, var5,
              var23.anInt3696 + 10 + var21, var1 >> 1);
            if (DummyClass34.anInt590 > -1) {
              var12 = -(var23.anInt3707 >> 1) + DummyClass34.anInt590 + var2;
              var29 = WidgetAccess.anInt2208 + var0 - 3;
              var23.method643(var12, var29);
              var32 = var23.anInt3707 * var8.anInt2775 / 255;
              var15 = var23.anInt3696;
              if (GlRenderer.useOpenGlRenderer) {
                GlUtils.method931(var12, var29, var12 + var32, var29 + var15);
              } else {
                DummyClass47
                    .method1326(var12, var29, var12 + var32, var15 + var29);
              }

              var25.method643(var12, var29);
              if (GlRenderer.useOpenGlRenderer) {
                GlUtils.clip(var2, var0, var1 + var2, var0 + var4);
              } else {
                DummyClass47.method1324(var2, var0, var1 + var2, var4 + var0);
              }
            }
          }

          for (var19 = 0; (var19 < 4); ++var19) {
            if (var8.anIntArray2768[var19] > AbstractGameWorld.updateCycle) {
              if (var8 instanceof NPC) {
                NPC var30 = (NPC) var8;
                NpcConfiguration var26 = var30.config;
                if ((var26.anInt1265 == -1)) {
                  var22 = var8.method1975(27855) / 2;
                } else {
                  var22 = var26.anInt1265 / 2;
                }
              } else {
                var22 = var8.method1975(var6 ^ -28716) / 2;
              }

              DummyClass56.method1647((byte) 122, var4 >> 1, var3, var8, var5, var22,
                var1 >> 1);
              if (DummyClass34.anInt590 > -1) {
                if (var19 == 1) {
                  WidgetAccess.anInt2208 -= 20;
                }

                if ((var19 == 2)) {
                  WidgetAccess.anInt2208 -= 10;
                  DummyClass34.anInt590 -= 15;
                }

                if (var19 == 3) {
                  WidgetAccess.anInt2208 -= 10;
                  DummyClass34.anInt590 += 15;
                }

                SomethingTexture3.aClass3_Sub28_Sub16Array2656[var8.anIntArray2815[var19]]
                  .method643(-12 + var2 + DummyClass34.anInt590,
                    var0 + WidgetAccess.anInt2208 - 12);
                AbstractTextureSampler.aClass3_Sub28_Sub17_2379.draw(
                  SomethingScene.toString(var8.anIntArray2836[var19]),
                  -1 + DummyClass34.anInt590 + var2, 3 + WidgetAccess.anInt2208 + var0, 16777215,
                  0);
              }
            }
          }
        }
      }

      var7 = 0;
      if (var6 != -7397) {
        ProceduralTexture.method1409(true);
      }

      for (; TextureSampler8.anInt3464 > var7; ++var7) {
        var19 = TextureSampler35.anIntArray3337[var7];
        int var18 = TextureSampler35.anIntArray3319[var7];
        var21 = TextureSampler35.anIntArray3327[var7];
        var22 = TextureSampler35.anIntArray3329[var7];
        boolean var27 = true;

        while (var27) {
          var27 = false;

          for (var29 = 0; var7 > var29; ++var29) {
            if (TextureSampler35.anIntArray3337[var29] - TextureSampler35.anIntArray3327[var29]
              < 2 + var19 && -var21 + var19 < TextureSampler35.anIntArray3337[var29] + 2
              && -var22 + var18
              < TextureSampler35.anIntArray3319[var29] + TextureSampler35.anIntArray3329[var29]
              && TextureSampler35.anIntArray3319[var29] - TextureSampler35.anIntArray3329[var29]
              < var22 + var18 &&
              -TextureSampler35.anIntArray3327[var29] + TextureSampler35.anIntArray3337[var29]
                < var19) {
              var19 =
                TextureSampler35.anIntArray3337[var29] - TextureSampler35.anIntArray3327[var29];
              var27 = true;
            }
          }
        }

        DummyClass34.anInt590 = TextureSampler35.anIntArray3319[var7];
        WidgetAccess.anInt2208 = TextureSampler35.anIntArray3337[var7] = var19;
        GameString var33 = TextureSampler35.aClass94Array3317[var7];
        if ((FileCache.anInt688 == 0)) {
          var32 = 16776960;
          if ((TextureSampler35.anIntArray3331[var7] < 6)) {
            var32 = WidgetAccess.anIntArray2213[TextureSampler35.anIntArray3331[var7]];
          }

          if (TextureSampler35.anIntArray3331[var7] == 6) {
            var32 = BitVariable.anInt1127 % 20 >= 10 ? 16776960 : 16711680;
          }

          if ((TextureSampler35.anIntArray3331[var7] == 7)) {
            var32 = ((BitVariable.anInt1127 % 20) < 10) ? 255 : '\uffff';
          }

          if (TextureSampler35.anIntArray3331[var7] == 8) {
            var32 = ((BitVariable.anInt1127 % 20) >= 10) ? 8454016 : '\ub000';
          }

          if (TextureSampler35.anIntArray3331[var7] == 9) {
            var15 = -TextureSampler35.anIntArray3318[var7] + 150;
            if (var15 >= 50) {
              if (var15 >= 100) {
                if (var15 < 150) {
                  var32 = -500 - (-(5 * var15) - '\uff00');
                }
              } else {
                var32 = 16776960 + 16384000 - (327680 * var15);
              }
            } else {
              var32 = var15 * 1280 + 16711680;
            }
          }

          if (TextureSampler35.anIntArray3331[var7] == 10) {
            var15 = -TextureSampler35.anIntArray3318[var7] + 150;
            if (var15 >= 50) {
              if ((var15 < 100)) {
                var32 = -(327680 * (-50 + var15)) + 16711935;
              } else if (var15 < 150) {
                var32 = 327680 * var15 - (32768000 - (255 - (5 * var15) + 500));
              }
            } else {
              var32 = 16711680 + var15 * 5;
            }
          }

          if (TextureSampler35.anIntArray3331[var7] == 11) {
            var15 = 150 - TextureSampler35.anIntArray3318[var7];
            if (var15 >= 50) {
              if ((var15 >= 100)) {
                if (var15 < 150) {
                  var32 = 16777215 - var15 * 327680 + 32768000;
                }
              } else {
                var32 = '\uff00' - (-(327685 * var15) + 16384250);
              }
            } else {
              var32 = 16777215 - 327685 * var15;
            }
          }

          if (TextureSampler35.anIntArray3336[var7] == 0) {
            FloorOverlay.aClass3_Sub28_Sub17_2096.draw(var33, DummyClass34.anInt590 + var2,
              var0 + WidgetAccess.anInt2208, var32, 0);
          }

          if (TextureSampler35.anIntArray3336[var7] == 1) {
            FloorOverlay.aClass3_Sub28_Sub17_2096.method696(var33, var2 + DummyClass34.anInt590,
              WidgetAccess.anInt2208 + var0, var32, 0, BitVariable.anInt1127);
          }

          if (TextureSampler35.anIntArray3336[var7] == 2) {
            FloorOverlay.aClass3_Sub28_Sub17_2096.method695(var33, var2 + DummyClass34.anInt590,
              var0 + WidgetAccess.anInt2208, var32, 0, BitVariable.anInt1127);
          }

          if ((TextureSampler35.anIntArray3336[var7] == 3)) {
            FloorOverlay.aClass3_Sub28_Sub17_2096.method692(var33, var2 + DummyClass34.anInt590,
              WidgetAccess.anInt2208 + var0, var32, 0, BitVariable.anInt1127,
              150 - TextureSampler35.anIntArray3318[var7]);
          }

          if (TextureSampler35.anIntArray3336[var7] == 4) {
            var15 = (-TextureSampler35.anIntArray3318[var7] + 150) * (
              FloorOverlay.aClass3_Sub28_Sub17_2096.method682(var33) + 100) / 150;
            if (GlRenderer.useOpenGlRenderer) {
              GlUtils.method931(DummyClass34.anInt590 + var2 - 50, var0,
                  DummyClass34.anInt590 + var2 + 50, var4 + var0);
            } else {
              DummyClass47
                  .method1326(-50 + (var2 + DummyClass34.anInt590), var0,
                      50 + DummyClass34.anInt590 + var2, var4 + var0);
            }

            FloorOverlay.aClass3_Sub28_Sub17_2096.method681(var33,
              var2 - (-DummyClass34.anInt590 - 50) - var15, var0 + WidgetAccess.anInt2208, var32,
              0);
            if (GlRenderer.useOpenGlRenderer) {
              GlUtils.clip(var2, var0, var1 + var2, var4 + var0);
            } else {
              DummyClass47.method1324(var2, var0, var2 + var1, var0 + var4);
            }
          }

          if (TextureSampler35.anIntArray3336[var7] == 5) {
            int var16 = 0;
            var15 = -TextureSampler35.anIntArray3318[var7] + 150;
            if (GlRenderer.useOpenGlRenderer) {
              GlUtils.method931(var2,
                -1 - FloorOverlay.aClass3_Sub28_Sub17_2096.anInt3727 + WidgetAccess.anInt2208
                  + var0, var1 + var2, 5 + var0 + WidgetAccess.anInt2208);
            } else {
              DummyClass47.method1326(var2,
                -1 - FloorOverlay.aClass3_Sub28_Sub17_2096.anInt3727 + WidgetAccess.anInt2208
                  + var0, var2 + var1, 5 + WidgetAccess.anInt2208 + var0);
            }

            if (var15 < 25) {
              var16 = var15 - 25;
            } else if (var15 > 125) {
              var16 = var15 - 125;
            }

            FloorOverlay.aClass3_Sub28_Sub17_2096.draw(var33, DummyClass34.anInt590 + var2,
              var16 + var0 + WidgetAccess.anInt2208, var32, 0);
            if (GlRenderer.useOpenGlRenderer) {
              GlUtils.clip(var2, var0, var2 + var1, var0 + var4);
            } else {
              DummyClass47.method1324(var2, var0, var2 + var1, var0 + var4);
            }
          }
        } else {
          FloorOverlay.aClass3_Sub28_Sub17_2096.draw(var33, var2 + DummyClass34.anInt590,
            var0 + WidgetAccess.anInt2208, 16776960, 0);
        }
      }
  }

  public static int method1406(byte var0) {
    int var1 = -21 % ((63 - var0) / 49);
      return ObjectNode.anInt4045;
  }

  public static void method1409(boolean var0) {
    ProceduralTexture.aClass93_1146 = null;
      if (var0) {
        ProceduralTexture.SETTINGS_EQ = null;
      }

      ProceduralTexture.SETTINGS_EQ = null;
  }

}
