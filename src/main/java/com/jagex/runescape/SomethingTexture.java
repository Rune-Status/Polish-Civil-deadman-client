package com.jagex.runescape;

import com.jagex.runescape.done.AbstractSomethingTexture;

public final class SomethingTexture extends AbstractSomethingTexture {

  private final int anInt2629;
  private final int anInt2630;
  private final int anInt2632;
  private final int anInt2635;


  public SomethingTexture(int var1, int var2, int var3, int var4, int var5,
      int var6 ) {
    super(-1, var5, var6);

    this.anInt2632 = var4;
      this.anInt2630 = var2;
      this.anInt2629 = var1;
      this.anInt2635 = var3;
  }

  public void method1335(int var1, int var2, int var3 ) {
    try {
    } catch (RuntimeException var5) {
      throw GlobalStatics_4.cascadeException(var5,
        "ci.D(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  public void method1337(int var1, boolean var2, int var3 ) {
    int var4 = var3 * this.anInt2629 >> 12;
      if (!var2) {
        this.method1335(67, -82, -112);
      }

      int var5 = this.anInt2635 * var3 >> 12;
      int var6 = var1 * this.anInt2630 >> 12;
      int var7 = var1 * this.anInt2632 >> 12;
      GlobalStatics_10.method330(this.anInt1104, -111, var7, var4, var6, var5);
  }

  public void method1341(int var1, int var2, int var3 ) {
    if (var1 != 2) {
        GlobalStatics_9.method1342(null, null, null, (byte) -68, null);
      }
  }

}
