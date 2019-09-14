package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.node.Node;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlTexture2d;
import com.jagex.runescape.opengl.SomethingGl0;

public final class SpawnedGameObject extends Node {

  public static int anInt2249;
  public static int anInt2251;
  public static GameString aClass94_2252 = GameStringStatics.create("Atteindre");
  public static GameString aClass94_2255 = GameStringStatics.create("Suche nach Updates )2 ");
  public static FileUnpacker fileUnpacker25;
  public static GameString aClass94_2260 = GameStringStatics.create("Lade Wordpack )2 ");
  public int anInt2248;
  public int anInt2250;
  public int anInt2253;
  public int anInt2254;
  public int anInt2256;
  public int anInt2257;
  public int aliveTime = -1;
  public int anInt2261;
  public int anInt2262;
  public int anInt2263;
  public int anInt2264;
  public int anInt2265;


  public static int method107(FileUnpacker var0, byte var1) {
    int var2 = 0;
      if (var0.isLoaded(FloorOverlay.anInt2104)) {
        ++var2;
      }

      if (var0.isLoaded(TextureSampler18.anInt4042)) {
        ++var2;
      }

      if (var0.isLoaded(GlobalStatics_1.anInt2195)) {
        ++var2;
      }

      if (var0.isLoaded(GlobalStatics_2.anInt2575)) {
        ++var2;
      }

      if (var0.isLoaded(RenderAnimation.headIconsPrayerFileId)) {
        ++var2;
      }

      if (var0.isLoaded(TextureSampler3.hintHeadIconsFileId)) {
        ++var2;
      }

      if (var0.isLoaded(MilliFrameRegulator.anInt2689)) {
        ++var2;
      }

      if (var1 > -124) {
        SpawnedGameObject.method109(68);
      }

      if (var0.isLoaded(TextureSampler34.anInt3061)) {
        ++var2;
      }

      if (var0.isLoaded(SomethingTexture.anInt2633)) {
        ++var2;
      }

      if (var0.isLoaded(DummyClass59.anInt678)) {
        ++var2;
      }

      if (var0.isLoaded(SomethingVolume15.anInt2436)) {
        ++var2;
      }

      if (var0.isLoaded(GlTexture2d.anInt3757)) {
        ++var2;
      }

      if (var0.isLoaded(DummyClass38.floorShadowsFileId)) {
        ++var2;
      }

      if (var0.isLoaded(ObjectCache.anInt1325)) {
        ++var2;
      }

      if (var0.isLoaded(IntegerNode.anInt2471)) {
        ++var2;
      }

      return var2;
  }

  public static void method109(int var0) {
    SpawnedGameObject.aClass94_2255 = null;
      SpawnedGameObject.aClass94_2260 = null;
      SpawnedGameObject.aClass94_2252 = null;
      if (var0 != 2) {
        SpawnedGameObject.method109(-22);
      }

      SpawnedGameObject.fileUnpacker25 = null;
  }

  public static void initializeScene(int planes, int sceneWidth, int sceneHeight, int viewportLength,
                                    boolean var4) {
    SocketStream.sceneWidth = sceneWidth;
    TextureSampler17.sceneHeight = sceneHeight;
    GLStatics.viewportLength = viewportLength;
    OndemandFileRequest.tiles =
      new SceneGraphTile[planes][SocketStream.sceneWidth][TextureSampler17.sceneHeight];
    DummyClass43.somethingHeightMap =
      new int[planes][SocketStream.sceneWidth + 1][TextureSampler17.sceneHeight + 1];
    if (GlRenderer.useOpenGlRenderer) {
      GLStatics.aClass3_Sub11ArrayArray2199 = new SomethingGl0[4][];
    }

    if (var4) {
      SomethingIndex150.aClass3_Sub2ArrayArrayArray2065 =
        new SceneGraphTile[1][SocketStream.sceneWidth][TextureSampler17.sceneHeight];
      TextureSampler16.anIntArrayArray3115 =
        new int[SocketStream.sceneWidth][TextureSampler17.sceneHeight];
      GlobalStatics_2.othrrHeightMap =
        new int[1][SocketStream.sceneWidth + 1][TextureSampler17.sceneHeight + 1];
      if (GlRenderer.useOpenGlRenderer) {
        TextureSampler32.aClass3_Sub11ArrayArray3346 = new SomethingGl0[1][];
      }
    } else {
      SomethingIndex150.aClass3_Sub2ArrayArrayArray2065 = null;
      TextureSampler16.anIntArrayArray3115 = null;
      GlobalStatics_2.othrrHeightMap = null;
      TextureSampler32.aClass3_Sub11ArrayArray3346 = null;
    }

    DummyClass10.method2264(false);
    ByteArrayNode.aClass113Array3610 = new SomethingLight0[500];
    SpawnedGameObject.anInt2249 = 0;
    Unsure.aClass113Array1895 = new SomethingLight0[500];
    SomethingTilek.anInt1672 = 0;
    DummyClass50.anIntArrayArrayArray1142 =
      new int[planes][SocketStream.sceneWidth + 1][TextureSampler17.sceneHeight + 1];
    AnimationSequence.aClass25Array1868 = new SceneSomething[5000];
    TextureSampler21.anInt3070 = 0;
    FileCacheRequest.aClass25Array4060 = new SceneSomething[100];
    GLStatics.adjacentTileOnScreen =
      new boolean[GLStatics.viewportLength + GLStatics.viewportLength + 1][
        GLStatics.viewportLength + GLStatics.viewportLength + 1];
    GZipDecompressor.tileOnScreen =
      new boolean[GLStatics.viewportLength + GLStatics.viewportLength + 2][
        GLStatics.viewportLength + GLStatics.viewportLength + 2];
    SceneShadowMap.aByteArrayArrayArray1774 =
      new byte[planes][SocketStream.sceneWidth][TextureSampler17.sceneHeight];
  }

}
