package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.opengl.GlTexture2d;
import java.awt.Component;

public final class DummyClass43 {

  public static int anInt909 = -1;
  public static GameString COMMAND_FPS_ON = GameStringStatics.create("::fpson");
  public static int[][][] anIntArrayArrayArray911 = new int[2][][];
  public static int[] anIntArray912 = new int[14];
  public static boolean aBoolean913;
  public static int[][][] somethingHeightMap;
  public static Interface4 anInterface4_915;
  public static int anInt916;
  public static OndemandRequester ondemandRequester;


  public static void method1193(int var0) {
    DummyClass43.anInterface4_915 = null;
      DummyClass43.anIntArrayArrayArray911 = null;
      DummyClass43.somethingHeightMap = null;
      DummyClass43.ondemandRequester = null;
      DummyClass43.anIntArray912 = null;

      DummyClass43.COMMAND_FPS_ON = null;
  }

  public static void method1194(int var0) {
    if (var0 == -16385) {
        if (SomethingWorldMappy.audioOutputStream1 != null) {
          SomethingWorldMappy.audioOutputStream1.process((byte) -34);
        }

        if (GameWorld.audioOutputStream0 != null) {
          GameWorld.audioOutputStream0.process((byte) -34);
        }

      }
  }

  public static AbstractAudioOutputStream createAudioOutputStream(int var0, SignLink var1,
                                                                 Component var2, int var3,
                                                                 int var4) {
    if (DummyClass60.sampleRate == 0) {
        throw new IllegalStateException();
      } else if (var3 >= 0 && var3 < 2) {
        if ((var0 < 256)) {
          var0 = 256;
        }

        try {
          AbstractAudioOutputStream var9 =
            (AbstractAudioOutputStream) Class.forName(
                "com.jagex.runescape.BufferedAudioOutputStream").newInstance();
          var9.sampleRate = var0;
          var9.samples = new int[(!GlobalStatics_0.stereo ? 1 : 2) * 256];
          var9.bind(var2);
          var9.sampleBufferSize = (var0 & 0xfffffc00) + 1024;
          if ((var9.sampleBufferSize > 16384)) {
            var9.sampleBufferSize = 16384;
          }

          var9.setBufferSize(var9.sampleBufferSize);
          if (AudioStreamEncoder4.anInt3507 > 0 && DummyClass36.aClass15_2613
              == null) {
            DummyClass36.aClass15_2613 = new AudioWorker();
            DummyClass36.aClass15_2613.aClass87_350 = var1;
            var1.createThread(0, AudioStreamEncoder4.anInt3507, DummyClass36.aClass15_2613);
          }

          if (DummyClass36.aClass15_2613 != null) {
            if (DummyClass36.aClass15_2613.aClass155Array352[var3] != null) {
              throw new IllegalArgumentException();
            }

            DummyClass36.aClass15_2613.aClass155Array352[var3] = var9;
          }

          return var9;
        } catch (Throwable var7) {
          if (var4 != 14) {
            DummyClass43.anInt909 = 124;
          }

          try {
            SignLinkAudioOutputStream var5 = new SignLinkAudioOutputStream(var1, var3);
            var5.samples = new int[256 * (GlobalStatics_0.stereo ? 2 : 1)];
            var5.sampleRate = var0;
            var5.bind(var2);
            var5.sampleBufferSize = 16384;
            var5.setBufferSize(var5.sampleBufferSize);
            if ((AudioStreamEncoder4.anInt3507 > 0) &&
                DummyClass36.aClass15_2613 == null) {
              DummyClass36.aClass15_2613 = new AudioWorker();
              DummyClass36.aClass15_2613.aClass87_350 = var1;
              var1.createThread(var4 ^ 14, AudioStreamEncoder4.anInt3507,
                DummyClass36.aClass15_2613);
            }

            if (DummyClass36.aClass15_2613 != null) {
              if (DummyClass36.aClass15_2613.aClass155Array352[var3] != null) {
                throw new IllegalArgumentException();
              }

              DummyClass36.aClass15_2613.aClass155Array352[var3] = var5;
            }

            return var5;
          } catch (Throwable var6) {
            return new AbstractAudioOutputStream();
          }
        }
      } else {
        throw new IllegalArgumentException();
      }
  }

  public static void method1196(int var0, int var1, byte var2, int var3, int var4) {
    GlTexture2d.anInt3765 = var4;
      if (var2 != 111) {
        DummyClass43.aBoolean913 = true;
      }

      DummyClass55.anInt1425 = var1;
      DummyClass13.anInt2020 = var0;
      LightIntensity.anInt902 = var3;
  }

  public static void method1197(FileUnpacker var0, byte var1) {
    if (var1 != 69) {
        DummyClass43.createAudioOutputStream(-53, null, null, 79, 12);
      }

      DummyClass39.aClass153_737 = var0;
  }

}
