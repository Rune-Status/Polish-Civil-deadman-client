package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler0 extends AbstractTextureSampler {

  private int anInt3276;


  private TextureSampler0(int var1) {
    super(0, true);
    this.anInt3276 = 4096;

    this.anInt3276 = var1;
  }

  public TextureSampler0() {
    this(4096);
  }

  public int[] method154(int var1, byte var2 ) {
    int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        ArrayUtils.fill(var4, 0, GlobalStatics_9.anInt1559, this.anInt3276);
      }
      return var4;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var1 == 0) {
        this.anInt3276 = (var2.readUnsignedByte() << 12) / 255;
      }
  }

}
