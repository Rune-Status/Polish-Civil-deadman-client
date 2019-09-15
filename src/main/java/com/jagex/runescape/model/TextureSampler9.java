package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler9 extends AbstractTextureSampler {

  private boolean aBoolean3100 = true;
  private boolean aBoolean3104 = true;


  public TextureSampler9() {
    super(1, false);
  }

  public int[] method154(int var1, byte var2 ) {
    int var3 = -34 / ((var2 - 30) / 36);
      int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var5 =
            this.method152(0, !this.aBoolean3104
                  ? var1 : GlobalStatics_10.anInt2487 - var1,
            32755);
        if (this.aBoolean3100) {
          for (int var6 = 0; var6 < GlobalStatics_9.anInt1559; ++var6) {
            var4[var6] = var5[-var6 + GlobalStatics_9.anInt396];
          }
        } else {
          ArrayUtils.method1358(var5, 0, var4, 0, GlobalStatics_9.anInt1559);
        }
      }

      return var4;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        GlobalStatics_9.method207(18, false, -19, 102L);
      }

      if ((var1 == 0)) {
        this.aBoolean3100 = (var2.readUnsignedByte() == 1);
      } else if ((var1 == 1)) {
        this.aBoolean3104 = var2.readUnsignedByte() == 1;
      } else if ((var1 == 2)) {
        this.monoChromatic = (var2.readUnsignedByte() == 1);
      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        GlobalStatics_9.method207(-98, true, 95, 79L);
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) 54, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[][] var4 =
            this.method162(!this.aBoolean3104 ? var2 : -var2 + GlobalStatics_10.anInt2487, 0,
            (byte) -105);
        assert var4 != null;
        int[] var5 = var4[0];
        int[] var7 = var4[2];
        int[] var6 = var4[1];
        int[] var9 = var3[1];
        int[] var10 = var3[2];
        int[] var8 = var3[0];
        int var11;
        if (this.aBoolean3100) {
          for (var11 = 0; GlobalStatics_9.anInt1559 > var11; ++var11) {
            var8[var11] = var5[GlobalStatics_9.anInt396 - var11];
            var9[var11] = var6[-var11 + GlobalStatics_9.anInt396];
            var10[var11] = var7[GlobalStatics_9.anInt396 - var11];
          }
        } else {
          for (var11 = 0; GlobalStatics_9.anInt1559 > var11; ++var11) {
            var8[var11] = var5[var11];
            var9[var11] = var6[var11];
            var10[var11] = var7[var11];
          }
        }
      }

      return var3;
  }

}
