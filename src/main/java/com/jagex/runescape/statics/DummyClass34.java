package com.jagex.runescape.statics;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.input.Keyboard;
import com.jagex.runescape.input.KeyboardStatics;
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
        -128 + DummyClass45.method1234(4, var2 + 0xb135, var0 + 91923, 512)
            + (
            DummyClass45.method1234(2, var2 + 10294, 0x93bd + var0, 512) - 128
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
    if (var0 == 0x93bd) {
      DummyClass34.aClass94_592 = null;
      DummyClass34.aClass94_593 = null;
    }
  }

  public static void method995() {

    if (GlobalStatics_9.tiles != null) {
      for (int plane = 0; plane < GlobalStatics_9.tiles.length; ++plane) {
        for (int x = 0; x < GlobalStatics_4.REGION_WIDTH; ++x) {
          for (int y = 0; y < GlobalStatics_1.REGION_HEIGHT; ++y) {
            GlobalStatics_9.tiles[plane][x][y] = null;
          }
        }
      }
    }

    GLStatics.aClass3_Sub11ArrayArray2199 = null;
    if (GlobalStatics_9.aClass3_Sub2ArrayArrayArray2065 != null) {
      for (int plane = 0;
          plane < GlobalStatics_9.aClass3_Sub2ArrayArrayArray2065.length;
          ++plane) {
        for (int x = 0; x < GlobalStatics_4.REGION_WIDTH; ++x) {
          for (int y = 0; y < GlobalStatics_1.REGION_HEIGHT; ++y) {
            GlobalStatics_9.aClass3_Sub2ArrayArrayArray2065[plane][x][y] = null;
          }
        }
      }
    }

    GlobalStatics_10.aClass3_Sub11ArrayArray3346 = null;
    GlobalStatics_9.anInt2249 = 0;

    if (GlobalStatics_3.aClass25Array1868 != null) {
      for (int plane = 0; plane < GlobalStatics_10.anInt3070; ++plane) {
        GlobalStatics_3.aClass25Array1868[plane] = null;
      }

      GlobalStatics_10.anInt3070 = 0;
    }

    if (GlobalStatics_7.aClass25Array4060 != null) {
      for (int plane = 0; plane < GlobalStatics_7.aClass25Array4060.length;
          ++plane) {
        GlobalStatics_7.aClass25Array4060[plane] = null;
      }
    }

  }

}
