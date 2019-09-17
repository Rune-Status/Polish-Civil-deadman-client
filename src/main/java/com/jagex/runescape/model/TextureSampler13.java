package com.jagex.runescape.model;

import com.jagex.runescape.statics.DummyClass4;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler13 extends AbstractTextureSampler {


  public TextureSampler13() {
    super(0, true);
  }

  private int method314(int var1, int var2, int var3) {
    if (var2 != 7001) {
        this.method314(-83, 92, 48);
      }

      int var4 = var3 + 57 * var1;
      var4 ^= var4 << 1;
      return 4096 - (var4 * (var4 * var4 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE)
        / 262144;
  }

  public int[] method154(int var1, byte var2 ) {
    int var4 = 104 % ((30 - var2) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int var5 = DummyClass4.anIntArray2999[var1];

        for (int var6 = 0; var6 < GlobalStatics_9.anInt1559; ++var6) {
          var3[var6] =
              this.method314(var5, 7001, GlobalStatics_9.anIntArray2125[var6]) % 4096;
        }
      }

      return var3;
  }

}
