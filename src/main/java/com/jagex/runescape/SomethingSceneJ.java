package com.jagex.runescape;

public final class SomethingSceneJ {

  private static GameString aClass94_321 =
    GameString.create("Checking for updates )2 ");
  public static float aFloat319;
  public static FileUnpacker aClass153_322;
  public static FileUnpacker aClass153_323;
  public static GameString aClass94_325 = GameString.create(",Mcran)2titre charg-B");
  public static GameString aClass94_331 = GameString.create("(U1");
  public static GameString aClass94_327 = SomethingSceneJ.aClass94_321;
  public SceneNode aClass140_320;
  public int anInt324;
  public int anInt326;
  public long aLong328;
  public boolean aBoolean329;
  public int anInt330;

  public static void method870(int var0, byte var1, int var2, int var3, int var4, int var5) {
    try {
      int var6;
      int var7;
      for (var6 = var2; var4 + var2 >= var6; ++var6) {
        for (var7 = var3; var5 + var3 >= var7; ++var7) {
          if (-1 >= ~var7 && 104 > var7 && -1 >= ~var6 && 104 > var6) {
            MouseRecorder.aByteArrayArrayArray1014[var0][var7][var6] = 127;
          }
        }
      }

      for (var6 = var2; var4 + var2 > var6; ++var6) {
        for (var7 = var3; ~(var3 + var5) < ~var7; ++var7) {
          if (~var7 <= -1 && ~var7 > -105 && ~var6 <= -1 && var6 < 104) {
            AbstractGameWorld.heightMap[var0][var7][var6] =
              var0 <= 0 ? 0 : AbstractGameWorld.heightMap[var0 + -1][var7][var6];
          }
        }
      }

      if (0 < var3 && ~var3 > -105) {
        for (var6 = 1 + var2; ~(var2 + var4) < ~var6; ++var6) {
          if (-1 >= ~var6 && var6 < 104) {
            AbstractGameWorld.heightMap[var0][var3][var6] =
              AbstractGameWorld.heightMap[var0][var3 - 1][var6];
          }
        }
      }

      if (~var2 < -1 && ~var2 > -105) {
        for (var6 = var3 + 1; ~(var3 - -var5) < ~var6; ++var6) {
          if (var6 >= 0 && 104 > var6) {
            AbstractGameWorld.heightMap[var0][var6][var2] =
              AbstractGameWorld.heightMap[var0][var6][var2 + -1];
          }
        }
      }

      var6 = 56 % ((var1 - -18) / 50);
      if (var3 >= 0 && var2 >= 0 && var3 < 104 && ~var2 > -105) {
        if (var0 != 0) {
          if (~var3 < -1 && AbstractGameWorld.heightMap[-1 + var0][var3 + -1][var2]
            != AbstractGameWorld.heightMap[var0][-1 + var3][var2]) {
            AbstractGameWorld.heightMap[var0][var3][var2] =
              AbstractGameWorld.heightMap[var0][-1 + var3][var2];
          } else if (0 < var2
            && ~AbstractGameWorld.heightMap[var0][var3][-1 + var2] != ~AbstractGameWorld.heightMap[
            -1 + var0][var3][var2 + -1]) {
            AbstractGameWorld.heightMap[var0][var3][var2] =
              AbstractGameWorld.heightMap[var0][var3][var2 - 1];
          } else if (-1 > ~var3 && -1 > ~var2
            && ~AbstractGameWorld.heightMap[var0][-1 + var3][var2 - 1]
            != ~AbstractGameWorld.heightMap[var0 - 1][-1 + var3][var2 - 1]) {
            AbstractGameWorld.heightMap[var0][var3][var2] =
              AbstractGameWorld.heightMap[var0][-1 + var3][var2 - 1];
          }
        } else if (0 < var3 && 0 != AbstractGameWorld.heightMap[var0][var3 + -1][var2]) {
          AbstractGameWorld.heightMap[var0][var3][var2] =
            AbstractGameWorld.heightMap[var0][var3 + -1][var2];
        } else if (-1 > ~var2 && ~AbstractGameWorld.heightMap[var0][var3][var2 - 1] != -1) {
          AbstractGameWorld.heightMap[var0][var3][var2] =
            AbstractGameWorld.heightMap[var0][var3][var2 + -1];
        } else if (var3 > 0 && 0 < var2
          && AbstractGameWorld.heightMap[var0][var3 - 1][var2 + -1] != 0) {
          AbstractGameWorld.heightMap[var0][var3][var2] =
            AbstractGameWorld.heightMap[var0][var3 - 1][var2 + -1];
        }
      }

    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "bm.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
    }
  }

  public static void method871(byte var0) {
    try {
      SomethingSceneJ.aClass94_321 = null;
      SomethingSceneJ.aClass94_327 = null;
      SomethingSceneJ.aClass94_331 = null;
      SomethingSceneJ.aClass153_322 = null;
      SomethingSceneJ.aClass153_323 = null;
      SomethingSceneJ.aClass94_325 = null;
      int var1 = -93 / ((2 - var0) / 50);
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "bm.A(" + var0 + ')');
    }
  }

  public static int method872(int var0, int var1, int var2) {
    try {
      Inventory var3 = (Inventory) SceneGraphTile.aClass130_2220.get(var1);
      return null == var3 ?
        0 :
        (var0 >= ~var2 && var2 < var3.counts.length ? var3.counts[var2] : 0);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "bm.C(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

  public static byte[] method873(byte var0, byte[] var1) {
    try {
      int var2 = var1.length;
      byte[] var3 = new byte[var2];
      if (var0 == 62) {
        ArrayUtils.copy(var1, 0, var3, 0, var2);
        return var3;
      } else {
        return null;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "bm.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
    }
  }

}
