package com.jagex.runescape;

public final class DummyClass13 {

  public static ObjectCache aClass93_2016 = new ObjectCache(100);
  public static int[] anIntArray2017 = {1, 2, 4, 8};
  public static GameString aClass94_2018 = GameString.create("Cabbage");
  public static FileUnpacker models;
  public static int anInt2020;
  public static int[] anIntArray2021 = new int[2];
  public static int anInt2022;
  public static int anInt2023;
  public static int anInt2024;


  public static SomethingSceneJ method2193(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    if (var3 == null) {
      return null;
    } else {
      SomethingSceneJ var4 = var3.aClass12_2230;
      var3.aClass12_2230 = null;
      return var4;
    }
  }

  public static boolean method2194(int var0) {
      if (Structure.aBoolean3641) {
          return !((Boolean) TextureSampler23.aClass94_3209.method1577(var0 - 2112)).booleanValue();
      }

      return true;
  }

  public static void method2195(int var0, int var1) {
    short var2 = 256;
      if (var0 > var2) {
        var0 = var2;
      }

      if ((var0 > 10)) {
        var0 = 10;
      }

      SomethingScene.anInt1071 += var0 * 128;
      int var3;
      if (DummyClass12.anIntArray2026.length < SomethingScene.anInt1071) {
        SomethingScene.anInt1071 -= DummyClass12.anIntArray2026.length;
        var3 = (int) (12.0D * Math.random());
        TextureSampler30.method215((byte) -119, DummyClass8.aClass109_Sub1Array4027[var3]);
      }

      var3 = var1;
      int var5 = (var2 - var0) * 128;
      int var4 = 128 * var0;

      int var6;
      int var7;
      for (var6 = 0; var5 > var6; ++var6) {
        var7 = DummyClass2.anIntArray1681[var3 + var4] -
          var0 * DummyClass12.anIntArray2026[-1 + DummyClass12.anIntArray2026.length
            & SomethingScene.anInt1071 + var3] / 6;
        if (var7 < 0) {
          var7 = 0;
        }

        DummyClass2.anIntArray1681[var3++] = var7;
      }

      int var8;
      int var9;
      for (var6 = var2 - var0; var2 > var6; ++var6) {
        var7 = var6 * 128;

        for (var8 = 0; var8 < 128; ++var8) {
          var9 = (int) (100.0D * Math.random());
          if ((var9 < 50) && (var8 > 10) && (var8 < 118)) {
            DummyClass2.anIntArray1681[var8 + var7] = 255;
          } else {
            DummyClass2.anIntArray1681[var8 + var7] = 0;
          }
        }
      }

      for (var6 = 0; var2 - var0 > var6; ++var6) {
        AnimationSomething.anIntArray3592[var6] = AnimationSomething.anIntArray3592[var6 + var0];
      }

      for (var6 = var2 - var0; var2 > var6; ++var6) {
        AnimationSomething.anIntArray3592[var6] =
          (int) (Math.sin(DummyClass3.anInt57 / 14.0D) * 16.0D + 14.0D * Math.sin(
            DummyClass3.anInt57 / 15.0D) + 12.0D * Math.sin(
            DummyClass3.anInt57 / 16.0D));
        ++DummyClass3.anInt57;
      }

      DummyClass22.anInt1740 += var0;
      var6 = (var0 + (1 & AbstractGameWorld.updateCycle)) / 2;
      if ((var6 > 0)) {
        for (var7 = 0; DummyClass22.anInt1740 > var7; ++var7) {
          var8 = 2 + (int) (124.0D * Math.random());
          var9 = (int) (128.0D * Math.random()) + 128;
          DummyClass2.anIntArray1681[var8 + (var9 << 7)] = 192;
        }

        DummyClass22.anInt1740 = 0;

        int var10;
        for (var7 = 0; var2 > var7; ++var7) {
          var9 = var7 * 128;
          var8 = 0;

          for (var10 = -var6; (var10 < 128); ++var10) {
            if (var6 + var10 < 128) {
              var8 += DummyClass2.anIntArray1681[var9 + (var10 + var6)];
            }

            if (((-1 - var6 + var10) >= 0)) {
              var8 -= DummyClass2.anIntArray1681[-var6 - 1 + var10 + var9];
            }

            if (var10 >= 0) {
              GameBuffer.anIntArray3805[var10 + var9] = var8 / (1 + var6 * 2);
            }
          }
        }

        for (var7 = 0; var7 < 128; ++var7) {
          var8 = 0;

          for (var9 = -var6; var2 > var9; ++var9) {
            var10 = var9 * 128;
            if (((var9 + var6) < var2)) {
              var8 += GameBuffer.anIntArray3805[var6 * 128 + (var7 + var10)];
            }

            if (var9 - var6 - 1 >= 0) {
              var8 -= GameBuffer.anIntArray3805[-((1 + var6) * 128) + (var7 + var10)];
            }

            if (var9 >= 0) {
              DummyClass2.anIntArray1681[var10 + var7] = var8 / (var6 * 2 + 1);
            }
          }
        }
      }
  }

  public static void method2196(int var0) {
    TextureSampler25.aClass93_3412.method1523((byte) -107);
      if (var0 != 128) {
        DummyClass13.anInt2024 = 111;
      }

      TextureSampler2.aClass93_3369.method1523((byte) -110);
  }

  public static void method2197(boolean var0) {
    if (var0) {
        DummyClass13.anIntArray2021 = null;
        DummyClass13.aClass94_2018 = null;
        DummyClass13.anIntArray2017 = null;
        DummyClass13.models = null;
        DummyClass13.aClass93_2016 = null;
      }
  }

}
