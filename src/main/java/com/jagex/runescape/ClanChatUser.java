package com.jagex.runescape;

import com.jagex.runescape.opengl.GlDirectColorSprite;
import com.jagex.runescape.opengl.GlRenderer;

public final class ClanChatUser extends Node {

  public static FileUnpacker midiInstruments;
  public static int anInt2475;
  public static GameString aClass94_2477 = GameString.create("<col=ffffff>");
  public static int anInt2479;
  public byte aByte2472;
  public GameString aClass94_2473;
  public GameString name;
  public int anInt2478;

  public static SomethingTexture1 method384(Buffer var0, byte var1) {
    if (var1 <= 40) {
        ClanChatUser.midiInstruments = null;
      }

      return new SomethingTexture1(var0.method787((byte) 38), var0.method787((byte) 51),
        var0.method787((byte) 66), var0.method787((byte) 68), var0.readUnsignedMedium((byte) 86),
        var0.readUnsignedMedium((byte) 86), var0.readUnsignedByte());
  }

  public static boolean method385(int var0, int var1) {
    int var2 = var0;
      byte var3 = 0;
      int var5;
      int var6;
      int var7;
      int var8;
      if (DummyClass32.aClass3_Sub28_Sub16_Sub2_518 == null) {
        if (!GlRenderer.useOpenGlRenderer &&
            GZipDecompressor.aClass3_Sub28_Sub16_812 != null) {
          DummyClass32.aClass3_Sub28_Sub16_Sub2_518 =
            (SoftwareDirectColorSprite) GZipDecompressor.aClass3_Sub28_Sub16_812;
        } else {
          DummyClass32.aClass3_Sub28_Sub16_Sub2_518 = new SoftwareDirectColorSprite(512, 512);
        }

        int[] var4 = DummyClass32.aClass3_Sub28_Sub16_Sub2_518.pixels;
        var5 = var4.length;

        for (var6 = 0; (var6 < var5); ++var6) {
          var4[var6] = 1;
        }

        for (var6 = var3 + 1; -1 + -var3 + 104 > var6; ++var6) {
          var7 = 4 * 512 * (var3 + 103 + -var6) + 24628;

          for (var8 = 1 + var2; (var8 < (-var2 + 104 + -1)); ++var8) {
            if (((BZipDecompressorState.tileFlags[var1][var8][var6] & 24) == 0)) {
              SocketStream.method1469(var4, var7, 512, var1, var8, var6);
            }

            if ((var1 < 3) &&
                (BZipDecompressorState.tileFlags[1 + var1][var8][var6] & 8)
                    != 0) {
              SocketStream.method1469(var4, var7, 512, var1 + 1, var8, var6);
            }

            var7 += 4;
          }
        }

        Mouse.anInt1924 = 0;

        for (var6 = 0; var6 < 104; ++var6) {
          for (var7 = 0; var7 < 104; ++var7) {
            long var20 =
              SceneGraphTile.method104(GameWorldSomething.currentPlane, var6 + var2, var7 - -var3);
            if ((var20 != 0L)) {
              GameObjectConfig var10 =
                DummyClass11.method2207(4, (int) (var20 >>> 32) & Integer.MAX_VALUE);
              int var11 = var10.anInt1482;
              int var12;
              if (var10.anIntArray1524 != null) {
                for (var12 = 0; var10.anIntArray1524.length > var12; ++var12) {
                  if (var10.anIntArray1524[var12] != -1) {
                    GameObjectConfig var13 =
                      DummyClass11.method2207(4, var10.anIntArray1524[var12]);
                    if (var13.anInt1482 >= 0) {
                      var11 = var13.anInt1482;
                      break;
                    }
                  }
                }
              }

              if ((var11 >= 0)) {
                int var21 = var3 + var7;
                var12 = var2 + var6;
                if (var11 != 22 && var11 != 29 && var11 != 34 && (var11 != 36)
                    &&
                    var11 != 46
                  && var11 != 47 && var11 != 48) {
                  int[][] var14 =
                    BlockConfig.collisionMaps[GameWorldSomething.currentPlane].anIntArrayArray1304;

                  for (int var15 = 0; (var15 < 10); ++var15) {
                    int var16 = (int) (Math.random() * 4.0D);
                    if (var16 == 0 && var12 > 0 && ((var6 - 3) < var12)
                      && ((var14[var12 - 1][var21] & 19661064) == 0)) {
                      --var12;
                    }

                    if (var16 == 1 && (var12 < 103) && (3 + var6) > var12
                      && (var14[var12 - -1][var21] & 19661184) == 0) {
                      ++var12;
                    }

                    if (var16 == 2 && var21 > 0 && ((-3 + var7) < var21) && (
                        var14[var12][-1 + var21] & 19661058) == 0) {
                      --var21;
                    }

                    if (var16 == 3 && var21 < 103 && (var21 < (var7 - -3)) &&
                        (19661088
                            & var14[var12][1 + var21]) == 0) {
                      ++var21;
                    }
                  }
                }

                ClientScript.anIntArray3693[Mouse.anInt1924] = var10.anInt1527;
                DummyClass51.anIntArray1163[Mouse.anInt1924] = -var2 + var12;
                ObjectNode.anIntArray4050[Mouse.anInt1924] = var21 + -var3;
                ++Mouse.anInt1924;
              }
            }
          }
        }
      }

      DummyClass32.aClass3_Sub28_Sub16_Sub2_518.method658();
      int var18 =
        (238 + (int) (20.0D * Math.random()) - 10 << 8) + (-10 + (int) (Math.random() * 20.0D) + 238
          << 16) + (228 - -((int) (20.0D * Math.random())));
      var5 = (int) (Math.random() * 20.0D) + 238 + -10 << 16;

      for (var6 = 1; (var6 < 103); ++var6) {
        for (var7 = 1; var7 < 103; ++var7) {
          if ((BZipDecompressorState.tileFlags[var1][var7 + var2][var6 - -var3]
              & 24) == 0
            && !GameString.method1529(var3, var7, var18, var6, var5, var2, var1, true)) {
            if (GlRenderer.useOpenGlRenderer) {
              DummyClass47.anIntArray1100 = null;
            } else {
              Something3d.viewImageProducer.method2182(0);
            }

            return false;
          }

          if ((var1 < 3)
            && ((BZipDecompressorState.tileFlags[1 + var1][var7 + var2][var6 + var3] & 8) != 0)
            && !GameString.method1529(var3, var7, var18, var6, var5, var2, 1 + var1, true)) {
            if (GlRenderer.useOpenGlRenderer) {
              DummyClass47.anIntArray1100 = null;
            } else {
              Something3d.viewImageProducer.method2182(0);
            }

            return false;
          }
        }
      }

      if (GlRenderer.useOpenGlRenderer) {
        int[] var19 = DummyClass32.aClass3_Sub28_Sub16_Sub2_518.pixels;
        var7 = var19.length;

        for (var8 = 0; var7 > var8; ++var8) {
          if (var19[var8] == 0) {
            var19[var8] = 1;
          }
        }

        GZipDecompressor.aClass3_Sub28_Sub16_812 =
          new GlDirectColorSprite(DummyClass32.aClass3_Sub28_Sub16_Sub2_518);
      } else {
        GZipDecompressor.aClass3_Sub28_Sub16_812 = DummyClass32.aClass3_Sub28_Sub16_Sub2_518;
      }

      if (GlRenderer.useOpenGlRenderer) {
        DummyClass47.anIntArray1100 = null;
      } else {
        Something3d.viewImageProducer.method2182(0);
      }

      DummyClass32.aClass3_Sub28_Sub16_Sub2_518 = null;
      return true;
  }

  public static void method386(int var0, int var1) {
    SomethingPacket151.aClass93_2604.method1522(-128, var0);
      if (var1 <= -109) {
        DummyClass32.aClass93_511.method1522(-126, var0);
      }
  }

  public static void method387(int var0) {
    int var1 = 41 % ((var0 - -70) / 32);
      ClanChatUser.aClass94_2477 = null;
      ClanChatUser.midiInstruments = null;
  }

}
