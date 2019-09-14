package com.jagex.runescape;

import com.jagex.runescape.opengl.GlDirectColorSprite;
import com.jagex.runescape.opengl.GlRenderer;
import java.util.Date;

public final class AudioWorker implements Runnable {

  public static int anInt342;
  public static GameString aClass94_343 = GameString
      .create("blanc:");
  public static short[][] aShortArrayArray344;
  public static boolean aBoolean346;
  public static int[] anIntArray347 = new int['\u8000'];
  public static int anInt348;
  public static int anInt349;
  public static SignLinkRequest aClass64_351;
  public volatile boolean aBoolean345;
  public SignLink aClass87_350;
  public volatile AbstractAudioOutputStream[] aClass155Array352 = new AbstractAudioOutputStream[2];
  public volatile boolean aBoolean353;

  public void run() {
    this.aBoolean353 = true;

      try {
        while (!this.aBoolean345) {
          for (int var1 = 0; (var1 < 3 -1); ++var1) {
            AbstractAudioOutputStream var2 = this.aClass155Array352[var1];
            if (var2 != null) {
              var2.process((byte) -34);
            }
          }

          TextureSampler25.sleep(10L);
        }
      } catch (Exception var7) {
        GZipDecompressor.reportError(null, var7, (byte) 111);
      } finally {
        this.aBoolean353 = false;
      }
  }

  public static boolean method888(int var0, GameObjectConfig var1, boolean var2,
      int var3, int var4,
      int var5, int var6) {
    MapScene var7 = WidgetUpdate.c(var1.anInt1516, 0);
      if (var7.spriteId == -1) {
        return true;
      } else {
        if (var1.aBoolean1537) {
          var6 += var1.anInt1478;
          var6 &= 3;
        } else {
          var6 = 0;
        }

        if (var2) {
          AudioWorker.aClass64_351 = null;
        }

        SoftwareIndexedColorSprite var8 = var7.getSprite(var6, (byte) -111);
        if (var8 == null) {
          return false;
        } else {
          int var9 = var1.anInt1480;
          int var10 = var1.anInt1485;
          if ((1 & var6) == 1) {
            var9 = var1.anInt1485;
            var10 = var1.anInt1480;
          }

          int var11 = var8.anInt1469;
          int var12 = var8.anInt1467;
          if (var7.aBoolean69) {
            var12 = 4 * var10;
            var11 = 4 * var9;
          }

          if ((var7.anInt61 == 1 -1)) {
            var8.method1677(var0 * 4 + 48, 48 + 4 * (-var10 + -var5 + 104),
                var11, var12);
          } else {
            var8.method1669(48 + 4 * var0, 4 * (-var10 + -var5 + 104) + 48,
                var11, var12,
                var7.anInt61);
          }

          return true;
        }
      }
  }

