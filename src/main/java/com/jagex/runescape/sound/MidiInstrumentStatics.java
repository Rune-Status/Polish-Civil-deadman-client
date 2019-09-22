package com.jagex.runescape.sound;

public class MidiInstrumentStatics {

  public static int anInt2396;
  public static boolean[] aBooleanArray2393;
  public static int anInt2402;
  public static int[] anIntArray2420;
  public static SomethingMidiOther[] aClass150Array2398;
  public static SomethingMidiI[] aClass59Array2407;
  public static SomethingMidik[] aClass152Array2392;
  public static float[] aFloatArray2403;
  public static float[] aFloatArray2399;
  public static float[] aFloatArray2400;
  public static float[] aFloatArray2387;
  public static float[] aFloatArray2413;
  public static float[] aFloatArray2388;
  public static float[] aFloatArray2416;
  public static int[] anIntArray2409;
  public static int[] anIntArray2391;
  public static byte[] aByteArray2417;
  public static int anInt2404;
  public static int anInt2414;

  public static void setSomething(byte[] var0, int var1) {
    MidiInstrumentStatics.aByteArray2417 = var0;
    MidiInstrumentStatics.anInt2404 = var1;
    MidiInstrumentStatics.anInt2414 = 0;
  }

  public static int method364() {
    int var0 =
        MidiInstrumentStatics.aByteArray2417[MidiInstrumentStatics.anInt2404]
            >> MidiInstrumentStatics.anInt2414
            & 1;
    ++MidiInstrumentStatics.anInt2414;
    MidiInstrumentStatics.anInt2404 += MidiInstrumentStatics.anInt2414 >> 3;
    MidiInstrumentStatics.anInt2414 &= 7;
    return var0;
  }

  public static int method513(int var0, int var1) {
    int var2 = 0;
    if (var0 < 0 || var0 >= 65536) {
      var2 += 16;
      var0 >>>= 16;
    }

    if (var0 >= 256) {
      var2 += 8;
      var0 >>>= 8;
    }

    if (var0 >= 16) {
      var2 += 4;
      var0 >>>= 4;
    }

    if (var1 <= var0) {
      var0 >>>= 2;
      var2 += 2;
    }

    if (var0 >= 1) {
      var0 >>>= 1;
      ++var2;
    }

    return var0 + var2;
  }
}
