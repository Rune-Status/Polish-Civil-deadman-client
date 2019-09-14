package com.jagex.runescape;

import com.jagex.runescape.opengl.GlIndexedColorSprite;
import com.jagex.runescape.opengl.GlRenderer;
import java.util.Objects;

public final class SomethingIndex150 {

  public static SceneGraphTile[][][] aClass3_Sub2ArrayArrayArray2065;
  public static int[] anIntArray2068 = new int[50];
  public static AnimationSomething[] aClass3_Sub28_Sub5Array2070 = new AnimationSomething[14];
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array2072;
  public static int[] anIntArray2073 = new int[5];
  public static GameString aClass94_2074 = GameString.create("; version=1; path=)4; domain=");
  public static GameString RECTANGLE_DEBUG_EQ = GameString.create("rect_debug=");
  public static int anInt2079;
  public static GameString aClass94_2080 = GameString.create("(U2");
  public static int anInt2081;
  public int anInt2063;
  public byte[] aByteArray2064;
  public int anInt2066;
  public int anInt2067;
  public int anInt2069;
  public int anInt2071;
  public byte[] aByteArray2076;
  public int anInt2077;
  public int anInt2078;

  public static void method2255(byte var0) {
    SomethingIndex150.anIntArray2073 = null;
      SomethingIndex150.aClass3_Sub2ArrayArrayArray2065 = null;
      SomethingIndex150.aClass94_2080 = null;
      SomethingIndex150.RECTANGLE_DEBUG_EQ = null;

      SomethingIndex150.anIntArray2068 = null;
      SomethingIndex150.aClass3_Sub28_Sub5Array2070 = null;
      SomethingIndex150.aClass3_Sub28_Sub16Array2072 = null;
      SomethingIndex150.aClass94_2074 = null;
  }

  public static boolean method2256(int var0, int var1, int var2, int var3) {
    if (FileSystem.method846(var0, var1, var2)) {
      int var4 = var1 << 7;
      int var5 = var2 << 7;
      return
          TextureSampler10.method349(var4 + 1,
              AbstractGameWorld.heightMap[var0][var1][var2] + var3,
              var5 + 1) && TextureSampler10.method349(var4 + 128 - 1,
              AbstractGameWorld.heightMap[var0][var1 + 1][var2] + var3,
              var5 + 1)
              && TextureSampler10.method349(var4 + 128 - 1,
              AbstractGameWorld.heightMap[var0][var1 + 1][var2 + 1] + var3,
              var5 + 128 - 1)
              && TextureSampler10.method349(var4 + 1,
              AbstractGameWorld.heightMap[var0][var1][var2 + 1] + var3,
              var5 + 128 - 1);
    } else {
      return false;
    }
  }

  public static void method2257(int var0) {
    if (var0 < 60) {
        SomethingIndex150.aClass3_Sub28_Sub16Array2072 = null;
      }

      DummyClass8.aClass93_4015.method1524(3);
  }

  public static void method2258(int var0, int var1, GameString var2) {
    GameString var3 = Objects.requireNonNull(var2.method1579(-17)).formatName((byte) -50);
      boolean var4 = false;

      for (int var5 = var1; ~var5 > ~DummyClass13.anInt2022; ++var5) {
        Player var6 = TextureSampler0.players[DummyClass42.anIntArray887[var5]];
        if (var6 != null && var6.name != null && var6.name.method1531(var3)) {
          var4 = true;
          Parameter.method582(TextureCache.localPlayer.waypointsY[0], 0, 1, false, 0, 2,
            var6.waypointsX[0], 1, 0, 2, var6.waypointsY[0],
            TextureCache.localPlayer.waypointsX[0]);
          if (var0 == 1) {
            ++ItemConfig.anInt759;
            TextureSampler12.secureBuffer.writePacket(68);
            TextureSampler12.secureBuffer.method765(DummyClass42.anIntArray887[var5], (byte) 3);
          } else if (var0 != 4) {
            if (var0 == 5) {
              TextureSampler12.secureBuffer.writePacket(4);
              TextureSampler12.secureBuffer.writeShortLE(var1 + -1,
                  DummyClass42.anIntArray887[var5]);
              ++SocketStream.anInt1240;
            } else {
              if (~var0 == -7) {
                TextureSampler12.secureBuffer.writePacket(133);
                TextureSampler12.secureBuffer
                    .writeShortLE(-1, DummyClass42.anIntArray887[var5]);
                ++AudioStreamEncoder4.anInt3517;
              } else {
                if (~var0 == -8) {
                  ++DummyClass29.anInt437;
                  TextureSampler12.secureBuffer.writePacket(114);
                  TextureSampler12.secureBuffer
                      .method765(DummyClass42.anIntArray887[var5],
                          (byte) 3);
                }
              }
            }
          } else {
            ++Keyboard.anInt1910;
            TextureSampler12.secureBuffer.writePacket(180);
            TextureSampler12.secureBuffer.method765(DummyClass42.anIntArray887[var5], (byte) 3);
          }
          break;
        }
      }

      if (!var4) {
        GameBuffer.printMessage(GroundItemNode.EMPTY_STRING, 0,
          RenderAnimation.concat(new GameString[] {Light.aClass94_691, var3}), -1);
      }
  }

  public static AbstractIndexedColorSprite createIndexedColorSprite() {
    AbstractIndexedColorSprite var1;
      if (GlRenderer.useOpenGlRenderer) {
        var1 = new GlIndexedColorSprite(SomethingVolume15.anInt2426, SomethingPacket116.anInt1748,
          Something3dRoot.anIntArray2048[0], Buffer.anIntArray2591[0], GroundItem.anIntArray2931[0],
          TextureSampler26.anIntArray3076[0], DummyClass5.aByteArrayArray2987[0],
          TextureSampler38.anIntArray3446);
      } else {
        var1 =
          new SoftwareIndexedColorSprite(SomethingVolume15.anInt2426, SomethingPacket116.anInt1748,
            Something3dRoot.anIntArray2048[0], Buffer.anIntArray2591[0],
            GroundItem.anIntArray2931[0], TextureSampler26.anIntArray3076[0],
            DummyClass5.aByteArrayArray2987[0], TextureSampler38.anIntArray3446);
      }
      DummyClass37.method1035((byte) 116);
      return var1;
  }

  public static void method2260(int var0, int var1) {
    TextureSampler25.aClass93_3412.method1522(var0 + 919, var1);
      if (var0 == -1045) {
        TextureSampler2.aClass93_3369.method1522(-1045 ^ 1130, var1);
      }
  }

}
