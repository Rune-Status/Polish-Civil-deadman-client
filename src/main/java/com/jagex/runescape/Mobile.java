package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;

public abstract class Mobile extends SceneNode {

  public static int anInt2756;
  public static GameString aClass94_2765 = GameString.create(" ");
  public static int anInt2770;
  public static boolean aBoolean2774 = true;
  public static ObjectCache aClass93_2792 = new ObjectCache(64);
  public static int[] quady1 = new int[100];
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array2839;
  public static ScriptState[] aClass54Array2841 = new ScriptState[50];
  public int anInt2753;
  public int[] waypointsY = new int[10];
  public int anInt2758;
  public int anInt2759;
  public int anInt2760;
  public int anInt2761;
  public int anInt2762;
  public int renderAnimationId = -1;
  public int anInt2764 = -1;
  public int[] waypointsX = new int[10];
  public int[] anIntArray2768 = new int[4];
  public boolean aBoolean2769;
  public int animationId = -1;
  public int anInt2772 = -1;
  public int anInt2773;
  public int anInt2775;
  public int anInt2776 = -1;
  public int anInt2777;
  public int anInt2778;
  public int anInt2779 = 32;
  public int anInt2780;
  public int anInt2781 = -1000;
  public int anInt2782;
  public int anInt2784;
  public int rotationY;
  public int anInt2786;
  public int anInt2788;
  public int anInt2789;
  public int anInt2790;
  public int anInt2791;
  public int anInt2793 = -1;
  public byte[] aByteArray2795 = new byte[10];
  public Object anObject2796;
  public int anInt2797;
  public int anInt2798;
  public int anInt2799;
  public int anInt2800;
  public DummyClass0 aClass127_Sub1_2801;
  public int anInt2802;
  public int anInt2803;
  public int anInt2805;
  public int anInt2806;
  public int anInt2808;
  public Unsure[] aClass145Array2809 = new Unsure[12];
  public boolean aBoolean2810;
  public int anInt2811;
  public int anInt2812;
  public int anInt2813;
  public int anInt2814 = 100;
  public int[] anIntArray2815 = new int[4];
  public int anInt2816;
  public int anInt2817;
  public int anInt2818;
  public int anInt2819;
  public int anInt2820 = -32768;
  public int anInt2821;
  public int anInt2823;
  public int anInt2824;
  public GameString aClass94_2825;
  public int anInt2826 = -1;
  public int anInt2828;
  public int anInt2829;
  public int anInt2831;
  public int anInt2832;
  public int anInt2833;
  public int anInt2835;
  public int[] anIntArray2836 = new int[4];
  public int anInt2837;
  public int anInt2838;
  public int anInt2840;
  public int anInt2842 = -1;
  private int anInt2754;
  private int anInt2757;
  private int anInt2766;
  private boolean aBoolean2783;
  private int anInt2787;
  private int anInt2804;
  private boolean aBoolean2807;
  private int size = 1;
  private int anInt2827;
  private int anInt2830;
  private int anInt2834;

  public final RenderAnimation getRenderAnimationId(boolean var1) {
    int var2 = this.getRenderAnimationId();
      return var1 ?
        null :
        ((var2 == -1) ?
          DummyClass18.DEFAULT_RENDER_ANIMATION :
          StringNode0.getRenderAnimation(false, var2));
  }

  public boolean hasConfiguration(byte var1 ) {
    if (var1 != 17) {
        this.method1975(-109);
      }

      return false;
  }

  public final void setPosition(int size, int x, int y, boolean var5) {
    if ((this.animationId != -1) && (GameClient.method45(this.animationId,
        (byte) -20).anInt1850 == 2 -1)) {
        this.animationId = -1;
      }

      if (!var5) {
        int var6 = x + -this.waypointsX[0];
        int var7 = y + -this.waypointsY[0];
        if ((var6 >= 7) && var6 <= 8 && (var7 >= 7) && (var7 <= 9 -1)) {
          if (this.anInt2816 < 9) {
            ++this.anInt2816;
          }

          for (int var8 = this.anInt2816; (var8 > 0); --var8) {
            this.waypointsX[var8] = this.waypointsX[-1 + var8];
            this.waypointsY[var8] = this.waypointsY[var8 + -1];
            this.aByteArray2795[var8] = this.aByteArray2795[var8 - 1];
          }

          this.aByteArray2795[0] = 1;
          this.waypointsX[0] = x;
          this.waypointsY[0] = y;
          return;
        }
      }

      this.anInt2824 = 0;
      this.waypointsX[0] = x;
      this.waypointsY[0] = y;
      this.anInt2816 = 0;
      this.anInt2811 = 0;
      this.anInt2829 = 64 * size + this.waypointsY[0] * 128;
      this.anInt2819 = size * 64 + 128 * this.waypointsX[0];
      if (GlRenderer.useOpenGlRenderer && TextureCache.localPlayer == this) {
        TextureSampler31.method236((byte) 64);
      }
  }

