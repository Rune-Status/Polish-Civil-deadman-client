package com.jagex.runescape;

import com.jagex.runescape.done.AbstractTextureSampler;

public final class TextureSampler24 extends AbstractTextureSampler {


  public TextureSampler24() {
    super(1, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int var3 = -42 / ((30 - var2) / 36);
      int[] var10 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[][] var4 = this.method162(var1, 0, (byte) -126);
        assert var4 != null;
        int[] var5 = var4[0];
        int[] var7 = var4[2];
        int[] var6 = var4[1];

        for (int var8 = 0; (var8 < GlobalStatics_9.anInt1559); ++var8) {
          var10[var8] = (var7[var8] + var5[var8] + var6[var8]) / 3;
        }
      }

      return var10;
  }

}
