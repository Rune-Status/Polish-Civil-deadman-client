package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.done.AbstractTextureSampler;
import com.jagex.runescape.opengl.GlTexture2d;

public final class TextureSampler25 extends AbstractTextureSampler {

  public static int anInt3402;
  public static Cache aClass47_3407 = new Cache(64);
  public static GameString aClass94_3408 = GameStringStatics.create("Untersuchen");
  public static GameString aClass94_3409 = GameStringStatics.create("Musik)2Engine vorbereitet)3");
  public static long aLong3411;
  public static ObjectCache aClass93_3412 = new ObjectCache(64);
  public static int anInt3413;
  public static int anInt3414;
  public static int amountContextActions;
  public static boolean aBoolean3416;
  public static int yawSine;
  private final int[] anIntArray3403 = new int[3];
  private int anInt3404 = 409;
  private int anInt3405 = 4096;
  private int anInt3406 = 4096;
  private int anInt3410 = 4096;


  public TextureSampler25() {
    super(1, false);
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var3) {
        if (var1 == 0) {
          this.anInt3404 = var2.readUnsignedShort();
        } else if (var1 != 1) {
          if ((var1 == 2)) {
            this.anInt3406 = var2.readUnsignedShort();
          } else if (var1 != 3) {
            if (var1 == 4) {
              int var4 = var2.readUnsignedMedium((byte) 107);
              this.anIntArray3403[2] = (var4 & 255) >> 12;
              this.anIntArray3403[1] = var4 >> 4 & 4080;
              this.anIntArray3403[0] = (16711680 & var4) << 4;
            }
          } else {
            this.anInt3410 = var2.readUnsignedShort();
          }
        } else {
          this.anInt3405 = var2.readUnsignedShort();
        }

      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        this.method166(51, 104);
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) 91, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[][] var4 = this.method162(var2, 0, (byte) -96);
        assert var4 != null;
        int[] var5 = var4[0];
        int[] var6 = var4[1];
        int[] var7 = var4[2];
        int[] var8 = var3[0];
        int[] var9 = var3[1];
        int[] var10 = var3[2];

