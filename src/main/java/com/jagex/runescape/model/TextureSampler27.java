package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.statics.DummyClass4;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler27 extends AbstractTextureSampler {

  private int anInt3085 = 10;
  private int anInt3086;
  private int[] anIntArray3089;
  private int[] anIntArray3091;
  private int anInt3093 = 2048;

  public TextureSampler27() {
    super(0, true);
  }

  private void method202(int var1) {
    if (var1 == 1) {
      int var2 = 0;
      this.anIntArray3091 = new int[this.anInt3085 + 1];
      int var3 = 4096 / this.anInt3085;
      this.anIntArray3089 = new int[this.anInt3085 + 1];
      int var4 = this.anInt3093 * var3 >> 12;

      for (int var5 = 0; this.anInt3085 > var5; ++var5) {
        this.anIntArray3089[var5] = var2;
        this.anIntArray3091[var5] = var2 + var4;
        var2 += var3;
      }

      this.anIntArray3089[this.anInt3085] = 4096;
      this.anIntArray3091[this.anInt3085] = this.anIntArray3091[0] + 4096;
    }
  }

  public int[] method154(int var1, byte var2) {
    int var4 = -12 / ((30 - var2) / 36);
    int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
    if (this.monoChromaticImageCache.aBoolean1580) {
      int var5 = DummyClass4.anIntArray2999[var1];
      int var7;
      if (this.anInt3086 == 0) {
        short var6 = 0;

        for (var7 = 0; this.anInt3085 > var7; ++var7) {
          if (this.anIntArray3089[var7] <= var5 && var5 < this.anIntArray3089[
              var7 + 1]) {
            if (var5 < this.anIntArray3091[var7]) {
              var6 = 4096;
            }
            break;
          }
        }

        ArrayUtils.fill(var3, 0, GlobalStatics_9.anInt1559, var6);
      } else {
        for (int var12 = 0; var12 < GlobalStatics_9.anInt1559; ++var12) {
          int var9 = GlobalStatics_9.anIntArray2125[var12];
          var7 = 0;
          int var10 = this.anInt3086;
          if (var10 == 1) {
            var7 = var9;
          } else if (var10 != 2) {
            if (var10 == 3) {
              var7 = (-var5 + var9 >> 1) + 2048;
            }
          } else {
            var7 = (var9 + var5 - 4096 >> 1) + 2048;
          }

          short var8 = 0;

          for (var10 = 0; var10 < this.anInt3085; ++var10) {
            if (this.anIntArray3089[var10] <= var7
                && var7 < this.anIntArray3089[var10
                + 1]) {
              if (var7 < this.anIntArray3091[var10]) {
                var8 = 4096;
              }
              break;
            }
          }

          var3[var12] = var8;
        }
      }
    }

    return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3) {
    if (var1 == 0) {
      this.anInt3085 = var2.readUnsignedByte();
    } else if (var1 != 1) {
      if (var1 == 2) {
        this.anInt3086 = var2.readUnsignedByte();
      }
    } else {
      this.anInt3093 = var2.readUnsignedShort();
    }

    if (!var3) {
      this.anIntArray3089 = null;
    }
  }

  public void method158(int var1) {
    if (var1 == 16251) {
      this.method202(1);
    }
  }

}
