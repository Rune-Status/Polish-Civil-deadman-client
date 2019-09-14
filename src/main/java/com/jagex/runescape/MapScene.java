package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.opengl.MaterialShader;

public final class MapScene {

  private static GameString aClass94_68 = GameStringStatics.create("glow1:");
  public static int anInt59;
  public static short[] aShortArray63 =
      {(short) 960, (short) 957, (short) -21568, (short) -21571, (short) 22464};
  public static int anInt65;
  public static boolean aBoolean66;
  public static int viewportUpperX;
  public static MaterialShader[] anInterface5Array70;
  public static GameString aClass94_60 = MapScene.aClass94_68;
  public static GameString aClass94_62 = MapScene.aClass94_68;
  public int anInt61;
  public int spriteId;
  public boolean aBoolean69;

  public void method74(byte var1, Buffer var2, int var3 ) {
    while (true) {
        int var4 = var2.readUnsignedByte();
        if ((var4 == 0)) {
          if (var1 > -108) {
            this.method74((byte) 85, null, 63);
          }

          return;
        }

        this.method79(var4, var2, var3, 95);
      }
  }

  public SoftwareIndexedColorSprite getSprite(int var1, byte var2 ) {
    SoftwareIndexedColorSprite var3 =
        (SoftwareIndexedColorSprite) TextureSampler2.aClass93_3369.get(
            var1 << 16 | this.spriteId);
      if (var3 != null) {
        return var3;
      } else {
        Keyboard.sprites.isLoaded(this.spriteId);
        int var4 = 125 % ((var2 + 21) / 50);
        var3 = GlobalStatics_0.createSprite(0, true, this.spriteId, Keyboard.sprites);
        if (var3 != null) {
          var3.method1668(TextureCache.anInt2136, DummyClass39.anInt740,
            AbstractImageProducer.anInt2015);
          var3.anInt1469 = var3.width;
          var3.anInt1467 = var3.height;

          for (int var5 = 0; var1 > var5; ++var5) {
            var3.method1674();
          }

          TextureSampler2.aClass93_3369.get((byte) -125, var3,
              var1 << 16 | this.spriteId);
        }

        return var3;
      }
  }

  private void method79(int var1, Buffer var2, int var3, int var4) {
    if (var1 == 1) {
        this.spriteId = var2.readUnsignedShort();
      } else if (var1 != 2) {
        if ((var1 == 3)) {
          this.aBoolean69 = true;
        } else {
          if (var1 == 4) {
            this.spriteId = -1;
          }
        }
      } else {
        this.anInt61 = var2.readUnsignedMedium((byte) 96);
      }

      if (var4 <= 7) {
        MapScene.anInt65 = 123;
      }
  }

  public static boolean method73(short var0, int var1) {
    if (var0 != 47 && (var0 != 5) && var0 != 43 && (var0 != 35) && (var0 != 58) &&
        (var0 != 22)
        && var0 != 40 && var0 != 3) {
        if ((var0 != 9) && (var0 != 12) && (var0 != 1006) && (var0 != 1003)) {
          if (var1 <= 42) {
            MapScene.anInt59 = 1;
          }

          return var0 == 25 || (var0 == 23) || var0 == 48 || var0 == 7
              || (var0 == 13) || (var0 == 8 || var0 == 32 || (var0 == 28)
              || (var0 == 59) || (var0 == 51)
              || (var0 == 41));
        } else {
          return true;
        }
      } else {
        return true;
      }
  }

  public static void method75(Widget[] var0, boolean var1, int var2) {
    if (var1) {
        for (int var3 = 0; (var3 < var0.length); ++var3) {
          Widget var4 = var0[var3];
          if (var4 != null) {
            if (var4.anInt187 == 0) {
              if (var4.aClass11Array262 != null) {
                MapScene.method75(var4.aClass11Array262, true, var2);
              }

              SomethingPacket151 var5 =
                (SomethingPacket151) TextureSampler23.aClass130_3208.get(
                    var4.anInt279);
              if (var5 != null) {
                ClassCheckRequest.method124(49, var2, var5.anInt2602);
              }
            }

            ClientScriptCall var7;
            if ((var2 == 0) && var4.anObjectArray206 != null) {
              var7 = new ClientScriptCall();
              var7.arguments = var4.anObjectArray206;
              var7.aClass11_2449 = var4;
              Light.executeScript(var7);
            }

            if ((var2 == 1) && var4.anObjectArray176 != null) {
              if ((var4.anInt191 >= 0)) {
                Widget var8 = EnumStringFetcher.getWidget((byte) 121, var4.anInt279);
                if (var8 == null || var8.aClass11Array262 == null
                  || (var4.anInt191 >= var8.aClass11Array262.length)
                  || var8.aClass11Array262[var4.anInt191] != var4) {
                  continue;
                }
              }

              var7 = new ClientScriptCall();
              var7.arguments = var4.anObjectArray176;
              var7.aClass11_2449 = var4;
              Light.executeScript(var7);
            }
          }
        }

      }
  }

