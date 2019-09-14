package com.jagex.runescape;

import com.jagex.runescape.opengl.DummyClass46;
import com.jagex.runescape.opengl.GlIndexedColorSprite;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlUtils;
import com.jagex.runescape.opengl.shader.MaterialShader5;
import com.jagex.runescape.opengl.Texture;

public final class TextureSampler36 extends AbstractTextureSampler {

  private static GameString aClass94_3428 = GameString.create(" more options");
  private static GameString aClass94_3437 = GameString.create("Attack");
  public static int anInt3422;
  public static int anInt3423;
  public static float diffuseIntensity;
  public static FileUnpacker animationSequences;
  public static byte[][][] floorUnderlayIds;
  public static GameString aClass94_3432 = GameString.create("Schrifts-=tze geladen)3");
  public static float aFloat3435;
  public static GameString aClass94_3436 = GameString.create("jaune:");
  public static GameString aClass94_3426 = TextureSampler36.aClass94_3428;
  public static GameString aClass94_3427 = TextureSampler36.aClass94_3437;
  private int[] anIntArray3425;
  private int anInt3431;
  private int anInt3433;
  private int anInt3434 = -1;

  public TextureSampler36() {
    super(0, false);
  }

  private boolean method339(boolean var1) {
    if (var1) {
        return true;
      } else if (this.anIntArray3425 == null) {
        if ((this.anInt3434 < 0)) {
          return false;
        } else {
          int var2 = SomethingLight0.anInt1559;
          int var3 = DummyClass55.anInt1427;
          int var4 = !DummyClass1.anInterface2_408.method14((byte) -104,
              this.anInt3434) ? 128 : 64;
          this.anIntArray3425 = DummyClass1.anInterface2_408.method16(64,
              this.anInt3434);
          this.anInt3433 = var4;
          this.anInt3431 = var4;
          TextureSampler33.method180(18, var3, var2);
          return this.anIntArray3425 != null;
        }
      } else {
        return true;
      }
  }

  public int method155(byte var1 ) {
    if (var1 != 19) {
        this.method155((byte) -60);
      }

      return this.anInt3434;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        TextureSampler36.animationSequences = null;
      }

