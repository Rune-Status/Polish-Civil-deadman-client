package com.jagex.runescape.sound.audio;

import com.jagex.runescape.cache.FileUnpacker;
import com.jagex.runescape.sound.SomethingVolume;

public class AudioStreamEncoder4Statics {

  public static SomethingVolume method1245(int var0, FileUnpacker var1,
      int var2) {
    byte[] var3 = var1.getBytes(var2);
    return var3 != null ? new SomethingVolume(var3) : null;
  }
}
