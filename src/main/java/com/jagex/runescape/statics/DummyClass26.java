package com.jagex.runescape.statics;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.input.KeyboardStatics;
import com.jagex.runescape.model.GameWorld;
import com.jagex.runescape.model.SoftwareDirectColorSprite;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.settings.SettingsStatics;

public final class DummyClass26 {

  public static GameString aClass94_1610 = GameStringStatics
      .create("Loaded wordpack");
  public static GameWorld[] aClass44_Sub1Array1609;
  public static GameString aClass94_1612 = GameStringStatics
      .create("classement ");
  public static int[] anIntArray1613 = new int[500];
  public static GameString TRADE_REQUEST = GameStringStatics
      .create(":tradereq:");
  public static int anInt1616;
  public static GameString aClass94_1615 = DummyClass26.aClass94_1610;

  public static void setState(int var0, int var1) {
    if (DummyClass15.state != var0) {
      if (DummyClass15.state == 0) {
        GlobalStatics_9.method1517((byte) -118);
      }

      if (var0 == 40) {
        GlobalStatics_9.method951(0);
      }

      boolean var2 = var0 == 5 || var0 == 10 || var0 == 28;
      if (var0 != 40 && DummyClass8.aClass89_4012 != null) {
        DummyClass8.aClass89_4012.destroy();
        DummyClass8.aClass89_4012 = null;
      }

      if (var0 == 25 || var0 == 28) {
        DummyClass11.anInt2038 = 0;
        GlobalStatics_0.anInt2579 = 1;
        DummyClass8.anInt4019 = 0;
        GlobalStatics_9.anInt2275 = 1;
        GlobalStatics_8.anInt3293 = 0;
        GlobalStatics_9.method1250(102, true);
      }

      if (var0 == 25 || var0 == 10) {
        GlobalStatics_9.method1293(true);
      }

      if (var0 == 5) {
        DummyClass58
            .loadTitleScreenSprites(GlobalStatics_10.sprites, (byte) -111);
      } else {
        GlobalStatics_10.method247((byte) -121);
      }

      boolean var3 =
          var1 == DummyClass15.state || DummyClass15.state == 10 ||
              DummyClass15.state == 28;
      if (var3 == !var2) {
        if (var2) {
          GlobalStatics_4.anInt1691 = GlobalStatics_9.openingMusicFileId;
          if (SettingsStatics.anInt120 == 0) {
            GlobalStatics_9.method882(-1, 2);
          } else {
            GlobalStatics_5
                .method2099(true, GlobalStatics_9.openingMusicFileId, 0,
                    GlobalStatics_9.fileUnpacker6, false, 255, 2);
          }

          DummyClass43.ondemandRequester.writeStatus(false, true);
        } else {
          GlobalStatics_9.method882(-1, 2);
          DummyClass43.ondemandRequester.writeStatus(true, true);
        }
      }

      if (GlRenderer.USE_OPENGL && (var0 == 25 || var0 == 28 || var0
          == 40)) {
        GlRenderer.method1833();
      }

      DummyClass15.state = var0;
    }
  }

  public static void method1720(boolean var0, int var1) {
    GlobalStatics_4.anIntArray1695 = new int[104];
    GlobalStatics_9.anIntArray1138 = new int[104];
    DummyClass52.anInt1174 = 99;
    GlobalStatics_9.anIntArray1920 = new int[104];
    byte var2;
    if (var0) {
      var2 = 1;
    } else {
      var2 = 4;
    }

    GlobalStatics_9.tileOrientation = new byte[var2][104][104];
    GlobalStatics_9.anIntArray2469 = new int[104];
    DummyClass36.anIntArrayArrayArray2609 = new int[var2][105][var1];
    GlobalStatics_9.SCENE_SHADOW = new byte[var2][105][105];
    DummyClass17.tileFloors = new byte[var2][104][104];
    GlobalStatics_9.anIntArray2606 = new int[104];
    DummyClass18.aByteArrayArrayArray81 = new byte[var2][104][104];
    GlobalStatics_10.floorUnderlayIds = new byte[var2][104][104];
  }

  public static void method1721(boolean var0) {
    DummyClass26.aClass94_1610 = null;
    KeyboardStatics.KEY_TABLE = null;
    DummyClass26.aClass94_1612 = null;
    DummyClass26.TRADE_REQUEST = null;
    DummyClass26.aClass44_Sub1Array1609 = null;
    if (!var0) {
      DummyClass26.method1720(true, 30);
    }

    DummyClass26.anIntArray1613 = null;
    DummyClass26.aClass94_1615 = null;
  }

  public static SoftwareDirectColorSprite method1722(int var0) {
    int var1 =
        GlobalStatics_9.anIntArray2931[0] * GlobalStatics_10.anIntArray3076[0];
    byte[] var2 = DummyClass5.aByteArrayArray2987[0];
    int[] var3 = new int[var1];

    for (int var4 = 0; var1 > var4; ++var4) {
      var3[var4] = GlobalStatics_10.anIntArray3446[(int) var2[var4] & 255];
    }

    SoftwareDirectColorSprite var6 =
        new SoftwareDirectColorSprite(GlobalStatics_9.anInt2426,
            GlobalStatics_9.anInt1748,
            GlobalStatics_9.anIntArray2048[0],
            GlobalStatics_0.anIntArray2591[0],
            GlobalStatics_9.anIntArray2931[0],
            GlobalStatics_10.anIntArray3076[0], var3);
    DummyClass37.method1035((byte) 122);
    return var0 >= -51 ? null : var6;
  }

}
