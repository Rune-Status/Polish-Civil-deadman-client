package com.jagex.runescape.statics;

import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.model.WidgetUpdate;
import com.jagex.runescape.cache.FileUnpacker;
import com.jagex.runescape.model.SoftwareDirectColorSprite;
import com.jagex.runescape.node.Deque;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlUtils;
import com.jagex.runescape.settings.SettingsStatics;

public final class DummyClass51 {

  public static int[][] anIntArrayArray1160 = new int[104][104];
  public static int[] anIntArray1161;
  public static Deque aClass61_1162 = new Deque();
  public static int[] anIntArray1163 = new int[1000];
  public static int viewX;
  public static int anInt1165 = -1;

  public static void method1417(int var0) {
    if (var0 < 98) {
      DummyClass51.method1418(55, null);
    }

    if (DummyClass15.state == 10 && GlRenderer.USE_OPENGL) {
      DummyClass26.setState(28, 5);
    }

    if (DummyClass15.state == 30) {
      DummyClass26.setState(25, 5);
    }
  }

  public static void method1418(int var0, FileUnpacker var1) {
    DummyClass8.aClass109_Sub1Array4027 =
        GlobalStatics_7
            .createSprites((byte) 65, GlobalStatics_9.runesFileId, var1);
    GlobalStatics_9.anIntArray861 = new int[256];

    int var2;
    for (var2 = 0; var2 < 3; ++var2) {
      int var4 = (GlobalStatics_10.anIntArray1729[1 + var2] & 16711680) >> 16;
      float var3 = (GlobalStatics_10.anIntArray1729[var2] & 16711680) >> 16;
      float var6 = GlobalStatics_10.anIntArray1729[var2] >> 8 & 255;
      float var9 = GlobalStatics_10.anIntArray1729[var2] & 255;
      float var5 = (var4 - var3) / 64.0F;
      int var7 = (GlobalStatics_10.anIntArray1729[var2 + 1] & 0xff00) >> 8;
      float var8 = (-var6 + var7) / 64.0F;
      int var10 = GlobalStatics_10.anIntArray1729[var2 + 1] & 255;
      float var11 = (var10 - var9) / 64.0F;

      for (int var12 = 0; var12 < 64; ++var12) {
        GlobalStatics_9.anIntArray861[var12 + 64 * var2] =
            (int) var9 | ((int) var6 << 8 | (int) var3 << 16);
        var6 += var8;
        var9 += var11;
        var3 += var5;
      }
    }

    for (var2 = 192; var2 < 255; ++var2) {
      GlobalStatics_9.anIntArray861[var2] = GlobalStatics_10.anIntArray1729[3];
    }

    var2 = -35 / ((-51 - var0) / 42);
    DummyClass12.anIntArray2026 = new int[0x8000];
    GlobalStatics_11.anIntArray49 = new int[0x8000];
    GlobalStatics_10.method215((byte) -89, null);
    GlobalStatics_8.anIntArray3805 = new int[0x8000];
    DummyClass2.anIntArray1681 = new int[0x8000];
    GlobalStatics_10.aClass3_Sub28_Sub16_Sub2_1381 =
        new SoftwareDirectColorSprite(128, 254);
  }

  public static void method1419(int var0) {
    int var2 = GlobalStatics_10.anInt3395;
    int var3 = GlobalStatics_9.anInt3552;
    int var1 = GlobalStatics_1.anInt1462;
    int var5 = 6116423;
    int var4 = GlobalStatics_9.anInt3537;
    if (GlRenderer.USE_OPENGL) {
      GlUtils.fillQuad(var1, var2, var3, var4, var5);
      GlUtils.fillQuad(1 + var1, 1 + var2, var3 - 2, 16, 0);
      GlUtils.drawQuad(1 + var1, var2 + 18, var3 - 2, -19 + var4, 0);
    } else {
      DummyClass47.method1323(var1, var2, var3, var4, var5);
      DummyClass47.method1323(1 + var1, 1 + var2, var3 - 2, 16, 0);
      DummyClass47.method1311(1 + var1, var2 + 18, -2 + var3, -19 + var4, 0);
    }

    GlobalStatics_8.aClass3_Sub28_Sub17_2096
        .method681(GameStringStatics.aClass94_2667, var1 + 3,
            var2 + 14, var5, -1);
    int var7 = GlobalStatics_0.anInt1709;
    int var6 = GlobalStatics_9.anInt1676;
    if (var0 >= -113) {
      DummyClass51.anIntArrayArray1160 = null;
    }

    for (int var8 = 0; GlobalStatics_10.amountContextActions > var8; ++var8) {
      int var9 =
          (-var8 - 1 + GlobalStatics_10.amountContextActions) * 15 + var2 + 31;
      int var10 = 16777215;
      if (var1 < var6 && var6 < var1 + var3 && -13 + var9 < var7 && var7
          < 3 + var9) {
        var10 = 16776960;
      }

      GlobalStatics_8.aClass3_Sub28_Sub17_2096.method681(
          GlobalStatics_0.method802(var8, true), var1 + 3,
          var9, var10, 0);
    }

    GlobalStatics_9.method1282(GlobalStatics_1.anInt1462, (byte) 107,
        GlobalStatics_10.anInt3395, GlobalStatics_9.anInt3537,
        GlobalStatics_9.anInt3552);
  }

  public static void method1420(int var0, int var1, int var2, int var3,
      byte var4) {
    WidgetUpdate var5 = GlobalStatics_6.method466(4, 10, var0);
    var5.g((byte) 33);
    var5.anInt3597 = var2;
    var5.anInt3598 = var3;
    var5.anInt3596 = var1;
    if (var4 >= -35) {
      DummyClass51.anInt1165 = 86;
    }
  }

  public static int getSettings() {
    return ((SettingsStatics.aBoolean3184 ? 1 : 0) << 19) + (
        (SettingsStatics.aBoolean661 ? 1 : 0) << 16) + (
        (SettingsStatics.aBoolean1685 ? 1 : 0) << 15)
        + ((SettingsStatics.USE_BUMP_MAPS ? 1 : 0) << 13) + (
        (SettingsStatics.aBoolean2910 ? 1 : 0) << 10)
        + ((SettingsStatics.aBoolean3275 ? 1 : 0) << 9) + (
        (SettingsStatics.aBoolean236 ? 1 : 0) << 7) + (
        (SettingsStatics.aBoolean488 ? 1 : 0) << 6) + (
        (SettingsStatics.aBoolean1905 ? 1 : 0) << 5) + (
        (SettingsStatics.SHOULD_USE_OPENGL ? 1 : 0) << 3) + (
        SettingsStatics.BRIGHTNESS
            & 7) - (-((SettingsStatics.aBoolean3604 ? 1 : 0) << 4) - (
        (SettingsStatics.aBoolean2623 ? 1 : 0) << 8)) - (
        -(SettingsStatics.anInt1137 << 11 & 6144) - (
            (SettingsStatics.anInt2453 == 0 ? 0 : 1) << 20) - (
            ((SettingsStatics.anInt120 != 0 ? 1 : 0) << 21) + (
                (SettingsStatics.anInt340 == 0 ? 0 : 1) << 22))) + (
        SettingsStatics.anInt2682
            << 23);
  }

  public static void clear65(byte var0) {
    DummyClass51.anIntArrayArray1160 = null;
    DummyClass51.anIntArray1161 = null;
    DummyClass51.aClass61_1162 = null;
    DummyClass51.anIntArray1163 = null;
    if (var0 != 24) {
      DummyClass51.method1420(-74, 65, 51, 91, (byte) -26);
    }
  }

}
