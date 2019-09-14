package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.node.Node;
import com.jagex.runescape.opengl.Light;
import com.jagex.runescape.opengl.SomethingShadows;
import com.jagex.runescape.opengl.DummyClass46;
import com.jagex.runescape.opengl.GLStatics;
import com.jagex.runescape.opengl.GlModel;
import com.jagex.runescape.opengl.GlRenderer;

public final class TriChromaticImageBuffer extends Node {

  private static GameString aClass94_2486 = GameStringStatics.create("red:");
  public static int[] anIntArray2480 = new int[25];
  public static GameString aClass94_2482 = GameStringStatics.create(":clan:");
  public static int anInt2484;
  public static int languageId;
  public static int anInt2487;
  public static int anInt2488;
  public static GameString aClass94_2490 = TriChromaticImageBuffer.aClass94_2486;
  public static GameString aClass94_2481 = TriChromaticImageBuffer.aClass94_2486;
  public int anInt2483;
  public int anInt2489;

  public TriChromaticImageBuffer(int var1, int var2 ) {
    this.anInt2483 = var2;
      this.anInt2489 = var1;
  }

  public static void method388(byte var0) {
    int var1 = 44 / ((-2 - var0) / 52);
      if (TextureSampler4.aClass94_3220 != null) {
        StringNode0.method138(TextureSampler4.aClass94_3220, 0);
        TextureSampler4.aClass94_3220 = null;
      }
  }

  public static void method389(boolean var0) {
    DummyClass34.method995();
      GZipDecompressor.aClass3_Sub28_Sub16_812 = null;
      DummyClass43.anInt909 = -1;
      TextureSampler13.method313((byte) 55);
      DummyClass61.aClass47_3801.method1101(2);
      FloorUnderlay.aClass136_1413 = new SceneShadowMap();
      ((TextureCache) GLStatics.textureCache).method1618(0);
      DummyClass46.anInt1032 = 0;
      DummyClass46.lights = new Light[255];
      GlModel.method1929();
      SomethingShadows.method2043();
      DummyClass45.method1240(false);
      OndemandRequester.method1250(17, var0);
      TextureSampler23.method247((byte) 51);

      for (int var1 = 0; var1 < 2048; ++var1) {
        Player var2 = TextureSampler0.players[var1];
        if (var2 != null) {
          var2.anObject2796 = null;
        }
      }

      if (GlRenderer.useOpenGlRenderer) {
        SomethingShadows.initializeShadows(104, 104);
        DummyClass0.method1755();
      }

      Parameter.method581(FileUnpacker.fileUnpacker13, 0, Projectile.sprites);
      DummyClass28.method887(21, Projectile.sprites);
      MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560 = null;
      TextureSampler27.aClass3_Sub28_Sub16_3099 = null;
      GlobalStatics_4.aClass3_Sub28_Sub16_824 = null;
      DummyClass53.aClass3_Sub28_Sub16_1339 = null;
      DummyClass58.aClass3_Sub28_Sub16_1457 = null;
      if (DummyClass15.state == 5) {
        DummyClass58.loadTitleScreenSprites(Projectile.sprites, (byte) -60);
      }

      if (DummyClass15.state == 10) {
        TextureSampler1.method219(false, 3000);
      }

      if (DummyClass15.state == 30) {
        DummyClass26.setState(25, 5);
      }
  }

  public static void method390(boolean var0, int var1, int var2, int var3, byte var4, int var5,
                              int var6) {
    GlobalStatics_4.anInt3631 = var3;
      TextureSampler25.anInt3414 = var2;
      GameCanvas.anInt30 = var6;
      DummyClass8.anInt4021 = var1;
      GlobalStatics_5.anInt1904 = var5;
      if (var0 && GlobalStatics_4.anInt3631 >= 100) {
        NPC.anInt3995 = 128 * GameCanvas.anInt30 + 64;
        DummyClass49.anInt1111 = 128 * GlobalStatics_5.anInt1904 + 64;
        GlobalStatics_7.anInt2162 =
          GlobalStatics_6.method1736(GameWorldSomething.currentPlane, 1, NPC.anInt3995,
            DummyClass49.anInt1111) - TextureSampler25.anInt3414;
      }

      int var7 = 76 % ((-79 - var4) / 35);
      SomethingPacket116.anInt1753 = 2;
  }

  public static void method391(int var0) {
    TriChromaticImageBuffer.aClass94_2490 = null;
      TriChromaticImageBuffer.anIntArray2480 = null;
      TriChromaticImageBuffer.aClass94_2481 = null;
      if (var0 != 25) {
        TriChromaticImageBuffer.method388((byte) -58);
      }

      TriChromaticImageBuffer.aClass94_2486 = null;
      TriChromaticImageBuffer.aClass94_2482 = null;
  }

  public static void setAnimationFileUnpackers(FileUnpacker var0, FileUnpacker var1, int var2,
                                              FileUnpacker var3) {
    GlobalStatics_3.animationSequences = var1;
      int var4 = -110 / ((-7 - var2) / 43);
      GlobalStatics_7.animationFrames = var0;
      WorldMapLabel.animationBases = var3;
  }

}
