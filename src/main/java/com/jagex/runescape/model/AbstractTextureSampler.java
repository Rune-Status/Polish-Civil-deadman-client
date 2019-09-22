package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.node.Node;
import com.jagex.runescape.settings.SettingsStatics;
import com.jagex.runescape.statics.GlobalStatics_3;

public abstract class AbstractTextureSampler extends Node {

  public boolean monoChromatic;
  public TriChromaticImageCache triChromaticImageCache;
  public AbstractTextureSampler[] samplers;
  public int cacheSize;
  public MonoChromaticImageCache monoChromaticImageCache;

  public AbstractTextureSampler(int var1, boolean var2) {
    this.samplers = new AbstractTextureSampler[var1];
    this.monoChromatic = var2;
  }

  public final int[] method152(int var1, int var2, int var3) {
    if (var3 != 32755) {
      GlobalStatics_3.anInt2383 = 121;
    }

    return this.samplers[var1].monoChromatic ?
        this.samplers[var1].method154(var2, (byte) -118) :
        this.samplers[var1].method166(-1, var2)[0];
  }

  public int[] method154(int var1, byte var2) {
    throw new IllegalStateException(
        "This operation does not have a monochrome output");
  }

  public int method155(byte var1) {
    if (var1 != 19) {
      this.method152(-80, 116, -73);
    }

    return -1;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3) {
    if (!var3) {
      this.samplers = null;
    }
  }

  public void method158(int var1) {
    if (var1 != 16251) {
      SettingsStatics.anInt2378 = 12;
    }
  }

  public int method159(int var1) {
    if (var1 != 4) {
      GlobalStatics_3.drawLoadingBox(null, true);
    }

    return -1;
  }

  public final void method160(int var1, int var2, int var3) {
    if (var3 != 250) {
      this.monoChromaticImageCache = null;
    }

    int var4 = this.cacheSize == 255 ? var1 : this.cacheSize;
    if (this.monoChromatic) {
      this.monoChromaticImageCache = new MonoChromaticImageCache(var4, var1,
          var2);
    } else {
      this.triChromaticImageCache = new TriChromaticImageCache(var4, var1,
          var2);
    }
  }

  public void method161(byte var1) {
    if (var1 != -45) {
      GlobalStatics_3.anInt2383 = 16;
    }

    if (this.monoChromatic) {
      this.monoChromaticImageCache.method1706(1127165736);
      this.monoChromaticImageCache = null;
    } else {
      this.triChromaticImageCache.method1590((byte) -22);
      this.triChromaticImageCache = null;
    }
  }

  public final int[][] method162(int var1, int var2, byte var3) {
    if (var3 > -45) {
      return null;
    } else if (!this.samplers[var2].monoChromatic) {
      return this.samplers[var2].method166(-1, var1);
    } else {
      int[] var4 = this.samplers[var2].method154(var1, (byte) -105);
      int[][] var5 = {var4, var4, var4};
      return var5;
    }
  }

  public int[][] method166(int var1, int var2) {
    if (var1 == -1) {
      throw new IllegalStateException(
          "This operation does not have a colour output");
    } else {
      return null;
    }
  }

}
