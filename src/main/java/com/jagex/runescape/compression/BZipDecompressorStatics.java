package com.jagex.runescape.compression;

public final class BZipDecompressorStatics {

  public static int[] anIntArray1690;
  private static BZipDecompressor STATE = new BZipDecompressor();

  private static int method1633(int var0, BZipDecompressor state) {
    while (state.anInt128 < var0) {
      state.anInt140 =
          state.anInt140 << 8 | state.aByteArray127[state.anInt116] & 255;
      state.anInt128 += 8;
      ++state.anInt116;
      ++state.anInt147;
    }

    int var3 = state.anInt140 >> state.anInt128 - var0 & (1 << var0) - 1;
    state.anInt128 -= var0;
    return var3;
  }

  private static void method1634(BZipDecompressor var0) {
    byte var2 = var0.aByte111;
    int var3 = var0.anInt143;
    int var4 = var0.anInt131;
    int var5 = var0.anInt129;
    int[] var6 = BZipDecompressorStatics.anIntArray1690;
    int var7 = var0.anInt133;
    byte[] var8 = var0.aByteArray117;
    int var9 = var0.anInt118;
    int var10 = var0.anInt126;
    int var12 = var0.anInt121 + 1;

    label67:
    while (true) {
      if (var3 > 0) {
        while (true) {
          if (var10 == 0) {
            break label67;
          }

          if (var3 == 1) {

            var8[var9] = var2;
            ++var9;
            --var10;
            break;
          }

          var8[var9] = var2;
          --var3;
          ++var9;
          --var10;
        }
      }

      boolean var14 = true;

      byte var1;
      while (var14) {
        var14 = false;
        if (var4 == var12) {
          var3 = 0;
          break label67;
        }

        var2 = (byte) var5;
        var7 = var6[var7];
        var1 = (byte) (var7 & 255);
        var7 >>= 8;
        ++var4;
        if (var1 != var5) {
          var5 = var1;
          if (var10 == 0) {
            var3 = 1;
            break label67;
          }

          var8[var9] = var2;
          ++var9;
          --var10;
          var14 = true;
        } else if (var4 == var12) {
          if (var10 == 0) {
            var3 = 1;
            break label67;
          }

          var8[var9] = var2;
          ++var9;
          --var10;
          var14 = true;
        }
      }

      var3 = 2;
      var7 = var6[var7];
      var1 = (byte) (var7 & 255);
      var7 >>= 8;
      ++var4;
      if (var4 != var12) {
        if (var1 == var5) {
          var3 = 3;
          var7 = var6[var7];
          var1 = (byte) (var7 & 255);
          var7 >>= 8;
          ++var4;
          if (var4 != var12) {
            if (var1 == var5) {
              var7 = var6[var7];
              var1 = (byte) (var7 & 255);
              var7 >>= 8;
              ++var4;
              var3 = (var1 & 255) + 4;
              var7 = var6[var7];
              var5 = (byte) (var7 & 255);
              var7 >>= 8;
              ++var4;
            } else {
              var5 = var1;
            }
          }
        } else {
          var5 = var1;
        }
      }
    }

    int var13 = var0.anInt141;

    var0.aByte111 = var2;
    var0.anInt143 = var3;
    var0.anInt131 = var4;
    var0.anInt129 = var5;
    BZipDecompressorStatics.anIntArray1690 = var6;
    var0.anInt133 = var7;
    var0.aByteArray117 = var8;
    var0.anInt118 = var9;
    var0.anInt126 = var10;
  }

  private static void method1635(int[] var0, int[] var1, int[] var2,
      byte[] var3, int var4,
      int var5, int var6) {
    int var7 = 0;

    int var8;
    for (var8 = var4; var8 <= var5; ++var8) {
      for (int var9 = 0; var9 < var6; ++var9) {
        if (var3[var9] == var8) {
          var2[var7] = var9;
          ++var7;
        }
      }
    }

    for (var8 = 0; var8 < 23; ++var8) {
      var1[var8] = 0;
    }

    for (var8 = 0; var8 < var6; ++var8) {
      ++var1[var3[var8] + 1];
    }

    for (var8 = 1; var8 < 23; ++var8) {
      var1[var8] += var1[var8 - 1];
    }

    for (var8 = 0; var8 < 23; ++var8) {
      var0[var8] = 0;
    }

    int var10 = 0;

    for (var8 = var4; var8 <= var5; ++var8) {
      var10 += var1[var8 + 1] - var1[var8];
      var0[var8] = var10 - 1;
      var10 <<= 1;
    }

    for (var8 = var4 + 1; var8 <= var5; ++var8) {
      var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
    }

  }

