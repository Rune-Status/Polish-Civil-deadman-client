package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.opengl.MaterialShader5;
import com.jagex.runescape.statics.DummyClass1;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.statics.GlobalStatics_2;
import com.jagex.runescape.statics.GlobalStatics_8;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class ProceduralTexture {

  private int[] anIntArray1144;
  private final AbstractTextureSampler aClass3_Sub13_1145;
  private final AbstractTextureSampler[] aClass3_Sub13Array1147;
  private final AbstractTextureSampler aClass3_Sub13_1148;
  private final int[] anIntArray1149;


  public ProceduralTexture() {
    this.anIntArray1149 = new int[0];
      this.anIntArray1144 = new int[0];
      this.aClass3_Sub13_1145 = new TextureSampler0();
      this.aClass3_Sub13_1145.cacheSize = 1;
      this.aClass3_Sub13_1148 = new TextureSampler0();
      this.aClass3_Sub13Array1147 =
        new AbstractTextureSampler[] {this.aClass3_Sub13_1145,
            this.aClass3_Sub13_1148};
      this.aClass3_Sub13_1148.cacheSize = 1;
  }

  public ProceduralTexture(Buffer var1 ) {
    int var2 = var1.readUnsignedByte();
      this.aClass3_Sub13Array1147 = new AbstractTextureSampler[var2];
      int[][] var5 = new int[var2][];
      int var4 = 0;
      int var3 = 0;

      int var6;
      AbstractTextureSampler var7;
      int var8;
      int var9;
      for (var6 = 0; var2 > var6; ++var6) {
        var7 = GlobalStatics_2.method63((byte) -67, var1);
        if (var7.method159(4) >= 0) {
          ++var3;
        }

        if ((var7.method155((byte) 19) >= 0)) {
          ++var4;
        }

        var8 = var7.samplers.length;
        var5[var6] = new int[var8];

        for (var9 = 0; var8 > var9; ++var9) {
          var5[var6][var9] = var1.readUnsignedByte();
        }

        this.aClass3_Sub13Array1147[var6] = var7;
      }

      this.anIntArray1144 = new int[var3];
      this.anIntArray1149 = new int[var4];
      var3 = 0;
      var4 = 0;

      for (var6 = 0; var6 < var2; ++var6) {
        var7 = this.aClass3_Sub13Array1147[var6];
        var8 = var7.samplers.length;

        for (var9 = 0; (var9 < var8); ++var9) {
          var7.samplers[var9] = this.aClass3_Sub13Array1147[var5[var6][var9]];
        }

        var9 = var7.method159(4);
        int var10 = var7.method155((byte) 19);
        if ((var9 > 0)) {
          this.anIntArray1144[var3++] = var9;
        }

        if ((var10 > 0)) {
          this.anIntArray1149[var4++] = var10;
        }

        var5[var6] = null;
      }

      this.aClass3_Sub13_1145 = this.aClass3_Sub13Array1147[var1.readUnsignedByte()];
      var5 = null;
      this.aClass3_Sub13_1148 = this.aClass3_Sub13Array1147[var1.readUnsignedByte()];
  }

  public int[] method1404(int var1, boolean var2, int var3, double var4,
      int var6,
      FileUnpacker var7,
      ITextureCache var8,
      boolean var9 ) {
    GlobalStatics_9.method1859(var4, var6 ^ 359938);
      DummyClass1.anInterface2_408 = var8;
      MaterialShader5.aClass153_2172 = var7;
      GlobalStatics_10.method180(-1, var1, var3);

      int var11;
      for (var11 = 0; this.aClass3_Sub13Array1147.length > var11; ++var11) {
        this.aClass3_Sub13Array1147[var11].method160(var1, var3, 250);
      }

      if (var6 != 327680) {
        GlobalStatics_9.method1405(68, 8, 20, -51, 31, 61, -34);
      }

      int[] var10 = new int[var1 * var3];
      int var12;
      byte var13;
      if (var9) {
        var13 = -1;
        var12 = -1;
        var11 = var3 - 1;
      } else {
        var13 = 1;
        var11 = 0;
        var12 = var3;
      }

      int var14 = 0;

      int var15;
      for (var15 = 0; (var15 < var1); ++var15) {
        if (var2) {
          var14 = var15;
        }

        int[] var17;
        int[] var16;
        int[] var18;
        if (this.aClass3_Sub13_1145.monoChromatic) {
          int[] var19 = this.aClass3_Sub13_1145.method154(var15, (byte) 109);
          var16 = var19;
          var17 = var19;
          var18 = var19;
        } else {
          int[][] var24 = this.aClass3_Sub13_1145.method166(-1, var15);
          var16 = var24[0];
          var18 = var24[2];
          var17 = var24[1];
        }

        for (int var25 = var11; var25 != var12; var25 += var13) {
          int var20 = var16[var25] >> 4;
          if (var20 > 255) {
            var20 = 255;
          }

          if ((var20 < 0)) {
            var20 = 0;
          }

          var20 = GlobalStatics_8.anIntArray3804[var20];
          int var22 = var18[var25] >> 4;
          int var21 = var17[var25] >> 4;
          if (var21 > 255) {
            var21 = 255;
          }

          if (var21 < 0) {
            var21 = 0;
          }

          if ((var22 > 255)) {
            var22 = 255;
          }

          var21 = GlobalStatics_8.anIntArray3804[var21];
          if ((var22 < 0)) {
            var22 = 0;
          }

          var22 = GlobalStatics_8.anIntArray3804[var22];
          var10[var14++] = (var20 << 16) + (var21 << 8) + var22;
          if (var2) {
            var14 += var3 - 1;
          }
        }
      }

      for (var15 = 0; var15 < this.aClass3_Sub13Array1147.length; ++var15) {
        this.aClass3_Sub13Array1147[var15].method161((byte) -45);
      }

      return var10;
  }

  public byte[] method1407(int var1, int var2, boolean var3,
      ITextureCache var4,
      double var5,
      int var7,
      FileUnpacker var8 ) {
    byte[] var9 = new byte[4 * var2 * var1];
      if (var7 == 8839) {
        GlobalStatics_9.method1859(var5, 32258);
        MaterialShader5.aClass153_2172 = var8;
        DummyClass1.anInterface2_408 = var4;
        GlobalStatics_10.method180(-32, var1, var2);

        int var10;
        for (var10 = 0; this.aClass3_Sub13Array1147.length > var10; ++var10) {
          this.aClass3_Sub13Array1147[var10]
              .method160(var1, var2, var7 - 8589);
        }

        var10 = 0;

        int var11;
        for (var11 = 0; var1 > var11; ++var11) {
          if (var3) {
            var10 = var11 << 2;
          }

          int[] var12;
          int[] var13;
          int[] var14;
          int[] var15;
          if (this.aClass3_Sub13_1145.monoChromatic) {
            var15 = this.aClass3_Sub13_1145.method154(var11, (byte) -98);
            var12 = var15;
            var13 = var15;
            var14 = var15;
          } else {
            int[][] var22 = this.aClass3_Sub13_1145.method166(-1, var11);
            var12 = var22[0];
            var13 = var22[1];
            var14 = var22[2];
          }

          if (this.aClass3_Sub13_1148.monoChromatic) {
            var15 = this.aClass3_Sub13_1148.method154(var11, (byte) -103);
          } else {
            var15 = this.aClass3_Sub13_1148.method166(-1, var11)[0];
          }

          for (int var16 = var2 - 1; (var16 >= 0); --var16) {
            int var17 = var12[var16] >> 4;
            if (var17 > 255) {
              var17 = 255;
            }

            if (var17 < 0) {
              var17 = 0;
            }

            int var18 = var13[var16] >> 4;
            if ((var18 > 255)) {
              var18 = 255;
            }

            int var19 = var14[var16] >> 4;
            if (var19 > 255) {
              var19 = 255;
            }

            var17 = GlobalStatics_8.anIntArray3804[var17];
            if ((var19 < 0)) {
              var19 = 0;
            }

            if ((var18 < 0)) {
              var18 = 0;
            }

            var18 = GlobalStatics_8.anIntArray3804[var18];
            var19 = GlobalStatics_8.anIntArray3804[var19];
            int var20;
            if ((var17 == 0) && (var18 == 0) && (var19 == 0)) {
              var20 = 0;
            } else {
              var20 = var15[var16] >> 4;
              if (var20 > 255) {
                var20 = 255;
              }

              if ((var20 < 0)) {
                var20 = 0;
              }
            }

            var9[var10++] = (byte) var17;
            var9[var10++] = (byte) var18;
            var9[var10++] = (byte) var19;
            var9[var10++] = (byte) var20;
            if (var3) {
              var10 += -4 + (var2 << 2);
            }
          }
        }

        for (var11 = 0; (var11 < this.aClass3_Sub13Array1147.length); ++var11) {
          this.aClass3_Sub13Array1147[var11].method161((byte) -45);
        }

        return var9;
      } else {
        return null;
      }
  }

  public boolean method1408(boolean var1, ITextureCache var2,
      FileUnpacker var3 ) {
    int var4;
      if (GlobalStatics_9.anInt1668 > 0) {
        for (var4 = 0; (var4 < this.anIntArray1144.length); ++var4) {
          if (!var3.method2129((byte) -78, this.anIntArray1144[var4], GlobalStatics_9.anInt1668)) {
            return false;
          }
        }
      } else {
        for (var4 = 0; (var4 < this.anIntArray1144.length); ++var4) {
          if (!var3.isLoaded(this.anIntArray1144[var4])) {
            return false;
          }
        }
      }

      if (!var1) {
        this.anIntArray1144 = null;
      }

      for (var4 = 0; this.anIntArray1149.length > var4; ++var4) {
        if (!var2.method11(21, this.anIntArray1149[var4])) {
          return false;
        }
      }

      return true;
  }

}