  public static boolean method76(int var0, int var1, int var2, int var3, int var4, boolean var5,
                                int var6, int var7, int var8, int var9, int var10, int var11) {
    int var12;
      int var13;
      for (var12 = 0; var12 < 104; ++var12) {
        for (var13 = 0; (var13 < 104); ++var13) {
          DummyClass51.anIntArrayArray1160[var12][var13] = 0;
          TriChromaticImageCache.anIntArrayArray1373[var12][var13] = 99999999;
        }
      }

      DummyClass51.anIntArrayArray1160[var11][var3] = 99;
      TriChromaticImageCache.anIntArrayArray1373[var11][var3] = 0;
      var13 = var3;
      var12 = var11;
      byte var14 = 0;
      TextureSampler38.anIntArray3456[var14] = var11;
      boolean var16 = false;
      int var15 = 0;
      int var27 = var14 + 1;
      DummyClass38.anIntArray729[var14] = var3;
      int[][] var17 =
        GlobalStatics_0.collisionMaps[GameWorldSomething.currentPlane].anIntArrayArray1304;

      int var18;
      while (var15 != var27) {
        var12 = TextureSampler38.anIntArray3456[var15];
        var13 = DummyClass38.anIntArray729[var15];
        var15 = 4095 & var15 + 1;
        if (var8 == var12 && (var4 == var13)) {
          var16 = true;
          break;
        }

        if ((var1 != 0)) {
          if ((var1 < 5 || (var1 == 10))
            && GlobalStatics_0.collisionMaps[GameWorldSomething.currentPlane].method1488(var4, var12,
            false, var13, var8, -1 + var1, 2, var7)) {
            var16 = true;
            break;
          }

          if (var1 < 10 && GlobalStatics_0.collisionMaps[GameWorldSomething.currentPlane].method1492(
            var4, var1 - 1, var8, var13, 2, var7, var12, 88)) {
            var16 = true;
            break;
          }
        }

        if (var0 != 0 && (var6 != 0)
          && GlobalStatics_0.collisionMaps[GameWorldSomething.currentPlane].method1498(true, var8,
          var13, var12, 2, var0, var2, var4, var6)) {
          var16 = true;
          break;
        }

        var18 = TriChromaticImageCache.anIntArrayArray1373[var12][var13] + 1;
        if (var12 > 0 && (DummyClass51.anIntArrayArray1160[var12 - 1][var13] == 0) &&
            (
                var17[-1 + var12][var13] & 19661070) == 0
          && ((var17[-1 + var12][var13 + 1] & 19661112) == 0)) {
          TextureSampler38.anIntArray3456[var27] = var12 - 1;
          DummyClass38.anIntArray729[var27] = var13;
          var27 = 1 + var27 & 4095;
          DummyClass51.anIntArrayArray1160[var12 - 1][var13] = 2;
          TriChromaticImageCache.anIntArrayArray1373[-1 + var12][var13] = var18;
        }

        if (var12 < 102
            && (DummyClass51.anIntArrayArray1160[1 + var12][var13] == 0) &&
            (
                var17[2 + var12][var13] & 19661187) == 0 &&
            (var17[var12 + 2][1 + var13] & 19661280) == 0) {
          TextureSampler38.anIntArray3456[var27] = 1 + var12;
          DummyClass38.anIntArray729[var27] = var13;
          var27 = 4095 & var27 + 1;
          DummyClass51.anIntArrayArray1160[var12 + 1][var13] = 8;
          TriChromaticImageCache.anIntArrayArray1373[var12 + 1][var13] = var18;
        }

        if (var13 > 0 && (DummyClass51.anIntArrayArray1160[var12][var13 - 1] == 0)
          && (19661070 & var17[var12][-1 + var13]) == 0
          && ((var17[var12 + 1][var13 - 1] & 19661187) == 0)) {
          TextureSampler38.anIntArray3456[var27] = var12;
          DummyClass38.anIntArray729[var27] = -1 + var13;
          DummyClass51.anIntArrayArray1160[var12][-1 + var13] = 1;
          TriChromaticImageCache.anIntArrayArray1373[var12][-1 + var13] = var18;
          var27 = 4095 & 1 + var27;
        }

        if ((var13 < 102) && (DummyClass51.anIntArrayArray1160[var12][var13 + 1] == 0)
          && ((var17[var12][2 + var13] & 19661112) == 0) &&
            ((var17[1 + var12][var13 + 2]
                & 19661280) == 0)) {
          TextureSampler38.anIntArray3456[var27] = var12;
          DummyClass38.anIntArray729[var27] = var13 + 1;
          DummyClass51.anIntArrayArray1160[var12][1 + var13] = 4;
          var27 = 1 + var27 & 4095;
          TriChromaticImageCache.anIntArrayArray1373[var12][var13 + 1] = var18;
        }

        if (var12 > 0 && var13 > 0 &&
            (DummyClass51.anIntArrayArray1160[-1 + var12][-1
                + var13] == 0) && ((19661112 & var17[-1 + var12][var13]) == 0)
            && (
            var17[-1 + var12][-1 + var13] & 19661070) == 0 &&
            (19661187 & var17[var12][-1 + var13]) == 0) {
          TextureSampler38.anIntArray3456[var27] = -1 + var12;
          DummyClass38.anIntArray729[var27] = -1 + var13;
          DummyClass51.anIntArrayArray1160[-1 + var12][-1 + var13] = 3;
          TriChromaticImageCache.anIntArrayArray1373[-1 + var12][-1 + var13] = var18;
          var27 = 4095 & var27 + 1;
        }

        if ((var12 < 102) && var13 > 0
          && (DummyClass51.anIntArrayArray1160[1 + var12][var13 - 1] == 0) &&
            ((
                var17[var12 + 1][var13 - 1] & 19661070) == 0) &&
            ((19661187 & var17[2 + var12][var13
                - 1]) == 0) && ((19661280 & var17[var12 + 2][var13]) == 0)) {
          TextureSampler38.anIntArray3456[var27] = var12 + 1;
          DummyClass38.anIntArray729[var27] = var13 - 1;
          var27 = 4095 & 1 + var27;
          DummyClass51.anIntArrayArray1160[var12 + 1][-1 + var13] = 9;
          TriChromaticImageCache.anIntArrayArray1373[1 + var12][var13 - 1] = var18;
        }

        if ((var12 > 0) && (var13 < 102) &&
            DummyClass51.anIntArrayArray1160[var12 - 1][var13
                + 1] == 0 && ((var17[-1 + var12][var13 + 1] & 19661070) == 0) &&
            (19661112 & var17[-1
                + var12][var13 + 2]) == 0
            && ((19661280 & var17[var12][var13 + 2]) == 0)) {
          TextureSampler38.anIntArray3456[var27] = var12 - 1;
          DummyClass38.anIntArray729[var27] = 1 + var13;
          DummyClass51.anIntArrayArray1160[var12 - 1][1 + var13] = 6;
          TriChromaticImageCache.anIntArrayArray1373[-1 + var12][1 + var13] = var18;
          var27 = 1 + var27 & 4095;
        }

        if ((var12 < 102) && (var13 < 102) &&
            (DummyClass51.anIntArrayArray1160[1 + var12][1
                + var13] == 0)
            && ((19661112 & var17[var12 + 1][2 + var13]) == 0) &&
            ((19661280 & var17[
                var12 + 2][var13 + 2]) == 0)
            && (19661187 & var17[var12 + 2][var13 + 1]) == 0) {
          TextureSampler38.anIntArray3456[var27] = 1 + var12;
          DummyClass38.anIntArray729[var27] = var13 + 1;
          var27 = var27 + 1 & 4095;
          DummyClass51.anIntArrayArray1160[var12 + 1][var13 + 1] = 12;
          TriChromaticImageCache.anIntArrayArray1373[1 + var12][1 + var13] = var18;
        }
      }

      AbstractFrameRegulator.anInt1692 = 0;
      int var19;
      if (!var16) {
        if (!var5) {
          return false;
        }

        var18 = 1000;
        var19 = 100;
        byte var20 = 10;

        for (int var21 = -var20 + var8; (var21 <= (var20 + var8)); ++var21) {
          for (int var22 = var4 - var20; (var22 <= (var20 + var4)); ++var22) {
            if ((var21 >= 0) && (var22 >= 0) && (var21 < 104) && var22 < 104
              && TriChromaticImageCache.anIntArrayArray1373[var21][var22] < 100) {
              int var23 = 0;
              int var24 = 0;
              if ((var21 >= var8)) {
                if (var21 > (-1 + var0 + var8)) {
                  var23 = var21 + 1 - var0 - var8;
                }
              } else {
                var23 = var8 - var21;
              }

              if ((var4 <= var22)) {
                if (var22 > (-1 + var4 + var6)) {
                  var24 = -var4 - var6 + 1 + var22;
                }
              } else {
                var24 = -var22 + var4;
              }

              int var25 = var23 * var23 + var24 * var24;
              if (var25 < var18 || (var18 == var25)
                && TriChromaticImageCache.anIntArrayArray1373[var21][var22] < var19) {
                var13 = var22;
                var19 = TriChromaticImageCache.anIntArrayArray1373[var21][var22];
                var18 = var25;
                var12 = var21;
              }
            }
          }
        }

        if ((var18 == 1000)) {
          return false;
        }

        if (var11 == var12 && (var13 == var3)) {
          return false;
        }

        AbstractFrameRegulator.anInt1692 = 1;
      }

      byte var28 = 0;
      TextureSampler38.anIntArray3456[var28] = var12;
      var15 = var28 + 1;
      DummyClass38.anIntArray729[var28] = var13;
      var18 = var19 = DummyClass51.anIntArrayArray1160[var12][var13];
      if (var10 <= 2) {
        MapScene.aClass94_60 = null;
      }

      for (;
           (var11 != var12) || (var3 != var13);
           var18 = DummyClass51.anIntArrayArray1160[var12][var13]) {
        if (var19 != var18) {
          TextureSampler38.anIntArray3456[var15] = var12;
          DummyClass38.anIntArray729[var15++] = var13;
          var19 = var18;
        }

        if ((var18 & 2) != 0) {
          ++var12;
        } else if (((8 & var18) != 0)) {
          --var12;
        }

        if ((var18 & 1) == 0) {
          if (((var18 & 4) != 0)) {
            --var13;
          }
        } else {
          ++var13;
        }
      }

      if ((var15 <= 0)) {
        return var9 != 1;
      } else {
        TextureSampler7.method299(113, var15, var9);
        return true;
      }
  }

