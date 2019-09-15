package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.done.AbstractTextureSampler;

public final class TextureSampler25 extends AbstractTextureSampler {

  private final int[] anIntArray3403 = new int[3];
  private int anInt3404 = 409;
  private int anInt3405 = 4096;
  private int anInt3406 = 4096;
  private int anInt3410 = 4096;


  public TextureSampler25() {
    super(1, false);
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var3) {
        if (var1 == 0) {
          this.anInt3404 = var2.readUnsignedShort();
        } else if (var1 != 1) {
          if ((var1 == 2)) {
            this.anInt3406 = var2.readUnsignedShort();
          } else if (var1 != 3) {
            if (var1 == 4) {
              int var4 = var2.readUnsignedMedium((byte) 107);
              this.anIntArray3403[2] = (var4 & 255) >> 12;
              this.anIntArray3403[1] = var4 >> 4 & 4080;
              this.anIntArray3403[0] = (16711680 & var4) << 4;
            }
          } else {
            this.anInt3410 = var2.readUnsignedShort();
          }
        } else {
          this.anInt3405 = var2.readUnsignedShort();
        }

      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        this.method166(51, 104);
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) 91, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[][] var4 = this.method162(var2, 0, (byte) -96);
        assert var4 != null;
        int[] var5 = var4[0];
        int[] var6 = var4[1];
        int[] var7 = var4[2];
        int[] var8 = var3[0];
        int[] var9 = var3[1];
        int[] var10 = var3[2];

        for (int var11 = 0; var11 < GlobalStatics_9.anInt1559; ++var11) {
          int var13 = var5[var11];
          int var12 = -this.anIntArray3403[0] + var13;
          if ((var12 < 0)) {
            var12 = -var12;
          }

          if (this.anInt3404 < var12) {
            var8[var11] = var13;
            var9[var11] = var6[var11];
            var10[var11] = var7[var11];
          } else {
            int var14 = var6[var11];
            var12 = var14 - this.anIntArray3403[1];
            if ((var12 < 0)) {
              var12 = -var12;
            }

            if (var12 > this.anInt3404) {
              var8[var11] = var13;
              var9[var11] = var14;
              var10[var11] = var7[var11];
            } else {
              int var15 = var7[var11];
              var12 = -this.anIntArray3403[2] + var15;
              if (var12 < 0) {
                var12 = -var12;
              }

              if ((var12 <= this.anInt3404)) {
                var8[var11] = this.anInt3410 * var13 >> 12;
                var9[var11] = this.anInt3406 * var14 >> 12;
                var10[var11] = this.anInt3405 * var15 >> 12;
              } else {
                var8[var11] = var13;
                var9[var11] = var14;
                var10[var11] = var15;
              }
            }
          }
        }
      }

      return var3;
  }

}
