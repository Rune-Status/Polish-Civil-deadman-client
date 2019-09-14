package com.jagex.runescape;

public final class AreaSoundEffect extends Node {

  public static int anInt2309 = 128;
  public static boolean aBoolean2311;
  public static long destroyTime;
  public static int anInt2317;
  public static SignLinkRequest socketRequest;
  public static int[][] landscapeEncryptionKeys;
  public static GameString aClass94_2323 = GameString.create("<img=0>");
  public static int anInt2330;
  public static GameString aClass94_2331 = GameString.create("");
  public static int windowWidth;
  public static GameString aClass94_2335 = GameString.create("(Y");
  public int anInt2307;
  public int anInt2308;
  public int anInt2310;
  public AudioStreamEncoder1 aClass3_Sub24_Sub1_2312;
  public int anInt2314;
  public AudioStreamEncoder1 aClass3_Sub24_Sub1_2315;
  public int anInt2316;
  public GameObjectConfig aClass111_2320;
  public int anInt2321;
  public int anInt2322;
  public NPC aClass140_Sub4_Sub2_2324;
  public int anInt2325;
  public int anInt2326;
  public Player aClass140_Sub4_Sub1_2327;
  public int anInt2328;
  public boolean aBoolean2329;
  public int anInt2332;
  public int[] anIntArray2333;

  public void method134(int var1 ) {
    int var2 = this.anInt2332;
      if (null != this.aClass111_2320) {
        GameObjectConfig var3 = this.aClass111_2320.method1685(0);
        if (var3 == null) {
          this.anInt2332 = -1;
          this.anIntArray2333 = null;
          this.anInt2325 = 0;
          this.anInt2328 = 0;
          this.anInt2310 = 0;
        } else {
          this.anInt2325 = var3.anInt1515;
          this.anInt2332 = var3.anInt1512;
          this.anInt2310 = var3.anInt1518;
          this.anInt2328 = var3.anInt1484 * 128;
          this.anIntArray2333 = var3.anIntArray1539;
        }
      } else if (this.aClass140_Sub4_Sub2_2324 == null) {
        if (null != this.aClass140_Sub4_Sub1_2327) {
          this.anInt2332 = DummyClass50.method1398(var1 + -1,
              this.aClass140_Sub4_Sub1_2327);
          this.anInt2328 = 128 * this.aClass140_Sub4_Sub1_2327.anInt3969;
        }
      } else {
        int var6 = ISAACCipher.method1232(this.aClass140_Sub4_Sub2_2324, var1 ^ -2);
        if (var2 != var6) {
          NpcConfiguration var4 = this.aClass140_Sub4_Sub2_2324.config;
          this.anInt2332 = var6;
          if (var4.anIntArray1292 != null) {
            var4 = var4.method1471((byte) -87);
          }

          if (var4 != null) {
            this.anInt2328 = var4.anInt1291 * 128;
          } else {
            this.anInt2328 = 0;
          }
        }
      }

      if (var1 == 1) {
        if (this.anInt2332 != var2 && this.aClass3_Sub24_Sub1_2312 != null) {
          MonoChromaticImageBuffer.aClass3_Sub24_Sub2_2563.method461(
              this.aClass3_Sub24_Sub1_2312);
          this.aClass3_Sub24_Sub1_2312 = null;
        }

      }
  }

  public static AnimationSomething method133(int var0, int var1) {
    if (var1 != 0) {
        AreaSoundEffect.method135(-59, 112, 16, -6, 77, -69);
      }

      AnimationSomething var2 = (AnimationSomething) DummyClass13.aClass93_2016.get(
          var0);
      if (var2 == null) {
        var2 =
          Cache.method1089(WorldMapLabel.animationBases, false, EnumStringFetcher.animationFrames,
            (byte) 118, var0);
        if (null != var2) {
          DummyClass13.aClass93_2016.get((byte) -75, var2, var0);
        }

        return var2;
      } else {
        return var2;
      }
  }

  public static void method135(int var0, int var1, int var2, int var3, int var4, int var5) {
    TextureSampler18.method282(DummyClass35.anIntArrayArray663[var0], var1 - var2, -76,
        var2 + var1, var5);
      int var6 = 0;
      int var8 = var2 * var2;
      int var9 = var4 * var4;
      int var7 = var4;
      int var10 = var9 << 1;
      int var11 = var8 << 1;
      int var12 = var4 << 1;
      int var13 = var10 + (1 + -var12) * var8;
      int var14 = var9 - var11 * (var12 - 1);
      int var15 = var8 << 2;
      if (var3 > -110) {
        AreaSoundEffect.method137(-83, (byte) -91);
      }

      int var16 = var9 << 2;
      int var17 = var10 * (3 + (var6 << 1));
      int var18 = var11 * ((var4 << 1) + -3);
      int var19 = (1 + var6) * var16;
      int var20 = var15 * (var4 - 1);

      while (var7 > 0) {
        --var7;
        int var22 = var7 + var0;
        int var21 = var0 - var7;
        if (var13 < 0) {
          while (-1 < ~var13) {
            ++var6;
            var13 += var17;
            var14 += var19;
            var19 += var16;
            var17 += var16;
          }
        }

        if (~var14 > -1) {
          var13 += var17;
          var17 += var16;
          var14 += var19;
          ++var6;
          var19 += var16;
        }

        int var23 = var6 + var1;
        var14 += -var18;
        var18 -= var15;
        var13 += -var20;
        int var24 = var1 + -var6;
        var20 -= var15;
        TextureSampler18.method282(DummyClass35.anIntArrayArray663[var21], var24, -110, var23,
          var5);
        TextureSampler18.method282(DummyClass35.anIntArrayArray663[var22], var24, 112, var23, var5);
      }
  }

  public static void method136(int var0) {
    AreaSoundEffect.aClass94_2323 = null;
      AreaSoundEffect.aClass94_2335 = null;
      if (var0 != -3) {
        AreaSoundEffect.anInt2317 = 98;
      }

      AreaSoundEffect.aClass94_2331 = null;
      AreaSoundEffect.socketRequest = null;
      AreaSoundEffect.landscapeEncryptionKeys = null;
  }

  public static void method137(int var0, byte var1) {
    if (var1 >= -111) {
        AreaSoundEffect.aClass94_2335 = null;
      }

      ProceduralTexture.aClass93_1146.method1522(-127, var0);
      DummyClass13.aClass93_2016.method1522(-126, var0);
  }

}
