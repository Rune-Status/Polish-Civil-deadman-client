package com.jagex.runescape;

import com.jagex.runescape.opengl.GlDirectColorSprite;
import com.jagex.runescape.opengl.GlDirectFullColorSprite;
import com.jagex.runescape.opengl.GlRenderer;

public final class SomethingTexture3 extends AbstractSomethingTexture {

  public static int anInt2651;
  public static GameString aClass94_2653 = GameString.create("Hierhin gehen");
  public static AbstractDirectColorSprite[] aClass3_Sub28_Sub16Array2656;
  public static int anInt2658;
  public static FileUnpacker animationFrames;
  private final int anInt2649;
  private final int anInt2650;
  private final int anInt2652;
  private final int anInt2654;
  private int anInt2655;
  private final int anInt2657;
  private final int anInt2659;
  private final int anInt2661;


  public SomethingTexture3(int var1, int var2, int var3, int var4, int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10 ) {
    super(-1, var9, var10);

    this.anInt2657 = var2;
      this.anInt2659 = var7;
      this.anInt2655 = var5;
      this.anInt2654 = var1;
      this.anInt2650 = var8;
      this.anInt2652 = var6;
      this.anInt2649 = var4;
      this.anInt2661 = var3;
  }

  public void method1335(int var1, int var2, int var3 ) {
    if (var3 != 4898) {
        this.anInt2655 = -64;
      }
  }

  public void method1337(int var1, boolean var2, int var3 ) {
    int var4 = var3 * this.anInt2654 >> 12;
      int var6 = var3 * this.anInt2661 >> 12;
      int var7 = this.anInt2649 * var1 >> 12;
      int var5 = this.anInt2657 * var1 >> 12;
      int var8 = this.anInt2655 * var3 >> 12;
      int var9 = var1 * this.anInt2652 >> 12;
      int var10 = this.anInt2659 * var3 >> 12;
      if (!var2) {
        SomethingTexture3.aClass94_2653 = null;
      }

      int var11 = var1 * this.anInt2650 >> 12;
      DummyClass58.method1652(var6, var10, var9, var11, var5, var4, var8, var7,
          this.anInt1104, 0);
  }

  public void method1341(int var1, int var2, int var3 ) {
    if (var1 != 2) {
        SomethingTexture3.animationFrames = null;
      }
  }

  public static void method1346(int var0) {
    TextureSampler6.method174(4096, 5);
      DummyClass35.method1027(5, (byte) 69);
      AudioStreamEncoder3.method465(5, true);
      AudioStreamEncoder4.method474(2, 5);
      Projectile.method2025((byte) -62, 5);
      MonoChromaticImageCache.method1711(5, var0 + -25956);
      AreaSoundEffect.method137(5, (byte) -118);
      ClanChatUser.method386(5, var0 ^ -26138);
      Buffer.method795((byte) 14, 5);
      SomethingWorldMapy.method539(0, 5);
      TextureSampler34.method188(5, 0);
      SomethingIndex150.method2260(var0 + -27256, 5);
      FileCacheRequest.method594(var0 + -26090, 5);
      FileCacheRequest.method595(5, 109);
      SomethingPacket151.method820(5, 64);
      SceneSomething.method953(-13508, 50);
      TextureSampler37.method269(-5, 5);
      DummyClass49.method1366(104, 5);
      TextureSampler1.aClass93_3130.method1522(-125, 5);
      HashTableIterator.aClass93_1135.method1522(var0 ^ -26142, 5);
  }

  public static AbstractDirectColorSprite[] method1347(int var0) {
    if (var0 == -26802) {
        AbstractDirectColorSprite[] var1 = new AbstractDirectColorSprite[DummyClass53.spriteCount];

        for (int var2 = 0; DummyClass53.spriteCount > var2; ++var2) {
          byte[] var4 = DummyClass5.aByteArrayArray2987[var2];
          int var3 = TextureSampler26.anIntArray3076[var2]
              * GroundItem.anIntArray2931[var2];
          if (TextureSampler0.aBooleanArray3272[var2]) {
            int[] var6 = new int[var3];
            byte[] var5 = DummyClass4.aByteArrayArray3005[var2];

            for (int var7 = 0; var3 > var7; ++var7) {
              var6[var7] = TextureSampler3.method308(
                  TextureSampler38.anIntArray3446[ClientScript
                      .bitAnd(var4[var7], 255)],
                  ClientScript.bitAnd(-16777216, var5[var7] << 24));
            }

            if (GlRenderer.useOpenGlRenderer) {
              var1[var2] = new GlDirectFullColorSprite(
                  SomethingVolume15.anInt2426,
                  SomethingPacket116.anInt1748,
                  Something3dRoot.anIntArray2048[var2],
                  Buffer.anIntArray2591[var2], GroundItem.anIntArray2931[var2],
                  TextureSampler26.anIntArray3076[var2], var6);
            } else {
              var1[var2] = new SoftwareDirectFullColorSprite(
                  SomethingVolume15.anInt2426,
                  SomethingPacket116.anInt1748,
                  Something3dRoot.anIntArray2048[var2],
                  Buffer.anIntArray2591[var2], GroundItem.anIntArray2931[var2],
                  TextureSampler26.anIntArray3076[var2], var6);
            }
          } else {
            int[] var9 = new int[var3];

            for (int var10 = 0; (var10 < var3); ++var10) {
              var9[var10] = TextureSampler38.anIntArray3446[ClientScript
                  .bitAnd(var4[var10], 255)];
            }

            if (GlRenderer.useOpenGlRenderer) {
              var1[var2] =
                  new GlDirectColorSprite(SomethingVolume15.anInt2426,
                      SomethingPacket116.anInt1748,
                      Something3dRoot.anIntArray2048[var2],
                      Buffer.anIntArray2591[var2],
                      GroundItem.anIntArray2931[var2],
                      TextureSampler26.anIntArray3076[var2], var9);
            } else {
              var1[var2] = new SoftwareDirectColorSprite(
                  SomethingVolume15.anInt2426,
                  SomethingPacket116.anInt1748,
                  Something3dRoot.anIntArray2048[var2],
                  Buffer.anIntArray2591[var2], GroundItem.anIntArray2931[var2],
                  TextureSampler26.anIntArray3076[var2], var9);
            }
          }
        }

        DummyClass37.method1035((byte) 106);
        return var1;
      } else {
        return null;
      }
  }

  public static void method1348(byte var0) {
    SomethingTexture3.animationFrames = null;
      if (var0 != 100) {
        SomethingTexture3.method1347(-79);
      }

      SomethingTexture3.aClass94_2653 = null;
      SomethingTexture3.aClass3_Sub28_Sub16Array2656 = null;
  }

}
