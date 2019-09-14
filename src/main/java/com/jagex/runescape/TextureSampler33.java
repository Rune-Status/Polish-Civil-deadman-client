package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.opengl.GlTexture2d;
import java.io.IOException;

public final class TextureSampler33 extends AbstractTextureSampler {

  private static GameString aClass94_3048 = GameString.create("Hidden");
  public static Keyboard keyboard = new Keyboard();
  public static short aShort3052 = 205;
  public static GameString aClass94_3053 = GameString.create("Lade Schrifts-=tze )2 ");
  public static GameString aClass94_3051 = TextureSampler33.aClass94_3048;
  private int anInt3047 = 4096;
  private boolean aBoolean3050 = true;


  public TextureSampler33() {
    super(1, false);
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        TextureSampler33.aShort3052 = -37;
      }

      if (var1 == 0) {
        this.anInt3047 = var2.readUnsignedShort();
      } else if ((var1 == 1)) {
        this.aBoolean3050 = var2.readUnsignedByte() == 1;
      }
  }

  public int[][] method166(int var1, int var2 ) {
    int[][] var3 = this.triChromaticImageCache
          .method1594((byte) 58, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[] var4 = this
            .method152(0, TriChromaticImageBuffer.anInt2487 & var2 - 1, 32755);
        int[] var5 = this.method152(0, var2, 32755);
        int[] var6 = this
            .method152(0, 1 + var2 & TriChromaticImageBuffer.anInt2487, 32755);
        int[] var7 = var3[0];
        int[] var8 = var3[1];
        int[] var9 = var3[2];

        for (int var10 = 0; var10 < SomethingLight0.anInt1559; ++var10) {
          int var14 = this.anInt3047 * (-var4[var10] + var6[var10]);
          int var15 =
              this.anInt3047 * (-var5[RenderAnimation.anInt396 & -1 + var10] + var5[var10 + 1
              & RenderAnimation.anInt396]);
          int var17 = var14 >> 12;
          int var16 = var15 >> 12;
          int var19 = var17 * var17 >> 12;
          int var18 = var16 * var16 >> 12;
          int var20 =
            (int) (Math.sqrt((var18 + var19 + 4096) / 4096.0F) * 4096.0D);
          int var11;
          int var12;
          int var13;
          if (var20 == 0) {
            var13 = 0;
            var11 = 0;
            var12 = 0;
          } else {
            var13 = 16777216 / var20;
            var12 = var14 / var20;
            var11 = var15 / var20;
          }

          if (this.aBoolean3050) {
            var12 = 2048 + (var12 >> 1);
            var13 = (var13 >> 1) + 2048;
            var11 = (var11 >> 1) + 2048;
          }

          var7[var10] = var11;
          var8[var10] = var12;
          var9[var10] = var13;
        }
      }

      if (var1 != -1) {
        TextureSampler33.method180(-55, -63, -5);
      }

      return var3;
  }

  public static void method177(byte var0) {
    TextureSampler33.aClass94_3053 = null;
      TextureSampler33.aClass94_3051 = null;
      TextureSampler33.aClass94_3048 = null;
      if (var0 != 119) {
        TextureSampler33.aShort3052 = 109;
      }

      TextureSampler33.keyboard = null;
  }

  public static int method179(byte var0, int var1) {
    if (var0 == 92) {
        if (SomethingVolume15.gameSocket != null) {
          SomethingVolume15.gameSocket.destroy();
          SomethingVolume15.gameSocket = null;
        }

        ++FileCacheRequester.anInt1088;
        if ((FileCacheRequester.anInt1088 > 4)) {
          Light.anInt692 = 0;
          FileCacheRequester.anInt1088 = 0;
          return var1;
        } else {
          Light.anInt692 = 0;
          if (DummyClass24.anInt1658 == ProjectileNode.primaryPort) {
            DummyClass24.anInt1658 = DummyClass41.secondaryPort;
          } else {
            DummyClass24.anInt1658 = ProjectileNode.primaryPort;
          }

          return -1;
        }
      } else {
        return 122;
      }
  }

  public static void method180(int var0, int var1, int var2) {
    int var3;
      if (SomethingLight0.anInt1559 != var2) {
        TextureCache.anIntArray2125 = new int[var2];

        for (var3 = 0; var2 > var3; ++var3) {
          TextureCache.anIntArray2125[var3] = (var3 << 12) / var2;
        }

        DummyClass53.anInt1343 = var2 != 64 ? 4096 : 2048;
        RenderAnimation.anInt396 = -1 + var2;
        SomethingLight0.anInt1559 = var2;
      }

      var3 = 111 / ((56 - var0) / 38);
      if (DummyClass55.anInt1427 != var1) {
        if (SomethingLight0.anInt1559 == var1) {
          DummyClass4.anIntArray2999 = TextureCache.anIntArray2125;
        } else {
          DummyClass4.anIntArray2999 = new int[var1];

          for (int var4 = 0; var4 < var1; ++var4) {
            DummyClass4.anIntArray2999[var4] = (var4 << 12) / var1;
          }
        }

        DummyClass55.anInt1427 = var1;
        TriChromaticImageBuffer.anInt2487 = var1 - 1;
      }
  }

  public static boolean parsePacket(int var0) {
    try {
        return DummyClass18.parsePacket((byte) -83);
      } catch (IOException var4) {
        TextureSampler5.method289(false);
        return true;
      } catch (Exception var5) {
        String var2 = "T2 - " + GameString.packetId + "," + EnumStringFetcher.lastPacketId1 + ","
          + IdentityKit.lastPacketId2 + " - " + HashTable.packetLength + "," + (
          WorldMapLabel.anInt1716 + TextureCache.localPlayer.waypointsX[0]) + "," + (
          TextureCache.localPlayer.waypointsY[0] + ProceduralTexture.anInt1152) + " - ";

        for (int var3 = 0; var3 < HashTable.packetLength && var3 < 50; ++var3) {
          var2 = var2 + SpotAnimationConfig.gameBuffer.bytes[var3] + ",";
        }

        GZipDecompressor.reportError(var2, var5, (byte) 108);
        DummyClass10.destroyGame((byte) 46);
        return true;
      }
  }

  public static void method182(boolean var0) {
    if (!var0) {
        TextureSampler33.method179((byte) 120, -73);
      }

      ProceduralTexture.aClass93_1146.method1524(3);
      DummyClass13.aClass93_2016.method1524(3);
  }

  public static void method183(int var0) {
    if (var0 > -91) {
        TextureSampler33.keyboard = null;
      }

      FileCache.aClass93_684.method1524(3);
      DummyClass5.aClass93_2984.method1524(3);
  }

  public static void method184(int var0, int var1, int var2, int var3, int var4, int var5,
                              int var6) {
    int var11 =
        DummyClass59.method1040(LightIntensity.anInt902, var6, (byte) 0, DummyClass13.anInt2020);
      int var12 =
        DummyClass59.method1040(LightIntensity.anInt902, var0, (byte) 0, DummyClass13.anInt2020);
      int var13 =
        DummyClass59.method1040(GlTexture2d.anInt3765, var3, (byte) 0, DummyClass55.anInt1425);
      int var14 =
        DummyClass59.method1040(GlTexture2d.anInt3765, var2, (byte) 0, DummyClass55.anInt1425);
      if (var4 != 1) {
        TextureSampler33.method183(-1);
      }

      int var7 = DummyClass59.method1040(LightIntensity.anInt902, var6 + var1, (byte) 0,
        DummyClass13.anInt2020);
      int var8 = DummyClass59.method1040(LightIntensity.anInt902, -var1 + var0, (byte) 0,
        DummyClass13.anInt2020);

      int var15;
      for (var15 = var11; var7 > var15; ++var15) {
        TextureSampler18.method282(DummyClass35.anIntArrayArray663[var15], var13, 127, var14, var5);
      }

      for (var15 = var12; (var8 < var15); --var15) {
        TextureSampler18.method282(DummyClass35.anIntArrayArray663[var15], var13, -76, var14, var5);
      }

      int var9 = DummyClass59.method1040(GlTexture2d.anInt3765, var1 + var3, (byte) 0,
        DummyClass55.anInt1425);
      int var10 = DummyClass59.method1040(GlTexture2d.anInt3765, -var1 + var2, (byte) 0,
        DummyClass55.anInt1425);

      for (var15 = var7; (var15 <= var8); ++var15) {
        int[] var16 = DummyClass35.anIntArrayArray663[var15];
        TextureSampler18.method282(var16, var13, -59, var9, var5);
        TextureSampler18.method282(var16, var10, var4 - 97, var14, var5);
      }
  }

}
