package com.jagex.runescape.model;

import com.jagex.runescape.buffer.Buffer;

public final class FloorUnderlay {

  public int anInt1406;
  public int anInt1408;
  public boolean aBoolean1411 = true;
  public int anInt1412 = -1;
  public int anInt1414 = 128;
  public int anInt1417;
  public int anInt1418;
  private int anInt1404;

  private void setHSL(int var1, byte var2) {
    double red = (255 & var1 >> 16) / 256.0D;
    double green = (255 & var1 >> 8) / 256.0D;
    double min = red;
    double blue = (var1 & 255) / 256.0D;
    if (green < red) {
      min = green;
    }

    if (blue < min) {
      min = blue;
    }

    double max = red;
    int var13 = 77 % ((var2 - 21) / 57);
    double var14 = 0.0D;
    if (green > red) {
      max = green;
    }

    if (blue > max) {
      max = blue;
    }

    double var16 = 0.0D;
    double var18 = (max + min) / 2.0D;
    if (min != max) {
      if (var18 < 0.5D) {
        var16 = (max - min) / (max + min);
      }

      if (max == red) {
        var14 = (-blue + green) / (-min + max);
      } else {
        if (green == max) {
          var14 = (blue - red) / (max - min) + 2.0D;
        } else {
          if (blue == max) {
            var14 = 4.0D + (-green + red) / (-min + max);
          }
        }
      }

      if (var18 >= 0.5D) {
        var16 = (max - min) / (-min + (2.0D - max));
      }
    }

    if (var18 > 0.5D) {
      this.anInt1418 = (int) (var16 * (-var18 + 1.0D) * 512.0D);
    } else {
      this.anInt1418 = (int) (var16 * var18 * 512.0D);
    }

    if (this.anInt1418 < 1) {
      this.anInt1418 = 1;
    }

    this.anInt1406 = (int) (var16 * 256.0D);
    this.anInt1417 = (int) (256.0D * var18);
    if (this.anInt1417 >= 0) {
      if (this.anInt1417 > 255) {
        this.anInt1417 = 255;
      }
    } else {
      this.anInt1417 = 0;
    }

    var14 /= 6.0D;
    this.anInt1408 = (int) (this.anInt1418 * var14);
    if (this.anInt1406 >= 0) {
      if (this.anInt1406 > 255) {
        this.anInt1406 = 255;
      }
    } else {
      this.anInt1406 = 0;
    }
  }

  public void parseConfig(int var1, Buffer var2, int var3) {
    while (true) {
      int opcode = var2.readUnsignedByte();
      if (opcode == 0) {
        return;
      }

      this.method1604(opcode, var2, var1);
    }
  }

  private void method1604(int var2, Buffer var3, int var4) {
    if (var2 == 1) {
      this.anInt1404 = var3.readUnsignedMedium((byte) 93);
      this.setHSL(this.anInt1404, (byte) 81);
    } else {
      if (var2 == 2) {
        this.anInt1412 = var3.readUnsignedShort();
        if (this.anInt1412 == 65535) {
          this.anInt1412 = -1;
        }
      } else {
        if (var2 == 3) {
          this.anInt1414 = var3.readUnsignedShort();
        } else if (var2 == 4) {
          this.aBoolean1411 = false;
        }
      }
    }
  }

}