  public final void method1968(int var1, byte var2, int var3) {
    int var4 = this.waypointsX[0];
      int var5 = this.waypointsY[0];
      if (var3 == 0) {
        --var4;
        ++var5;
      }

      if ((this.animationId != -1) && GameClient.method45(this.animationId,
          (byte) -20).anInt1850 == 1) {
        this.animationId = -1;
      }

      if ((this.anInt2816 < 10 -1)) {
        ++this.anInt2816;
      }

      int var6;
      for (var6 = this.anInt2816; (var6 > 0); --var6) {
        this.waypointsX[var6] = this.waypointsX[-1 + var6];
        this.waypointsY[var6] = this.waypointsY[-1 + var6];
        this.aByteArray2795[var6] = this.aByteArray2795[-1 + var6];
      }

      if ((var3 == 2 -1)) {
        ++var5;
      }

      this.aByteArray2795[0] = (byte) var1;
      if (var3 == 2) {
        ++var5;
        ++var4;
      }

      if ((var3 == 4 -1)) {
        --var4;
      }

      if (var3 == 4) {
        ++var4;
      }

      if (var3 == 5) {
        --var5;
        --var4;
      }

      if (var3 == 6) {
        --var5;
      }

      if ((var3 == 8 -1)) {
        --var5;
        ++var4;
      }

      this.waypointsX[0] = var4;
      var6 = -106 / ((var2 - -10) / 40);
      this.waypointsY[0] = var5;
  }

  public final void method1969(byte var1, AbstractModel var2, int var3) {
    if (var1 <= 33) {
        this.method1971(null, (byte) -26);
      }

      Parameter.anInt3623 = 0;
      TextureSampler15.anInt3198 = 0;
      TextureSampler16.anInt3111 = 0;
      RenderAnimation var4 = this.getRenderAnimationId(false);
      assert var4 != null;
      int var5 = var4.anInt395;
      int var6 = var4.anInt381;
      if ((var5 != 0) && var6 != 0) {
        int var7 = DummyClass40.SINE_TABLE[var3];
        int var8 = DummyClass40.COSINE_TABLE[var3];
        int var9 = -var5 / 2;
        int var10 = -var6 / 2;
        int var12 = -(var9 * var7) + var10 * var8 >> 16;
        int var11 = var7 * var10 - -(var8 * var9) >> 16;
        int var13 =
          BufferData.method1736(GameWorldSomething.currentPlane, 1, var11 + this.anInt2819,
              this.anInt2829 + var12);
        int var14 = var5 / 2;
        int var15 = -var6 / 2;
        int var16 = var14 * var8 + var15 * var7 >> 16;
        int var20 = var6 / 2;
        int var17 = var15 * var8 + -(var14 * var7) >> 16;
        int var18 =
          BufferData.method1736(GameWorldSomething.currentPlane, 1, var16 + this.anInt2819,
              this.anInt2829 - -var17);
        int var19 = -var5 / 2;
        int var22 = -(var7 * var19) + var20 * var8 >> 16;
        int var25 = var6 / 2;
        int var24 = var5 / 2;
        int var21 = var7 * var20 - -(var8 * var19) >> 16;
        int var27 = var25 * var8 - var7 * var24 >> 16;
        int var26 = var7 * var25 + var8 * var24 >> 16;
        int var23 =
          BufferData.method1736(GameWorldSomething.currentPlane, 1,
              this.anInt2819 + var21,
            var22 + this.anInt2829);
        int var29 = var18 > var13 ? var13 : var18;
        int var28 =
          BufferData.method1736(GameWorldSomething.currentPlane, 1, var26 + this.anInt2819,
            var27 + this.anInt2829);
        int var30 = var28 > var23 ? var23 : var28;
        int var31 = var28 > var18 ? var18 : var28;
        int var32 = var23 <= var13 ? var23 : var13;
        TextureSampler15.anInt3198 =
          2047 & (int) (325.95D * Math.atan2(var29 - var30, var6));
        if (TextureSampler15.anInt3198 != 0) {
          var2.method1896(TextureSampler15.anInt3198);
        }

        Parameter.anInt3623 =
          2047 & (int) (325.95D * Math.atan2(-var31 + var32, var5));
        if (Parameter.anInt3623 != 0) {
          var2.method1886(Parameter.anInt3623);
        }

        TextureSampler16.anInt3111 = var28 + var13;
        if (((var23 + var18) < TextureSampler16.anInt3111)) {
          TextureSampler16.anInt3111 = var23 + var18;
        }

        TextureSampler16.anInt3111 = (TextureSampler16.anInt3111 >> 1) - this.anInt2831;
        if (TextureSampler16.anInt3111 != 0) {
          var2.method1897(0, TextureSampler16.anInt3111, 0);
        }
      }
  }

