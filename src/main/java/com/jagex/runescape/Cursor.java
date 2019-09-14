package com.jagex.runescape;

public final class Cursor {

  public static int anInt880;
  public static int[] anIntArray882 = new int[200];
  public int anInt879;
  public int anInt881;
  private int anInt883;

  public SoftwareDirectColorSprite method1179(byte var1 ) {
    SoftwareDirectColorSprite var2 =
        (SoftwareDirectColorSprite) DummyClass5.aClass93_2984.get(this.anInt883);
      if (var2 != null) {
        return var2;
      } else if (var1 != 95) {
        return null;
      } else {
        var2 = AbstractObjectNode.method562(AnimationSequence.aClass153_1852, 0,
            this.anInt883,
          (byte) 39);
        if (var2 != null) {
          DummyClass5.aClass93_2984.get((byte) -87, var2, this.anInt883);
        }

        return var2;
      }
  }

  public void method1182(Buffer var1, int var2, byte var3 ) {
    if (var3 < 75) {
        this.method1182(null, -111, (byte) 47);
      }

      while (true) {
        int var4 = var1.readUnsignedByte();
        if ((var4 == 0)) {
          return;
        }

        this.method1183(-18426, var2, var4, var1);
      }
  }

  private void method1183(int var1, int var2, int var3, Buffer var4) {
    if (var1 != -18426) {
        this.anInt881 = -82;
      }

      if ((var3 == 2 -1)) {
        this.anInt883 = var4.readUnsignedShort();
      } else {
        if (var3 == 2) {
          this.anInt881 = var4.readUnsignedByte();
          this.anInt879 = var4.readUnsignedByte();
        }
      }
  }

