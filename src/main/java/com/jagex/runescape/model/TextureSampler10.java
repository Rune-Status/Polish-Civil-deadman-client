package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.huffman.HuffmanEncoderStatics;
import com.jagex.runescape.statics.GlobalStatics_9;

public final class TextureSampler10 extends AbstractTextureSampler {

  private int[][] anIntArrayArray3438;
  private int[] anIntArray3443 = new int[257];

  public TextureSampler10() {
    super(1, false);
  }

  private void method345(int var1, boolean var2) {
    if (var1 != 0) {
        if (var1 == 1) {
          this.anIntArrayArray3438 = new int[2][4];
          this.anIntArrayArray3438[0][1] = 0;
          this.anIntArrayArray3438[0][0] = 0;
          this.anIntArrayArray3438[1][0] = 4096;
          this.anIntArrayArray3438[0][3] = 0;
          this.anIntArrayArray3438[1][1] = 4096;
          this.anIntArrayArray3438[0][2] = 0;
          this.anIntArrayArray3438[1][2] = 4096;
          this.anIntArrayArray3438[1][3] = 4096;
        } else if (var1 == 2) {
          this.anIntArrayArray3438 = new int[8][4];
          this.anIntArrayArray3438[0][0] = 0;
          this.anIntArrayArray3438[1][0] = 2867;
          this.anIntArrayArray3438[2][0] = 3072;
          this.anIntArrayArray3438[0][2] = 2602;
          this.anIntArrayArray3438[3][0] = 3276;
          this.anIntArrayArray3438[0][3] = 2361;
          this.anIntArrayArray3438[1][3] = 1558;
          this.anIntArrayArray3438[4][0] = 3481;
          this.anIntArrayArray3438[5][0] = 3686;
          this.anIntArrayArray3438[2][3] = 1413;
          this.anIntArrayArray3438[3][3] = 947;
          this.anIntArrayArray3438[4][3] = 722;
          this.anIntArrayArray3438[6][0] = 3891;
          this.anIntArrayArray3438[1][2] = 1799;
          this.anIntArrayArray3438[7][0] = 4096;
          this.anIntArrayArray3438[5][3] = 1766;
          this.anIntArrayArray3438[2][2] = 1734;
          this.anIntArrayArray3438[3][2] = 1220;
          this.anIntArrayArray3438[4][2] = 963;
          this.anIntArrayArray3438[5][2] = 2152;
          this.anIntArrayArray3438[6][3] = 915;
          this.anIntArrayArray3438[7][3] = 1140;
          this.anIntArrayArray3438[0][1] = 2650;
          this.anIntArrayArray3438[6][2] = 1060;
          this.anIntArrayArray3438[1][1] = 2313;
          this.anIntArrayArray3438[2][1] = 2618;
          this.anIntArrayArray3438[3][1] = 2296;
          this.anIntArrayArray3438[4][1] = 2072;
          this.anIntArrayArray3438[7][2] = 1413;
          this.anIntArrayArray3438[5][1] = 2730;
          this.anIntArrayArray3438[6][1] = 2232;
          this.anIntArrayArray3438[7][1] = 1686;
        } else if (var1 == 3) {
          this.anIntArrayArray3438 = new int[7][4];
          this.anIntArrayArray3438[0][0] = 0;
          this.anIntArrayArray3438[0][3] = 4096;
          this.anIntArrayArray3438[1][3] = 4096;
          this.anIntArrayArray3438[2][3] = 0;
          this.anIntArrayArray3438[1][0] = 663;
          this.anIntArrayArray3438[0][1] = 0;
          this.anIntArrayArray3438[3][3] = 0;
          this.anIntArrayArray3438[1][1] = 0;
          this.anIntArrayArray3438[2][0] = 1363;
          this.anIntArrayArray3438[2][1] = 0;
          this.anIntArrayArray3438[4][3] = 0;
          this.anIntArrayArray3438[5][3] = 4096;
          this.anIntArrayArray3438[6][3] = 4096;
          this.anIntArrayArray3438[3][0] = 2048;
          this.anIntArrayArray3438[4][0] = 2727;
          this.anIntArrayArray3438[5][0] = 3411;
          this.anIntArrayArray3438[6][0] = 4096;
          this.anIntArrayArray3438[3][1] = 4096;
          this.anIntArrayArray3438[4][1] = 4096;
          this.anIntArrayArray3438[5][1] = 4096;
          this.anIntArrayArray3438[6][1] = 0;
          this.anIntArrayArray3438[0][2] = 0;
          this.anIntArrayArray3438[1][2] = 4096;
          this.anIntArrayArray3438[2][2] = 4096;
          this.anIntArrayArray3438[3][2] = 4096;
          this.anIntArrayArray3438[4][2] = 0;
          this.anIntArrayArray3438[5][2] = 0;
          this.anIntArrayArray3438[6][2] = 0;
        } else if (var1 == 4) {
          this.anIntArrayArray3438 = new int[6][4];
          this.anIntArrayArray3438[0][3] = 0;
          this.anIntArrayArray3438[0][0] = 0;
          this.anIntArrayArray3438[0][2] = 0;
          this.anIntArrayArray3438[1][0] = 1843;
          this.anIntArrayArray3438[1][2] = 0;
          this.anIntArrayArray3438[2][2] = 0;
          this.anIntArrayArray3438[1][3] = 1493;
          this.anIntArrayArray3438[2][3] = 2939;
          this.anIntArrayArray3438[3][3] = 3565;
          this.anIntArrayArray3438[3][2] = 1124;
          this.anIntArrayArray3438[4][3] = 4031;
          this.anIntArrayArray3438[0][1] = 0;
          this.anIntArrayArray3438[1][1] = 0;
          this.anIntArrayArray3438[5][3] = 4096;
          this.anIntArrayArray3438[4][2] = 3084;
          this.anIntArrayArray3438[2][0] = 2457;
          this.anIntArrayArray3438[2][1] = 0;
          this.anIntArrayArray3438[3][0] = 2781;
          this.anIntArrayArray3438[4][0] = 3481;
          this.anIntArrayArray3438[3][1] = 0;
          this.anIntArrayArray3438[4][1] = 546;
          this.anIntArrayArray3438[5][2] = 4096;
          this.anIntArrayArray3438[5][0] = 4096;
          this.anIntArrayArray3438[5][1] = 4096;
        } else if (var1 == 5) {
          this.anIntArrayArray3438 = new int[16][4];
          this.anIntArrayArray3438[0][3] = 321;
          this.anIntArrayArray3438[0][0] = 0;
          this.anIntArrayArray3438[0][2] = 192;
          this.anIntArrayArray3438[1][0] = 155;
          this.anIntArrayArray3438[1][3] = 562;
          this.anIntArrayArray3438[1][2] = 449;
          this.anIntArrayArray3438[2][0] = 389;
          this.anIntArrayArray3438[3][0] = 671;
          this.anIntArrayArray3438[2][2] = 690;
          this.anIntArrayArray3438[0][1] = 80;
          this.anIntArrayArray3438[1][1] = 321;
          this.anIntArrayArray3438[4][0] = 897;
          this.anIntArrayArray3438[3][2] = 995;
          this.anIntArrayArray3438[4][2] = 1397;
          this.anIntArrayArray3438[2][1] = 578;
          this.anIntArrayArray3438[2][3] = 803;
          this.anIntArrayArray3438[5][0] = 1175;
          this.anIntArrayArray3438[6][0] = 1368;
          this.anIntArrayArray3438[5][2] = 1429;
          this.anIntArrayArray3438[3][1] = 947;
          this.anIntArrayArray3438[7][0] = 1507;
          this.anIntArrayArray3438[4][1] = 1285;
          this.anIntArrayArray3438[6][2] = 1461;
          this.anIntArrayArray3438[8][0] = 1736;
          this.anIntArrayArray3438[3][3] = 1140;
          this.anIntArrayArray3438[9][0] = 2088;
          this.anIntArrayArray3438[7][2] = 1525;
          this.anIntArrayArray3438[4][3] = 1509;
          this.anIntArrayArray3438[5][1] = 1525;
          this.anIntArrayArray3438[6][1] = 1734;
          this.anIntArrayArray3438[5][3] = 1413;
          this.anIntArrayArray3438[8][2] = 1590;
          this.anIntArrayArray3438[10][0] = 2355;
          this.anIntArrayArray3438[9][2] = 2056;
          this.anIntArrayArray3438[7][1] = 1413;
          this.anIntArrayArray3438[11][0] = 2691;
          this.anIntArrayArray3438[12][0] = 3031;
          this.anIntArrayArray3438[6][3] = 1333;
          this.anIntArrayArray3438[10][2] = 2586;
          this.anIntArrayArray3438[11][2] = 3148;
          this.anIntArrayArray3438[13][0] = 3522;
          this.anIntArrayArray3438[14][0] = 3727;
          this.anIntArrayArray3438[7][3] = 1702;
          this.anIntArrayArray3438[8][1] = 1108;
          this.anIntArrayArray3438[9][1] = 1766;
          this.anIntArrayArray3438[10][1] = 2409;
          this.anIntArrayArray3438[15][0] = 4096;
          this.anIntArrayArray3438[12][2] = 3710;
          this.anIntArrayArray3438[11][1] = 3116;
          this.anIntArrayArray3438[13][2] = 3421;
          this.anIntArrayArray3438[12][1] = 3806;
          this.anIntArrayArray3438[13][1] = 3437;
          this.anIntArrayArray3438[14][1] = 3116;
          this.anIntArrayArray3438[15][1] = 2377;
          this.anIntArrayArray3438[8][3] = 2056;
          this.anIntArrayArray3438[9][3] = 2666;
          this.anIntArrayArray3438[14][2] = 3148;
          this.anIntArrayArray3438[15][2] = 2505;
          this.anIntArrayArray3438[10][3] = 3276;
          this.anIntArrayArray3438[11][3] = 3228;
          this.anIntArrayArray3438[12][3] = 3196;
          this.anIntArrayArray3438[13][3] = 3019;
          this.anIntArrayArray3438[14][3] = 3228;
          this.anIntArrayArray3438[15][3] = 2746;
        } else {
          if (var1 != 6) {
            throw new RuntimeException("Invalid gradient preset");
          }

          this.anIntArrayArray3438 = new int[4][4];
          this.anIntArrayArray3438[0][3] = 0;
          this.anIntArrayArray3438[0][2] = 4096;
          this.anIntArrayArray3438[1][3] = 0;
          this.anIntArrayArray3438[0][1] = 0;
          this.anIntArrayArray3438[2][3] = 0;
          this.anIntArrayArray3438[3][3] = 0;
          this.anIntArrayArray3438[0][0] = 2048;
          this.anIntArrayArray3438[1][1] = 4096;
          this.anIntArrayArray3438[1][0] = 2867;
          this.anIntArrayArray3438[2][1] = 4096;
          this.anIntArrayArray3438[1][2] = 4096;
          this.anIntArrayArray3438[2][2] = 4096;
          this.anIntArrayArray3438[3][1] = 4096;
          this.anIntArrayArray3438[2][0] = 3276;
          this.anIntArrayArray3438[3][2] = 0;
          this.anIntArrayArray3438[3][0] = 4096;
        }
      }

      if (var2) {
        GlobalStatics_9.aClass3_Sub28_Sub17_Sub1_3440 = null;
      }
  }

