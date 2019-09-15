package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.done.AbstractTextureSampler;

public final class TextureSampler1 extends AbstractTextureSampler {

  private int anInt3129;
  private int anInt3134;
  private int anInt3135;


  private TextureSampler1(int var1) {
    super(0, false);

    this.method218((byte) 75, var1);
  }

  public TextureSampler1() {
    this(0);
  }

  private void method218(byte var1, int var2) {
    this.anInt3134 = 4080 & var2 >> 4;
      this.anInt3135 = var2 << 4 & 4080;
      if (var1 == 75) {
        this.anInt3129 = (var2 & 16711680) >> 12;
      }
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        GlobalStatics_9.method221(-64, null, null, null, 34);
      }

      if ((var1 == 0)) {
        this.method218((byte) 75, var2.readUnsignedMedium((byte) 82));
      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        GlobalStatics_9.method222(-87, 26, 75, -56, 22, -68);
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) -123, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[] var4 = var3[0];
        int[] var5 = var3[1];
        int[] var6 = var3[2];

        for (int var7 = 0; (var7 < GlobalStatics_9.anInt1559); ++var7) {
          var4[var7] = this.anInt3129;
          var5[var7] = this.anInt3134;
          var6[var7] = this.anInt3135;
        }
      }

      return var3;
  }

}
