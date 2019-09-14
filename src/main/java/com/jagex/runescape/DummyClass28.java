package com.jagex.runescape;

import com.jagex.runescape.opengl.DummyClass16;
import com.jagex.runescape.opengl.GlDirectColorSprite;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;

public final class DummyClass28 {

  public static int anInt336;
  public static boolean aBoolean337;
  public static GameString aClass94_338 = GameString.create("Ablegen");
  public static GameString aClass94_339 = GameString.create("1");
  public static int anInt340 = 127;
  public static GameString aClass94_341 = GameString.create(")3");


  private static SoftwareIndexedColorSprite[] method885(boolean var0, int var1,
                                                              FileUnpacker var2, int var3) {
    if (!var0) {
        DummyClass28.aClass94_338 = null;
      }

      return !SomethingTexture4.loadSprites(var2, var3, var1, -30901) ?
        null :
        LinearHashTable.createSprites(0);
  }

  public static void method886(byte var0) {
    if (var0 < 26) {
        DummyClass28.aClass94_339 = null;
      }

      DummyClass28.aClass94_338 = null;
      DummyClass28.aClass94_339 = null;
      DummyClass28.aClass94_341 = null;
  }

  public static void method887(int var0, FileUnpacker var1) {
    TextureCache.aClass3_Sub28_Sub16_Sub2Array2140 =
        SomethingAudio.method2176(0, 32767, FloorOverlay.anInt2104, var1);
      SomethingTexture3.aClass3_Sub28_Sub16Array2656 =
        Projectile.method2027(0, (byte) 11, TextureSampler18.anInt4042, var1);
      OndemandRequester.aClass3_Sub28_Sub16Array996 =
        Projectile.method2027(0, (byte) 11, GameClient.anInt2195, var1);
      TextureSampler2.aClass3_Sub28_Sub16Array3373 =
        Projectile.method2027(0, (byte) 11, SubNode.anInt2575, var1);
      NPC.aClass3_Sub28_Sub16Array3977 =
        Projectile.method2027(0, (byte) 11, RenderAnimation.headIconsPrayerFileId, var1);
      SomethingIndex150.aClass3_Sub28_Sub16Array2072 =
        Projectile.method2027(0, (byte) 11, TextureSampler3.hintHeadIconsFileId, var1);
      MilliFrameRegulator.aClass3_Sub28_Sub16Array2690 =
        Projectile.method2027(0, (byte) 11, MilliFrameRegulator.anInt2689, var1);
      DummyClass38.aClass3_Sub28_Sub16_736 =
        Structure.method602(0, TextureSampler34.anInt3061, (byte) -18, var1);
      DummyClass17.aClass3_Sub28_Sub16Array1825 =
        TextureSampler18.method286(var0 ^ -22, 0, SomethingTexture.anInt2633, var1);
      HashTableIterator.aClass3_Sub28_Sub16Array1136 =
        TextureSampler18.method286(-1, 0, DummyClass59.anInt678, var1);
      SceneNode.aClass109Array1831 =
        DummyClass52.method1424(var1, (byte) -12, 0, SomethingVolume15.anInt2436);
      TextureSampler0.aClass109Array3270 =
        DummyClass52.method1424(var1, (byte) -12, 0, GlTexture2d.anInt3757);
      AbstractTextureSampler.aClass3_Sub28_Sub17_2379.method697(TextureSampler0.aClass109Array3270,
        null);
      SomethingTilek.p12Font.method697(TextureSampler0.aClass109Array3270, null);
      FloorOverlay.aClass3_Sub28_Sub17_2096.method697(TextureSampler0.aClass109Array3270, null);
      if (GlRenderer.useOpenGlRenderer) {
        DummyClass16.floorShadows = DummyClass28
            .method885(true, DummyClass38.floorShadowsFileId, var1, 0);

        assert DummyClass16.floorShadows != null;
        for (int var2 = 0; DummyClass16.floorShadows.length > var2; ++var2) {
          DummyClass16.floorShadows[var2].method1675();
        }
      }

      SoftwareDirectColorSprite var10 =
        DummyClass59.method1043(0, var1, var0 - 3199, ObjectCache.anInt1325);
      assert var10 != null;
      var10.method665();
      if (GlRenderer.useOpenGlRenderer) {
        LightIntensity.aClass3_Sub28_Sub16_895 = new GlDirectColorSprite(var10);
      } else {
        LightIntensity.aClass3_Sub28_Sub16_895 = var10;
      }

      SoftwareDirectColorSprite[] var3 =
        SomethingAudio.method2176(0, 32767, IntegerNode.anInt2471, var1);

      int var4;
      assert var3 != null;
      for (var4 = 0; (var4 < var3.length); ++var4) {
        var3[var4].method665();
      }

      if (GlRenderer.useOpenGlRenderer) {
        TextureSampler8.aClass3_Sub28_Sub16Array3458 = new AbstractDirectColorSprite[var3.length];

        for (var4 = 0; var4 < var3.length; ++var4) {
          TextureSampler8.aClass3_Sub28_Sub16Array3458[var4] = new GlDirectColorSprite(
              var3[var4]);
        }
      } else {
        TextureSampler8.aClass3_Sub28_Sub16Array3458 = var3;
      }

      int var5 = (int) (var0 * Math.random()) - 10;
      var4 = (int) (21.0D * Math.random()) - 10;
      int var6 = -10 + (int) (21.0D * Math.random());
      int var7 = -20 + (int) (Math.random() * 41.0D);

      int var8;
      for (var8 = 0; var8 < TextureCache.aClass3_Sub28_Sub16_Sub2Array2140.length; ++var8) {
        TextureCache.aClass3_Sub28_Sub16_Sub2Array2140[var8].method669(var4 + var7, var7 + var5,
          var7 + var6);
      }

      if (GlRenderer.useOpenGlRenderer) {
        Mobile.aClass3_Sub28_Sub16Array2839 =
            new AbstractDirectColorSprite[TextureCache.aClass3_Sub28_Sub16_Sub2Array2140.length];

        for (var8 = 0;
            TextureCache.aClass3_Sub28_Sub16_Sub2Array2140.length > var8;
            ++var8) {
          Mobile.aClass3_Sub28_Sub16Array2839[var8] =
              new GlDirectColorSprite(
                  TextureCache.aClass3_Sub28_Sub16_Sub2Array2140[var8]);
        }
      } else {
        Mobile.aClass3_Sub28_Sub16Array2839 = TextureCache.aClass3_Sub28_Sub16_Sub2Array2140;
      }
  }

}
