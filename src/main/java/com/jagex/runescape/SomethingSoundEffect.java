package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import java.util.Random;

public final class SomethingSoundEffect {

  private static int[] anIntArray1591;
  private static int[] anIntArray1594 = new int['\u8000'];
  private static int[] anIntArray1598;
  private static int[] anIntArray1599;
  private static int[] anIntArray1600;
  private static int[] anIntArray1601;
  private static int[] anIntArray1602;
  private static int[] anIntArray1603;

  static {
    Random var0 = new Random(0L);

    int var1;
    for (var1 = 0; var1 < '\u8000'; ++var1) {
      SomethingSoundEffect.anIntArray1594[var1] = (var0.nextInt() & 2) - 1;
    }

    SomethingSoundEffect.anIntArray1591 = new int['\u8000'];

    for (var1 = 0; var1 < '\u8000'; ++var1) {
      SomethingSoundEffect.anIntArray1591[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
    }

    SomethingSoundEffect.anIntArray1598 = new int[220500];
    SomethingSoundEffect.anIntArray1599 = new int[5];
    SomethingSoundEffect.anIntArray1600 = new int[5];
    SomethingSoundEffect.anIntArray1601 = new int[5];
    SomethingSoundEffect.anIntArray1603 = new int[5];
    SomethingSoundEffect.anIntArray1602 = new int[5];
  }

  public int anInt1586 = 500;
  public int anInt1593;
  private Something2SounfEffect aClass34_1584;
  private Something2SounfEffect aClass34_1585;
  private Something2SounfEffect aClass34_1587;
  private Something2SounfEffect aClass34_1588;
  private Something2SounfEffect aClass34_1589;
  private int anInt1590;
  private Something2SounfEffect aClass34_1592;
  private Something2SounfEffect aClass34_1595;
  private final int[] anIntArray1596 = {0, 0, 0, 0, 0};
  private final int[] anIntArray1597 = {0, 0, 0, 0, 0};
  private int anInt1604 = 100;
  private final int[] anIntArray1605 = {0, 0, 0, 0, 0};
  private FilterPossibly aClass103_1606;
  private Something2SounfEffect aClass34_1607;
  private Something2SounfEffect aClass34_1608;

  private int method1716(int var1, int var2, int var3) {
    return var3 == 1 ?
      ((var1 & 32767) < 16384 ? var2 : -var2) :
      (var3 == 2 ?
          SomethingSoundEffect.anIntArray1591[var1 & 32767] * var2 >> 14 :
        (var3 == 3 ?
          ((var1 & 32767) * var2 >> 14) - var2 :
          (var3 == 4 ? SomethingSoundEffect.anIntArray1594[var1 / 2607 & 32767] * var2 : 0)));
  }

  public int[] method1717(int var1, int var2 ) {
    ArrayUtils.clear(SomethingSoundEffect.anIntArray1598, 0, var1);
    if (var2 < 10) {
      return SomethingSoundEffect.anIntArray1598;
    } else {
      double var3 = var1 / (var2 + 0.0D);
      this.aClass34_1589.method1008();
      this.aClass34_1587.method1008();
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      if (this.aClass34_1608 != null) {
        this.aClass34_1608.method1008();
        this.aClass34_1607.method1008();
        var5 = (int) ((
            this.aClass34_1608.anInt605 - this.aClass34_1608.anInt603) * 32.768D
          / var3);
        var6 = (int) (this.aClass34_1608.anInt603 * 32.768D / var3);
      }

      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      if (this.aClass34_1595 != null) {
        this.aClass34_1595.method1008();
        this.aClass34_1584.method1008();
        var8 = (int) ((
            this.aClass34_1595.anInt605 - this.aClass34_1595.anInt603) * 32.768D
          / var3);
        var9 = (int) (this.aClass34_1595.anInt603 * 32.768D / var3);
      }

      int var11;
      for (var11 = 0; var11 < 5; ++var11) {
        if (this.anIntArray1596[var11] != 0) {
          SomethingSoundEffect.anIntArray1601[var11] = 0;
          SomethingSoundEffect.anIntArray1602[var11] = (int) (this.anIntArray1597[var11]
              * var3);
          SomethingSoundEffect.anIntArray1603[var11] = (this.anIntArray1596[var11] << 14) / 100;
          SomethingSoundEffect.anIntArray1599[var11] = (int) (
            (this.aClass34_1589.anInt605 - this.aClass34_1589.anInt603) * 32.768D
              * Math.pow(1.0057929410678534D, this.anIntArray1605[var11]) / var3);
          SomethingSoundEffect.anIntArray1600[var11] = (int) (
              this.aClass34_1589.anInt603 * 32.768D / var3);
        }
      }

      int var12;
      int var13;
      int var14;
      int var15;
      for (var11 = 0; var11 < var1; ++var11) {
        var12 = this.aClass34_1589.method1007(var1);
        var13 = this.aClass34_1587.method1007(var1);
        if (this.aClass34_1608 != null) {
          var14 = this.aClass34_1608.method1007(var1);
          var15 = this.aClass34_1607.method1007(var1);
          var12 += this.method1716(var7, var15, this.aClass34_1608.anInt601) >> 1;
          var7 += (var14 * var5 >> 16) + var6;
        }

        if (this.aClass34_1595 != null) {
          var14 = this.aClass34_1595.method1007(var1);
          var15 = this.aClass34_1584.method1007(var1);
          var13 =
            var13 * ((this.method1716(var10, var15, this.aClass34_1595.anInt601) >> 1) + '\u8000')
              >> 15;
          var10 += (var14 * var8 >> 16) + var9;
        }

        for (var14 = 0; var14 < 5; ++var14) {
          if (this.anIntArray1596[var14] != 0) {
            var15 = var11 + SomethingSoundEffect.anIntArray1602[var14];
            if (var15 < var1) {
              SomethingSoundEffect.anIntArray1598[var15] +=
                  this.method1716(SomethingSoundEffect.anIntArray1601[var14], var13 * SomethingSoundEffect.anIntArray1603[var14] >> 15,
                      this.aClass34_1589.anInt601);
              SomethingSoundEffect.anIntArray1601[var14] +=
                (var12 * SomethingSoundEffect.anIntArray1599[var14] >> 16) + SomethingSoundEffect.anIntArray1600[var14];
            }
          }
        }
      }

      int var16;
      if (this.aClass34_1585 != null) {
        this.aClass34_1585.method1008();
        this.aClass34_1588.method1008();
        var11 = 0;
        boolean var19 = false;
        boolean var18 = true;

        for (var14 = 0; var14 < var1; ++var14) {
          var15 = this.aClass34_1585.method1007(var1);
          var16 = this.aClass34_1588.method1007(var1);
          if (var18) {
            var12 = this.aClass34_1585.anInt603 + (
              (this.aClass34_1585.anInt605 - this.aClass34_1585.anInt603) * var15 >> 8);
          } else {
            var12 = this.aClass34_1585.anInt603 + (
              (this.aClass34_1585.anInt605 - this.aClass34_1585.anInt603) * var16 >> 8);
          }

          var11 += 256;
          if (var11 >= var12) {
            var11 = 0;
            var18 = !var18;
          }

          if (var18) {
            SomethingSoundEffect.anIntArray1598[var14] = 0;
          }
        }
      }

      if (this.anInt1590 > 0 && this.anInt1604 > 0) {
        var11 = (int) (this.anInt1590 * var3);

        for (var12 = var11; var12 < var1; ++var12) {
          SomethingSoundEffect.anIntArray1598[var12] +=
              SomethingSoundEffect.anIntArray1598[var12 - var11] * this.anInt1604
                  / 100;
        }
      }

      if (this.aClass103_1606.anIntArray1434[0] > 0 || this.aClass103_1606.anIntArray1434[1] > 0) {
        this.aClass34_1592.method1008();
        var11 = this.aClass34_1592.method1007(var1 + 1);
        var12 = this.aClass103_1606.method1622(0, var11 / 65536.0F);
        var13 = this.aClass103_1606.method1622(1, var11 / 65536.0F);
        if (var1 >= var12 + var13) {
          var14 = 0;
          var15 = var13;
          if (var13 > var1 - var12) {
            var15 = var1 - var12;
          }

          int var17;
          while (var14 < var15) {
            var16 =
              (int) ((long) SomethingSoundEffect.anIntArray1598[var14 + var12] * FilterPossibly.anInt1436
                  >> 16);

            for (var17 = 0; var17 < var12; ++var17) {
              var16 += (int) ((long) SomethingSoundEffect.anIntArray1598[var14 + var12 - 1 - var17]
                * FilterPossibly.anIntArrayArray1435[0][var17] >> 16);
            }

            for (var17 = 0; var17 < var14; ++var17) {
              var16 -= (int) ((long) SomethingSoundEffect.anIntArray1598[var14 - 1 - var17]
                * FilterPossibly.anIntArrayArray1435[1][var17] >> 16);
            }

            SomethingSoundEffect.anIntArray1598[var14] = var16;
            var11 = this.aClass34_1592.method1007(var1 + 1);
            ++var14;
          }

          var15 = 128;

          while (true) {
            if (var15 > var1 - var12) {
              var15 = var1 - var12;
            }

            while (var14 < var15) {
              var16 = (int) ((long) SomethingSoundEffect.anIntArray1598[var14 + var12] * FilterPossibly.anInt1436
                >> 16);

              for (var17 = 0; var17 < var12; ++var17) {
                var16 += (int) ((long) SomethingSoundEffect.anIntArray1598[var14 + var12 - 1 - var17]
                  * FilterPossibly.anIntArrayArray1435[0][var17] >> 16);
              }

              for (var17 = 0; var17 < var13; ++var17) {
                var16 -= (int) ((long) SomethingSoundEffect.anIntArray1598[var14 - 1 - var17]
                  * FilterPossibly.anIntArrayArray1435[1][var17] >> 16);
              }

              SomethingSoundEffect.anIntArray1598[var14] = var16;
              var11 = this.aClass34_1592.method1007(var1 + 1);
              ++var14;
            }

            if (var14 >= var1 - var12) {
              while (var14 < var1) {
                var16 = 0;

                for (var17 = var14 + var12 - var1; var17 < var12; ++var17) {
                  var16 += (int) ((long) SomethingSoundEffect.anIntArray1598[var14 + var12 - 1 - var17]
                    * FilterPossibly.anIntArrayArray1435[0][var17] >> 16);
                }

                for (var17 = 0; var17 < var13; ++var17) {
                  var16 -= (int) ((long) SomethingSoundEffect.anIntArray1598[var14 - 1 - var17]
                    * FilterPossibly.anIntArrayArray1435[1][var17] >> 16);
                }

                SomethingSoundEffect.anIntArray1598[var14] = var16;
                this.aClass34_1592.method1007(var1 + 1);
                ++var14;
              }
              break;
            }

            var12 = this.aClass103_1606.method1622(0, var11 / 65536.0F);
            var13 = this.aClass103_1606.method1622(1, var11 / 65536.0F);
            var15 += 128;
          }
        }
      }

      for (var11 = 0; var11 < var1; ++var11) {
        if (SomethingSoundEffect.anIntArray1598[var11] < -32768) {
          SomethingSoundEffect.anIntArray1598[var11] = -32768;
        }

        if (SomethingSoundEffect.anIntArray1598[var11] > 32767) {
          SomethingSoundEffect.anIntArray1598[var11] = 32767;
        }
      }

      return SomethingSoundEffect.anIntArray1598;
    }
  }

  public void method1718(Buffer var1 ) {
    this.aClass34_1589 = new Something2SounfEffect();
    this.aClass34_1589.method1010(var1);
    this.aClass34_1587 = new Something2SounfEffect();
    this.aClass34_1587.method1010(var1);
    int var2 = var1.readUnsignedByte();
    if (var2 != 0) {
      --var1.position;
      this.aClass34_1608 = new Something2SounfEffect();
      this.aClass34_1608.method1010(var1);
      this.aClass34_1607 = new Something2SounfEffect();
      this.aClass34_1607.method1010(var1);
    }

    var2 = var1.readUnsignedByte();
    if (var2 != 0) {
      --var1.position;
      this.aClass34_1595 = new Something2SounfEffect();
      this.aClass34_1595.method1010(var1);
      this.aClass34_1584 = new Something2SounfEffect();
      this.aClass34_1584.method1010(var1);
    }

    var2 = var1.readUnsignedByte();
    if (var2 != 0) {
      --var1.position;
      this.aClass34_1585 = new Something2SounfEffect();
      this.aClass34_1585.method1010(var1);
      this.aClass34_1588 = new Something2SounfEffect();
      this.aClass34_1588.method1010(var1);
    }

    for (int var3 = 0; var3 < 10; ++var3) {
      int var4 = var1.readUnsignedShortSmart();
      if (var4 == 0) {
        break;
      }

      this.anIntArray1596[var3] = var4;
      this.anIntArray1605[var3] = var1.readUnsignedSmart();
      this.anIntArray1597[var3] = var1.readUnsignedShortSmart();
    }

    this.anInt1590 = var1.readUnsignedShortSmart();
    this.anInt1604 = var1.readUnsignedShortSmart();
    this.anInt1586 = var1.readUnsignedShort();
    this.anInt1593 = var1.readUnsignedShort();
    this.aClass103_1606 = new FilterPossibly();
    this.aClass34_1592 = new Something2SounfEffect();
    this.aClass103_1606.method1620(var1, this.aClass34_1592);
  }

  public static void method1715() {
    SomethingSoundEffect.anIntArray1598 = null;
    SomethingSoundEffect.anIntArray1594 = null;
    SomethingSoundEffect.anIntArray1591 = null;
    SomethingSoundEffect.anIntArray1601 = null;
    SomethingSoundEffect.anIntArray1602 = null;
    SomethingSoundEffect.anIntArray1603 = null;
    SomethingSoundEffect.anIntArray1599 = null;
    SomethingSoundEffect.anIntArray1600 = null;
  }
}
