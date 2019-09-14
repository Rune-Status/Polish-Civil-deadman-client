package com.jagex.runescape;

public final class TextureSampler22 extends AbstractTextureSampler {

  public static GameString aClass94_3418 = GameString.create("(U5");
  public static int anInt3419;
  public static int anInt3420;
  public static WorldMapLabel aClass131_3421;


  public TextureSampler22() {
    super(1, false);
  }

  public int[] method154(int var1, byte var2 ) {
    int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var4 = this.method152(0, var1, 32755);

        for (int var5 = 0; var5 < SomethingLight0.anInt1559; ++var5) {
          var3[var5] = 4096 - var4[var5];
        }
      }

      int var7 = 59 % ((30 - var2) / 36);
      return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var3) {
        if (var1 == 0) {
          this.monoChromatic = (var2.readUnsignedByte() == 1);
        }

      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 == -1) {
        int[][] var3 = this.triChromaticImageCache
            .method1594((byte) -128, var2);
        if (this.triChromaticImageCache.aBoolean1379) {
          int[][] var4 = this.method162(var2, 0, (byte) -51);
          assert var4 != null;
          int[] var7 = var4[2];
          int[] var5 = var4[0];
          int[] var6 = var4[1];
          int[] var8 = var3[0];
          int[] var9 = var3[1];
          int[] var10 = var3[2];

          for (int var11 = 0; SomethingLight0.anInt1559 > var11; ++var11) {
            var8[var11] = -var5[var11] + 4096;
            var9[var11] = 4096 - var6[var11];
            var10[var11] = 4096 - var7[var11];
          }
        }

        return var3;
      } else {
        return null;
      }
  }

  public static int method335(int var0) {
    if (var0 != 16859) {
        TextureSampler22.aClass131_3421 = null;
      }

      return DummyClass55.aBoolean1419 && GameObjectConfig.aBooleanArray1490[81]
        && TextureSampler25.amountContextActions > 2 ?
        MonoChromaticImageCache.anIntArray1578[-2 + TextureSampler25.amountContextActions] :
        MonoChromaticImageCache.anIntArray1578[TextureSampler25.amountContextActions - 1];
  }

  public static SomethingQuickChat2 method336(int var0, byte var1) {
    SomethingQuickChat2 var2 =
        (SomethingQuickChat2) TextureSampler1.aClass47_3137.get(var0, 1400);
      if (var2 != null) {
        return var2;
      } else {
        byte[] var3;
        if (var0 < '\u8000') {
          var3 = Cache.quickchats.getBytes(0, var0);
        } else {
          var3 = Queue.globalQuickchats.getBytes(0, var0 & 32767);
        }

        var2 = new SomethingQuickChat2();
        if (var3 != null) {
          var2.method530(new Buffer(var3), (byte) 116);
        }

        if (var1 != -54) {
          TextureSampler22.method337(19);
        }

        if ((var0 >= 32768)) {
          var2.method525(-85);
        }

        TextureSampler1.aClass47_3137.put(var0, var2);
        return var2;
      }
  }

  public static void method337(int var0) {
    TextureSampler22.aClass94_3418 = null;
      if (var0 != 2) {
        TextureSampler22.anInt3419 = -53;
      }

      TextureSampler22.aClass131_3421 = null;
  }

}
