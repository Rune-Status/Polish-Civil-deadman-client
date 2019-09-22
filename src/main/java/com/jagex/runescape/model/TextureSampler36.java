package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.DummyClass1;
import com.jagex.runescape.statics.DummyClass55;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler36 extends AbstractTextureSampler {

  private int[] anIntArray3425;
  private int anInt3431;
  private int anInt3433;
  private int anInt3434 = -1;

  public TextureSampler36() {
    super(0, false);
  }

  private boolean method339(boolean var1) {
    if (var1) {
      return true;
    } else if (this.anIntArray3425 == null) {
      if (this.anInt3434 < 0) {
        return false;
      } else {
        int var2 = GlobalStatics_9.anInt1559;
        int var3 = DummyClass55.anInt1427;
        int var4 = DummyClass1.anInterface2_408.method14((byte) -104,
            this.anInt3434) ? 64 : 128;
        this.anIntArray3425 = DummyClass1.anInterface2_408.method16(64,
            this.anInt3434);
        this.anInt3433 = var4;
        this.anInt3431 = var4;
        GlobalStatics_10.method180(18, var3, var2);
        return this.anIntArray3425 != null;
      }
    } else {
      return true;
    }
  }

  public int method155(byte var1) {
    if (var1 != 19) {
      this.method155((byte) -60);
    }

    return this.anInt3434;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3) {
    if (!var3) {
      GlobalStatics_10.animationSequences = null;
    }

    if (var1 == 0) {
      this.anInt3434 = var2.readUnsignedShort();
    }
  }

  public void method161(byte var1) {
    super.method161(var1);
    this.anIntArray3425 = null;
  }

  public int[][] method166(int var1, int var2) {
    if (var1 != -1) {
      this.anInt3434 = 6;
    }

    int[][] var3 = this.triChromaticImageCache
        .method1594((byte) -120, var2);
    if (this.triChromaticImageCache.aBoolean1379 && this.method339(false)) {
      int var4 = (this.anInt3433 == DummyClass55.anInt1427 ? var2
          : this.anInt3433 * var2 / DummyClass55.anInt1427) * this.anInt3431;
      int[] var5 = var3[0];
      int[] var6 = var3[1];
      int[] var7 = var3[2];
      int var8;
      int var9;
      if (GlobalStatics_9.anInt1559 == this.anInt3431) {
        for (var8 = 0; var8 < GlobalStatics_9.anInt1559; ++var8) {
          var9 = this.anIntArray3425[var4++];
          var7[var8] = var9 << 4 & 4080;
          var6[var8] = (var9 & (int) 0xff00) >> 4;
          var5[var8] = (var9 & 16711680) >> 12;
        }
      } else {
        for (var8 = 0; var8 < GlobalStatics_9.anInt1559; ++var8) {
          var9 = this.anInt3431 * var8 / GlobalStatics_9.anInt1559;
          int var10 = this.anIntArray3425[var4 + var9];
          var7[var8] = var10 << 4 & 4080;
          var6[var8] = ((int) 0xff00 & var10) >> 4;
          var5[var8] = var10 >> 12 & 4080;
        }
      }
    }

    return var3;
  }

}
