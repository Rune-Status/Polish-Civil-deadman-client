package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.DummyClass4;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler14 extends AbstractTextureSampler {

  private int anInt3385 = 585;


  public TextureSampler14() {
    super(0, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int var4 = -76 / ((var2 - 30) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int var5 = DummyClass4.anIntArray2999[var1];

        for (int var6 = 0; GlobalStatics_9.anInt1559 > var6; ++var6) {
          int var7 = GlobalStatics_9.anIntArray2125[var6];
          int var8;
          if (var7 > this.anInt3385 && 4096 - this.anInt3385 > var7
            && ((2048 - this.anInt3385) < var5) && (var5 < (this.anInt3385 + 2048))) {
            var8 = 2048 - var7;
            var8 = var8 < 0 ? -var8 : var8;
            var8 <<= 12;
            var8 /= -this.anInt3385 + 2048;
            var3[var6] = -var8 + 4096;
          } else if (var7 > (-this.anInt3385 + 2048) && var7 < this.anInt3385
              + 2048) {
            var8 = var5 - 2048;
            var8 = (var8 >= 0) ? var8 : -var8;
            var8 -= this.anInt3385;
            var8 <<= 12;
            var3[var6] = var8 / (-this.anInt3385 + 2048);
          } else if (
              (var5 >= this.anInt3385) && ((4096 - this.anInt3385) >= var5)) {
            if (this.anInt3385 <= var7 && var7 <= 4096 - this.anInt3385) {
              var3[var6] = 0;
            } else {
              var8 = -var5 + 2048;
              var8 = (var8 < 0) ? -var8 : var8;
              var8 <<= 12;
              var8 /= 2048 - this.anInt3385;
              var3[var6] = -var8 + 4096;
            }
          } else {
            var8 = var7 - 2048;
            var8 = var8 < 0 ? -var8 : var8;
            var8 -= this.anInt3385;
            var8 <<= 12;
            var3[var6] = var8 / (-this.anInt3385 + 2048);
          }
        }
      }

      return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        GlobalStatics_10.anInt3389 = 99;
      }

      if ((var1 == 0)) {
        this.anInt3385 = var2.readUnsignedShort();
      }
  }

}
