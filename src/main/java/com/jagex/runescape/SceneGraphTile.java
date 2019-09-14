package com.jagex.runescape;

public final class SceneGraphTile extends Node {

  private static GameString aClass94_2224 = GameString.create("Please wait)3)3)3");
  public static GameString aClass94_2215 = GameString.create("Konfig geladen)3");
  public static int anInt2217 = 2;
  public static int anInt2218 = -1;
  public static short[] aShortArray2219 =
      {(short) -4160, (short) -4163, (short) -8256, (short) -8259, (short) 22461};
  public static HashTable aClass130_2220 = new HashTable(32);
  public static GameString aClass94_2242 = GameString.create("welle2:");
  public static int anInt2243 = 3353893;
  public static int anInt2246;
  public static GameString aClass94_2216 = SceneGraphTile.aClass94_2224;
  public SceneSomething[] sceneGraphNodes = new SceneSomething[5];
  public boolean aBoolean2222;
  public int anInt2223;
  public boolean aBoolean2225;
  public SomethingSceneTile aClass35_2226;
  public int anInt2227;
  public int flags;
  public int anInt2229;
  public SomethingSceneJ aClass12_2230;
  public int anInt2231;
  public int anInt2232;
  public SomethingSceneI aClass19_2233;
  public SceneSomething2 aClass70_2234;
  public SceneGraphTile aClass3_Sub2_2235;
  public boolean aBoolean2236;
  public int[] anIntArray2237 = new int[5];
  public int anInt2238;
  public int anInt2239;
  public SomethingTilek aClass126_2240;
  public int anInt2241;
  public int anInt2244;
  public SomethingScene aClass72_2245;

  public SceneGraphTile(int var1, int var2, int var3 ) {
    try {
      this.anInt2231 = var3;
      this.anInt2238 = this.anInt2244 = var1;
      this.anInt2239 = var2;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "bj.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  public static void method102(int var0) {
    try {
      SceneGraphTile.aClass130_2220 = null;
      if (var0 != 3353893) {
        SceneGraphTile.aClass94_2216 = null;
      }

      SceneGraphTile.aShortArray2219 = null;
      SceneGraphTile.aClass94_2242 = null;
      SceneGraphTile.aClass94_2215 = null;
      SceneGraphTile.aClass94_2224 = null;
      SceneGraphTile.aClass94_2216 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "bj.A(" + var0 + ')');
    }
  }

  public static void method103(byte var0) {
    try {
      GameClient.aClass130_2194.clear(122);
      if (var0 <= 18) {
        SceneGraphTile.aClass94_2224 = null;
      }

      DummyClass50.aClass13_1139.clear();
      SomethingTilek.aClass13_1666.clear();
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "bj.B(" + var0 + ')');
    }
  }

  public static long method104(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    return var3 != null && var3.aClass12_2230 != null ? var3.aClass12_2230.aLong328 : 0L;
  }

}