  private static void method1636(BZipDecompressor var0) {
    var0.anInt137 = 0;

    for (int var1 = 0; var1 < 256; ++var1) {
      if (var0.aBooleanArray112[var1]) {
        var0.aByteArray114[var0.anInt137] = (byte) var1;
        ++var0.anInt137;
      }
    }

  }

  private static byte method1637(BZipDecompressor var0) {
    return (byte) BZipDecompressorStatics.method1633(8, var0);
  }

  private static void method1638(BZipDecompressor state) {
    boolean var4 = false;
    boolean var5 = false;
    boolean var6 = false;
    boolean var7 = false;
    boolean var8 = false;
    boolean var9 = false;
    boolean var10 = false;
    boolean var11 = false;
    boolean var12 = false;
    boolean var13 = false;
    boolean var14 = false;
    boolean var15 = false;
    boolean var16 = false;
    boolean var17 = false;
    boolean var18 = false;
    boolean var19 = false;
    boolean var20 = false;
    boolean var21 = false;
    int var22 = 0;
    int[] var23 = null;
    int[] var24 = null;
    int[] var25 = null;
    state.anInt142 = 1;
    if (BZipDecompressorStatics.anIntArray1690 == null) {
      BZipDecompressorStatics.anIntArray1690 = new int[state.anInt142 * 100000];
    }

    boolean var26 = true;

    while (var26) {
      byte var1 = BZipDecompressorStatics.method1637(state);
      if (var1 == 23) {
        return;
      }

      var1 = BZipDecompressorStatics.method1637(state);
      var1 = BZipDecompressorStatics.method1637(state);
      var1 = BZipDecompressorStatics.method1637(state);
      var1 = BZipDecompressorStatics.method1637(state);
      var1 = BZipDecompressorStatics.method1637(state);
      var1 = BZipDecompressorStatics.method1637(state);
      var1 = BZipDecompressorStatics.method1637(state);
      var1 = BZipDecompressorStatics.method1637(state);
      var1 = BZipDecompressorStatics.method1637(state);
      var1 = BZipDecompressorStatics.method1639(state);

      state.anInt135 = 0;
      var1 = BZipDecompressorStatics.method1637(state);
      state.anInt135 = state.anInt135 << 8 | var1 & 255;
      var1 = BZipDecompressorStatics.method1637(state);
      state.anInt135 = state.anInt135 << 8 | var1 & 255;
      var1 = BZipDecompressorStatics.method1637(state);
      state.anInt135 = state.anInt135 << 8 | var1 & 255;

      int var35;
      for (var35 = 0; var35 < 16; ++var35) {
        var1 = BZipDecompressorStatics.method1639(state);
        state.aBooleanArray124[var35] = var1 == 1;
      }

      for (var35 = 0; var35 < 256; ++var35) {
        state.aBooleanArray112[var35] = false;
      }

      int var36;
      for (var35 = 0; var35 < 16; ++var35) {
        if (state.aBooleanArray124[var35]) {
          for (var36 = 0; var36 < 16; ++var36) {
            var1 = BZipDecompressorStatics.method1639(state);
            if (var1 == 1) {
              state.aBooleanArray112[var35 * 16 + var36] = true;
            }
          }
        }
      }

      BZipDecompressorStatics.method1636(state);
      int var38 = state.anInt137 + 2;
      int var39 = BZipDecompressorStatics.method1633(3, state);
      int var40 = BZipDecompressorStatics.method1633(15, state);
      var35 = 0;

      while (var35 < var40) {
        var36 = 0;

        while (true) {
          var1 = BZipDecompressorStatics.method1639(state);
          if (var1 == 0) {
            state.aByteArray139[var35] = (byte) var36;
            ++var35;
            break;
          }

          ++var36;
        }
      }

      byte[] var27 = new byte[6];

      byte var29;
      for (var29 = 0; var29 < var39; var27[var29] = var29++) {
      }

      for (var35 = 0; var35 < var40; ++var35) {
        var29 = state.aByteArray139[var35];

        byte var28;
        for (var28 = var27[var29]; var29 > 0; --var29) {
          var27[var29] = var27[var29 - 1];
        }

        var27[0] = var28;
        state.aByteArray130[var35] = var28;
      }

      int var37;
      for (var37 = 0; var37 < var39; ++var37) {
        int var49 = BZipDecompressorStatics.method1633(5, state);
        var35 = 0;

        while (var35 < var38) {
          while (true) {
            var1 = BZipDecompressorStatics.method1639(state);
            if (var1 == 0) {
              state.aByteArrayArray146[var37][var35] = (byte) var49;
              ++var35;
              break;
            }

            var1 = BZipDecompressorStatics.method1639(state);
            if (var1 == 0) {
              ++var49;
            } else {
              --var49;
            }
          }
        }
      }

      for (var37 = 0; var37 < var39; ++var37) {
        byte var2 = 32;
        byte var3 = 0;

        for (var35 = 0; var35 < var38; ++var35) {
          if (state.aByteArrayArray146[var37][var35] > var3) {
            var3 = state.aByteArrayArray146[var37][var35];
          }

          if (state.aByteArrayArray146[var37][var35] < var2) {
            var2 = state.aByteArrayArray146[var37][var35];
          }
        }

        BZipDecompressorStatics.method1635(state.anIntArrayArray115[var37],
            state.anIntArrayArray108[var37],
            state.anIntArrayArray110[var37], state.aByteArrayArray146[var37],
            var2, var3, var38);
        state.anIntArray138[var37] = var2;
      }

      int var42 = state.anInt137 + 1;
      int var41 = -1;
      byte var43 = 0;

      for (var35 = 0; var35 <= 255; ++var35) {
        state.anIntArray134[var35] = 0;
      }

      int var56 = 4095;

      int var55;
      int var54;
      for (var55 = 15; var55 >= 0; --var55) {
        for (var54 = 15; var54 >= 0; --var54) {
          state.aByteArray109[var56] = (byte) (var55 * 16 + var54);
          --var56;
        }

        state.anIntArray123[var55] = var56 + 1;
      }

      int var47 = 0;
      byte var53;
      ++var41;
      var43 = 50;
      var53 = state.aByteArray130[var41];
      var22 = state.anIntArray138[var53];
      var23 = state.anIntArrayArray115[var53];
      var25 = state.anIntArrayArray110[var53];
      var24 = state.anIntArrayArray108[var53];

      int var45 = var43 - 1;
      int var51 = var22;

      int var50;
      byte var52;
      for (var50 = BZipDecompressorStatics.method1633(var22, state);
          var50 > var23[var51]; var50 = var50 << 1 | var52) {
        ++var51;
        var52 = BZipDecompressorStatics.method1639(state);
      }

      int var44 = var25[var50 - var24[var51]];

      while (var44 != var42) {
        if (var44 != 0 && var44 != 1) {
          int var33 = var44 - 1;
          int var30;
          if (var33 < 16) {
            var30 = state.anIntArray123[0];

            for (var1 = state.aByteArray109[var30 + var33]; var33 > 3;
                var33 -= 4) {
              int var34 = var30 + var33;
              state.aByteArray109[var34] = state.aByteArray109[var34 - 1];
              state.aByteArray109[var34 - 1] = state.aByteArray109[var34 - 2];
              state.aByteArray109[var34 - 2] = state.aByteArray109[var34 - 3];
              state.aByteArray109[var34 - 3] = state.aByteArray109[var34 - 4];
            }

            while (var33 > 0) {
              state.aByteArray109[var30 + var33] = state.aByteArray109[
                  var30 + var33 - 1];
              --var33;
            }

            state.aByteArray109[var30] = var1;
          } else {
            int var31 = var33 / 16;
            int var32 = var33 % 16;
            var30 = state.anIntArray123[var31] + var32;

            for (var1 = state.aByteArray109[var30];
                var30 > state.anIntArray123[var31]; --var30) {
              state.aByteArray109[var30] = state.aByteArray109[var30 - 1];
            }

            ++state.anIntArray123[var31];

            while (var31 > 0) {
              --state.anIntArray123[var31];
              state.aByteArray109[state.anIntArray123[var31]] =
                  state.aByteArray109[state.anIntArray123[var31 - 1] + 16 - 1];
              --var31;
            }

            --state.anIntArray123[0];
            state.aByteArray109[state.anIntArray123[0]] = var1;
            if (state.anIntArray123[0] == 0) {
              var56 = 4095;

              for (var55 = 15; var55 >= 0; --var55) {
                for (var54 = 15; var54 >= 0; --var54) {
                  state.aByteArray109[var56] = state.aByteArray109[
                      state.anIntArray123[var55] + var54];
                  --var56;
                }

                state.anIntArray123[var55] = var56 + 1;
              }
            }
          }

          ++state.anIntArray134[state.aByteArray114[var1 & 255] & 255];
          BZipDecompressorStatics.anIntArray1690[var47] =
              state.aByteArray114[var1 & 255] & 255;
          ++var47;
          if (var45 == 0) {
            ++var41;
            var45 = 50;
            var53 = state.aByteArray130[var41];
            var22 = state.anIntArray138[var53];
            var23 = state.anIntArrayArray115[var53];
            var25 = state.anIntArrayArray110[var53];
            var24 = state.anIntArrayArray108[var53];
          }

          --var45;
          var51 = var22;

          for (var50 = BZipDecompressorStatics.method1633(var22, state);
              var50 > var23[var51]; var50 = var50 << 1 | var52) {
            ++var51;
            var52 = BZipDecompressorStatics.method1639(state);
          }

          var44 = var25[var50 - var24[var51]];
        } else {
          int var46 = -1;
          int var48 = 1;

          do {
            if (var44 == 0) {
              var46 += var48;
            } else {
              var46 += 2 * var48;
            }

            var48 *= 2;
            if (var45 == 0) {
              ++var41;
              var45 = 50;
              var53 = state.aByteArray130[var41];
              var22 = state.anIntArray138[var53];
              var23 = state.anIntArrayArray115[var53];
              var25 = state.anIntArrayArray110[var53];
              var24 = state.anIntArrayArray108[var53];
            }

            --var45;
            var51 = var22;

            for (
                var50 = BZipDecompressorStatics.method1633(var22, state);
                var50 > var23[var51]; var50 = var50 << 1 | var52) {
              ++var51;
              var52 = BZipDecompressorStatics.method1639(state);
            }

            var44 = var25[var50 - var24[var51]];
          } while (var44 == 0 || var44 == 1);

          ++var46;
          var1 = state.aByteArray114[state.aByteArray109[state.anIntArray123[0]]
              & 255];

          for (state.anIntArray134[var1 & 255] += var46; var46 > 0; --var46) {
            BZipDecompressorStatics.anIntArray1690[var47] = var1 & 255;
            ++var47;
          }
        }
      }

      state.anInt143 = 0;
      state.aByte111 = 0;
      state.anIntArray122[0] = 0;

      for (var35 = 1; var35 <= 256; ++var35) {
        state.anIntArray122[var35] = state.anIntArray134[var35 - 1];
      }

      for (var35 = 1; var35 <= 256; ++var35) {
        state.anIntArray122[var35] += state.anIntArray122[var35 - 1];
      }

      for (var35 = 0; var35 < var47; ++var35) {
        var1 = (byte) (BZipDecompressorStatics.anIntArray1690[var35] & 255);
        BZipDecompressorStatics.anIntArray1690[state.anIntArray122[var1
            & 255]] |=
            var35 << 8;
        ++state.anIntArray122[var1 & 255];
      }

      state.anInt133 =
          BZipDecompressorStatics.anIntArray1690[state.anInt135] >> 8;
      state.anInt131 = 0;
      state.anInt133 = BZipDecompressorStatics.anIntArray1690[state.anInt133];
      state.anInt129 = (byte) (state.anInt133 & 255);
      state.anInt133 >>= 8;
      ++state.anInt131;
      state.anInt121 = var47;
      BZipDecompressorStatics.method1634(state);
      var26 = state.anInt131 == state.anInt121 + 1 && state.anInt143 == 0;
    }

  }

