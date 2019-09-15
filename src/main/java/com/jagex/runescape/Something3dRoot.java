package com.jagex.runescape;

import com.jagex.runescape.done.FileUnpacker;

import java.util.Random;

public abstract class Something3dRoot {

  public static FileUnpacker configs;
  public int anInt2062 = 4;
  private final short[] aShortArray2047 = new short[512];
  private short[] aShortArray2049;
  private int anInt2054;
  private int anInt2056 = 4;
  private int anInt2057 = 4;
  private int anInt2060 = 4;


  public Something3dRoot(int var1, int var2, int var3, int var4, int var5 ) {
    this.anInt2056 = var4;
      this.anInt2062 = var2;
      this.anInt2054 = var1;
      this.anInt2060 = var5;
      this.anInt2057 = var3;
      this.method2232((byte) -60);
      this.method2236(-190126388);
  }

  public final void method2230(int var1, int var2, int var3, int var4) {
    int[] var39 = new int[var2];
      int[] var40 = new int[var4];
      int[] var41 = new int[var3];

      int var42;
      for (var42 = 0; var2 > var42; ++var42) {
        var39[var42] = (var42 << 12) / var2;
      }

      if (var1 > -68) {
        this.method2236(64);
      }

      for (var42 = 0; var42 < var4; ++var42) {
        var40[var42] = (var42 << 12) / var4;
      }

      for (var42 = 0; var42 < var3; ++var42) {
        var41[var42] = (var42 << 12) / var3;
      }

      this.method2233(-949697716);

      for (int var37 = 0; var37 < var3; ++var37) {
        for (int var36 = 0; var4 > var36; ++var36) {
          for (int var35 = 0; var35 < var2; ++var35) {
            for (int var38 = 0; this.anInt2062 > var38; ++var38) {
              var42 = this.aShortArray2049[var38] << 12;
              int var8 = this.anInt2057 * var42 >> 12;
              int var7 = var42 * var41[var37] >> 12;
              int var9 = var42 * this.anInt2056 >> 12;
              var7 *= this.anInt2060;
              int var10 = var42 * this.anInt2060 >> 12;
              int var5 = var39[var35] * var42 >> 12;
              var5 *= this.anInt2057;
              int var11 = var5 >> 12;
              var5 &= 4095;
              int var15 = var7 >> 12;
              int var20 = var5 - 4096;
              int var12 = var11 + 1;
              int var16 = var15 + 1;
              int var6 = var40[var36] * var42 >> 12;
              int var17 = DummyClass3.anIntArray52[var5];
              var6 *= this.anInt2056;
              var15 &= 255;
              var11 &= 255;
              if (var10 <= var16) {
                var16 = 0;
              } else {
                var16 &= 255;
              }

              int var13 = var6 >> 12;
              short var23 = this.aShortArray2047[var15];
              short var24 = this.aShortArray2047[var16];
              int var14 = var13 + 1;
              if (var9 > var14) {
                var14 &= 255;
              } else {
                var14 = 0;
              }

              var6 &= 4095;
              short var28 = this.aShortArray2047[var14 + var24];
              var7 &= 4095;
              var13 &= 255;
              int var19 = DummyClass3.anIntArray52[var7];
              short var27 = this.aShortArray2047[var13 + var24];
              short var25 = this.aShortArray2047[var23 + var13];
              if (var8 <= var12) {
                var12 = 0;
              } else {
                var12 &= 255;
              }

              int var21 = -4096 + var6;
              int var18 = DummyClass3.anIntArray52[var6];
              int var22 = var7 - 4096;
              short var26 = this.aShortArray2047[var23 + var14];
              int var29 =
                GlobalStatics_10.method1788(var5, var7, var6, this.aShortArray2047[var25 + var11],
                  true);
              int var30 =
                GlobalStatics_10.method1788(var20, var7, var6, this.aShortArray2047[var12 + var25],
                  true);
              int var31 = var29 + (var17 * (var30 - var29) >> 12);
              var29 =
                GlobalStatics_10.method1788(var5, var7, var21, this.aShortArray2047[var26 + var11],
                  true);
              var30 =
                GlobalStatics_10.method1788(var20, var7, var21,
                    this.aShortArray2047[var12 + var26],
                  true);
              int var32 = var29 + (var17 * (-var29 + var30) >> 12);
              int var33 = ((-var31 + var32) * var18 >> 12) + var31;
              var29 =
                GlobalStatics_10.method1788(var5, var22, var6, this.aShortArray2047[var11 + var27],
                  true);
              var30 =
                GlobalStatics_10.method1788(var20, var22, var6,
                    this.aShortArray2047[var12 + var27],
                  true);
              var31 = (var17 * (var30 - var29) >> 12) + var29;
              var29 =
                GlobalStatics_10.method1788(var5, var22, var21,
                    this.aShortArray2047[var11 + var28],
                  true);
              var30 =
                GlobalStatics_10.method1788(var20, var22, var21,
                    this.aShortArray2047[var12 + var28],
                  true);
              var32 = var29 + ((-var29 + var30) * var17 >> 12);
              int var34 = var31 + ((var32 - var31) * var18 >> 12);
              this.method2237(((-var33 + var34) * var19 >> 12) + var33, var38, -20975);
            }

            this.method2231((byte) -92);
          }
        }
      }
  }

  public abstract void method2231(byte var1 );

  private void method2232(byte var1) {
    this.aShortArray2049 = new short[this.anInt2062];
      int var2 = 0;
      if (var1 != -60) {
        GlobalStatics_9.method2234(-92, 105);
      }

      while (this.anInt2062 > var2) {
        this.aShortArray2049[var2] = (short) ((int) Math.pow(2.0D, var2));
        ++var2;
      }
  }

  public abstract void method2233(int var1 );

  private void method2236(int var1) {
    Random var2 = new Random(this.anInt2054);

      int var3;
      for (var3 = 0; var3 < 255; ++var3) {
        this.aShortArray2047[var3] = (short) var3;
      }

      if (var1 != -190126388) {
        GlobalStatics_9.anInt2051 = -58;
      }

      for (var3 = 0; var3 < 255; ++var3) {
        int var4 = -var3 + 255;
        int var5 = GlobalStatics_8.method1603((byte) -120, var4, var2);
        short var6 = this.aShortArray2047[var5];
        this.aShortArray2047[var5] = this.aShortArray2047[var4];
        this.aShortArray2047[var4] = this.aShortArray2047[256 + var4] = var6;
      }
  }

  public abstract void method2237(int var1,int var2,int var3 );

}