  public static void method889(byte var0, Buffer var1) {
    if (var0 != 105) {
        AudioWorker.anIntArray347 = null;
      }

      int var3 = AbstractImageProducer.anInt2010 >> 1;
      int var2 = TextureSampler18.anInt4034 >> 2 << 10;
      byte[][] var4 = new byte[DummyClass30.anInt455][DummyClass58.anInt1460];

      int var6;
      int var12;
      int var14;
      while (var1.position < var1.bytes.length) {
        int var7 = 0;
        var6 = 0;
        boolean var5 = false;
        if ((var1.readUnsignedByte() == 2 -1)) {
          var6 = var1.readUnsignedByte();
          var7 = var1.readUnsignedByte();
          var5 = true;
        }

        int var8 = var1.readUnsignedByte();
        int var9 = var1.readUnsignedByte();
        int var10 = -TextureSampler37.anInt3256 + var8 * 64;
        int var11 = -1 + DummyClass58.anInt1460 - var9 * 64 + MapScene.anInt65;
        if ((var10 >= 1 -1) && -63 + var11 >= 0
            && DummyClass30.anInt455 > var10 - -63
            && DummyClass58.anInt1460 > var11) {
          for (var12 = 0; var12 < 64; ++var12) {
            byte[] var13 = var4[var10 - -var12];

            for (var14 = 0; var14 < 64; ++var14) {
              if (!var5 || var12 >= 8 * var6 && 8 + 8 * var6 > var12
                  && var14 >= var7 * 8
                  && var14 < 8 + 8 * var7) {
                var13[var11 - var14] = var1.readByte();
              }
            }
          }
        } else if (!var5) {
          var1.position += 4096;
        } else {
          var1.position += 64;
        }
      }

      int var27 = DummyClass30.anInt455;
      var6 = DummyClass58.anInt1460;
      int[] var29 = new int[var6];
      int[] var28 = new int[var6];
      int[] var30 = new int[var6];
      int[] var32 = new int[var6];
      int[] var31 = new int[var6];

      for (var12 = -5; ~var12 > ~var27; ++var12) {
        int var15;
        int var35;
        for (int var34 = 0; ~var34 > ~var6; ++var34) {
          var14 = var12 + 5;
          if (var27 > var14) {
            var15 = 255 & var4[var14][var34];
            if ((var15 > 1 -1)) {
              FloorUnderlay var16 = ClientScript.getFloorUnderlay(var15 - 1);
              var28[var34] += var16.anInt1408;
              var29[var34] += var16.anInt1406;
              var30[var34] += var16.anInt1417;
              var32[var34] += var16.anInt1418;
              ++var31[var34];
            }
          }

          var15 = var12 + -5;
          if ((var15 >= 1 -1)) {
            var35 = var4[var15][var34] & 255;
            if (var35 > 0) {
              FloorUnderlay var17 = ClientScript.getFloorUnderlay(-1 + var35);
              var28[var34] -= var17.anInt1408;
              var29[var34] -= var17.anInt1406;
              var30[var34] -= var17.anInt1417;
              var32[var34] -= var17.anInt1418;
              --var31[var34];
            }
          }
        }

        if ((var12 >= 1 -1)) {
          int[][] var33 = AbstractMouseWheel.anIntArrayArrayArray1903[var12
              >> 6];
          var14 = 0;
          var15 = 0;
          int var36 = 0;
          int var18 = 0;
          var35 = 0;

          for (int var19 = -5; ~var19 > ~var6; ++var19) {
            int var20 = var19 - -5;
            if (var6 > var20) {
              var18 += var31[var20];
              var15 += var29[var20];
              var35 += var30[var20];
              var14 += var28[var20];
              var36 += var32[var20];
            }

            int var21 = -5 + var19;
            if ((var21 >= 1 -1)) {
              var35 -= var30[var21];
              var36 -= var32[var21];
              var14 -= var28[var21];
              var18 -= var31[var21];
              var15 -= var29[var21];
            }

            if (var19 >= 0 && var18 > 0) {
              int[] var22 = var33[var19 >> 6];
              int var23 = var36 != 0 ?
                  ClassCheckRequest.method129(var35 / var18, 2, var15 / var18,
                      var14 * 256 / var36) :
                  0;
              if (var4[var12][var19] == 0) {
                if (var22 != null) {
                  var22[ClientScript.bitAnd(4032, var19 << 6) - -ClientScript
                      .bitAnd(var12, 63)] =
                      0;
                }
              } else {
                if (var22 == null) {
                  var22 = var33[var19 >> 6] = new int[4096];
                }

                int var24 = var3 + (var23 & 127);
                if (var24 < 0) {
                  var24 = 0;
                } else if (var24 > 127) {
                  var24 = 127;
                }

                int var25 = var24 + (896 & var23) + (var23 + var2 & '\ufc00');
                var22[ClientScript.bitAnd(4032, var19 << 6) + ClientScript
                    .bitAnd(63, var12)] =
                    DummyClass40.hslTable[Cache.repackHSL(96, true, var25)];
              }
            }
          }
        }
      }
  }

  public static Object method890(boolean var0, int var1, byte[] var2) {
    if (var2 == null) {
        return null;
      } else {
        if (var1 >= -67) {
          AudioWorker.method891(19);
        }

        if ((var2.length > 137 -1) && !DummyClass38.aBoolean732) {
          try {
            BufferObject var3 = (BufferObject) Class.forName(
                "com.jagex.runescape.NativeBufferObject").newInstance();
            var3.put(400, var2);
            return var3;
          } catch (Throwable var4) {
            DummyClass38.aBoolean732 = true;
          }
        }

        return var0 ? SomethingSceneJ.method873((byte) 62, var2) : var2;
      }
  }