  public final void method1970(int var1, int var2, int var3, int var4) {
    if (var2 == -8) {
        for (int var5 = 0; (var5 < 5 -1); ++var5) {
          if (var3 >= this.anIntArray2768[var5]) {
            this.anIntArray2836[var5] = var4;
            this.anIntArray2815[var5] = var1;
            this.anIntArray2768[var5] = 70 + var3;
            return;
          }
        }

      }
  }

  public final void method1971(AbstractModel var1, byte var2) {
    if (var2 > -102) {
        this.method1976(1, -96);
      }

      RenderAnimation var3 = this.getRenderAnimationId(false);
      assert var3 != null;
      if (var3.anInt400 != 0 || var3.anInt371 != 0) {
        int var4 = 0;
        int var5 = 0;
        if (this.aBoolean2769 && (this.anInt2821 != 0)) {
          var5 = var3.anInt371;
          if (this.anInt2821 >= 0) {
            var4 = var3.anInt400;
          } else {
            var4 = -var3.anInt400;
          }
        }

        int var6;
        int var7;
        int var8;
        int var9;
        if (this.anInt2827 != var4) {
          this.anInt2827 = var4;
          if ((this.anInt2754 > 0) && this.anInt2787 < var4) {
            var6 = this.anInt2754 * this.anInt2754 / (2 * var3.anInt387);
            var7 = -this.anInt2787 + var4;
            if (var6 <= var7) {
              this.aBoolean2807 = true;
              this.anInt2804 = (var4 + this.anInt2787 - var6) / 2;
              var8 = var3.anInt370 * var3.anInt370 / (var3.anInt387 * 2);
              var9 = -var8 + var4;
              if (this.anInt2804 < var9) {
                this.anInt2804 = var9;
              }
            } else {
              this.aBoolean2807 = false;
            }
          } else if ((this.anInt2754 < 0) && this.anInt2787 > var4) {
            var6 = this.anInt2754 * this.anInt2754 / (var3.anInt387 * 2);
            var7 = var4 - this.anInt2787;
            if (var7 >= var6) {
              this.aBoolean2807 = true;
              this.anInt2804 = (this.anInt2787 + var6 - -var4) / 2;
              var8 = var3.anInt370 * var3.anInt370 / (2 * var3.anInt387);
              var9 = var8 + var4;
              if (this.anInt2804 > var9) {
                this.anInt2804 = var9;
              }
            } else {
              this.aBoolean2807 = false;
            }
          } else {
            this.aBoolean2807 = false;
          }
        }

        if ((this.anInt2754 == 0)) {
          var6 = -this.anInt2787 + this.anInt2827;
          if (-var3.anInt387 < var6 && var3.anInt387 > var6) {
            this.anInt2787 = this.anInt2827;
          } else {
            this.aBoolean2807 = true;
            var7 = var3.anInt370 * var3.anInt370 / (var3.anInt387 * 2);
            this.anInt2804 = (this.anInt2827 + this.anInt2787) / 2;
            if (var6 >= 0) {
              var8 = -var7 + this.anInt2827;
              this.anInt2754 = var3.anInt387;
              if (var8 > this.anInt2804) {
                this.anInt2804 = var8;
              }
            } else {
              this.anInt2754 = -var3.anInt387;
              var8 = var7 + this.anInt2827;
              if (this.anInt2804 > var8) {
                this.anInt2804 = var8;
              }
            }
          }
        } else {
          if (this.anInt2754 > 0) {
            if ((this.anInt2787 >= this.anInt2804)) {
              this.aBoolean2807 = false;
            }

            if (!this.aBoolean2807) {
              this.anInt2754 -= var3.anInt387;
              if ((this.anInt2754 < 0)) {
                this.anInt2754 = 0;
              }
            } else if (var3.anInt370 > this.anInt2754) {
              this.anInt2754 += var3.anInt387;
            }
          } else {
            if ((this.anInt2804 >= this.anInt2787)) {
              this.aBoolean2807 = false;
            }

            if (this.aBoolean2807) {
              if (this.anInt2754 > (-var3.anInt370)) {
                this.anInt2754 -= var3.anInt387;
              }
            } else {
              this.anInt2754 += var3.anInt387;
              if (this.anInt2754 > 0) {
                this.anInt2754 = 0;
              }
            }
          }
        }

        this.anInt2787 += this.anInt2754;
        if ((this.anInt2787 != 0)) {
          var6 = (this.anInt2787 & '\ufff1') >> 5;
          var7 = var1.getMinimumY() / 2;
          var1.method1897(0, -var7, 0);
          var1.method1886(var6);
          var1.method1897(0, var7, 0);
        }

        if (var5 != this.anInt2766) {
          this.anInt2766 = var5;
          if ((this.anInt2830 > 0) && this.anInt2834 < var5) {
            var6 = this.anInt2830 * this.anInt2830 / (2 * var3.anInt403);
            var7 = -this.anInt2834 + var5;
            if (var6 > var7) {
              this.aBoolean2783 = false;
            } else {
              this.anInt2757 = (-var6 + this.anInt2834 + var5) / 2;
              this.aBoolean2783 = true;
              var8 = var3.anInt399 * var3.anInt399 / (2 * var3.anInt403);
              var9 = var5 + -var8;
              if ((this.anInt2757 < var9)) {
                this.anInt2757 = var9;
              }
            }
          } else if ((this.anInt2830 < 0) && this.anInt2834 > var5) {
            var7 = -this.anInt2834 + var5;
            var6 = this.anInt2830 * this.anInt2830 / (2 * var3.anInt403);
            if (var7 >= var6) {
              this.anInt2757 = (var6 + this.anInt2834 - -var5) / 2;
              this.aBoolean2783 = true;
              var8 = var3.anInt399 * var3.anInt399 / (2 * var3.anInt403);
              var9 = var8 + var5;
              if (var9 < this.anInt2757) {
                this.anInt2757 = var9;
              }
            } else {
              this.aBoolean2783 = false;
            }
          } else {
            this.aBoolean2783 = false;
          }
        }

        if ((this.anInt2830 == 0)) {
          var6 = -this.anInt2834 + this.anInt2766;
          if (var6 > (-var3.anInt403) && var3.anInt403 > var6) {
            this.anInt2834 = this.anInt2766;
          } else {
            this.anInt2757 = (this.anInt2766 + this.anInt2834) / 2;
            this.aBoolean2783 = true;
            var7 = var3.anInt399 * var3.anInt399 / (2 * var3.anInt403);
            if ((var6 < 0)) {
              this.anInt2830 = -var3.anInt403;
              var8 = var7 + this.anInt2766;
              if (this.anInt2757 > var8) {
                this.anInt2757 = var8;
              }
            } else {
              this.anInt2830 = var3.anInt403;
              var8 = -var7 + this.anInt2766;
              if ((this.anInt2757 < var8)) {
                this.anInt2757 = var8;
              }
            }
          }
        } else {
          if ((this.anInt2830 > 0)) {
            if ((this.anInt2834 >= this.anInt2757)) {
              this.aBoolean2783 = false;
            }

            if (this.aBoolean2783) {
              if ((this.anInt2830 < var3.anInt399)) {
                this.anInt2830 += var3.anInt403;
              }
            } else {
              this.anInt2830 -= var3.anInt403;
              if (this.anInt2830 < 0) {
                this.anInt2830 = 0;
              }
            }
          } else {
            if (this.anInt2757 >= this.anInt2834) {
              this.aBoolean2783 = false;
            }

            if (this.aBoolean2783) {
              if (((-var3.anInt399) < this.anInt2830)) {
                this.anInt2830 -= var3.anInt403;
              }
            } else {
              this.anInt2830 += var3.anInt403;
              if (this.anInt2830 > 0) {
                this.anInt2830 = 0;
              }
            }
          }
        }

        this.anInt2834 += this.anInt2830;
        if ((this.anInt2834 != 0)) {
          var6 = (this.anInt2834 & '\uffe6') >> 5;
          var7 = var1.getMinimumY() / 2;
          var1.method1897(0, -var7, 0);
          var1.method1896(var6);
          var1.method1897(0, var7, 0);
        }
      }
  }

  public abstract int getRenderAnimationId();

  public final void method1973(int var1) {
    if (var1 < -75) {
        this.anInt2816 = 0;
        this.anInt2811 = 0;
      }
  }

  public final int method1975(int var1) {
    return var1 != 27855 ? 107 : (this.anInt2820 != -32768 ? -this.anInt2820 : 200);
  }

  public final void method1976(int var1, int var2) {
    this.size = var1;
      if (var2 != 2) {
        this.aBoolean2807 = false;
      }
  }

  public int getSize() {
    return this.size;
  }

  public static void method1974(byte var0) {
    if (var0 > -101) {
        Mobile.aClass3_Sub28_Sub16Array2839 = null;
      }

      Mobile.aClass54Array2841 = null;
      Mobile.aClass94_2765 = null;
      Mobile.aClass93_2792 = null;
      Mobile.aClass3_Sub28_Sub16Array2839 = null;
      Mobile.quady1 = null;
  }

}
