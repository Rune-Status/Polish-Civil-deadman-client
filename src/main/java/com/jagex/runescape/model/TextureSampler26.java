package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler26 extends AbstractTextureSampler {

  private int anInt3073;
  private int anInt3074 = 4096;


  public TextureSampler26() {
    super(1, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int var3 = 69 / ((var2 - 30) / 36);
      int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var5 = this.method152(0, var1, 32755);

        for (int var6 = 0; var6 < GlobalStatics_9.anInt1559; ++var6) {
          int var7 = var5[var6];
          var4[var6] = this.anInt3073 <= var7 && var7 <= this.anInt3074 ? 4096 : 0;
        }
      }

      return var4;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        GlobalStatics_10.method196(true);
      }

      if (var1 == 0) {
        this.anInt3073 = var2.readUnsignedShort();
      } else {
        if (var1 == 1) {
          this.anInt3074 = var2.readUnsignedShort();
        }
      }
  }

}
