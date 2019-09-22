package com.jagex.runescape.sound;

public class SomethingMidiInstrumentStatics {

  public static float method358(int var0) {
    int var1 = var0 & 2097151;
    int var2 = var0 & Integer.MIN_VALUE;
    int var3 = (var0 & 2145386496) >> 21;
    if (var2 != 0) {
      var1 = -var1;
    }

    return (float) (var1 * Math.pow(2.0D, var3 - 788));
  }

  public static int method368(int var0) {
    int var1 = 0;

    int var2;
    int var3;
    for (var2 = 0; var0 >= 8 - MidiInstrumentStatics.anInt2414; var0 -= var3) {
      var3 = 8 - MidiInstrumentStatics.anInt2414;
      int var4 = (1 << var3) - 1;
      var1 += (
          MidiInstrumentStatics.aByteArray2417[MidiInstrumentStatics.anInt2404]
              >> MidiInstrumentStatics.anInt2414
              & var4) << var2;
      MidiInstrumentStatics.anInt2414 = 0;
      ++MidiInstrumentStatics.anInt2404;
      var2 += var3;
    }

    if (var0 > 0) {
      var3 = (1 << var0) - 1;
      var1 += (
          MidiInstrumentStatics.aByteArray2417[MidiInstrumentStatics.anInt2404]
              >> MidiInstrumentStatics.anInt2414
              & var3) << var2;
      MidiInstrumentStatics.anInt2414 += var0;
    }

    return var1;
  }

  public static int method1291(int var0, int var1) {
    int var2;
    for (
        var2 = (int) Math.pow(var0, 1.0D / var1) + 1;
        SomethingMidiInstrumentStatics.method2028(var1, var2, -122) > var0; --var2) {
    }

    return var2;
  }

  public static int method2028(int var0, int var1, int var2) {
    int var3 = 96 / ((var2 + 75) / 33);

    int var4;
    for (var4 = 1; var0 > 1; var0 >>= 1) {
      if ((1 & var0) != 0) {
        var4 *= var1;
      }

      var1 *= var1;
    }

    if (var0 == 1) {
      return var4 * var1;
    } else {
      return var4;
    }
  }
}
