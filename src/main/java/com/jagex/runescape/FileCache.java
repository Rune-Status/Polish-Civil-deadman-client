package com.jagex.runescape;

import java.io.EOFException;
import java.io.IOException;

public final class FileCache {

  public static ObjectCache aClass93_684 = new ObjectCache(64);
  public static int anInt685;
  public static int[] anIntArray686 = new int[2];
  public static int anInt688;
  public static int fogOffset;
  private BufferedFile aClass30_681;
  private final int anInt682;
  private BufferedFile aClass30_683;
  private int anInt687 = '\ufde8';


  public FileCache(int var1, BufferedFile var2, BufferedFile var3, int var4 ) {
    this.anInt687 = var4;
      this.aClass30_683 = var3;
      this.anInt682 = var1;
      this.aClass30_681 = var2;
  }

  public String toString() {
    return "com.jagex.runescape.Cache:" + this.anInt682;
  }

  public boolean method1050(int var1, int var2, byte[] var3, byte var4 ) {
    BufferedFile var5 = this.aClass30_681;
      synchronized (var5) {
        if (var4 != -41) {
          return true;
        } else if (var2 >= 0 && var2 <= this.anInt687) {
          boolean var6 = this.method1054((byte) 87, var2, var1, var3, true);
          if (!var6) {
            var6 = this.method1054((byte) 87, var2, var1, var3, false);
          }

          return var6;
        } else {
          throw new IllegalArgumentException();
        }
      }
  }

  public byte[] method1051(int var1, byte var2 ) {
    BufferedFile var3 = this.aClass30_681;
      synchronized (var3) {
        Object var10000;
        try {
          if ((this.aClass30_683.method976(0) < (var1 * 6 + 6))) {
            var10000 = null;
            return null;
          }

          this.aClass30_683.seek(-35, 6 * var1);
          this.aClass30_683.method978(0, DummyClass11.aByteArray2040, 6, 0);
          int var5 = ((255 & DummyClass11.aByteArray2040[3]) << 16) - (
            -(DummyClass11.aByteArray2040[4] << 8 & '\uff00') + -(255
              & DummyClass11.aByteArray2040[5]));
          int var6 = 24 / ((-4 - var2) / 40);
          int var4 = (DummyClass11.aByteArray2040[2] & 255) + ('\uff00'
            & DummyClass11.aByteArray2040[1] << 8) + (16711680
            & DummyClass11.aByteArray2040[0] << 16);
          if (this.anInt687 < var4) {
            var10000 = null;
            return null;
          }

          if (var5 > 0 && (var5 <= (this.aClass30_681.method976(0) / 520L))) {
            byte[] var7 = new byte[var4];
            int var8 = 0;

            int var13;
            for (int var9 = 0; (var8 < var4); var5 = var13) {
              if (var5 == 0) {
                var10000 = null;
                return null;
              }

              int var10 = -var8 + var4;
              this.aClass30_681.seek(-113, 520 * var5);
              if ((var10 > 512)) {
                var10 = 512;
              }

              this.aClass30_681
                  .method978(0, DummyClass11.aByteArray2040, 8 + var10, 0);
              int var11 = (DummyClass11.aByteArray2040[0] << 8 & '\uff00') - -(255
                & DummyClass11.aByteArray2040[1]);
              int var12 = (DummyClass11.aByteArray2040[3] & 255) + ('\uff00'
                & DummyClass11.aByteArray2040[2] << 8);
              int var14 = 255 & DummyClass11.aByteArray2040[7];
              var13 = (DummyClass11.aByteArray2040[6] & 255) + ('\uff00'
                & DummyClass11.aByteArray2040[5] << 8) + (DummyClass11.aByteArray2040[4] << 16
                & 16711680);
              if (var1 != var11 || var9 != var12 || this.anInt682 != var14) {
                var10000 = null;
                return null;
              }

              if (var13 < 0 || var13 > this.aClass30_681.method976(0) / 520L) {
                var10000 = null;
                return null;
              }

              for (int var15 = 0; (var15 < var10); ++var15) {
                var7[var8++] = DummyClass11.aByteArray2040[var15 + 8];
              }

              ++var9;
            }

            byte[] var20 = var7;
            return var20;
          }

          var10000 = null;
        } catch (IOException var17) {
          return null;
        }

        return null;
      }
  }

