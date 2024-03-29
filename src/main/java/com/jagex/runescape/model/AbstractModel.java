package com.jagex.runescape.model;

import com.jagex.runescape.scene.SceneNode;
import com.jagex.runescape.statics.GlobalStatics_1;

public abstract class AbstractModel extends SceneNode {

  public boolean aBoolean2699;

  public abstract int method1872();

  public abstract boolean method1873();

  public abstract void method1874();

  public void somethingAnimation(AnimationFrame var1, AnimationBase var2,
      AnimationBase var3,
      int var4, int var5, boolean[] var6, boolean var7,
      boolean var8, int var9, int[] var10) {
    int var11;
    if (var3 != null && var4 != 0) {
      var11 = 0;
      int var34 = 0;

      for (int var35 = 0; var35 < var1.anInt2462; ++var35) {
        boolean var36 = false;
        if (var11 < var2.anInt1383 && var2.aShortArray1385[var11] == var35) {
          var36 = true;
        }

        boolean var15 = false;
        if (var34 < var3.anInt1383 && var3.aShortArray1385[var34] == var35) {
          var15 = true;
        }

        if (var36 || var15) {
          if (var6 != null && var6[var35] != var7
              && var1.anIntArray2466[var35] != 0) {
            if (var36) {
              ++var11;
            }

            if (var15) {
              ++var34;
            }
          } else {
            short var16 = 0;
            int var17 = var1.anIntArray2466[var35];
            if (var17 == 3) {
              var16 = 128;
            }

            short var19;
            short var18;
            short var21;
            short var20;
            byte var22;
            if (var36) {
              var18 = var2.aShortArray1388[var11];
              var19 = var2.aShortArray1396[var11];
              var20 = var2.aShortArray1395[var11];
              var21 = var2.aShortArray1387[var11];
              var22 = var2.aByteArray1393[var11];
              ++var11;
            } else {
              var18 = var16;
              var19 = var16;
              var20 = var16;
              var21 = -1;
              var22 = 0;
            }

            short var23;
            short var25;
            short var24;
            byte var27;
            short var26;
            if (var15) {
              var23 = var3.aShortArray1388[var34];
              var24 = var3.aShortArray1396[var34];
              var25 = var3.aShortArray1395[var34];
              var26 = var3.aShortArray1387[var34];
              var27 = var3.aByteArray1393[var34];
              ++var34;
            } else {
              var23 = var16;
              var24 = var16;
              var25 = var16;
              var26 = -1;
              var27 = 0;
            }

            int var29;
            int var28;
            int var31;
            int var30;
            if ((var22 & 2) == 0 && (var27 & 1) == 0) {
              if (var17 == 2) {
                var31 = var23 - var18 & 2047;
                int var32 = var24 - var19 & 2047;
                int var33 = var25 - var20 & 2047;
                if (var31 >= 1024) {
                  var31 -= 2048;
                }

                if (var32 >= 1024) {
                  var32 -= 2048;
                }

                if (var33 >= 1024) {
                  var33 -= 2048;
                }

                var28 = var18 + var31 * var4 / var5 & 2047;
                var29 = var19 + var32 * var4 / var5 & 2047;
                var30 = var20 + var33 * var4 / var5 & 2047;
              } else if (var17 == 7) {
                var31 = var23 - var18 & 63;
                if (var31 >= 32) {
                  var31 -= 64;
                }

                var28 = var18 + var31 * var4 / var5 & 63;
                var29 = var19 + (var24 - var19) * var4 / var5;
                var30 = var20 + (var25 - var20) * var4 / var5;
              } else {
                var28 = var18 + (var23 - var18) * var4 / var5;
                var29 = var19 + (var24 - var19) * var4 / var5;
                var30 = var20 + (var25 - var20) * var4 / var5;
              }
            } else {
              var28 = var18;
              var29 = var19;
              var30 = var20;
            }

            if (var21 != -1) {
              var31 = var9 & var1.anIntArray2455[var21];
              if (var31 == 0xffff) {
                this.method1891(0, var1.anIntArrayArray2460[var21], 0, 0, 0,
                    var8);
              } else {
                this.applyAnimationFrame(0, var1.anIntArrayArray2460[var21], 0,
                    0, 0,
                    var8, var31,
                    var10);
              }
            } else if (var26 != -1) {
              var31 = var9 & var1.anIntArray2455[var26];
              if (var31 == 0xffff) {
                this.method1891(0, var1.anIntArrayArray2460[var26], 0, 0, 0,
                    var8);
              } else {
                this.applyAnimationFrame(0, var1.anIntArrayArray2460[var26], 0,
                    0, 0,
                    var8, var31,
                    var10);
              }
            }

            var31 = var9 & var1.anIntArray2455[var35];
            if (var31 == 0xffff) {
              this.method1891(var17, var1.anIntArrayArray2460[var35], var28,
                  var29,
                  var30, var8);
            } else {
              this.applyAnimationFrame(var17, var1.anIntArrayArray2460[var35],
                  var28,
                  var29, var30,
                  var8, var31, var10);
            }
          }
        }
      }

    } else {
      for (var11 = 0; var11 < var2.anInt1383; ++var11) {
        short var12 = var2.aShortArray1385[var11];
        if (var6 == null || var6[var12] == var7
            || var1.anIntArray2466[var12] == 0) {
          short var13 = var2.aShortArray1387[var11];
          int var14;
          if (var13 != -1) {
            var14 = var9 & var1.anIntArray2455[var13];
            if (var14 == 0xffff) {
              this.method1891(0, var1.anIntArrayArray2460[var13], 0, 0, 0,
                  var8);
            } else {
              this.applyAnimationFrame(0, var1.anIntArrayArray2460[var13], 0, 0,
                  0,
                  var8, var14,
                  var10);
            }
          }

          var14 = var9 & var1.anIntArray2455[var12];
          if (var14 == 0xffff) {
            this.method1891(var1.anIntArray2466[var12],
                var1.anIntArrayArray2460[var12],
                var2.aShortArray1388[var11], var2.aShortArray1396[var11],
                var2.aShortArray1395[var11],
                var8);
          } else {
            this.applyAnimationFrame(var1.anIntArray2466[var12],
                var1.anIntArrayArray2460[var12],
                var2.aShortArray1388[var11], var2.aShortArray1396[var11],
                var2.aShortArray1395[var11],
                var8, var14, var10);
          }
        }
      }

    }
  }