  public void parseConfig(int var1, Buffer var2, boolean var3) {
    if (var3) {
        if (var1 == 0) {
          int var4 = var2.readUnsignedByte();
          if (var4 == 0) {
            this.anIntArrayArray3438 = new int[var2.readUnsignedByte()][4];

            for (int var5 = 0; this.anIntArrayArray3438.length > var5;
                ++var5) {
              this.anIntArrayArray3438[var5][0] = var2.readUnsignedShort();
              this.anIntArrayArray3438[var5][1] = var2.readUnsignedByte() << 4;
              this.anIntArrayArray3438[var5][2] = var2.readUnsignedByte() << 4;
              this.anIntArrayArray3438[var5][3] = var2.readUnsignedByte() << 4;
            }
          } else {
            this.method345(var4, false);
          }
        }

      }
  }

  public void method158(int var1) {
    if (var1 != 16251) {
        this.anIntArray3443 = null;
      }

      if (this.anIntArrayArray3438 == null) {
        this.method345(1, false);
      }

      this.method346(114);
  }

  public int[][] method166(int var1, int var2) {
    int[][] var3 = this.triChromaticImageCache
          .method1594((byte) 90, var2);
      if (var1 != -1) {
        this.parseConfig(-71, null, false);
      }

      if (this.triChromaticImageCache.aBoolean1379) {
        int[] var5 = this.method152(0, var2, 32755);
        int[] var7 = var3[1];
        int[] var6 = var3[0];
        int[] var8 = var3[2];

        for (int var9 = 0; GlobalStatics_9.anInt1559 > var9; ++var9) {
          int var4 = var5[var9] >> 4;
          if (var4 < 0) {
            var4 = 0;
          }

          if (var4 > 256) {
            var4 = 256;
          }

          var4 = this.anIntArray3443[var4];
          var6[var9] = (var4 & 16711680) >> 12;
          var7[var9] = 4080 & var4 >> 4;
          var8[var9] = (255 & var4) << 4;
        }
      }

      return var3;
  }

