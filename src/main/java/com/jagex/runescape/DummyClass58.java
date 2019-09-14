package com.jagex.runescape;

import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.GlUtils;

public final class DummyClass58 {

  public static GameString COMMAND_QA_OP_TEST = GameStringStatics.create("::qa_op_test");
  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_1457;
  public static GameString COMMAND_WM1 = GameStringStatics.create("::wm1");
  public static GameString aClass94_1459 = GameStringStatics.create("cyan:");
  public static int anInt1460;


  public static void method1652(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                               int var7, int var8, int var9) {
    if (var9 != 0) {
        DummyClass58.COMMAND_WM1 = null;
      }

      if ((var5 >= DummyClass55.anInt1425) && (var5 <= GlTexture2d.anInt3765)
        && var0 >= DummyClass55.anInt1425 && (var0 <= GlTexture2d.anInt3765)
        && (var6 >= DummyClass55.anInt1425) && (GlTexture2d.anInt3765 >= var6)
        && (DummyClass55.anInt1425 <= var1) && (var1 <= GlTexture2d.anInt3765)
        && (DummyClass13.anInt2020 <= var4) && (var4 <= LightIntensity.anInt902)
        && (var7 >= DummyClass13.anInt2020) && LightIntensity.anInt902 >= var7
        && var2 >= DummyClass13.anInt2020 && (LightIntensity.anInt902 >= var2)
        && (var3 >= DummyClass13.anInt2020) && (var3 <= LightIntensity.anInt902)) {
        SomethingInScenePacket202.method114(3, var2, var8, var7, var6, var1, var3, var4, var0,
          var5);
      } else {
        DummyClass53.method1583(var5, var0, var7, 3, var8, var3, var2, var1, var6, var4);
      }
  }

  public static GameString method1653(int var0, int var1) {
    if (var1 != 0) {
        DummyClass58.method1660(-41);
      }

      return RenderAnimation.concat(new GameString[] {
        SomethingScene.toString(255 & var0 >> 24), DummyClass8.aClass94_4023,
        SomethingScene.toString((var0 & 16712751) >> 16), DummyClass8.aClass94_4023,
        SomethingScene.toString(255 & var0 >> 8), DummyClass8.aClass94_4023,
        SomethingScene.toString(var0 & 255)
      });
  }

  public static void method1654(int var0) {
    Mobile.aClass93_2792.method1523((byte) -108);
  }

  public static byte[] method1655(byte var0, byte[] var1) {
    if (var1 == null) {
        return null;
      } else {
        if (var0 > -30) {
          DummyClass58.aClass3_Sub28_Sub16_1457 = null;
        }

        byte[] var2 = new byte[var1.length];
        ArrayUtils.copy(var1, 0, var2, 0, var1.length);
        return var2;
      }
  }

  public static void loadTitleScreenSprites(FileUnpacker var0, byte var1) {
    if (!StillGraphic.aBoolean2713) {
        if (GlRenderer.useOpenGlRenderer) {
          GlUtils.clear();
        } else {
          DummyClass47.method1320();
        }

        DummyClass59.titlebackground =
          SomethingTexture1.method1344(117, var0, DummyClass14.titleBackgroundFileId);
        int var2 = GroundItem.viewHeight;
        int var3 = var2 * 956 / 503;
        assert DummyClass59.titlebackground != null;
        DummyClass59.titlebackground.draw((DummyClass30.viewWidth - var3) / 2, 0, var3, var2);
        AnimationSequence.logoSprite =
          WidgetUpdate.createIndexedColorSprite(var0, BitVariable.logoFileId);
        assert AnimationSequence.logoSprite != null;
        AnimationSequence.logoSprite.draw(
          DummyClass30.viewWidth / 2 - (AnimationSequence.logoSprite.width / 2), 18);
        StillGraphic.aBoolean2713 = true;
        if (var1 > -50) {
          DummyClass58.method1654(-27);
        }

      }
  }

  public static void method1657(int var0, int var1) {
    WidgetUpdate var2 = AudioStreamEncoder3.method466(4, 5, var0);
      var2.createIndexedColorSprite(true);
      if (var1 != -903) {
        DummyClass58.COMMAND_WM1 = null;
      }
  }

  public static void method1658(int var0, int[] var1, Object[] var2) {
    SceneSomething.method956(var2, var1.length - 1, var1, 74, 0);
      int var3 = 113 % ((76 - var0) / 45);
  }

  public static void method1659(int var0) {
    Deque.aClass93_939.method1524(3);
  }

  public static void method1660(int var0) {
    DummyClass58.aClass3_Sub28_Sub16_1457 = null;
      DummyClass58.COMMAND_WM1 = null;
      DummyClass58.COMMAND_QA_OP_TEST = null;

      DummyClass58.aClass94_1459 = null;
  }

  public static void method1661(int var0, FileUnpacker var1, FileUnpacker var2, boolean var3) {
    DummyClass28.aBoolean337 = var3;
      LinearHashTable.aClass153_1043 = var2;
      if (var0 != 2) {
        DummyClass58.method1658(22, null, null);
      }

      DummyClass52.aClass153_1171 = var1;
  }

}
