package com.jagex.runescape;

import java.util.Random;

public final class FloorUnderlay {

  private static GameString aClass94_1415 = GameString.create("Loaded input handler");
  public static int anInt1405;
  public static int anInt1407;
  public static FileUnpacker fileUnpacker19;
  public static SceneShadowMap aClass136_1413 = new SceneShadowMap();
  public static int anInt1416;
  public static GameString aClass94_1409 = FloorUnderlay.aClass94_1415;
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
        if (0.5D > var18) {
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

        if (0.5D <= var18) {
          var16 = (max - min) / (-min + (2.0D - max));
        }
      }

      if (var18 > 0.5D) {
        this.anInt1418 = (int) (var16 * (-var18 + 1.0D) * 512.0D);
      } else {
        this.anInt1418 = (int) (var16 * var18 * 512.0D);
      }

      if (1 > this.anInt1418) {
        this.anInt1418 = 1;
      }

      this.anInt1406 = (int) (var16 * 256.0D);
      this.anInt1417 = (int) (256.0D * var18);
      if (~this.anInt1417 <= -1) {
        if (255 < this.anInt1417) {
          this.anInt1417 = 255;
        }
      } else {
        this.anInt1417 = 0;
      }

      var14 /= 6.0D;
      this.anInt1408 = (int) (this.anInt1418 * var14);
      if (-1 >= ~this.anInt1406) {
        if (this.anInt1406 > 255) {
          this.anInt1406 = 255;
        }
      } else {
        this.anInt1406 = 0;
      }
  }

  public void parseConfig(int var1, Buffer var2, int var3 ) {
    while (true) {
        int opcode = var2.readUnsignedByte();
        if (opcode == 0) {
          return;
        }

        this.method1604(opcode, var2, var1);
      }
  }

  private void method1604(int var2, Buffer var3, int var4) {
    if (-2 == ~var2) {
        this.anInt1404 = var3.readUnsignedMedium((byte) 93);
        this.setHSL(this.anInt1404, (byte) 81);
      } else {
        if (var2 == 2) {
          this.anInt1412 = var3.readUnsignedShort();
          if (-65536 == ~this.anInt1412) {
            this.anInt1412 = -1;
          }
        } else {
          if (3 == var2) {
            this.anInt1414 = var3.readUnsignedShort();
          } else if (~var2 == -5) {
            this.aBoolean1411 = false;
          }
        }
      }
  }

  public static int method1602(int var0, GameString var1) {
    if (DummyClass25.aClass131_1624 != null && ~var1.getLength() != -1) {
        for (int var2 = var0; DummyClass25.aClass131_1624.anInt1720 > var2; ++var2) {
          if (DummyClass25.aClass131_1624.aClass94Array1721[var2].method1560(
            TextureSampler15.aClass94_3192, true, OndemandFileRequest.aClass94_4066)
            .method1562((byte) -32, var1)) {
            return var2;
          }
        }

        return -1;
      } else {
        return -1;
      }
  }

  public static int method1603(byte var0, int var1, Random var2) {
    if (~var1 >= -1) {
        throw new IllegalArgumentException();
      } else if (Projectile.isPo2((byte) -115, var1)) {
        return (int) ((var2.nextInt() & 4294967295L) * var1 >> 32);
      } else {
        int var3 = -((int) (4294967296L % var1)) + Integer.MIN_VALUE;

        int var4;
        do {
          var4 = var2.nextInt();
        } while (var3 <= var4);

        int var5 = -101 % ((var0 - -52) / 33);
        return TextureSampler27.method201(var4, var1, -58);
      }
  }

  public static void method1605(int var0, GameString var1, int var2) {
    ++SomethingSceneI.anInt421;
      TextureSampler12.secureBuffer.writePacket(188);
      TextureSampler12.secureBuffer.method790(var2, var0 + -13326);
      if (var0 == 255) {
        TextureSampler12.secureBuffer.writeLong(var1.toBase37());
      }
  }

  public static void method1606(byte var0) {
    FloorUnderlay.aClass94_1415 = null;
      FloorUnderlay.aClass94_1409 = null;
      int var1 = 86 % ((49 - var0) / 48);
      FloorUnderlay.fileUnpacker19 = null;
      FloorUnderlay.aClass136_1413 = null;
  }

}
