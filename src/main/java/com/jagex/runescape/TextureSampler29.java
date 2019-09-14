package com.jagex.runescape;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.opengl.GlEnvironment;

public final class TextureSampler29 extends AbstractTextureSampler {

  private static GameString aClass94_3400 = GameStringStatics.create("Take");
  public static byte[][][] aByteArrayArrayArray3390;
  public static GameString[] aClass94Array3391;
  public static SomethingPacket116[] aClass133Array3393 = new SomethingPacket116[6];
  public static GameString aClass94_3394 = GameStringStatics.create("<col=ffb000>");
  public static int anInt3395;
  public static byte[] aByteArray3396;
  public static volatile int anInt3398;
  public static GameString aClass94_3399 = GameStringStatics.create("<br>(X");
  public static GameString aClass94_3401 = GameStringStatics.create("Weiter");
  public static GameString aClass94_3397 = TextureSampler29.aClass94_3400;
  private AbstractSomethingTexture[] aClass75Array3392;

  public TextureSampler29() {
    super(0, true);
  }

  public int[] method154(int var1, byte var2 ) {
    int var4 = -75 % ((30 - var2) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        this.method323(-60, this.monoChromaticImageCache.method1710((byte) 124));
      }

      return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var1 == 0) {
        this.aClass75Array3392 = new AbstractSomethingTexture[var2.readUnsignedByte()];

        for (int var4 = 0; this.aClass75Array3392.length > var4; ++var4) {
          int var5 = var2.readUnsignedByte();
          if (var5 == 0) {
            this.aClass75Array3392[var4] = FileSystem.method843(-5232, var2);
          } else if ((var5 == 1)) {
            this.aClass75Array3392[var4] = StillGraphicNode.method536((byte) 54, var2);
          } else if (var5 != 2) {
            if (var5 == 3) {
              this.aClass75Array3392[var4] = ClanChatUser.method384(var2, (byte) 80);
            }
          } else {
            this.aClass75Array3392[var4] = AudioSomethingSomething.method404((byte) -110, var2);
          }
        }
      } else if (var1 == 1) {
        this.monoChromatic = var2.readUnsignedByte() == 1;
      }

      if (!var3) {
        this.method323(124, null);
      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 == -1) {
        int[][] var3 = this.triChromaticImageCache
            .method1594((byte) -117, var2);
        if (this.triChromaticImageCache.aBoolean1379) {
          int var4 = SomethingLight0.anInt1559;
          int var5 = DummyClass55.anInt1427;
          int[][] var6 = new int[var5][var4];
          int[][][] var7 = this.triChromaticImageCache.method1589((byte) -56);
          this.method323(-60, var6);

          for (int var8 = 0; var8 < DummyClass55.anInt1427; ++var8) {
            int[] var9 = var6[var8];
            int[][] var10 = var7[var8];
            int[] var11 = var10[0];
            int[] var12 = var10[1];
            int[] var13 = var10[2];

            for (int var14 = 0; (var14 < SomethingLight0.anInt1559); ++var14) {
              int var15 = var9[var14];
              var13[var14] = (255 & var15) << 4;
              var12[var14] = 4080 & var15 >> 4;
              var11[var14] = var15 >> 12 & 4080;
            }
          }
        }

        return var3;
      } else {
        return null;
      }
  }

  private void method323(int var1, int[][] var2) {
    int var4 = DummyClass55.anInt1427;
      int var3 = SomethingLight0.anInt1559;
      TextureSampler20.method230(var2, true);
      DummyClass43.method1196(0, 0, (byte) 111, TriChromaticImageBuffer.anInt2487,
        RenderAnimation.anInt396);
      if (this.aClass75Array3392 != null) {
        for (int var5 = 0; this.aClass75Array3392.length > var5; ++var5) {
          AbstractSomethingTexture var6 = this.aClass75Array3392[var5];
          int var7 = var6.anInt1101;
          int var8 = var6.anInt1104;
          if (var7 >= 0) {
            if ((var8 < 0)) {
              var6.method1341(2, var3, var4);
            } else {
              var6.method1335(var4, var3, 4898);
            }
          } else if ((var8 >= 0)) {
            var6.method1337(var4, true, var3);
          }
        }
      }

      if (var1 != -60) {
        TextureSampler29.getByteLength(null);
      }
  }

  public static int method322(boolean var0, byte var1) {
    return !var0 ? 104 : 255 & var1;
  }

  public static void setupDefaultSun(int brightness) {
    GlEnvironment.setSunColor(GlEnvironment.defaultSunColor,
        (0.7F + brightness * 0.1F) * 1.1523438F, 0.69921875F, 0.69921875F);
      GlEnvironment.setSunPosition(-50.0f, -60.0f, -50.0f);
      GlEnvironment.setFogColor(GlEnvironment.defaultFogColor, 0);
      GlEnvironment.updateSunPosition();
  }

  public static void method325(int var0) {
    TextureSampler29.aClass94_3401 = null;
      TextureSampler29.aByteArrayArrayArray3390 = null;
      if (var0 == 0) {
        TextureSampler29.aByteArray3396 = null;
        TextureSampler29.aClass133Array3393 = null;
        TextureSampler29.aClass94_3400 = null;
        TextureSampler29.aClass94Array3391 = null;
        TextureSampler29.aClass94_3397 = null;
        TextureSampler29.aClass94_3399 = null;
        TextureSampler29.aClass94_3394 = null;
      }
  }

  public static int getByteLength(GameString var1) {
    return var1.getLength() + 1;
  }

  public static void method327(int var0, int var1, byte var2) {
    if (var2 != 68) {
        TextureSampler29.aClass94_3397 = null;
      }

      WidgetUpdate var3 = AudioStreamEncoder3.method466(var2 - 64, 12, var1);
      var3.g((byte) 33);
      var3.anInt3598 = var0;
  }

}
