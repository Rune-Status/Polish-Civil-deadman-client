package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.done.AbstractTextureSampler;

public final class TextureSampler30 extends AbstractTextureSampler {

  private int anInt3126 = 2048;
  private int anInt3127 = 3072;
  private int anInt3128 = 1024;

  public TextureSampler30() {
    super(1, false);
  }

  public int[] method154(int var1, byte var2 ) {
    int var3 = 71 / ((var2 - 30) / 36);
      int[] var7 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var4 = this.method152(0, var1, 32755);

        for (int var5 = 0; var5 < GlobalStatics_9.anInt1559; ++var5) {
          var7[var5] = this.anInt3128 + (var4[var5] * this.anInt3126 >> 12);
        }
      }

      return var7;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var1 == 0) {
        this.anInt3128 = var2.readUnsignedShort();
      } else {
        if (var1 == 1) {
          this.anInt3127 = var2.readUnsignedShort();
        } else if ((var1 == 2)) {
          this.monoChromatic = var2.readUnsignedByte() == 1;
        }
      }

      if (!var3) {
        this.parseConfig(56, null, true);
      }
  }

  public void method158(int var1 ) {
    if (var1 == 16251) {
        this.anInt3126 = this.anInt3127 - this.anInt3128;
      }
  }

  public int[][] method166(int var1, int var2 ) {
    int[][] var3 = this.triChromaticImageCache
          .method1594((byte) -118, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[][] var4 = this.method162(var2, 0, (byte) -50);
        assert var4 != null;
        int[] var6 = var4[1];
        int[] var7 = var4[2];
        int[] var5 = var4[0];
        int[] var8 = var3[0];
        int[] var9 = var3[1];
        int[] var10 = var3[2];

        for (int var11 = 0; (var11 < GlobalStatics_9.anInt1559); ++var11) {
          var8[var11] = this.anInt3128 + (this.anInt3126 * var5[var11] >> 12);
          var9[var11] = (this.anInt3126 * var6[var11] >> 12) + this.anInt3128;
          var10[var11] = this.anInt3128 + (this.anInt3126 * var7[var11] >> 12);
        }
      }

      if (var1 != -1) {
        GlobalStatics_10.method211(51);
      }

      return var3;
  }

}
