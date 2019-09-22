package com.jagex.runescape.model;

import com.jagex.runescape.statics.DummyClass60;
import com.jagex.runescape.statics.GlobalStatics_0;
import com.jagex.runescape.statics.GlobalStatics_3;
import java.awt.Component;

public final class SignLinkAudioOutputStream extends AbstractAudioOutputStream {

  private final int anInt2969;

  public SignLinkAudioOutputStream(SignLink var1, int var2) {
    GlobalStatics_3.anInterface1_2970 = var1.method1446((byte) 99);
    this.anInt2969 = var2;
  }

  public void write() {
    GlobalStatics_3.anInterface1_2970.method6(this.anInt2969,
        this.samples);
  }

  public void setBufferSize(int var1) throws Exception {
    if (var1 > 0x8000) {
      throw new IllegalArgumentException();
    } else {
      GlobalStatics_3.anInterface1_2970.method3(this.anInt2969, 25349, var1);
    }
  }

  public void flush() {
    GlobalStatics_3.anInterface1_2970.method1(this.anInt2969, 28544);
  }

  public int getAmountBufferedSamples() {
    return GlobalStatics_3.anInterface1_2970
        .method2((byte) 118, this.anInt2969);
  }

  public void close() {
    GlobalStatics_3.anInterface1_2970.method4((byte) 20,
        this.anInt2969);
  }

  public void bind(Component var1) throws Exception {
    GlobalStatics_3.anInterface1_2970
        .method5(DummyClass60.sampleRate, (byte) -39, var1,
            GlobalStatics_0.stereo);
  }

}
