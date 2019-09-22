package com.jagex.runescape.sprite;

public class SoftwareIndexedColorSpriteStatics {

  static void method1670(int[] var0, byte[] var1, int[] var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      int var11) {
    int var12 = var3;

    for (int var13 = -var8; var13 < 0; ++var13) {
      int var14 = (var4 >> 16) * var11;

      for (int var15 = -var7; var15 < 0; ++var15) {
        byte var16 = var1[(var3 >> 16) + var14];
        if (var16 == 0) {
          ++var5;
        } else {
          var0[var5++] = var2[var16 & 255];
        }

        var3 += var9;
      }

      var4 += var10;
      var3 = var12;
      var5 += var6;
    }

  }

  static void method1672(int[] var0, byte[] var1, int[] var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9) {
    int var10 = -(var6 >> 2);
    var6 = -(var6 & 3);

    for (int var11 = -var7; var11 < 0; ++var11) {
      int var12;
      byte var13;
      for (var12 = var10; var12 < 0; ++var12) {
        var13 = var1[var4++];
        if (var13 == 0) {
          ++var5;
        } else {
          var0[var5++] = var2[var13 & 255];
        }

        var13 = var1[var4++];
        if (var13 == 0) {
          ++var5;
        } else {
          var0[var5++] = var2[var13 & 255];
        }

        var13 = var1[var4++];
        if (var13 == 0) {
          ++var5;
        } else {
          var0[var5++] = var2[var13 & 255];
        }

        var13 = var1[var4++];
        if (var13 == 0) {
          ++var5;
        } else {
          var0[var5++] = var2[var13 & 255];
        }
      }

      for (var12 = var6; var12 < 0; ++var12) {
        var13 = var1[var4++];
        if (var13 == 0) {
          ++var5;
        } else {
          var0[var5++] = var2[var13 & 255];
        }
      }

      var5 += var8;
      var4 += var9;
    }

  }

  static void method1673(int[] var0, byte[] var1, int[] var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      int var11, int var12) {
    int var13 = var3;
    int var14 = var12 >> 16 & 255;
    int var15 = var12 >> 8 & 255;
    int var16 = var12 & 255;

    for (int var17 = -var8; var17 < 0; ++var17) {
      int var18 = (var4 >> 16) * var11;

      for (int var19 = -var7; var19 < 0; ++var19) {
        byte var20 = var1[(var3 >> 16) + var18];
        if (var20 == 0) {
          ++var5;
        } else {
          int var24 = var2[var20 & 255];
          int var21 = var24 >> 16 & 255;
          int var22 = var24 >> 8 & 255;
          int var23 = var24 & 255;
          var0[var5++] =
              (var21 * var14 >> 8 << 16) + (var22 * var15 >> 8 << 8) + (
                  var23 * var16 >> 8);
        }

        var3 += var9;
      }

      var4 += var10;
      var3 = var13;
      var5 += var6;
    }

  }

  static void method1676(int[] var0, byte[] var1, int[] var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9) {
    int var10 = 256 - var9;

    for (int var11 = -var6; var11 < 0; ++var11) {
      for (int var12 = -var5; var12 < 0; ++var12) {
        byte var13 = var1[var3++];
        if (var13 == 0) {
          ++var4;
        } else {
          int var15 = var2[var13 & 255];
          int var14 = var0[var4];
          var0[var4++] = ((var15 & 16711935) * var9 + (var14 & 16711935) * var10
              & -16711936) + (
              (var15 & 0xff00) * var9 + (var14 & 0xff00) * var10 & 16711680)
              >> 8;
        }
      }

      var4 += var7;
      var3 += var8;
    }

  }
}
