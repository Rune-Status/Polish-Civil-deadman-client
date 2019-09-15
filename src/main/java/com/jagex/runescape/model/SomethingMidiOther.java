package com.jagex.runescape.model;

import com.jagex.runescape.statics.GlobalStatics_11;

public final class SomethingMidiOther {

  public int anInt1928;
  public int[] anIntArray1929;
  public int[] anIntArray1930;
  public int anInt1931;


  public SomethingMidiOther() {
    GlobalStatics_11.method368(16);
    this.anInt1931 = GlobalStatics_11.method364() != 0 ? GlobalStatics_11.method368(4) + 1 : 1;
    if (GlobalStatics_11.method364() != 0) {
      GlobalStatics_11.method368(8);
    }

    GlobalStatics_11.method368(2);
    if (this.anInt1931 > 1) {
      this.anInt1928 = GlobalStatics_11.method368(4);
    }

    this.anIntArray1929 = new int[this.anInt1931];
    this.anIntArray1930 = new int[this.anInt1931];

    for (int var1 = 0; var1 < this.anInt1931; ++var1) {
      GlobalStatics_11.method368(8);
      this.anIntArray1929[var1] = GlobalStatics_11.method368(8);
      this.anIntArray1930[var1] = GlobalStatics_11.method368(8);
    }

  }
}
