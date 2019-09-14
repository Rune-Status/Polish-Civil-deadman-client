package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.opengl.DummyClass46;
import com.jagex.runescape.opengl.GlEnvironment;
import com.jagex.runescape.opengl.GlRenderer;

public final class AudioSomethingSomething extends Node {

  private static GameString aClass94_2525 = GameString
      .create("rating: ");
  public static GameString aClass94_2499 = GameString
      .create("Okay");
  public static int anInt2500;
  public static GZipDecompressor aClass49_2505 = new GZipDecompressor();
  public static GameString aClass94_2518 = GameString
      .create("Poser");
  public static byte[][] landscapesData;
  public static GameString aClass94_2524 =
      GameString.create("Starte 3D)2Softwarebibliothek)3");
  public static FileUnpacker fileUnpacker22;
  public static int anInt2529;
  public static GameString aClass94_2526 = AudioSomethingSomething.aClass94_2525;
  public int anInt2501;
  public int anInt2502;
  public int anInt2503;
  public SomethingIndex150 aClass166_2504;
  public int anInt2506;
  public AudioStreamEncoder1 aClass3_Sub24_Sub1_2507;
  public int anInt2508;
  public SomethingMusic0 aClass3_Sub12_Sub1_2509;
  public int anInt2510;
  public int anInt2511;
  public int anInt2512;
  public int anInt2513;
  public int anInt2514;
  public int anInt2515;
  public int anInt2516;
  public int anInt2517;
  public int anInt2519;
  public int anInt2520;
  public int anInt2522;
  public int anInt2523;
  public SomethingVolume15 aClass3_Sub15_2527;

  public void method401(int var1) {
    this.aClass166_2504 = null;
      this.aClass3_Sub12_Sub1_2509 = null;
      this.aClass3_Sub24_Sub1_2507 = null;
      this.aClass3_Sub15_2527 = null;
      if (var1 != 221) {
        AudioSomethingSomething.aClass94_2518 = null;
      }
  }

  public static void drawScene(int cameraX, int cameraY, int cameraZ, int pitch,
      int yaw,
      byte[][][] var5, int[] var6, int[] var7, int[] var8, int[] var9,
      int[] var10, int var11, byte var12, int var13, int var14) {
    if (cameraX < 0) {
      cameraX = 0;
    } else if (cameraX >= SocketStream.sceneWidth * 128) {
      cameraX = SocketStream.sceneWidth * 128 - 1;
    }

    if (cameraZ < 0) {
      cameraZ = 0;
    } else if (cameraZ >= TextureSampler17.sceneHeight * 128) {
      cameraZ = TextureSampler17.sceneHeight * 128 - 1;
    }

    DummyClass44.pitchSine = DummyClass40.SINE_TABLE[pitch];
    LinearHashTable.pitchCosine = DummyClass40.COSINE_TABLE[pitch];
    TextureSampler25.yawSine = DummyClass40.SINE_TABLE[yaw];
    TextureSampler20.yawCosine = DummyClass40.COSINE_TABLE[yaw];
    MilliFrameRegulator.cameraPosX = cameraX;
    ClientScriptEnum.cameraY = cameraY;
    TextureSampler13.cameraZ = cameraZ;
    TriChromaticImageCache.cameraTileX = cameraX / 128;
    TextureSampler7.cameraTileZ = cameraZ / 128;
    DummyClass9.viewportLowerX =
        TriChromaticImageCache.cameraTileX - TextureSampler8.viewportLength;
    if (DummyClass9.viewportLowerX < 0) {
      DummyClass9.viewportLowerX = 0;
    }

    AbstractObjectNode.viewportLowerZ =
        TextureSampler7.cameraTileZ - TextureSampler8.viewportLength;
    if (AbstractObjectNode.viewportLowerZ < 0) {
      AbstractObjectNode.viewportLowerZ = 0;
    }

    MapScene.viewportUpperX =
        TriChromaticImageCache.cameraTileX + TextureSampler8.viewportLength;
    if (MapScene.viewportUpperX > SocketStream.sceneWidth) {
      MapScene.viewportUpperX = SocketStream.sceneWidth;
    }

    SomethingTilek.viewportUpperZ =
        TextureSampler7.cameraTileZ + TextureSampler8.viewportLength;
    if (SomethingTilek.viewportUpperZ > TextureSampler17.sceneHeight) {
      SomethingTilek.viewportUpperZ = TextureSampler17.sceneHeight;
    }

    short far;
    if (GlRenderer.useOpenGlRenderer) {
      far = 3584;
    } else {
      far = 3500;
    }

    int offsetX;
    int offsetZ;
    for (
        offsetX = 0;
        offsetX
            < TextureSampler8.viewportLength + TextureSampler8.viewportLength
            + 2; offsetX++) {
      for (
          offsetZ = 0;
          offsetZ
              < TextureSampler8.viewportLength + TextureSampler8.viewportLength
              + 2; offsetZ++) {
        int sceneX =
            (offsetX - TextureSampler8.viewportLength << 7) - (
                MilliFrameRegulator.cameraPosX & 127);
        int sceneZ =
            (offsetZ - TextureSampler8.viewportLength << 7) - (
                TextureSampler13.cameraZ & 127);
        int sceneTileX =
            offsetX + TriChromaticImageCache.cameraTileX
                - TextureSampler8.viewportLength;
        int sceneTileZ = offsetZ + TextureSampler7.cameraTileZ
            - TextureSampler8.viewportLength;
        if (sceneTileX >= 0 && sceneTileZ >= 0
            && sceneTileX < SocketStream.sceneWidth
            && sceneTileZ < TextureSampler17.sceneHeight) {
          int lowerZ;
          if (AbstractObjectNode.othrrHeightMap != null) {
            lowerZ =
                AbstractObjectNode.othrrHeightMap[0][sceneTileX][sceneTileZ]
                    - ClientScriptEnum.cameraY + 128;
          } else {
            lowerZ =
                DummyClass43.somethingHeightMap[0][sceneTileX][sceneTileZ]
                    - ClientScriptEnum.cameraY
                    + 128;
          }

          int upperZ =
              DummyClass43.somethingHeightMap[3][sceneTileX][sceneTileZ]
                  - ClientScriptEnum.cameraY
                  - 1000;
          GZipDecompressor.tileOnScreen[offsetX][offsetZ] =
              CollisionMap.isOnScreen(sceneX, upperZ, lowerZ, sceneZ, far);
        } else {
          GZipDecompressor.tileOnScreen[offsetX][offsetZ] = false;
        }
      }
    }

    for (
        offsetX = 0;
        offsetX
            < TextureSampler8.viewportLength + TextureSampler8.viewportLength
            + 1; offsetX++) {
      for (
          offsetZ = 0;
          offsetZ
              < TextureSampler8.viewportLength + TextureSampler8.viewportLength
              + 1; offsetZ++) {
        DummyClass30.adjacentTileOnScreen[offsetX][offsetZ] =
            GZipDecompressor.tileOnScreen[offsetX][offsetZ]
                || GZipDecompressor.tileOnScreen[offsetX
                + 1][offsetZ] || GZipDecompressor.tileOnScreen[offsetX][offsetZ
                + 1]
                || GZipDecompressor.tileOnScreen[offsetX + 1][offsetZ + 1];
      }
    }

    TextureSampler6.anIntArray3045 = var6;
    FileCacheRequester.anIntArray1083 = var7;
    PlayerAppearance.anIntArray859 = var8;
    SomethingTexture4.anIntArray2663 = var9;
    DummyInputStream.anIntArray39 = var10;
    SomethingScene.method1294();
    if (SomethingIndex150.aClass3_Sub2ArrayArrayArray2065 != null) {
      DummyClass10.method2264(true);
      AbstractMouseWheel
          .drawScene(cameraX, cameraY, cameraZ, null, 0, (byte) 0, var13,
              var14);
      if (GlRenderer.useOpenGlRenderer) {
        TextureSampler23.aBoolean3207 = false;
        SomethingQuickChat.method551(0, 0, 0);
        GlEnvironment.setFogColor(null);
        DummyClass46.disableLights();
      }

      DummyClass10.method2264(false);
    }

    AbstractMouseWheel
        .drawScene(cameraX, cameraY, cameraZ, var5, var11, var12, var13, var14);
  }

