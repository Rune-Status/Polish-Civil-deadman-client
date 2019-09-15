package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler35 extends AbstractTextureSampler {

  private int anInt3322 = 4096;


  public TextureSampler35() {
    super(1, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int var3 = 42 / ((30 - var2) / 36);
      int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var5 = this
            .method152(0, var1 - 1 & GlobalStatics_10.anInt2487, 32755);
        int[] var6 = this.method152(0, var1, 32755);
        int[] var7 = this
            .method152(0, GlobalStatics_10.anInt2487 & var1 + 1, 32755);

        for (int var8 = 0; GlobalStatics_9.anInt1559 > var8; ++var8) {
          int var9 = (var7[var8] - var5[var8]) * this.anInt3322;
          int var10 = this.anInt3322 * (-var6[var8 - 1 & GlobalStatics_9.anInt396] + var6[
            GlobalStatics_9.anInt396 & var8 + 1]);
          int var11 = var10 >> 12;
          int var12 = var9 >> 12;
          int var13 = var11 * var11 >> 12;
          int var14 = var12 * var12 >> 12;
          int var15 =
            (int) (Math.sqrt((4096 + var14 + var13) / 4096.0F) * 4096.0D);
          int var16 = var15 != 0 ? 16777216 / var15 : 0;
          var4[var8] = 4096 - var16;
        }
      }

      return var4;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        GlobalStatics_10.method294((byte) -57);
      }

      if (var1 == 0) {
        this.anInt3322 = var2.readUnsignedShort();
      }
  }

}
