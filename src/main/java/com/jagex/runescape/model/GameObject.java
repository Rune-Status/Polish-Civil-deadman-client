package com.jagex.runescape.model;

import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.SomethingShadows;
import com.jagex.runescape.scene.SceneNode;
import com.jagex.runescape.settings.SettingsStatics;
import com.jagex.runescape.sprite.SoftwareIndexedColorSprite;
import com.jagex.runescape.statics.DummyClass0;
import com.jagex.runescape.statics.DummyClass11;
import com.jagex.runescape.statics.DummyClass43;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_4;
import com.jagex.runescape.statics.GlobalStatics_5;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;
import java.util.Arrays;

public final class GameObject extends SceneNode {

  private int anInt2720;
  private boolean aBoolean2721;
  private AnimationSequence aClass142_2722;
  private final int anInt2724;
  private int anInt2725;
  private int anInt2726;
  private boolean aBoolean2728 = true;
  private final int anInt2729;
  private final int anInt2730;
  private final int anInt2732;
  private int anInt2733;
  private final int anInt2734;
  private final int anInt2736;
  private SoftwareIndexedColorSprite aClass109_Sub1_2738;
  private final int anInt2741 = -32768;
  private DummyClass0 aClass127_Sub1_2742;
  private int anInt2746;
  private int anInt2748;
  private int anInt2749;
  private int anInt2750 = -1;
  private int anInt2752 = -1;

  public GameObject(int var1, int var2, int var3, int var4, int var5, int var6,
      int var7,
      boolean var8,
      SceneNode var9) {
    this.anInt2732 = var4;
    this.anInt2724 = var3;
    this.anInt2736 = var5;
    this.anInt2734 = var2;
    this.anInt2729 = var1;
    this.anInt2730 = var6;
    GameObjectConfig var10;
    if (GlRenderer.USE_OPENGL && var9 != null) {
      if (var9 instanceof GameObject) {
        ((GameObject) var9).method1960(-1);
      } else {
        var10 = DummyClass11.method2207(4, this.anInt2729);
        if (var10.anIntArray1524 != null) {
          var10 = var10.method1685(0);
        }

        if (var10 != null) {
          GlobalStatics_10.method840(var10, (byte) -76, 0, this.anInt2724, 0,
              this.anInt2734,
              this.anInt2736, this.anInt2730, this.anInt2732);
        }
      }
    }

    if (var7 != -1) {
      this.aClass142_2722 = GlobalStatics_8.method45(var7, (byte) -20);
      this.anInt2726 = 0;
      if (this.aClass142_2722.anIntArray1851.length <= 1) {
        this.anInt2733 = 0;
      } else {
        this.anInt2733 = 1;
      }

      this.anInt2746 = 1;
      this.anInt2749 = -1 + GlobalStatics_4.updateCycle;
      if (this.aClass142_2722.anInt1845 == 0 && var9 != null
          && var9 instanceof GameObject) {
        GameObject var12 = (GameObject) var9;
        if (this.aClass142_2722 == var12.aClass142_2722) {
          this.anInt2726 = var12.anInt2726;
          this.anInt2749 = var12.anInt2749;
          this.anInt2746 = var12.anInt2746;
          this.anInt2733 = var12.anInt2733;
          return;
        }
      }

      if (var8 && this.aClass142_2722.anInt1865 != -1) {
        this.anInt2726 =
            (int) (Math.random() * this.aClass142_2722.anIntArray1851.length);
        this.anInt2733 = this.anInt2726 + 1;
        if (this.anInt2733 >= this.aClass142_2722.anIntArray1851.length) {
          this.anInt2733 -= this.aClass142_2722.anInt1865;
          if (this.anInt2733 < 0
              || this.anInt2733 >= this.aClass142_2722.anIntArray1851.length) {
            this.anInt2733 = -1;
          }
        }

        this.anInt2746 = 1 + (int) (Math.random()
            * this.aClass142_2722.anIntArray1869[this.anInt2726]);
        this.anInt2749 = -this.anInt2746 + GlobalStatics_4.updateCycle;
      }
    }

    if (GlRenderer.USE_OPENGL && var9 != null) {
      this.method1962(true, -2);
    }

    if (var9 == null) {
      var10 = DummyClass11.method2207(4, this.anInt2729);
      if (var10.anIntArray1524 != null) {
        this.aBoolean2721 = true;
      }
    }
  }

  public void method1867(int var1, int var2, int var3, int var4, int var5) {
    if (GlRenderer.USE_OPENGL) {
      this.method1962(true, -2);
    } else {
      this.method1961(var5, var4, -101);
    }
  }

