package com.jagex.runescape.sound;

public final class SomethingMusic0 extends AbstractSomethingMusic {

  public byte[] aByteArray3030;
  public boolean aBoolean3031;
  public int anInt3032;
  public int anInt3033;
  public int anInt3034;

  public SomethingMusic0(int var1, byte[] var2, int var3, int var4) {
    this.anInt3034 = var1;
    this.aByteArray3030 = var2;
    this.anInt3033 = var3;
    this.anInt3032 = var4;
  }

  public SomethingMusic0(int var1, byte[] var2, int var3, int var4,
      boolean var5) {
    this.anInt3034 = var1;
    this.aByteArray3030 = var2;
    this.anInt3033 = var3;
    this.anInt3032 = var4;
    this.aBoolean3031 = var5;
  }

  public SomethingMusic0 method151(SomethingAudio var1) {
    this.aByteArray3030 = var1.method2173(this.aByteArray3030, (byte) -105);
    this.anInt3034 = var1.method2177(this.anInt3034, (byte) 90);
    if (this.anInt3033 == this.anInt3032) {
      this.anInt3033 = this.anInt3032 = var1.method2178(false, this.anInt3033);
    } else {
      this.anInt3033 = var1.method2178(false, this.anInt3033);
      this.anInt3032 = var1.method2178(false, this.anInt3032);
      if (this.anInt3033 == this.anInt3032) {
        --this.anInt3033;
      }
    }

    return this;
  }
}
