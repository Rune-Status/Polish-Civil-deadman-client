package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler22 extends AbstractTextureSampler {


  public TextureSampler22() {
    super(1, false);
  }

  public int[] method154(int var1, byte var2 ) {
    int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var4 = this.method152(0, var1, 32755);

        for (int var5 = 0; var5 < GlobalStatics_9.anInt1559; ++var5) {
          var3[var5] = 4096 - var4[var5];
        }
      }

      int var7 = 59 % ((30 - var2) / 36);
      return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var3) {
        if (var1 == 0) {
          this.monoChromatic = var2.readUnsignedByte() == 1;
        }

      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 == -1) {
        int[][] var3 = this.triChromaticImageCache
            .method1594((byte) -128, var2);
        if (this.triChromaticImageCache.aBoolean1379) {
          int[][] var4 = this.method162(var2, 0, (byte) -51);
          assert var4 != null;
          int[] var7 = var4[2];
          int[] var5 = var4[0];
          int[] var6 = var4[1];
          int[] var8 = var3[0];
          int[] var9 = var3[1];
          int[] var10 = var3[2];

          for (int var11 = 0; GlobalStatics_9.anInt1559 > var11; ++var11) {
            var8[var11] = -var5[var11] + 4096;
            var9[var11] = 4096 - var6[var11];
            var10[var11] = 4096 - var7[var11];
          }
        }

        return var3;
      } else {
        return null;
      }
  }

}
