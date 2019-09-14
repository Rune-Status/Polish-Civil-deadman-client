package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;

public final class TextureSampler17 extends AbstractTextureSampler {

  public static Deque stillGraphics = new Deque();
  public static int sceneHeight;
  public static int[] updatedMapIds;
  public static GameString COMMAND_WM3 = GameStringStatics.create("::wm3");
  public static boolean aBoolean3184 = true;
  public static int[] anIntArray3185 = new int[25];
  public static int anInt3187;
  private int anInt3174;
  private int anInt3175;
  private int anInt3176;
  private int anInt3178;
  private int anInt3180;
  private int anInt3182;
  private int anInt3186;
  private int anInt3188;
  private int anInt3189;


  public TextureSampler17() {
    super(1, false);
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if ((var1 == 0)) {
        this.anInt3175 = var2.method787((byte) 18);
      } else if ((var1 != 1)) {
        if ((var1 == 2)) {
          this.anInt3176 = (var2.readByte() << 12) / 100;
        }
      } else {
        this.anInt3178 = (var2.readByte() << 12) / 100;
      }

      if (!var3) {
        this.method240((byte) -79, -114, 127, 95);
      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        TextureSampler17.COMMAND_WM3 = null;
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) -118, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[][] var4 = this.method162(var2, 0, (byte) -72);
        assert var4 != null;
        assert var4 != null;
        int[] var5 = var4[0];
        int[] var6 = var4[1];
        int[] var7 = var4[2];
        int[] var9 = var3[1];
        int[] var10 = var3[2];
        int[] var8 = var3[0];

        for (int var11 = 0; SomethingLight0.anInt1559 > var11; ++var11) {
          this.method240((byte) -91, var5[var11], var6[var11], var7[var11]);
          this.anInt3188 += this.anInt3176;
          if (this.anInt3188 < 0) {
            this.anInt3188 = 0;
          }

          this.anInt3189 += this.anInt3178;
          if ((this.anInt3188 > 4096)) {
            this.anInt3188 = 4096;
          }

          if (this.anInt3189 < 0) {
            this.anInt3189 = 0;
          }

          if (this.anInt3189 > 4096) {
            this.anInt3189 = 4096;
          }

          for (
              this.anInt3180 += this.anInt3175; (this.anInt3180 < 0); this.anInt3180 += 4096) {
          }

          while ((this.anInt3180 > 4096)) {
            this.anInt3180 -= 4096;
          }

          this.method239(this.anInt3188, this.anInt3189, 107, this.anInt3180);
          var8[var11] = this.anInt3186;
          var9[var11] = this.anInt3174;
          var10[var11] = this.anInt3182;
        }
      }

      return var3;
  }

  private void method239(int var1, int var2, int var3, int var4) {
    int var6 = 32 / ((15 - var3) / 45);
      int var5 = var1 <= 2048 ? var1 * (4096 + var2) >> 12 : -(var1 * var2 >> 12) + var1 + var2;
      if ((var5 > 0)) {
        var4 *= 6;
        int var7 = -var5 + var1 + var1;
        int var9 = var4 >> 12;
        int var8 = (-var7 + var5 << 12) / var5;
        int var10 = var4 - (var9 << 12);
        int var11 = var5 * var8 >> 12;
        var11 = var11 * var10 >> 12;
        int var12 = var11 + var7;
        int var13 = -var11 + var5;
        if (var9 == 0) {
          this.anInt3182 = var7;
          this.anInt3186 = var5;
          this.anInt3174 = var12;
        } else if (var9 != 1) {
          if ((var9 == 2)) {
            this.anInt3186 = var7;
            this.anInt3174 = var5;
            this.anInt3182 = var12;
          } else {
            if (var9 == 3) {
              this.anInt3174 = var13;
              this.anInt3182 = var5;
              this.anInt3186 = var7;
            } else {
              if (var9 == 4) {
                this.anInt3182 = var5;
                this.anInt3186 = var12;
                this.anInt3174 = var7;
              } else {
                if ((var9 == 5)) {
                  this.anInt3174 = var7;
                  this.anInt3186 = var5;
                  this.anInt3182 = var13;
                }
              }
            }
          }
        } else {
          this.anInt3182 = var7;
          this.anInt3174 = var5;
          this.anInt3186 = var13;
        }
      } else {
        this.anInt3186 = this.anInt3174 = this.anInt3182 = var1;
      }
  }

  private void method240(byte var1, int var2, int var3, int var4) {
    int var5 = var2 > var3 ? var2 : var3;
      if (var1 >= -54) {
        this.method166(38, -39);
      }

      var5 = (var4 <= var5) ? var5 : var4;
      int var6 = var3 > var2 ? var2 : var3;
      var6 = (var4 >= var6) ? var6 : var4;
      int var7 = -var6 + var5;
      if (var7 > 0) {
        int var9 = (var5 - var3 << 12) / var7;
        int var8 = (var5 - var2 << 12) / var7;
        int var10 = (-var4 + var5 << 12) / var7;
        if (var2 == var5) {
          this.anInt3180 = (var6 == var3) ? var10 + 20480 : 4096 - var9;
        } else {
          if ((var5 == var3)) {
            this.anInt3180 = (var6 == var4) ? var8 + 4096 : -var10 + 12288;
          } else {
            this.anInt3180 = var6 != var2 ? -var8 + 20480 : 12288 + var9;
          }
        }

        this.anInt3180 /= 6;
      } else {
        this.anInt3180 = 0;
      }

      this.anInt3188 = (var6 + var5) / 2;
      if ((this.anInt3188 > 0) && this.anInt3188 < 4096) {
        this.anInt3189 =
          (var7 << 12) / (this.anInt3188 > 2048 ? 8192 - 2 * this.anInt3188 :
              this.anInt3188 * 2);
      } else {
        this.anInt3189 = 0;
      }
  }

  public static void method241(byte var0) {
    TextureSampler17.updatedMapIds = null;
      TextureSampler17.stillGraphics = null;

      TextureSampler17.anIntArray3185 = null;
      TextureSampler17.COMMAND_WM3 = null;
  }

}