  private boolean method1054(byte var1, int var2, int var3, byte[] var4, boolean var5) {
    BufferedFile var6 = this.aClass30_681;
      synchronized (var6) {
        try {
          int var7;
          boolean var10000;
          if (var5) {
            if (this.aClass30_683.method976(var1 ^ 87) < (6 + var3 * 6)) {
              var10000 = false;
              return false;
            }

            this.aClass30_683.seek(-116, 6 * var3);
            this.aClass30_683.method978(0, DummyClass11.aByteArray2040, 6, 0);
            var7 = (16711680 & DummyClass11.aByteArray2040[3] << 16) + ('\uff00'
              & DummyClass11.aByteArray2040[4] << 8) + (DummyClass11.aByteArray2040[5] & 255);
            if ((var7 <= 0) || ((this.aClass30_681.method976(0) / 520L) < var7)) {
              var10000 = false;
              return false;
            }
          } else {
            var7 = (int) ((this.aClass30_681.method976(var1 + -87) - -519L) / 520L);
            if ((var7 == 0)) {
              var7 = 1;
            }
          }

          DummyClass11.aByteArray2040[0] = (byte) (var2 >> 16);
          DummyClass11.aByteArray2040[4] = (byte) (var7 >> 8);
          int var8 = 0;
          DummyClass11.aByteArray2040[5] = (byte) var7;
          DummyClass11.aByteArray2040[2] = (byte) var2;
          DummyClass11.aByteArray2040[3] = (byte) (var7 >> 16);
          if (var1 != 87) {
            this.method1054((byte) 41, 108, -107, null, true);
          }

          int var9 = 0;
          DummyClass11.aByteArray2040[1] = (byte) (var2 >> 8);
          this.aClass30_683.seek(-14, var3 * 6);
          this.aClass30_683
              .write(DummyClass11.aByteArray2040, 0, var1 ^ -903171097, 6);

          while (true) {
            if ((var8 < var2)) {
              label146:
              {
                int var10 = 0;
                int var11;
                if (var5) {
                  this.aClass30_681.seek(-116, 520 * var7);

                  try {
                    this.aClass30_681
                        .method978(0, DummyClass11.aByteArray2040, 8, 0);
                  } catch (EOFException var15) {
                    break label146;
                  }

                  var10 = ((DummyClass11.aByteArray2040[4] & 255) << 16) + ('\uff00'
                    & DummyClass11.aByteArray2040[5] << 8) - -(DummyClass11.aByteArray2040[6]
                    & 255);
                  var11 =
                    (255 & DummyClass11.aByteArray2040[1]) + ((DummyClass11.aByteArray2040[0] & 255)
                      << 8);
                  int var13 = 255 & DummyClass11.aByteArray2040[7];
                  int var12 =
                    (DummyClass11.aByteArray2040[3] & 255) + (DummyClass11.aByteArray2040[2] << 8
                      & '\uff00');
                  if (var11 != var3 || (var9 != var12) || (this.anInt682 != var13)) {
                    var10000 = false;
                    return false;
                  }

                  if (var10 < 0 || var10 > (this.aClass30_681.method976(0) / 520L)) {
                    var10000 = false;
                    return false;
                  }
                }

                var11 = -var8 + var2;
                if ((var10 == 0)) {
                  var5 = false;
                  var10 = (int) ((this.aClass30_681.method976(0) - -519L) / 520L);
                  if ((var10 == 0)) {
                    ++var10;
                  }

                  if ((var10 == var7)) {
                    ++var10;
                  }
                }

                DummyClass11.aByteArray2040[7] = (byte) this.anInt682;
                DummyClass11.aByteArray2040[0] = (byte) (var3 >> 8);
                if (((-var8 + var2) <= 512)) {
                  var10 = 0;
                }

                DummyClass11.aByteArray2040[4] = (byte) (var10 >> 16);
                if ((var11 > 512)) {
                  var11 = 512;
                }

                DummyClass11.aByteArray2040[1] = (byte) var3;
                DummyClass11.aByteArray2040[6] = (byte) var10;
                DummyClass11.aByteArray2040[2] = (byte) (var9 >> 8);
                DummyClass11.aByteArray2040[3] = (byte) var9;
                ++var9;
                DummyClass11.aByteArray2040[5] = (byte) (var10 >> 8);
                this.aClass30_681.seek(var1 + -128, var7 * 520);
                var7 = var10;
                this.aClass30_681
                    .write(DummyClass11.aByteArray2040, 0, -903171152, 8);
                this.aClass30_681.write(var4, var8, -903171152, var11);
                var8 += var11;
                continue;
              }
            }

            var10000 = true;
            return true;
          }
        } catch (IOException var16) {
          return false;
        }
      }
  }

