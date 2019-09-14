package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.done.AbstractTextureSampler;

import java.awt.Font;

public final class TextureSampler14 extends AbstractTextureSampler {

  private static GameString aClass94_3386 = GameStringStatics.create("Use");
  public static int[] anIntArray3383 = new int[5];
  public static Font aFont3384;
  public static boolean aBoolean3387 = true;
  public static volatile int anInt3389;
  public static GameString aClass94_3388 = TextureSampler14.aClass94_3386;
  private int anInt3385 = 585;


  public TextureSampler14() {
    super(0, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int var4 = -76 / ((var2 - 30) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int var5 = DummyClass4.anIntArray2999[var1];

        for (int var6 = 0; SomethingLight0.anInt1559 > var6; ++var6) {
          int var7 = TextureCache.anIntArray2125[var6];
          int var8;
          if (var7 > this.anInt3385 && 4096 - this.anInt3385 > var7
            && ((2048 - this.anInt3385) < var5) && (var5 < (this.anInt3385 + 2048))) {
            var8 = 2048 - var7;
            var8 = var8 < 0 ? -var8 : var8;
            var8 <<= 12;
            var8 /= -this.anInt3385 + 2048;
            var3[var6] = -var8 + 4096;
          } else if (var7 > (-this.anInt3385 + 2048) && var7 < this.anInt3385
              + 2048) {
            var8 = var5 - 2048;
            var8 = (var8 >= 0) ? var8 : -var8;
            var8 -= this.anInt3385;
            var8 <<= 12;
            var3[var6] = var8 / (-this.anInt3385 + 2048);
          } else if (
              (var5 >= this.anInt3385) && ((4096 - this.anInt3385) >= var5)) {
            if (this.anInt3385 <= var7 && var7 <= 4096 - this.anInt3385) {
              var3[var6] = 0;
            } else {
              var8 = -var5 + 2048;
              var8 = (var8 < 0) ? -var8 : var8;
              var8 <<= 12;
              var8 /= 2048 - this.anInt3385;
              var3[var6] = -var8 + 4096;
            }
          } else {
            var8 = var7 - 2048;
            var8 = var8 < 0 ? -var8 : var8;
            var8 -= this.anInt3385;
            var8 <<= 12;
            var3[var6] = var8 / (-this.anInt3385 + 2048);
          }
        }
      }

      return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        TextureSampler14.anInt3389 = 99;
      }

      if ((var1 == 0)) {
        this.anInt3385 = var2.readUnsignedShort();
      }
  }

  public static int method319(int var0, int var1, int var2) {
    if (var1 >= -99) {
        TextureSampler14.aBoolean3387 = true;
      }

      int var3 = var0 >>> 31;
      return (var0 + var3) / var2 - var3;
  }

  public static void method320(int var0, int var1, int var2, byte var3, int var4) {
    if ((var4 <= var2)) {
        TextureSampler18.method282(DummyClass35.anIntArrayArray663[var1], var4, -83, var2, var0);
      } else {
        TextureSampler18.method282(DummyClass35.anIntArrayArray663[var1], var2, -48, var4, var0);
      }

      if (var3 > -55) {
        TextureSampler14.method320(99, 100, 74, (byte) 13, 92);
      }
  }

  public static void method321(int var0) {
    TextureSampler14.aClass94_3386 = null;
      TextureSampler14.anIntArray3383 = null;
      TextureSampler14.aFont3384 = null;
      TextureSampler14.aClass94_3388 = null;
      if (var0 != -21136) {
        TextureSampler14.method319(-38, -96, -102);
      }
  }

}
