package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.DummyClass55;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;
import java.util.Random;

public final class TextureSampler38 extends AbstractTextureSampler {

  private int anInt3444;
  private int anInt3447 = 2000;
  private int anInt3450 = 4096;
  private int anInt3451 = 16;
  private int anInt3454;

  public TextureSampler38() {
    super(0, true);
  }

  public int[] method154(int var1, byte var2) {
    int var4 = 64 % ((var2 - 30) / 36);
    int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
    if (this.monoChromaticImageCache.aBoolean1580) {
      int var5 = this.anInt3450 >> 1;
      int[][] var6 = this.monoChromaticImageCache.method1710((byte) 93);
      Random var7 = new Random(this.anInt3454);

      for (int var8 = 0; this.anInt3447 > var8; ++var8) {
        int var9 = this.anInt3450 > 0 ?
            this.anInt3444 - var5 + GlobalStatics_8.method1603((byte) -99,
                this.anInt3450, var7) :
            this.anInt3444;
        int var10 = GlobalStatics_8
            .method1603((byte) -96, GlobalStatics_9.anInt1559, var7);
        var9 = (var9 & 4088) >> 4;
        int var11 = GlobalStatics_8
            .method1603((byte) 62, DummyClass55.anInt1427, var7);
        int var12 =
            var10 + (this.anInt3451 * GlobalStatics_9.anIntArray2639[var9]
                >> 12);
        int var13 =
            var11 + (GlobalStatics_10.anIntArray3212[var9] * this.anInt3451
                >> 12);
        int var15 = var12 - var10;
        int var14 = -var11 + var13;
        if (var15 != 0 || var14 != 0) {
          if (var15 < 0) {
            var15 = -var15;
          }

          if (var14 < 0) {
            var14 = -var14;
          }

          boolean var16 = var14 > var15;
          int var17;
          int var18;
          if (var16) {
            var17 = var10;
            var18 = var12;
            var12 = var13;
            var13 = var18;
            var10 = var11;
            var11 = var17;
          }

          if (var10 > var12) {
            var17 = var10;
            var18 = var11;
            var10 = var12;
            var11 = var13;
            var13 = var18;
            var12 = var17;
          }

          var18 = -var10 + var12;
          int var19 = var13 - var11;
          var17 = var11;
          if (var19 < 0) {
            var19 = -var19;
          }

          int var20 = -var18 / 2;
          int var22 =
              -(GlobalStatics_8.method1603((byte) -18, 4096, var7) >> 2) + 1024;
          int var23 = var13 <= var11 ? -1 : 1;
          int var21 = 2048 / var18;

          for (int var24 = var10; var12 > var24; ++var24) {
            var20 += var19;
            int var25 = var21 * (-var10 + var24) + var22 + 1024;
            int var27 = var17 & GlobalStatics_10.anInt2487;
            if (var20 > 0) {
              var20 += -var18;
              var17 += var23;
            }

            int var26 = GlobalStatics_9.anInt396 & var24;
            if (var16) {
              assert var6 != null;
              var6[var27][var26] = var25;
            } else {
              assert var6 != null;
              var6[var26][var27] = var25;
            }
          }
        }
      }
    }

    return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3) {
    if (var1 == 0) {
      this.anInt3454 = var2.readUnsignedByte();
    } else if (var1 == 1) {
      this.anInt3447 = var2.readUnsignedShort();
    } else if (var1 != 2) {
      if (var1 == 3) {
        this.anInt3444 = var2.readUnsignedShort();
      } else if (var1 == 4) {
        this.anInt3450 = var2.readUnsignedShort();
      }
    } else {
      this.anInt3451 = var2.readUnsignedByte();
    }
  }

  public void method158(int var1) {
    GlobalStatics_10.method844((byte) -9);
    if (var1 != 16251) {
      this.anInt3454 = 107;
    }
  }

}
