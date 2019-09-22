package com.jagex.runescape.sound;

public final class SomethingMidiOther {

  public int anInt1928;
  public int[] anIntArray1929;
  public int[] anIntArray1930;
  public int anInt1931;

  public SomethingMidiOther() {
    SomethingMidiInstrumentStatics.method368(16);
    this.anInt1931 =
        MidiInstrumentStatics.method364() != 0 ? SomethingMidiInstrumentStatics
            .method368(4) + 1 : 1;
    if (MidiInstrumentStatics.method364() != 0) {
      SomethingMidiInstrumentStatics.method368(8);
    }

    SomethingMidiInstrumentStatics.method368(2);
    if (this.anInt1931 > 1) {
      this.anInt1928 = SomethingMidiInstrumentStatics.method368(4);
    }

    this.anIntArray1929 = new int[this.anInt1931];
    this.anIntArray1930 = new int[this.anInt1931];

    for (int var1 = 0; var1 < this.anInt1931; ++var1) {
      SomethingMidiInstrumentStatics.method368(8);
      this.anIntArray1929[var1] = SomethingMidiInstrumentStatics.method368(8);
      this.anIntArray1930[var1] = SomethingMidiInstrumentStatics.method368(8);
    }

  }
}