  private void method346(int var1) {
    if (var1 <= 95) {
        GlobalStatics_9.method350((byte) -28, -113);
      }

      int var5 = this.anIntArrayArray3438.length;
      if (var5 > 0) {
        for (int var6 = 0; var6 < 257; ++var6) {
          int var7 = 0;
          int var8 = var6 << 4;

          for (int var9 = 0;
              var5 > var9 && var8 >= this.anIntArrayArray3438[var9][0];
              ++var9) {
            ++var7;
          }

          int var2;
          int var3;
          int var4;
          int[] var14;
          if (var5 > var7) {
            var14 = this.anIntArrayArray3438[var7];
            if (var7 > 0) {
              int[] var10 = this.anIntArrayArray3438[-1 + var7];
              int var11 = (var8 - var10[0] << 12) / (var14[0] - var10[0]);
              int var12 = 4096 - var11;
              var4 = var10[3] * var12 + var14[3] * var11 >> 12;
              var2 = var12 * var10[1] + var11 * var14[1] >> 12;
              var3 = var12 * var10[2] + var11 * var14[2] >> 12;
            } else {
              var2 = var14[1];
              var4 = var14[3];
              var3 = var14[2];
            }
          } else {
            var14 = this.anIntArrayArray3438[var5 - 1];
            var4 = var14[3];
            var3 = var14[2];
            var2 = var14[1];
          }

          var2 >>= 4;
          var3 >>= 4;
          if (var2 < 0) {
            var2 = 0;
          } else if (var2 > 255) {
            var2 = 255;
          }

          if (var3 < 0) {
            var3 = 0;
          } else if (var3 > 255) {
            var3 = 255;
          }

          var4 >>= 4;
          if (var4 >= 0) {
            if (var4 > 255) {
              var4 = 255;
            }
          } else {
            var4 = 0;
          }

          this.anIntArray3443[var6] =
              HuffmanEncoderStatics.method308(var4,
                  HuffmanEncoderStatics.method308(var3 << 8, var2 << 16));
        }
      }
  }

}
