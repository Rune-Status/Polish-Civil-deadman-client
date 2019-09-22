package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.statics.DummyClass4;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;
import java.util.Random;

public final class TextureSampler4 extends AbstractTextureSampler {

  private int anInt3219 = 204;
  private int anInt3222;
  private int anInt3223;
  private int anInt3224 = 81;
  private int[][] anIntArrayArray3225;
  private int anInt3229 = 1024;
  private int[] anIntArray3230;
  private int anInt3231;
  private int anInt3233 = 8;
  private int anInt3234 = 1024;
  private int anInt3235;
  private int anInt3236 = 409;
  private int[][] anIntArrayArray3240;
  private int anInt3242 = 4;

  public TextureSampler4() {
    super(0, true);
  }

  private void method263(int var1) {
    Random var2 = new Random(this.anInt3233);
    this.anInt3222 = 4096 / this.anInt3233;
    this.anInt3223 = this.anInt3224 / 2;
    this.anIntArrayArray3225 = new int[this.anInt3233][1 + this.anInt3242];
    int var4 = this.anInt3222 / 2;
    this.anIntArray3230 = new int[this.anInt3233 + 1];
    this.anIntArrayArray3240 = new int[this.anInt3233][this.anInt3242];
    this.anInt3235 = 4096 / this.anInt3242;
    this.anIntArray3230[0] = var1;
    int var3 = this.anInt3235 / 2;

    for (int var5 = 0; var5 < this.anInt3233; ++var5) {
      int var6;
      int var7;
      if (var5 > 0) {
        var6 = this.anInt3222;
        var7 = (GlobalStatics_8.method1603((byte) 59, 4096, var2) - 2048)
            * this.anInt3219
            >> 12;
        var6 += var7 * var4 >> 12;
        this.anIntArray3230[var5] = this.anIntArray3230[var5 - 1] + var6;
      }

      this.anIntArrayArray3225[var5][0] = 0;

      for (var6 = 0; var6 < this.anInt3242; ++var6) {
        if (var6 > 0) {
          var7 = this.anInt3235;
          int var8 =
              (-2048 + GlobalStatics_8.method1603((byte) -1, 4096, var2))
                  * this.anInt3236
                  >> 12;
          var7 += var3 * var8 >> 12;
          this.anIntArrayArray3225[var5][var6] =
              this.anIntArrayArray3225[var5][var6 - 1] + var7;
        }

        this.anIntArrayArray3240[var5][var6] = this.anInt3229 <= 0 ?
            4096 :
            4096 - GlobalStatics_8.method1603((byte) 33, this.anInt3229, var2);
      }

      this.anIntArrayArray3225[var5][this.anInt3242] = 4096;
    }

    this.anIntArray3230[this.anInt3233] = 4096;
  }

  public int[] method154(int var1, byte var2) {
    int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
    int var4;
    if (this.monoChromaticImageCache.aBoolean1580) {
      int var7 = 0;

      int var9;
      for (var9 = DummyClass4.anIntArray2999[var1] + this.anInt3231; var9 < 0;
          var9 += 4096) {
      }

      while (var9 > 4096) {
        var9 -= 4096;
      }

      while (this.anInt3233 > var7 && var9 >= this.anIntArray3230[var7]) {
        ++var7;
      }

      int var11 = var7 - 1;
      int var15 = this.anIntArray3230[var7];
      boolean var12 = (var7 & 1) == 0;
      int var16 = this.anIntArray3230[var7 - 1];
      if (var16 + this.anInt3223 < var9 && var15 - this.anInt3223 > var9) {
        for (var4 = 0; var4 < GlobalStatics_9.anInt1559; ++var4) {
          int var6 = 0;
          int var5 = var12 ? this.anInt3234 : -this.anInt3234;

          int var8;
          for (
              var8 =
                  GlobalStatics_9.anIntArray2125[var4] + (this.anInt3235 * var5
                      >> 12);
              var8 < 0; var8 += 4096) {
          }

          while (var8 > 4096) {
            var8 -= 4096;
          }

          while (this.anInt3242 > var6 &&
              var8 >= this.anIntArrayArray3225[var11][var6]) {
            ++var6;
          }

          int var14 = this.anIntArrayArray3225[var11][var6];
          int var10 = var6 - 1;
          int var13 = this.anIntArrayArray3225[var11][var10];
          if (var13 + this.anInt3223 < var8 && -this.anInt3223 + var14 > var8) {
            var3[var4] = this.anIntArrayArray3240[var11][var10];
          } else {
            var3[var4] = 0;
          }
        }
      } else {
        ArrayUtils.fill(var3, 0, GlobalStatics_9.anInt1559, 0);
      }
    }

    var4 = -48 % ((30 - var2) / 36);
    return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3) {
    if (var1 == 0) {
      this.anInt3242 = var2.readUnsignedByte();
    } else {
      if (var1 == 1) {
        this.anInt3233 = var2.readUnsignedByte();
      } else if (var1 != 2) {
        if (var1 == 3) {
          this.anInt3219 = var2.readUnsignedShort();
        } else {
          if (var1 == 4) {
            this.anInt3234 = var2.readUnsignedShort();
          } else {
            if (var1 == 5) {
              this.anInt3231 = var2.readUnsignedShort();
            } else {
              if (var1 == 6) {
                this.anInt3224 = var2.readUnsignedShort();
              } else {
                if (var1 == 7) {
                  this.anInt3229 = var2.readUnsignedShort();
                }
              }
            }
          }
        }
      } else {
        this.anInt3236 = var2.readUnsignedShort();
      }
    }

    if (!var3) {
      GameStringStatics.LANG_FRENCH = null;
    }
  }

  public void method158(int var1) {
    if (var1 != 16251) {
      this.method158(-93);
    }

    this.method263(0);
  }

}
