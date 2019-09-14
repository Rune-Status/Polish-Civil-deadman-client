package com.jagex.runescape.huffman;

public final class HuffmanEncoder {

  private int[] anIntArray633;
  private final byte[] codewords;
  private final int[] lengths;

  public HuffmanEncoder(byte[] var1) {
    int[] var3 = new int[33];
    int var2 = var1.length;
    this.anIntArray633 = new int[8];
    this.lengths = new int[var2];
    this.codewords = var1;
    int var4 = 0;

    for (int var5 = 0; var2 > var5; ++var5) {
      byte var6 = var1[var5];
      if ((var6 != 0)) {
        int var7 = 1 << 32 - var6;
        int var8 = var3[var6];
        this.lengths[var5] = var8;
        int var9;
        int var10;
        int var11;
        int var12;
        if ((var8 & var7) == 0) {
          for (var10 = -1 + var6; (var10 >= 1); --var10) {
            var11 = var3[var10];
            if ((var8 != var11)) {
              break;
            }

            var12 = 1 << -var10 + 32;
            if ((var11 & var12) != 0) {
              var3[var10] = var3[-1 + var10];
              break;
            }

            var3[var10] = HuffmanEncoderStatics.method308(var12, var11);
          }

          var9 = var8 | var7;
        } else {
          var9 = var3[-1 + var6];
        }

        var3[var6] = var9;

        for (var10 = var6 + 1; var10 <= 32; ++var10) {
          if ((var8 == var3[var10])) {
            var3[var10] = var9;
          }
        }

        var10 = 0;

        for (var11 = 0; var11 < var6; ++var11) {
          var12 = Integer.MIN_VALUE >>> var11;
          if ((var8 & var12) == 0) {
            ++var10;
          } else {
            if (this.anIntArray633[var10] == 0) {
              this.anIntArray633[var10] = var4;
            }

            var10 = this.anIntArray633[var10];
          }

          if (this.anIntArray633.length <= var10) {
            int[] var13 = new int[this.anIntArray633.length * 2];

            for (int var14 = 0; (var14 < this.anIntArray633.length); ++var14) {
              var13[var14] = this.anIntArray633[var14];
            }

            this.anIntArray633 = var13;
          }

          var12 >>>= 1;
        }

        this.anIntArray633[var10] = ~var5;
        if ((var10 >= var4)) {
          var4 = var10 + 1;
        }
      }
    }
  }

  public int method1015(int var1, int var2, byte[] var3, byte[] var4, int var5,
      int var6) {
    var1 += var5;
    int var7 = 0;

    int var8;
    for (var8 = var6 << 3; var1 > var5; ++var5) {
      int var9 = var4[var5] & 255;
      int var10 = this.lengths[var9];
      byte var11 = this.codewords[var9];
      if (var11 == 0) {
        throw new RuntimeException("No codeword for data value " + var9);
      }

      int var12 = var8 >> 3;
      int var13 = var8 & 7;
      var8 += var11;
      int var14 = var12 + (var13 + var11 - 1 >> 3);
      var7 &= -var13 >> 31;
      var13 += 24;
      var3[var12] = (byte) (var7 = HuffmanEncoderStatics
          .method308(var7, var10 >>> var13));
      if ((var12 < var14)) {
        ++var12;
        var13 -= 8;
        var3[var12] = (byte) (var7 = var10 >>> var13);
        if (var12 < var14) {
          var13 -= 8;
          ++var12;
          var3[var12] = (byte) (var7 = var10 >>> var13);
          if (var14 > var12) {
            var13 -= 8;
            ++var12;
            var3[var12] = (byte) (var7 = var10 >>> var13);
            if (var14 > var12) {
              ++var12;
              var13 -= 8;
              var3[var12] = (byte) (var7 = var10 << -var13);
            }
          }
        }
      }
    }

    if (var2 >= -73) {
      this.anIntArray633 = null;
    }

    return -var6 + (var8 + 7 >> 3);
  }

  public int decompress(byte[] src, int srcOff, byte[] dest, int destOff,
      int len) {
    if ((len == 0)) {
      return 0;
    } else {
      int var7 = 0;
      len += destOff;
      int var8 = srcOff;

      while (true) {
        byte b = src[var8];
        if (b < 0) {
          var7 = this.anIntArray633[var7];
        } else {
          ++var7;
        }

        int var10;
        if ((var10 = this.anIntArray633[var7]) < 0) {
          dest[destOff++] = (byte) (~var10);
          if (destOff >= len) {
            break;
          }

          var7 = 0;
        }

        if (((64 & b) == 0)) {
          ++var7;
        } else {
          var7 = this.anIntArray633[var7];
        }

        if (((var10 = this.anIntArray633[var7]) < 0)) {
          dest[destOff++] = (byte) (~var10);
          if (len <= destOff) {
            break;
          }

          var7 = 0;
        }

        if (((32 & b) == 0)) {
          ++var7;
        } else {
          var7 = this.anIntArray633[var7];
        }

        if ((var10 = this.anIntArray633[var7]) < 0) {
          dest[destOff++] = (byte) (~var10);
          if ((len <= destOff)) {
            break;
          }

          var7 = 0;
        }

        if ((b & 16) == 0) {
          ++var7;
        } else {
          var7 = this.anIntArray633[var7];
        }

        if (((var10 = this.anIntArray633[var7]) < 0)) {
          dest[destOff++] = (byte) (~var10);
          if (destOff >= len) {
            break;
          }

          var7 = 0;
        }

        if (((b & 8) == 0)) {
          ++var7;
        } else {
          var7 = this.anIntArray633[var7];
        }

        if ((var10 = this.anIntArray633[var7]) < 0) {
          dest[destOff++] = (byte) (~var10);
          if (len <= destOff) {
            break;
          }

          var7 = 0;
        }

        if (((b & 4) == 0)) {
          ++var7;
        } else {
          var7 = this.anIntArray633[var7];
        }

        if (((var10 = this.anIntArray633[var7]) < 0)) {
          dest[destOff++] = (byte) (~var10);
          if ((destOff >= len)) {
            break;
          }

          var7 = 0;
        }

        if ((b & 2) == 0) {
          ++var7;
        } else {
          var7 = this.anIntArray633[var7];
        }

        if (((var10 = this.anIntArray633[var7]) < 0)) {
          dest[destOff++] = (byte) (~var10);
          if ((destOff >= len)) {
            break;
          }

          var7 = 0;
        }

        if ((1 & b) == 0) {
          ++var7;
        } else {
          var7 = this.anIntArray633[var7];
        }

        if ((var10 = this.anIntArray633[var7]) < 0) {
          dest[destOff++] = (byte) (~var10);
          if (destOff >= len) {
            break;
          }

          var7 = 0;
        }

        ++var8;
      }

      return -srcOff + 1 + var8;
    }
  }

}
