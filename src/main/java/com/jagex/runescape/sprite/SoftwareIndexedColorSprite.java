package com.jagex.runescape.sprite;

import com.jagex.runescape.image_producer.AbstractImageProducerStatics;
import java.util.Arrays;

public final class SoftwareIndexedColorSprite extends
    AbstractIndexedColorSprite {

  public byte[] aByteArray2674;
  private final int[] anIntArray2673;

  public SoftwareIndexedColorSprite(int var1, int var2, int var3, int var4,
      int var5,
      int var6,
      byte[] var7,
      int[] var8) {
    this.anInt1469 = var1;
    this.anInt1467 = var2;
    this.offsetX = var3;
    this.offsetY = var4;
    this.width = var5;
    this.height = var6;
    this.aByteArray2674 = var7;
    this.anIntArray2673 = var8;
  }

  public SoftwareIndexedColorSprite(int var1, int var2, int var3) {
    this.anInt1469 = this.width = var1;
    this.anInt1467 = this.height = var2;
    this.offsetX = this.offsetY = 0;
    this.aByteArray2674 = new byte[var1 * var2];
    this.anIntArray2673 = new int[var3];
  }

  public void method1668(int var1, int var2, int var3) {
    for (int var4 = 0; var4 < this.anIntArray2673.length; ++var4) {
      int var5 = this.anIntArray2673[var4] >> 16 & 255;
      var5 += var1;
      if (var5 < 0) {
        var5 = 0;
      } else if (var5 > 255) {
        var5 = 255;
      }

      int var6 = this.anIntArray2673[var4] >> 8 & 255;
      var6 += var2;
      if (var6 < 0) {
        var6 = 0;
      } else if (var6 > 255) {
        var6 = 255;
      }

      int var7 = this.anIntArray2673[var4] & 255;
      var7 += var3;
      if (var7 < 0) {
        var7 = 0;
      } else if (var7 > 255) {
        var7 = 255;
      }

      this.anIntArray2673[var4] = (var5 << 16) + (var6 << 8) + var7;
    }

  }

  public void method1669(int var1, int var2, int var3, int var4, int var5) {
    int var6 = this.width;
    int var7 = this.height;
    int var8 = 0;
    int var9 = 0;
    int var10 = this.anInt1469;
    int var11 = this.anInt1467;
    int var12 = (var10 << 16) / var3;
    int var13 = (var11 << 16) / var4;
    int var14;
    if (this.offsetX > 0) {
      var14 = ((this.offsetX << 16) + var12 - 1) / var12;
      var1 += var14;
      var8 += var14 * var12 - (this.offsetX << 16);
    }

    if (this.offsetY > 0) {
      var14 = ((this.offsetY << 16) + var13 - 1) / var13;
      var2 += var14;
      var9 += var14 * var13 - (this.offsetY << 16);
    }

    if (var6 < var10) {
      var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
    }

    if (var7 < var11) {
      var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
    }

    var14 = var1 + var2 * AbstractImageProducerStatics.anInt1092;
    int var15 = AbstractImageProducerStatics.anInt1092 - var3;
    if (var2 + var4 > AbstractImageProducerStatics.anInt1099) {
      var4 -= var2 + var4 - AbstractImageProducerStatics.anInt1099;
    }

    int var16;
    if (var2 < AbstractImageProducerStatics.anInt1095) {
      var16 = AbstractImageProducerStatics.anInt1095 - var2;
      var4 -= var16;
      var14 += var16 * AbstractImageProducerStatics.anInt1092;
      var9 += var13 * var16;
    }

    if (var1 + var3 > AbstractImageProducerStatics.anInt1096) {
      var16 = var1 + var3 - AbstractImageProducerStatics.anInt1096;
      var3 -= var16;
      var15 += var16;
    }

    if (var1 < AbstractImageProducerStatics.anInt1093) {
      var16 = AbstractImageProducerStatics.anInt1093 - var1;
      var3 -= var16;
      var14 += var16;
      var8 += var12 * var16;
      var15 += var16;
    }

    SoftwareIndexedColorSpriteStatics
        .method1673(AbstractImageProducerStatics.anIntArray1100,
            this.aByteArray2674,
            this.anIntArray2673, var8, var9,
            var14, var15, var3, var4, var12, var13, var6, var5);
  }

  public void clear() {
    Arrays.fill(this.aByteArray2674, (byte) 0);
  }

  public void method1674() {
    byte[] var1 = new byte[this.width * this.height];
    int var2 = 0;

    for (int var3 = 0; var3 < this.width; ++var3) {
      for (int var4 = this.height - 1; var4 >= 0; --var4) {
        var1[var2++] = this.aByteArray2674[var3 + var4 * this.width];
      }
    }

    this.aByteArray2674 = var1;
    int var3 = this.offsetY;
    this.offsetY = this.offsetX;
    this.offsetX = this.anInt1467 - this.height - var3;
    var3 = this.height;
    this.height = this.width;
    this.width = var3;
    var3 = this.anInt1467;
    this.anInt1467 = this.anInt1469;
    this.anInt1469 = var3;
  }

  public void draw(int x, int y, int alpha) {
    x += this.offsetX;
    y += this.offsetY;
    int var4 = x + y * AbstractImageProducerStatics.anInt1092;
    int var5 = 0;
    int var6 = this.height;
    int var7 = this.width;
    int var8 = AbstractImageProducerStatics.anInt1092 - var7;
    int var9 = 0;
    int var10;
    if (y < AbstractImageProducerStatics.anInt1095) {
      var10 = AbstractImageProducerStatics.anInt1095 - y;
      var6 -= var10;
      y = AbstractImageProducerStatics.anInt1095;
      var5 += var10 * var7;
      var4 += var10 * AbstractImageProducerStatics.anInt1092;
    }

    if (y + var6 > AbstractImageProducerStatics.anInt1099) {
      var6 -= y + var6 - AbstractImageProducerStatics.anInt1099;
    }

    if (x < AbstractImageProducerStatics.anInt1093) {
      var10 = AbstractImageProducerStatics.anInt1093 - x;
      var7 -= var10;
      x = AbstractImageProducerStatics.anInt1093;
      var5 += var10;
      var4 += var10;
      var9 += var10;
      var8 += var10;
    }

    if (x + var7 > AbstractImageProducerStatics.anInt1096) {
      var10 = x + var7 - AbstractImageProducerStatics.anInt1096;
      var7 -= var10;
      var9 += var10;
      var8 += var10;
    }

    if (var7 > 0 && var6 > 0) {
      SoftwareIndexedColorSpriteStatics
          .method1676(AbstractImageProducerStatics.anIntArray1100,
              this.aByteArray2674,
              this.anIntArray2673, var5, var4,
              var7, var6, var8, var9, alpha);
    }
  }

  public void draw(int x, int y) {
    x += this.offsetX;
    y += this.offsetY;
    int var3 = x + y * AbstractImageProducerStatics.anInt1092;
    int var4 = 0;
    int var5 = this.height;
    int var6 = this.width;
    int var7 = AbstractImageProducerStatics.anInt1092 - var6;
    int var8 = 0;
    int var9;
    if (y < AbstractImageProducerStatics.anInt1095) {
      var9 = AbstractImageProducerStatics.anInt1095 - y;
      var5 -= var9;
      y = AbstractImageProducerStatics.anInt1095;
      var4 += var9 * var6;
      var3 += var9 * AbstractImageProducerStatics.anInt1092;
    }

    if (y + var5 > AbstractImageProducerStatics.anInt1099) {
      var5 -= y + var5 - AbstractImageProducerStatics.anInt1099;
    }

    if (x < AbstractImageProducerStatics.anInt1093) {
      var9 = AbstractImageProducerStatics.anInt1093 - x;
      var6 -= var9;
      x = AbstractImageProducerStatics.anInt1093;
      var4 += var9;
      var3 += var9;
      var8 += var9;
      var7 += var9;
    }

    if (x + var6 > AbstractImageProducerStatics.anInt1096) {
      var9 = x + var6 - AbstractImageProducerStatics.anInt1096;
      var6 -= var9;
      var8 += var9;
      var7 += var9;
    }

    if (var6 > 0 && var5 > 0) {
      SoftwareIndexedColorSpriteStatics
          .method1672(AbstractImageProducerStatics.anIntArray1100,
              this.aByteArray2674,
              this.anIntArray2673, 0, var4,
              var3, var6, var5, var7, var8);
    }
  }

  public void method1675() {
    if (this.width != this.anInt1469 || this.height != this.anInt1467) {
      byte[] var1 = new byte[this.anInt1469 * this.anInt1467];
      int var2 = 0;

      for (int var3 = 0; var3 < this.height; ++var3) {
        for (int var4 = 0; var4 < this.width; ++var4) {
          var1[var4 + this.offsetX + (var3 + this.offsetY) * this.anInt1469] =
              this.aByteArray2674[var2++];
        }
      }

      this.aByteArray2674 = var1;
      this.width = this.anInt1469;
      this.height = this.anInt1467;
      this.offsetX = 0;
      this.offsetY = 0;
    }
  }

  public void method1677(int var1, int var2, int var3, int var4) {
    int var5 = this.width;
    int var6 = this.height;
    int var7 = 0;
    int var8 = 0;
    int var9 = this.anInt1469;
    int var10 = this.anInt1467;
    int var11 = (var9 << 16) / var3;
    int var12 = (var10 << 16) / var4;
    int var13;
    if (this.offsetX > 0) {
      var13 = ((this.offsetX << 16) + var11 - 1) / var11;
      var1 += var13;
      var7 += var13 * var11 - (this.offsetX << 16);
    }

    if (this.offsetY > 0) {
      var13 = ((this.offsetY << 16) + var12 - 1) / var12;
      var2 += var13;
      var8 += var13 * var12 - (this.offsetY << 16);
    }

    if (var5 < var9) {
      var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
    }

    if (var6 < var10) {
      var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
    }

    var13 = var1 + var2 * AbstractImageProducerStatics.anInt1092;
    int var14 = AbstractImageProducerStatics.anInt1092 - var3;
    if (var2 + var4 > AbstractImageProducerStatics.anInt1099) {
      var4 -= var2 + var4 - AbstractImageProducerStatics.anInt1099;
    }

    int var15;
    if (var2 < AbstractImageProducerStatics.anInt1095) {
      var15 = AbstractImageProducerStatics.anInt1095 - var2;
      var4 -= var15;
      var13 += var15 * AbstractImageProducerStatics.anInt1092;
      var8 += var12 * var15;
    }

    if (var1 + var3 > AbstractImageProducerStatics.anInt1096) {
      var15 = var1 + var3 - AbstractImageProducerStatics.anInt1096;
      var3 -= var15;
      var14 += var15;
    }

    if (var1 < AbstractImageProducerStatics.anInt1093) {
      var15 = AbstractImageProducerStatics.anInt1093 - var1;
      var3 -= var15;
      var13 += var15;
      var7 += var11 * var15;
      var14 += var15;
    }

    SoftwareIndexedColorSpriteStatics
        .method1670(AbstractImageProducerStatics.anIntArray1100,
            this.aByteArray2674,
            this.anIntArray2673, var7, var8,
            var13, var14, var3, var4, var11, var12, var5);
  }

}
