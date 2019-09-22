package com.jagex.runescape.sound;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.node.Node;

public final class MidiInstrument extends Node {

  private int anInt2389;
  private int anInt2390;
  private float[] aFloatArray2394;
  private boolean aBoolean2395;
  private int anInt2397;
  private int anInt2401;
  private int anInt2408;
  private byte[][] aByteArrayArray2410;
  private boolean aBoolean2411;
  private int anInt2412;
  private byte[] aByteArray2415;
  private int anInt2418;
  private int anInt2419;

  public MidiInstrument(byte[] var1) {
    this.method360(var1);
  }

  public SomethingMusic0 method359(int[] var1) {
    if (var1 != null && var1[0] <= 0) {
      return null;
    } else {
      if (this.aByteArray2415 == null) {
        this.anInt2389 = 0;
        this.aFloatArray2394 = new float[MidiInstrumentStatics.anInt2396];
        this.aByteArray2415 = new byte[this.anInt2390];
        this.anInt2419 = 0;
        this.anInt2418 = 0;
      }

      for (; this.anInt2418 < this.aByteArrayArray2410.length;
          ++this.anInt2418) {
        if (var1 != null && var1[0] <= 0) {
          return null;
        }

        float[] var2 = this.method366(this.anInt2418);
        if (var2 != null) {
          int var3 = this.anInt2419;
          int var4 = var2.length;
          if (var4 > this.anInt2390 - var3) {
            var4 = this.anInt2390 - var3;
          }

          for (int var5 = 0; var5 < var4; ++var5) {
            int var6 = (int) (128.0F + var2[var5] * 128.0F);
            if ((var6 & 0xffffff00) != 0) {
              var6 = ~var6 >> 31;
            }

            this.aByteArray2415[var3++] = (byte) (var6 - 128);
          }

          if (var1 != null) {
            var1[0] -= var3 - this.anInt2419;
          }

          this.anInt2419 = var3;
        }
      }

      this.aFloatArray2394 = null;
      byte[] var7 = this.aByteArray2415;
      this.aByteArray2415 = null;
      return new SomethingMusic0(this.anInt2408, var7, this.anInt2397,
          this.anInt2401,
          this.aBoolean2395);
    }
  }

  private void method360(byte[] var1) {
    Buffer var2 = new Buffer(var1);
    this.anInt2408 = var2.readInt();
    this.anInt2390 = var2.readInt();
    this.anInt2397 = var2.readInt();
    this.anInt2401 = var2.readInt();
    if (this.anInt2401 < 0) {
      this.anInt2401 = ~this.anInt2401;
      this.aBoolean2395 = true;
    }

    int var3 = var2.readInt();
    this.aByteArrayArray2410 = new byte[var3][];

    for (int var4 = 0; var4 < var3; ++var4) {
      int var5 = 0;

      int var6;
      do {
        var6 = var2.readUnsignedByte();
        var5 += var6;
      } while (var6 >= 255);

      byte[] var7 = new byte[var5];
      var2.copy(0, var5, var7);
      this.aByteArrayArray2410[var4] = var7;
    }

  }

