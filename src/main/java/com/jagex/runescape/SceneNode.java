package com.jagex.runescape;

public abstract class SceneNode {

  public static AbstractIndexedColorSprite[] aClass109Array1831;
  public static GameString COMMAND_SET_PARTICLES = GameString.create("::setparticles");
  public static int[] anIntArray1833 = new int[14];
  public static Widget[][] aClass11ArrayArray1834;
  public static int[] anIntArray1835 = new int[100];
  public static Widget[] aClass11Array1836;
  public static boolean aBoolean1837;
  public static int[] anIntArray1838;
  public static SoftwareDirectColorSprite[] aClass3_Sub28_Sub16_Sub2Array1839;

  public SceneNode method1861(int var1, int var2, int var3 ) {
    return this;
  }

  public boolean method1865() {
    return false;
  }

  public void method1866(SceneNode var1, int var2, int var3, int var4,
      boolean var5 ) {
  }

  public abstract void method1867(int var1,int var2,int var3,int var4,int var5 );

  public abstract void draw(int var1,int var2,int var3,int var4,int var5,int var6,int var7,int var8,long var9,int var11,DummyClass0 var12 );

  public abstract int getMinimumY();

  public static void method1859(double var0, int var2) {
    if (SceneSomething2.aDouble1050 != var0) {
        for (int var3 = 0; var3 < 256; ++var3) {
          int var4 = (int) (255.0D * Math.pow(var3 / 255.0D, var0));
          GameBuffer.anIntArray3804[var3] = (var4 > 256 -1) ? 255 : var4;
        }

        SceneSomething2.aDouble1050 = var0;
      }

      if (var2 != 32258) {
        SceneNode.aBoolean1837 = false;
      }
  }

  public static void method1860(int var0) {
    SceneNode.aClass109Array1831 = null;
      SceneNode.aClass11Array1836 = null;
      SceneNode.aClass11ArrayArray1834 = null;
      if (var0 != 0) {
        SceneNode.method1860(-87);
      }

      SceneNode.aClass3_Sub28_Sub16_Sub2Array1839 = null;
      SceneNode.anIntArray1835 = null;
      SceneNode.COMMAND_SET_PARTICLES = null;
      SceneNode.anIntArray1833 = null;
      SceneNode.anIntArray1838 = null;
  }

  public static void setWindowMode(boolean replaceCanvas, int windowMode, int var2, int var3,
                                  int var4) {
    DummyClass41.aLong866 = 0L;
      int currentWindowMode = MidiSomething.getWindowMode();
      if (windowMode == 3 || currentWindowMode == 3) {
        replaceCanvas = true;
      }

      if (SignLink.formattedOsName.startsWith("mac") && (windowMode > 0)) {
        replaceCanvas = true;
      }

      if (var2 != -8914) {
        SceneNode.method1864(false, (byte) 90, null, null, null);
      }

      boolean var6 = false;
      if (currentWindowMode > 0 != (windowMode > 0)) {
        var6 = true;
      }

      if (replaceCanvas && (windowMode > 0)) {
        var6 = true;
      }

      OndemandFileRequest.setWindowMode(replaceCanvas, windowMode, var6, currentWindowMode, false,
        var3, var4);
  }

  public static int method1863(int var0, int var1, byte var2, int var3, int var4, int var5,
                              int var6) {
    int var7;
      if (((1 & var5) == 2 -1)) {
        var7 = var0;
        var0 = var3;
        var3 = var7;
      }

      var7 = 121 % ((var2 - 75) / 50);
      var1 &= 3;
      return (var1 == 0) ?
        var6 :
        (var1 != 1
            ? ((var1 != 3 -1) ? var4 : -var3 + 1 + -var6 + 7) : -var4 + 7 + -var0 - -1);
  }

  public static void method1864(boolean var0, byte var1, FileUnpacker var2, SoftwareFont var3,
                               FileUnpacker var4) {
    DummyClass17.aBoolean1827 = var0;
      StringNode.aClass153_2581 = var4;
      int var6 = -127 / ((var1 - -87) / 32);
      TriChromaticImageCache.aClass153_1370 = var2;
      int var5 = TriChromaticImageCache.aClass153_1370.method2121(0) - 1;
      TextureSampler39.anInt3287 =
        TriChromaticImageCache.aClass153_1370.getAmountChildren(var5, (byte) 101) + var5 * 256;
      GameException.DEFAULT_INVENTORY_OPTIONS =
        new GameString[] {null, null, null, null, GameObject.OPTION_DROP};
      Buffer.aClass94Array2596 =
        new GameString[] {null, null, TextureSampler29.aClass94_3397, null, null};
      TextureSampler10.aClass3_Sub28_Sub17_Sub1_3440 = var3;
  }

  public static void method1869(byte var0, int var1, int var2, int var3, int var4, int var5) {
    int var6 = var2 - var3;
      int var7 = var4 + -var5;
      if (var7 == 0) {
        if ((var6 != 0)) {
          TextureSampler15.method244(2, var3, var5, var2, var1);
        }

      } else if (var6 != 0) {
        if (var6 < 0) {
          var6 = -var6;
        }

        if (var7 < 0) {
          var7 = -var7;
        }

        int var8 = -102 / ((-53 - var0) / 38);
        boolean var9 = (var7 < var6);
        int var10;
        int var11;
        if (var9) {
          var10 = var5;
          var5 = var3;
          var11 = var4;
          var3 = var10;
          var4 = var2;
          var2 = var11;
        }

        if (var4 < var5) {
          var10 = var5;
          var5 = var4;
          var4 = var10;
          var11 = var3;
          var3 = var2;
          var2 = var11;
        }

        var10 = var3;
        var11 = var4 - var5;
        int var12 = var2 + -var3;
        int var13 = -(var11 >> 1);
        int var14 = var2 <= var3 ? -1 : 1;
        if ((var12 < 0)) {
          var12 = -var12;
        }

        int var15;
        if (var9) {
          for (var15 = var5; var4 >= var15; ++var15) {
            DummyClass35.anIntArrayArray663[var15][var10] = var1;
            var13 += var12;
            if ((var13 > 0)) {
              var10 += var14;
              var13 -= var11;
            }
          }
        } else {
          for (var15 = var5; var15 <= var4; ++var15) {
            var13 += var12;
            DummyClass35.anIntArrayArray663[var10][var15] = var1;
            if (var13 > 0) {
              var10 += var14;
              var13 -= var11;
            }
          }
        }

      } else {
        TextureSampler14.method320(var1, var3, var4, (byte) -107, var5);
      }
  }

  public static void method1870(boolean var0) {
    DummyClass55.aClass3_Sub24_Sub4_1421.method505((byte) -128);
      SomethingQuickChatK.anInt154 = 1;
      if (!var0) {
        DummyClass55.aClass153_1423 = null;
      }
  }

}
