package com.jagex.runescape.sound.midi;

import com.jagex.runescape.buffer.Buffer;
import com.jagex.runescape.cache.FileUnpacker;
import com.jagex.runescape.sound.effect.SoundEffect;

public class MidiSomethingStatics {

  public static boolean aBoolean2405;
  public static SomethingMidiInstrument[] aClass71Array2406;

  public static MidiInstrument method363(FileUnpacker var0, int var1,
      int var2) {
    if (MidiSomethingStatics.method362(var0)) {
      byte[] var3 = var0.getBytes(var1, var2);
      return var3 == null ? null : new MidiInstrument(var3);
    } else {
      var0.method2129((byte) 95, var2, var1);
      return null;
    }
  }

  public static SoundEffect method1811(FileUnpacker var0, int var1, int var2) {
    byte[] var3 = var0.getBytes(var1, var2);
    return var3 == null ? null : new SoundEffect(new Buffer(var3));
  }

  public static boolean method362(FileUnpacker var0) {
    if (!MidiSomethingStatics.aBoolean2405) {
      byte[] var1 = var0.getBytes(0, 0);
      if (var1 == null) {
        return false;
      }

      MidiSomethingStatics.method367(var1);
      MidiSomethingStatics.aBoolean2405 = true;
    }

    return true;
  }

  public static void method367(byte[] var0) {
    MidiInstrumentStatics.setSomething(var0, 0);
    MidiInstrumentStatics.anInt2402 =
        1 << SomethingMidiInstrumentStatics.method368(4);
    MidiInstrumentStatics.anInt2396 =
        1 << SomethingMidiInstrumentStatics.method368(4);
    MidiInstrumentStatics.aFloatArray2403 = new float[MidiInstrumentStatics.anInt2396];

    int var1;
    int var2;
    int var3;
    int var4;
    int var5;
    for (var1 = 0; var1 < 2; ++var1) {
      var2 = var1 != 0 ? MidiInstrumentStatics.anInt2396
          : MidiInstrumentStatics.anInt2402;
      var3 = var2 >> 1;
      var4 = var2 >> 2;
      var5 = var2 >> 3;
      float[] var6 = new float[var3];

      for (int var7 = 0; var7 < var4; ++var7) {
        var6[2 * var7] = (float) Math.cos(
            (4 * var7) * 3.141592653589793D / var2);
        var6[2 * var7 + 1] =
            -((float) Math.sin((4 * var7) * 3.141592653589793D / var2));
      }

      float[] var13 = new float[var3];

      for (int var8 = 0; var8 < var4; ++var8) {
        var13[2 * var8] =
            (float) Math.cos((2 * var8 + 1) * 3.141592653589793D / (2 * var2));
        var13[2 * var8 + 1] =
            (float) Math.sin((2 * var8 + 1) * 3.141592653589793D / (2 * var2));
      }

      float[] var14 = new float[var4];

      for (int var9 = 0; var9 < var5; ++var9) {
        var14[2 * var9] =
            (float) Math.cos((4 * var9 + 2) * 3.141592653589793D / var2);
        var14[2 * var9 + 1] =
            -((float) Math.sin((4 * var9 + 2) * 3.141592653589793D / var2));
      }

      int[] var15 = new int[var5];
      int var10 = MidiInstrumentStatics.method513(var5 - 1, 4);

      for (int var11 = 0; var11 < var5; ++var11) {
        var15[var11] = MidiSomethingStatics.method540(var10, -14314, var11);
      }

      if (var1 == 0) {
        MidiInstrumentStatics.aFloatArray2400 = var6;
        MidiInstrumentStatics.aFloatArray2413 = var13;
        MidiInstrumentStatics.aFloatArray2416 = var14;
        MidiInstrumentStatics.anIntArray2391 = var15;
      } else {
        MidiInstrumentStatics.aFloatArray2399 = var6;
        MidiInstrumentStatics.aFloatArray2387 = var13;
        MidiInstrumentStatics.aFloatArray2388 = var14;
        MidiInstrumentStatics.anIntArray2409 = var15;
      }
    }

    var1 = SomethingMidiInstrumentStatics.method368(8) + 1;
    MidiSomethingStatics.aClass71Array2406 = new SomethingMidiInstrument[var1];

    for (var2 = 0; var2 < var1; ++var2) {
      MidiSomethingStatics.aClass71Array2406[var2] = new SomethingMidiInstrument();
    }

    var2 = SomethingMidiInstrumentStatics.method368(6) + 1;

    for (var3 = 0; var3 < var2; ++var3) {
      SomethingMidiInstrumentStatics.method368(16);
    }

    var2 = SomethingMidiInstrumentStatics.method368(6) + 1;
    MidiInstrumentStatics.aClass59Array2407 = new SomethingMidiI[var2];

    for (var3 = 0; var3 < var2; ++var3) {
      MidiInstrumentStatics.aClass59Array2407[var3] = new SomethingMidiI();
    }

    var3 = SomethingMidiInstrumentStatics.method368(6) + 1;
    MidiInstrumentStatics.aClass152Array2392 = new SomethingMidik[var3];

    for (var4 = 0; var4 < var3; ++var4) {
      MidiInstrumentStatics.aClass152Array2392[var4] = new SomethingMidik();
    }

    var4 = SomethingMidiInstrumentStatics.method368(6) + 1;
    MidiInstrumentStatics.aClass150Array2398 = new SomethingMidiOther[var4];

    for (var5 = 0; var5 < var4; ++var5) {
      MidiInstrumentStatics.aClass150Array2398[var5] = new SomethingMidiOther();
    }

    var5 = SomethingMidiInstrumentStatics.method368(6) + 1;
    MidiInstrumentStatics.aBooleanArray2393 = new boolean[var5];
    MidiInstrumentStatics.anIntArray2420 = new int[var5];

    for (int var12 = 0; var12 < var5; ++var12) {
      MidiInstrumentStatics.aBooleanArray2393[var12] =
          MidiInstrumentStatics.method364() != 0;
      SomethingMidiInstrumentStatics.method368(16);
      SomethingMidiInstrumentStatics.method368(16);
      MidiInstrumentStatics.anIntArray2420[var12] = SomethingMidiInstrumentStatics
          .method368(8);
    }

  }

  public static int method540(int var0, int var1, int var2) {
    if (var1 == -14314) {
      int var3;
      for (var3 = 0; var0 > 0; --var0) {
        var3 = var3 << 1 | 1 & var2;
        var2 >>>= 1;
      }

      return var3;
    } else {
      return 116;
    }
  }
}