  public static void method78(int var0, boolean var1, int var2) {
    ++FileUnpacker.anInt1944;
      TextureSampler12.secureBuffer.writePacket(132);
      TextureSampler12.secureBuffer.method775(var2, 1437452424);
      if (!var1) {
        TextureSampler12.secureBuffer.writeShortLE(-1, var0);
      }
  }

  public static void method80(int var0) {
    MapScene.aClass94_60 = null;
      MapScene.aShortArray63 = null;
      if (var0 != -27401) {
        MapScene.anInt65 = 93;
      }

      MapScene.aClass94_68 = null;
      MapScene.anInterface5Array70 = null;
      MapScene.aClass94_62 = null;
  }

  public static void method81(byte var0, Widget var1) {
    if (var0 != -128) {
        MapScene.method75(null, true, 21);
      }

      int var2 = var1.anInt189;
      if (var2 == 324) {
        if (TextureSampler37.anInt3260 == -1) {
          TextureSampler37.anInt3260 = var1.anInt224;
          DummyClass51.anInt1165 = var1.anInt296;
        }

        if (DummyClass49.aClass52_1112.aBoolean864) {
          var1.anInt224 = TextureSampler37.anInt3260;
        } else {
          var1.anInt224 = DummyClass51.anInt1165;
        }

      } else {
        if ((var2 == 325)) {
          if (TextureSampler37.anInt3260 == -1) {
            DummyClass51.anInt1165 = var1.anInt296;
            TextureSampler37.anInt3260 = var1.anInt224;
          }

          if (DummyClass49.aClass52_1112.aBoolean864) {
            var1.anInt224 = DummyClass51.anInt1165;
          } else {
            var1.anInt224 = TextureSampler37.anInt3260;
          }

        } else {
          if (var2 == 327) {
            var1.rotationX0 = 150;
            var1.rotationY =
                2047 & (int) (Math.sin(AbstractGameWorld.updateCycle / 40.0D)
                    * 256.0D);
            var1.anInt202 = 5;
            var1.anInt201 = -1;
          } else if (var2 == 328) {
            if (TextureCache.localPlayer.name == null) {
              var1.anInt201 = 0;
            } else {
              var1.rotationX0 = 150;
              var1.rotationY =
                  2047 & (int) (256.0D * Math
                      .sin(AbstractGameWorld.updateCycle / 40.0D));
              var1.anInt202 = 5;
              var1.anInt201 =
                  2047 + ((int) TextureCache.localPlayer.name.toBase37() << 11);
              var1.anInt260 = TextureCache.localPlayer.anInt2793;
              var1.anInt267 = 0;
              var1.anInt305 = TextureCache.localPlayer.anInt2764;
              var1.anInt283 = TextureCache.localPlayer.anInt2813;
            }
          }
        }
      }
  }

}