      if (var1 == 0) {
        this.anInt3434 = var2.readUnsignedShort();
      }
  }

  public void method161(byte var1 ) {
    super.method161(var1);
      this.anIntArray3425 = null;
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        this.anInt3434 = 6;
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) -120, var2);
      if (this.triChromaticImageCache.aBoolean1379 && this.method339(false)) {
        int var4 = (this.anInt3433 != DummyClass55.anInt1427 ?
            this.anInt3433 * var2 / DummyClass55.anInt1427 :
          var2) * this.anInt3431;
        int[] var5 = var3[0];
        int[] var6 = var3[1];
        int[] var7 = var3[2];
        int var8;
        int var9;
        if ((SomethingLight0.anInt1559 == this.anInt3431)) {
          for (var8 = 0; var8 < SomethingLight0.anInt1559; ++var8) {
            var9 = this.anIntArray3425[var4++];
            var7[var8] = ClientScript.bitAnd(var9 << 4, 4080);
            var6[var8] = ClientScript.bitAnd(var9, '\uff00') >> 4;
            var5[var8] = ClientScript.bitAnd(var9, 16711680) >> 12;
          }
        } else {
          for (var8 = 0; var8 < SomethingLight0.anInt1559; ++var8) {
            var9 = this.anInt3431 * var8 / SomethingLight0.anInt1559;
            int var10 = this.anIntArray3425[var4 - -var9];
            var7[var8] = ClientScript.bitAnd(var10 << 4, 4080);
            var6[var8] = ClientScript.bitAnd('\uff00', var10) >> 4;
            var5[var8] = ClientScript.bitAnd(var10 >> 12, 4080);
          }
        }
      }

      return var3;
  }

  public static void method338(int var0, int var1, boolean var2, int var3, int var4, int var5) {
    ++BitVariable.anInt1127;
      DummyClass23.method1745(0);
      if (!var2) {
        SomethingInScenePacket202.method116(true, 670232012);
        TextureCache.method1611(71, true);
        SomethingInScenePacket202.method116(false, 670232012);
      }

      TextureCache.method1611(100, false);
      if (!var2) {
        TextureSampler32.updateProjectiles();
      }

      BufferObject.method2067(false);
      if (GlRenderer.useOpenGlRenderer) {
        DummyClass45.method1239(var4, 125, var5, var1, var3, true);
        var3 = DummyClass5.anInt2989;
        var5 = SomethingWorldMapy.anInt3564;
        var4 = HintMarker.anInt1358;
        var1 = GameCanvas.anInt31;
      }

      int var6;
      int var7;
      if (SomethingPacket116.anInt1753 == 1) {
        var7 = 2047 & StringNode.anInt2589 + SpotAnimationConfig.anInt531;
        var6 = AreaSoundEffect.anInt2309;
        if ((var6 < (SomethingTexture4.anInt2670 / 256))) {
          var6 = SomethingTexture4.anInt2670 / 256;
        }

        if (MaterialShader5.aBooleanArray2169[4]
          && SomethingIndex150.anIntArray2073[4] + 128 > var6) {
          var6 = 128 + SomethingIndex150.anIntArray2073[4];
        }

        StillGraphic.method1952(TextureSampler20.anInt3155, -1907397104, var1,
          BufferData.method1736(GameWorldSomething.currentPlane, 1,
            TextureCache.localPlayer.anInt2819, TextureCache.localPlayer.anInt2829) + -50,
          600 - -(var6 * 3), var7, FileTable.anInt942, var6);
      }

      if (var0 == -6403) {
        var7 = EnumStringFetcher.anInt2162;
        var6 = NPC.anInt3995;
        int var8 = DummyClass49.anInt1111;
        int var9 = DummyClass17.anInt1823;
        int var10 = TextureSampler28.anInt3315;

        int var11;
        int var12;
        for (var11 = 0; var11 < 5; ++var11) {
          if (MaterialShader5.aBooleanArray2169[var11]) {
            var12 = (int) ((-TextureSampler14.anIntArray3383[var11])
              + (TextureSampler14.anIntArray3383[var11] * 2 + 1) * Math.random() +
              Math.sin(DummyClass9.anIntArray4009[var11] * (
                TextureSampler3.anIntArray3359[var11] / 100.0D))
                * SomethingIndex150.anIntArray2073[var11]);
            if (var11 == 3) {
              TextureSampler28.anInt3315 = var12 + TextureSampler28.anInt3315 & 2047;
            }

            if ((var11 == 5 -1)) {
              DummyClass17.anInt1823 += var12;
              if (DummyClass17.anInt1823 < 128) {
                DummyClass17.anInt1823 = 128;
              }

              if ((DummyClass17.anInt1823 > 384 -1)) {
                DummyClass17.anInt1823 = 383;
              }
            }

            if ((var11 == 3 -1)) {
              DummyClass49.anInt1111 += var12;
            }

            if (var11 == 1) {
              EnumStringFetcher.anInt2162 += var12;
            }

            if (var11 == 0) {
              NPC.anInt3995 += var12;
            }
          }
        }

        Texture.method725(-118);
        if (GlRenderer.useOpenGlRenderer) {
          GlUtils.clip(var3, var5, var3 + var4, var5 - -var1);
          float var17 = DummyClass17.anInt1823 * 0.17578125F;
          float var16 = 0.17578125F * TextureSampler28.anInt3315;
          if (SomethingPacket116.anInt1753 == 3) {
            var17 = 360.0F * DummyClass52.aFloat1169 / 6.2831855F;
            var16 = DummyClass38.aFloat730 * 360.0F / 6.2831855F;
          }

          GlRenderer.method1844(var3, var5, var4, var1, var4 / 2 + var3, var5 - -(var1 / 2), var17,
            var16, HashTable.anInt1705, HashTable.anInt1705);
        } else {
          DummyClass47.method1324(var3, var5, var4 + var3, var1 + var5);
          DummyClass40.method1134();
        }

        if (!DummyClass36.aBoolean2615 && (NpcConfiguration.anInt1297 >= var3)
          && (NpcConfiguration.anInt1297 < (var4 + var3)) && var5 <= DummyClass36.anInt2612
          && (var1 + var5) > DummyClass36.anInt2612) {
          TextureSampler27.aBoolean3094 = true;
          MapScene.anInt59 = 0;
          var12 = Unsure.screenUpperX;
          int var13 = DummyClass3.screenUpperY;
          var11 = DummyClass17.screenLowerX;
          Structure.anInt3642 =
            var11 + (var12 - var11) * (-var3 + NpcConfiguration.anInt1297) / var4;
          int var14 = BlockConfig.screenLowerY;
          RenderAnimation.anInt384 =
            (-var13 + var14) * (DummyClass36.anInt2612 - var5) / var1 + var13;
        } else {
          TextureSampler27.aBoolean3094 = false;
          MapScene.anInt59 = 0;
        }

        DummyClass43.method1194(-16385);
        byte var19 = (DummyClass20.method1817((byte) 70) != 3 -1) ? 1 : (byte) BitVariable.anInt1127;
        if (GlRenderer.useOpenGlRenderer) {
          GlRenderer.method1846();
          GlRenderer.setDepthTestEnabled(true);
          boolean var18 = false;
          GlRenderer.setFogEnabled(true);
          if ((DummyClass15.state == 11 -1)) {
            var12 = GameBuffer.method809(DisplayMode.loopCycle, DummyClass49.anInt1111 >> 10,
              AbstractFileRequest.brightnessSetting, NPC.anInt3995 >> 10,
                -6403 + 6404);
          } else {
            var12 = GameBuffer.method809(DisplayMode.loopCycle,
              TextureCache.localPlayer.waypointsY[0] >> 3, AbstractFileRequest.brightnessSetting,
              TextureCache.localPlayer.waypointsX[0] >> 3, 1);
          }

          DummyClass46.method1269(AbstractGameWorld.updateCycle, !GameWorld.aBoolean2623);
          GlRenderer.clearBuffers(var12);
          GameException.method2285(DummyClass17.anInt1823, DummyClass49.anInt1111,
            EnumStringFetcher.anInt2162, NPC.anInt3995, false, TextureSampler28.anInt3315);
          GlRenderer.anInt1791 = AbstractGameWorld.updateCycle;
          AudioSomethingSomething.drawScene(NPC.anInt3995, EnumStringFetcher.anInt2162,
            DummyClass49.anInt1111, DummyClass17.anInt1823, TextureSampler28.anInt3315,
            AbstractImageProducer.aByteArrayArrayArray2008, FileCache.anIntArray686,
            MilliFrameRegulator.anIntArray2696, DummyClass13.anIntArray2021, Player.anIntArray3959,
            AnimationSequence.anIntArray1871, GameWorldSomething.currentPlane + 1, var19,
            TextureCache.localPlayer.anInt2819 >> 7, TextureCache.localPlayer.anInt2829 >> 7);
          DummyOutputStream.aBoolean47 = true;
          DummyClass46.disableLights();
          GameException.method2285(0, 0, 0, 0, false, 0);
          DummyClass43.method1194(-16385);
          HashTable.method1775();
          ProceduralTexture.method1405(var5, var4, var3, HashTable.anInt1705, var1,
            HashTable.anInt1705, -7397);
          DummyClass8.method2221(var4, var3, var1, true, HashTable.anInt1705, HashTable.anInt1705,
            var5);
        } else {
          DummyClass47.method1323(var3, var5, var4, var1, 0);
          AudioSomethingSomething.drawScene(NPC.anInt3995, EnumStringFetcher.anInt2162,
            DummyClass49.anInt1111, DummyClass17.anInt1823, TextureSampler28.anInt3315,
            AbstractImageProducer.aByteArrayArrayArray2008, FileCache.anIntArray686,
            MilliFrameRegulator.anIntArray2696, DummyClass13.anIntArray2021, Player.anIntArray3959,
            AnimationSequence.anIntArray1871, GameWorldSomething.currentPlane - -1, var19,
            TextureCache.localPlayer.anInt2819 >> 7, TextureCache.localPlayer.anInt2829 >> 7);
          DummyClass43.method1194(var0 + -9982);
          HashTable.method1775();
          ProceduralTexture.method1405(var5, var4, var3, 256, var1, 256, var0 + -994);
          DummyClass8.method2221(var4, var3, var1, true, 256, 256, var5);
        }

        ((TextureCache) DummyClass40.textureCache).update(true, DisplayMode.loopCycle);
        DummyClass45.method1235(var4, var5, var1, var3, (byte) -121);
        DummyClass17.anInt1823 = var9;
        DummyClass49.anInt1111 = var8;
        EnumStringFetcher.anInt2162 = var7;
        NPC.anInt3995 = var6;
        TextureSampler28.anInt3315 = var10;
        if (TextureSampler34.aBoolean3064 && DummyClass43.ondemandRequester.method1253(4) == 0) {
          TextureSampler34.aBoolean3064 = false;
        }

        if (TextureSampler34.aBoolean3064) {
          if (GlRenderer.useOpenGlRenderer) {
            GlUtils.fillQuad(var3, var5, var4, var1, 0);
          } else {
            DummyClass47.method1323(var3, var5, var4, var1, 0);
          }

          AbstractTextureSampler.drawLoadingBox(TextureSampler39.LOADING_PLEASE_WAIT, false);
        }

        if (!var2 && !TextureSampler34.aBoolean3064 && !DummyClass36.aBoolean2615
          && var3 <= NpcConfiguration.anInt1297 && var4 + var3 > NpcConfiguration.anInt1297
          && (var5 <= DummyClass36.anInt2612) && var1 + var5 > DummyClass36.anInt2612) {
          MaterialShader5.method1628(var5, var4, var1, var3, DummyClass36.anInt2612,
            NpcConfiguration.anInt1297, (byte) 97);
        }

      }
  }

  public static int method340(int var0, int var1) {
    int var2 = 74 % ((8 - var1) / 54);
      return var0 >>> 8;
  }

  public static void method341(byte var0) {
    TextureSampler36.aClass94_3428 = null;
      TextureSampler36.aClass94_3437 = null;
      TextureSampler36.aClass94_3427 = null;
      TextureSampler36.aClass94_3426 = null;
      TextureSampler36.aClass94_3432 = null;
      if (var0 > 66) {
        TextureSampler36.animationSequences = null;
        TextureSampler36.floorUnderlayIds = null;
        TextureSampler36.aClass94_3436 = null;
      }
  }

  public static ClientScriptEnum getEnum(int var0, boolean var1) {
    ClientScriptEnum var2 =
        (ClientScriptEnum) MilliFrameRegulator.aClass47_2686.get(var0, 1400);
      if (var2 != null) {
        return var2;
      } else {
        byte[] var3 = DummyClass38.aClass153_731.getBytes(DummyClass41.method1170((byte) 44, var0),
          GameBuffer.method810((byte) 3, var0));
        var2 = new ClientScriptEnum();
        if (!var1) {
          TextureSampler36.method344(-42, 33);
        }

        if (var3 != null) {
          var2.parseConfig(new Buffer(var3));
        }

        MilliFrameRegulator.aClass47_2686.put(var0, var2);
        return var2;
      }
  }

  public static AbstractIndexedColorSprite[] method343(int var0) {
    AbstractIndexedColorSprite[] var1 = new AbstractIndexedColorSprite[DummyClass53.spriteCount];

      for (int i = 0; i < DummyClass53.spriteCount; i++) {
        if (GlRenderer.useOpenGlRenderer) {
          var1[i] =
              new GlIndexedColorSprite(SomethingVolume15.anInt2426,
                  SomethingPacket116.anInt1748,
                  Something3dRoot.anIntArray2048[i], Buffer.anIntArray2591[i],
                  GroundItem.anIntArray2931[i],
                  TextureSampler26.anIntArray3076[i],
                  DummyClass5.aByteArrayArray2987[i],
                  TextureSampler38.anIntArray3446);
        } else {
          var1[i] = new SoftwareIndexedColorSprite(SomethingVolume15.anInt2426,
              SomethingPacket116.anInt1748, Something3dRoot.anIntArray2048[i],
              Buffer.anIntArray2591[i], GroundItem.anIntArray2931[i],
              TextureSampler26.anIntArray3076[i],
              DummyClass5.aByteArrayArray2987[i],
              TextureSampler38.anIntArray3446);
        }
      }

      if (var0 != 1854847236) {
        TextureSampler36.aClass94_3428 = null;
      }

      DummyClass37.method1035((byte) 113);
      return var1;
  }

  public static void method344(int var0, int var1) {
    if (var0 >= 0 && AudioStreamEncoder4.aBooleanArray3503.length > var0) {
        AudioStreamEncoder4.aBooleanArray3503[var0] = !AudioStreamEncoder4.aBooleanArray3503[var0];
        if (var1 != 4) {
          TextureSampler36.floorUnderlayIds = null;
        }

      }
  }

}