        for (int var11 = 0; var11 < SomethingLight0.anInt1559; ++var11) {
          int var13 = var5[var11];
          int var12 = -this.anIntArray3403[0] + var13;
          if ((var12 < 0)) {
            var12 = -var12;
          }

          if (this.anInt3404 < var12) {
            var8[var11] = var13;
            var9[var11] = var6[var11];
            var10[var11] = var7[var11];
          } else {
            int var14 = var6[var11];
            var12 = var14 - this.anIntArray3403[1];
            if ((var12 < 0)) {
              var12 = -var12;
            }

            if (var12 > this.anInt3404) {
              var8[var11] = var13;
              var9[var11] = var14;
              var10[var11] = var7[var11];
            } else {
              int var15 = var7[var11];
              var12 = -this.anIntArray3403[2] + var15;
              if (var12 < 0) {
                var12 = -var12;
              }

              if ((var12 <= this.anInt3404)) {
                var8[var11] = this.anInt3410 * var13 >> 12;
                var9[var11] = this.anInt3406 * var14 >> 12;
                var10[var11] = this.anInt3405 * var15 >> 12;
              } else {
                var8[var11] = var13;
                var9[var11] = var14;
                var10[var11] = var15;
              }
            }
          }
        }
      }

      return var3;
  }

  public static void method328(int var0, Buffer var1) {
    if (var0 != -21774) {
        TextureSampler25.method330(-115, 107, 60, 70, -41, 115);
      }

      while (var1.position < var1.bytes.length) {
        int var4 = 0;
        boolean var3 = false;
        int var5 = 0;
        if (var1.readUnsignedByte() == 1) {
          var3 = true;
          var4 = var1.readUnsignedByte();
          var5 = var1.readUnsignedByte();
        }

        int var6 = var1.readUnsignedByte();
        int var7 = var1.readUnsignedByte();
        int var8 = -TextureSampler37.anInt3256 + var6 * 64;
        int var9 = DummyClass58.anInt1460 - 1 + MapScene.anInt65 - 64 * var7;
        byte var2;
        int var10;
        if ((var8 >= 0) && ((-63 + var9) >= 0) && DummyClass30.anInt455 > var8 + 63
          && (var9 < DummyClass58.anInt1460)) {
          var10 = var8 >> 6;
          int var11 = var9 >> 6;

          for (int var12 = 0; var12 < 64; ++var12) {
            for (int var13 = 0; (var13 < 64); ++var13) {
              if (!var3 || ((var4 * 8) <= var12) && 8 + 8 * var4 > var12 && var13 >= var5 * 8
                && 8 + var5 * 8 > var13) {
                var2 = var1.readByte();
                if (var2 != 0) {
                  if (TextureSampler29.aByteArrayArrayArray3390[var10][var11]
                      == null) {
                    TextureSampler29.aByteArrayArrayArray3390[var10][var11] = new byte[4096];
                  }

                  TextureSampler29.aByteArrayArrayArray3390[var10][var11][(63 - var13 << 6)
                    + var12] = var2;
                  byte var14 = var1.readByte();
                  if (GlobalStatics_7.aByteArrayArrayArray2452[var10][var11]
                      == null) {
                    GlobalStatics_7.aByteArrayArrayArray2452[var10][var11] = new byte[4096];
                  }

                  GlobalStatics_7.aByteArrayArrayArray2452[var10][var11][var12 + (-var13 + 63
                    << 6)] = var14;
                }
              }
            }
          }
        } else {
          for (var10 = 0; (var10 < (!var3 ? 4096 : 64)); ++var10) {
            var2 = var1.readByte();
            if ((var2 != 0)) {
              ++var1.position;
            }
          }
        }
      }
  }

  public static void method329(int var0, int var1, int var2, int var3, byte var4, int var5, int var6,
                              int var7) {
    int var8 = 0;
      int var11 = -var3 + var0;
      int var10 = 0;
      int var9 = var7;
      int var14 = var7 * var7;
      int var12 = -var3 + var7;
      int var13 = var0 * var0;
      int var17 = var14 << 1;
      int var16 = var12 * var12;
      int var15 = var11 * var11;
      int var18 = var13 << 1;
      int var19 = var16 << 1;
      int var20 = var15 << 1;
      int var22 = var12 << 1;
      int var21 = var7 << 1;
      int var23 = var17 + var13 * (1 - var21);
      int var24 = var14 - ((var21 - 1) * var18);
      int var25 = var19 + var15 * (1 - var22);
      int var26 = var16 - var20 * (var22 - 1);
      int var28 = var14 << 2;
      int var27 = var13 << 2;
      int var30 = var16 << 2;
      int var31 = var17 * 3;
      int var32 = (var21 - 3) * var18;
      int var34 = -113 % ((var4 - 56) / 41);
      int var29 = var15 << 2;
      int var33 = var19 * 3;
      int var35 = (-3 + var22) * var20;
      int var37 = (-1 + var7) * var27;
      int var38 = var30;
      int var36 = var28;
      int var39 = (-1 + var12) * var29;
      int var42;
      int var43;
      int var41;
      int var44;
      if (var5 >= DummyClass13.anInt2020 && LightIntensity.anInt902 >= var5) {
        int[] var40 = DummyClass35.anIntArrayArray663[var5];
        var41 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 - var0, (byte) 0,
          DummyClass55.anInt1425);
        var42 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 + var0, (byte) 0,
          DummyClass55.anInt1425);
        var43 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 - var11, (byte) 0,
          DummyClass55.anInt1425);
        var44 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 + var11, (byte) 0,
          DummyClass55.anInt1425);
        TextureSampler18.method282(var40, var41, 127, var43, var2);
        TextureSampler18.method282(var40, var43, 105, var44, var1);
        TextureSampler18.method282(var40, var44, -67, var42, var2);
      }

      while (var9 > 0) {
        if (var23 < 0) {
          while (var23 < 0) {
            var23 += var31;
            var31 += var28;
            ++var8;
            var24 += var36;
            var36 += var28;
          }
        }

        boolean var49 = (var9 <= var12);
        if (var24 < 0) {
          var24 += var36;
          var23 += var31;
          ++var8;
          var36 += var28;
          var31 += var28;
        }

        if (var49) {
          if ((var25 < 0)) {
            while (var25 < 0) {
              ++var10;
              var26 += var38;
              var38 += var30;
              var25 += var33;
              var33 += var30;
            }
          }

          if (var26 < 0) {
            ++var10;
            var26 += var38;
            var25 += var33;
            var38 += var30;
            var33 += var30;
          }

          var25 += -var39;
          var39 -= var29;
          var26 += -var35;
          var35 -= var29;
        }

        var24 += -var32;
        var23 += -var37;
        var37 -= var27;
        var32 -= var27;
        --var9;
        var42 = var5 + var9;
        var41 = -var9 + var5;
        if (DummyClass13.anInt2020 <= var42 && LightIntensity.anInt902 >= var41) {
          var43 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 + var8, (byte) 0,
            DummyClass55.anInt1425);
          var44 = DummyClass59.method1040(GlTexture2d.anInt3765, -var8 + var6, (byte) 0,
            DummyClass55.anInt1425);
          if (var49) {
            int var45 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 + var10, (byte) 0,
              DummyClass55.anInt1425);
            int var46 = DummyClass59.method1040(GlTexture2d.anInt3765, var6 - var10, (byte) 0,
              DummyClass55.anInt1425);
            int[] var47;
            if (DummyClass13.anInt2020 <= var41) {
              var47 = DummyClass35.anIntArrayArray663[var41];
              TextureSampler18.method282(var47, var44, 120, var46, var2);
              TextureSampler18.method282(var47, var46, -107, var45, var1);
              TextureSampler18.method282(var47, var45, -102, var43, var2);
            }

            if ((var42 <= LightIntensity.anInt902)) {
              var47 = DummyClass35.anIntArrayArray663[var42];
              TextureSampler18.method282(var47, var44, 87, var46, var2);
              TextureSampler18.method282(var47, var46, -92, var45, var1);
              TextureSampler18.method282(var47, var45, 124, var43, var2);
            }
          } else {
            if ((DummyClass13.anInt2020 <= var41)) {
              TextureSampler18.method282(DummyClass35.anIntArrayArray663[var41], var44, -122, var43,
                var2);
            }

            if (LightIntensity.anInt902 >= var42) {
              TextureSampler18.method282(DummyClass35.anIntArrayArray663[var42], var44, 89, var43,
                var2);
            }
          }
        }
      }
  }

  public static void method330(int var0, int var1, int var2, int var3, int var4, int var5) {
    if (var1 > -83) {
        TextureSampler25.amountContextActions = 115;
      }

      int var6 = -var3 + var5;
      int var7 = var2 - var4;
      if (var6 == 0) {
        if (var7 != 0) {
          GlobalStatics_6.method126(false, var2, var4, var0, var3);
        }

      } else if ((var7 == 0)) {
        SomethingTexture4.method1354(var3, var0, true, var5, var4);
      } else {
        int var12 = (var7 << 12) / var6;
        int var13 = -(var12 * var3 >> 12) + var4;
        int var8;
        int var10;
        if (DummyClass55.anInt1425 > var3) {
          var8 = DummyClass55.anInt1425;
          var10 = (DummyClass55.anInt1425 * var12 >> 12) + var13;
        } else if (var3 > GlTexture2d.anInt3765) {
          var10 = (GlTexture2d.anInt3765 * var12 >> 12) + var13;
          var8 = GlTexture2d.anInt3765;
        } else {
          var8 = var3;
          var10 = var4;
        }

        int var9;
        int var11;
        if ((var5 >= DummyClass55.anInt1425)) {
          if (GlTexture2d.anInt3765 < var5) {
            var9 = GlTexture2d.anInt3765;
            var11 = var13 + (var12 * GlTexture2d.anInt3765 >> 12);
          } else {
            var11 = var2;
            var9 = var5;
          }
        } else {
          var9 = DummyClass55.anInt1425;
          var11 = var13 + (var12 * DummyClass55.anInt1425 >> 12);
        }

        if ((DummyClass13.anInt2020 <= var11)) {
          if (var11 > LightIntensity.anInt902) {
            var11 = LightIntensity.anInt902;
            var9 = (LightIntensity.anInt902 - var13 << 12) / var12;
          }
        } else {
          var9 = (DummyClass13.anInt2020 - var13 << 12) / var12;
          var11 = DummyClass13.anInt2020;
        }

        if ((var10 < DummyClass13.anInt2020)) {
          var10 = DummyClass13.anInt2020;
          var8 = (DummyClass13.anInt2020 - var13 << 12) / var12;
        } else if (LightIntensity.anInt902 < var10) {
          var10 = LightIntensity.anInt902;
          var8 = (-var13 + LightIntensity.anInt902 << 12) / var12;
        }

        SceneNode.method1869((byte) 6, var0, var11, var10, var9, var8);
      }
  }

  public static void sleep(long var0) {
    if (var0 > 0L) {
        if (var0 % 10L == 0L) {
          DummyHashTable.sleep(var0 - 1L);
          DummyHashTable.sleep(1L);
        } else {
          DummyHashTable.sleep(var0);
        }


      }
  }

  public static int method332(int var0, int var1) {
    if (var0 != 2) {
        TextureSampler25.anInt3414 = -40;
      }

      return ((var1 < 65) || var1 > 90) && ((var1 < 192)
          || var1 > 222 || var1 == 215) ?
        ((var1 != 159) ? (var1 != 140 ? var1 : 156) : 255) :
        32 + var1;
  }

  public static void method333(byte var0) {
    int var1 = 100 / ((76 - var0) / 44);
      TextureSampler25.aClass93_3412 = null;
      TextureSampler25.aClass94_3409 = null;
      TextureSampler25.aClass94_3408 = null;
      TextureSampler25.aClass47_3407 = null;
  }

  public static boolean isRunesSpritesLoaded(FileUnpacker var0) {
    return var0.isLoaded(NPC.runesFileId);
  }

}
