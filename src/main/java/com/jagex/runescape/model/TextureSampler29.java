package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.statics.DummyClass43;
import com.jagex.runescape.statics.DummyClass55;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_6;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler29 extends AbstractTextureSampler {

  private AbstractSomethingTexture[] aClass75Array3392;

  public TextureSampler29() {
    super(0, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int var4 = -75 % ((30 - var2) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        this.method323(-60, this.monoChromaticImageCache.method1710((byte) 124));
      }

      return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var1 == 0) {
        this.aClass75Array3392 = new AbstractSomethingTexture[var2.readUnsignedByte()];

        for (int var4 = 0; this.aClass75Array3392.length > var4; ++var4) {
          int var5 = var2.readUnsignedByte();
          if (var5 == 0) {
            this.aClass75Array3392[var4] = GlobalStatics_10
                .method843(-5232, var2);
          } else if ((var5 == 1)) {
            this.aClass75Array3392[var4] = GlobalStatics_9
                .method536((byte) 54, var2);
          } else if (var5 != 2) {
            if (var5 == 3) {
              this.aClass75Array3392[var4] = GlobalStatics_6.method384(var2, (byte) 80);
            }
          } else {
            this.aClass75Array3392[var4] = GlobalStatics_6.method404((byte) -110, var2);
          }
        }
      } else if (var1 == 1) {
        this.monoChromatic = var2.readUnsignedByte() == 1;
      }

      if (!var3) {
        this.method323(124, null);
      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 == -1) {
        int[][] var3 = this.triChromaticImageCache
            .method1594((byte) -117, var2);
        if (this.triChromaticImageCache.aBoolean1379) {
          int var4 = GlobalStatics_9.anInt1559;
          int var5 = DummyClass55.anInt1427;
          int[][] var6 = new int[var5][var4];
          int[][][] var7 = this.triChromaticImageCache.method1589((byte) -56);
          this.method323(-60, var6);

          for (int var8 = 0; var8 < DummyClass55.anInt1427; ++var8) {
            int[] var9 = var6[var8];
            int[][] var10 = var7[var8];
            int[] var11 = var10[0];
            int[] var12 = var10[1];
            int[] var13 = var10[2];

            for (int var14 = 0; (var14 < GlobalStatics_9.anInt1559); ++var14) {
              int var15 = var9[var14];
              var13[var14] = (255 & var15) << 4;
              var12[var14] = 4080 & var15 >> 4;
              var11[var14] = var15 >> 12 & 4080;
            }
          }
        }

        return var3;
      } else {
        return null;
      }
  }

  private void method323(int var1, int[][] var2) {
    int var4 = DummyClass55.anInt1427;
      int var3 = GlobalStatics_9.anInt1559;
      GlobalStatics_10.method230(var2, true);
      DummyClass43.method1196(0, 0, (byte) 111, GlobalStatics_10.anInt2487,
        GlobalStatics_9.anInt396);
      if (this.aClass75Array3392 != null) {
        for (int var5 = 0; this.aClass75Array3392.length > var5; ++var5) {
          AbstractSomethingTexture var6 = this.aClass75Array3392[var5];
          int var7 = var6.anInt1101;
          int var8 = var6.anInt1104;
          if (var7 >= 0) {
            if ((var8 < 0)) {
              var6.method1341(2, var3, var4);
            } else {
              var6.method1335(var4, var3, 4898);
            }
          } else if ((var8 >= 0)) {
            var6.method1337(var4, true, var3);
          }
        }
      }

      if (var1 != -60) {
        GlobalStatics_10.getByteLength(null);
      }
  }

}
