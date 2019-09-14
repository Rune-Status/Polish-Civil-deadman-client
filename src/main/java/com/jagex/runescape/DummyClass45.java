package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlUtils;

public final class DummyClass45 {

  public static GameString aClass94_981 = GameString.create("S-Blectionner");
  public static GameString aClass94_982 = GameString.create("niveau ");
  public static Deque aClass61_983 = new Deque();
  public static int anInt984;
  public static GameString aClass94_985 = GameString.create("Fps:");
  public static Buffer[] configs = new Buffer[2048];
  public static int anInt987;
  public static GameString aClass94_988 =
    GameString.create("voudrait faire un -Bchange avec vous)3");
  public static GameString aClass94_989 =
    GameString.create(" est d-Bj-9 dans votre liste d(Wamis)3");
  public static int spawnSceneX;
  public static int anInt991 = -1;
  public static GameString aClass94_992 = GameString.create("http:)4)4");


  public static int[] method1233(int[] var0, int var1) {
    if (var0 != null) {
        if (var1 != 2) {
          DummyClass45.anInt984 = 113;
        }

        int[] var2 = new int[var0.length];
        ArrayUtils.method1358(var0, 0, var2, 0, var0.length);
        return var2;
      } else {
        return null;
      }
  }

  public static int method1234(int var0, int var1, int var2, int var3) {
    int var4 = var1 / var0;
      int var6 = var2 / var0;
      int var7 = var2 & var0 - 1;
      int var5 = -1 + var0 & var1;
      int var8 = SomethingWorldMapy.method543(var4, var6, (byte) -82);
      int var9 = SomethingWorldMapy.method543(var4 + 1, var6, (byte) -104);
      int var10 = SomethingWorldMapy.method543(var4, 1 + var6, (byte) -100);
      if (var3 == 512) {
        int var11 = SomethingWorldMapy
            .method543(1 + var4, var6 + 1, (byte) -109);
        int var12 = TextureSampler39.method275(var8, var9, var5, 96, var0);
        int var13 = TextureSampler39.method275(var10, var11, var5, 16, var0);
        return TextureSampler39.method275(var12, var13, var7, 87, var0);
      } else {
        return -57;
      }
  }

  public static void method1235(int var0, int var1, int var2, int var3, byte var4) {
    if (HuffmanEncoder.anInt638 == 1) {
        DummyClass17.aClass3_Sub28_Sub16Array1825[FileRequester.anInt2958 / 100].method643(
          -8 + SceneSomething2.anInt1053, -8 + FileCacheRequest.anInt4062);
      }

      if (var4 != -121) {
        DummyClass45.spawnSceneX = -21;
      }

      if ((HuffmanEncoder.anInt638 == 3 -1)) {
        DummyClass17.aClass3_Sub28_Sub16Array1825[4 + FileRequester.anInt2958 / 100].method643(
          SceneSomething2.anInt1053 + -8, -8 + FileCacheRequest.anInt4062);
      }

      TextureSampler10.method347(true);
  }

  public static void setQuickchatFileUnpackers(FileUnpacker var0, FileUnpacker var1, int var2) {
    Cache.quickchats = var1;
      if (var2 >= -94) {
        DummyClass45.aClass94_992 = null;
      }

      Queue.globalQuickchats = var0;
  }

  public static void method1237(int var0, int var1) {
    GameWorld.deltaTime = var1 / var0;
  }

  public static void method1238(int var0) {
    DummyClass45.aClass94_992 = null;
      if (var0 < -83) {
        DummyClass45.aClass94_988 = null;
        DummyClass45.aClass61_983 = null;
        DummyClass45.aClass94_989 = null;
        DummyClass45.aClass94_985 = null;
        DummyClass45.aClass94_981 = null;
        DummyClass45.configs = null;
        DummyClass45.aClass94_982 = null;
      }
  }

