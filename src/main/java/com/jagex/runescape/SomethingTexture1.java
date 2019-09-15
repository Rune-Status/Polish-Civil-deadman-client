package com.jagex.runescape;

import com.jagex.runescape.done.AbstractSomethingTexture;

public final class SomethingTexture1 extends AbstractSomethingTexture {

  private final int anInt2636;
  private int anInt2644;
  private final int anInt2646;
  private final int anInt2647;


  public SomethingTexture1(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int var7 ) {
    super(var5, var6, var7);

    this.anInt2647 = var4;
      this.anInt2646 = var1;
      this.anInt2644 = var2;
      this.anInt2636 = var3;
  }

  public void method1335(int var1, int var2, int var3 ) {
    int var4 = var2 * this.anInt2646 >> 12;
      if (var3 != 4898) {
        this.anInt2644 = -39;
      }

      int var7 = this.anInt2647 * var1 >> 12;
      int var6 = this.anInt2644 * var1 >> 12;
      int var5 = this.anInt2636 * var2 >> 12;
      GlobalStatics_10.method223(true, this.anInt1106, var4, var6, var7,
          this.anInt1104,
          this.anInt1101, var5);
  }

  public void method1337(int var1, boolean var2, int var3 ) {
    if (!var2) {
        this.method1337(-7, false, 66);
      }
  }

  public void method1341(int var1, int var2, int var3 ) {
    int var4 = this.anInt2646 * var2 >> 12;
      int var5 = var2 * this.anInt2636 >> 12;
      int var6 = this.anInt2644 * var3 >> 12;
      int var7 = this.anInt2647 * var3 >> 12;
      if (var1 == 2) {
        DummyClass53.method1584(this.anInt1101, var7, var4, var6, -26571, var5);
      }
  }

}
