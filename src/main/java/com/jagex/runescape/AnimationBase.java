package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;

public final class AnimationBase {

  private static byte[] aByteArray1389 = new byte[500];
  private static short[] aShortArray1390 = new short[500];
  private static short[] aShortArray1391 = new short[500];
  private static short[] aShortArray1392 = new short[500];
  private static short[] aShortArray1394 = new short[500];
  private static short[] aShortArray1397 = new short[500];
  public boolean aBoolean1382;
  public int anInt1383 = -1;
  public AnimationFrame aClass3_Sub17_1384;
  public short[] aShortArray1385;
  public boolean aBoolean1386;
  public short[] aShortArray1387;
  public short[] aShortArray1388;
  public byte[] aByteArray1393;
  public short[] aShortArray1395;
  public short[] aShortArray1396;


  public AnimationBase(byte[] var1, AnimationFrame var2 ) {
    this.aClass3_Sub17_1384 = var2;
    Buffer var3 = new Buffer(var1);
    Buffer var4 = new Buffer(var1);
    var3.position = 2;
    int var5 = var3.readUnsignedByte();
    int var6 = 0;
    int var7 = -1;
    int var8 = -1;
    var4.position = var3.position + var5;

    int var9;
    for (var9 = 0; var9 < var5; ++var9) {
      int var10 = this.aClass3_Sub17_1384.anIntArray2466[var9];
      if (var10 == 0) {
        var7 = var9;
      }

      int var11 = var3.readUnsignedByte();
      if (var11 > 0) {
        if (var10 == 0) {
          var8 = var9;
        }

        AnimationBase.aShortArray1397[var6] = (short) var9;
        short var12 = 0;
        if (var10 == 3) {
          var12 = 128;
        }

        if ((var11 & 1) == 0) {
          AnimationBase.aShortArray1394[var6] = var12;
        } else {
          AnimationBase.aShortArray1394[var6] = (short) var4
              .readUnsignedSmart();
        }

        if ((var11 & 2) == 0) {
          AnimationBase.aShortArray1391[var6] = var12;
        } else {
          AnimationBase.aShortArray1391[var6] = (short) var4
              .readUnsignedSmart();
        }

        if ((var11 & 4) == 0) {
          AnimationBase.aShortArray1390[var6] = var12;
        } else {
          AnimationBase.aShortArray1390[var6] = (short) var4
              .readUnsignedSmart();
        }

        AnimationBase.aByteArray1389[var6] = (byte) (var11 >>> 3 & 3);
        if (var10 == 2) {
          AnimationBase.aShortArray1394[var6] =
            (short) (((AnimationBase.aShortArray1394[var6] & 255) << 3) + (
                AnimationBase.aShortArray1394[var6] >> 8 & 7));
          AnimationBase.aShortArray1391[var6] =
            (short) (((AnimationBase.aShortArray1391[var6] & 255) << 3) + (
                AnimationBase.aShortArray1391[var6] >> 8 & 7));
          AnimationBase.aShortArray1390[var6] =
            (short) (((AnimationBase.aShortArray1390[var6] & 255) << 3) + (
                AnimationBase.aShortArray1390[var6] >> 8 & 7));
        }

        AnimationBase.aShortArray1392[var6] = -1;
        if (var10 != 1 && var10 != 2 && var10 != 3) {
          if (var10 == 5) {
            this.aBoolean1386 = true;
          } else if (var10 == 7) {
            this.aBoolean1382 = true;
          }
        } else if (var7 > var8) {
          AnimationBase.aShortArray1392[var6] = (short) var7;
          var8 = var7;
        }

        ++var6;
      }
    }

    if (var4.position == var1.length) {
      this.anInt1383 = var6;
      this.aShortArray1385 = new short[var6];
      this.aShortArray1388 = new short[var6];
      this.aShortArray1396 = new short[var6];
      this.aShortArray1395 = new short[var6];
      this.aShortArray1387 = new short[var6];
      this.aByteArray1393 = new byte[var6];

      for (var9 = 0; var9 < var6; ++var9) {
        this.aShortArray1385[var9] = AnimationBase.aShortArray1397[var9];
        this.aShortArray1388[var9] = AnimationBase.aShortArray1394[var9];
        this.aShortArray1396[var9] = AnimationBase.aShortArray1391[var9];
        this.aShortArray1395[var9] = AnimationBase.aShortArray1390[var9];
        this.aShortArray1387[var9] = AnimationBase.aShortArray1392[var9];
        this.aByteArray1393[var9] = AnimationBase.aByteArray1389[var9];
      }

    } else {
      throw new RuntimeException();
    }
  }

  public static void method1595() {
    AnimationBase.aShortArray1397 = null;
    AnimationBase.aShortArray1394 = null;
    AnimationBase.aShortArray1391 = null;
    AnimationBase.aShortArray1390 = null;
    AnimationBase.aShortArray1392 = null;
    AnimationBase.aByteArray1389 = null;
  }

}
