package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.done.AbstractTextureSampler;

public final class TextureSampler34 extends AbstractTextureSampler {

  public int anInt3056 = 4;
  public int anInt3058 = 4;
  public int anInt3060 = 4;
  public int anInt3062 = 1638;
  public boolean aBoolean3065 = true;
  public int anInt3067;
  private byte[] aByteArray3059 = new byte[512];
  private short[] aShortArray3063;
  private short[] aShortArray3066;

  public TextureSampler34() {
    super(0, true);
  }

  public void method186(boolean var1, int var2, int[] var3) {
    int var5 = this.anInt3056 * DummyClass4.anIntArray2999[var2];
      if (var1) {
        int var4;
        int var6;
        int var8;
        short var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var17;
        int var16;
        int var18;
        if ((this.anInt3058 == 1)) {
          var9 = this.aShortArray3066[0];
          var8 = this.aShortArray3063[0] << 12;
          var11 = var5 * var8 >> 12;
          var12 = this.anInt3060 * var8 >> 12;
          var13 = var8 * this.anInt3056 >> 12;
          var15 = var11 >> 12;
          var17 = this.aByteArray3059[255 & var15] & 255;
          var11 &= 4095;
          var14 = DummyClass3.anIntArray52[var11];
          var16 = var15 + 1;
          if ((var13 <= var16)) {
            var16 = 0;
          }

          var18 = 255 & this.aByteArray3059[255 & var16];
          if (this.aBoolean3065) {
            for (var10 = 0; GlobalStatics_9.anInt1559 > var10; ++var10) {
              var4 = this.anInt3060 * GlobalStatics_9.anIntArray2125[var10];
              var6 = this.method192(var8 * var4 >> 12, var18, var17, var12, 121,
                  var11, var14);
              var6 = var9 * var6 >> 12;
              var3[var10] = 2048 + (var6 >> 1);
            }
          } else {
            for (var10 = 0; var10 < GlobalStatics_9.anInt1559; ++var10) {
              var4 = this.anInt3060 * GlobalStatics_9.anIntArray2125[var10];
              var6 = this.method192(var8 * var4 >> 12, var18, var17, var12, 124,
                  var11, var14);
              var3[var10] = var9 * var6 >> 12;
            }
          }
        } else {
          var9 = this.aShortArray3066[0];
          if (var9 > 8 || var9 < -8) {
            var8 = this.aShortArray3063[0] << 12;
            var13 = var8 * this.anInt3056 >> 12;
            var12 = this.anInt3060 * var8 >> 12;
            var11 = var5 * var8 >> 12;
            var15 = var11 >> 12;
            var16 = 1 + var15;
            var17 = this.aByteArray3059[var15 & 255] & 255;
            var11 &= 4095;
            var14 = DummyClass3.anIntArray52[var11];
            if ((var16 >= var13)) {
              var16 = 0;
            }

            var18 = 255 & this.aByteArray3059[255 & var16];

            for (var10 = 0; GlobalStatics_9.anInt1559 > var10; ++var10) {
              var4 = GlobalStatics_9.anIntArray2125[var10] * this.anInt3060;
              var6 = this.method192(var4 * var8 >> 12, var18, var17, var12, 122,
                  var11, var14);
              var3[var10] = var6 * var9 >> 12;
            }
          }

          for (int var7 = 1; this.anInt3058 > var7; ++var7) {
            var9 = this.aShortArray3066[var7];
            if (var9 > 8 || var9 < -8) {
              var8 = this.aShortArray3063[var7] << 12;
              var11 = var8 * var5 >> 12;
              var15 = var11 >> 12;
              var17 = this.aByteArray3059[255 & var15] & 255;
              var12 = this.anInt3060 * var8 >> 12;
              var16 = var15 + 1;
              var11 &= 4095;
              var14 = DummyClass3.anIntArray52[var11];
              var13 = this.anInt3056 * var8 >> 12;
              if ((var16 >= var13)) {
                var16 = 0;
              }

              var18 = 255 & this.aByteArray3059[var16 & 255];
              if (this.aBoolean3065 && (var7 == (this.anInt3058 - 1))) {
                for (var10 = 0; GlobalStatics_9.anInt1559 > var10; ++var10) {
                  var4 = GlobalStatics_9.anIntArray2125[var10] * this.anInt3060;
                  var6 = this
                      .method192(var8 * var4 >> 12, var18, var17, var12, 120,
                          var11, var14);
                  var6 = (var9 * var6 >> 12) + var3[var10];
                  var3[var10] = (var6 >> 1) + 2048;
                }
              } else {
                for (var10 = 0; (var10 < GlobalStatics_9.anInt1559); ++var10) {
                  var4 = GlobalStatics_9.anIntArray2125[var10] * this.anInt3060;
                  var6 = this
                      .method192(var4 * var8 >> 12, var18, var17, var12, 126,
                          var11, var14);
                  var3[var10] += var6 * var9 >> 12;
                }
              }
            }
          }
        }

      }
  }

