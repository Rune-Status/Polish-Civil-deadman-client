package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.opengl.GLStatics;

public final class DummyClass34 {

  public static int anInt590 = -1;
  public static GameString aClass94_591 = GameStringStatics.create("Lade Benutzeroberfl-=che )2 ");
  public static GameString aClass94_592 = GameStringStatics.create("<img=0>");
  public static GameString aClass94_593 = GameStringStatics.create("Utiliser");


  public static GameString decompressString(Buffer var0) {
    return GroundItem.decompressString(var0, 32767);
  }

  public static int perlinNoise(int var0, int var2) {
    int var3 = -128 + (DummyClass45.method1234(4, var2 + '\ub135', var0 + 91923, 512) + (
        DummyClass45.method1234(2, var2 + 10294, '\u93bd' + var0, 512) - 128 >> 1) + (
        DummyClass45.method1234(1, var2, var0, 512) - 128 >> 2));
      var3 = 35 + (int) (0.3D * var3);
      if ((var3 >= 10)) {
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
    if (OndemandFileRequest.tiles != null) {
      for (var0 = 0; var0 < OndemandFileRequest.tiles.length; ++var0) {
        for (var1 = 0; var1 < SocketStream.sceneWidth; ++var1) {
          for (var2 = 0; var2 < TextureSampler17.sceneHeight; ++var2) {
            OndemandFileRequest.tiles[var0][var1][var2] = null;
          }
        }
      }
    }

    GLStatics.aClass3_Sub11ArrayArray2199 = null;
    if (SomethingIndex150.aClass3_Sub2ArrayArrayArray2065 != null) {
      for (var0 = 0; var0 < SomethingIndex150.aClass3_Sub2ArrayArrayArray2065.length; ++var0) {
        for (var1 = 0; var1 < SocketStream.sceneWidth; ++var1) {
          for (var2 = 0; var2 < TextureSampler17.sceneHeight; ++var2) {
            SomethingIndex150.aClass3_Sub2ArrayArrayArray2065[var0][var1][var2] = null;
          }
        }
      }
    }

    TextureSampler32.aClass3_Sub11ArrayArray3346 = null;
    SpawnedGameObject.anInt2249 = 0;
    if (GlobalStatics_6.aClass113Array3610 != null) {
      var0 = 0;
    }

    if (GlobalStatics_3.aClass25Array1868 != null) {
      for (var0 = 0; var0 < TextureSampler21.anInt3070; ++var0) {
        GlobalStatics_3.aClass25Array1868[var0] = null;
      }

      TextureSampler21.anInt3070 = 0;
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

      Keyboard var1 = TextureSampler33.keyboard;
      synchronized (var1) {
        Parameter.anInt3620 = DummyClass21.anInt1762;
        ++TextureSampler29.anInt3398;
        int var2;
        if (GlobalStatics_3.anInt2384 < 0) {
          for (var2 = 0; (var2 < 112); ++var2) {
            GameObjectConfig.aBooleanArray1490[var2] = false;
          }

          GlobalStatics_3.anInt2384 = SomethingPacket116.anInt1744;
        } else {
          while (GlobalStatics_3.anInt2384 != SomethingPacket116.anInt1744) {
            var2 = GlobalStatics_7.anIntArray2952[SomethingPacket116.anInt1744];
            SomethingPacket116.anInt1744 = 127 & 1 + SomethingPacket116.anInt1744;
            if (var2 >= 0) {
              GameObjectConfig.aBooleanArray1490[var2] = true;
            } else {
              GameObjectConfig.aBooleanArray1490[~var2] = false;
            }
          }
        }

        DummyClass21.anInt1762 = SceneSomething.anInt491;
      }
  }

}
