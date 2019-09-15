package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.done.AbstractTextureSampler;

public final class TextureSampler7 extends AbstractTextureSampler {

  private int anInt3343 = 6;


  public TextureSampler7() {
    super(2, false);
  }

  public int[] method154(int var1, byte var2 ) {
    int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      int var4;
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var6 = this.method152(0, var1, 32755);
        int[] var7 = this.method152(1, var1, 32755);
        int var8 = this.anInt3343;
        if ((var8 == 1)) {
          for (var8 = 0; var8 < GlobalStatics_9.anInt1559; ++var8) {
            var3[var8] = var7[var8] + var6[var8];
          }
        } else if ((var8 != 2)) {
          if ((var8 == 3)) {
            for (var8 = 0; (var8 < GlobalStatics_9.anInt1559); ++var8) {
              var3[var8] = var7[var8] * var6[var8] >> 12;
            }
          } else {
            int var5;
            if ((var8 == 4)) {
              for (var8 = 0; (var8 < GlobalStatics_9.anInt1559); ++var8) {
                var5 = var7[var8];
                var3[var8] = (var5 != 0) ? (var6[var8] << 12) / var5 : 4096;
              }
            } else {
              if (var8 == 5) {
                for (var8 = 0; GlobalStatics_9.anInt1559 > var8; ++var8) {
                  var3[var8] =
                      4096 - ((-var6[var8] + 4096) * (-var7[var8] + 4096)
                          >> 12);
                }
              } else if ((var8 != 6)) {
                if ((var8 == 7)) {
                  for (var8 = 0; GlobalStatics_9.anInt1559 > var8; ++var8) {
                    var4 = var6[var8];
                    var3[var8] = var4 == 4096 ? 4096
                        : (var7[var8] << 12) / (4096 - var4);
                  }
                } else {
                  if ((var8 == 8)) {
                    for (var8 = 0; var8 < GlobalStatics_9.anInt1559; ++var8) {
                      var4 = var6[var8];
                      var3[var8] =
                          (var4 != 0) ? 4096 - (-var7[var8] + 4096 << 12) / var4
                              : 0;
                    }
                  } else {
                    if ((var8 == 9)) {
                      for (var8 = 0; GlobalStatics_9.anInt1559 > var8; ++var8) {
                        var5 = var7[var8];
                        var4 = var6[var8];
                        var3[var8] = (var4 < var5) ? var4 : var5;
                      }
                    } else if (var8 == 10) {
                      for (var8 = 0; GlobalStatics_9.anInt1559 > var8;
                           ++var8) {
                        var5 = var7[var8];
                        var4 = var6[var8];
                        var3[var8] = var4 > var5 ? var4 : var5;
                      }
                    } else if ((var8 != 11)) {
                      if ((var8 == 12)) {
                        for (var8 = 0; (var8 < GlobalStatics_9.anInt1559);
                            ++var8) {
                          var4 = var6[var8];
                          var5 = var7[var8];
                          var3[var8] = var5 + (var4 - (var4 * var5 >> 11));
                        }
                      }
                    } else {
                      for (var8 = 0; GlobalStatics_9.anInt1559 > var8;
                           ++var8) {
                        var4 = var6[var8];
                        var5 = var7[var8];
                        var3[var8] = (var5 < var4) ? var4 - var5 : var5 - var4;
                      }
                    }
                  }
                }
              } else {
                for (var8 = 0; GlobalStatics_9.anInt1559 > var8; ++var8) {
                  var5 = var7[var8];
                  var3[var8] = (var5 >= 2048) ?
                      -((-var6[var8] + 4096) * (4096 - var5) >> 11) + 4096 :
                      var5 * var6[var8] >> 11;
                }
              }
            }
          }
        } else {
          for (var8 = 0; GlobalStatics_9.anInt1559 > var8; ++var8) {
            var3[var8] = -var7[var8] + var6[var8];
          }
        }
      }

