package com.jagex.runescape;

import com.jagex.runescape.buffer.BufferStatics;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.opengl.DummyClass16;
import com.jagex.runescape.opengl.GlModel;
import com.jagex.runescape.opengl.GlRenderer;
import java.util.Arrays;

public final class GameObject extends SceneNode {

  private static GameString aClass94_2731 = GameStringStatics.create("wave:");
  private static GameString aClass94_2739 = GameStringStatics.create("Drop");
  public static GameString aClass94_2723 = GameStringStatics.create("<col=c0ff00>");
  public static FileUnpacker widgets;
  public static GameString aClass94_2735 = GameStringStatics.create(")4");
  public static int anInt2737;
  public static volatile int anInt2743;
  public static int plane;
  public static GameString aClass94_2740 = GameObject.aClass94_2731;
  public static GameString aClass94_2751 = GameObject.aClass94_2731;
  public static GameString OPTION_DROP = GameObject.aClass94_2739;
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
      SceneNode var9 ) {
    this.anInt2732 = var4;
      this.anInt2724 = var3;
      this.anInt2736 = var5;
      this.anInt2734 = var2;
      this.anInt2729 = var1;
      this.anInt2730 = var6;
      GameObjectConfig var10;
      if (GlRenderer.useOpenGlRenderer && var9 != null) {
        if (var9 instanceof GameObject) {
          ((GameObject) var9).method1960(-1);
        } else {
          var10 = DummyClass11.method2207(4, this.anInt2729);
          if (var10.anIntArray1524 != null) {
            var10 = var10.method1685(0);
          }

          if (var10 != null) {
            FileSystem.method840(var10, (byte) -76, 0, this.anInt2724, 0,
                this.anInt2734,
                this.anInt2736, this.anInt2730, this.anInt2732);
          }
        }
      }

      if (var7 != -1) {
        this.aClass142_2722 = GameClient.method45(var7, (byte) -20);
        this.anInt2726 = 0;
        if (this.aClass142_2722.anIntArray1851.length <= 1) {
          this.anInt2733 = 0;
        } else {
          this.anInt2733 = 1;
        }

        this.anInt2746 = 1;
        this.anInt2749 = -1 + AbstractGameWorld.updateCycle;
        if ((this.aClass142_2722.anInt1845 == 0) && var9 != null && var9 instanceof GameObject) {
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
          if ((this.anInt2733 >= this.aClass142_2722.anIntArray1851.length)) {
            this.anInt2733 -= this.aClass142_2722.anInt1865;
            if (this.anInt2733 < 0
              || (this.anInt2733 >= this.aClass142_2722.anIntArray1851.length)) {
              this.anInt2733 = -1;
            }
          }

          this.anInt2746 = 1 + ((int) (Math.random()
            * this.aClass142_2722.anIntArray1869[this.anInt2726]));
          this.anInt2749 = -this.anInt2746 + AbstractGameWorld.updateCycle;
        }
      }

      if (GlRenderer.useOpenGlRenderer && var9 != null) {
        this.method1962(true, -2);
      }

      if (var9 == null) {
        var10 = DummyClass11.method2207(4, this.anInt2729);
        if (var10.anIntArray1524 != null) {
          this.aBoolean2721 = true;
        }
      }
  }

  public void method1867(int var1, int var2, int var3, int var4, int var5 ) {
    if (GlRenderer.useOpenGlRenderer) {
        this.method1962(true, -2);
      } else {
        this.method1961(var5, var4, -101);
      }
  }

  public void draw(int var1, int var2, int var3, int var4, int var5, int var6,
      int var7,
      int var8,
      long var9,
      int var11,
      DummyClass0 var12 ) {
    SceneNode var13 = this.method1963(3);
      if (var13 != null) {
        var13.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11,
            this.aClass127_Sub1_2742);
      }
  }

  public int getMinimumY() {
    return this.anInt2741;
  }

  public void method1960(int var1 ) {
    if (this.aClass109_Sub1_2738 != null) {
        DummyClass16.method2047(this.aClass109_Sub1_2738, this.anInt2725,
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
        int var4 = AbstractGameWorld.updateCycle - this.anInt2749;
        if ((var4 > 100) && this.aClass142_2722.anInt1865 > 0) {
          int var5;
          for (
            var5 = this.aClass142_2722.anIntArray1851.length - this.aClass142_2722.anInt1865;
            (this.anInt2726 < var5)
              && (this.aClass142_2722.anIntArray1869[this.anInt2726] < var4); ++this.anInt2726) {
            var4 -= this.aClass142_2722.anIntArray1869[this.anInt2726];
          }

          if ((this.anInt2726 >= var5)) {
            int var6 = 0;

            for (int var7 = var5; this.aClass142_2722.anIntArray1851.length > var7; ++var7) {
              var6 += this.aClass142_2722.anIntArray1869[var7];
            }

            var4 %= var6;
          }

          this.anInt2733 = 1 + this.anInt2726;
          if (this.anInt2733 >= this.aClass142_2722.anIntArray1851.length) {
            this.anInt2733 -= this.aClass142_2722.anInt1865;
            if ((this.anInt2733 < 0)
              || this.aClass142_2722.anIntArray1851.length <= this.anInt2733) {
              this.anInt2733 = -1;
            }
          }
        }

        while (var4 > this.aClass142_2722.anIntArray1869[this.anInt2726]) {
          SocketStream.method1470(var1, this.aClass142_2722, 183921384, var2, false,
              this.anInt2726);
          var4 -= this.aClass142_2722.anIntArray1869[this.anInt2726];
          ++this.anInt2726;
          if ((this.aClass142_2722.anIntArray1851.length <= this.anInt2726)) {
            this.anInt2726 -= this.aClass142_2722.anInt1865;
            if (this.anInt2726 < 0
              || (this.aClass142_2722.anIntArray1851.length <= this.anInt2726)) {
              this.aClass142_2722 = null;
              break;
            }
          }

          this.anInt2733 = this.anInt2726 + 1;
          if ((this.aClass142_2722.anIntArray1851.length <= this.anInt2733)) {
            this.anInt2733 -= this.aClass142_2722.anInt1865;
            if ((this.anInt2733 < 0)
              || (this.anInt2733 >= this.aClass142_2722.anIntArray1851.length)) {
              this.anInt2733 = -1;
            }
          }
        }

        this.anInt2746 = var4;
        this.anInt2749 = -var4 + AbstractGameWorld.updateCycle;
      }
  }

  private SceneNode method1962(boolean var1, int var2) {
    boolean var3 = !Arrays.deepEquals(DummyClass43.somethingHeightMap,
          AbstractGameWorld.heightMap);
      GameObjectConfig var4 = DummyClass11.method2207(var2 + 6, this.anInt2729);
      int var5 = var4.anInt1531;
      if (var4.anIntArray1524 != null) {
        var4 = var4.method1685(0);
      }

      if (var4 == null) {
        if (GlRenderer.useOpenGlRenderer && !var3) {
          this.method1960(-1);
        }

        return null;
      } else {
        int var6;
        if (AbstractImageProducer.gameId != 0 && this.aBoolean2721 && (
            this.aClass142_2722 == null
                || (this.aClass142_2722.anInt1864 != var4.anInt1531))) {
          var6 = var4.anInt1531;
          if ((var4.anInt1531 == -1)) {
            var6 = var5;
          }

          if ((var6 == -1)) {
            this.aClass142_2722 = null;
          } else {
            this.aClass142_2722 = GameClient.method45(var6, (byte) -20);
          }

          if (this.aClass142_2722 != null) {
            if (var4.aBoolean1492 && this.aClass142_2722.anInt1865 != -1) {
              this.anInt2726 =
                (int) (Math.random() * this.aClass142_2722.anIntArray1851.length);
              this.anInt2749 -=
                (int) (Math.random() * this.aClass142_2722.anIntArray1869[this.anInt2726]);
            } else {
              this.anInt2726 = 0;
              this.anInt2749 = AbstractGameWorld.updateCycle - 1;
            }
          }
        }

        var6 = this.anInt2724 & 3;
        int var7;
        int var8;
        if (~var6 != var2 && (var6 != 3)) {
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
        boolean var13 = !var3 && var4.aBoolean1503 && (var4.anInt1527 != this.anInt2750
            ||
          ((this.anInt2726 != this.anInt2752) || this.aClass142_2722 != null && (
              this.aClass142_2722.aBoolean1872 || MonoChromaticImageBuffer.tweening)
            && (this.anInt2726 != this.anInt2733)) && (HashTableIterator.anInt1137 >= 2));
        if (var1 && !var13) {
          return null;
        } else {
          int[][] var14 = AbstractGameWorld.heightMap[this.anInt2732];
          int var15 =
            var14[var10][var12] + var14[var9][var12] + var14[var9][var11] + var14[var10][var11]
              >> 2;
          int var16 = (var7 << 6) + (this.anInt2736 << 7);
          int var17 = (var8 << 6) + (this.anInt2730 << 7);
          int[][] var18 = null;
          if (var3) {
            var18 = DummyClass43.somethingHeightMap[0];
          } else {
            if ((this.anInt2732 < 3)) {
              var18 = AbstractGameWorld.heightMap[1 + this.anInt2732];
            }
          }

          if (GlRenderer.useOpenGlRenderer && var13) {
            DummyClass16.method2047(this.aClass109_Sub1_2738, this.anInt2725,
                this.anInt2720,
                this.anInt2748);
          }

          boolean var19 = this.aClass109_Sub1_2738 == null;
          SceneShadowMap var20;
          if (this.aClass142_2722 != null) {
            var20 = var4.method1697(var17, var16,
              !var19 ? this.aClass109_Sub1_2738 : SomethingTexture.aClass109_Sub1_2631, var15,
                this.aClass142_2722, this.anInt2724, var14, var13,
                this.anInt2726, var2 ^ -8310,
              var18, this.anInt2733, this.anInt2734, this.anInt2746);
          } else {
            var20 =
              var4.method1696(this.anInt2724, var16, var14, this.anInt2734, var15, var18, false,
                var19 ? SomethingTexture.aClass109_Sub1_2631 : this.aClass109_Sub1_2738,
                (byte) -128, var13, var17);
          }

          if (var20 == null) {
            return null;
          } else {
            if (GlRenderer.useOpenGlRenderer && var13) {
              if (var19) {
                SomethingTexture.aClass109_Sub1_2631 = var20.shadow;
              }

              int var21 = 0;
              if ((this.anInt2732 != 0)) {
                int[][] var22 = AbstractGameWorld.heightMap[0];
                var21 = var15 - (var22[var10][var11] + var22[var9][var11] - (-var22[var9][var12]
                  - var22[var10][var12]) >> 2);
              }

              SoftwareIndexedColorSprite var24 = var20.shadow;
              if (this.aBoolean2728 && DummyClass16.method2049(var24, var16, var21, var17)) {
                this.aBoolean2728 = false;
              }

              if (!this.aBoolean2728) {
                DummyClass16.method2051(var24, var16, var21, var17);
                this.aClass109_Sub1_2738 = var24;
                this.anInt2748 = var17;
                if (var19) {
                  SomethingTexture.aClass109_Sub1_2631 = null;
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

  public SceneNode method1963(int var1 ) {
    if (var1 != 3) {
        GameObject.aClass94_2731 = null;
      }

      return this.method1962(false, var1 - 5);
  }

  public static AbstractModel method1957(int var0, boolean var1, AnimationSequence var2, int var3,
                                        int var4, int var5, int var6, int var7, AbstractModel var8,
                                        int var9, int var10, int var11, int var12, byte var13) {
    long var14 =
        ((long) var4 << 48) + (var7 + (var0 << 16) + (var12 << 24)) + ((long) var6 << 32);
      AbstractModel var16 = (AbstractModel) DirectImageProducer.aClass93_2982.get(var14);
      int var21;
      int var23;
      int var25;
      int var24;
      int var28;
      if (var16 == null) {
        byte var17;
        if (var7 == 1) {
          var17 = 9;
        } else if (var7 == 2) {
          var17 = 12;
        } else if ((var7 != 3)) {
          if (var7 == 4) {
            var17 = 18;
          } else {
            var17 = 21;
          }
        } else {
          var17 = 15;
        }

        int[] var19 = {64, 96, 128};
        byte var18 = 3;
        Model var20 = new Model(1 + var18 * var17, -var17 + var17 * var18 * 2, 0);
        var21 = var20.addVertex(0, 0, 0);
        int[][] var22 = new int[var18][var17];

        for (var23 = 0; (var23 < var18); ++var23) {
          var24 = var19[var23];
          var25 = var19[var23];

          for (int var26 = 0; var26 < var17; ++var26) {
            int var27 = (var26 << 11) / var17;
            int var29 = var5 + (DummyClass40.COSINE_TABLE[var27] * var25) >> 16;
            var28 = var3 + DummyClass40.SINE_TABLE[var27] * var24 >> 16;
            var22[var23][var26] = var20.addVertex(var28, 0, var29);
          }
        }

        for (var23 = 0; var23 < var18; ++var23) {
          var24 = (256 * var23 + 128) / var18;
          var25 = 256 - var24;
          byte var38 = (byte) (var12 * var24 + var0 * var25 >> 8);
          short var39 = (short) (((var6 & 127) * var25 + (127 & var4) * var24 & 32512) + (
            var25 * (var6 & 896) + var24 * (var4 & 896) & 229376) + (
            var24 * (var4 & '\ufc00') + ('\ufc00' & var6) * var25 & 16515072) >> 8);

          for (var28 = 0; var28 < var17; ++var28) {
            if (var23 == 0) {
              var20.appendFace(var21, var22[0][(1 + var28) % var17], var22[0][var28], (byte) 1,
                var39, var38);
            } else {
              var20.appendFace(var22[var23 - 1][var28], var22[var23 - 1][(var28 + 1) % var17],
                var22[var23][(var28 + 1) % var17], (byte) 1, var39, var38);
              var20.appendFace(var22[-1 + var23][var28], var22[var23][(1 + var28) % var17],
                var22[var23][var28], (byte) 1, var39, var38);
            }
          }
        }

        var16 = var20.method2008(64, 768, -50, -10, -50);
        DirectImageProducer.aClass93_2982.get((byte) -125, var16, var14);
      }

      int var32 = var7 * 64 - 1;
      if (var13 == -49) {
        int var33 = -var32;
        int var31 = -var32;
        int var34 = var32;
        int var35 = var8.method1884();
        AnimationSomething var40 = null;
        var23 = var8.method1883();
        var24 = var8.method1898();
        var25 = var8.method1872();
        if (var2 != null) {
          var10 = var2.anIntArray1851[var10];
          var40 = AreaSoundEffect.method133(var10 >> 16, 0);
          var10 &= '\uffff';
        }

        var21 = var32;
        if (var1) {
          if (var9 > 1664 || var9 < 384) {
            var31 -= 128;
          }

          if (var9 > 1152 && var9 < 1920) {
            var34 = var32 + 128;
          }

          if (var9 > 640 && (var9 < 1408)) {
            var21 = var32 + 128;
          }

          if ((var9 > 128) && (var9 < 896)) {
            var33 -= 128;
          }
        }

        if (var21 < var25) {
          var25 = var21;
        }

        if (var34 < var23) {
          var23 = var34;
        }

        if (var40 == null) {
          var16 = var16.method1882(true, true, true);
          var16.scale((var23 - var35) / 2, 128, (var25 - var24) / 2);
          var16.method1897((var35 + var23) / 2, 0, (var24 + var25) / 2);
        } else {
          var16 = var16.method1882(!var40.method559(1317095745, var10),
              !var40.method561(var10, (byte) 115), true);
          var16.scale((var23 - var35) / 2, 128, (var25 - var24) / 2);
          var16.method1897((var35 + var23) / 2, 0, (var24 + var25) / 2);
          var16.method1877(var40, var10);
        }

        if (var9 != 0) {
          var16.method1876(var9);
        }

        if (GlRenderer.useOpenGlRenderer) {
          GlModel var36 = (GlModel) var16;
          if ((BufferData
              .method1736(GameWorldSomething.currentPlane, var13 ^ -50,
                  var3 + var35,
                  var24 + var5) != var11) ||
              (BufferData
                  .method1736(GameWorldSomething.currentPlane, 1, var23 + var3,
                      var5 + var25) != var11)) {
            for (var28 = 0; var28 < var36.vertexCCC; ++var28) {
              var36.vy[var28] += -var11 + BufferData
                  .method1736(GameWorldSomething.currentPlane,
                      ObjectCache.bitXor(var13, -50), var36.vx[var28] + var3,
                      var5 + var36.vz[var28]);
            }

            var36.aClass6_3835.aBoolean98 = false;
            var36.vertexPositionData.updated = false;
          }
        } else {
          SoftwareModel var37 = (SoftwareModel) var16;
          if (
              (BufferData
                  .method1736(GameWorldSomething.currentPlane, 1, var3 + var35,
                      var5 + var24) != var11) || var11 != BufferData
                  .method1736(GameWorldSomething.currentPlane, 1,
                      var3 + var23, var5 + var25)) {
            for (var28 = 0; var37.anInt3891 > var28; ++var28) {
              var37.anIntArray3883[var28] +=
                  -var11 + BufferData
                      .method1736(GameWorldSomething.currentPlane, 1,
                          var3 + var37.anIntArray3885[var28],
                          var5 + var37.anIntArray3895[var28]);
            }

            var37.aBoolean3897 = false;
          }
        }

        return var16;
      } else {
        return null;
      }
  }

  public static void method1958(int var0) {
    GameObject.aClass94_2751 = null;
      GameObject.OPTION_DROP = null;
      GameObject.aClass94_2723 = null;
      GameObject.widgets = null;
      GameObject.aClass94_2731 = null;
      if (var0 != 2) {
        GameObject.method1958(64);
      }

      GameObject.aClass94_2740 = null;
      BufferStatics.aByteArrayArray2747 = null;
      GameObject.aClass94_2735 = null;
      GameObject.aClass94_2739 = null;
  }

  public static void method1959(int var0, int var1, int var2, boolean var3) {
    if ((var2 >= 8000) && var2 <= '\ubb80') {
        AudioStreamEncoder4.anInt3507 = var1;
        if (var0 != 256) {
          GameObject.OPTION_DROP = null;
        }

        GlobalStatics_0.stereo = var3;
        DummyClass60.sampleRate = var2;
      } else {
        throw new IllegalArgumentException();
      }
  }

  public static void method1964(boolean var0) {
    int var1 = SpotAnimationConfig.gameBuffer.readBits(8);
      int var2;
      if (DummyClass13.anInt2022 > var1) {
        for (var2 = var1; (var2 < DummyClass13.anInt2022); ++var2) {
          VariableUpdate.anIntArray2292[DummyClass17.anInt1829++] =
            DummyClass42.anIntArray887[var2];
        }
      }

      if ((var1 <= DummyClass13.anInt2022)) {
        DummyClass13.anInt2022 = 0;
        var2 = 0;
        if (var0) {
          GameObject.method1959(-121, -69, 115, false);
        }

        for (; (var2 < var1); ++var2) {
          int var3 = DummyClass42.anIntArray887[var2];
          Player var4 = TextureSampler0.players[var3];
          int var5 = SpotAnimationConfig.gameBuffer.readBits(1);
          if ((var5 == 0)) {
            DummyClass42.anIntArray887[DummyClass13.anInt2022++] = var3;
            var4.anInt2838 = AbstractGameWorld.updateCycle;
          } else {
            int var6 = SpotAnimationConfig.gameBuffer.readBits(2);
            if (var6 == 0) {
              DummyClass42.anIntArray887[DummyClass13.anInt2022++] = var3;
              var4.anInt2838 = AbstractGameWorld.updateCycle;
              DummyClass60.anIntArray441[OndemandRequester.anInt997++] = var3;
            } else {
              int var7;
              int var8;
              if ((var6 == 1)) {
                DummyClass42.anIntArray887[DummyClass13.anInt2022++] = var3;
                var4.anInt2838 = AbstractGameWorld.updateCycle;
                var7 = SpotAnimationConfig.gameBuffer.readBits(3);
                var4.method1968(1, (byte) 46, var7);
                var8 = SpotAnimationConfig.gameBuffer.readBits(1);
                if ((var8 == 1)) {
                  DummyClass60.anIntArray441[OndemandRequester.anInt997++] = var3;
                }
              } else {
                if ((var6 == 2)) {
                  DummyClass42.anIntArray887[DummyClass13.anInt2022++] = var3;
                  var4.anInt2838 = AbstractGameWorld.updateCycle;
                  if (SpotAnimationConfig.gameBuffer.readBits(1) == 1) {
                    var7 = SpotAnimationConfig.gameBuffer.readBits(3);
                    var4.method1968(2, (byte) -92, var7);
                    var8 = SpotAnimationConfig.gameBuffer.readBits(3);
                    var4.method1968(2, (byte) 88, var8);
                  } else {
                    var7 = SpotAnimationConfig.gameBuffer.readBits(3);
                    var4.method1968(0, (byte) 113, var7);
                  }

                  var7 = SpotAnimationConfig.gameBuffer.readBits(1);
                  if (var7 == 1) {
                    DummyClass60.anIntArray441[OndemandRequester.anInt997++] = var3;
                  }
                } else {
                  if ((var6 == 3)) {
                    VariableUpdate.anIntArray2292[DummyClass17.anInt1829++] = var3;
                  }
                }
              }
            }
          }
        }

      } else {
        throw new RuntimeException("gppov1");
      }
  }

}
