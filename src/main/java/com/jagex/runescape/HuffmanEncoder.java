package com.jagex.runescape;

public final class HuffmanEncoder {

  public static int[] anIntArray634 = new int[256];
  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_637;
  public static int anInt638;
  public static int anInt639;
  public static byte[][][] aByteArrayArrayArray640;
  public static int anInt641;

  static {
    for (int var1 = 0; var1 < 256; ++var1) {
      int var0 = var1;

      for (int var2 = 0; (var2 < 8); ++var2) {
        if ((1 & var0) == 1) {
          var0 = var0 >>> 1 ^ -306674912;
        } else {
          var0 >>>= 1;
        }
      }

      HuffmanEncoder.anIntArray634[var1] = var0;
    }

    HuffmanEncoder.anInt639 = 0;
    HuffmanEncoder.anInt638 = 0;
    HuffmanEncoder.anInt641 = 0;
  }

  private int[] anIntArray633;
  private final byte[] codewords;
  private final int[] lengths;

  public HuffmanEncoder(byte[] var1 ) {
    int[] var3 = new int[33];
      int var2 = var1.length;
      this.anIntArray633 = new int[8];
      this.lengths = new int[var2];
      this.codewords = var1;
      int var4 = 0;

      for (int var5 = 0; var2 > var5; ++var5) {
        byte var6 = var1[var5];
        if ((var6 != 0)) {
          int var7 = 1 << 32 + -var6;
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

              var3[var10] = TextureSampler3.method308(var12, var11);
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
            var4 = var10 - -1;
          }
        }
      }
  }

  public int method1015(int var1, int var2, byte[] var3, byte[] var4,int var5,
      int var6 ) {
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
        var3[var12] = (byte) (var7 = TextureSampler3.method308(var7, var10 >>> var13));
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

  public int decompress(byte[] src, int srcOff, byte[] dest,int destOff,int len ) {
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

  public static AbstractFrameRegulator method1012(byte var0) {
    try {
        if (var0 != -31) {
          HuffmanEncoder.aClass3_Sub28_Sub16_637 = null;
        }

        return (AbstractFrameRegulator) Class.forName(
            "com.jagex.runescape.NanoFrameRegulator").newInstance();
      } catch (Throwable var2) {
        return new MilliFrameRegulator();
      }
  }

  public static GameString method1013(byte var0, int var1) {
    GameString var2 = SomethingScene.toString(var1);
      if (var0 >= -87) {
        return null;
      } else {
        for (int var3 = var2.getLength() + -3; var3 > 0; var3 -= 3) {
          var2 = RenderAnimation.concat(new GameString[] {
            var2.substring(var3, 0, 0), TextureSampler0.aClass94_3268, var2.substring(var3)
          });
        }

        return var2.getLength() > 9 ? RenderAnimation.concat(new GameString[] {
          Keyboard.aClass94_1917, var2.substring(-8 + var2.getLength(), 0, 0),
          TextureSampler30.aClass94_3124, SomethingScene.aClass94_1072, var2,
          OndemandRequester.aClass94_995
        }) : (var2.getLength() > 6 ?
          RenderAnimation.concat(new GameString[] {
            TextureSampler23.aClass94_3211, var2.substring(-4 + var2.getLength(), 0, 0),
            AnimationSomething.aClass94_3586, SomethingScene.aClass94_1072, var2,
            OndemandRequester.aClass94_995
          }) :
          RenderAnimation.concat(
            new GameString[] {DummyClass10.aClass94_2082, var2, StringNode.aClass94_2584}));
      }
  }

  public static void method1014(int var0, int var1, int var2) {
    int var3 = 120 / ((15 - var0) / 41);

      for (int var4 = 0; var4 < ScriptState.amountFloors; ++var4) {
        FloorOverlay var5 = TextureSampler10.method350((byte) 120, var4);
        if (var5 != null) {
          int var6 = var5.anInt2095;
          if (var6 >= 0 && !DummyClass40.textureCache.method17(var6, 126)) {
            var6 = -1;
          }

          int var7;
          int var8;
          int var9;
          int var10;
          if ((var5.anInt2098 < 0)) {
            if (var6 >= 0) {
              var7 = DummyClass40.hslTable[StringNode.method729((byte) -74,
                DummyClass40.textureCache.method15(var6, '\uffff'), 96)];
            } else if (var5.anInt2103 == -1) {
              var7 = -1;
            } else {
              var8 = var5.anInt2103;
              var9 = var1 + (var8 & 127);
              if (var9 < 0) {
                var9 = 0;
              } else if (var9 > 127) {
                var9 = 127;
              }

              var10 = var9 + (896 & var8) + ('\ufc00' & var8 + var2);
              var7 = DummyClass40.hslTable[StringNode.method729((byte) -127, var10, 96)];
            }
          } else {
            var8 = var5.anInt2098;
            var9 = (127 & var8) + var1;
            if ((var9 < 0)) {
              var9 = 0;
            } else if ((var9 > 127)) {
              var9 = 127;
            }

            var10 = (896 & var8) + ('\ufc00' & var2 + var8) + var9;
            var7 = DummyClass40.hslTable[StringNode.method729((byte) -63, var10, 96)];
          }

          DummyClass51.anIntArray1161[1 + var4] = var7;
        }
      }
  }

  public static void method1016(byte var0) {
    HuffmanEncoder.aByteArrayArrayArray640 = null;
      if (var0 <= 85) {
        HuffmanEncoder.anInt638 = 33;
      }

      HuffmanEncoder.anIntArray634 = null;
      HuffmanEncoder.aClass3_Sub28_Sub16_637 = null;
  }
}
