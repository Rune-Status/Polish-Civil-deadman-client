package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;

public final class TextureSampler26 extends AbstractTextureSampler {

  public static Deque aClass61_3075 = new Deque();
  public static int[] anIntArray3076;
  public static FileUnpacker maps;
  public static boolean focused;
  public static GameString aClass94_3079 = GameString.create("Examiner");
  public static GameString aClass94_3080 = DummyClass53.method1586(23161, 160);
  public static int anInt3081;
  public static int[] anIntArray3082 = new int[100];
  public static int[] anIntArray3083 = new int[50];
  public static int anInt3084;
  private int anInt3073;
  private int anInt3074 = 4096;


  public TextureSampler26() {
    super(1, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int var3 = 69 / ((var2 - 30) / 36);
      int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var5 = this.method152(0, var1, 32755);

        for (int var6 = 0; var6 < SomethingLight0.anInt1559; ++var6) {
          int var7 = var5[var6];
          var4[var6] = ~this.anInt3073 >= ~var7 && ~var7 >= ~this.anInt3074 ? 4096 : 0;
        }
      }

      return var4;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        TextureSampler26.method196(true);
      }

      if (~var1 == -1) {
        this.anInt3073 = var2.readUnsignedShort();
      } else {
        if (var1 == 1) {
          this.anInt3074 = var2.readUnsignedShort();
        }
      }
  }

  public static void method195(int var0) {
    int var1 = (NPC.anInt3995 >> 10) - -(WorldMapLabel.anInt1716 >> 3);
      int var2 = (DummyClass49.anInt1111 >> 10) - -(ProceduralTexture.anInt1152 >> 3);
      if (var0 == 20479) {
        byte var3 = 0;
        byte var4 = 8;
        byte var6 = 18;
        AudioSomethingSomething.landscapesData = new byte[var6][];
        AnimationSomething.updatedLandscapeIds = new int[var6];
        TextureSampler35.aByteArrayArray3335 = new byte[var6][];
        GameClient.mapFileIds = new int[var6];
        AreaSoundEffect.landscapeEncryptionKeys = new int[var6][4];
        GroundItemNode.updatedMapsData = new byte[var6][];
        AudioStreamEncoder3.regionHashes = new int[var6];
        Something3d2.aByteArrayArray3027 = new byte[var6][];
        TextureSampler5.anIntArray3290 = new int[var6];
        TextureSampler17.updatedMapIds = new int[var6];
        DummyClass55.landscapeFileIds = new int[var6];
        byte var5 = 8;
        TextureSampler34.updatedLandscapesData = new byte[var6][];
        int var11 = 0;

        int var7;
        for (var7 = (-6 + var1) / 8; ~var7 >= ~((6 + var1) / 8); ++var7) {
          for (int var8 = (-6 + var2) / 8; ~((var2 + 6) / 8) <= ~var8; ++var8) {
            int var9 = (var7 << 8) - -var8;
            AudioStreamEncoder3.regionHashes[var11] = var9;
            GameClient.mapFileIds[var11] = TextureSampler26.maps.getFileId(RenderAnimation.concat(new GameString[] {
              GameBuffer.MAP_PREFIX, SomethingScene.toString(var7), TextureSampler31.UNDERSCORE,
              SomethingScene.toString(var8)
            }));
            DummyClass55.landscapeFileIds[var11] =
                TextureSampler26.maps.getFileId(RenderAnimation.concat(new GameString[] {
                DummyClass12.LANDSCAPE_PREFIX, SomethingScene.toString(var7),
                TextureSampler31.UNDERSCORE, SomethingScene.toString(var8)
              }));
            TextureSampler5.anIntArray3290[var11] =
                TextureSampler26.maps.getFileId(RenderAnimation.concat(new GameString[] {
                DummyCanvas.aClass94_26, SomethingScene.toString(var7), TextureSampler31.UNDERSCORE,
                SomethingScene.toString(var8)
              }));
            TextureSampler17.updatedMapIds[var11] =
                TextureSampler26.maps.getFileId(RenderAnimation.concat(new GameString[] {
                DummyClass53.UM_PREFIX, SomethingScene.toString(var7), TextureSampler31.UNDERSCORE,
                SomethingScene.toString(var8)
              }));
            AnimationSomething.updatedLandscapeIds[var11] =
                TextureSampler26.maps.getFileId(RenderAnimation.concat(new GameString[] {
                DummyClass10.UL_PREFIX, SomethingScene.toString(var7), TextureSampler31.UNDERSCORE,
                SomethingScene.toString(var8)
              }));
            if (~TextureSampler5.anIntArray3290[var11] == 0) {
              GameClient.mapFileIds[var11] = -1;
              DummyClass55.landscapeFileIds[var11] = -1;
              TextureSampler17.updatedMapIds[var11] = -1;
              AnimationSomething.updatedLandscapeIds[var11] = -1;
            }

            ++var11;
          }
        }

        for (var7 = var11; ~var7 > ~TextureSampler5.anIntArray3290.length; ++var7) {
          TextureSampler5.anIntArray3290[var7] = -1;
          GameClient.mapFileIds[var7] = -1;
          DummyClass55.landscapeFileIds[var7] = -1;
          TextureSampler17.updatedMapIds[var7] = -1;
          AnimationSomething.updatedLandscapeIds[var7] = -1;
        }

        FileCacheRequester.rebuildScene(var3, var2, var1, var5, true, var4, true);
      }
  }

  public static void method196(boolean var0) {
    FileCache.aClass93_684.method1523((byte) -117);
      DummyClass5.aClass93_2984.method1523((byte) -111);
      if (var0) {
        TextureSampler26.anIntArray3083 = null;
      }
  }

  public static void method197(int var0) {
    TextureSampler26.aClass94_3079 = null;
      TextureSampler26.anIntArray3076 = null;
      TextureSampler26.aClass61_3075 = null;
      TextureSampler26.anIntArray3082 = null;
      TextureSampler26.aClass94_3080 = null;
      if (var0 == 1) {
        TextureSampler26.anIntArray3083 = null;
        TextureSampler26.maps = null;
      }
  }

  public static void method198(boolean var0, int var1) {
    if (var1 != -32624) {
        TextureSampler26.method196(true);
      }

      int var3 = Something3d2.aByteArrayArray3027.length;
      byte[][] var2;
      if (GlRenderer.useOpenGlRenderer && var0) {
        var2 = TextureSampler34.updatedLandscapesData;
      } else {
        var2 = AudioSomethingSomething.landscapesData;
      }

      for (int var4 = 0; var4 < var3; ++var4) {
        byte[] var5 = var2[var4];
        if (var5 != null) {
          int var6 = -WorldMapLabel.anInt1716 + 64 * (AudioStreamEncoder3.regionHashes[var4] >> 8);
          int var7 =
            (AudioStreamEncoder3.regionHashes[var4] & 255) * 64 + -ProceduralTexture.anInt1152;
          DummyClass43.method1194(var1 + 16239);
          SomethingVolume15.method374(var6, var0, var5, var7, 0, BlockConfig.collisionMaps);
        }
      }
  }

  public static void method199(int var0, int var1, int var2, int var3) {
    if (var3 != -799) {
        TextureSampler26.focused = true;
      }

      if ((ClientScriptCall.anInt2453 != 1 -1)
          && var0 != 0 && ~SomethingLight0.anInt1552 > -51
        && ~var1 != 0) {
        Inventory.anIntArray2550[SomethingLight0.anInt1552] = var1;
        SomethingIndex150.anIntArray2068[SomethingLight0.anInt1552] = var0;
        GameString.anIntArray2157[SomethingLight0.anInt1552] = var2;
        TextureCache.aClass135Array2131[SomethingLight0.anInt1552] = null;
        TextureSampler26.anIntArray3083[SomethingLight0.anInt1552] = 0;
        ++SomethingLight0.anInt1552;
      }
  }

}
