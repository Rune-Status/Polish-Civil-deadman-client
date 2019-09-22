package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.DummyClass4;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler37 extends AbstractTextureSampler {

  private int anInt3253;
  private int anInt3254 = 4096;
  private int anInt3257 = 12288;
  private int anInt3258;
  private int anInt3262 = 2048;
  private int anInt3265 = 2048;
  private int anInt3266 = 8192;

  public TextureSampler37() {
    super(0, true);
  }

  public int[] method154(int var1, byte var2) {
    int var4 = 15 % ((30 - var2) / 36);
    int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
    if (this.monoChromaticImageCache.aBoolean1580) {
      int var5 = -2048 + DummyClass4.anIntArray2999[var1];

      for (int var6 = 0; var6 < GlobalStatics_9.anInt1559; ++var6) {
        int var9 = var5 + this.anInt3253;
        int var7 = GlobalStatics_9.anIntArray2125[var6] - 2048;
        int var8 = this.anInt3265 + var7;
        var9 = var9 < 2047 ? var9 + 4096 : var9;
        var9 = var9 > 2048 ? -4096 + var9 : var9;
        int var10 = var7 + this.anInt3258;
        var8 = var8 < -2048 ? var8 + 4096 : var8;
        var8 = var8 <= 2048 ? var8 : -4096 + var8;
        var10 = var10 >= 2047 ? var10 : 4096 + var10;
        var10 = var10 > 2048 ? var10 - 4096 : var10;
        int var11 = var5 + this.anInt3262;
        var11 = var11 < -2048 ? var11 + 4096 : var11;
        var11 = var11 > 2048 ? var11 - 4096 : var11;
        var3[var6] =
            !this.method271(var8, var9, (byte) 113) && !this
                .method270((byte) -44, var10, var11) ?
                0 :
                4096;
      }
    }

    return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3) {
    if (var1 == 0) {
      this.anInt3265 = var2.readUnsignedShort();
    } else if (var1 == 1) {
      this.anInt3253 = var2.readUnsignedShort();
    } else if (var1 == 2) {
      this.anInt3258 = var2.readUnsignedShort();
    } else if (var1 != 3) {
      if (var1 == 4) {
        this.anInt3257 = var2.readUnsignedShort();
      } else {
        if (var1 == 5) {
          this.anInt3254 = var2.readUnsignedShort();
        } else if (var1 == 6) {
          this.anInt3266 = var2.readUnsignedShort();
        }
      }
    } else {
      this.anInt3262 = var2.readUnsignedShort();
    }

    if (!var3) {
      this.anInt3266 = 85;
    }
  }

  public void method158(int var1) {
    GlobalStatics_10.method844((byte) -9);
    if (var1 != 16251) {
      GlobalStatics_10.method272((byte) -85);
    }
  }

  private boolean method270(byte var1, int var2, int var3) {
    int var4 = this.anInt3257 * (var2 + var3) >> 12;
    if (var1 > -17) {
      GlobalStatics_10.method267((byte) 89);
    }

    int var5 = GlobalStatics_9.anIntArray2639[var4 * 255 >> 12 & 255];
    var5 = (var5 << 12) / this.anInt3257;
    var5 = (var5 << 12) / this.anInt3266;
    var5 = var5 * this.anInt3254 >> 12;
    return var5 > -var2 + var3 && -var5 < var3 - var2;
  }

  private boolean method271(int var1, int var2, byte var3) {
    int var4 = (var2 - var1) * this.anInt3257 >> 12;
    if (var3 != 113) {
      this.method270((byte) -91, -79, -4);
    }

    int var5 = GlobalStatics_9.anIntArray2639[(1047948 & var4 * 255) >> 12];
    var5 = (var5 << 12) / this.anInt3257;
    var5 = (var5 << 12) / this.anInt3266;
    var5 = var5 * this.anInt3254 >> 12;
    return var2 + var1 < var5 && -var5 < var2 + var1;
  }

}
