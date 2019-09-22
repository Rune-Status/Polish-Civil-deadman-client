package com.jagex.runescape.opengl;

import com.jagex.runescape.common.MathUtilities;
import com.jagex.runescape.statics.GlobalStatics_10;
import com.jagex.runescape.buffer.Buffer;

public final class Light {

  public boolean aBoolean690;
  public boolean aBoolean696;
  public int anInt697;
  public int anInt698;
  public int anInt703;
  public int anInt704;
  public int anInt705;
  public short[] aShortArray706;
  public float aFloat707;
  public int anInt708;
  public float aFloat710;
  public boolean aBoolean711;
  public SomethingLight aClass37_712;
  public int color;
  public float[] colors = new float[4];
  private int anInt693;
  private int anInt694;
  private int anInt702;
  private int anInt709;
  private int anInt714;

  public Light(Buffer var1) {
    if (GlobalStatics_10.anIntArray3107 == null) {
      GLStatics.method1083();
    }

    this.anInt704 = var1.readUnsignedByte();
    this.aBoolean690 = (this.anInt704 & 16) != 0;
    this.aBoolean711 = (this.anInt704 & 8) != 0;
    this.anInt704 &= 7;
    this.anInt703 = var1.readUnsignedShort();
    this.anInt708 = var1.readUnsignedShort();
    this.anInt697 = var1.readUnsignedShort();
    this.anInt698 = var1.readUnsignedByte();
    this.method1061(66);
    this.aShortArray706 = new short[this.anInt698 * 2 + 1];

    int var2;
    for (var2 = 0; var2 < this.aShortArray706.length; ++var2) {
      this.aShortArray706[var2] = (short) var1.readUnsignedShort();
    }

    this.color = GLStatics.hslTable[var1.readUnsignedShort()];
    var2 = var1.readUnsignedByte();
    this.anInt714 = 1792 & var2 << 3;
    this.anInt705 = var2 & 31;
    if (this.anInt705 != 31) {
      this.method1064(3);
    }
  }

  public void method1060(byte var1, int var2, int var3, int var4, int var5) {
    this.anInt694 = var2;
    this.anInt702 = var4;
    this.anInt693 = var5;
    int var6 = -4 % ((var1 - 7) / 62);
    this.anInt709 = var3;
  }

  private void method1061(int var1) {
    int var2 = (this.anInt698 << 7) + 64;
    this.aFloat710 = 1.0F / (var2 * var2);
    int var3 = 9 % ((9 - var1) / 57);
  }

  public void method1063(boolean var1, int var2, int var3) {
    if (var3 != -3696) {
      GLStatics.method1058(-127, -32, -68, -32);
    }

    int var5 = this.anInt714 + var2 * this.anInt709 / 50 & 2047;
    int var6 = this.anInt694;
    int var4;
    if (var6 == 1) {
      var4 = 1024 + (MathUtilities.SINE_TABLE[var5] >> 6);
    } else if (var6 != 3) {
      if (var6 == 4) {
        var4 = var5 >> 10 << 11;
      } else if (var6 != 2) {
        if (var6 == 5) {
          var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
        } else {
          var4 = 2048;
        }
      } else {
        var4 = var5;
      }
    } else {
      var4 = GlobalStatics_10.anIntArray3107[var5] >> 1;
    }

    if (var1) {
      var4 = 2048;
    }

    this.aFloat707 = (this.anInt693 + (var4 * this.anInt702 >> 11)) / 2048.0F;
    float var8 = this.aFloat707 / 255.0F;
    this.colors[0] = ((this.color & 16771365) >> 16) * var8;
    this.colors[2] = var8 * (255 & this.color);
    this.colors[1] = ((this.color & (int) 0xffe7) >> 8) * var8;
  }

  private void method1064(int var1) {
    int var2 = this.anInt705;
    if (var2 == 2) {
      this.anInt702 = 2048;
      this.anInt693 = 0;
      this.anInt694 = 1;
      this.anInt709 = 2048;
    } else {
      if (var2 == 3) {
        this.anInt693 = 0;
        this.anInt709 = 4096;
        this.anInt694 = 1;
        this.anInt702 = 2048;
      } else if (var2 != 4) {
        if (var2 == 5) {
          this.anInt694 = 4;
          this.anInt702 = 2048;
          this.anInt709 = 8192;
          this.anInt693 = 0;
        } else if (var2 != 12) {
          if (var2 == 13) {
            this.anInt709 = 8192;
            this.anInt702 = 2048;
            this.anInt694 = 2;
            this.anInt693 = 0;
          } else if (var2 != 10) {
            if (var2 == 11) {
              this.anInt694 = 3;
              this.anInt709 = 4096;
              this.anInt702 = 512;
              this.anInt693 = 1536;
            } else if (var2 != 6) {
              if (var2 == 7) {
                this.anInt702 = 768;
                this.anInt693 = 1280;
                this.anInt709 = 4096;
                this.anInt694 = 3;
              } else if (var2 == 8) {
                this.anInt709 = 2048;
                this.anInt694 = 3;
                this.anInt702 = 1024;
                this.anInt693 = 1024;
              } else if (var2 == 9) {
                this.anInt709 = 4096;
                this.anInt693 = 1024;
                this.anInt702 = 1024;
                this.anInt694 = 3;
              } else if (var2 != 14) {
                if (var2 == 15) {
                  this.anInt702 = 512;
                  this.anInt709 = 4096;
                  this.anInt693 = 1536;
                  this.anInt694 = 1;
                } else if (var2 != 16) {
                  this.anInt709 = 2048;
                  this.anInt693 = 0;
                  this.anInt702 = 2048;
                  this.anInt694 = 0;
                } else {
                  this.anInt709 = 8192;
                  this.anInt693 = 1792;
                  this.anInt694 = 1;
                  this.anInt702 = 256;
                }
              } else {
                this.anInt709 = 2048;
                this.anInt693 = 1280;
                this.anInt694 = 1;
                this.anInt702 = 768;
              }
            } else {
              this.anInt702 = 768;
              this.anInt693 = 1280;
              this.anInt694 = 3;
              this.anInt709 = 2048;
            }
          } else {
            this.anInt702 = 512;
            this.anInt694 = 3;
            this.anInt693 = 1536;
            this.anInt709 = 2048;
          }
        } else {
          this.anInt702 = 2048;
          this.anInt694 = 2;
          this.anInt709 = 2048;
          this.anInt693 = 0;
        }
      } else {
        this.anInt693 = 0;
        this.anInt702 = 2048;
        this.anInt694 = 4;
        this.anInt709 = 2048;
      }
    }

    if (var1 != 3) {
      this.anInt714 = -84;
    }
  }

}