  public abstract void method1876(int var1);

  public final void method1877(AnimationSomething var1, int var2) {
    if (var2 != -1) {
      if (this.method1873()) {
        AnimationBase var3 = var1.aClass98Array3588[var2];
        AnimationFrame var4 = var3.aClass3_Sub17_1384;

        for (int var5 = 0; var5 < var3.anInt1383; ++var5) {
          short var6 = var3.aShortArray1385[var5];
          if (var4.aBooleanArray2463[var6]) {
            if (var3.aShortArray1387[var5] != -1) {
              this.method1889(0, 0, 0, 0);
            }

            this.method1889(var4.anIntArray2466[var6],
                var3.aShortArray1388[var5],
                var3.aShortArray1396[var5], var3.aShortArray1395[var5]);
          }
        }

        this.method1879();
      }
    }
  }

  public abstract void method1879();

  public final void method1880(AnimationSomething var1, int var2,
      AnimationSomething var3,
      int var4,
      int var5,
      int var6,
      boolean var7) {
    if (var2 != -1) {
      if (this.method1873()) {
        AnimationBase var8 = var1.aClass98Array3588[var2];
        AnimationFrame var9 = var8.aClass3_Sub17_1384;
        AnimationBase var10 = null;
        if (var3 != null) {
          var10 = var3.aClass98Array3588[var4];
          if (var10.aClass3_Sub17_1384 != var9) {
            var10 = null;
          }
        }

        this.somethingAnimation(var9, var8, var10, var5, var6, null, false,
            var7, 0xffff, null);
        this.method1879();
      }
    }
  }

  public abstract void scale(int var1, int var2, int var3);

  public abstract AbstractModel method1882(boolean var1, boolean var2,
      boolean var3);

  public abstract int method1883();

  public abstract int method1884();

  public abstract void rotateQuarterY();

  public abstract void method1886(int var1);

  public final void method1887(AnimationSomething var1, int var2,
      AnimationSomething var3,
      int var4,
      int var5,
      int var6,
      int var7,
      boolean var8,
      int[] var9) {
    if (var2 != -1) {
      if (this.method1873()) {
        AnimationBase var10 = var1.aClass98Array3588[var2];
        AnimationFrame var11 = var10.aClass3_Sub17_1384;
        AnimationBase var12 = null;
        if (var3 != null) {
          var12 = var3.aClass98Array3588[var4];
          if (var12.aClass3_Sub17_1384 != var11) {
            var12 = null;
          }
        }

        this.somethingAnimation(var11, var10, var12, var5, var6, null, false,
            var8, var7, var9);
        this.method1879();
      }
    }
  }

