package com.jagex.runescape.statics;

import com.jagex.runescape.model.WidgetUpdate;
import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.model.AreaSoundEffect;
import com.jagex.runescape.model.GameObjectConfig;
import com.jagex.runescape.model.Player;

public final class DummyClass11 {

  public static int anInt2036;
  public static int anInt2037;
  public static int anInt2038;
  public static int[][] anIntArrayArray2039 = {
      {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
      {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3},
      {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
      {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}
  };
  public static byte[] aByteArray2040 = new byte[520];

  public static void method2203(Player var0, int var1) {
    AreaSoundEffect var2 = (AreaSoundEffect) GlobalStatics_9.aClass130_4046
        .get(var0.name.toBase37());
    if (var1 != 8) {
      DummyClass11.writeUID(null, -44);
    }

    if (var2 != null) {
      if (var2.aClass3_Sub24_Sub1_2312 != null) {
        GlobalStatics_9.aClass3_Sub24_Sub2_2563
            .method461(var2.aClass3_Sub24_Sub1_2312);
        var2.aClass3_Sub24_Sub1_2312 = null;
      }

      var2.unlinkNode();
    }
  }

  public static void writeUID(Buffer var0, int var1) {
    if (GlobalStatics_9.uidFile != null) {
      try {
        GlobalStatics_9.uidFile.seek(-117, 0L);
        GlobalStatics_9.uidFile
            .write(var0.bytes, var0.position, -903171152, 24);
      } catch (Exception var3) {
      }
    }

    if (var1 >= 45) {
      var0.position += 24;
    }
  }

  public static void method2205(int var0) {
    DummyClass11.anIntArrayArray2039 = null;
    DummyClass11.aByteArray2040 = null;
    if (var0 != -17413) {
      DummyClass11.anInt2036 = 77;
    }
  }

  public static void method2206(boolean var0, int var1) {
    WidgetUpdate var2 = GlobalStatics_6.method466(4, 4, var1);
    var2.createIndexedColorSprite(var0);
  }

  public static GameObjectConfig method2207(int var0, int var1) {
    if (var0 != 4) {
      DummyClass11.method2205(95);
    }

    GameObjectConfig var2 = (GameObjectConfig) GlobalStatics_0.aClass93_21.get(
        var1);
    if (var2 == null) {
      byte[] var3 = DummyClass52.aClass153_1171.getBytes(
          GlobalStatics_10.method340(var1, -51),
          GlobalStatics_2.method893(var1, (byte) 110));
      var2 = new GameObjectConfig();
      var2.anInt1527 = var1;
      if (var3 != null) {
        var2.method1692(6219, new Buffer(var3));
      }

      var2.method1689(var0 - 2120);
      if (!DummyClass28.aBoolean337 && var2.aBoolean1491) {
        var2.aClass94Array1499 = null;
      }

      if (var2.aBoolean1498) {
        var2.anInt1538 = 0;
        var2.aBoolean1486 = false;
      }

      GlobalStatics_0.aClass93_21.get((byte) -114, var2, var1);
      return var2;
    } else {
      return var2;
    }
  }

}
