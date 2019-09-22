package com.jagex.runescape.sound.audio;

public class AudioStreamEncoder1Statics {

  public static int method452(int var0, int var1) {
    return var1 < 0 ?
        var0 :
        (int) (var0 * Math.sqrt((16384 - var1) * 1.220703125E-4D) + 0.5D);
  }

  public static int method454(int var0, int var1) {
    return var1 < 0 ?
        -var0 :
        (int) (var0 * Math.sqrt(var1 * 1.220703125E-4D) + 0.5D);
  }

  public static int method426(byte[] var1, int[] var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      int var11, AudioStreamEncoder1 var12) {
    var3 >>= 8;
    var11 >>= 8;
    var5 <<= 2;
    var6 <<= 2;
    var7 <<= 2;
    var8 <<= 2;
    if ((var9 = var4 + var11 - var3) > var10) {
      var9 = var10;
    }

    var12.anInt3476 += var12.anInt3472 * (var9 - var4);
    var4 <<= 1;
    var9 <<= 1;

    int var10001;
    byte var13;
    for (var9 -= 6; var4 < var9; var6 += var8) {
      var13 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var13 * var5;
      var5 += var7;
      var10001 = var4++;
      var2[var10001] += var13 * var6;
      var6 += var8;
      var13 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var13 * var5;
      var5 += var7;
      var10001 = var4++;
      var2[var10001] += var13 * var6;
      var6 += var8;
      var13 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var13 * var5;
      var5 += var7;
      var10001 = var4++;
      var2[var10001] += var13 * var6;
      var6 += var8;
      var13 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var13 * var5;
      var5 += var7;
      var10001 = var4++;
      var2[var10001] += var13 * var6;
    }

    for (var9 += 6; var4 < var9; var6 += var8) {
      var13 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var13 * var5;
      var5 += var7;
      var10001 = var4++;
      var2[var10001] += var13 * var6;
    }

    var12.anInt3484 = var5 >> 2;
    var12.anInt3481 = var6 >> 2;
    var12.anInt3474 = var3 << 8;
    return var4 >> 1;
  }

  public static int method428(byte[] var0, int[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8,
      AudioStreamEncoder1 var9) {
    var2 >>= 8;
    var8 >>= 8;
    var4 <<= 2;
    var5 <<= 2;
    if ((var6 = var3 + var8 - var2) > var7) {
      var6 = var7;
    }

    var9.anInt3484 += var9.anInt3475 * (var6 - var3);
    var9.anInt3481 += var9.anInt3483 * (var6 - var3);

    int var10001;
    for (var6 -= 3; var3 < var6; var4 += var5) {
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
      var4 += var5;
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
      var4 += var5;
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
      var4 += var5;
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
    }

    for (var6 += 3; var3 < var6; var4 += var5) {
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
    }

    var9.anInt3476 = var4 >> 2;
    var9.anInt3474 = var2 << 8;
    return var3;
  }

  public static int method421(int var0, int var1, byte[] var2, int[] var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      int var11, int var12, AudioStreamEncoder1 var13, int var14,
      int var15) {
    var13.anInt3476 -= var13.anInt3472 * var5;
    if (var14 == 0
        || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
      var10 = var11;
    }

    var5 <<= 1;

    int var10001;
    byte var16;
    for (var10 <<= 1; var5 < var10; var4 += var14) {
      var1 = var4 >> 8;
      var16 = var2[var1];
      var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
      var10001 = var5++;
      var3[var10001] += var0 * var6 >> 6;
      var6 += var8;
      var10001 = var5++;
      var3[var10001] += var0 * var7 >> 6;
      var7 += var9;
    }

    if (var14 == 0
        || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
      var10 = var11;
    }

    var10 <<= 1;

    for (var1 = var15; var5 < var10; var4 += var14) {
      var16 = var2[var4 >> 8];
      var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
      var10001 = var5++;
      var3[var10001] += var0 * var6 >> 6;
      var6 += var8;
      var10001 = var5++;
      var3[var10001] += var0 * var7 >> 6;
      var7 += var9;
    }

    var5 >>= 1;
    var13.anInt3476 += var13.anInt3472 * var5;
    var13.anInt3484 = var6;
    var13.anInt3481 = var7;
    var13.anInt3474 = var4;
    return var5;
  }

  public static int method422(int var1, byte[] var2, int[] var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      AudioStreamEncoder1 var11, int var12, int var13) {
    var11.anInt3484 -= var11.anInt3475 * var5;
    var11.anInt3481 -= var11.anInt3483 * var5;
    if (var12 == 0
        || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
      var8 = var9;
    }

    int var10001;
    byte var14;
    while (var5 < var8) {
      var1 = var4 >> 8;
      var14 = var2[var1];
      var10001 = var5++;
      var3[var10001] +=
          ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
      var6 += var7;
      var4 += var12;
    }

    if (var12 == 0
        || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
      var8 = var9;
    }

    for (var1 = var13; var5 < var8; var4 += var12) {
      var14 = var2[var4 >> 8];
      var10001 = var5++;
      var3[var10001] +=
          ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
      var6 += var7;
    }

    var11.anInt3484 += var11.anInt3475 * var5;
    var11.anInt3481 += var11.anInt3483 * var5;
    var11.anInt3476 = var6;
    var11.anInt3474 = var4;
    return var5;
  }

  public static int method420(byte[] var1, int[] var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9,
      AudioStreamEncoder1 var10) {
    var3 >>= 8;
    var9 >>= 8;
    var5 <<= 2;
    var6 <<= 2;
    if ((var7 = var4 + var9 - var3) > var8) {
      var7 = var8;
    }

    var4 <<= 1;
    var7 <<= 1;

    byte var11;
    int var10001;
    for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
      var11 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
      var2[var10001] += var11 * var6;
      var11 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
      var2[var10001] += var11 * var6;
      var11 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
      var2[var10001] += var11 * var6;
      var11 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
    }

    for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
      var11 = var1[var3++];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
    }

