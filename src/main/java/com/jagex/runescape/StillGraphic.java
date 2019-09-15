package com.jagex.runescape;

import com.jagex.runescape.done.AbstractModel;
import com.jagex.runescape.done.AnimationSequence;

public final class StillGraphic extends SceneNode {

  public static int[] BIT_MASKS = {
    0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071,
    262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727,
    268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1
  };
  public int anInt2703;
  public int anInt2710;
  public int anInt2712;
  public int anInt2716;
  public int anInt2717;
  public boolean aBoolean2718;
  private DummyClass0 aClass127_Sub1_2704;
  private int anInt2706;
  private final int anInt2708;
  private AnimationSequence aClass142_2711;
  private final int anInt2714 = -1;
  private int anInt2715 = -32768;
  private int anInt2719;


  public StillGraphic(int var1, int var2, int var3, int var4, int var5, int var6,
      int var7 ) {
    this.anInt2710 = var4;
      this.anInt2716 = var3;
      this.anInt2717 = var2;
      this.anInt2703 = var7 + var6;
      this.anInt2708 = var1;
      this.anInt2712 = var5;
      int var8 = GlobalStatics_9.method898((byte) 42, this.anInt2708).anInt542;
      if (var8 == -1) {
        this.aBoolean2718 = true;
      } else {
        this.aBoolean2718 = false;
        this.aClass142_2711 = GlobalStatics_8.method45(var8, (byte) -20);
      }
  }

  private AbstractModel getModel(boolean var1) {
    SpotAnimationConfig var2 = GlobalStatics_9.method898((byte) 42,
          this.anInt2708);
      if (var1) {
        GlobalStatics_9.aClass94_2707 = null;
      }

      AbstractModel var3;
      if (this.aBoolean2718) {
        var3 = var2.method966(-1, (byte) -30, -1, 0);
      } else {
        var3 = var2.method966(this.anInt2714, (byte) -30, this.anInt2706,
            this.anInt2719);
      }

      return var3;
  }

  public void method1955(boolean var1, int var2 ) {
    if (!this.aBoolean2718) {
        if (!var1) {
          this.method1955(true, -72);
        }

        this.anInt2719 += var2;

        while (
            this.anInt2719 > this.aClass142_2711.anIntArray1869[this.anInt2706]) {
          this.anInt2719 -= this.aClass142_2711.anIntArray1869[this.anInt2706];
          ++this.anInt2706;
          if ((this.aClass142_2711.anIntArray1851.length <= this.anInt2706)) {
            this.aBoolean2718 = true;
            break;
          }
        }

      }
  }

  public void method1867(int var1, int var2, int var3, int var4, int var5 ) {
  }

  public void draw(int var1, int var2, int var3, int var4, int var5, int var6,
      int var7,
      int var8,
      long var9,
      int var11,
      DummyClass0 var12 ) {
    AbstractModel var13 = this.getModel(false);
      if (var13 != null) {
        var13.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11,
            this.aClass127_Sub1_2704);
        this.anInt2715 = var13.getMinimumY();
      }
  }

  public int getMinimumY() {
    return this.anInt2715;
  }

}
