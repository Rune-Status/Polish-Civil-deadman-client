package com.jagex.runescape.sound.audio;

import com.jagex.runescape.node.Node;
import com.jagex.runescape.sound.AbstractSomethingMusic;

public abstract class AudioStreamEncoder extends Node {

  public int anInt2543;
  public AbstractSomethingMusic aClass3_Sub12_2544;
  public volatile boolean aBoolean2545 = true;
  public AudioStreamEncoder aClass3_Sub24_2546;

  public abstract int method409();

  public final void method410(int[] var1, int var2, int var3) {
    if (this.aBoolean2545) {
      this.method413(var1, var2, var3);
    } else {
      this.method415(var3);
    }

  }

  public abstract AudioStreamEncoder method411();

  public int method412() {
    return 255;
  }

  public abstract void method413(int[] var1, int var2, int var3);

  public abstract AudioStreamEncoder method414();

  public abstract void method415(int var1);
}
