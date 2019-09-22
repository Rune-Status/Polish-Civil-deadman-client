package com.jagex.runescape.sound.audio;

import com.jagex.runescape.sound.SomethingMusic0;

public class AudioStreamEncoder3Statics {

  public static int sampleRate;

  public static AudioStreamEncoder1 method432(SomethingMusic0 var0, int var1,
      int var2, int var3) {
    return var0.aByteArray3030 != null && var0.aByteArray3030.length != 0 ?
        new AudioStreamEncoder1(var0, var1, var2, var3) :
        null;
  }
}
