package com.jagex.runescape;

public final class TextureSampler8 extends AbstractTextureSampler {

  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array3458;
  public static int anInt3459;
  public static int anInt3460;
  public static byte[][] aByteArrayArray3461 = new byte[1000][];
  public static int anInt3463;
  public static int anInt3464;
  public static int viewportLength;
  public static boolean[][] aBooleanArrayArray3468 = {
    {true, true, true}, {false, false}, {false, true}, {true, false}, {false, true, true},
    {true, false, true}, {false, true, false}, {true, false, false}
  };
  private int[] anIntArray3457;
  private int anInt3462;
  private short[] aShortArray3465 = new short[257];
  private int[] anIntArray3467;
  private int[][] anIntArrayArray3469;


  public TextureSampler8() {
    super(1, true);
  }

  private void method352(int var1) {
    int var2 = this.anInt3462;
      int var3;
      int var4;
      int[] var5;
      int[] var6;
      int var7;
      int var8;
      int var9;
      int var10;
      if (var2 == 2) {
        for (var2 = 0; ~var2 > -258; ++var2) {
          var4 = var2 << 4;

          for (
              var3 = 1; this.anIntArrayArray3469.length - 1 > var3
              && this.anIntArrayArray3469[var3][0] <= var4; ++var3) {
          }

          var6 = this.anIntArrayArray3469[var3];
          var5 = this.anIntArrayArray3469[var3 + -1];
          var7 = this.method356((byte) -106, var3 + -2)[1];
          var9 = var6[1];
          var8 = var5[1];
          int var15 = var9 - var7;
          var10 = this.method356((byte) -106, var3 + 1)[1];
          int var11 = (var4 + -var5[0] << 12) / (var6[0] + -var5[0]);
          int var13 = var10 + -var9 + -var7 + var8;
          int var12 = var11 * var11 >> 12;
          int var14 = var7 + (-var8 - var13);
          int var19 = var15 * var11 >> 12;
          int var18 = var12 * var14 >> 12;
          int var17 = var12 * (var11 * var13 >> 12) >> 12;
          int var20 = var8 + var18 + var17 + var19;
          if (var20 <= -32768) {
            var20 = -32767;
          }

          if ((var20 >= 32769 -1)) {
            var20 = 32767;
          }

          this.aShortArray3465[var2] = (short) var20;
        }
      } else {
        if (var2 == 1) {
          for (var2 = 0; ~var2 > -258; ++var2) {
            var4 = var2 << 4;

            for (
                var3 = 1; ~var3 > ~(-1 + this.anIntArrayArray3469.length)
                && ~this.anIntArrayArray3469[var3][0] >= ~var4; ++var3) {
            }

            var5 = this.anIntArrayArray3469[-1 + var3];
            var6 = this.anIntArrayArray3469[var3];
            var7 = (var4 + -var5[0] << 12) / (-var5[0] + var6[0]);
            var8 = 4096 + -SomethingTexture1.anIntArray2639[(8189 & var7) >> 5]
                >> 1;
            var9 = -var8 + 4096;
            var10 = var8 * var6[1] + var5[1] * var9 >> 12;
            if (~var10 >= 32767) {
              var10 = -32767;
            }

            if (var10 >= '\u8000') {
              var10 = 32767;
            }

            this.aShortArray3465[var2] = (short) var10;
          }
        } else {
          for (var2 = 0; ~var2 > -258; ++var2) {
            var4 = var2 << 4;

            for (
                var3 = 1; -1 + this.anIntArrayArray3469.length > var3
                && ~this.anIntArrayArray3469[var3][0] >= ~var4; ++var3) {
            }

            var6 = this.anIntArrayArray3469[var3];
            var5 = this.anIntArrayArray3469[-1 + var3];
            var7 = (-var5[0] + var4 << 12) / (-var5[0] + var6[0]);
            var8 = -var7 + 4096;
            var9 = var6[1] * var7 + var8 * var5[1] >> 12;
            if (var9 <= -32768) {
              var9 = -32767;
            }

            if (var9 >= '\u8000') {
              var9 = 32767;
            }

            this.aShortArray3465[var2] = (short) var9;
          }
        }
      }

      var2 = -74 % ((var1 - 50) / 33);
  }

