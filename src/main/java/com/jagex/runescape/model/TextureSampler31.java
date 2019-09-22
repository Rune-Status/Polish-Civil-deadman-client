package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.statics.DummyClass4;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler31 extends AbstractTextureSampler {

  private int anInt3160;
  private int anInt3163 = 20;
  private int anInt3164 = 1365;
  private int anInt3165;

  public TextureSampler31() {
    super(0, true);
  }

  public int[] method154(int var1, byte var2) {
    int var4 = -72 % ((30 - var2) / 36);
    int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
    if (this.monoChromaticImageCache.aBoolean1580) {
      for (int var5 = 0; GlobalStatics_9.anInt1559 > var5; ++var5) {
        int var7 = this.anInt3165
            + (DummyClass4.anIntArray2999[var1] << 12) / this.anInt3164;
        int var6 = this.anInt3160
            + (GlobalStatics_9.anIntArray2125[var5] << 12) / this.anInt3164;
        int var8 = var6;
        int var10 = var6;
        int var9 = var7;
        int var11 = var7;
        int var14 = 0;
        int var12 = var6 * var6 >> 12;

        for (int var13 = var7 * var7 >> 12;
            var12 + var13 < 16384 && this.anInt3163 > var14;
            var12 = var10 * var10 >> 12) {
          var11 = (var10 * var11 >> 12) * 2 + var9;
          ++var14;
          var10 = var12 - var13 + var8;
          var13 = var11 * var11 >> 12;
        }

        var3[var5] = var14 >= this.anInt3163
            - 1 ? 0 : (var14 << 12) / this.anInt3163;
      }
    }

    return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3) {
    if (!var3) {
      GameStringStatics.aClass94_3168 = null;
    }

    if (var1 == 0) {
      this.anInt3164 = var2.readUnsignedShort();
    } else {
      if (var1 == 1) {
        this.anInt3163 = var2.readUnsignedShort();
      } else {
        if (var1 == 2) {
          this.anInt3160 = var2.readUnsignedShort();
        } else {
          if (var1 == 3) {
            this.anInt3165 = var2.readUnsignedShort();
          }
        }
      }
    }
  }

}
