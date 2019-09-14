package com.jagex.runescape;

public final class NanoFrameRegulator extends AbstractFrameRegulator {

  private long aLong2698 = System.nanoTime();

  public int sleep(int var1, int var2, int var3 ) {
    if (var1 == -1) {
      long var4 = 1000000L * var2;
      long var6 = this.aLong2698 - System.nanoTime();
      if (var4 > var6) {
        var6 = var4;
      }

      TextureSampler25.sleep(var6 / 1000000L);
      int var10 = 0;

      long var8;
      for (
          var8 = System.nanoTime();
          var10 < 10 && ((var10 < 1) || this.aLong2698 < var8);
          this.aLong2698 += 1000000L * var3) {
        ++var10;
      }

      if (var8 > this.aLong2698) {
        this.aLong2698 = var8;
      }

      return var10;
    } else {
      return 37;
    }
  }

  public void reset(int var1 ) {
    int var2 = 37 / ((-82 - var1) / 42);
    this.aLong2698 = System.nanoTime();
  }

}
