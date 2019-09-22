package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler19 extends AbstractTextureSampler {

  private int anInt3217 = 0x8000;

  public TextureSampler19() {
    super(3, false);
  }

  public int[] method154(int var1, byte var2) {
    int var3 = -89 / ((30 - var2) / 36);
    int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
    if (this.monoChromaticImageCache.aBoolean1580) {
      int[] var5 = this.method152(1, var1, 32755);
      int[] var6 = this.method152(2, var1, 32755);

      for (int var7 = 0; var7 < GlobalStatics_9.anInt1559; ++var7) {
        int var9 = this.anInt3217 * var6[var7] >> 12;
        int var8 = (var5[var7] & 4087) >> 4;
        int var10 = GlobalStatics_9.anIntArray2639[var8] * var9 >> 12;
        int var11 = GlobalStatics_10.anIntArray3212[var8] * var9 >> 12;
        int var12 = GlobalStatics_9.anInt396 & (var10 >> 12) + var7;
        int var13 = GlobalStatics_10.anInt2487 & (var11 >> 12) + var1;
        int[] var14 = this.method152(0, var13, 32755);
        var4[var7] = var14[var12];
      }
    }

    return var4;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3) {
    if (var1 == 0) {
      this.anInt3217 = var2.readUnsignedShort() << 4;
    } else {
      if (var1 == 1) {
        this.monoChromatic = var2.readUnsignedByte() == 1;
      }
    }
  }

  public void method158(int var1) {
    if (var1 != 16251) {
      GlobalStatics_10.method255(33, 78, 124);
    }

    GlobalStatics_10.method844((byte) -9);
  }

  public int[][] method166(int var1, int var2) {
    if (var1 != -1) {
      GlobalStatics_10.spotAnimations = null;
    }

    int[][] var3 = this.triChromaticImageCache.method1594((byte) 4, var2);
    if (this.triChromaticImageCache.aBoolean1379) {
      int[] var4 = this.method152(1, var2, 32755);
      int[] var5 = this.method152(2, var2, 32755);
      int[] var8 = var3[2];
      int[] var7 = var3[1];
      int[] var6 = var3[0];

      for (int var9 = 0; GlobalStatics_9.anInt1559 > var9; ++var9) {
        int var10 = (var4[var9] * 255 & 1046259) >> 12;
        int var11 = var5[var9] * this.anInt3217 >> 12;
        int var12 = var11 * GlobalStatics_9.anIntArray2639[var10] >> 12;
        int var13 = GlobalStatics_10.anIntArray3212[var10] * var11 >> 12;
        int var14 = (var12 >> 12) + var9 & GlobalStatics_9.anInt396;
        int var15 = GlobalStatics_10.anInt2487 & var2 + (var13 >> 12);
        int[][] var16 = this.method162(var15, 0, (byte) -117);
        assert var16 != null;
        var6[var9] = var16[0][var14];
        var7[var9] = var16[1][var14];
        var8[var9] = var16[2][var14];
      }
    }

    return var3;
  }

}
