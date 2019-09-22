package com.jagex.runescape.sound;

public final class SomethingAudio {

  private int anInt1997;
  private int[][] anIntArrayArray1999;
  private int anInt2001;

  public SomethingAudio(int var1, int var2) {
    if (var2 != var1) {
      int var3 = SomethingAudioStatics.method1651(var2, var1);
      var2 /= var3;
      this.anInt2001 = var2;
      var1 /= var3;
      this.anIntArrayArray1999 = new int[var1][14];
      this.anInt1997 = var1;

      for (int var4 = 0; var4 < var1; ++var4) {
        int[] var5 = this.anIntArrayArray1999[var4];
        double var6 = (double) var4 / var1 + 6.0D;
        double var10 = (double) var2 / var1;
        int var8 = (int) Math.floor(-7.0 + var6 + 1.0D);
        int var9 = (int) Math.ceil(7.0D + var6);
        if (var8 < 0) {
          var8 = 0;
        }

        if (var9 > 14) {
          var9 = 14;
        }

        while (var8 < var9) {
          double var12 = (var8 - var6) * 3.141592653589793D;
          double var14 = var10;
          if (var12 < -1.0E-4 || var12 > 1.0E-4D) {
            var14 = var10 * (Math.sin(var12) / var12);
          }

          var14 *=
              0.54D + 0.46D * Math.cos((var8 - var6) * 0.2243994752564138D);
          var5[var8] = (int) Math.floor(65536.0D * var14 + 0.5D);
          ++var8;
        }
      }

    }
  }

  public byte[] method2173(byte[] var1, byte var2) {
    if (this.anIntArrayArray1999 != null) {
      int var4 = 14 + (int) ((long) var1.length * this.anInt2001
          / this.anInt1997);
      int[] var5 = new int[var4];
      int var6 = 0;
      int var7 = 0;

      int var8;
      for (var8 = 0; var8 < var1.length; ++var8) {
        int[] var10 = this.anIntArrayArray1999[var7];
        byte var9 = var1[var8];

        int var11;
        for (var11 = 0; var11 < 14; ++var11) {
          var5[var6 + var11] += var10[var11] * var9;
        }

        var7 += this.anInt2001;
        var11 = var7 / this.anInt1997;
        var6 += var11;
        var7 -= var11 * this.anInt1997;
      }

      var1 = new byte[var4];

      for (var8 = 0; var4 > var8; ++var8) {
        int var13 = var5[var8] + 32768 >> 16;
        if (var13 >= 127) {
          if (var13 <= 127) {
            var1[var8] = (byte) var13;
          } else {
            var1[var8] = 127;
          }
        } else {
          var1[var8] = -128;
        }
      }
    }

    return var1;
  }

  public int method2177(int var1, byte var2) {
    if (this.anIntArrayArray1999 != null) {
      var1 = (int) ((long) this.anInt2001
          * var1 / this.anInt1997);
    }

    return var2 == 90 ? var1 : 81;
  }

  public int method2178(boolean var1, int var2) {
    if (var1) {
      return -69;
    } else {
      if (this.anIntArrayArray1999 != null) {
        var2 = (int) ((long) this.anInt2001
            * var2 / this.anInt1997) + 6;
      }

      return var2;
    }
  }

}