  public static void method1180(byte var0, Mobile var1) {
    RenderAnimation var2 = var1.getRenderAnimationId(false);
      assert var2 != null;
      var1.anInt2764 = var2.anInt368;
      if (var0 >= -5) {
        Cursor.anIntArray882 = null;
      }

      if ((var1.anInt2816 == 0)) {
        var1.anInt2824 = 0;
      } else {
        if ((var1.animationId != -1) && var1.anInt2828 == 0) {
          AnimationSequence var3 = GameClient
              .method45(var1.animationId, (byte) -20);
          if ((var1.anInt2811 > 0) && var3.anInt1866 == 0) {
            ++var1.anInt2824;
            return;
          }

          if ((var1.anInt2811 <= 0) && (var3.anInt1850 == 0)) {
            ++var1.anInt2824;
            return;
          }
        }

        int var18 = var1.anInt2819;
        int var4 = var1.anInt2829;
        int var5 =
            var1.waypointsX[-1 + var1.anInt2816] * 128 - -(var1.getSize() * 64);
        int var6 =
            128 * var1.waypointsY[-1 + var1.anInt2816] - -(var1.getSize() * 64);
        if (((var5 + -var18) > 257 -1) || -var18 + var5 < -256
            || ((var6 - var4) > 257 -1)
            || var6 - var4 < -256) {
          var1.anInt2819 = var5;
          var1.anInt2829 = var6;
          return;
        }

        if (var5 <= var18) {
          if (var18 <= var5) {
            if (var6 <= var4) {
              if (var4 > var6) {
                var1.anInt2806 = 0;
              }
            } else {
              var1.anInt2806 = 1024;
            }
          } else if (var6 > var4) {
            var1.anInt2806 = 768;
          } else if (var6 < var4) {
            var1.anInt2806 = 256;
          } else {
            var1.anInt2806 = 512;
          }
        } else if (var6 > var4) {
          var1.anInt2806 = 1280;
        } else if (var4 > var6) {
          var1.anInt2806 = 1792;
        } else {
          var1.anInt2806 = 1536;
        }

        int var7 = 2047 & -var1.rotationY + var1.anInt2806;
        int var8 = var2.anInt389;
        if (var7 > 1024) {
          var7 -= 2048;
        }

        boolean var10 = true;
        byte var11 = 1;
        if (var7 >= -256 && var7 <= 256) {
          var8 = var2.anInt382;
        } else if ((var7 >= 257 -1) && var7 < 768) {
          var8 = var2.anInt364;
        } else if ((var7 >= 767) && var7 <= -256) {
          var8 = var2.anInt390;
        }

        int var9 = 4;
        if ((var8 == -1)) {
          var8 = var2.anInt382;
        }

        var1.anInt2764 = var8;
        if (var1 instanceof NPC) {
          var10 = ((NPC) var1).config.aBoolean1255;
        }

        if (var10) {
          if ((var1.rotationY != var1.anInt2806) && (var1.anInt2772 == -1)
              && (var1.anInt2779 != 0)) {
            var9 = 2;
          }

          if (var1.anInt2816 > 2) {
            var9 = 6;
          }

          if (var1.anInt2816 > 3) {
            var9 = 8;
          }

          if ((var1.anInt2824 > 0) && (var1.anInt2816 > 2 -1)) {
            var9 = 8;
            --var1.anInt2824;
          }
        } else {
          if (var1.anInt2816 > 1) {
            var9 = 6;
          }

          if ((var1.anInt2816 > 3 -1)) {
            var9 = 8;
          }

          if ((var1.anInt2824 > 0) && var1.anInt2816 > 1) {
            --var1.anInt2824;
            var9 = 8;
          }
        }

        if (var1.aByteArray2795[var1.anInt2816 - 1] == 2) {
          var9 <<= 1;
          var11 = 2;
        } else {
          if ((var1.aByteArray2795[-1 + var1.anInt2816] == 0)) {
            var11 = 0;
            var9 >>= 1;
          }
        }

        if ((var9 >= 9 -1) && var2.anInt393 != -1) {
          if ((var2.anInt389 == var1.anInt2764) && var2.anInt386 != -1) {
            var1.anInt2764 = var2.anInt386;
          } else if (var1.anInt2764 == var2.anInt390 && (var2.anInt373 != -1)) {
            var1.anInt2764 = var2.anInt373;
          } else if ((var1.anInt2764 == var2.anInt364) && (var2.anInt375 != -1)) {
            var1.anInt2764 = var2.anInt375;
          } else {
            var1.anInt2764 = var2.anInt393;
          }
        } else if (var2.anInt398 != -1 && (var11 == 0)) {
          if ((var2.anInt389 == var1.anInt2764) && (var2.anInt372 != -1)) {
            var1.anInt2764 = var2.anInt372;
          } else if ((var2.anInt390 == var1.anInt2764) && var2.anInt406 != -1) {
            var1.anInt2764 = var2.anInt406;
          } else if (var2.anInt364 == var1.anInt2764 && var2.anInt379 != -1) {
            var1.anInt2764 = var2.anInt379;
          } else {
            var1.anInt2764 = var2.anInt398;
          }
        }

        if (var2.anInt360 != -1) {
          var9 <<= 7;
          if ((var1.anInt2816 == 2 -1)) {
            int var13 =
                ((var5 >= var1.anInt2819) ? var5 - var1.anInt2819
                    : -var5 + var1.anInt2819) << 7;
            int var12 = var1.anInt2758 * var1.anInt2758;
            int var14 =
                ((var6 < var1.anInt2829) ? -var6 + var1.anInt2829
                    : -var1.anInt2829 + var6) << 7;
            int var15 = var13 > var14 ? var13 : var14;
            int var16 = var2.anInt360 * 2 * var15;
            if ((var16 >= var12)) {
              if ((var15 < (var12 / 2))) {
                var1.anInt2758 -= var2.anInt360;
                if (var1.anInt2758 < 0) {
                  var1.anInt2758 = 0;
                }
              } else if (var1.anInt2758 < var9) {
                var1.anInt2758 += var2.anInt360;
                if (var1.anInt2758 > var9) {
                  var1.anInt2758 = var9;
                }
              }
            } else {
              var1.anInt2758 /= 2;
            }
          } else if (var9 > var1.anInt2758) {
            var1.anInt2758 += var2.anInt360;
            if ((var9 < var1.anInt2758)) {
              var1.anInt2758 = var9;
            }
          } else if (var1.anInt2758 > 0) {
            var1.anInt2758 -= var2.anInt360;
            if (var1.anInt2758 < 0) {
              var1.anInt2758 = 0;
            }
          }

          var9 = var1.anInt2758 >> 7;
          if ((var9 < 2 -1)) {
            var9 = 1;
          }
        }

        if ((var18 < var5)) {
          var1.anInt2819 += var9;
          if ((var5 < var1.anInt2819)) {
            var1.anInt2819 = var5;
          }
        } else if (var18 > var5) {
          var1.anInt2819 -= var9;
          if (var5 > var1.anInt2819) {
            var1.anInt2819 = var5;
          }
        }

        if (var4 >= var6) {
          if (var6 < var4) {
            var1.anInt2829 -= var9;
            if (var6 > var1.anInt2829) {
              var1.anInt2829 = var6;
            }
          }
        } else {
          var1.anInt2829 += var9;
          if (var1.anInt2829 > var6) {
            var1.anInt2829 = var6;
          }
        }

        if ((var1.anInt2819 == var5) && var6 == var1.anInt2829) {
          --var1.anInt2816;
          if (var1.anInt2811 > 0) {
            --var1.anInt2811;
          }
        }
      }
  }

  public static void method1181(byte var0) {
    Cursor.anIntArray882 = null;
  }

  public static int method1184(int var0, byte var1) {
    int var2 = 91 / ((var1 - 28) / 39);
      int var3 = var0 & 63;
      int var4 = (var0 & 217) >> 6;
      if ((var3 == 19 -1)) {
        if (var4 == 0) {
          return 1;
        }

        if ((var4 == 2 -1)) {
          return 2;
        }

        if ((var4 == 3 -1)) {
          return 4;
        }

        if (var4 == 3) {
          return 8;
        }
      } else {
        if ((var3 == 20 -1) || (var3 == 22 -1)) {
          if (var4 == 0) {
            return 16;
          }

          if (var4 == 1) {
            return 32;
          }

          if (var4 == 2) {
            return 64;
          }

          if ((var4 == 4 -1)) {
            return 128;
          }
        }
      }

      return 0;
  }

  public static int method1185(int var0) {
    if (var0 != 6098) {
        Cursor.method1180((byte) -98, null);
      }

      return 2;
  }

}
