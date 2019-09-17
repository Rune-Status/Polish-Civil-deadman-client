package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.buffer.BufferStatics;
import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.FileUnpacker;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlUtils;

public final class DummyClass45 {

  public static GameString aClass94_981 = GameStringStatics
      .create("S-Blectionner");
  public static GameString aClass94_982 = GameStringStatics.create("niveau ");
  public static Deque aClass61_983 = new Deque();
  public static GameString aClass94_985 = GameStringStatics.create("Fps:");
  public static Buffer[] configs = new Buffer[2048];
  public static int anInt987;
  public static GameString aClass94_988 =
      GameStringStatics.create("voudrait faire un -Bchange avec vous)3");
  public static GameString aClass94_989 =
      GameStringStatics.create(" est d-Bj-9 dans votre liste d(Wamis)3");
  public static int spawnSceneX;
  public static int anInt991 = -1;
  public static GameString aClass94_992 = GameStringStatics.create("http:)4)4");

  public static int[] method1233(int[] var0, int var1) {
    if (var0 != null) {
      if (var1 != 2) {
        BufferStatics.anInt984 = 113;
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
    int var8 = GlobalStatics_9.method543(var4, var6, (byte) -82);
    int var9 = GlobalStatics_9.method543(var4 + 1, var6, (byte) -104);
    int var10 = GlobalStatics_9.method543(var4, 1 + var6, (byte) -100);
    if (var3 == 512) {
      int var11 = GlobalStatics_9
          .method543(1 + var4, var6 + 1, (byte) -109);
      int var12 = GlobalStatics_10.method275(var8, var9, var5, 96, var0);
      int var13 = GlobalStatics_10.method275(var10, var11, var5, 16, var0);
      return GlobalStatics_10.method275(var12, var13, var7, 87, var0);
    } else {
      return -57;
    }
  }

  public static void method1235(int var0, int var1, int var2, int var3,
      byte var4) {
    if (GlobalStatics_0.anInt638 == 1) {
      DummyClass17.aClass3_Sub28_Sub16Array1825[GlobalStatics_7.anInt2958 / 100]
          .method643(
              -8 + GlobalStatics_9.anInt1053, -8 + GlobalStatics_7.anInt4062);
    }

    if (var4 != -121) {
      DummyClass45.spawnSceneX = -21;
    }

    if (GlobalStatics_0.anInt638 == 2) {
      DummyClass17.aClass3_Sub28_Sub16Array1825[4
          + GlobalStatics_7.anInt2958 / 100].method643(
          GlobalStatics_9.anInt1053 - 8, -8 + GlobalStatics_7.anInt4062);
    }

    GlobalStatics_9.method347(true);
  }

  public static void setQuickchatFileUnpackers(FileUnpacker var0,
      FileUnpacker var1, int var2) {
    GlobalStatics_6.quickchats = var1;
    if (var2 >= -94) {
      DummyClass45.aClass94_992 = null;
    }

    GlobalStatics_9.globalQuickchats = var0;
  }

  public static void method1237(int var0, int var1) {
    GlobalStatics_9.deltaTime = var1 / var0;
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

  public static void method1239(int var0, int var2, int zoom,
      int var4, boolean var5) {
    if (var0 < 1) {
      var0 = 1;
    }

    if (zoom < 1) {
      zoom = 1;
    }

    if (GlRenderer.USE_OPENGL) {
      int var6 = zoom - 334;
      if (var6 >= 0) {
        if (var6 > 100) {
          var6 = 100;
        }
      } else {
        var6 = 0;
      }

      int var7 =
          var6 * (GlobalStatics_10.SOMETHING_ZOOM_0 - GlobalStatics_7.aShort1444)
              / 100
              + GlobalStatics_7.aShort1444;
      if (GlobalStatics_9.aShort3241 <= var7) {
        if (DummyClass18.aShort83 < var7) {
          var7 = DummyClass18.aShort83;
        }
      } else {
        var7 = GlobalStatics_9.aShort3241;
      }

      int var8 = var7 * zoom * 512 / (var0 * 334);
      int var9;
      int var10;
      short var12;
      if (var8 >= GlobalStatics_9.aShort505) {
        if (GlobalStatics_10.aShort4038 < var8) {
          var12 = GlobalStatics_10.aShort4038;
          var7 = var12 * var0 * 334 / (zoom * 512);
          if (GlobalStatics_9.aShort3241 > var7) {
            var7 = GlobalStatics_9.aShort3241;
            var9 = var12 * var0 * 334 / (512 * var7);
            var10 = (-var9 + zoom) / 2;
            if (var5) {
              GlUtils.resetClip();
              GlUtils.fillQuad(var4, var2, var0, var10, 0);
              GlUtils.fillQuad(var4, var2 + zoom - var10, var0, var10, 0);
            }

            zoom -= var10 * 2;
            var2 += var10;
          }
        }
      } else {
        var12 = GlobalStatics_9.aShort505;
        var7 = 334 * var0 * var12 / (512 * zoom);
        if (DummyClass18.aShort83 < var7) {
          var7 = DummyClass18.aShort83;
          var9 = 512 * zoom * var7 / (334 * var12);
          var10 = (var0 - var9) / 2;
          if (var5) {
            GlUtils.resetClip();
            GlUtils.fillQuad(var4, var2, var10, zoom, 0);
            GlUtils.fillQuad(var0 + var4 - var10, var2, var10, zoom, 0);
          }

          var4 += var10;
          var0 -= 2 * var10;
        }
      }

      GlobalStatics_0.anInt1705 = var7 * zoom / 334;
    }
    GlobalStatics_9.anInt1358 = (short) var0;
    GlobalStatics_8.CURRENT_CAMERA_ZOOM = (short) zoom;
    GlobalStatics_9.anInt3564 = var2;
    DummyClass5.anInt2989 = var4;
  }

  public static void method1240() {
    GlobalStatics_9.p12Font = null;
    GlobalStatics_9.aClass3_Sub28_Sub16Array2656 = null;
    DummyClass17.aClass3_Sub28_Sub16Array1825 = null;
    GlobalStatics_9.aClass109Array3270 = null;
    GlobalStatics_9.aClass3_Sub28_Sub17_Sub1_2000 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16_Sub2Array2140 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16Array2839 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16Array2690 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16Array3977 = null;
    GlobalStatics_8.aClass3_Sub28_Sub17_2096 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16_895 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16Array1136 = null;
    GlobalStatics_3.aClass3_Sub28_Sub17_2379 = null;
    DummyClass38.aClass3_Sub28_Sub16_736 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16Array996 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16Array3458 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16Array2072 = null;
    GlobalStatics_9.aClass3_Sub28_Sub16Array3373 = null;
    GlobalStatics_9.aClass109Array1831 = null;
  }

}
