package com.jagex.runescape;

import java.awt.Component;

public final class SignLinkAudioOutputStream extends AbstractAudioOutputStream {

  private static UnusedInterface0 anInterface1_2970;
  private final int anInt2969;


  public SignLinkAudioOutputStream(SignLink var1, int var2 ) {
    SignLinkAudioOutputStream.anInterface1_2970 = var1.method1446((byte) 99);
    this.anInt2969 = var2;
  }

  public void write() {
    SignLinkAudioOutputStream.anInterface1_2970.method6(this.anInt2969,
        this.samples);
  }

  public void setBufferSize(int var1 ) throws Exception {
    if (var1 > '\u8000') {
      throw new IllegalArgumentException();
    } else {
      SignLinkAudioOutputStream.anInterface1_2970.method3(this.anInt2969, 25349, var1);
    }
  }

  public void flush() {
    SignLinkAudioOutputStream.anInterface1_2970.method1(this.anInt2969, 28544);
  }

  public int getAmountBufferedSamples() {
    return SignLinkAudioOutputStream.anInterface1_2970
        .method2((byte) 118, this.anInt2969);
  }

  public void close() {
    SignLinkAudioOutputStream.anInterface1_2970.method4((byte) 20,
        this.anInt2969);
  }

  public void bind(Component var1 ) throws Exception {
    SignLinkAudioOutputStream.anInterface1_2970
        .method5(DummyClass60.sampleRate, (byte) -39, var1, GlobalStatics_0.stereo);
  }

  public static void method2166() {
    SignLinkAudioOutputStream.anInterface1_2970 = null;
  }
}
