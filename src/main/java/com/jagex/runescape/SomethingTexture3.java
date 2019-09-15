package com.jagex.runescape;

import com.jagex.runescape.done.AbstractSomethingTexture;

public final class SomethingTexture3 extends AbstractSomethingTexture {

  private final int anInt2649;
  private final int anInt2650;
  private final int anInt2652;
  private final int anInt2654;
  private int anInt2655;
  private final int anInt2657;
  private final int anInt2659;
  private final int anInt2661;


  public SomethingTexture3(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10 ) {
    super(-1, var9, var10);

    this.anInt2657 = var2;
      this.anInt2659 = var7;
      this.anInt2655 = var5;
      this.anInt2654 = var1;
      this.anInt2650 = var8;
      this.anInt2652 = var6;
      this.anInt2649 = var4;
      this.anInt2661 = var3;
  }

  public void method1335(int var1, int var2, int var3 ) {
    if (var3 != 4898) {
        this.anInt2655 = -64;
      }
  }

  public void method1337(int var1, boolean var2, int var3 ) {
    int var4 = var3 * this.anInt2654 >> 12;
      int var6 = var3 * this.anInt2661 >> 12;
      int var7 = this.anInt2649 * var1 >> 12;
      int var5 = this.anInt2657 * var1 >> 12;
      int var8 = this.anInt2655 * var3 >> 12;
      int var9 = var1 * this.anInt2652 >> 12;
      int var10 = this.anInt2659 * var3 >> 12;
      if (!var2) {
        GlobalStatics_9.aClass94_2653 = null;
      }

      int var11 = var1 * this.anInt2650 >> 12;
      DummyClass58.method1652(var6, var10, var9, var11, var5, var4, var8, var7,
          this.anInt1104, 0);
  }

  public void method1341(int var1, int var2, int var3 ) {
    if (var1 != 2) {
        GlobalStatics_9.animationFrames = null;
      }
  }

}
