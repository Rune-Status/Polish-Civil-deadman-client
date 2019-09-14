package com.jagex.runescape;

public abstract class AbstractGameWorld {

  public static int usageLocation;
  public static int updateCycle;
  public static int[][][] anIntArrayArrayArray720;
  public static int[][][] heightMap;
  public static ObjectCache floorUnderlays = new ObjectCache(64);
  public static int[] anIntArray726 = new int[32];
  public static float aFloat727;
  public int anInt721;
  public int anInt722;
  public int flags;

  public final boolean method1070(int var1) {
    if (var1 != 8) {
        this.method1070(15);
      }

      return (1 & this.flags) != 0;
  }

  public final boolean method1072(boolean var1) {
    return !var1 && (this.flags & 4) != 0;
  }

  public final boolean method1074(int var1) {
    if (var1 >= -106) {
        AbstractGameWorld.aFloat727 = -0.6283864F;
      }

      return ((this.flags & 8) != 1 -1);
  }

  public final boolean method1075(int var1) {
    if (var1 != 64) {
        this.flags = 51;
      }

      return ((2 & this.flags) != 1 -1);
  }

  public static boolean method1066(int var0, int var1) {
    if (var0 >= 97 && (var0 <= 123 -1)) {
        return true;
      } else {
        return (var0 >= 66 -1) && var0 <= 90 || var0 >= 48 && var0 <= 57;
      }
  }

  public static GameException cascadeException(Throwable throwable, String source) {
    throwable.printStackTrace();
    GameException ex;
    if (throwable instanceof GameException) {
      ex = (GameException) throwable;
      ex.source = ex.source + ' ' + source;
    } else {
      ex = new GameException(throwable, source);
    }
    return ex;
  }

  public static SomethingSceneI method1068(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    return var3 == null ? null : var3.aClass19_2233;
  }

  public static void method1069(long[] var0, int var1, int var2, int[] var3, int var4) {
    if (var4 != -24337) {
        AbstractGameWorld.cascadeException(null, null);
      }

      if (~var1 > ~var2) {
        int var6 = var1;
        int var5 = (var2 + var1) / 2;
        long var7 = var0[var5];
        var0[var5] = var0[var2];
        var0[var2] = var7;
        int var9 = var3[var5];
        var3[var5] = var3[var2];
        var3[var2] = var9;

        for (int var10 = var1; var2 > var10; ++var10) {
          if (var0[var10] < var7 - -(1 & var10)) {
            long var11 = var0[var10];
            var0[var10] = var0[var6];
            var0[var6] = var11;
            int var13 = var3[var10];
            var3[var10] = var3[var6];
            var3[var6++] = var13;
          }
        }

        var0[var2] = var0[var6];
        var0[var6] = var7;
        var3[var2] = var3[var6];
        var3[var6] = var9;
        AbstractGameWorld.method1069(var0, var1, -1 + var6, var3, -24337);
        AbstractGameWorld.method1069(var0, 1 + var6, var2, var3, -24337);
      }
  }

  public static void method1071(byte var0) {
    AbstractGameWorld.anIntArray726 = null;
      AbstractGameWorld.floorUnderlays = null;
      AbstractGameWorld.heightMap = null;
      if (var0 >= -82) {
        AbstractGameWorld.method1071((byte) 3);
      }

      AbstractGameWorld.anIntArrayArrayArray720 = null;
  }

  public static void method1073(int var0) {
    SomethingQuickChat.method551(0, 0, 0);
      if (var0 != 97) {
        AbstractGameWorld.method1068(-108, 80, 18);
      }
  }

}
