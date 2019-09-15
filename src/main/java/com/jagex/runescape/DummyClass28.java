package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.done.AbstractDirectColorSprite;
import com.jagex.runescape.opengl.SomethingShadows;
import com.jagex.runescape.opengl.GlDirectColorSprite;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.sprite.SoftwareIndexedColorSprite;

public final class DummyClass28 {

  public static int anInt336;
  public static boolean aBoolean337;
  public static GameString aClass94_338 = GameStringStatics.create("Ablegen");
  public static GameString aClass94_339 = GameStringStatics.create("1");
  public static int anInt340 = 127;
  public static GameString aClass94_341 = GameStringStatics.create(")3");


  private static SoftwareIndexedColorSprite[] method885(boolean var0, int var1,
                                                              FileUnpacker var2, int var3) {
    if (!var0) {
        DummyClass28.aClass94_338 = null;
      }

      return !GlobalStatics_9.loadSprites(var2, var3, var1, -30901) ?
        null :
        GlobalStatics_9.createSprites(0);
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
    GlobalStatics_9.aClass3_Sub28_Sub16_Sub2Array2140 =
        GlobalStatics_9.method2176(0, 32767, GlobalStatics_8.anInt2104, var1);
      GlobalStatics_9.aClass3_Sub28_Sub16Array2656 =
        GlobalStatics_9.method2027(0, (byte) 11, GlobalStatics_10.anInt4042, var1);
      GlobalStatics_9.aClass3_Sub28_Sub16Array996 =
        GlobalStatics_9.method2027(0, (byte) 11, GlobalStatics_1.anInt2195, var1);
      GlobalStatics_9.aClass3_Sub28_Sub16Array3373 =
        GlobalStatics_9.method2027(0, (byte) 11, GlobalStatics_2.anInt2575, var1);
      GlobalStatics_9.aClass3_Sub28_Sub16Array3977 =
        GlobalStatics_9.method2027(0, (byte) 11, GlobalStatics_9.headIconsPrayerFileId, var1);
      GlobalStatics_9.aClass3_Sub28_Sub16Array2072 =
        GlobalStatics_9.method2027(0, (byte) 11, GlobalStatics_9.hintHeadIconsFileId, var1);
      GlobalStatics_9.aClass3_Sub28_Sub16Array2690 =
        GlobalStatics_9.method2027(0, (byte) 11, GlobalStatics_9.anInt2689, var1);
      DummyClass38.aClass3_Sub28_Sub16_736 =
        GlobalStatics_9.method602(0, GlobalStatics_10.anInt3061, (byte) -18, var1);
      DummyClass17.aClass3_Sub28_Sub16Array1825 =
        GlobalStatics_10.method286(var0 ^ -22, 0, GlobalStatics_9.anInt2633, var1);
      GlobalStatics_9.aClass3_Sub28_Sub16Array1136 =
        GlobalStatics_10.method286(-1, 0, DummyClass59.anInt678, var1);
      GlobalStatics_9.aClass109Array1831 =
        DummyClass52.method1424(var1, (byte) -12, 0, GlobalStatics_9.anInt2436);
      GlobalStatics_9.aClass109Array3270 =
        DummyClass52.method1424(var1, (byte) -12, 0, GlTexture2d.anInt3757);
      GlobalStatics_3.aClass3_Sub28_Sub17_2379.method697(GlobalStatics_9.aClass109Array3270,
        null);
      GlobalStatics_9.p12Font.method697(GlobalStatics_9.aClass109Array3270, null);
      GlobalStatics_8.aClass3_Sub28_Sub17_2096.method697(GlobalStatics_9.aClass109Array3270, null);
      if (GlRenderer.useOpenGlRenderer) {
        SomethingShadows.floorShadows = DummyClass28
            .method885(true, DummyClass38.floorShadowsFileId, var1, 0);

        assert SomethingShadows.floorShadows != null;
        for (int var2 = 0; SomethingShadows.floorShadows.length > var2; ++var2) {
          SomethingShadows.floorShadows[var2].method1675();
        }
      }

      SoftwareDirectColorSprite var10 =
        DummyClass59.method1043(0, var1, var0 - 3199, GlobalStatics_9.anInt1325);
      assert var10 != null;
      var10.method665();
      if (GlRenderer.useOpenGlRenderer) {
        GlobalStatics_9.aClass3_Sub28_Sub16_895 = new GlDirectColorSprite(var10);
      } else {
        GlobalStatics_9.aClass3_Sub28_Sub16_895 = var10;
      }

      SoftwareDirectColorSprite[] var3 =
        GlobalStatics_9.method2176(0, 32767, GlobalStatics_9.anInt2471, var1);

      int var4;
      assert var3 != null;
      for (var4 = 0; (var4 < var3.length); ++var4) {
        var3[var4].method665();
      }

      if (GlRenderer.useOpenGlRenderer) {
        GlobalStatics_9.aClass3_Sub28_Sub16Array3458 = new AbstractDirectColorSprite[var3.length];

        for (var4 = 0; var4 < var3.length; ++var4) {
          GlobalStatics_9.aClass3_Sub28_Sub16Array3458[var4] = new GlDirectColorSprite(
              var3[var4]);
        }
      } else {
        GlobalStatics_9.aClass3_Sub28_Sub16Array3458 = var3;
      }

      int var5 = (int) (var0 * Math.random()) - 10;
      var4 = (int) (21.0D * Math.random()) - 10;
      int var6 = -10 + (int) (21.0D * Math.random());
      int var7 = -20 + (int) (Math.random() * 41.0D);

      int var8;
      for (var8 = 0; var8 < GlobalStatics_9.aClass3_Sub28_Sub16_Sub2Array2140.length; ++var8) {
        GlobalStatics_9.aClass3_Sub28_Sub16_Sub2Array2140[var8].method669(var4 + var7, var7 + var5,
          var7 + var6);
      }

      if (GlRenderer.useOpenGlRenderer) {
        GlobalStatics_9.aClass3_Sub28_Sub16Array2839 =
            new AbstractDirectColorSprite[GlobalStatics_9.aClass3_Sub28_Sub16_Sub2Array2140.length];

        for (var8 = 0;
             GlobalStatics_9.aClass3_Sub28_Sub16_Sub2Array2140.length > var8;
             ++var8) {
          GlobalStatics_9.aClass3_Sub28_Sub16Array2839[var8] =
              new GlDirectColorSprite(
                  GlobalStatics_9.aClass3_Sub28_Sub16_Sub2Array2140[var8]);
        }
      } else {
        GlobalStatics_9.aClass3_Sub28_Sub16Array2839 = GlobalStatics_9.aClass3_Sub28_Sub16_Sub2Array2140;
      }
  }

}
