package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.GlUtils;
import java.util.Random;
import java.util.zip.Inflater;

public final class GZipDecompressor {

  public static AbstractDirectColorSprite aClass3_Sub28_Sub16_812;
  public static boolean[][] tileOnScreen;
  public static int anInt815;
  public static int anInt816;
  public static int anInt817;
  public static Cache aClass47_818 = new Cache(64);
  public static int anInt819;
  private Inflater anInflater813;

  public GZipDecompressor() {
    this(-1, 1000000, 1000000);
  }

  private GZipDecompressor(int var1, int var2, int var3) {
  }

  public void decompress(byte[] var1, Buffer var2, boolean var3) {
    if (var3) {
        GZipDecompressor.anInt815 = -81;
      }

      if (var2.bytes[var2.position] == 31
          && var2.bytes[var2.position + 1] == -117) {
        if (this.anInflater813 == null) {
          this.anInflater813 = new Inflater(true);
        }

        try {
          this.anInflater813.setInput(var2.bytes, var2.position + 10,
              -8 - (10 + var2.position) + var2.bytes.length);
          this.anInflater813.inflate(var1);
        } catch (Exception var5) {
          this.anInflater813.reset();
          throw new RuntimeException("Invalid GZIP compressed data!");
        }

        this.anInflater813.reset();
      } else {
        throw new RuntimeException("Invalid GZIP header!");
      }
  }

  public static void method1121(boolean var0, byte var1) {
    byte var2;
      byte[][] var3;
      if (GlRenderer.useOpenGlRenderer && var0) {
        var2 = 1;
        var3 = GroundItemNode.updatedMapsData;
      } else {
        var3 = Something3d2.aByteArrayArray3027;
        var2 = 4;
      }

      for (int var4 = 0; (var4 < var2); ++var4) {
        DummyClass43.method1194(-16385);

        for (int var5 = 0; (var5 < 13); ++var5) {
          for (int var6 = 0; (var6 < 13); ++var6) {
            int var8 = GameObjectConfig.anIntArrayArrayArray1497[var4][var5][var6];
            boolean var7 = false;
            if ((var8 != -1)) {
              int var9 = var8 >> 24 & 3;
              if (!var0 || var9 == 0) {
                int var12 = 2047 & var8 >> 3;
                int var10 = var8 >> 1 & 3;
                int var11 = 1023 & var8 >> 14;
                int var13 = (var11 / 8 << 8) + var12 / 8;

                for (int var14 = 0;
                    AudioStreamEncoder3.regionHashes.length > var14;
                    ++var14) {
                  if ((AudioStreamEncoder3.regionHashes[var14] == var13)
                      && var3[var14] != null) {
                    MovedStatics0.method60(var10, 8 * var5, var4,
                        BlockConfig.collisionMaps,
                        var6 * 8, (byte) -100, var3[var14], var9,
                        (var12 & 7) * 8, 8 * (var11 & 7),
                        var0);
                    var7 = true;
                    break;
                  }
                }
              }
            }

            if (!var7) {
              SomethingSceneJ
                  .method870(var4, (byte) 84, 8 * var6, var5 * 8, 8, 8);
            }
          }
        }
      }

      if (var1 <= 49) {
        GZipDecompressor.anInt817 = 32;
      }
  }

  public static Widget method1122(int var0, Widget var1) {
    if (var0 != 0) {
        GZipDecompressor.method1123(103, 118);
      }

      Widget var2 = GameClient.method42(var1);
      if (var2 == null) {
        var2 = var1.aClass11_302;
      }

      return var2;
  }

  public static byte[] method1123(int var0, int var1) {
    ByteArrayNode var2 =
          (ByteArrayNode) SceneSomething.aClass47_480
              .get(var1, var0 + -16710535);
      if (var2 == null) {
        Random var4 = new Random(var1);
        byte[] var3 = new byte[512];

        int var5;
        for (var5 = 0; (var5 < 255); ++var5) {
          var3[var5] = (byte) var5;
        }

        for (var5 = 0; (var5 < 255); ++var5) {
          int var6 = 255 - var5;
          int var7 = FloorUnderlay.method1603((byte) 125, var6, var4);
          byte var8 = var3[var7];
          var3[var7] = var3[var6];
          var3[var6] = var3[511 + -var5] = var8;
        }

        var2 = new ByteArrayNode(var3);
        SceneSomething.aClass47_480.put(var1, var2);
      }

      return var0 != 16711935 ? null : var2.aByteArray3612;
  }

