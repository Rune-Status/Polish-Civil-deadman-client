package com.jagex.runescape.model;

public final class ISAACCipher {

  private int anInt966;
  private int anInt967;
  private int anInt968;
  private int[] anIntArray970;
  private int[] anIntArray971;
  private int anInt972;

  public ISAACCipher(int[] var1) {
    this.anIntArray970 = new int[256];
    this.anIntArray971 = new int[256];

    for (int var2 = 0; var2 < var1.length; ++var2) {
      this.anIntArray970[var2] = var1[var2];
    }

    this.method1227(true);
  }

  private void method1227(boolean var1) {
    if (!var1) {
      this.method1229(82);
    }

    int var10 = -1640531527;
    int var9 = -1640531527;
    int var8 = -1640531527;
    int var7 = -1640531527;
    int var6 = -1640531527;
    int var5 = -1640531527;
    int var4 = -1640531527;
    int var3 = -1640531527;

    int var2;
    for (var2 = 0; var2 < 4; ++var2) {
      var3 ^= var4 << 11;
      var6 += var3;
      var4 += var5;
      var4 ^= var5 >>> 2;
      var5 += var6;
      var5 ^= var6 << 8;
      var8 += var5;
      var7 += var4;
      var6 += var7;
      var6 ^= var7 >>> 16;
      var7 += var8;
      var9 += var6;
      var7 ^= var8 << 10;
      var10 += var7;
      var8 += var9;
      var8 ^= var9 >>> 4;
      var9 += var10;
      var9 ^= var10 << 8;
      var4 += var9;
      var3 += var8;
      var10 += var3;
      var10 ^= var3 >>> 9;
      var5 += var10;
      var3 += var4;
    }

    for (var2 = 0; var2 < 256; var2 += 8) {
      var6 += this.anIntArray970[3 + var2];
      var7 += this.anIntArray970[var2 + 4];
      var9 += this.anIntArray970[var2 + 6];
      var3 += this.anIntArray970[var2];
      var5 += this.anIntArray970[2 + var2];
      var8 += this.anIntArray970[var2 + 5];
      var10 += this.anIntArray970[7 + var2];
      var4 += this.anIntArray970[var2 + 1];
      var3 ^= var4 << 11;
      var4 += var5;
      var4 ^= var5 >>> 2;
      var6 += var3;
      var5 += var6;
      var5 ^= var6 << 8;
      var7 += var4;
      var6 += var7;
      var6 ^= var7 >>> 16;
      var8 += var5;
      var7 += var8;
      var7 ^= var8 << 10;
      var10 += var7;
      var9 += var6;
      var8 += var9;
      var8 ^= var9 >>> 4;
      var9 += var10;
      var9 ^= var10 << 8;
      var3 += var8;
      var10 += var3;
      var4 += var9;
      var10 ^= var3 >>> 9;
      var3 += var4;
      this.anIntArray971[var2] = var3;
      this.anIntArray971[1 + var2] = var4;
      var5 += var10;
      this.anIntArray971[2 + var2] = var5;
      this.anIntArray971[var2 + 3] = var6;
      this.anIntArray971[4 + var2] = var7;
      this.anIntArray971[5 + var2] = var8;
      this.anIntArray971[var2 + 6] = var9;
      this.anIntArray971[7 + var2] = var10;
    }

    for (var2 = 0; var2 < 256; var2 += 8) {
      var9 += this.anIntArray971[6 + var2];
      var8 += this.anIntArray971[var2 + 5];
      var7 += this.anIntArray971[4 + var2];
      var4 += this.anIntArray971[var2 + 1];
      var5 += this.anIntArray971[2 + var2];
      var3 += this.anIntArray971[var2];
      var3 ^= var4 << 11;
      var6 += this.anIntArray971[var2 + 3];
      var10 += this.anIntArray971[var2 + 7];
      var6 += var3;
      var4 += var5;
      var4 ^= var5 >>> 2;
      var5 += var6;
      var7 += var4;
      var5 ^= var6 << 8;
      var8 += var5;
      var6 += var7;
      var6 ^= var7 >>> 16;
      var7 += var8;
      var7 ^= var8 << 10;
      var9 += var6;
      var8 += var9;
      var8 ^= var9 >>> 4;
      var10 += var7;
      var9 += var10;
      var3 += var8;
      var9 ^= var10 << 8;
      var4 += var9;
      var10 += var3;
      var10 ^= var3 >>> 9;
      var5 += var10;
      var3 += var4;
      this.anIntArray971[var2] = var3;
      this.anIntArray971[1 + var2] = var4;
      this.anIntArray971[var2 + 2] = var5;
      this.anIntArray971[3 + var2] = var6;
      this.anIntArray971[4 + var2] = var7;
      this.anIntArray971[5 + var2] = var8;
      this.anIntArray971[var2 + 6] = var9;
      this.anIntArray971[var2 + 7] = var10;
    }

    this.method1229(-1879);
    this.anInt968 = 256;
  }

  public int getNextValue() {
    if (this.anInt968-- == 0) {
      this.method1229(-1879);
      this.anInt968 = 255;
    }
    return this.anIntArray970[this.anInt968];
  }

  private void method1229(int var1) {
    this.anInt967 += ++this.anInt966;
    int var2 = 0;
    if (var1 != -1879) {
      this.anInt968 = -98;
    }

    while (var2 < 256) {
      int var3 = this.anIntArray971[var2];
      if ((2 & var2) != 0) {
        if ((var2 & 1) == 0) {
          this.anInt972 ^= this.anInt972 << 2;
        } else {
          this.anInt972 ^= this.anInt972 >>> 16;
        }
      } else if ((var2 & 1) != 0) {
        this.anInt972 ^= this.anInt972 >>> 6;
      } else {
        this.anInt972 ^= this.anInt972 << 13;
      }

      this.anInt972 += this.anIntArray971[128 + var2 & 255];
      int var4;
      this.anIntArray971[var2] = var4 =
          this.anInt967 + this.anInt972 + this.anIntArray971[
              (var3 & 1020) >> 2];
      this.anIntArray970[var2] =
          this.anInt967 =
              var3 + this.anIntArray971[(261347 & var4) >> 8
                  >> 2];
      ++var2;
    }
  }

}