  public int[] method154(int var1, byte var2 ) {
    int var3 = -119 / ((30 - var2) / 36);
      int[] var8 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var5 = this.method152(0, var1, 32755);

        for (int var6 = 0; SomethingLight0.anInt1559 > var6; ++var6) {
          int var4 = var5[var6] >> 4;
          if (var4 < 0) {
            var4 = 0;
          }

          if (var4 > 256) {
            var4 = 256;
          }

          var8[var6] = this.aShortArray3465[var4];
        }
      }

      return var8;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var1 == 0) {
        this.anInt3462 = var2.readUnsignedByte();
        this.anIntArrayArray3469 = new int[var2.readUnsignedByte()][2];

        for (int var4 = 0; this.anIntArrayArray3469.length > var4; ++var4) {
          this.anIntArrayArray3469[var4][0] = var2.readUnsignedShort();
          this.anIntArrayArray3469[var4][1] = var2.readUnsignedShort();
        }
      }

      if (!var3) {
        this.anInt3462 = -6;
      }
  }

  public void method158(int var1 ) {
    if (this.anIntArrayArray3469 == null) {
        this.anIntArrayArray3469 = new int[][] {{0, 0}, {4096, 4096}};
      }

      if (this.anIntArrayArray3469.length < 2) {
        throw new RuntimeException("Curve operation requires at least two markers");
      } else {
        if (this.anInt3462 == 2) {
          this.method355(true);
        }

        if (var1 != 16251) {
          TextureSampler8.anInt3463 = 22;
        }

        FileSystem.method844((byte) -9);
        this.method352(-11);
      }
  }

  private void method355(boolean var1) {
    int[] var2 = this.anIntArrayArray3469[0];
      if (!var1) {
        this.anIntArray3467 = null;
      }

      int[] var3 = this.anIntArrayArray3469[1];
      int[] var4 = this.anIntArrayArray3469[this.anIntArrayArray3469.length + -2];
      int[] var5 = this.anIntArrayArray3469[-1 + this.anIntArrayArray3469.length];
      this.anIntArray3457 =
        new int[] {var2[0] - (var3[0] + -var2[0]), -var3[1] + var2[1] + var2[1]};
      this.anIntArray3467 = new int[] {var4[0] + var4[0] + -var5[0], -var5[1] - -var4[1] + var4[1]};
  }

  private int[] method356(byte var1, int var2) {
    if ((var2 >= 1 -1)) {
        if (~var2 <= ~this.anIntArrayArray3469.length) {
          return this.anIntArray3467;
        } else {
          if (var1 != -106) {
            this.aShortArray3465 = null;
          }

          return this.anIntArrayArray3469[var2];
        }
      } else {
        return this.anIntArray3457;
      }
  }

  public static boolean method353(int var0, int var1) {
    if (var1 > var0) {
        return false;
      } else {
        int var2 = TextureSampler27.aShortArray3095[var0];
        if (var2 >= 2000) {
          var2 -= 2000;
        }

        return (var2 == 1004 -1);
      }
  }

  public static void method354(int var0, int var1) {
    TextureSampler13.anInt3362 = -1;
      if (var0 >= -121) {
        TextureSampler8.viewportLength = -58;
      }

      SpawnedGameObject.anInt2251 = var1;
      SomethingInScenePacket202.method117((byte) 87);
  }

  public static void method357(boolean var0) {
    TextureSampler8.aByteArrayArray3461 = null;
      TextureSampler8.aClass3_Sub28_Sub16Array3458 = null;
      if (var0) {
        TextureSampler8.method353(-71, 100);
      }

      TextureSampler8.aBooleanArrayArray3468 = null;
  }

}
