package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.statics.DummyClass13;
import com.jagex.runescape.statics.DummyClass4;
import com.jagex.runescape.statics.DummyClass55;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler23 extends AbstractTextureSampler {


  public TextureSampler23() {
    super(1, false);
  }

  private void method248(int var1, byte var2, int var3) {
    if (var2 > 80) {
        int var4 = GlobalStatics_9.anIntArray2125[var3];
        int var5 = DummyClass4.anIntArray2999[var1];
        float var6 = (float) Math.atan2(var4 - 2048, var5 - 2048);
        if (var6 >= -3.141592653589793 && var6 <= -2.356194490192345) {
          GameStringStatics.anInt828 = var1;
          DummyClass13.anInt2024 = var3;
        } else if (var6 <= -1.5707963267948966 && var6 >= -2.356194490192345) {
          DummyClass13.anInt2024 = var1;
          GameStringStatics.anInt828 = var3;
        } else if (var6 <= -0.7853981633974483 && var6 >= -1.5707963267948966) {
          DummyClass13.anInt2024 = -var1 + GlobalStatics_9.anInt1559;
          GameStringStatics.anInt828 = var3;
        } else if (var6 <= 0.0F && var6 >= -0.7853981633974483) {
          DummyClass13.anInt2024 = var3;
          GameStringStatics.anInt828 = DummyClass55.anInt1427 - var1;
        } else if (var6 >= 0.0F && var6 <= 0.7853981633974483D) {
          DummyClass13.anInt2024 = -var3 + GlobalStatics_9.anInt1559;
          GameStringStatics.anInt828 = -var1 + DummyClass55.anInt1427;
        } else if (var6 >= 0.7853981633974483D && var6 <= 1.5707963267948966D) {
          DummyClass13.anInt2024 = -var1 + GlobalStatics_9.anInt1559;
          GameStringStatics.anInt828 = -var3 + DummyClass55.anInt1427;
        } else if (var6 >= 1.5707963267948966D && var6 <= 2.356194490192345D) {
          GameStringStatics.anInt828 = -var3 + DummyClass55.anInt1427;
          DummyClass13.anInt2024 = var1;
        } else if (var6 >= 2.356194490192345D && var6 <= 3.141592653589793D) {
          DummyClass13.anInt2024 = -var3 + GlobalStatics_9.anInt1559;
          GameStringStatics.anInt828 = var1;
        }

        DummyClass13.anInt2024 &= GlobalStatics_9.anInt396;
        GameStringStatics.anInt828 &= GlobalStatics_10.anInt2487;
      }
  }

  public int[] method154(int var1, byte var2 ) {
    int var3 = -113 % ((30 - var2) / 36);
      int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        for (int var5 = 0; var5 < GlobalStatics_9.anInt1559; ++var5) {
          this.method248(var1, (byte) 105, var5);
          int[] var6 = this.method152(0, GameStringStatics.anInt828, 32755);
          var4[var5] = var6[DummyClass13.anInt2024];
        }
      }

      return var4;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var1 == 0) {
        this.monoChromatic = var2.readUnsignedByte() == 1;
      }

      if (!var3) {
        GlobalStatics_10.worldMaps = null;
      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        this.method166(-38, 67);
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) -125, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[] var4 = var3[0];
        int[] var6 = var3[2];
        int[] var5 = var3[1];

        for (int var7 = 0; GlobalStatics_9.anInt1559 > var7; ++var7) {
          this.method248(var2, (byte) 107, var7);
          int[][] var8 = this.method162(GameStringStatics.anInt828, 0, (byte) -49);
          assert var8 != null;
          var4[var7] = var8[0][DummyClass13.anInt2024];
          var5[var7] = var8[1][DummyClass13.anInt2024];
          var6[var7] = var8[2][DummyClass13.anInt2024];
        }
      }

      return var3;
  }

}