  public static void method399(int var0) {
    if (var0 != 186) {
        AudioSomethingSomething.aClass94_2518 = null;
      }

      AudioSomethingSomething.aClass94_2525 = null;
      AudioSomethingSomething.landscapesData = null;
      AudioSomethingSomething.aClass94_2524 = null;
      AudioSomethingSomething.fileUnpacker22 = null;
      AudioSomethingSomething.aClass94_2526 = null;
      AudioSomethingSomething.aClass94_2499 = null;
      AudioSomethingSomething.aClass49_2505 = null;
      AudioSomethingSomething.aClass94_2518 = null;
  }

  public static void method400(long var0, int var2) {
    if (var2 != var0) {
        TextureSampler12.secureBuffer.writePacket(104);
        TextureSampler12.secureBuffer.writeLong(var0);
        ++DummyClass4.anInt3001;
      }
  }

  public static void initializeKeyTable() {
    if ((SignLink.aString1216.toLowerCase().indexOf("microsoft") == -1)) {
        if (SignLink.setFocusTraversalKeyEnabledMethod == null) {
          DummyClass26.keyTable[192] = 58;
          DummyClass26.keyTable[222] = 59;
        } else {
          DummyClass26.keyTable[222] = 58;
          DummyClass26.keyTable[192] = 28;
          DummyClass26.keyTable[520] = 59;
        }

        DummyClass26.keyTable[45] = 26;
        DummyClass26.keyTable[61] = 27;
        DummyClass26.keyTable[91] = 42;
        DummyClass26.keyTable[59] = 57;
        DummyClass26.keyTable[93] = 43;
        DummyClass26.keyTable[44] = 71;
        DummyClass26.keyTable[92] = 74;
        DummyClass26.keyTable[46] = 72;
        DummyClass26.keyTable[47] = 73;
      } else {
        DummyClass26.keyTable[187] = 27;
        DummyClass26.keyTable[223] = 28;
        DummyClass26.keyTable[221] = 43;
        DummyClass26.keyTable[188] = 71;
        DummyClass26.keyTable[222] = 59;
        DummyClass26.keyTable[192] = 58;
        DummyClass26.keyTable[191] = 73;
        DummyClass26.keyTable[219] = 42;
        DummyClass26.keyTable[190] = 72;
        DummyClass26.keyTable[186] = 57;
        DummyClass26.keyTable[220] = 74;
        DummyClass26.keyTable[189] = 26;
      }
  }

  public static SomethingTexture4 method404(byte var0, Buffer var1) {
    return var0 > -55 ?
          null :
          new SomethingTexture4(var1.method787((byte) 93),
              var1.method787((byte) 55),
              var1.method787((byte) 81), var1.method787((byte) 95),
              var1.readUnsignedMedium((byte) 124),
              var1.readUnsignedMedium((byte) 120), var1.readUnsignedByte());
  }

}
