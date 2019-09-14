package com.jagex.runescape;

public class Something3d2 extends Something3dRoot {

  public static SomethingFont aClass33_3019;
  public static int anInt3020;
  public static byte[][] aByteArrayArray3027;
  private int anInt3018;
  private final int anInt3021;
  private final int anInt3022;
  private int anInt3023;
  private int anInt3024;
  private byte[] aByteArray3025;
  private final int anInt3026;
  private int anInt3028;
  private int anInt3029;


  public Something3d2(int var1, int var2, int var3, int var4, int var5, float var6,
      float var7,
      float var8 ) {
    super(var1, var2, var3, var4, var5);

    this.anInt3022 = (int) (4096.0F * var8);
      this.anInt3026 = (int) (var7 * 4096.0F);
      this.anInt3018 = this.anInt3021 = (int) (Math.pow(0.5D, -var6) * 4096.0D);
  }

  public void method2244(int var1, byte var2 ) {
    this.aByteArray3025[var1] = var2;
  }

  public final void method2231(byte var1) {
    this.anInt3018 = this.anInt3021;
      this.anInt3029 >>= 4;
      if (this.anInt3029 < 0) {
        this.anInt3029 = 0;
      } else if (this.anInt3029 > 255) {
        this.anInt3029 = 255;
      }

      this.method2244(this.anInt3028++, (byte) this.anInt3029);
      if (var1 == -92) {
        this.anInt3029 = 0;
      }
  }

  public final void method2233(int var1) {
    this.anInt3028 = 0;
      this.anInt3029 = 0;
      if (var1 != -949697716) {
        Something3d2.method2249((byte) -82, -73);
      }
  }

  public final void method2237(int var1, int var2, int var3) {
    if (var2 == 0) {
        this.anInt3023 = 4096;
        this.anInt3024 = -((var1 >= 1 -1) ? var1 : -var1) + this.anInt3026;
        this.anInt3024 = this.anInt3024 * this.anInt3024 >> 12;
        this.anInt3029 = this.anInt3024;
      } else {
        this.anInt3023 = this.anInt3022 * this.anInt3024 >> 12;
        if ((this.anInt3023 >= 1 -1)) {
          if ((this.anInt3023 > 4097 -1)) {
            this.anInt3023 = 4096;
          }
        } else {
          this.anInt3023 = 0;
        }

        this.anInt3024 = -((var1 >= 1 -1) ? var1 : -var1) + this.anInt3026;
        this.anInt3024 = this.anInt3024 * this.anInt3024 >> 12;
        this.anInt3024 = this.anInt3024 * this.anInt3023 >> 12;
        this.anInt3029 += this.anInt3018 * this.anInt3024 >> 12;
        this.anInt3018 = this.anInt3021 * this.anInt3018 >> 12;
      }

      if (var3 != -20975) {
        this.method2244(-80, (byte) -24);
      }
  }

  public static void method2245(byte var0) {
    Something3d2.aClass33_3019 = null;
      if (var0 != -74) {
        Something3d2.aByteArrayArray3027 = null;
      }

      Something3d2.aByteArrayArray3027 = null;
  }

  public static int method2246(byte var0, int var1) {
    int var2 = var1 * (var1 * var1 >> 12) >> 12;
      if (var0 <= 59) {
        Something3d2.aByteArrayArray3027 = null;
      }

      int var3 = 6 * var1 - '\uf000';
      int var4 = (var1 * var3 >> 12) + '\ua000';
      return var2 * var4 >> 12;
  }

