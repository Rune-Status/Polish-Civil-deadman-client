package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;

public final class TextureSampler6 extends AbstractTextureSampler {

  public static GameString aClass94_3042 = GameString.create("<col=ff9040>");
  public static float aFloat3044;
  public static int[] anIntArray3045;
  private int anInt3043;
  private int anInt3046 = 4096;


  public TextureSampler6() {
    super(1, false);
  }

  public int[] method154(int var1, byte var2 ) {
    int var4 = -52 % ((var2 - 30) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var5 = this.method152(0, var1, 32755);

        for (int var6 = 0; var6 < SomethingLight0.anInt1559; ++var6) {
          int var7 = var5[var6];
          if (this.anInt3043 > var7) {
            var3[var6] = this.anInt3043;
          } else if (this.anInt3046 >= var7) {
            var3[var6] = var7;
          } else {
            var3[var6] = this.anInt3046;
          }
        }
      }

      return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var1 == 0) {
        this.anInt3043 = var2.readUnsignedShort();
      } else if (var1 != 1) {
        if (var1 == 2) {
          this.monoChromatic = var2.readUnsignedByte() == 1;
        }
      } else {
        this.anInt3046 = var2.readUnsignedShort();
      }

      if (!var3) {
        TextureSampler6.aClass94_3042 = null;
      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        TextureSampler6.method175(2, -7, -114, true, -24, 102, -125);
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) -119, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[][] var4 = this.method162(var2, 0, (byte) -124);
        assert var4 != null;
        int[] var6 = var4[1];
        int[] var7 = var4[2];
        int[] var5 = var4[0];
        int[] var8 = var3[0];
        int[] var9 = var3[1];
        int[] var10 = var3[2];

        for (int var11 = 0; SomethingLight0.anInt1559 > var11; ++var11) {
          int var13 = var6[var11];
          int var12 = var5[var11];
          int var14 = var7[var11];
          if ((this.anInt3043 <= var12)) {
            if (var12 > this.anInt3046) {
              var8[var11] = this.anInt3046;
            } else {
              var8[var11] = var12;
            }
          } else {
            var8[var11] = this.anInt3043;
          }

          if (this.anInt3043 > var13) {
            var9[var11] = this.anInt3043;
          } else if (var13 <= this.anInt3046) {
            var9[var11] = var13;
          } else {
            var9[var11] = this.anInt3046;
          }

          if (var14 >= this.anInt3043) {
            if (this.anInt3046 >= var14) {
              var10[var11] = var14;
            } else {
              var10[var11] = this.anInt3046;
            }
          } else {
            var10[var11] = this.anInt3043;
          }
        }
      }

      return var3;
  }

  public static void method172(int var0) {
    TextureSampler6.anIntArray3045 = null;
      if (var0 == 11597) {
        TextureSampler6.aClass94_3042 = null;
      }
  }

  public static int method173(byte var0, int var1, Widget var2) {
    if (var0 < 4) {
        TextureSampler6.resetVariables(-50);
      }

      return
        !GameClient.method44(var2).method92(var1, (byte) -109) &&
            var2.anObjectArray314 == null ?
          -1 :
          (var2.anIntArray249 != null && (var1 < var2.anIntArray249.length) ?
            var2.anIntArray249[var1] :
            -1);
  }

  public static void method174(int var0, int var1) {
    DummyClass8.aClass93_4015.method1522(-127, var1);
      if (var0 != 4096) {
        TextureSampler6.resetVariables(92);
      }
  }

  public static void method175(int var0, int var1, int var2, boolean var3, int var4, int var5,
                              int var6) {
    Mouse.method2091(var5, 4);
      int var8 = var5 - var1;
      int var7 = 0;
      if (var8 < 0) {
        var8 = 0;
      }

      int var10 = -var5;
      int var9 = var5;
      int var11 = var8;
      int var12 = -var8;
      int var14 = -1;
      int[] var15 = DummyClass35.anIntArrayArray663[var2];
      int var17 = var6 + var8;
      int var13 = -1;
      int var16 = -var8 + var6;
      TextureSampler18.method282(var15, -var5 + var6, -40, var16, var0);
      TextureSampler18.method282(var15, var16, -51, var17, var4);
      TextureSampler18.method282(var15, var17, -41, var6 + var5, var0);
      if (!var3) {
        TextureSampler6.anIntArray3045 = null;
      }

      while ((var7 < var9)) {
        var14 += 2;
        var12 += var14;
        if ((var12 >= 0) && (var11 >= 1)) {
          SceneNode.anIntArray1838[var11] = var7;
          --var11;
          var12 -= var11 << 1;
        }

        ++var7;
        var13 += 2;
        var10 += var13;
        int[] var19;
        int[] var18;
        int var21;
        int var20;
        int var23;
        int var22;
        int var24;
        if ((var10 >= 0)) {
          --var9;
          var10 -= var9 << 1;
          if (var8 > var9) {
            var18 = DummyClass35.anIntArrayArray663[var9 + var2];
            var19 = DummyClass35.anIntArrayArray663[-var9 + var2];
            var22 = -var7 + var6;
            var21 = var7 + var6;
            var20 = SceneNode.anIntArray1838[var9];
            var24 = -var20 + var6;
            var23 = var20 + var6;
            TextureSampler18.method282(var18, var22, -113, var24, var0);
            TextureSampler18.method282(var18, var24, 95, var23, var4);
            TextureSampler18.method282(var18, var23, 117, var21, var0);
            TextureSampler18.method282(var19, var22, 113, var24, var0);
            TextureSampler18.method282(var19, var24, -76, var23, var4);
            TextureSampler18.method282(var19, var23, -97, var21, var0);
          } else {
            var18 = DummyClass35.anIntArrayArray663[var2 + var9];
            var19 = DummyClass35.anIntArrayArray663[var2 - var9];
            var20 = var7 + var6;
            var21 = var6 - var7;
            TextureSampler18.method282(var18, var21, 113, var20, var0);
            TextureSampler18.method282(var19, var21, -100, var20, var0);
          }
        }

        var18 = DummyClass35.anIntArrayArray663[var2 + var7];
        var19 = DummyClass35.anIntArrayArray663[var2 - var7];
        var20 = var9 + var6;
        var21 = -var9 + var6;
        if (var8 <= var7) {
          TextureSampler18.method282(var18, var21, 104, var20, var0);
          TextureSampler18.method282(var19, var21, -127, var20, var0);
        } else {
          var22 = var7 <= var11 ? var11 : SceneNode.anIntArray1838[var7];
          var23 = var22 + var6;
          var24 = var6 - var22;
          TextureSampler18.method282(var18, var21, -94, var24, var0);
          TextureSampler18.method282(var18, var24, 115, var23, var4);
          TextureSampler18.method282(var18, var23, 110, var20, var0);
          TextureSampler18.method282(var19, var21, -114, var24, var0);
          TextureSampler18.method282(var19, var24, -79, var23, var4);
          TextureSampler18.method282(var19, var23, 120, var20, var0);
        }
      }
  }

  public static void resetVariables(int var0) {
    int var1 = 0;
      if (var0 >= -111) {
        TextureSampler6.resetVariables(40);
      }

      for (; DummyClass53.anInt1344 > var1; ++var1) {
        PlayerVariable var2 = Unsure.getPlayerVariable(-109, var1);
        if (var2 != null && (var2.anInt556 == 0)) {
          LightIntensity.variables[var1] = 0;
          DummyClass5.anIntArray2985[var1] = 0;
        }
      }

      ClientScript.variableUpdates = new HashTable(16);
  }

}
