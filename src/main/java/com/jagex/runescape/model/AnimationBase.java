package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.GlobalStatics_3;

public final class AnimationBase {

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

  public AnimationBase(byte[] var1, AnimationFrame var2) {
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

        GlobalStatics_3.aShortArray1397[var6] = (short) var9;
        short var12 = 0;
        if (var10 == 3) {
          var12 = 128;
        }

        if ((var11 & 1) == 0) {
          GlobalStatics_3.aShortArray1394[var6] = var12;
        } else {
          GlobalStatics_3.aShortArray1394[var6] = (short) var4
              .readUnsignedSmart();
        }

        if ((var11 & 2) == 0) {
          GlobalStatics_3.aShortArray1391[var6] = var12;
        } else {
          GlobalStatics_3.aShortArray1391[var6] = (short) var4
              .readUnsignedSmart();
        }

        if ((var11 & 4) == 0) {
          GlobalStatics_3.aShortArray1390[var6] = var12;
        } else {
          GlobalStatics_3.aShortArray1390[var6] = (short) var4
              .readUnsignedSmart();
        }

        GlobalStatics_3.aByteArray1389[var6] = (byte) (var11 >>> 3 & 3);
        if (var10 == 2) {
          GlobalStatics_3.aShortArray1394[var6] =
              (short) (((GlobalStatics_3.aShortArray1394[var6] & 255) << 3) + (
                  GlobalStatics_3.aShortArray1394[var6] >> 8 & 7));
          GlobalStatics_3.aShortArray1391[var6] =
              (short) (((GlobalStatics_3.aShortArray1391[var6] & 255) << 3) + (
                  GlobalStatics_3.aShortArray1391[var6] >> 8 & 7));
          GlobalStatics_3.aShortArray1390[var6] =
              (short) (((GlobalStatics_3.aShortArray1390[var6] & 255) << 3) + (
                  GlobalStatics_3.aShortArray1390[var6] >> 8 & 7));
        }

        GlobalStatics_3.aShortArray1392[var6] = -1;
        if (var10 != 1 && var10 != 2 && var10 != 3) {
          if (var10 == 5) {
            this.aBoolean1386 = true;
          } else if (var10 == 7) {
            this.aBoolean1382 = true;
          }
        } else if (var7 > var8) {
          GlobalStatics_3.aShortArray1392[var6] = (short) var7;
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
        this.aShortArray1385[var9] = GlobalStatics_3.aShortArray1397[var9];
        this.aShortArray1388[var9] = GlobalStatics_3.aShortArray1394[var9];
        this.aShortArray1396[var9] = GlobalStatics_3.aShortArray1391[var9];
        this.aShortArray1395[var9] = GlobalStatics_3.aShortArray1390[var9];
        this.aShortArray1387[var9] = GlobalStatics_3.aShortArray1392[var9];
        this.aByteArray1393[var9] = GlobalStatics_3.aByteArray1389[var9];
      }

    } else {
      throw new RuntimeException();
    }
  }

}