  private void method191(boolean var1) {
    int var2;
      if (this.anInt3062 <= 0) {
        if (this.aShortArray3066
            != null && this.aShortArray3066.length == this.anInt3058) {
          this.aShortArray3063 = new short[this.anInt3058];

          for (var2 = 0; var2 < this.anInt3058; ++var2) {
            this.aShortArray3063[var2] = (short) ((int) Math.pow(2.0D, var2));
          }
        }
      } else {
        this.aShortArray3066 = new short[this.anInt3058];
        this.aShortArray3063 = new short[this.anInt3058];

        for (var2 = 0; var2 < this.anInt3058; ++var2) {
          this.aShortArray3066[var2] =
              (short) ((int) (Math.pow(this.anInt3062 / 4096.0F,
                  var2)
                  * 4096.0D));
          this.aShortArray3063[var2] = (short) ((int) Math.pow(2.0D, var2));
        }
      }

      if (!var1) {
        this.method192(54, 5, -23, 103, -114, -67, -27);
      }
  }

  private int method192(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int var7) {
    if (var5 < 117) {
        this.method158(89);
      }

      int var10 = -4096 + var6;
      int var13 = var1 >> 12;
      int var12 = 1 + var13;
      var13 &= 255;
      if ((var12 >= var4)) {
        var12 = 0;
      }

      var1 &= 4095;
      int var14 = this.aByteArray3059[var13 + var3] & 3;
      int var15 = DummyClass3.anIntArray52[var1];
      int var8;
      if (var14 > 1) {
        var8 = var14 != 2 ? -var1 - var6 : var1 - var6;
      } else {
        var8 = var14 == 0 ? var6 + var1 : -var1 + var6;
      }

      var12 &= 255;
      int var11 = -4096 + var1;
      var14 = this.aByteArray3059[var3 + var12] & 3;
      int var9;
      if ((var14 <= 1)) {
        var9 = var14 == 0 ? var6 + var11 : -var11 + var6;
      } else {
        var9 = var14 == 2 ? -var6 + var11 : -var11 - var6;
      }

      var14 = this.aByteArray3059[var13 + var2] & 3;
      int var16 = var8 + ((var9 - var8) * var15 >> 12);
      if (var14 > 1) {
        var8 = var14 != 2 ? -var1 - var10 : var1 - var10;
      } else {
        var8 = var14 != 0 ? var10 - var1 : var1 + var10;
      }

      var14 = 3 & this.aByteArray3059[var2 + var12];
      if (var14 > 1) {
        var9 = (var14 != 2) ? -var10 - var11 : var11 - var10;
      } else {
        var9 = var14 == 0 ? var11 + var10 : var10 - var11;
      }

      int var17 = var8 + ((-var8 + var9) * var15 >> 12);
      return var16 + (var7 * (var17 - var16) >> 12);
  }

  public int[] method154(int var1, byte var2) {
    int var4 = 111 % ((30 - var2) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        this.method186(true, var1, var3);
      }

      return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3) {
    if (!var3) {
        this.method192(49, -110, -55, -117, 117, 10, -51);
      }

      if (var1 == 0) {
        this.aBoolean3065 = var2.readUnsignedByte() == 1;
      } else if ((var1 == 1)) {
        this.anInt3058 = var2.readUnsignedByte();
      } else if (var1 == 2) {
        this.anInt3062 = var2.method787((byte) 30);
        if (this.anInt3062 < 0) {
          this.aShortArray3066 = new short[this.anInt3058];

          for (int var4 = 0; this.anInt3058 > var4; ++var4) {
            this.aShortArray3066[var4] = (short) var2.method787((byte) 19);
          }
        }
      } else if (var1 == 3) {
        this.anInt3060 = this.anInt3056 = var2.readUnsignedByte();
      } else if (var1 == 4) {
        this.anInt3067 = var2.readUnsignedByte();
      } else if ((var1 == 5)) {
        this.anInt3060 = var2.readUnsignedByte();
      } else if (var1 == 6) {
        this.anInt3056 = var2.readUnsignedByte();
      }
  }

  public void method158(int var1) {
    this.aByteArray3059 = GlobalStatics_9.method1123(16711935,
          this.anInt3067);
      this.method191(true);

      for (int var2 = -1 + this.anInt3058; var2 >= 1; --var2) {
        short var3 = this.aShortArray3066[var2];
        if (var3 > 8 || var3 < -8) {
          break;
        }

        --this.anInt3058;
      }

      if (var1 != 16251) {
        this.anInt3062 = 101;
      }
  }

}
