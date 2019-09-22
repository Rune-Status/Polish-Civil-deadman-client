package com.jagex.runescape.sound;

public final class SomethingMidik {
  private final int anInt1937;
  private final int anInt1938;
  private final int anInt1939 = SomethingMidiInstrumentStatics.method368(16);
  private final int anInt1940;
  private final int anInt1941;
  private final int[] anIntArray1942;
  private final int anInt1943;

  public SomethingMidik() {
    this.anInt1938 = SomethingMidiInstrumentStatics.method368(24);
    this.anInt1940 = SomethingMidiInstrumentStatics.method368(24);
    this.anInt1941 = SomethingMidiInstrumentStatics.method368(24) + 1;
    this.anInt1943 = SomethingMidiInstrumentStatics.method368(6) + 1;
    this.anInt1937 = SomethingMidiInstrumentStatics.method368(8);
    int[] is = new int[this.anInt1943];
    for (int i = 0; i < this.anInt1943; i++) {
      int i_0_ = 0;
      int i_1_ = SomethingMidiInstrumentStatics.method368(3);
      boolean bool = MidiInstrumentStatics.method364() != 0;
      if (bool) {
        i_0_ = SomethingMidiInstrumentStatics.method368(5);
      }
      is[i] = i_0_ << 3 | i_1_;
    }
    this.anIntArray1942 = new int[this.anInt1943 * 8];
    for (int i = 0; i < this.anInt1943 * 8; i++) {
      this.anIntArray1942[i] = (is[i >> 3] & 1 << (i & 0x7)) != 0 ? SomethingMidiInstrumentStatics
          .method368(8) : -1;
    }
  }

  public void method2112(float[] fs, int i, boolean bool ) {
    for (int i_2_ = 0; i_2_ < i; i_2_++) {
      fs[i_2_] = 0.0F;
    }
    if (!bool) {
      int i_3_ = MidiSomethingStatics.aClass71Array2406[this.anInt1937].anInt1063;
      int i_4_ = this.anInt1940 - this.anInt1938;
      int i_5_ = i_4_ / this.anInt1941;
      int[] is = new int[i_5_];
      for (int i_6_ = 0; i_6_ < 8; i_6_++) {
        int i_7_ = 0;
        while (i_7_ < i_5_) {
          if (i_6_ == 0) {
            int i_8_ = MidiSomethingStatics.aClass71Array2406[this.anInt1937].method1290();
            for (int i_9_ = i_3_ - 1; i_9_ >= 0; i_9_--) {
              if (i_7_ + i_9_ < i_5_) {
                is[i_7_ + i_9_] = i_8_ % this.anInt1943;
              }
              i_8_ /= this.anInt1943;
            }
          }
          for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
            int i_11_ = is[i_7_];
            int i_12_ = this.anIntArray1942[i_11_ * 8 + i_6_];
            if (i_12_ >= 0) {
              int i_13_ = this.anInt1938 + i_7_ * this.anInt1941;
              SomethingMidiInstrument class71 = MidiSomethingStatics.aClass71Array2406[i_12_];
              if (this.anInt1939 == 0) {
                int i_14_ = this.anInt1941 / class71.anInt1063;
                for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
                  float[] fs_16_ = class71.method1288();
                  for (int i_17_ = 0; i_17_ < class71.anInt1063; i_17_++) {
                    fs[i_13_ + i_15_ + i_17_ * i_14_] += fs_16_[i_17_];
                  }
                }
              } else {
                int i_18_ = 0;
                while (i_18_ < this.anInt1941) {
                  float[] fs_19_ = class71.method1288();
                  for (int i_20_ = 0; i_20_ < class71.anInt1063; i_20_++) {
                    fs[i_13_ + i_18_] += fs_19_[i_20_];
                    i_18_++;
                  }
                }
              }
            }
            if (++i_7_ >= i_5_) {
              break;
            }
          }
        }
      }
    }
  }
}
