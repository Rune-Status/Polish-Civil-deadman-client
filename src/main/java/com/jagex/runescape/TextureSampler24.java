package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.GlUtils;
import java.util.zip.CRC32;

public final class TextureSampler24 extends AbstractTextureSampler {

  private static GameString aClass94_3141 = GameString.create("Loaded config");
  public static CRC32 aCRC32_3143 = new CRC32();
  public static int anInt3144;
  public static GameString aClass94_3145 = GameString.create(")1 ");
  public static GameString aClass94_3142 = TextureSampler24.aClass94_3141;


  public TextureSampler24() {
    super(1, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int var3 = -42 / ((30 - var2) / 36);
      int[] var10 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[][] var4 = this.method162(var1, 0, (byte) -126);
        assert var4 != null;
        int[] var5 = var4[0];
        int[] var7 = var4[2];
        int[] var6 = var4[1];

        for (int var8 = 0; (var8 < SomethingLight0.anInt1559); ++var8) {
          var10[var8] = (var7[var8] + var5[var8] + var6[var8]) / 3;
        }
      }

      return var10;
  }

  public static void method223(boolean var0, int var1, int var2, int var3, int var4, int var5,
                              int var6, int var7) {
    if ((var4 == var7)) {
        SocketStream.method1460(var1, var3, (byte) -113, var6, var7, var2, var5);
      } else {
        if (!var0) {
          TextureSampler24.method226(87, 8);
        }

        if (((var2 - var7) >= DummyClass55.anInt1425) && var7 + var2 <= GlTexture2d.anInt3765
          && (DummyClass13.anInt2020 <= (var3 - var4)) && LightIntensity.anInt902 >= var3 + var4) {
          DummyClass12.method2200(var6, var2, var3, var5, var7, 95, var4, var1);
        } else {
          TextureSampler25.method329(var7, var6, var5, var1, (byte) -54, var3, var2, var4);
        }

      }
  }

  public static void method224(byte var0, int var1, int var2, int var3, int var4, int var5) {
    SceneNode.aClass109Array1831[0].draw(var3, var4);
      SceneNode.aClass109Array1831[1].draw(var3, -16 + var5 + var4);
      int var8 = 44 % ((var0 - 38) / 57);
      int var6 = var5 * (var5 + -32) / var2;
      if (var6 < 8) {
        var6 = 8;
      }

      int var7 = var1 * (-var6 + -32 + var5) / (var2 + -var5);
      if (GlRenderer.useOpenGlRenderer) {
        GlUtils.fillQuad(var3, 16 + var4, 16, -32 + var5, SomethingOtherWorldMap.anInt2530);
        GlUtils.fillQuad(var3, 16 + var4 + var7, 16, var6, SceneSomething.anInt486);
        GlUtils.drawVerticalLine(var3, var7 + (var4 - -16), var6, TextureSampler2.anInt3377);
        GlUtils.drawVerticalLine(var3 + 1, var7 + 16 + var4, var6, TextureSampler2.anInt3377);
        GlUtils.drawHorizontalLine(var3, var7 + 16 + var4, 16, TextureSampler2.anInt3377);
        GlUtils.drawHorizontalLine(var3, var7 + var4 + 17, 16, TextureSampler2.anInt3377);
        GlUtils.drawVerticalLine(15 + var3, var4 + (16 - -var7), var6, SceneGraphTile.anInt2243);
        GlUtils.drawVerticalLine(14 + var3, 17 + (var4 - -var7), -1 + var6,
          SceneGraphTile.anInt2243);
        GlUtils.drawHorizontalLine(var3, var6 + 15 + var4 + var7, 16, SceneGraphTile.anInt2243);
        GlUtils.drawHorizontalLine(var3 + 1, var4 + 14 - -var7 + var6, 15,
          SceneGraphTile.anInt2243);
      } else {
        DummyClass47.method1323(var3, 16 + var4, 16, -32 + var5, SomethingOtherWorldMap.anInt2530);
        DummyClass47.method1323(var3, var7 + (var4 - -16), 16, var6, SceneSomething.anInt486);
        DummyClass47.method1318(var3, var7 + var4 + 16, var6, TextureSampler2.anInt3377);
        DummyClass47.method1318(var3 + 1, var7 + 16 + var4, var6, TextureSampler2.anInt3377);
        DummyClass47.method1317(var3, var4 + (16 - -var7), 16, TextureSampler2.anInt3377);
        DummyClass47.method1317(var3, 17 + var4 + var7, 16, TextureSampler2.anInt3377);
        DummyClass47.method1318(var3 - -15, var7 + 16 + var4, var6, SceneGraphTile.anInt2243);
        DummyClass47.method1318(14 + var3, var4 - -17 - -var7, -1 + var6, SceneGraphTile.anInt2243);
        DummyClass47.method1317(var3, var6 + 15 + var4 + var7, 16, SceneGraphTile.anInt2243);
        DummyClass47.method1317(1 + var3, var6 + var4 - (-14 + -var7), 15,
          SceneGraphTile.anInt2243);
      }
  }

  public static void method225(int var0, Widget var1) {
    Widget var2 = FloorOverlay.method2273(var1, 123);
      if (var0 != 14) {
        TextureSampler24.method227(true);
      }

      int var3;
      int var4;
      if (var2 == null) {
        var4 = GroundItem.viewHeight;
        var3 = DummyClass30.viewWidth;
      } else {
        var4 = var2.anInt193;
        var3 = var2.anInt168;
      }

      Structure.method603(var4, 13987, var3, var1, false);
      FileTable.method1224(var1, var0 + 23716, var4, var3);
  }

  public static void method226(int var0, int var1) {
    if (~var0 != 0) {
        if (var1 <= 27) {
          TextureSampler24.method228(null, null, true);
        }

        if (MovedStatics0.method57(var0, 104)) {
          Widget[] var2 = SceneNode.aClass11ArrayArray1834[var0];

          for (int var3 = 0; var3 < var2.length; ++var3) {
            Widget var4 = var2[var3];
            if (var4.anObjectArray159 != null) {
              ClientScriptCall var5 = new ClientScriptCall();
              var5.arguments = var4.anObjectArray159;
              var5.aClass11_2449 = var4;
              ItemConfig.callScript((byte) -86, 2000000, var5);
            }
          }

        }
      }
  }

  public static void method227(boolean var0) {
    TextureSampler24.aClass94_3142 = null;
      TextureSampler24.aClass94_3145 = null;
      TextureSampler24.aCRC32_3143 = null;

      TextureSampler24.aClass94_3141 = null;
  }

  public static int method228(FileUnpacker var0, FileUnpacker var1, boolean var2) {
    int var3 = 0;
      if (var0.isLoaded(HintMarker.p11FontFileId)) {
        ++var3;
      }

      if (var0.isLoaded(SomethingTexture1.p12FontFileId)) {
        ++var3;
      }

      if (var0.isLoaded(TextureSampler1.b12FontFileId)) {
        ++var3;
      }

      if (var1.isLoaded(HintMarker.p11FontFileId)) {
        ++var3;
      }

      if (var2) {
        TextureSampler24.aClass94_3142 = null;
      }

      if (var1.isLoaded(SomethingTexture1.p12FontFileId)) {
        ++var3;
      }

      if (var1.isLoaded(TextureSampler1.b12FontFileId)) {
        ++var3;
      }

      return var3;
  }

}
