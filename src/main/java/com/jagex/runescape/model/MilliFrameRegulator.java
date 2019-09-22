package com.jagex.runescape.model;

import com.jagex.runescape.common.ThreadUtilities;
import com.jagex.runescape.common.TimeUtilities;

public final class MilliFrameRegulator extends AbstractFrameRegulator {

  private long aLong2683;
  private int anInt2685;
  private int anInt2688;
  private int anInt2691;
  private int anInt2692;
  private final long[] aLongArray2694 = new long[10];


  public MilliFrameRegulator() {
    this.anInt2688 = 256;
      this.anInt2691 = 1;
      this.anInt2692 = 0;
      this.aLong2683 = TimeUtilities.getCurrentTimeMillis();

      for (int var1 = 0; var1 < 10; ++var1) {
        this.aLongArray2694[var1] = this.aLong2683;
      }
  }

  public int sleep(int var1, int var2, int var3 ) {
    if (var1 != -1) {
        this.sleep(-14, 83, 10);
      }

      int var5 = this.anInt2691;
      int var4 = this.anInt2688;
      this.anInt2688 = 300;
      this.anInt2691 = 1;
      this.aLong2683 = TimeUtilities.getCurrentTimeMillis();
      if (this.aLongArray2694[this.anInt2685] == 0L) {
        this.anInt2688 = var4;
        this.anInt2691 = var5;
      } else if (this.aLongArray2694[this.anInt2685] < this.aLong2683) {
        this.anInt2688 =
          (int) ((var3 * 2560) / (this.aLong2683
              - this.aLongArray2694[this.anInt2685]));
      }

      if (this.anInt2688 < 25) {
        this.anInt2688 = 25;
      }

      if (this.anInt2688 > 256) {
        this.anInt2688 = 256;
        this.anInt2691 =
          (int) (-((this.aLong2683 - this.aLongArray2694[this.anInt2685]) / 10L) + var3);
      }

      if (var3 < this.anInt2691) {
        this.anInt2691 = var3;
      }

      this.aLongArray2694[this.anInt2685] = this.aLong2683;
      this.anInt2685 = (1 + this.anInt2685) % 10;
      int var6;
      if (this.anInt2691 > 1) {
        for (var6 = 0; var6 < 10; ++var6) {
          if (this.aLongArray2694[var6] != 0L) {
            this.aLongArray2694[var6] += this.anInt2691;
          }
        }
      }

      if (var2 > this.anInt2691) {
        this.anInt2691 = var2;
      }

      ThreadUtilities.sleep(this.anInt2691);

      for (var6 = 0; this.anInt2692 < 256; ++var6) {
        this.anInt2692 += this.anInt2688;
      }

      this.anInt2692 &= 255;
      return var6;
  }

  public void reset(int var1 ) {
    int var2;
      for (var2 = 0; var2 < 10; ++var2) {
        this.aLongArray2694[var2] = 0L;
      }

      var2 = -114 % ((var1 + 82) / 42);
  }

}