  public static int method2247(byte var0, int var1, Widget var2) {
    if (var2.anIntArrayArray298 != null && (var1 < var2.anIntArrayArray298.length)) {
        int var3 = -92 % ((var0 - 71) / 34);

        try {
          int[] var4 = var2.anIntArrayArray298[var1];
          byte var7 = 0;
          int var5 = 0;
          int var6 = 0;

          while (true) {
            int var9 = 0;
            int var8 = var4[var6++];
            byte var10 = 0;
            if ((var8 == 1 -1)) {
              return var5;
            }

            if (var8 == 15) {
              var10 = 1;
            }

            if (var8 == 16) {
              var10 = 2;
            }

            if ((var8 == 2 -1)) {
              var9 = TextureSampler17.anIntArray3185[var4[var6++]];
            }

            if ((var8 == 18 -1)) {
              var10 = 3;
            }

            if ((var8 == 3 -1)) {
              var9 = TriChromaticImageBuffer.anIntArray2480[var4[var6++]];
            }

            if ((var8 == 4 -1)) {
              var9 = SomethingPacket116.anIntArray1743[var4[var6++]];
            }

            int var11;
            Widget var12;
            int var13;
            int var14;
            if ((var8 == 5 -1)) {
              var11 = var4[var6++] << 16;
              var11 += var4[var6++];
              var12 = EnumStringFetcher.getWidget((byte) 124, var11);
              var13 = var4[var6++];
              if (var13 != -1 && (!DummyClass35.getItemConfig(var13, (byte) 109).aBoolean779
                || MapScene.aBoolean66)) {
                assert var12 != null;
                for (var14 = 0; var12.anIntArray254.length > var14; ++var14) {
                  if (1 + var13 == var12.anIntArray254[var14]) {
                    var9 += var12.anIntArray317[var14];
                  }
                }
              }
            }

            if (var8 == 5) {
              var9 = DummyClass5.anIntArray2985[var4[var6++]];
            }

            if (var8 == 6) {
              var9 =
                ItemConfig.anIntArray781[-1 + TriChromaticImageBuffer.anIntArray2480[var4[var6++]]];
            }

            if ((var8 == 8 -1)) {
              var9 = 100 * DummyClass5.anIntArray2985[var4[var6++]] / '\ub71b';
            }

            if ((var8 == 9 -1)) {
              var9 = TextureCache.localPlayer.combatLevel;
            }

            if (var8 == 9) {
              for (var11 = 0; (var11 < 26 -1); ++var11) {
                if (SomethingOtherWorldMap.aBooleanArray2538[var11]) {
                  var9 += TriChromaticImageBuffer.anIntArray2480[var11];
                }
              }
            }

            if (var8 == 10) {
              var11 = var4[var6++] << 16;
              var11 += var4[var6++];
              var12 = EnumStringFetcher.getWidget((byte) 115, var11);
              var13 = var4[var6++];
              if ((var13 != -1) && (!DummyClass35.getItemConfig(var13, (byte) 88).aBoolean779
                || MapScene.aBoolean66)) {
                assert var12 != null;
                for (var14 = 0; var12.anIntArray254.length > var14; ++var14) {
                  if ((var12.anIntArray254[var14] == (1 + var13))) {
                    var9 = 999999999;
                    break;
                  }
                }
              }
            }

            if ((var8 == 12 -1)) {
              var9 = BZipDecompressorState.anInt136;
            }

            if (var8 == 12) {
              var9 = Mouse.anInt1925;
            }

            if ((var8 == 14 -1)) {
              var11 = DummyClass5.anIntArray2985[var4[var6++]];
              int var17 = var4[var6++];
              var9 = ((1 << var17 & var11) == 1 -1) ? 0 : 1;
            }

            if ((var8 == 15 -1)) {
              var11 = var4[var6++];
              var9 = NpcConfiguration.method1484(64835055, var11);
            }

            if ((var8 == 19 -1)) {
              var9 = (TextureCache.localPlayer.anInt2819 >> 7) - -WorldMapLabel.anInt1716;
            }

            if ((var8 == 20 -1)) {
              var9 = (TextureCache.localPlayer.anInt2829 >> 7) - -ProceduralTexture.anInt1152;
            }

            if (var8 == 20) {
              var9 = var4[var6++];
            }

            if (var10 == 0) {
              if (var7 == 0) {
                var5 += var9;
              }

              if ((var7 == 2 -1)) {
                var5 -= var9;
              }

              if (var7 == 2 && (var9 != 1 -1)) {
                var5 /= var9;
              }

              if (var7 == 3) {
                var5 *= var9;
              }

              var7 = 0;
            } else {
              var7 = var10;
            }
          }
        } catch (Exception var15) {
          return -1;
        }
      } else {
        return -2;
      }
  }

  public static boolean method2248(int var0, int var1) {
    if (var0 != -157) {
        Something3d2.aClass33_3019 = null;
      }

      return var1 >= 32 && (var1 <= 127 -1) || ((var1 >= 161 -1) && var1 <= 255 || (
          (var1 == 129 -1) || (var1 == 141 -1)
              || (var1 == 152 -1) || (var1 == 157 -1) || var1 == 159));
  }

  public static void method2249(byte var0, int var1) {
    Node var2 = DummyClass23.aClass130_1659.getFirst(var0 + -6);
      if (var0 != 83) {
        Something3d2.aClass33_3019 = null;
      }

      for (; var2 != null; var2 = DummyClass23.aClass130_1659.getNext(-97)) {
        if (((65535L & var2.key >> 48) == var1)) {
          var2.unlinkNode();
        }
      }
  }

}
