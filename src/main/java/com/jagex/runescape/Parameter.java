package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;
import java.util.Calendar;

public final class Parameter extends SubNode {

  public static int anInt3615;
  public static Calendar aCalendar3616 = Calendar.getInstance();
  public static int anInt3618;
  public static int anInt3620;
  public static GameString aClass94_3621;
  public static int anInt3622;
  public static int anInt3623;
  public static int anInt3624;
  public int anInt3614;
  public GameString aClass94_3619;
  private int anInt3617;

  private void method579(int var1, Buffer var2, int var3) {
    if (~var1 == -2) {
        this.anInt3617 = var2.readUnsignedByte();
      } else {
        if (var1 == 2) {
          this.anInt3614 = var2.readInt();
        } else if (-6 == ~var1) {
          this.aClass94_3619 = var2.readString();
        }
      }

      if (var3 != 0) {
        Parameter
            .method582(5, 31, 114, true, -67, 14, -33, -115, -101, -61, -25, -121);
      }
  }

  public void method583(int var1, Buffer var2 ) {
    if (var1 == 207) {
        while (true) {
          int var3 = var2.readUnsignedByte();
          if (var3 == 0) {
            return;
          }

          this.method579(var3, var2, 0);
        }
      }
  }

  public boolean method585(int var1 ) {
    if (var1 != 0) {
        Parameter.aClass94_3621 = null;
      }

      return this.anInt3617 == 115;
  }

  public static SoftwareDirectColorSprite method578(int var0) {
    int var1 = TextureSampler26.anIntArray3076[0] * GroundItem.anIntArray2931[0];
      byte[] var2 = DummyClass5.aByteArrayArray2987[0];
      if (var0 != 115) {
        Parameter.anInt3624 = 112;
      }

      SoftwareDirectColorSprite var3;
      if (TextureSampler0.aBooleanArray3272[0]) {
        byte[] var4 = DummyClass4.aByteArrayArray3005[0];
        int[] var5 = new int[var1];

        for (int var6 = 0; var6 < var1; ++var6) {
          var5[var6] = TextureSampler3.method308(ClientScript.bitAnd(var4[var6] << 24, -16777216),
            TextureSampler38.anIntArray3446[ClientScript.bitAnd(255, var2[var6])]);
        }

        var3 = new SoftwareDirectFullColorSprite(SomethingVolume15.anInt2426,
          SomethingPacket116.anInt1748, Something3dRoot.anIntArray2048[0], Buffer.anIntArray2591[0],
          GroundItem.anIntArray2931[0], TextureSampler26.anIntArray3076[0], var5);
      } else {
        int[] var8 = new int[var1];

        for (int var9 = 0; var9 < var1; ++var9) {
          var8[var9] = TextureSampler38.anIntArray3446[ClientScript.bitAnd(var2[var9], 255)];
        }

        var3 =
          new SoftwareDirectColorSprite(SomethingVolume15.anInt2426, SomethingPacket116.anInt1748,
            Something3dRoot.anIntArray2048[0], Buffer.anIntArray2591[0],
            GroundItem.anIntArray2931[0], TextureSampler26.anIntArray3076[0], var8);
      }

      DummyClass37.method1035((byte) 127);
      return var3;
  }

  public static void method580(byte var0) {
    if (var0 != 80) {
        Parameter.method582(88, 85, -8, true, 72, 12, 29, 96, 6, 57, -13, 15);
      }

      SceneGraphTile.aClass130_2220 = new HashTable(32);
  }

  public static void method581(FileUnpacker var0, int var1, FileUnpacker var2) {
    AbstractTextureSampler.aClass3_Sub28_Sub17_2379 =
        FileCacheRequester.createFont(0, HintMarker.p11FontFileId, (byte) 124, var2, var0);
      if (GlRenderer.useOpenGlRenderer) {
        SomethingAudio.aClass3_Sub28_Sub17_Sub1_2000 =
            SceneSomething2
                .method1287(HintMarker.p11FontFileId, 0, var0, var2, -1);
      } else {
        SomethingAudio.aClass3_Sub28_Sub17_Sub1_2000 =
            (SoftwareFont) AbstractTextureSampler.aClass3_Sub28_Sub17_2379;
      }

      SomethingTilek.p12Font =
        FileCacheRequester.createFont(var1, SomethingTexture1.p12FontFileId, (byte) 125, var2,
          var0);
      FloorOverlay.aClass3_Sub28_Sub17_2096 =
        FileCacheRequester.createFont(0, TextureSampler1.b12FontFileId, (byte) 124, var2, var0);
  }

  public static boolean method582(int var0, int var1, int var2, boolean var3, int var4, int var5,
                                 int var6, int var7, int var8, int var9, int var10, int var11) {
    return TextureCache.localPlayer.getSize() != var5 ?
        (TextureCache.localPlayer.getSize() <= 2 ?
          DirectImageProducer.method2191(var6, var4, var11, -1001, var10, var9, var2, var1, var3,
            var8, var0, var7) :
          PlayerAppearance.method1166(var10, (byte) 34, var7, var9, var1,
            TextureCache.localPlayer.getSize(), var6, var8, var4, var11, var2, var3, var0)) :
        MapScene.method76(var7, var8, var4, var0, var10, var3, var2, var1, var6, var9, 127, var11);
  }

  public static void method584(int var0) {
    Parameter.aCalendar3616 = null;
      if (var0 != 0) {
        Parameter.method580((byte) -90);
      }

      Parameter.aClass94_3621 = null;
  }

}
