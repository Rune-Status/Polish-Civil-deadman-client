package com.jagex.runescape.model;

import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.statics.GlobalStatics_0;
import com.jagex.runescape.statics.GlobalStatics_10;

public final class SomethingTexture4 extends AbstractSomethingTexture {

  private final int anInt2666;
  private final int anInt2669;
  private final int anInt2671;
  private final int anInt2672;

  public SomethingTexture4(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int var7) {
    super(var5, var6, var7);

    this.anInt2672 = var2;
      this.anInt2666 = var3;
      this.anInt2671 = var1;
      this.anInt2669 = var4;
  }

  public void method1335(int var1, int var2, int var3) {
    if (var3 == 4898) {
        int var4 = var2 * this.anInt2671 >> 12;
        int var6 = this.anInt2672 * var1 >> 12;
        int var5 = var2 * this.anInt2666 >> 12;
        int var7 = this.anInt2669 * var1 >> 12;
        GlobalStatics_10.method194(this.anInt1106, var7, this.anInt1101,
            this.anInt1104, var6, 4096,
            var5, var4);
      }
  }

  public void method1337(int var1, boolean var2, int var3) {
    int var5 = var3 * this.anInt2666 >> 12;
      int var7 = this.anInt2669 * var1 >> 12;
      int var4 = this.anInt2671 * var3 >> 12;
      int var6 = this.anInt2672 * var1 >> 12;
      if (var2) {
        GlobalStatics_10.method2072(this.anInt1104, var4, var6, var5, var7,
            this.anInt1106, -2);
      }
  }

  public void method1341(int var1, int var2, int var3) {
    int var4 = this.anInt2671 * var2 >> 12;
      int var5 = var2 * this.anInt2666 >> 12;
      int var6 = var3 * this.anInt2672 >> 12;
      int var7 = var3 * this.anInt2669 >> 12;
      GlobalStatics_0
          .method730(var4, this.anInt1101, (byte) 121, var7, var5, var6);
      if (var1 != 2) {
        GameStringStatics.aClass94_2665 = null;
      }
  }

}