  private static byte method1639(BZipDecompressor var0) {
    return (byte) BZipDecompressorStatics.method1633(1, var0);
  }

  public static int method1640(byte[] var0, int var1, byte[] var2,
      int var4) {
    synchronized (BZipDecompressorStatics.STATE) {
      BZipDecompressorStatics.STATE.aByteArray127 = var2;
      BZipDecompressorStatics.STATE.anInt116 = var4;
      BZipDecompressorStatics.STATE.aByteArray117 = var0;
      BZipDecompressorStatics.STATE.anInt118 = 0;
      BZipDecompressorStatics.STATE.anInt126 = var1;
      BZipDecompressorStatics.STATE.anInt128 = 0;
      BZipDecompressorStatics.STATE.anInt140 = 0;
      BZipDecompressorStatics.STATE.anInt147 = 0;
      BZipDecompressorStatics.STATE.anInt141 = 0;
      BZipDecompressorStatics.method1638(BZipDecompressorStatics.STATE);
      var1 -= BZipDecompressorStatics.STATE.anInt126;
      BZipDecompressorStatics.STATE.aByteArray127 = null;
      BZipDecompressorStatics.STATE.aByteArray117 = null;
      return var1;
    }
  }

  public static void method1641() {
    BZipDecompressorStatics.STATE = null;
  }

}
