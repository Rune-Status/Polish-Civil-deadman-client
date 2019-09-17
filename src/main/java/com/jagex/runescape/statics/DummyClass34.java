package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.Keyboard;
import com.jagex.runescape.opengl.GLStatics;

public final class DummyClass34 {

  public static int anInt590 = -1;
  public static GameString aClass94_591 = GameStringStatics
      .create("Lade Benutzeroberfl-=che )2 ");
  public static GameString aClass94_592 = GameStringStatics.create("<img=0>");
  public static GameString aClass94_593 = GameStringStatics.create("Utiliser");

  public static GameString decompressString(Buffer var0) {
    return GlobalStatics_9.decompressString(var0, 32767);
  }

  public static int perlinNoise(int var0, int var2) {
    int var3 =
        -128 + DummyClass45.method1234(4, var2 + '\ub135', var0 + 91923, 512)
            + (
            DummyClass45.method1234(2, var2 + 10294, '\u93bd' + var0, 512) - 128
                >> 1) + (
            DummyClass45.method1234(1, var2, var0, 512) - 128 >> 2);
    var3 = 35 + (int) (0.3D * var3);
    if (var3 >= 10) {
      if (var3 > 60) {
        var3 = 60;
      }
    } else {
      var3 = 10;
    }

    return var3;
  }

  public static void method994(int var0) {
    DummyClass34.aClass94_591 = null;
    if (var0 == '\u93bd') {
      DummyClass34.aClass94_592 = null;
      DummyClass34.aClass94_593 = null;
    }
  }

  public static void method995() {
    int var0;
    int var1;
    int var2;
    if (GlobalStatics_9.tiles != null) {
      for (var0 = 0; var0 < GlobalStatics_9.tiles.length; ++var0) {
        for (var1 = 0; var1 < GlobalStatics_4.sceneWidth; ++var1) {
          for (var2 = 0; var2 < GlobalStatics_1.sceneHeight; ++var2) {
            GlobalStatics_9.tiles[var0][var1][var2] = null;
          }
        }
      }
    }

    GLStatics.aClass3_Sub11ArrayArray2199 = null;
    if (GlobalStatics_9.aClass3_Sub2ArrayArrayArray2065 != null) {
      for (var0 = 0;
          var0 < GlobalStatics_9.aClass3_Sub2ArrayArrayArray2065.length;
          ++var0) {
        for (var1 = 0; var1 < GlobalStatics_4.sceneWidth; ++var1) {
          for (var2 = 0; var2 < GlobalStatics_1.sceneHeight; ++var2) {
            GlobalStatics_9.aClass3_Sub2ArrayArrayArray2065[var0][var1][var2] = null;
          }
        }
      }
    }

    GlobalStatics_10.aClass3_Sub11ArrayArray3346 = null;
    GlobalStatics_9.anInt2249 = 0;
    if (GlobalStatics_6.aClass113Array3610 != null) {
      var0 = 0;
    }

    if (GlobalStatics_3.aClass25Array1868 != null) {
      for (var0 = 0; var0 < GlobalStatics_10.anInt3070; ++var0) {
        GlobalStatics_3.aClass25Array1868[var0] = null;
      }

      GlobalStatics_10.anInt3070 = 0;
    }

    if (GlobalStatics_7.aClass25Array4060 != null) {
      for (var0 = 0; var0 < GlobalStatics_7.aClass25Array4060.length; ++var0) {
        GlobalStatics_7.aClass25Array4060[var0] = null;
      }
    }

  }

  public static void method996(int var0) {
    if (var0 >= -35) {
      DummyClass34.perlinNoise(3, -24);
    }

    Keyboard var1 = GlobalStatics_10.keyboard;
    synchronized (var1) {
      GlobalStatics_9.anInt3620 = DummyClass21.anInt1762;
      ++GlobalStatics_10.anInt3398;
      int var2;
      if (GlobalStatics_3.anInt2384 < 0) {
        for (var2 = 0; var2 < 112; ++var2) {
          GlobalStatics_8.aBooleanArray1490[var2] = false;
        }

        GlobalStatics_3.anInt2384 = GlobalStatics_9.anInt1744;
      } else {
        while (GlobalStatics_3.anInt2384 != GlobalStatics_9.anInt1744) {
          var2 = GlobalStatics_7.anIntArray2952[GlobalStatics_9.anInt1744];
          GlobalStatics_9.anInt1744 = 127 & 1 + GlobalStatics_9.anInt1744;
          if (var2 >= 0) {
            GlobalStatics_8.aBooleanArray1490[var2] = true;
          } else {
            GlobalStatics_8.aBooleanArray1490[~var2] = false;
          }
        }
      }

      DummyClass21.anInt1762 = GlobalStatics_9.anInt491;
    }
  }

}
