package com.jagex.runescape.model;

import com.jagex.runescape.scene.SceneNode;
import com.jagex.runescape.statics.DummyClass0;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class Projectile extends SceneNode {

  public int anInt2899;
  public double aDouble2900;
  public int anInt2903;
  public int anInt2907;
  public double aDouble2914;
  public int targetId;
  public double aDouble2920;
  public int anInt2924;
  public int anInt2925;
  private double aDouble2895;
  private int anInt2896;
  private final int anInt2897;
  private int anInt2898 = -1;
  private final int anInt2902;
  private boolean aBoolean2904;
  private double aDouble2908;
  private DummyClass0 aClass127_Sub1_2909;
  private final int anInt2911;
  private int anInt2912 = -32768;
  private double aDouble2913;
  private final int anInt2915;
  private final int anInt2916;
  private int anInt2917;
  private double aDouble2918;
  private double aDouble2921;
  private int anInt2922;
  private final AnimationSequence aClass142_2923;
  private final int anInt2927;

  public Projectile(int var1, int var2, int var3, int var4, int var5, int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11) {
    this.anInt2899 = var7;
    this.anInt2902 = var3;
    this.targetId = var10;
    this.anInt2915 = var1;
    this.anInt2907 = var2;
    this.anInt2927 = var8;
    this.anInt2916 = var4;
    this.aBoolean2904 = false;
    this.anInt2903 = var11;
    this.anInt2897 = var9;
    this.anInt2925 = var6;
    this.anInt2911 = var5;
    int var12 = GlobalStatics_9.method898((byte) 42, this.anInt2915).anInt542;
    if (var12 == -1) {
      this.aClass142_2923 = null;
    } else {
      this.aClass142_2923 = GlobalStatics_8.method45(var12, (byte) -20);
    }
  }

  public void method1867(int var1, int var2, int var3, int var4, int var5) {
  }

  public void draw(int var1, int var2, int var3, int var4, int var5, int var6,
      int var7,
      int var8,
      long var9,
      int var11) {
    AbstractModel var13 = this.method2022(-126);
    if (var13 != null) {
      var13.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11
      );
      this.anInt2912 = var13.getMinimumY();
    }
  }

  public int getMinimumY() {
    return this.anInt2912;
  }

  private AbstractModel method2022(int var1) {
    if (var1 >= -6) {
      return null;
    } else {
      SpotAnimationConfig var2 = GlobalStatics_9.method898((byte) 42,
          this.anInt2915);
      AbstractModel var3 =
          var2.method966(this.anInt2898, (byte) -30, this.anInt2922,
              this.anInt2896);
      if (var3 == null) {
        return null;
      } else {
        var3.method1896(this.anInt2917);
        return var3;
      }
    }
  }

  public void update(int var2) {
    this.aDouble2920 += this.aDouble2895 * var2;
    this.aDouble2900 += this.aDouble2918 * var2;
    this.aBoolean2904 = true;
    if (this.anInt2927 == -1) {
      this.aDouble2914 += this.aDouble2913 * var2;
    } else {
      this.aDouble2914 += var2 * this.aDouble2908 * 0.5D * var2
          + var2 * this.aDouble2913;
      this.aDouble2913 += this.aDouble2908 * var2;
    }

    this.anInt2924 =
        1024 + (int) (325.949D * Math.atan2(this.aDouble2895, this.aDouble2918))
            & 2047;
    this.anInt2917 = 2047 & (int) (325.949D * Math.atan2(this.aDouble2913,
        this.aDouble2921));

    if (this.aClass142_2923 != null) {
      this.anInt2896 += var2;

      while (this.anInt2896
          > this.aClass142_2923.anIntArray1869[this.anInt2922]) {
        this.anInt2896 -= this.aClass142_2923.anIntArray1869[this.anInt2922];
        ++this.anInt2922;
        if (this.anInt2922 >= this.aClass142_2923.anIntArray1851.length) {
          this.anInt2922 -= this.aClass142_2923.anInt1865;
          if (this.anInt2922 < 0
              || this.aClass142_2923.anIntArray1851.length <= this.anInt2922) {
            this.anInt2922 = 0;
          }
        }

        this.anInt2898 = this.anInt2922 + 1;
        if (this.aClass142_2923.anIntArray1851.length <= this.anInt2898) {
          this.anInt2898 -= this.aClass142_2923.anInt1865;
          if (this.anInt2898 < 0
              || this.anInt2898 >= this.aClass142_2923.anIntArray1851.length) {
            this.anInt2898 = -1;
          }
        }
      }
    }
  }

  public void method2024(int var1, int var2, int var3, int var4, int var5) {
    double var6;
    if (!this.aBoolean2904) {
      double var8 = -this.anInt2916 + var1;
      var6 = -this.anInt2902 + var5;
      double var10 = Math.sqrt(var6 * var6 + var8 * var8);
      this.aDouble2914 = this.anInt2911;
      this.aDouble2900 = var8 * this.anInt2897
          / var10 + this.anInt2916;
      this.aDouble2920 = this.anInt2897
          * var6 / var10 + this.anInt2902;
    }

    var6 = -var3 + var2 + this.anInt2899;
    this.aDouble2918 = (var1 - this.aDouble2900) / var6;
    this.aDouble2895 = (-this.aDouble2920 + var5) / var6;
    this.aDouble2921 =
        Math.sqrt(this.aDouble2918 * this.aDouble2918
            + this.aDouble2895 * this.aDouble2895);
    if (this.anInt2927 == -1) {
      this.aDouble2913 = (-this.aDouble2914 + var4) / var6;
    } else {
      if (!this.aBoolean2904) {
        this.aDouble2913 = -this.aDouble2921
            * Math.tan(this.anInt2927 * 0.02454369D);
      }

      this.aDouble2908 =
          2.0D * (var4 - this.aDouble2914 - this.aDouble2913 * var6) / (var6
              * var6);
    }
  }

}
