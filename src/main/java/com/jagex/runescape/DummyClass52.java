package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;

public final class DummyClass52 {

  public static int anInt1166;
  public static boolean aBoolean1167;
  public static AnimationSequence[] aClass142Array1168 = new AnimationSequence[14];
  public static float aFloat1169;
  public static int anInt1170;
  public static FileUnpacker aClass153_1171;
  public static int anInt1172;
  public static GameString aClass94_1173 = GameString.create("gr-Un:");
  public static int anInt1174 = 99;


  public static int method1423(boolean var0, Buffer var1, GameString var2) {
    if (var0) {
        DummyClass52.method1426(17);
      }

      int var3 = var1.position;
      byte[] var4 = var2.method1568(0);
      var1.writeSmart(-32769, var4.length);
      var1.position +=
        TextureSampler16.huffmanEncoder.method1015(var4.length, -81, var1.bytes, var4, 0,
          var1.position);
      return var1.position - var3;
  }

  public static AbstractIndexedColorSprite[] method1424(FileUnpacker var0, byte var1, int var2,
                                                       int var3) {
    if (var1 != -12) {
        DummyClass52.anInt1174 = 37;
      }

      return SomethingTexture4.loadSprites(var0, var2, var3, -30901) ?
        TextureSampler36.method343(1854847236) :
        null;
  }

  public static void method1425(int var0) {
    TextureSampler22.anInt3419 = var0;

    for (int var1 = 0; var1 < SocketStream.sceneWidth; ++var1) {
      for (int var2 = 0; var2 < TextureSampler17.sceneHeight; ++var2) {
        if (SomethingTexture1.sceneGraphTiles[var0][var1][var2] == null) {
          SomethingTexture1.sceneGraphTiles[var0][var1][var2] =
            new SceneGraphTile(var0, var1, var2);
        }
      }
    }

  }

  public static void method1426(int var0) {
    DummyClass52.aClass153_1171 = null;
      if (var0 != -25247) {
        DummyClass52.aClass142Array1168 = null;
      }

      DummyClass52.aClass94_1173 = null;
      DummyClass52.aClass142Array1168 = null;
  }

}
