package com.jagex.runescape;

public final class TextureSampler18 extends TextureSampler39 {

  public int[][] method166(int var1, int var2 ) {
    int[][] var3 = this.triChromaticImageCache
          .method1594((byte) -119, var2);
      if (this.triChromaticImageCache.aBoolean1379 && this.method279(-128)) {
        int[] var4 = var3[0];
        int var7 = var2 % this.anInt3283 * this.anInt3283;
        int[] var5 = var3[1];
        int[] var6 = var3[2];

        for (int var8 = 0; GlobalStatics_9.anInt1559 > var8; ++var8) {
          int var9 = this.anIntArray3284[var7 + var8 % this.anInt3280];
          var6[var8] = (255 & var9) << 4;
          var5[var8] = var9 >> 4 & 4080;
          var4[var8] = (16711680 & var9) >> 12;
        }
      }

      if (var1 != -1) {
        GlobalStatics_10.anInt4039 = -119;
      }

      return var3;
  }

}