  public static GameString method1124(int[] var0, long var1, int var3,
      boolean var4) {
    if (var4) {
        return null;
      } else {
        if (DummyClass43.anInterface4_915 != null) {
          GameString var5 = DummyClass43.anInterface4_915
              .method20(var3, var0, 4936, var1);
          if (var5 != null) {
            return var5;
          }
        }

        return InventoryConfig.method612(var1, (byte) 124);
      }
  }

  public static void reportError(String var0, Throwable var1, byte var2) {
    if (var2 <= 100) {
      GZipDecompressor.aClass47_818 = null;
    }
    var1.printStackTrace();
  }

  public static void method1126(int var0, int var1) {
    WidgetUpdate var2 = AudioStreamEncoder3.method466(4, 2, var1);
      int var3 = -67 % ((var0 - -37) / 48);
      var2.createIndexedColorSprite(true);
  }

  public static void method1127(int var0) {
    if (!DummyClass36.aBoolean2615) {
        if (ClientScriptEnum.anInt3660 != 0) {
          NpcConfiguration.anInt1297 = TextureSampler8.anInt3460;
          DummyClass36.anInt2612 = FloorOverlay.anInt2099;
        } else if (Structure.anInt3644 == 0) {
          NpcConfiguration.anInt1297 = SomethingTilek.anInt1676;
          DummyClass36.anInt2612 = HashTable.anInt1709;
        } else {
          NpcConfiguration.anInt1297 = DummyClass5.anInt2993;
          DummyClass36.anInt2612 = DummyClass36.anInt2614;
        }

        TextureSampler25.amountContextActions = 1;
        GroundItem.aClass94Array2935[0] = DummyClass12.aClass94_2031;
        DummyClass8.aClass94Array4016[0] = GroundItemNode.EMPTY_STRING;
        TextureSampler27.aShortArray3095[0] = 1005;
        MonoChromaticImageCache.anIntArray1578[0] = AnimationSomething.anInt3590;
      }

      if ((InventoryConfig.anInt3655 != -1)) {
        PlayerAppearance.method1160(-113, InventoryConfig.anInt3655);
      }

      if (var0 == 0) {
        int var1;
        for (var1 = 0; var1 < SomethingWorldMapy.widgetQuads; ++var1) {
          if (GroundItemNode.aBooleanArray3674[var1]) {
            DummyClass9.aBooleanArray4008[var1] = true;
          }

          HashTable.aBooleanArray1712[var1] = GroundItemNode.aBooleanArray3674[var1];
          GroundItemNode.aBooleanArray3674[var1] = false;
        }

        AbstractDirectColorSprite.aClass11_3708 = null;
        DummyClass41.anInt865 = -1;
        SubNode.anInt2567 = -1;
        DummyClass54.aClass11_1402 = null;
        if (GlRenderer.useOpenGlRenderer) {
          DummyOutputStream.aBoolean47 = true;
        }

        SomethingOtherWorldMap.anInt2535 = AbstractGameWorld.updateCycle;
        if ((InventoryConfig.anInt3655 != -1)) {
          SomethingWorldMapy.widgetQuads = 0;
          FileSystem.method841(true);
        }

        if (GlRenderer.useOpenGlRenderer) {
          GlUtils.resetClip();
        } else {
          DummyClass47.method1331();
        }

        FloorOverlay.method2278(122);
        if (DummyClass36.aBoolean2615) {
          if (FileUnpacker.aBoolean1951) {
            ISAACCipher.method1230((byte) 116);
          } else {
            DummyClass51.method1419(-117);
          }
        } else if (AbstractDirectColorSprite.aClass11_3708 == null) {
          if ((DummyClass41.anInt865 != -1)) {
            IdentityKit
                .method950(null, -86, SubNode.anInt2567, DummyClass41.anInt865);
          }
        } else {
          IdentityKit.method950(AbstractDirectColorSprite.aClass11_3708, -120,
              GameException.anInt2115, TextureSampler18.anInt4041);
        }

        var1 = DummyClass36.aBoolean2615 ? -1
            : TextureSampler22.method335(var0 + 16859);
        if (var1 == -1) {
          var1 = DummyClass12.anInt2027;
        }

        TextureSampler20.method229(var1, 20827);
        if ((ClientScriptCall.anInt2440 == 1)) {
          ClientScriptCall.anInt2440 = 2;
        }

        if (GameObjectConfig.anInt1521 == 1) {
          GameObjectConfig.anInt1521 = 2;
        }

        if ((ClientScript.rectangleDebugType == 3)) {
          for (int var2 = 0; (var2 < SomethingWorldMapy.widgetQuads); ++var2) {
            if (!HashTable.aBooleanArray1712[var2]) {
              if (DummyClass9.aBooleanArray4008[var2]) {
                if (GlRenderer.useOpenGlRenderer) {
                  GlUtils.fillQuad(AbstractAudioOutputStream.quadx0[var2],
                      Player.quady0[var2],
                      GlTexture2d.quadx1[var2], Mobile.quady1[var2], 0xff0000,
                      0x80);
                } else {
                  DummyClass47
                      .method1312(AbstractAudioOutputStream.quadx0[var2],
                          Player.quady0[var2], GlTexture2d.quadx1[var2],
                          Mobile.quady1[var2], 0xff0000,
                          0x80);
                }
              }
            } else if (!GlRenderer.useOpenGlRenderer) {
              DummyClass47.method1312(AbstractAudioOutputStream.quadx0[var2],
                  Player.quady0[var2],
                  GlTexture2d.quadx1[var2], Mobile.quady1[var2], 16711935, 128);
            } else {
              GlUtils.fillQuad(AbstractAudioOutputStream.quadx0[var2],
                  Player.quady0[var2],
                  GlTexture2d.quadx1[var2], Mobile.quady1[var2], 16711935, 128);
            }
          }
        }

        Deque.method1214(DisplayMode.loopCycle,
            TextureCache.localPlayer.anInt2819,
            TextureCache.localPlayer.anInt2829, GameWorldSomething.currentPlane,
            1);
        DisplayMode.loopCycle = 0;
      }
  }

