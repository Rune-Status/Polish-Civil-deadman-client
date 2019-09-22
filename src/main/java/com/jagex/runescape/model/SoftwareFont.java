package com.jagex.runescape.model;

import com.jagex.runescape.image_producer.AbstractImageProducerStatics;
import com.jagex.runescape.statics.GlobalStatics_3;

public final class SoftwareFont extends AbstractFont {

  public byte[][] aByteArrayArray4082 = new byte[256][];

  public SoftwareFont(byte[] var1) {
    super(var1);
  }

  public SoftwareFont(byte[] var1, int[] var2, int[] var3, int[] var4,
      int[] var5,
      byte[][] var6) {
    super(var1, var2, var3, var4, var5);
    this.aByteArrayArray4082 = var6;
  }

  public void method678(int var1, int var2, int var3, int var4, int var5,
      int var6) {
    int var8 = var2 + var3 * AbstractImageProducerStatics.anInt1092;
    int var9 = AbstractImageProducerStatics.anInt1092 - var4;
    int var10 = 0;
    int var11 = 0;
    int var12;
    if (var3 < AbstractImageProducerStatics.anInt1095) {
      var12 = AbstractImageProducerStatics.anInt1095 - var3;
      var5 -= var12;
      var3 = AbstractImageProducerStatics.anInt1095;
      var11 += var12 * var4;
      var8 += var12 * AbstractImageProducerStatics.anInt1092;
    }

    if (var3 + var5 > AbstractImageProducerStatics.anInt1099) {
      var5 -= var3 + var5 - AbstractImageProducerStatics.anInt1099;
    }

    if (var2 < AbstractImageProducerStatics.anInt1093) {
      var12 = AbstractImageProducerStatics.anInt1093 - var2;
      var4 -= var12;
      var2 = AbstractImageProducerStatics.anInt1093;
      var11 += var12;
      var8 += var12;
      var10 += var12;
      var9 += var12;
    }

    if (var2 + var4 > AbstractImageProducerStatics.anInt1096) {
      var12 = var2 + var4 - AbstractImageProducerStatics.anInt1096;
      var4 -= var12;
      var10 += var12;
      var9 += var12;
    }

    if (var4 > 0 && var5 > 0) {
      if (AbstractImageProducerStatics.anIntArray1097 != null) {
        GlobalStatics_3
            .method705(AbstractImageProducerStatics.anIntArray1100,
                this.aByteArrayArray4082[var1], var2, var3, var4,
                var5, var6, var11, var8, var9, var10,
                AbstractImageProducerStatics.anIntArray1097,
                AbstractImageProducerStatics.anIntArray1098);
      } else {
        GlobalStatics_3
            .method704(AbstractImageProducerStatics.anIntArray1100,
                this.aByteArrayArray4082[var1], var6, var11, var8,
                var4, var5, var9, var10);
      }

    }
  }

  public void method679(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int var7) {
    int var9 = var2 + var3 * AbstractImageProducerStatics.anInt1092;
    int var10 = AbstractImageProducerStatics.anInt1092 - var4;
    int var11 = 0;
    int var12 = 0;
    int var13;
    if (var3 < AbstractImageProducerStatics.anInt1095) {
      var13 = AbstractImageProducerStatics.anInt1095 - var3;
      var5 -= var13;
      var3 = AbstractImageProducerStatics.anInt1095;
      var12 += var13 * var4;
      var9 += var13 * AbstractImageProducerStatics.anInt1092;
    }

    if (var3 + var5 > AbstractImageProducerStatics.anInt1099) {
      var5 -= var3 + var5 - AbstractImageProducerStatics.anInt1099;
    }

    if (var2 < AbstractImageProducerStatics.anInt1093) {
      var13 = AbstractImageProducerStatics.anInt1093 - var2;
      var4 -= var13;
      var2 = AbstractImageProducerStatics.anInt1093;
      var12 += var13;
      var9 += var13;
      var11 += var13;
      var10 += var13;
    }

    if (var2 + var4 > AbstractImageProducerStatics.anInt1096) {
      var13 = var2 + var4 - AbstractImageProducerStatics.anInt1096;
      var4 -= var13;
      var11 += var13;
      var10 += var13;
    }

    if (var4 > 0 && var5 > 0) {
      GlobalStatics_3
          .method706(AbstractImageProducerStatics.anIntArray1100,
              this.aByteArrayArray4082[var1], var6, var12, var9,
              var4, var5, var10, var11, var7);
    }
  }

}
