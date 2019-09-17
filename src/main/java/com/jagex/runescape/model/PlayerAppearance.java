package com.jagex.runescape.model;

import com.jagex.runescape.huffman.HuffmanEncoderStatics;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlModel;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.statics.DummyClass14;
import com.jagex.runescape.statics.DummyClass2;
import com.jagex.runescape.statics.DummyClass24;
import com.jagex.runescape.statics.DummyClass35;
import com.jagex.runescape.statics.DummyClass40;
import com.jagex.runescape.statics.DummyClass55;
import com.jagex.runescape.statics.DummyClass6;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_2;
import com.jagex.runescape.statics.GlobalStatics_3;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jagex.runescape.statics.GlobalStatics_7;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class PlayerAppearance {

  public int npcId;
  public boolean aBoolean864;
  private long aLong855;
  private int[] anIntArray857;
  private int anInt858;
  private long aLong860;
  private int[] anIntArray862;
  private int[][] anIntArrayArray863;

  public AbstractModel method1157(int var1, int var2, int var3, int var4,
                                  AnimationSequence var5,
                                  int var6,
                                  int var7,
                                  int var8 ) {
    if (var8 != -2012759707) {
        this.npcId = -32;
      }

      long var9 = (long) var3 | var7 << 16 | (long) var2 << 32;
      AbstractModel var11 = (AbstractModel) GlobalStatics_9.aClass93_1131.get(var9);
      if (var11 == null) {
        Model[] var12 = new Model[3];
        int var13 = 0;
        if (!GlobalStatics_10.getIdentityKit(var3, 0).method948(var8 ^ -2012744886)
          || !GlobalStatics_10.getIdentityKit(var7, 0).method948(18991)
          || !GlobalStatics_10.getIdentityKit(var2, 0).method948(18991)) {
          return null;
        }

        Model var14 = GlobalStatics_10.getIdentityKit(var3, 0).method941(true);
        if (var14 != null) {
          var12[var13++] = var14;
        }

        var14 = GlobalStatics_10.getIdentityKit(var7, 0).method941(true);
        if (var14 != null) {
          var12[var13++] = var14;
        }

        var14 = GlobalStatics_10.getIdentityKit(var2, 0).method941(true);
        if (var14 != null) {
          var12[var13++] = var14;
        }

        var14 = new Model(var12, var13);

        for (int var15 = 0; var15 < 5; ++var15) {
          if (this.anIntArray862[var15] < GlobalStatics_2.aShortArrayArray344[var15].length) {
            var14.replaceColor(GlobalStatics_9.aShortArray2548[var15],
              GlobalStatics_2.aShortArrayArray344[var15][this.anIntArray862[var15]]);
          }

          if (DummyClass55.aShortArrayArray1429[var15].length > this.anIntArray862[var15]) {
            var14.replaceColor(GlobalStatics_7.aShortArray1311[var15],
              DummyClass55.aShortArrayArray1429[var15][this.anIntArray862[var15]]);
          }
        }

        var11 = var14.method2008(64, 768, -50, -10, -50);
        GlobalStatics_9.aClass93_1131.get((byte) -111, var11, var9);
      }

      if (var5 != null) {
        var11 = var5.method2055(var11, (byte) -86, var1, var4, var6);
      }

      return var11;
  }

  private void method1158(int var1) {
    long var2 = this.aLong860;
      this.aLong860 = -1L;
      long[] var4 = GlobalStatics_7.aLongArray1631;
      this.aLong860 =
        var4[(int) (255L & (this.anInt858 >> 8 ^ this.aLong860))] ^
            this.aLong860 >>> 8;
      this.aLong860 =
        var4[(int) (255L & (this.aLong860
            ^ this.anInt858))] ^ this.aLong860
            >>> 8;

      int var5;
      for (var5 = 0; var5 < 12; ++var5) {
        this.aLong860 = this.aLong860 >>> 8 ^ var4[(int) (
          (this.aLong860 ^ this.anIntArray857[var5] >> 24) & 255L)];
        this.aLong860 =
            this.aLong860 >>> 8 ^ var4[(int) (255L & (this.aLong860 ^ this.anIntArray857[var5]
        >> 16))];
        this.aLong860 =
          var4[(int) (255L & (this.anIntArray857[var5] >> 8 ^ this.aLong860))]
            ^ this.aLong860 >>> 8;
        this.aLong860 =
            this.aLong860 >>> 8 ^ var4[(int) ((this.aLong860
                ^ this.anIntArray857[var5])
            & 255L)];
      }

      if (var1 != 459557008) {
        this.anIntArray862 = null;
      }

      for (var5 = 0; var5 < 5; ++var5) {
        assert this.anIntArray862 != null;
        this.aLong860 = var4[(int) ((this.anIntArray862[var5] ^ this.aLong860) & 255L)]
          ^ this.aLong860 >>> 8;
      }

      this.aLong860 = var4[(int) (((this.aBoolean864
          ? 1 : 0) ^ this.aLong860) & 255L)]
        ^ this.aLong860 >>> 8;
      if (var2 != 0L && this.aLong860 != var2) {
        GlobalStatics_9.aClass93_1911.method1518(var2, (byte) -124);
      }
  }

  public void method1159(boolean var1, boolean var2 ) {
    if (!var2) {
        GlobalStatics_9.anIntArray859 = null;
      }

      this.aBoolean864 = var1;
      this.method1158(459557008);
  }

  public void update(int[] var1, int var2, boolean var3, int var4,int[] var5,
      int var6 ) {
    if (var6 != this.anInt858) {
        this.anInt858 = var6;
        this.anIntArrayArray863 = null;
      }

      if (var5 == null) {
        var5 = new int[12];

        for (int var7 = 0; var7 < 8; ++var7) {
          for (int var8 = 0; GlobalStatics_9.anInt497 > var8; ++var8) {
            IdentityKit var9 = GlobalStatics_10.getIdentityKit(var8, 0);
            if (!var9.aBoolean476 && var9.anInt466 == (!var3 ?
                GlobalStatics_9.anIntArray2559[var7] :
                GlobalStatics_9.anIntArray3228[var7])) {
              var5[DummyClass6.anIntArray2043[var7]] =
                HuffmanEncoderStatics.method308(Integer.MIN_VALUE, var8);
              break;
            }
          }
        }
      }

      this.npcId = var2;
      this.aBoolean864 = var3;
      if (var4 == 0) {
        this.anIntArray862 = var1;
        this.anIntArray857 = var5;
        this.method1158(459557008);
      }
  }

  public void method1162(int var1, boolean var2, int var3 ) {
    this.anIntArray862[var1] = var3;
      this.method1158(459557008);
      if (var2) {
        this.method1159(false, false);
      }
  }

  public int method1163(int var1 ) {
    if (var1 != -24861) {
        GlobalStatics_9.anIntArray859 = null;
      }

      return this.npcId != -1 ?
        305419896 + GlobalStatics_2.getNpcConfiguration(this.npcId).anInt1284 :
        (this.anIntArray857[8] << 10) + (this.anIntArray862[0] << 25) + (
            this.anIntArray862[4]
                << 20) - (-(this.anIntArray857[0] << 15) - ((this.anIntArray857[11] << 5)
          + this.anIntArray857[1]));
  }

  public void method1164(int var1, int var2, int var3 ) {
    int var4 = DummyClass6.anIntArray2043[var1];
      if (this.anIntArray857[var4] != 0) {
        GlobalStatics_10.getIdentityKit(var2, var3);
        this.anIntArray857[var4] = HuffmanEncoderStatics.method308(var2, Integer.MIN_VALUE);
        this.method1158(459557008);
      }
  }

  public AbstractModel method1165(Unsure[] var1, int var2,
      AnimationSequence var3,
      AnimationSequence var4,
      int var5,
      int var6,
      int var7,
      int var8,
      boolean var9,
      int var10,
      int var11 ) {
    int var12 = 102 % ((var7 + 39) / 61);
      if (this.npcId == -1) {
        int[] var15 = this.anIntArray857;
        long var13 = this.aLong860;
        if (var4 != null && (var4.anInt1854 >= 0 || var4.anInt1849 >= 0)) {
          var15 = new int[12];

          for (int var16 = 0; var16 < 12; ++var16) {
            var15[var16] = this.anIntArray857[var16];
          }

          if (var4.anInt1854 >= 0) {
            if (var4.anInt1854 == 65535) {
              var13 ^= -4294967296L;
              var15[5] = 0;
            } else {
              var15[5] = HuffmanEncoderStatics.method308(1073741824, var4.anInt1854);
              var13 ^= (long) var15[5] << 32;
            }
          }

          if (var4.anInt1849 >= 0) {
            if (var4.anInt1849 == 65535) {
              var15[3] = 0;
              var13 ^= 4294967295L;
            } else {
              var15[3] = HuffmanEncoderStatics.method308(1073741824, var4.anInt1849);
              var13 ^= var15[3];
            }
          }
        }

        AbstractModel var37 = (AbstractModel) GlobalStatics_9.aClass93_1911.get(var13);
        boolean var17;
        int var23;
        int var22;
        int var25;
        int var24;
        int var26;
        int var29;
        int var28;
        int var34;
        int var32;
        int var33;
        int var45;
        if (var37 == null) {
          var17 = false;

          int var19;
          for (int var18 = 0; var18 < 12; ++var18) {
            var19 = var15[var18];
            if ((var19 & 1073741824) != 0) {
              if (!DummyClass35.getItemConfig(1073741823 & var19, (byte) 92)
                  .method1108((byte) 95, this.aBoolean864)) {
                var17 = true;
              }
            } else if ((var19 & Integer.MIN_VALUE) != 0 && !GlobalStatics_10
                .getIdentityKit(
                    1073741823 & var19, 0).method942(101)) {
              var17 = true;
            }
          }

          if (var17) {
            if (this.aLong855 != -1L) {
              var37 = (AbstractModel) GlobalStatics_9.aClass93_1911.get(this.aLong855);
            }

            if (var37 == null) {
              return null;
            }
          }

          if (var37 == null) {
            Model[] var39 = new Model[12];

            int var20;
            for (var19 = 0; var19 < 12; ++var19) {
              var20 = var15[var19];
              Model var21;
              if ((var20 & 1073741824) == 0) {
                if ((Integer.MIN_VALUE & var20) != 0) {
                  var21 =
                      GlobalStatics_10.getIdentityKit(var20 & 1073741823, 0)
                          .method947((byte) -26);
                  if (var21 != null) {
                    var39[var19] = var21;
                  }
                }
              } else {
                var21 = DummyClass35
                    .getItemConfig(var20 & 1073741823, (byte) 115)
                    .method1117(this.aBoolean864, 80);
                if (var21 != null) {
                  var39[var19] = var21;
                }
              }
            }

            RenderAnimation var40 = null;
            if (this.anInt858 != -1) {
              var40 = GlobalStatics_9.getRenderAnimation(false, this.anInt858);
            }

            if (var40 != null && var40.anIntArrayArray359 != null) {
              for (var20 = 0; var20 < var40.anIntArrayArray359.length;
                  ++var20) {
                if (var40.anIntArrayArray359[var20] != null
                    && var39[var20] != null) {
                  var45 = var40.anIntArrayArray359[var20][0];
                  var22 = var40.anIntArrayArray359[var20][1];
                  var23 = var40.anIntArrayArray359[var20][2];
                  var25 = var40.anIntArrayArray359[var20][4];
                  var24 = var40.anIntArrayArray359[var20][3];
                  var26 = var40.anIntArrayArray359[var20][5];
                  if (this.anIntArrayArray863 == null) {
                    this.anIntArrayArray863 = new int[var40.anIntArrayArray359.length][];
                  }

                  if (this.anIntArrayArray863[var20] == null) {
                    int[] var27 = this.anIntArrayArray863[var20] = new int[15];
                    if (var24 == 0 && var25 == 0 && var26 == 0) {
                      var27[12] = -var45;
                      var27[13] = -var22;
                      var27[0] = var27[4] = var27[8] = 0x8000;
                      var27[14] = -var23;
                    } else {
                      var28 = DummyClass40.COSINE_TABLE[var24] >> 1;
                      var29 = GLStatics.SINE_TABLE[var24] >> 1;
                      int var30 = DummyClass40.COSINE_TABLE[var25] >> 1;
                      int var31 = GLStatics.SINE_TABLE[var25] >> 1;
                      var32 = DummyClass40.COSINE_TABLE[var26] >> 1;
                      var33 = GLStatics.SINE_TABLE[var26] >> 1;
                      var27[4] = var28 * var32 + 16384 >> 15;
                      var27[5] = -var29;
                      var27[3] = 16384 + var33 * var28 >> 15;
                      var27[2] = 16384 + var28 * var31 >> 15;
                      var27[8] = var30 * var28 + 16384 >> 15;
                      int var35 = 16384 + var33 * var29 >> 15;
                      var27[0] = var31 * var35 + var32 * var30 + 16384 >> 15;
                      var27[14] =
                          16384 + var27[8] * -var23 - var22 * var27[5]
                              + var27[2] * -var45 >> 15;
                      var27[6] =
                          var30 * var35 + var32 * -var31 + 16384 >> 15;
                      var34 = 16384 + var32 * var29 >> 15;
                      var27[7] = 16384 - var33 * -var31 + var34 * var30 >> 15;
                      var27[1] =
                          var31 * var34 + var30 * -var33 + 16384 >> 15;
                      var27[12] =
                          -var22 * var27[3] + var27[0] * -var45
                              - var23 * var27[6] + 16384 >> 15;
                      var27[13] =
                          16384 - var22 * var27[4] + var27[1] * -var45
                              - var23 * var27[7] >> 15;
                    }

                    var27[9] = var45;
                    var27[11] = var23;
                    var27[10] = var22;
                  }

                  if (var24 != 0 || var25 != 0 || var26 != 0) {
                    var39[var20].rotate(var24, var25, var26);
                  }

                  if (var45 != 0 || var22 != 0 || var23 != 0) {
                    var39[var20].translate(var45, var22, var23);
                  }
                }
              }
            }

            Model var43 = new Model(var39, var39.length);

            for (var45 = 0; var45 < 5; ++var45) {
              if (GlobalStatics_2.aShortArrayArray344[var45].length
                  > this.anIntArray862[var45]) {
                var43.replaceColor(GlobalStatics_9.aShortArray2548[var45],
                    GlobalStatics_2.aShortArrayArray344[var45][this.anIntArray862[var45]]);
              }

              if (DummyClass55.aShortArrayArray1429[var45].length
                  > this.anIntArray862[var45]) {
                var43.replaceColor(GlobalStatics_7.aShortArray1311[var45],
                    DummyClass55.aShortArrayArray1429[var45][this.anIntArray862[var45]]);
              }
            }

            var37 = var43.method2008(64, 850, -30, -50, -30);
            if (GlRenderer.useOpenGlRenderer) {
              ((GlModel) var37)
                  .method1920(false, false, true, true, false, false, true);
            }

            if (var9) {
              GlobalStatics_9.aClass93_1911.get((byte) -115, var37, var13);
              this.aLong855 = var13;
            }
          }
        }

        var17 = false;
        boolean var38 = false;
        var45 = var1 != null ? var1.length : 0;
        boolean var42 = false;
        boolean var44 = false;

        int var47;
        for (var22 = 0; var45 > var22; ++var22) {
          if (var1[var22] != null) {
            AnimationSequence var41 = GlobalStatics_8
                .method45(var1[var22].anInt1890, (byte) -20);
            if (var41.anIntArray1851 != null) {
              var17 = true;
              DummyClass24.aClass142Array1654[var22] = var41;
              var24 = var1[var22].anInt1893;
              var25 = var1[var22].anInt1891;
              var26 = var41.anIntArray1851[var24];
              GlobalStatics_9.aClass3_Sub28_Sub5Array2070[var22] =
                  GlobalStatics_6.method133(var26 >>> 16, 0);
              var26 &= '\uffff';
              GlobalStatics_9.anIntArray1833[var22] = var26;
              if (GlobalStatics_9.aClass3_Sub28_Sub5Array2070[var22]
                  != null) {
                var42 |=
                    GlobalStatics_9.aClass3_Sub28_Sub5Array2070[var22]
                        .method561(var26, (byte) 119);
                var38 |=
                    GlobalStatics_9.aClass3_Sub28_Sub5Array2070[var22]
                        .method559(1317095745, var26);
                var44 |= var41.aBoolean1848;
              }

              if ((var41.tween || GlobalStatics_9.tweening)
                  && var25 != -1
                  && var25 < var41.anIntArray1851.length) {
                DummyClass14.anIntArray1960[var22] = var41.anIntArray1869[var24];
                GlobalStatics_9.anIntArray3139[var22] = var1[var22].anInt1897;
                var47 = var41.anIntArray1851[var25];
                GlobalStatics_3.aClass3_Sub28_Sub5Array1103[var22] =
                    GlobalStatics_6.method133(var47 >>> 16, 0);
                var47 &= '\uffff';
                DummyClass2.anIntArray1679[var22] = var47;
                if (GlobalStatics_3.aClass3_Sub28_Sub5Array1103[var22]
                    != null) {
                  var42 |=
                      GlobalStatics_3.aClass3_Sub28_Sub5Array1103[var22]
                          .method561(var47,
                              (byte) 117);
                  var38 |= GlobalStatics_3.aClass3_Sub28_Sub5Array1103[var22]
                      .method559(
                          1317095745, var47);
                }
              } else {
                DummyClass14.anIntArray1960[var22] = 0;
                GlobalStatics_9.anIntArray3139[var22] = 0;
                GlobalStatics_3.aClass3_Sub28_Sub5Array1103[var22] = null;
                DummyClass2.anIntArray1679[var22] = -1;
              }
            }
          }
        }

        if (!var17 && var4 == null && var3 == null) {
          return var37;
        } else {
          var22 = -1;
          var23 = -1;
          var24 = 0;
          AnimationSomething var48 = null;
          AnimationSomething var46 = null;
          if (var4 != null) {
            var22 = var4.anIntArray1851[var10];
            var47 = var22 >>> 16;
            var46 = GlobalStatics_6.method133(var47, 0);
            var22 &= '\uffff';
            if (var46 != null) {
              var42 |= var46.method561(var22, (byte) 124);
              var38 |= var46.method559(1317095745, var22);
              var44 |= var4.aBoolean1848;
            }

            if ((var4.tween || GlobalStatics_9.tweening) && var2 != -1
                && var4.anIntArray1851.length > var2) {
              var23 = var4.anIntArray1851[var2];
              var28 = var23 >>> 16;
              var23 &= '\uffff';
              var24 = var4.anIntArray1869[var10];
              if (var47 == var28) {
                var48 = var46;
              } else {
                var48 = GlobalStatics_6.method133(var23 >>> 16, 0);
              }

              if (var48 != null) {
                var42 |= var48.method561(var23, (byte) 122);
                var38 |= var48.method559(1317095745, var23);
              }
            }
          }

          var47 = -1;
          var28 = -1;
          AnimationSomething var49 = null;
          AnimationSomething var50 = null;
          var29 = 0;
          if (var3 != null) {
            var47 = var3.anIntArray1851[var11];
            var32 = var47 >>> 16;
            var47 &= '\uffff';
            var49 = GlobalStatics_6.method133(var32, 0);
            if (var49 != null) {
              var42 |= var49.method561(var47, (byte) 123);
              var38 |= var49.method559(1317095745, var47);
              var44 |= var3.aBoolean1848;
            }

            if ((var3.tween || GlobalStatics_9.tweening) && var6 != -1
                && var3.anIntArray1851.length > var6) {
              var29 = var3.anIntArray1869[var11];
              var28 = var3.anIntArray1851[var6];
              var33 = var28 >>> 16;
              var28 &= '\uffff';
              if (var32 == var33) {
                var50 = var49;
              } else {
                var50 = GlobalStatics_6.method133(var28 >>> 16, 0);
              }

              if (var50 != null) {
                var42 |= var50.method561(var28, (byte) 122);
                var38 |= var50.method559(1317095745, var28);
              }
            }
          }

          AbstractModel var51 = var37.method1894(!var38, !var42, !var44);
          var33 = 0;

          for (var34 = 1; var33 < var45; var34 <<= 1) {
            if (GlobalStatics_9.aClass3_Sub28_Sub5Array2070[var33] != null) {
              var51.method1887(
                  GlobalStatics_9.aClass3_Sub28_Sub5Array2070[var33],
                  GlobalStatics_9.anIntArray1833[var33],
                  GlobalStatics_3.aClass3_Sub28_Sub5Array1103[var33],
                  DummyClass2.anIntArray1679[var33],
                  GlobalStatics_9.anIntArray3139[var33] - 1,
                  DummyClass14.anIntArray1960[var33], var34,
                  DummyClass24.aClass142Array1654[var33].aBoolean1848,
                  this.anIntArrayArray863[var33]);
            }

            ++var33;
          }

          if (var46 != null && var49 != null) {
            var51.method1892(var46, var22, var48, var23, var8 - 1, var24, var49,
                var47, var50,
                var28, var5 - 1, var29, var4.aBooleanArray1855,
                var4.aBoolean1848 | var3.aBoolean1848);
          } else if (var46 == null) {
            if (var49 != null) {
              var51.method1880(var49, var47, var50, var28, var5 - 1, var29,
                  var3.aBoolean1848);
            }
          } else {
            var51.method1880(var46, var22, var48, var23, var8 - 1, var24,
                var4.aBoolean1848);
          }

          for (var33 = 0; var33 < var45; ++var33) {
            GlobalStatics_9.aClass3_Sub28_Sub5Array2070[var33] = null;
            GlobalStatics_3.aClass3_Sub28_Sub5Array1103[var33] = null;
            DummyClass24.aClass142Array1654[var33] = null;
          }

          return var51;
        }
      } else {
        return GlobalStatics_2.getNpcConfiguration(this.npcId)
            .method1476(var1, var6, (byte) -128, var11, var2, var8, var10, var3,
                var5, var4);
      }
  }

  public AbstractModel method1167(int var1, byte var2,
      AnimationSequence var3,
      int var4,
      int var5 ) {
    if (this.npcId == -1) {
        AbstractModel var6 = (AbstractModel) GlobalStatics_9.aClass93_1131.get(
            this.aLong860);
        if (var2 < 122) {
          this.anIntArray862 = null;
        }

        if (var6 == null) {
          boolean var7 = false;

          int var9;
          for (int var8 = 0; var8 < 12; ++var8) {
            var9 = this.anIntArray857[var8];
            if ((1073741824 & var9) == 0) {
              if ((var9 & Integer.MIN_VALUE) != 0 && !GlobalStatics_10.getIdentityKit(
                var9 & 1073741823, 0).method948(18991)) {
                var7 = true;
              }
            } else if (!DummyClass35.getItemConfig(1073741823 & var9, (byte) 127)
              .method1102(this.aBoolean864, false)) {
              var7 = true;
            }
          }

          if (var7) {
            return null;
          }

          Model[] var14 = new Model[12];
          var9 = 0;

          int var11;
          for (int var10 = 0; var10 < 12; ++var10) {
            var11 = this.anIntArray857[var10];
            Model var12;
            if ((1073741824 & var11) == 0) {
              if ((Integer.MIN_VALUE & var11) != 0) {
                var12 = GlobalStatics_10.getIdentityKit(1073741823 & var11, 0).method941(true);
                if (var12 != null) {
                  var14[var9++] = var12;
                }
              }
            } else {
              var12 = DummyClass35.getItemConfig(var11 & 1073741823, (byte) 89)
                .method1116(this.aBoolean864, (byte) -109);
              if (var12 != null) {
                var14[var9++] = var12;
              }
            }
          }

          Model var15 = new Model(var14, var9);

          for (var11 = 0; var11 < 5; ++var11) {
            if (GlobalStatics_2.aShortArrayArray344[var11].length > this.anIntArray862[var11]) {
              var15.replaceColor(GlobalStatics_9.aShortArray2548[var11],
                GlobalStatics_2.aShortArrayArray344[var11][this.anIntArray862[var11]]);
            }

            if (DummyClass55.aShortArrayArray1429[var11].length > this.anIntArray862[var11]) {
              var15.replaceColor(GlobalStatics_7.aShortArray1311[var11],
                DummyClass55.aShortArrayArray1429[var11][this.anIntArray862[var11]]);
            }
          }

          var6 = var15.method2008(64, 768, -50, -10, -50);
          GlobalStatics_9.aClass93_1131.get((byte) -102, var6, this.aLong860);
        }

        if (var3 != null) {
          var6 = var3.method2055(var6, (byte) 120, var5, var1, var4);
        }

        return var6;
      } else {
        return GlobalStatics_2
            .getNpcConfiguration(this.npcId).method1482(var3, var1, var5, -109, var4);
      }
  }

}