      var4 = -73 / ((30 - var2) / 36);
      return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var1 == 0) {
        this.anInt3343 = var2.readUnsignedByte();
      } else if ((var1 == 1)) {
        this.monoChromatic = (var2.readUnsignedByte() == 1);
      }

      if (!var3) {
        GlobalStatics_9.aClass94_3339 = null;
      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        this.parseConfig(-8, null, false);
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) -125, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[][] var10 = this.method162(var2, 0, (byte) -87);
        int[][] var11 = this.method162(var2, 1, (byte) -73);
        int[] var12 = var3[0];
        int[] var13 = var3[1];
        int[] var14 = var3[2];
        assert var10 != null;
        int[] var15 = var10[0];
        int[] var16 = var10[1];
        int[] var17 = var10[2];
        assert var11 != null;
        int[] var18 = var11[0];
        int[] var19 = var11[1];
        int[] var20 = var11[2];
        int var21 = this.anInt3343;
        if ((var21 == 1)) {
          for (var21 = 0; GlobalStatics_9.anInt1559 > var21; ++var21) {
            var12[var21] = var18[var21] + var15[var21];
            var13[var21] = var19[var21] + var16[var21];
            var14[var21] = var17[var21] + var20[var21];
          }
        } else if ((var21 == 2)) {
          for (var21 = 0; GlobalStatics_9.anInt1559 > var21; ++var21) {
            var12[var21] = var15[var21] - var18[var21];
            var13[var21] = -var19[var21] + var16[var21];
            var14[var21] = -var20[var21] + var17[var21];
          }
        } else if (var21 != 3) {
          int var7;
          int var8;
          int var9;
          if (var21 == 4) {
            for (var21 = 0; GlobalStatics_9.anInt1559 > var21; ++var21) {
              var9 = var20[var21];
              var8 = var19[var21];
              var7 = var18[var21];
              var12[var21] = (var7 == 0) ? 4096 : (var15[var21] << 12) / var7;
              var13[var21] = (var8 != 0) ? (var16[var21] << 12) / var8 : 4096;
              var14[var21] = var9 != 0 ? (var17[var21] << 12) / var9 : 4096;
            }
          } else if (var21 == 5) {
            for (var21 = 0; (var21 < GlobalStatics_9.anInt1559); ++var21) {
              var12[var21] = 4096 - ((4096 - var18[var21]) * (4096 - var15[var21]) >> 12);
              var13[var21] = 4096 - ((-var19[var21] + 4096) * (-var16[var21] + 4096) >> 12);
              var14[var21] = 4096 - ((-var20[var21] + 4096) * (4096 - var17[var21]) >> 12);
            }
          } else if (var21 == 6) {
            for (var21 = 0; var21 < GlobalStatics_9.anInt1559; ++var21) {
              var9 = var20[var21];
              var7 = var18[var21];
              var8 = var19[var21];
              var12[var21] = (var7 >= 2048) ?
                -((-var7 + 4096) * (-var15[var21] + 4096) >> 11) + 4096 :
                var7 * var15[var21] >> 11;
              var13[var21] = var8 < 2048 ?
                var8 * var16[var21] >> 11 :
                4096 - ((4096 - var8) * (-var16[var21] + 4096) >> 11);
              var14[var21] = var9 >= 2048 ?
                4096 - ((4096 - var9) * (-var17[var21] + 4096) >> 11) :
                var17[var21] * var9 >> 11;
            }
          } else {
            int var4;
            int var5;
            int var6;
            if ((var21 == 7)) {
              for (var21 = 0; GlobalStatics_9.anInt1559 > var21; ++var21) {
                var6 = var17[var21];
                var4 = var15[var21];
                var5 = var16[var21];
                var12[var21] = (var4 == 4096) ? 4096 : (var18[var21] << 12) / (-var4 + 4096);
                var13[var21] = (var5 == 4096) ? 4096 : (var19[var21] << 12) / (4096 - var5);
                var14[var21] = (var6 == 4096) ? 4096 : (var20[var21] << 12) / (4096 - var6);
              }
            } else if (var21 == 8) {
              for (var21 = 0; GlobalStatics_9.anInt1559 > var21; ++var21) {
                var4 = var15[var21];
                var5 = var16[var21];
                var6 = var17[var21];
                var12[var21] = var4 == 0 ? 0 : -((-var18[var21] + 4096 << 12) / var4) + 4096;
                var13[var21] = (var5 == 0) ? 0 : -((-var19[var21] + 4096 << 12) / var5) + 4096;
                var14[var21] =
                    var6 == 0 ? 0 : 4096 - (4096 - var20[var21] << 12) / var6;
              }
            } else if ((var21 != 9)) {
              if (var21 == 10) {
                for (var21 = 0; GlobalStatics_9.anInt1559 > var21; ++var21) {
                  var9 = var20[var21];
                  var6 = var17[var21];
                  var8 = var19[var21];
                  var4 = var15[var21];
                  var5 = var16[var21];
                  var7 = var18[var21];
                  var12[var21] = var7 < var4 ? var4 : var7;
                  var13[var21] = var5 > var8 ? var5 : var8;
                  var14[var21] = (var9 < var6) ? var6 : var9;
                }
              } else {
                if (var21 == 11) {
                  for (var21 = 0; (var21 < GlobalStatics_9.anInt1559);
                      ++var21) {
                    var8 = var19[var21];
                    var7 = var18[var21];
                    var5 = var16[var21];
                    var4 = var15[var21];
                    var6 = var17[var21];
                    var9 = var20[var21];
                    var12[var21] = var4 > var7 ? var4 - var7 : -var4 + var7;
                    var13[var21] = var5 > var8 ? -var8 + var5 : -var5 + var8;
                    var14[var21] = var9 < var6 ? var6 - var9 : -var6 + var9;
                  }
                } else if (var21 == 12) {
                  for (var21 = 0; GlobalStatics_9.anInt1559 > var21; ++var21) {
                    var4 = var15[var21];
                    var9 = var20[var21];
                    var7 = var18[var21];
                    var8 = var19[var21];
                    var6 = var17[var21];
                    var5 = var16[var21];
                    var12[var21] = -(var7 * var4 >> 11) + var7 + var4;
                    var13[var21] = var8 + var5 - (var5 * var8 >> 11);
                    var14[var21] = var9 + (var6 - (var6 * var9 >> 11));
                  }
                }
              }
            } else {
              for (var21 = 0; (var21 < GlobalStatics_9.anInt1559); ++var21) {
                var6 = var17[var21];
                var9 = var20[var21];
                var8 = var19[var21];
                var5 = var16[var21];
                var7 = var18[var21];
                var4 = var15[var21];
                var12[var21] = (var4 >= var7) ? var7 : var4;
                var13[var21] = var5 >= var8 ? var8 : var5;
                var14[var21] = var6 < var9 ? var6 : var9;
              }
            }
          }
        } else {
          for (var21 = 0; GlobalStatics_9.anInt1559 > var21; ++var21) {
            var12[var21] = var18[var21] * var15[var21] >> 12;
            var13[var21] = var16[var21] * var19[var21] >> 12;
            var14[var21] = var20[var21] * var17[var21] >> 12;
          }
        }
      }

      return var3;
  }

}