  public abstract int method1888();

  public abstract void method1889(int var1, int var2, int var3, int var4);

  public abstract AbstractModel method1890(boolean var1, boolean var2,
      boolean var3);

  public abstract void method1891(int var1, int[] var2, int var3, int var4,
      int var5, boolean var6);

  public final void method1892(AnimationSomething var1, int var2,
      AnimationSomething var3,
      int var4,
      int var5,
      int var6,
      AnimationSomething var7,
      int var8,
      AnimationSomething var9,
      int var10,
      int var11,
      int var12,
      boolean[] var13,
      boolean var14) {
    if (var2 != -1) {
      if (var13 != null && var8 != -1) {
        if (this.method1873()) {
          AnimationBase var15 = var1.aClass98Array3588[var2];
          AnimationFrame var16 = var15.aClass3_Sub17_1384;
          AnimationBase var17 = null;
          if (var3 != null) {
            var17 = var3.aClass98Array3588[var4];
            if (var17.aClass3_Sub17_1384 != var16) {
              var17 = null;
            }
          }

          AnimationBase var18 = var7.aClass98Array3588[var8];
          AnimationBase var19 = null;
          if (var9 != null) {
            var19 = var9.aClass98Array3588[var10];
            if (var19.aClass3_Sub17_1384 != var16) {
              var19 = null;
            }
          }

          this.somethingAnimation(var16, var15, var17, var5, var6, var13, false,
              var14, 0xffff,
              null);
          this.method1891(0, new int[0], 0, 0, 0, var14);
          this.somethingAnimation(var16, var18, var19, var11, var12, var13,
              true, var14, 0xffff,
              null);
          this.method1879();
        }
      } else {
        this.method1880(var1, var2, var3, var4, var5, var6, var14);
      }
    }
  }

  public abstract void draw(int var1, int var2, int var3, int var4, int var5,
      int var6, int var7, long var8);

  public abstract AbstractModel method1894(boolean var1, boolean var2,
      boolean var3);

  public final void method1895(int[][] var1, int var2, int var3, int var4,
      int var5,
      int var6) {
    int var10 = -var5 / 2;
    int var11 = -var6 / 2;
    int var12 = GlobalStatics_1.method1878(var1, var2 + var10, var4 + var11);
    int var13 = var5 / 2;
    int var14 = -var6 / 2;
    int var15 = GlobalStatics_1.method1878(var1, var2 + var13, var4 + var14);
    int var16 = -var5 / 2;
    int var17 = var6 / 2;
    int var18 = GlobalStatics_1.method1878(var1, var2 + var16, var4 + var17);
    int var19 = var5 / 2;
    int var20 = var6 / 2;
    int var21 = GlobalStatics_1.method1878(var1, var2 + var19, var4 + var20);
    int var22 = var12 < var15 ? var12 : var15;
    int var23 = var18 < var21 ? var18 : var21;
    int var24 = var15 < var21 ? var15 : var21;
    int var25 = var12 < var18 ? var12 : var18;
    if (var6 != 0) {
      int var26 = (int) (Math.atan2(var22 - var23, var6) * 325.95D) & 2047;
      if (var26 != 0) {
        this.method1896(var26);
      }
    }

    if (var5 != 0) {
      int var27 = (int) (Math.atan2(var25 - var24, var5) * 325.95D) & 2047;
      if (var27 != 0) {
        this.method1886(var27);
      }
    }

    int var28 = var12 + var21;
    if (var15 + var18 < var28) {
      var28 = var15 + var18;
    }

    var28 = (var28 >> 1) - var3;
    if (var28 != 0) {
      this.method1897(0, var28, 0);
    }

  }

  public abstract void method1896(int var1);

  public void method1867(int var1, int var2, int var3, int var4, int var5) {
  }

  public abstract void draw(int var1, int var2, int var3, int var4, int var5,
      int var6, int var7, int var8, long var9, int var11);

  public abstract int getMinimumY();

  public abstract void method1897(int var1, int var2, int var3);

  public abstract int method1898();

  public abstract void applyAnimationFrame(int var1, int[] var2, int var3,
      int var4, int var5, boolean var6, int var7, int[] var8);

  public abstract void method1900();

}
