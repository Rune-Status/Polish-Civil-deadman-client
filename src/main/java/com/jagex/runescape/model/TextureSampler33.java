package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler33 extends AbstractTextureSampler {

  private int anInt3047 = 4096;
  private boolean aBoolean3050 = true;

  public TextureSampler33() {
    super(1, false);
  }

  public void parseConfig(int var1, Buffer var2, boolean var3) {
    if (var1 == 0) {
      this.anInt3047 = var2.readUnsignedShort();
    } else if (var1 == 1) {
      this.aBoolean3050 = var2.readUnsignedByte() == 1;
    }
  }

  public int[][] method166(int var1, int var2) {
    int[][] var3 = this.triChromaticImageCache
        .method1594((byte) 58, var2);
    if (this.triChromaticImageCache.aBoolean1379) {
      int[] var4 = this
          .method152(0, GlobalStatics_10.anInt2487 & var2 - 1, 32755);
      int[] var5 = this.method152(0, var2, 32755);
      int[] var6 = this
          .method152(0, 1 + var2 & GlobalStatics_10.anInt2487, 32755);
      int[] var7 = var3[0];
      int[] var8 = var3[1];
      int[] var9 = var3[2];

      for (int var10 = 0; var10 < GlobalStatics_9.anInt1559; ++var10) {
        int var14 = this.anInt3047 * (-var4[var10] + var6[var10]);
        int var15 =
            this.anInt3047 * (-var5[GlobalStatics_9.anInt396 & -1 + var10]
                + var5[var10 + 1
                & GlobalStatics_9.anInt396]);
        int var17 = var14 >> 12;
        int var16 = var15 >> 12;
        int var19 = var17 * var17 >> 12;
        int var18 = var16 * var16 >> 12;
        int var20 =
            (int) (Math.sqrt((var18 + var19 + 4096) / 4096.0F) * 4096.0D);
        int var11;
        int var12;
        int var13;
        if (var20 == 0) {
          var13 = 0;
          var11 = 0;
          var12 = 0;
        } else {
          var13 = 16777216 / var20;
          var12 = var14 / var20;
          var11 = var15 / var20;
        }

        if (this.aBoolean3050) {
          var12 = 2048 + (var12 >> 1);
          var13 = (var13 >> 1) + 2048;
          var11 = (var11 >> 1) + 2048;
        }

        var7[var10] = var11;
        var8[var10] = var12;
        var9[var10] = var13;
      }
    }

    if (var1 != -1) {
      GlobalStatics_10.method180(-55, -63, -5);
    }

    return var3;
  }

}
