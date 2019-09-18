package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler6 extends AbstractTextureSampler {

  private int anInt3043;
  private int anInt3046 = 4096;


  public TextureSampler6() {
    super(1, false);
  }

  public int[] method154(int var1, byte var2 ) {
    int var4 = -52 % ((var2 - 30) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var5 = this.method152(0, var1, 32755);

        for (int var6 = 0; var6 < GlobalStatics_9.anInt1559; ++var6) {
          int var7 = var5[var6];
          if (this.anInt3043 > var7) {
            var3[var6] = this.anInt3043;
          } else if (this.anInt3046 >= var7) {
            var3[var6] = var7;
          } else {
            var3[var6] = this.anInt3046;
          }
        }
      }

      return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var1 == 0) {
        this.anInt3043 = var2.readUnsignedShort();
      } else if (var1 != 1) {
        if (var1 == 2) {
          this.monoChromatic = var2.readUnsignedByte() == 1;
        }
      } else {
        this.anInt3046 = var2.readUnsignedShort();
      }

      if (!var3) {
        GameStringStatics.aClass94_3042 = null;
      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        GlobalStatics_9.method175(2, -7, -114, true, -24, 102, -125);
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) -119, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[][] var4 = this.method162(var2, 0, (byte) -124);
        assert var4 != null;
        int[] var6 = var4[1];
        int[] var7 = var4[2];
        int[] var5 = var4[0];
        int[] var8 = var3[0];
        int[] var9 = var3[1];
        int[] var10 = var3[2];

        for (int var11 = 0; GlobalStatics_9.anInt1559 > var11; ++var11) {
          int var13 = var6[var11];
          int var12 = var5[var11];
          int var14 = var7[var11];
          if (this.anInt3043 <= var12) {
            if (var12 > this.anInt3046) {
              var8[var11] = this.anInt3046;
            } else {
              var8[var11] = var12;
            }
          } else {
            var8[var11] = this.anInt3043;
          }

          if (this.anInt3043 > var13) {
            var9[var11] = this.anInt3043;
          } else if (var13 <= this.anInt3046) {
            var9[var11] = var13;
          } else {
            var9[var11] = this.anInt3046;
          }

          if (var14 >= this.anInt3043) {
            if (this.anInt3046 >= var14) {
              var10[var11] = var14;
            } else {
              var10[var11] = this.anInt3046;
            }
          } else {
            var10[var11] = this.anInt3043;
          }
        }
      }

      return var3;
  }

}
