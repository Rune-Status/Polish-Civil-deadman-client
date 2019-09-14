package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlUtils;

public final class AnimationFrame extends Node {

  private static GameString aClass94_2465 = GameString.create("");
  public static int anInt2456;
  public static float aFloat2457;
  public static GameString aClass94_2458 = GameString.create("Module texte charg-B");
  public static int anInt2459;
  public static GameString aClass94_2461 =
    GameString.create("3D)2Softwarebibliothek gestartet)3");
  public static GameString loadingText = AnimationFrame.aClass94_2465;
  public int anInt2454;
  public int[] anIntArray2455;
  public int[][] anIntArrayArray2460;
  public int anInt2462;
  public boolean[] aBooleanArray2463;
  public int[] anIntArray2466;

  public AnimationFrame(int var1, byte[] var2 ) {
    try {
      this.anInt2454 = var1;
      Buffer var3 = new Buffer(var2);
      this.anInt2462 = var3.readUnsignedByte();
      this.anIntArrayArray2460 = new int[this.anInt2462][];
      this.anIntArray2466 = new int[this.anInt2462];
      this.aBooleanArray2463 = new boolean[this.anInt2462];
      this.anIntArray2455 = new int[this.anInt2462];

      int var4;
      for (var4 = 0; ~var4 > ~this.anInt2462; ++var4) {
        this.anIntArray2466[var4] = var3.readUnsignedByte();
      }

      for (var4 = 0; ~this.anInt2462 < ~var4; ++var4) {
        this.aBooleanArray2463[var4] = ~var3.readUnsignedByte() == -2;
      }

      for (var4 = 0; var4 < this.anInt2462; ++var4) {
        this.anIntArray2455[var4] = var3.readUnsignedShort();
      }

      for (var4 = 0; var4 < this.anInt2462; ++var4) {
        this.anIntArrayArray2460[var4] = new int[var3.readUnsignedByte()];
      }

      for (var4 = 0; this.anInt2462 > var4; ++var4) {
        for (int var5 = 0; ~var5 > ~this.anIntArrayArray2460[var4].length; ++var5) {
          this.anIntArrayArray2460[var4][var5] = var3.readUnsignedByte();
        }
      }

    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "jm.<init>(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  public static void method380(int var0) {
    try {
      AnimationFrame.loadingText = null;
      if (var0 != -29113) {
        AnimationFrame.method381(false);
      }

      AnimationFrame.aClass94_2458 = null;
      AnimationFrame.aClass94_2465 = null;
      AnimationFrame.aClass94_2461 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "jm.B(" + var0 + ')');
    }
  }

  public static void method381(boolean var0) {
    try {
      if (0 != ~InventoryConfig.anInt3655) {
        PlayerAppearance.method1160(-120, InventoryConfig.anInt3655);
      }

      for (int var1 = 0; var1 < SomethingWorldMapy.widgetQuads; ++var1) {
        if (GroundItemNode.aBooleanArray3674[var1]) {
          DummyClass9.aBooleanArray4008[var1] = true;
        }

        HashTable.aBooleanArray1712[var1] = GroundItemNode.aBooleanArray3674[var1];
        GroundItemNode.aBooleanArray3674[var1] = false;
      }

      DummyClass41.anInt865 = -1;
      DummyClass54.aClass11_1402 = null;
      SomethingOtherWorldMap.anInt2535 = AbstractGameWorld.updateCycle;
      if (GlRenderer.useOpenGlRenderer) {
        DummyOutputStream.aBoolean47 = true;
      }

      SubNode.anInt2567 = -1;
      if (!var0) {
        AnimationFrame.method380(-78);
      }

      if (~InventoryConfig.anInt3655 != 0) {
        SomethingWorldMapy.widgetQuads = 0;
        FileSystem.method841(true);
      }

      if (GlRenderer.useOpenGlRenderer) {
        GlUtils.resetClip();
      } else {
        DummyClass47.method1331();
      }

      DisplayMode.loopCycle = 0;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "jm.A(" + var0 + ')');
    }
  }

}
