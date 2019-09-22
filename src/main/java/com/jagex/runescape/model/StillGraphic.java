package com.jagex.runescape.model;

import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.scene.SceneNode;
import com.jagex.runescape.statics.DummyClass0;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class StillGraphic extends SceneNode {

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

  public StillGraphic(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int var7) {
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
      GameStringStatics.aClass94_2707 = null;
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

  public void method1955(boolean var1, int var2) {
    if (!this.aBoolean2718) {
      if (!var1) {
        this.method1955(true, -72);
      }

      this.anInt2719 += var2;

      while (
          this.anInt2719 > this.aClass142_2711.anIntArray1869[this.anInt2706]) {
        this.anInt2719 -= this.aClass142_2711.anIntArray1869[this.anInt2706];
        ++this.anInt2706;
        if (this.aClass142_2711.anIntArray1851.length <= this.anInt2706) {
          this.aBoolean2718 = true;
          break;
        }
      }

    }
  }

  public void method1867(int var1, int var2, int var3, int var4, int var5) {
  }

  public void draw(int var1, int var2, int var3, int var4, int var5, int var6,
      int var7,
      int var8,
      long var9,
      int var11) {
    AbstractModel var13 = this.getModel(false);
    if (var13 != null) {
      var13.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11
      );
      this.anInt2715 = var13.getMinimumY();
    }
  }

  public int getMinimumY() {
    return this.anInt2715;
  }

}