  private float[] method366(int var1) {
    MidiInstrumentStatics.setSomething(this.aByteArrayArray2410[var1], 0);
    MidiInstrumentStatics.method364();
    int var2 = SomethingMidiInstrumentStatics
        .method368(MidiInstrumentStatics.method513(
            MidiInstrumentStatics.anIntArray2420.length - 1, 4));
    boolean var3 = MidiInstrumentStatics.aBooleanArray2393[var2];
    int var4 = var3 ? MidiInstrumentStatics.anInt2396
        : MidiInstrumentStatics.anInt2402;
    boolean var5 = false;
    boolean var6 = false;
    if (var3) {
      var5 = MidiInstrumentStatics.method364() != 0;
      var6 = MidiInstrumentStatics.method364() != 0;
    }

    int var7 = var4 >> 1;
    int var8;
    int var9;
    int var10;
    if (var3 && !var5) {
      var8 = (var4 >> 2) - (MidiInstrumentStatics.anInt2402 >> 2);
      var9 = (var4 >> 2) + (MidiInstrumentStatics.anInt2402 >> 2);
      var10 = MidiInstrumentStatics.anInt2402 >> 1;
    } else {
      var8 = 0;
      var9 = var7;
      var10 = var4 >> 1;
    }

    int var11;
    int var12;
    int var13;
    if (var3 && !var6) {
      var11 = var4 - (var4 >> 2) - (MidiInstrumentStatics.anInt2402 >> 2);
      var12 = var4 - (var4 >> 2) + (MidiInstrumentStatics.anInt2402 >> 2);
      var13 = MidiInstrumentStatics.anInt2402 >> 1;
    } else {
      var11 = var7;
      var12 = var4;
      var13 = var4 >> 1;
    }

    SomethingMidiOther var14 = MidiInstrumentStatics.aClass150Array2398[MidiInstrumentStatics.anIntArray2420[var2]];
    int var16 = var14.anInt1928;
    int var17 = var14.anIntArray1929[var16];
    boolean var15 = !MidiInstrumentStatics.aClass59Array2407[var17]
        .method1205();
    boolean var40 = var15;

    for (var17 = 0; var17 < var14.anInt1931; ++var17) {
      SomethingMidik var18 = MidiInstrumentStatics.aClass152Array2392[var14.anIntArray1930[var17]];
      float[] var19 = MidiInstrumentStatics.aFloatArray2403;
      var18.method2112(var19, var4 >> 1, var40);
    }

    int var44;
    if (!var15) {
      var17 = var14.anInt1928;
      var44 = var14.anIntArray1929[var17];
      MidiInstrumentStatics.aClass59Array2407[var44].method1202(
          MidiInstrumentStatics.aFloatArray2403, var4 >> 1);
    }

    int var41;
    if (var15) {
      for (var17 = var4 >> 1; var17 < var4; ++var17) {
        MidiInstrumentStatics.aFloatArray2403[var17] = 0.0F;
      }
    } else {
      var17 = var4 >> 1;
      var44 = var4 >> 2;
      var41 = var4 >> 3;
      float[] var20 = MidiInstrumentStatics.aFloatArray2403;

      int var21;
      for (var21 = 0; var21 < var17; ++var21) {
        var20[var21] *= 0.5F;
      }

      for (var21 = var17; var21 < var4; ++var21) {
        var20[var21] = -var20[var4 - var21 - 1];
      }

      float[] var46 = var3 ? MidiInstrumentStatics.aFloatArray2399
          : MidiInstrumentStatics.aFloatArray2400;
      float[] var22 = var3 ? MidiInstrumentStatics.aFloatArray2387
          : MidiInstrumentStatics.aFloatArray2413;
      float[] var23 = var3 ? MidiInstrumentStatics.aFloatArray2388
          : MidiInstrumentStatics.aFloatArray2416;
      int[] var24 = var3 ? MidiInstrumentStatics.anIntArray2409
          : MidiInstrumentStatics.anIntArray2391;

      int var25;
      float var27;
      float var26;
      float var29;
      float var28;
      for (var25 = 0; var25 < var44; ++var25) {
        var26 = var20[4 * var25] - var20[var4 - 4 * var25 - 1];
        var27 = var20[4 * var25 + 2] - var20[var4 - 4 * var25 - 3];
        var28 = var46[2 * var25];
        var29 = var46[2 * var25 + 1];
        var20[var4 - 4 * var25 - 1] = var26 * var28 - var27 * var29;
        var20[var4 - 4 * var25 - 3] = var26 * var29 + var27 * var28;
      }

      float var31;
      float var30;
      for (var25 = 0; var25 < var41; ++var25) {
        var26 = var20[var17 + 3 + 4 * var25];
        var27 = var20[var17 + 1 + 4 * var25];
        var28 = var20[4 * var25 + 3];
        var29 = var20[4 * var25 + 1];
        var20[var17 + 3 + 4 * var25] = var26 + var28;
        var20[var17 + 1 + 4 * var25] = var27 + var29;
        var30 = var46[var17 - 4 - 4 * var25];
        var31 = var46[var17 - 3 - 4 * var25];
        var20[4 * var25 + 3] =
            (var26 - var28) * var30 - (var27 - var29) * var31;
        var20[4 * var25 + 1] =
            (var27 - var29) * var30 + (var26 - var28) * var31;
      }

      var25 = MidiInstrumentStatics.method513(var4 - 1, 4);

      int var47;
      int var49;
      int var48;
      int var52;
      for (var49 = 0; var49 < var25 - 3; ++var49) {
        var47 = var4 >> var49 + 2;
        var48 = 8 << var49;

        for (var52 = 0; var52 < 2 << var49; ++var52) {
          int var50 = var4 - var47 * 2 * var52;
          int var51 = var4 - var47 * (2 * var52 + 1);

          for (int var32 = 0; var32 < var4 >> var49 + 4; ++var32) {
            int var33 = 4 * var32;
            float var34 = var20[var50 - 1 - var33];
            float var35 = var20[var50 - 3 - var33];
            float var36 = var20[var51 - 1 - var33];
            float var37 = var20[var51 - 3 - var33];
            var20[var50 - 1 - var33] = var34 + var36;
            var20[var50 - 3 - var33] = var35 + var37;
            float var38 = var46[var32 * var48];
            float var39 = var46[var32 * var48 + 1];
            var20[var51 - 1 - var33] =
                (var34 - var36) * var38 - (var35 - var37) * var39;
            var20[var51 - 3 - var33] =
                (var35 - var37) * var38 + (var34 - var36) * var39;
          }
        }
      }

      for (var49 = 1; var49 < var41 - 1; ++var49) {
        var47 = var24[var49];
        if (var49 < var47) {
          var48 = 8 * var49;
          var52 = 8 * var47;
          var30 = var20[var48 + 1];
          var20[var48 + 1] = var20[var52 + 1];
          var20[var52 + 1] = var30;
          var30 = var20[var48 + 3];
          var20[var48 + 3] = var20[var52 + 3];
          var20[var52 + 3] = var30;
          var30 = var20[var48 + 5];
          var20[var48 + 5] = var20[var52 + 5];
          var20[var52 + 5] = var30;
          var30 = var20[var48 + 7];
          var20[var48 + 7] = var20[var52 + 7];
          var20[var52 + 7] = var30;
        }
      }

      for (var49 = 0; var49 < var17; ++var49) {
        var20[var49] = var20[2 * var49 + 1];
      }

      for (var49 = 0; var49 < var41; ++var49) {
        var20[var4 - 1 - 2 * var49] = var20[4 * var49];
        var20[var4 - 2 - 2 * var49] = var20[4 * var49 + 1];
        var20[var4 - var44 - 1 - 2 * var49] = var20[4 * var49 + 2];
        var20[var4 - var44 - 2 - 2 * var49] = var20[4 * var49 + 3];
      }

      for (var49 = 0; var49 < var41; ++var49) {
        var27 = var23[2 * var49];
        var28 = var23[2 * var49 + 1];
        var29 = var20[var17 + 2 * var49];
        var30 = var20[var17 + 2 * var49 + 1];
        var31 = var20[var4 - 2 - 2 * var49];
        float var54 = var20[var4 - 1 - 2 * var49];
        float var53 = var28 * (var29 - var31) + var27 * (var30 + var54);
        var20[var17 + 2 * var49] = (var29 + var31 + var53) * 0.5F;
        var20[var4 - 2 - 2 * var49] = (var29 + var31 - var53) * 0.5F;
        var53 = var28 * (var30 + var54) - var27 * (var29 - var31);
        var20[var17 + 2 * var49 + 1] = (var30 - var54 + var53) * 0.5F;
        var20[var4 - 1 - 2 * var49] = (-var30 + var54 + var53) * 0.5F;
      }

      for (var49 = 0; var49 < var44; ++var49) {
        var20[var49] =
            var20[2 * var49 + var17] * var22[2 * var49]
                + var20[2 * var49 + 1 + var17] * var22[
                2 * var49 + 1];
        var20[var17 - 1 - var49] =
            var20[2 * var49 + var17] * var22[2 * var49 + 1]
                - var20[2 * var49 + 1 + var17] * var22[2
                * var49];
      }

      for (var49 = 0; var49 < var44; ++var49) {
        var20[var4 - var44 + var49] = -var20[var49];
      }

      for (var49 = 0; var49 < var44; ++var49) {
        var20[var49] = var20[var44 + var49];
      }

      for (var49 = 0; var49 < var44; ++var49) {
        var20[var44 + var49] = -var20[var44 - var49 - 1];
      }

      for (var49 = 0; var49 < var44; ++var49) {
        var20[var17 + var49] = var20[var4 - var49 - 1];
      }

      for (var49 = var8; var49 < var9; ++var49) {
        var27 = (float) Math.sin(
            ((var49 - var8) + 0.5D) / var10 * 0.5D * 3.141592653589793D);
        MidiInstrumentStatics.aFloatArray2403[var49] *=
            (float) Math.sin(1.5707963267948966D * var27 * var27);
      }

      for (var49 = var11; var49 < var12; ++var49) {
        var27 = (float) Math.sin(
            ((var49 - var11) + 0.5D) / var13 * 0.5D * 3.141592653589793D
                + 1.5707963267948966D);
        MidiInstrumentStatics.aFloatArray2403[var49] *=
            (float) Math.sin(1.5707963267948966D * var27 * var27);
      }
    }

    float[] var42 = null;
    if (this.anInt2389 > 0) {
      var44 = this.anInt2389 + var4 >> 2;
      var42 = new float[var44];
      int var45;
      if (!this.aBoolean2411) {
        for (var41 = 0; var41 < this.anInt2412; ++var41) {
          var45 = (this.anInt2389 >> 1) + var41;
          var42[var41] += this.aFloatArray2394[var45];
        }
      }

      if (!var15) {
        for (var41 = var8; var41 < var4 >> 1; ++var41) {
          var45 = var42.length - (var4 >> 1) + var41;
          var42[var45] += MidiInstrumentStatics.aFloatArray2403[var41];
        }
      }
    }

    float[] var43 = this.aFloatArray2394;
    this.aFloatArray2394 = MidiInstrumentStatics.aFloatArray2403;
    MidiInstrumentStatics.aFloatArray2403 = var43;
    this.anInt2389 = var4;
    this.anInt2412 = var12 - (var4 >> 1);
    this.aBoolean2411 = var15;
    return var42;
  }

}