  public static void method1129(int var0, int var1, int var2, int var3,
      int var4) {
    int var5 = var3;
      int var6 = var2;
      int var7 = -var2;
      int var8 = -1;
      int var9 = DummyClass59
          .method1040(GlTexture2d.anInt3765, var2 + var4, (byte) 0,
              DummyClass55.anInt1425);
      int var10 = DummyClass59
          .method1040(GlTexture2d.anInt3765, var4 - var2, (byte) 0,
              DummyClass55.anInt1425);
      TextureSampler18
          .method282(DummyClass35.anIntArrayArray663[var1], var10, -98, var9,
              var0);

      while ((var5 < var6)) {
        var8 += 2;
        var7 += var8;
        int var11;
        int var12;
        int var13;
        int var14;
        if (var7 > 0) {
          --var6;
          var11 = -var6 + var1;
          var7 -= var6 << 1;
          var12 = var1 + var6;
          if (var12 >= DummyClass13.anInt2020
              && var11 <= LightIntensity.anInt902) {
            var13 = DummyClass59
                .method1040(GlTexture2d.anInt3765, var4 - -var5, (byte) 0,
                    DummyClass55.anInt1425);
            var14 = DummyClass59
                .method1040(GlTexture2d.anInt3765, -var5 + var4, (byte) 0,
                    DummyClass55.anInt1425);
            if (LightIntensity.anInt902 >= var12) {
              TextureSampler18
                  .method282(DummyClass35.anIntArrayArray663[var12], var14,
                      var3 ^ 111,
                      var13, var0);
            }

            if (DummyClass13.anInt2020 <= var11) {
              TextureSampler18
                  .method282(DummyClass35.anIntArrayArray663[var11], var14, -84,
                      var13,
                      var0);
            }
          }
        }

        ++var5;
        var11 = -var5 + var1;
        var12 = var5 + var1;
        if (var12 >= DummyClass13.anInt2020
            && (LightIntensity.anInt902 >= var11)) {
          var13 = DummyClass59
              .method1040(GlTexture2d.anInt3765, var4 - -var6, (byte) 0,
                  DummyClass55.anInt1425);
          var14 = DummyClass59
              .method1040(GlTexture2d.anInt3765, -var6 + var4, (byte) 0,
                  DummyClass55.anInt1425);
          if (var12 <= LightIntensity.anInt902) {
            TextureSampler18
                .method282(DummyClass35.anIntArrayArray663[var12], var14, 90,
                    var13,
                    var0);
          }

          if (var11 >= DummyClass13.anInt2020) {
            TextureSampler18
                .method282(DummyClass35.anIntArrayArray663[var11], var14, -103,
                    var13,
                    var0);
          }
        }
      }
  }

  public static void method1130(int var0) {
    GZipDecompressor.aClass3_Sub28_Sub16_812 = null;
      if (var0 < 54) {
        GZipDecompressor.anInt819 = -109;
      }

      GZipDecompressor.aClass47_818 = null;
      GZipDecompressor.tileOnScreen = null;
  }

}
