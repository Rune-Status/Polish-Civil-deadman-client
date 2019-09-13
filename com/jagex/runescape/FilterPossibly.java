package com.jagex.runescape;

public final class FilterPossibly {

  private static float[][] aFloatArrayArray1431 = new float[2][8];
  private static float aFloat1433;
  public static int[][] anIntArrayArray1435 = new int[2][8];
  public static int anInt1436;
  public int[] anIntArray1434 = new int[2];
  private final int[][][] anIntArrayArrayArray1430 = new int[2][2][4];
  private final int[][][] anIntArrayArrayArray1432 = new int[2][2][4];
  private final int[] anIntArray1437 = new int[2];

  public void method1620(Buffer var1, Something2SounfEffect var2 ) {
    int var3 = var1.readUnsignedByte();
    this.anIntArray1434[0] = var3 >> 4;
    this.anIntArray1434[1] = var3 & 15;
    if (var3 == 0) {
      this.anIntArray1437[0] = this.anIntArray1437[1] = 0;
    } else {
      this.anIntArray1437[0] = var1.readUnsignedShort();
      this.anIntArray1437[1] = var1.readUnsignedShort();
      int var4 = var1.readUnsignedByte();

      int var5;
      int var6;
      for (var5 = 0; var5 < 2; ++var5) {
        for (var6 = 0; var6 < this.anIntArray1434[var5]; ++var6) {
          this.anIntArrayArrayArray1430[var5][0][var6] = var1
              .readUnsignedShort();
          this.anIntArrayArrayArray1432[var5][0][var6] = var1
              .readUnsignedShort();
        }
      }

      for (var5 = 0; var5 < 2; ++var5) {
        for (var6 = 0; var6 < this.anIntArray1434[var5]; ++var6) {
          if ((var4 & 1 << var5 * 4 << var6) == 0) {
            this.anIntArrayArrayArray1430[var5][1][var6] =
                this.anIntArrayArrayArray1430[var5][0][var6];
            this.anIntArrayArrayArray1432[var5][1][var6] =
                this.anIntArrayArrayArray1432[var5][0][var6];
          } else {
            this.anIntArrayArrayArray1430[var5][1][var6] = var1
                .readUnsignedShort();
            this.anIntArrayArrayArray1432[var5][1][var6] = var1
                .readUnsignedShort();
          }
        }
      }

      if (var4 != 0 || this.anIntArray1437[1] != this.anIntArray1437[0]) {
        var2.method1009(var1);
      }
    }

  }

  public int method1622(int var1, float var2 ) {
    float var3;
    if (var1 == 0) {
      var3 = this.anIntArray1437[0]
        + (this.anIntArray1437[1] - this.anIntArray1437[0]) * var2;
      var3 *= 0.0030517578F;
      FilterPossibly.aFloat1433 = (float) Math.pow(0.1D, var3 / 20.0F);
      FilterPossibly.anInt1436 = (int) (FilterPossibly.aFloat1433 * 65536.0F);
    }

    if (this.anIntArray1434[var1] == 0) {
      return 0;
    } else {
      var3 = this.method1624(var1, 0, var2);
      FilterPossibly.aFloatArrayArray1431[var1][0] =
        -2.0F * var3 * (float) Math.cos(this.method1625(var1, 0, var2));
      FilterPossibly.aFloatArrayArray1431[var1][1] = var3 * var3;

      int var4;
      for (var4 = 1; var4 < this.anIntArray1434[var1]; ++var4) {
        var3 = this.method1624(var1, var4, var2);
        float var5 = -2.0F * var3 * (float) Math.cos(
            this.method1625(var1, var4, var2));
        float var6 = var3 * var3;
        FilterPossibly.aFloatArrayArray1431[var1][var4 * 2 + 1] =
            FilterPossibly.aFloatArrayArray1431[var1][var4 * 2 - 1] * var6;
        FilterPossibly.aFloatArrayArray1431[var1][var4 * 2] =
            FilterPossibly.aFloatArrayArray1431[var1][var4 * 2 - 1] * var5
          + FilterPossibly.aFloatArrayArray1431[var1][var4 * 2 - 2] * var6;

        for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
          FilterPossibly.aFloatArrayArray1431[var1][var7] +=
              FilterPossibly.aFloatArrayArray1431[var1][var7 - 1] * var5
            + FilterPossibly.aFloatArrayArray1431[var1][var7 - 2] * var6;
        }

        FilterPossibly.aFloatArrayArray1431[var1][1] +=
            FilterPossibly.aFloatArrayArray1431[var1][0] * var5 + var6;
        FilterPossibly.aFloatArrayArray1431[var1][0] += var5;
      }

      if (var1 == 0) {
        for (var4 = 0; var4 < this.anIntArray1434[0] * 2; ++var4) {
          FilterPossibly.aFloatArrayArray1431[0][var4] *= FilterPossibly.aFloat1433;
        }
      }

      for (var4 = 0; var4 < this.anIntArray1434[var1] * 2; ++var4) {
        FilterPossibly.anIntArrayArray1435[var1][var4] = (int) (
            FilterPossibly.aFloatArrayArray1431[var1][var4] * 65536.0F);
      }

      return this.anIntArray1434[var1] * 2;
    }
  }

  private float method1624(int var1, int var2, float var3) {
    float var4 = this.anIntArrayArrayArray1432[var1][0][var2] + var3 * (
        this.anIntArrayArrayArray1432[var1][1][var2] - this.anIntArrayArrayArray1432[var1][0][var2]);
    var4 *= 0.0015258789F;
    return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
  }

  private float method1625(int var1, int var2, float var3) {
    float var4 = this.anIntArrayArrayArray1430[var1][0][var2] + var3 * (
        this.anIntArrayArrayArray1430[var1][1][var2] - this.anIntArrayArrayArray1430[var1][0][var2]);
    var4 *= 1.2207031E-4F;
    return FilterPossibly.method1621(var4);
  }

  private static float method1621(float var0) {
    float var1 = 32.703197F * (float) Math.pow(2.0D, var0);
    return var1 * 3.1415927F / 11025.0F;
  }

  public static void method1623() {
    FilterPossibly.aFloatArrayArray1431 = null;
    FilterPossibly.anIntArrayArray1435 = null;
  }

}
