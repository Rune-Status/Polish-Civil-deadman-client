package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler21 extends AbstractTextureSampler {

  public TextureSampler21() {
    super(3, false);
  }

  public int[] method154(int var1, byte var2) {
    int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
    int var4 = 51 / ((30 - var2) / 36);
    if (this.monoChromaticImageCache.aBoolean1580) {
      int[] var5 = this.method152(0, var1, 32755);
      int[] var6 = this.method152(1, var1, 32755);
      int[] var7 = this.method152(2, var1, 32755);

      for (int var8 = 0; GlobalStatics_9.anInt1559 > var8; ++var8) {
        int var9 = var7[var8];
        if (var9 == 4096) {
          var3[var8] = var5[var8];
        } else if (var9 != 0) {
          var3[var8] = var9 * var5[var8] + (-var9 + 4096) * var6[var8] >> 12;
        } else {
          var3[var8] = var6[var8];
        }
      }
    }

    return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3) {
    if (var1 == 0) {
      this.monoChromatic = var2.readUnsignedByte() == 1;
    }

    if (!var3) {
      this.parseConfig(118, null, true);
    }
  }

  public int[][] method166(int var1, int var2) {
    if (var1 != -1) {
      GlobalStatics_10.anInt3069 = 67;
    }

    int[][] var3 = this.triChromaticImageCache.method1594((byte) 7, var2);
    if (this.triChromaticImageCache.aBoolean1379) {
      int[] var4 = this.method152(2, var2, 32755);
      int[][] var5 = this.method162(var2, 0, (byte) -119);
      int[][] var6 = this.method162(var2, 1, (byte) -107);
      int[] var9 = var3[2];
      int[] var8 = var3[1];
      assert var5 != null;
      int[] var10 = var5[0];
      int[] var11 = var5[1];
      int[] var7 = var3[0];
      assert var6 != null;
      int[] var13 = var6[0];
      int[] var12 = var5[2];
      int[] var15 = var6[2];
      int[] var14 = var6[1];

      for (int var16 = 0; GlobalStatics_9.anInt1559 > var16; ++var16) {
        int var17 = var4[var16];
        if (var17 == 4096) {
          var7[var16] = var10[var16];
          var8[var16] = var11[var16];
          var9[var16] = var12[var16];
        } else {
          if (var17 == 0) {
            var7[var16] = var13[var16];
            var8[var16] = var14[var16];
            var9[var16] = var15[var16];
          } else {
            int var18 = -var17 + 4096;
            var7[var16] = var18 * var13[var16] + var17 * var10[var16] >> 12;
            var8[var16] = var18 * var14[var16] + var11[var16] * var17 >> 12;
            var9[var16] = var15[var16] * var18 + var12[var16] * var17 >> 12;
          }
        }
      }
    }

    return var3;
  }

}
