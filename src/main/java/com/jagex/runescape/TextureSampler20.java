package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.done.AbstractTextureSampler;

public final class TextureSampler20 extends AbstractTextureSampler {

  private int anInt3147 = 4;
  private int anInt3149 = 4;


  public TextureSampler20() {
    super(1, false);
  }

  public int[] method154(int var1, byte var2 ) {
    int var3 = 39 % ((30 - var2) / 36);
      int[] var10 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int var5 = GlobalStatics_9.anInt1559 / this.anInt3149;
        int var6 = DummyClass55.anInt1427 / this.anInt3147;
        int[] var4;
        int var7;
        if ((var6 <= 0)) {
          var4 = this.method152(0, 0, 32755);
        } else {
          var7 = var1 % var6;
          var4 = this.method152(0, DummyClass55.anInt1427 * var7 / var6, 32755);
        }

        for (var7 = 0; var7 < GlobalStatics_9.anInt1559; ++var7) {
          if (var5 <= 0) {
            var10[var7] = var4[0];
          } else {
            int var8 = var7 % var5;
            var10[var7] = var4[GlobalStatics_9.anInt1559 * var8 / var5];
          }
        }
      }

      return var10;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        GlobalStatics_10.usageMode = -117;
      }

      if ((var1 == 0)) {
        this.anInt3149 = var2.readUnsignedByte();
      } else if (var1 == 1) {
        this.anInt3147 = var2.readUnsignedByte();
      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 == -1) {
        int[][] var3 = this.triChromaticImageCache
            .method1594((byte) -123, var2);
        if (this.triChromaticImageCache.aBoolean1379) {
          int var5 = GlobalStatics_9.anInt1559 / this.anInt3149;
          int var6 = DummyClass55.anInt1427 / this.anInt3147;
          int[][] var4;
          if (var6 > 0) {
            int var7 = var2 % var6;
            var4 = this.method162(var7 * DummyClass55.anInt1427 / var6, 0,
                (byte) -109);
          } else {
            var4 = this.method162(0, 0, (byte) -120);
          }

          assert var4 != null;
          int[] var17 = var4[0];
          int[] var9 = var4[2];
          int[] var10 = var3[0];
          int[] var8 = var4[1];
          int[] var11 = var3[1];
          int[] var12 = var3[2];

          for (int var13 = 0; (var13 < GlobalStatics_9.anInt1559); ++var13) {
            int var14;
            if (var5 <= 0) {
              var14 = 0;
            } else {
              int var15 = var13 % var5;
              var14 = var15 * GlobalStatics_9.anInt1559 / var5;
            }

            var10[var13] = var17[var14];
            var11[var13] = var8[var14];
            var12[var13] = var9[var14];
          }
        }

        return var3;
      } else {
        return null;
      }
  }

}
