package com.jagex.runescape;

import com.jagex.runescape.node.Node;

public final class SomethingMidiFile extends Node {


  static {
    int var0 = 2;

    for (int var1 = 0; var1 < 32; ++var1) {
      GlobalStatics_9.BIT_MASKS[var1] = -1 + var0;
      var0 += var0;
    }

    GlobalStatics_9.anInt2291 = 1;
  }

  public byte[] aByteArray2289;

  public SomethingMidiFile(byte[] var1 ) {
    this.aByteArray2289 = var1;
  }

}