  public static void method1239(int var0, int var1, int var2, int var3, int var4, boolean var5) {
    if ((var0 < 2 -1)) {
        var0 = 1;
      }

      if (var3 < 1) {
        var3 = 1;
      }

      if (GlRenderer.useOpenGlRenderer) {
        int var6 = var3 + -334;
        if (var6 >= 0) {
          if ((var6 > 101 -1)) {
            var6 = 100;
          }
        } else {
          var6 = 0;
        }

        int var7 = var6 * (TextureSampler33.aShort3052 + -DisplayMode.aShort1444) / 100
          + DisplayMode.aShort1444;
        if (TextureSampler4.aShort3241 <= var7) {
          if (DummyClass18.aShort83 < var7) {
            var7 = DummyClass18.aShort83;
          }
        } else {
          var7 = TextureSampler4.aShort3241;
        }

        int var8 = var7 * var3 * 512 / (var0 * 334);
        int var9;
        int var10;
        short var12;
        if (var8 >= GameWorldSomething.aShort505) {
          if (~TextureSampler18.aShort4038 > ~var8) {
            var12 = TextureSampler18.aShort4038;
            var7 = var12 * var0 * 334 / (var3 * 512);
            if (TextureSampler4.aShort3241 > var7) {
              var7 = TextureSampler4.aShort3241;
              var9 = var12 * var0 * 334 / (512 * var7);
              var10 = (-var9 + var3) / 2;
              if (var5) {
                GlUtils.resetClip();
                GlUtils.fillQuad(var4, var2, var0, var10, 0);
                GlUtils.fillQuad(var4, var2 + (var3 - var10), var0, var10, 0);
              }

              var3 -= var10 * 2;
              var2 += var10;
            }
          }
        } else {
          var12 = GameWorldSomething.aShort505;
          var7 = 334 * var0 * var12 / (512 * var3);
          if (DummyClass18.aShort83 < var7) {
            var7 = DummyClass18.aShort83;
            var9 = 512 * var3 * var7 / (334 * var12);
            var10 = (var0 - var9) / 2;
            if (var5) {
              GlUtils.resetClip();
              GlUtils.fillQuad(var4, var2, var10, var3, 0);
              GlUtils.fillQuad(var0 + (var4 - var10), var2, var10, var3, 0);
            }

            var4 += var10;
            var0 -= 2 * var10;
          }
        }

        HashTable.anInt1705 = var7 * var3 / 334;
      }

      HintMarker.anInt1358 = (short) var0;
      GameCanvas.anInt31 = (short) var3;
      if (var1 < 11) {
        DummyClass45.method1233(null, 18);
      }

      SomethingWorldMapy.anInt3564 = var2;
      DummyClass5.anInt2989 = var4;
  }

  public static void method1240(boolean var0) {
    SomethingTilek.p12Font = null;
      SomethingTexture3.aClass3_Sub28_Sub16Array2656 = null;
      DummyClass17.aClass3_Sub28_Sub16Array1825 = null;
      TextureSampler0.aClass109Array3270 = null;
      SomethingAudio.aClass3_Sub28_Sub17_Sub1_2000 = null;
      TextureCache.aClass3_Sub28_Sub16_Sub2Array2140 = null;
      Mobile.aClass3_Sub28_Sub16Array2839 = null;
      MilliFrameRegulator.aClass3_Sub28_Sub16Array2690 = null;
      NPC.aClass3_Sub28_Sub16Array3977 = null;
      FloorOverlay.aClass3_Sub28_Sub17_2096 = null;
      LightIntensity.aClass3_Sub28_Sub16_895 = null;
      HashTableIterator.aClass3_Sub28_Sub16Array1136 = null;
      AbstractTextureSampler.aClass3_Sub28_Sub17_2379 = null;
      DummyClass38.aClass3_Sub28_Sub16_736 = null;
      OndemandRequester.aClass3_Sub28_Sub16Array996 = null;
      TextureSampler8.aClass3_Sub28_Sub16Array3458 = null;
      SomethingIndex150.aClass3_Sub28_Sub16Array2072 = null;
      TextureSampler2.aClass3_Sub28_Sub16Array3373 = null;
      SceneNode.aClass109Array1831 = null;
      if (var0) {
        DummyClass45.method1233(null, -51);
      }
  }

}
