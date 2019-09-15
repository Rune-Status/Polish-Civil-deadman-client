package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.done.AbstractTextureSampler;

public final class TextureSampler12 extends AbstractTextureSampler {

  private int anInt3036;
  private int anInt3037 = 1;
  private int anInt3038;


  public TextureSampler12() {
    super(0, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      int var4;
      if (this.monoChromaticImageCache.aBoolean1580) {
        var4 = DummyClass4.anIntArray2999[var1];
        int var5 = var4 - 2048 >> 1;

        for (int var6 = 0; var6 < GlobalStatics_9.anInt1559; ++var6) {
          int var8 = GlobalStatics_9.anIntArray2125[var6];
          int var9 = -2048 + var8 >> 1;
          int var7;
          if ((this.anInt3038 == 0)) {
            var7 = (var8 - var4) * this.anInt3037;
          } else {
            int var10 = var9 * var9 + (var5 * var5) >> 12;
            var7 = (int) (Math.sqrt(var10 / 4096.0F) * 4096.0D);
            var7 = (int) (3.141592653589793D * (var7 * this.anInt3037));
          }

          var7 -= var7 & -4096;
          if ((this.anInt3036 == 0)) {
            var7 = GlobalStatics_10.anIntArray3212[(var7 & 4085) >> 4] + 4096 >> 1;
          } else if (this.anInt3036 == 2) {
            var7 -= 2048;
            if ((var7 < 0)) {
              var7 = -var7;
            }

            var7 = -var7 + 2048 << 1;
          }

          var3[var6] = var7;
        }
      }

      var4 = -64 / ((30 - var2) / 36);
      return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        this.method158(10);
      }

      if ((var1 == 0)) {
        this.anInt3038 = var2.readUnsignedByte();
      } else {
        if (var1 == 1) {
          this.anInt3036 = var2.readUnsignedByte();
        } else if ((var1 == 3)) {
          this.anInt3037 = var2.readUnsignedByte();
        }
      }
  }

  public void method158(int var1 ) {
    FileSystem.method844((byte) -9);
      if (var1 != 16251) {
        GlobalStatics_9.method171(106, -38, 106, 7, -28, -61, 30, -77, -47);
      }
  }

}