  public static void method1047(int var0, int var1, int var2, boolean var3, int var4, boolean var5,
                               boolean var6) {
    if (!var6) {
        if (var2 > var4) {
          int var7 = (var2 + var4) / 2;
          int var8 = var4;
          GameWorld var9 = TextureSampler15.aClass44_Sub1Array3201[var7];
          TextureSampler15.aClass44_Sub1Array3201[var7] =
            TextureSampler15.aClass44_Sub1Array3201[var2];
          TextureSampler15.aClass44_Sub1Array3201[var2] = var9;

          for (int var10 = var4; var10 < var2; ++var10) {
            if ((GameString.method1535(var9, TextureSampler15.aClass44_Sub1Array3201[var10], 5730,
              var0, var1, var3, var5) <= 0)) {
              GameWorld var11 = TextureSampler15.aClass44_Sub1Array3201[var10];
              TextureSampler15.aClass44_Sub1Array3201[var10] =
                TextureSampler15.aClass44_Sub1Array3201[var8];
              TextureSampler15.aClass44_Sub1Array3201[var8++] = var11;
            }
          }

          TextureSampler15.aClass44_Sub1Array3201[var2] =
            TextureSampler15.aClass44_Sub1Array3201[var8];
          TextureSampler15.aClass44_Sub1Array3201[var8] = var9;
          FileCache.method1047(var0, var1, -1 + var8, var3, var4, var5, false);
          FileCache.method1047(var0, var1, var2, var3, var8 - -1, var5, false);
        }

      }
  }

  public static void method1048(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                               int var7) {
    if (var5 > -15) {
        FileCache.anInt688 = -64;
      }

      if ((var1 >= 1) && var4 >= 1 && var1 <= 102 && var4 <= 102) {
        int var8;
        if (!NPC.method1986(41) &&
            (2 & BZipDecompressorState.tileFlags[0][var1][var4]) == 0) {
          var8 = var2;
          if ((8 & BZipDecompressorState.tileFlags[var2][var1][var4]) != 0) {
            var8 = 0;
          }

          if (var8 != GameObject.plane) {
            return;
          }
        }

        var8 = var2;
        if ((var2 < 3) && ((2 & BZipDecompressorState.tileFlags[1][var1][var4]) == 2)) {
          var8 = var2 + 1;
        }

        DummyClass29.method910(-96, var4, var1, var2, var7, var8, BlockConfig.collisionMaps[var2]);
        if (var0 >= 0) {
          boolean var9 = Keyboard.aBoolean1905;
          Keyboard.aBoolean1905 = true;
          DummyClass31.method1683(var8, false, var2, false, BlockConfig.collisionMaps[var2], var0,
            var6, var1, (byte) 50, var4, var3);
          Keyboard.aBoolean1905 = var9;
        }
      }
  }

  public static void method1049(boolean var0) {
    FileCache.anIntArray686 = null;
      FileCache.aClass93_684 = null;
  }

  public static GameString stringFromBase37(int var0, long var1) {
    if ((var1 > 0L) && (var1 < 6582952005840035281L)) {
        if (((var1 % 37L) == 0L)) {
          return null;
        } else {
          int var3 = 0;

          for (long var4 = var1; var4 != 0L; ++var3) {
            var4 /= 37L;
          }

          byte[] var6 = new byte[var3];
          if (var0 != -29664) {
            FileCache.method1047(2, -55, -50, false, 52, false, false);
          }

          while (var1 != 0L) {
            long var7 = var1;
            var1 /= 37L;
            --var3;
            var6[var3] = DummyClass9.aByteArray4005[(int) (-(var1 * 37L) + var7)];
          }

          GameString var10 = new GameString();
          var10.bytes = var6;
          var10.length = var6.length;
          return var10;
        }
      } else {
        return null;
      }
  }

  public static void method1053(byte var0, FileUnpacker var1) {
    TriChromaticImageCache.aClass153_1372 = var1;
      int var2 = -52 / ((var0 - -55) / 36);
  }

}