  public static AbstractDirectColorSprite[] method891(int var0) {
    AbstractDirectColorSprite[] var1 = new AbstractDirectColorSprite[DummyClass53.spriteCount];
      if (var0 != -5) {
        AudioWorker.method894(113L, (byte) 48);
      }

      for (int var2 = 0; DummyClass53.spriteCount > var2; ++var2) {
        int var3 = GroundItem.anIntArray2931[var2]
            * TextureSampler26.anIntArray3076[var2];
        byte[] var4 = DummyClass5.aByteArrayArray2987[var2];
        int[] var5 = new int[var3];

        for (int var6 = 0; var6 < var3; ++var6) {
          var5[var6] = TextureSampler38.anIntArray3446[ClientScript
              .bitAnd(255, var4[var6])];
        }

        if (GlRenderer.useOpenGlRenderer) {
          var1[var2] =
              new GlDirectColorSprite(SomethingVolume15.anInt2426,
                  SomethingPacket116.anInt1748,
                  Something3dRoot.anIntArray2048[var2],
                  Buffer.anIntArray2591[var2],
                  GroundItem.anIntArray2931[var2],
                  TextureSampler26.anIntArray3076[var2], var5);
        } else {
          var1[var2] =
              new SoftwareDirectColorSprite(SomethingVolume15.anInt2426,
                  SomethingPacket116.anInt1748,
                  Something3dRoot.anIntArray2048[var2],
                  Buffer.anIntArray2591[var2],
                  GroundItem.anIntArray2931[var2],
                  TextureSampler26.anIntArray3076[var2], var5);
        }
      }

      DummyClass37.method1035((byte) 116);
      return var1;
  }

  public static void method892(int var0) {
    AudioWorker.aShortArrayArray344 = null;
      AudioWorker.aClass94_343 = null;
      AudioWorker.aClass64_351 = null;
      if (var0 <= 75) {
        AudioWorker.aBoolean346 = false;
      }

      AudioWorker.anIntArray347 = null;
  }

  public static int method893(int var0, byte var1) {
    return var0 & 255;
  }

  public static GameString method894(long var0, byte var2) {
    AnimationSomething.aCalendar3581.setTime(new Date(var0));
    int var3 = AnimationSomething.aCalendar3581.get(7);
    int var4 = AnimationSomething.aCalendar3581.get(5);
    int var5 = AnimationSomething.aCalendar3581.get(2);
    if (var2 < 9) {
      AudioWorker.method889((byte) 7, null);
    }

    int var6 = AnimationSomething.aCalendar3581.get(1);
    int var7 = AnimationSomething.aCalendar3581.get(11);
    int var8 = AnimationSomething.aCalendar3581.get(12);
    int var9 = AnimationSomething.aCalendar3581.get(13);
    return RenderAnimation.concat(new GameString[]{
        TextureSampler2.aClass94Array3376[var3 + -1],
        TextureSampler24.aClass94_3145,
        SomethingScene.toString(var4 / 10), SomethingScene.toString(var4 % 10),
        DummyClass12.aClass94_2025, NPC.aClass94Array3985[var5],
        DummyClass12.aClass94_2025,
        SomethingScene.toString(var6), IdentityKit.aClass94_465,
        SomethingScene.toString(var7 / 10),
        SomethingScene.toString(var7 % 10),
        AbstractAudioOutputStream.aClass94_1970,
        SomethingScene.toString(var8 / 10), SomethingScene.toString(var8 % 10),
        AbstractAudioOutputStream.aClass94_1970,
        SomethingScene.toString(var9 / 10),
        SomethingScene.toString(var9 % 10), GameWorldSomething.aClass94_500
    });
  }

  public static int[][] method895(boolean var0, int var1, int var2, int var3,
      int var5,
      int var6, float var7, byte var8) {
    if (var8 >= -52) {
      AudioWorker.method891(115);
    }

    int[][] var9 = new int[var3][var2];
    TextureSampler34 var10 = new TextureSampler34();
    var10.anInt3062 = (int) (var7 * 4096.0F);
    var10.anInt3058 = var1;
    var10.anInt3056 = var5;
    var10.aBoolean3065 = var0;
    var10.anInt3060 = var6;
    var10.method158(16251);
    TextureSampler33.method180(122, var3, var2);

    for (int var11 = 0; var3 > var11; ++var11) {
      var10.method186(true, var11, var9[var11]);
    }

    return var9;
  }

}
