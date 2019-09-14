package com.jagex.runescape;

public final class TextureSampler12 extends AbstractTextureSampler {

  public static GameBuffer secureBuffer = new GameBuffer(5000);
  public static GameString aClass94_3039 = GameString.create("0");
  public static GameString aClass94_3040 = GameString.create("<col=40ff00>");
  public static AnimationSomething[] aClass3_Sub28_Sub5Array3041 = new AnimationSomething[14];
  private int anInt3036;
  private int anInt3037 = 1;
  private int anInt3038;


  public TextureSampler12() {
    super(0, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      int var4;
      if (this.monoChromaticImageCache.aBoolean1580) {
        var4 = DummyClass4.anIntArray2999[var1];
        int var5 = var4 - 2048 >> 1;

        for (int var6 = 0; var6 < SomethingLight0.anInt1559; ++var6) {
          int var8 = TextureCache.anIntArray2125[var6];
          int var9 = -2048 + var8 >> 1;
          int var7;
          if (~this.anInt3038 == -1) {
            var7 = (var8 + -var4) * this.anInt3037;
          } else {
            int var10 = var9 * var9 - -(var5 * var5) >> 12;
            var7 = (int) (Math.sqrt(var10 / 4096.0F) * 4096.0D);
            var7 = (int) (3.141592653589793D * (var7 * this.anInt3037));
          }

          var7 -= var7 & -4096;
          if (~this.anInt3036 == -1) {
            var7 = TextureSampler23.anIntArray3212[(var7 & 4085) >> 4] + 4096 >> 1;
          } else if (this.anInt3036 == 2) {
            var7 -= 2048;
            if (-1 < ~var7) {
              var7 = -var7;
            }

            var7 = -var7 + 2048 << 1;
          }

          var3[var6] = var7;
        }
      }

      var4 = -64 / ((30 - var2) / 36);
      return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        this.method158(10);
      }

      if (-1 == ~var1) {
        this.anInt3038 = var2.readUnsignedByte();
      } else {
        if (1 == var1) {
          this.anInt3036 = var2.readUnsignedByte();
        } else if (~var1 == -4) {
          this.anInt3037 = var2.readUnsignedByte();
        }
      }
  }

  public void method158(int var1 ) {
    FileSystem.method844((byte) -9);
      if (var1 != 16251) {
        TextureSampler12.method171(106, -38, 106, 7, -28, -61, 30, -77, -47);
      }
  }

  public static void method167(int var0) {
    if (TextureSampler33.keyboard != null) {
        Keyboard var1 = TextureSampler33.keyboard;
        synchronized (var1) {
          TextureSampler33.keyboard = null;
        }
      }

      if (var0 != 0) {
        TextureSampler12.method171(119, -44, -76, -104, 29, -65, 34, 18, 104);
      }
  }

  public static void method168(int var0) {
    TextureSampler12.aClass94_3040 = null;
      if (var0 != -1771542303) {
        TextureSampler12.aClass3_Sub28_Sub5Array3041 = null;
      }

      TextureSampler12.aClass3_Sub28_Sub5Array3041 = null;
      TextureSampler12.aClass94_3039 = null;
      TextureSampler12.secureBuffer = null;
  }

  public static void method169(int var0) {
    DummyClass34.method995();
      if (var0 != 22230) {
        TextureSampler12.method167(124);
      }

      for (int var1 = 0; 4 > var1; ++var1) {
        BlockConfig.collisionMaps[var1].method1496(var0 + -22230);
      }

      System.gc();
  }

  public static Class method170(int var0, String var1) throws ClassNotFoundException {
    if (var0 != 6092) {
        TextureSampler12.aClass3_Sub28_Sub5Array3041 = null;
      }

      return var1.equals("B") ?
        Byte.TYPE :
        (!var1.equals("I") ?
          (var1.equals("S") ?
            Short.TYPE :
            (!var1.equals("J") ?
              (var1.equals("Z") ?
                Boolean.TYPE :
                (var1.equals("F") ?
                  Float.TYPE :
                  (var1.equals("D") ?
                    Double.TYPE :
                    (var1.equals("C") ? Character.TYPE : Class.forName(var1))))) :
              Long.TYPE)) :
          Integer.TYPE);
  }

  public static void method171(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                              int var7, int var8) {
    if (var0 != -101) {
        TextureSampler12.method167(-46);
      }

      if (MovedStatics0.method57(var1, 104)) {
        Cache.method1095(var2, var8, var4, SceneNode.aClass11ArrayArray1834[var1], var3, -1, var7,
          var6, (byte) 119, var5);
      } else {
        if (~var5 == 0) {
          for (int var9 = 0; -101 < ~var9; ++var9) {
            GroundItemNode.aBooleanArray3674[var9] = true;
          }
        } else {
          GroundItemNode.aBooleanArray3674[var5] = true;
        }

      }
  }

}
