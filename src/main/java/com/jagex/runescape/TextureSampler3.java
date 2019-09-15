package com.jagex.runescape;

import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.done.AbstractTextureSampler;

public final class TextureSampler3 extends AbstractTextureSampler {


  public TextureSampler3() {
    super(0, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        ArrayUtils.fill(var3, 0, GlobalStatics_9.anInt1559, DummyClass4.anIntArray2999[var1]);
      }

      int var4 = -123 % ((30 - var2) / 36);
      return var3;
  }

}