    var10.anInt3474 = var3 << 8;
    return var4 >> 1;
  }

  public static int method424(byte[] var0, int[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, AudioStreamEncoder1 var8) {
    var2 >>= 8;
    var7 >>= 8;
    var4 <<= 2;
    if ((var5 = var3 + var7 - var2) > var6) {
      var5 = var6;
    }

    int var10001;
    for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
      var10001 = var3++;
      var1[var10001] += var0[var2++] * var4;
      var10001 = var3++;
    }

    for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
      var10001 = var3++;
    }

    var8.anInt3474 = var2 << 8;
    return var3;
  }

  public static int method433(int encoded, int srcOff, byte[] src, int[] dest,
      int sourceOff,
      int destOff, int mul0, int mul1, int len, int var9, int var10,
      AudioStreamEncoder1 var11, int offsetStep, int var13) {
    if (offsetStep == 0
        || (len = destOff + (var10 - sourceOff + offsetStep - 257) / offsetStep)
        > var9) {
      len = var9;
    }

    destOff <<= 1;

    int off;
    byte value;
    for (len <<= 1; destOff < len; sourceOff += offsetStep) {
      srcOff = sourceOff >> 8;
      value = src[srcOff];
      encoded = (value << 8) + (src[srcOff + 1] - value) * (sourceOff & 255);
      off = destOff++;
      dest[off] += encoded * mul0 >> 6;
      off = destOff++;
      dest[off] += encoded * mul1 >> 6;
    }

    if (offsetStep == 0
        || (len =
        (destOff >> 1) + (var10 - sourceOff + offsetStep - 1) / offsetStep)
        > var9) {
      len = var9;
    }

    len <<= 1;

    for (srcOff = var13; destOff < len; sourceOff += offsetStep) {
      value = src[sourceOff >> 8];
      encoded = (value << 8) + (srcOff - value) * (sourceOff & 255);
      off = destOff++;
      dest[off] += encoded * mul0 >> 6;
      off = destOff++;
      dest[off] += encoded * mul1 >> 6;
    }

    var11.anInt3474 = sourceOff;
    return destOff >> 1;
  }

  public static int method455(int var1, byte[] var2, int[] var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9,
      AudioStreamEncoder1 var10, int var11, int var12) {
    if (var11 == 0
        || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
      var7 = var8;
    }

    int var10001;
    byte var13;
    while (var5 < var7) {
      var1 = var4 >> 8;
      var13 = var2[var1];
      var10001 = var5++;
      var3[var10001] +=
          ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
      var4 += var11;
    }

    if (var11 == 0
        || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
      var7 = var8;
    }

    for (var1 = var12; var5 < var7; var4 += var11) {
      var13 = var2[var4 >> 8];
      var10001 = var5++;
      var3[var10001] +=
          ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
    }

    var10.anInt3474 = var4;
    return var5;
  }

  public static int method423(int var0, int var1, byte[] var2, int[] var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9,
      AudioStreamEncoder1 var10, int var11, int var12) {
    if (var11 == 0
        || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
      var7 = var8;
    }

    int var10001;
    while (var5 < var7) {
      var1 = var4 >> 8;
      byte var13 = var2[var1 - 1];
      var10001 = var5++;
      var3[var10001] +=
          ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
      var4 += var11;
    }

    if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
      var7 = var8;
    }

    var0 = var12;

    for (var1 = var11; var5 < var7; var4 += var1) {
      var10001 = var5++;
      var3[var10001] +=
          ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
    }

    var10.anInt3474 = var4;
    return var5;
  }

  public static int method453(int var0, int var1, byte[] var2, int[] var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      AudioStreamEncoder1 var11, int var12, int var13) {
    if (var12 == 0
        || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
      var8 = var9;
    }

    var5 <<= 1;

    int var10001;
    for (var8 <<= 1; var5 < var8; var4 += var12) {
      var1 = var4 >> 8;
      byte var14 = var2[var1 - 1];
      var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
      var10001 = var5++;
      var3[var10001] += var0 * var6 >> 6;
      var10001 = var5++;
      var3[var10001] += var0 * var7 >> 6;
    }

    if (var12 == 0
        || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
      var8 = var9;
    }

    var8 <<= 1;

    for (var1 = var13; var5 < var8; var4 += var12) {
      var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
      var10001 = var5++;
      var3[var10001] += var0 * var6 >> 6;
      var10001 = var5++;
      var3[var10001] += var0 * var7 >> 6;
    }

    var11.anInt3474 = var4;
    return var5 >> 1;
  }

  public static int method446(byte[] var0, int[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, AudioStreamEncoder1 var8) {
    var2 >>= 8;
    var7 >>= 8;
    var4 <<= 2;
    if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
      var5 = var6;
    }

    int var10001;
    for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
      var10001 = var3++;
    }

    for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
      var10001 = var3++;
    }

    var8.anInt3474 = var2 << 8;
    return var3;
  }

  public static int method447(byte[] var1, int[] var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9,
      AudioStreamEncoder1 var10) {
    var3 >>= 8;
    var9 >>= 8;
    var5 <<= 2;
    var6 <<= 2;
    if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
      var7 = var8;
    }

    var4 <<= 1;
    var7 <<= 1;

    byte var11;
    int var10001;
    for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
      var11 = var1[var3--];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
      var2[var10001] += var11 * var6;
      var11 = var1[var3--];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
      var2[var10001] += var11 * var6;
      var11 = var1[var3--];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
      var2[var10001] += var11 * var6;
      var11 = var1[var3--];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
    }

    for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
      var11 = var1[var3--];
      var10001 = var4++;
      var2[var10001] += var11 * var5;
      var10001 = var4++;
    }

    var10.anInt3474 = var3 << 8;
    return var4 >> 1;
  }

  public static int method448(int var0, int var1, byte[] var2, int[] var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      AudioStreamEncoder1 var11, int var12, int var13) {
    var11.anInt3484 -= var11.anInt3475 * var5;
    var11.anInt3481 -= var11.anInt3483 * var5;
    if (var12 == 0
        || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
      var8 = var9;
    }

    int var10001;
    while (var5 < var8) {
      var1 = var4 >> 8;
      byte var14 = var2[var1 - 1];
      var10001 = var5++;
      var3[var10001] +=
          ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
      var6 += var7;
      var4 += var12;
    }

    if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
      var8 = var9;
    }

    var0 = var13;

    for (var1 = var12; var5 < var8; var4 += var1) {
      var10001 = var5++;
      var3[var10001] +=
          ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      var6 += var7;
    }

    var11.anInt3484 += var11.anInt3475 * var5;
    var11.anInt3481 += var11.anInt3483 * var5;
    var11.anInt3476 = var6;
    var11.anInt3474 = var4;
    return var5;
  }

  public static int method440(int var0, int var1, byte[] var2, int[] var3,
      int var4,
      int var5, int var6, int var7, int var8, int var9, int var10,
      int var11, int var12, AudioStreamEncoder1 var13, int var14,
      int var15) {
    var13.anInt3476 -= var13.anInt3472 * var5;
    if (var14 == 0
        || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
      var10 = var11;
    }

    var5 <<= 1;

    int var10001;
    for (var10 <<= 1; var5 < var10; var4 += var14) {
      var1 = var4 >> 8;
      byte var16 = var2[var1 - 1];
      var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
      var10001 = var5++;
      var3[var10001] += var0 * var6 >> 6;
      var6 += var8;
      var10001 = var5++;
      var3[var10001] += var0 * var7 >> 6;
      var7 += var9;
    }

    if (var14 == 0
        || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
      var10 = var11;
    }

    var10 <<= 1;

    for (var1 = var15; var5 < var10; var4 += var14) {
      var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
      var10001 = var5++;
      var3[var10001] += var0 * var6 >> 6;
      var6 += var8;
      var10001 = var5++;
      var3[var10001] += var0 * var7 >> 6;
      var7 += var9;
    }

    var5 >>= 1;
    var13.anInt3476 += var13.anInt3472 * var5;
    var13.anInt3484 = var6;
    var13.anInt3481 = var7;
    var13.anInt3474 = var4;
    return var5;
  }

  public static int method427(byte[] var0, int[] var1, int var2, int var3,
      int var4,
      int var5, int var6, int var7, int var8,
      AudioStreamEncoder1 var9) {
    var2 >>= 8;
    var8 >>= 8;
    var4 <<= 2;
    var5 <<= 2;
    if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
      var6 = var7;
    }

    var9.anInt3484 += var9.anInt3475 * (var6 - var3);
    var9.anInt3481 += var9.anInt3483 * (var6 - var3);

    int var10001;
    for (var6 -= 3; var3 < var6; var4 += var5) {
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
      var4 += var5;
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
      var4 += var5;
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
      var4 += var5;
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
    }

    for (var6 += 3; var3 < var6; var4 += var5) {
      var10001 = var3++;
      var1[var10001] += var0[var2--] * var4;
    }

    var9.anInt3476 = var4 >> 2;
    var9.anInt3474 = var2 << 8;
    return var3;
  }

  public static int method435(byte[] src, int[] samples, int srcOff,
      int destOff,
      int mul0, int mul1, int mulStep, int mul1Step, int destLen,
      int maximumLen, int var11, AudioStreamEncoder1 var12) {
    srcOff >>= 8;
    var11 >>= 8;
    mul0 <<= 2;
    mul1 <<= 2;
    mulStep <<= 2;
    mul1Step <<= 2;
    if ((destLen = destOff + srcOff - (var11 - 1)) > maximumLen) {
      destLen = maximumLen;
    }

    var12.anInt3476 += var12.anInt3472 * (destLen - destOff);
    destOff <<= 1;
    destLen <<= 1;

    int off;
    byte b;
    for (destLen -= 6; destOff < destLen; mul1 += mul1Step) {
      b = src[srcOff--];
      off = destOff++;
      samples[off] += b * mul0;
      mul0 += mulStep;
      off = destOff++;
      samples[off] += b * mul1;
      mul1 += mul1Step;
      b = src[srcOff--];
      off = destOff++;
      samples[off] += b * mul0;
      mul0 += mulStep;
      off = destOff++;
      samples[off] += b * mul1;
      mul1 += mul1Step;
      b = src[srcOff--];
      off = destOff++;
      samples[off] += b * mul0;
      mul0 += mulStep;
      off = destOff++;
      samples[off] += b * mul1;
      mul1 += mul1Step;
      b = src[srcOff--];
      off = destOff++;
      samples[off] += b * mul0;
      mul0 += mulStep;
      off = destOff++;
      samples[off] += b * mul1;
    }

    for (destLen += 6; destOff < destLen; mul1 += mul1Step) {
      b = src[srcOff--];
      off = destOff++;
      samples[off] += b * mul0;
      mul0 += mulStep;
      off = destOff++;
      samples[off] += b * mul1;
    }

    var12.anInt3484 = mul0 >> 2;
    var12.anInt3481 = mul1 >> 2;
    var12.anInt3474 = srcOff << 8;
    return destOff >> 1;
  }
}