  public void draw(int var1, int var2, int var3, int var4, int var5, int var6,
      int var7,
      int var8,
      long var9,
      int var11) {
    SceneNode var13 = this.method1963(3);
    if (var13 != null) {
      var13.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11
      );
    }
  }

  public int getMinimumY() {
    return this.anInt2741;
  }

  public void method1960(int var1) {
    if (this.aClass109_Sub1_2738 != null) {
      SomethingShadows.method2047(this.aClass109_Sub1_2738, this.anInt2725,
          this.anInt2720,
          this.anInt2748);
    }

    this.anInt2750 = -1;
    this.anInt2752 = var1;
    this.aClass109_Sub1_2738 = null;
  }

  protected void finalize() {
  }

  private void method1961(int var1, int var2, int var3) {
    if (this.aClass142_2722 != null) {
      int var4 = GlobalStatics_4.updateCycle - this.anInt2749;
      if (var4 > 100 && this.aClass142_2722.anInt1865 > 0) {
        int var5;
        for (
            var5 = this.aClass142_2722.anIntArray1851.length
                - this.aClass142_2722.anInt1865;
            this.anInt2726 < var5
                && this.aClass142_2722.anIntArray1869[this.anInt2726] < var4;
            ++this.anInt2726) {
          var4 -= this.aClass142_2722.anIntArray1869[this.anInt2726];
        }

        if (this.anInt2726 >= var5) {
          int var6 = 0;

          for (int var7 = var5;
              this.aClass142_2722.anIntArray1851.length > var7; ++var7) {
            var6 += this.aClass142_2722.anIntArray1869[var7];
          }

          var4 %= var6;
        }

        this.anInt2733 = 1 + this.anInt2726;
        if (this.anInt2733 >= this.aClass142_2722.anIntArray1851.length) {
          this.anInt2733 -= this.aClass142_2722.anInt1865;
          if (this.anInt2733 < 0
              || this.aClass142_2722.anIntArray1851.length <= this.anInt2733) {
            this.anInt2733 = -1;
          }
        }
      }

      while (var4 > this.aClass142_2722.anIntArray1869[this.anInt2726]) {
        GlobalStatics_4
            .method1470(var1, this.aClass142_2722, 183921384, var2, false,
                this.anInt2726);
        var4 -= this.aClass142_2722.anIntArray1869[this.anInt2726];
        ++this.anInt2726;
        if (this.aClass142_2722.anIntArray1851.length <= this.anInt2726) {
          this.anInt2726 -= this.aClass142_2722.anInt1865;
          if (this.anInt2726 < 0
              || this.aClass142_2722.anIntArray1851.length <= this.anInt2726) {
            this.aClass142_2722 = null;
            break;
          }
        }

        this.anInt2733 = this.anInt2726 + 1;
        if (this.aClass142_2722.anIntArray1851.length <= this.anInt2733) {
          this.anInt2733 -= this.aClass142_2722.anInt1865;
          if (this.anInt2733 < 0
              || this.anInt2733 >= this.aClass142_2722.anIntArray1851.length) {
            this.anInt2733 = -1;
          }
        }
      }

      this.anInt2746 = var4;
      this.anInt2749 = -var4 + GlobalStatics_4.updateCycle;
    }
  }

  private SceneNode method1962(boolean var1, int var2) {
    boolean var3 = !Arrays.deepEquals(DummyClass43.somethingHeightMap,
        GlobalStatics_4.heightMap);
    GameObjectConfig var4 = DummyClass11.method2207(var2 + 6, this.anInt2729);
    int var5 = var4.anInt1531;
    if (var4.anIntArray1524 != null) {
      var4 = var4.method1685(0);
    }

    if (var4 == null) {
      if (GlRenderer.USE_OPENGL && !var3) {
        this.method1960(-1);
      }

      return null;
    } else {
      int var6;
      if (GlobalStatics_5.gameId != 0 && this.aBoolean2721 && (
          this.aClass142_2722 == null
              || this.aClass142_2722.anInt1864 != var4.anInt1531)) {
        var6 = var4.anInt1531;
        if (var4.anInt1531 == -1) {
          var6 = var5;
        }

        if (var6 == -1) {
          this.aClass142_2722 = null;
        } else {
          this.aClass142_2722 = GlobalStatics_8.method45(var6, (byte) -20);
        }

        if (this.aClass142_2722 != null) {
          if (var4.aBoolean1492 && this.aClass142_2722.anInt1865 != -1) {
            this.anInt2726 =
                (int) (Math.random()
                    * this.aClass142_2722.anIntArray1851.length);
            this.anInt2749 -=
                (int) (Math.random()
                    * this.aClass142_2722.anIntArray1869[this.anInt2726]);
          } else {
            this.anInt2726 = 0;
            this.anInt2749 = GlobalStatics_4.updateCycle - 1;
          }
        }
      }

      var6 = this.anInt2724 & 3;
      int var7;
      int var8;
      if (~var6 != var2 && var6 != 3) {
        var7 = var4.anInt1480;
        var8 = var4.anInt1485;
      } else {
        var8 = var4.anInt1480;
        var7 = var4.anInt1485;
      }

      int var10 = this.anInt2736 + (1 + var7 >> 1);
      int var9 = (var7 >> 1) + this.anInt2736;
      int var11 = (var8 >> 1) + this.anInt2730;
      int var12 = (var8 + 1 >> 1) + this.anInt2730;
      this.method1961(128 * var11, var9 * 128, -101);
      boolean var13 =
          !var3 && var4.aBoolean1503 && (var4.anInt1527 != this.anInt2750
              ||
              (this.anInt2726 != this.anInt2752
                  || this.aClass142_2722 != null && (
                  this.aClass142_2722.aBoolean1872 || GlobalStatics_9.tweening)
                  && this.anInt2726 != this.anInt2733)
                  && SettingsStatics.anInt1137 >= 2);
      if (var1 && !var13) {
        return null;
      } else {
        int[][] var14 = GlobalStatics_4.heightMap[this.anInt2732];
        int var15 =
            var14[var10][var12] + var14[var9][var12] + var14[var9][var11]
                + var14[var10][var11]
                >> 2;
        int var16 = (var7 << 6) + (this.anInt2736 << 7);
        int var17 = (var8 << 6) + (this.anInt2730 << 7);
        int[][] var18 = null;
        if (var3) {
          var18 = DummyClass43.somethingHeightMap[0];
        } else {
          if (this.anInt2732 < 3) {
            var18 = GlobalStatics_4.heightMap[1 + this.anInt2732];
          }
        }

        if (GlRenderer.USE_OPENGL && var13) {
          SomethingShadows.method2047(this.aClass109_Sub1_2738, this.anInt2725,
              this.anInt2720,
              this.anInt2748);
        }

        boolean var19 = this.aClass109_Sub1_2738 == null;
        SceneShadowMap var20;
        if (this.aClass142_2722 != null) {
          var20 = var4.method1697(var17, var16,
              var19 ? GlobalStatics_9.aClass109_Sub1_2631
                  : this.aClass109_Sub1_2738, var15,
              this.aClass142_2722, this.anInt2724, var14, var13,
              this.anInt2726, var2 ^ -8310,
              var18, this.anInt2733, this.anInt2734, this.anInt2746);
        } else {
          var20 =
              var4.method1696(this.anInt2724, var16, var14, this.anInt2734,
                  var15, var18, false,
                  var19 ? GlobalStatics_9.aClass109_Sub1_2631
                      : this.aClass109_Sub1_2738,
                  (byte) -128, var13, var17);
        }

        if (var20 == null) {
          return null;
        } else {
          if (GlRenderer.USE_OPENGL && var13) {
            if (var19) {
              GlobalStatics_9.aClass109_Sub1_2631 = var20.shadow;
            }

            int var21 = 0;
            if (this.anInt2732 != 0) {
              int[][] var22 = GlobalStatics_4.heightMap[0];
              var21 = var15 - (var22[var10][var11] + var22[var9][var11] - (
                  -var22[var9][var12]
                      - var22[var10][var12]) >> 2);
            }

            SoftwareIndexedColorSprite var24 = var20.shadow;
            if (this.aBoolean2728 && SomethingShadows
                .method2049(var24, var16, var21, var17)) {
              this.aBoolean2728 = false;
            }

            if (!this.aBoolean2728) {
              SomethingShadows.method2051(var24, var16, var21, var17);
              this.aClass109_Sub1_2738 = var24;
              this.anInt2748 = var17;
              if (var19) {
                GlobalStatics_9.aClass109_Sub1_2631 = null;
              }

              this.anInt2720 = var21;
              this.anInt2725 = var16;
            }

            this.anInt2750 = var4.anInt1527;
            this.anInt2752 = this.anInt2726;
          }

          return var20.node;
        }
      }
    }
  }

  public SceneNode method1963(int var1) {
    if (var1 != 3) {
      GlobalStatics_8.aClass94_2731 = null;
    }

    return this.method1962(false, var1 - 5);
  }

}
