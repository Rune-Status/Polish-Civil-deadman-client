package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.opengl.MaterialShader5;
import com.jagex.runescape.statics.DummyClass55;
import com.jagex.runescape.statics.DummyClass59;
import com.jagex.runescape.statics.GlobalStatics_0;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_9;

public class TextureSampler39 extends AbstractTextureSampler {

  public int anInt3280;
  public int anInt3283;
  public int[] anIntArray3284;
  private int anInt3278 = -1;

  public TextureSampler39() {
    super(0, false);
  }

  public final boolean method279(int var1) {
    int var2 = 62 / ((var1 - 2) / 62);
      if (this.anIntArray3284 == null) {
        if (this.anInt3278 < 0) {
          return false;
        } else {
          SoftwareDirectColorSprite var3 = GlobalStatics_9.anInt1668 < 0 ?
            GlobalStatics_0.method1537(MaterialShader5.aClass153_2172,
                this.anInt3278, false) :
            DummyClass59
                .method1043(this.anInt3278, MaterialShader5.aClass153_2172, -3178,
              GlobalStatics_9.anInt1668);
          assert var3 != null;
          assert var3 != null;
          var3.method665();
          this.anInt3283 = var3.anInt3696;
          this.anInt3280 = var3.anInt3707;
          this.anIntArray3284 = var3.pixels;
          return true;
        }
      } else {
        return true;
      }
  }

  public final void parseConfig(int var1, Buffer var2, boolean var3) {
    if (var1 == 0) {
        this.anInt3278 = var2.readUnsignedShort();
      }

      if (!var3) {
        GlobalStatics_10.method276(115, 107, 22, 20, null, 87L, false);
      }
  }

  public final int method159(int var1) {
    return var1 != 4 ? 40 : this.anInt3278;
  }

  public final void method161(byte var1) {
    super.method161(var1);
      this.anIntArray3284 = null;
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        this.method159(32);
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) 65, var2);
      if (this.triChromaticImageCache.aBoolean1379 && this.method279(-113)) {
        int[] var4 = var3[0];
        int[] var5 = var3[1];
        int[] var6 = var3[2];
        int var7 = (this.anInt3283 == DummyClass55.anInt1427 ?
          var2 :
            this.anInt3283 * var2 / DummyClass55.anInt1427) * this.anInt3280;
        int var8;
        int var9;
        if (GlobalStatics_9.anInt1559 == this.anInt3280) {
          for (var8 = 0; GlobalStatics_9.anInt1559 > var8; ++var8) {
            var9 = this.anIntArray3284[var7++];
            var6[var8] = (255 & var9) << 4;
            var5[var8] = ((int) 0xff00 & var9) >> 4;
            var4[var8] = (var9 & 16711680) >> 12;
          }
        } else {
          for (var8 = 0; GlobalStatics_9.anInt1559 > var8; ++var8) {
            var9 = this.anInt3280 * var8 / GlobalStatics_9.anInt1559;
            int var10 = this.anIntArray3284[var7 + var9];
            var6[var8] = var10 << 4 & 4080;
            var5[var8] = (var10 & (int) 0xff00) >> 4;
            var4[var8] = var10 >> 12 & 4080;
          }
        }
      }

      return var3;
  }

}
