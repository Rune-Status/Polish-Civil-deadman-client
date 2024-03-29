package com.jagex.runescape.sound.midi;

public final class SomethingMidiInstrument {

  public int anInt1063;
  public final int[] anIntArray1061;
  public float[][] aFloatArrayArray1062;
  public int[] anIntArray1064;
  public final int anInt1065;
  public int[] anIntArray1066;

  public SomethingMidiInstrument() {
    SomethingMidiInstrumentStatics.method368(24);
    this.anInt1063 = SomethingMidiInstrumentStatics.method368(16);
    this.anInt1065 = SomethingMidiInstrumentStatics.method368(24);
    this.anIntArray1061 = new int[this.anInt1065];
    boolean var1 = MidiInstrumentStatics.method364() != 0;
    int var2;
    int var3;
    int var5;
    if (var1) {
      var2 = 0;

      for (var3 = SomethingMidiInstrumentStatics.method368(5) + 1;
          var2 < this.anInt1065; ++var3) {
        int var4 =
            SomethingMidiInstrumentStatics
                .method368(MidiInstrumentStatics.method513(
                    this.anInt1065 - var2, 4));

        for (var5 = 0; var5 < var4; ++var5) {
          this.anIntArray1061[var2++] = var3;
        }
      }
    } else {
      boolean var14 = MidiInstrumentStatics.method364() != 0;

      for (var3 = 0; var3 < this.anInt1065; ++var3) {
        if (var14 && MidiInstrumentStatics.method364() == 0) {
          this.anIntArray1061[var3] = 0;
        } else {
          this.anIntArray1061[var3] =
              SomethingMidiInstrumentStatics.method368(5) + 1;
        }
      }
    }

    this.method1289();
    var2 = SomethingMidiInstrumentStatics.method368(4);
    if (var2 > 0) {
      float var16 = SomethingMidiInstrumentStatics.method358(
          SomethingMidiInstrumentStatics.method368(32));
      float var15 = SomethingMidiInstrumentStatics.method358(
          SomethingMidiInstrumentStatics.method368(32));
      var5 = SomethingMidiInstrumentStatics.method368(4) + 1;
      boolean var6 = MidiInstrumentStatics.method364() != 0;
      int var7;
      if (var2 == 1) {
        var7 = SomethingMidiInstrumentStatics.method1291(this.anInt1065,
            this.anInt1063);
      } else {
        var7 = this.anInt1065 * this.anInt1063;
      }

      this.anIntArray1064 = new int[var7];

      int var8;
      for (var8 = 0; var8 < var7; ++var8) {
        this.anIntArray1064[var8] = SomethingMidiInstrumentStatics
            .method368(var5);
      }

      this.aFloatArrayArray1062 = new float[this.anInt1065][this.anInt1063];
      float var9;
      int var10;
      int var11;
      if (var2 == 1) {
        for (var8 = 0; var8 < this.anInt1065; ++var8) {
          var9 = 0.0F;
          var10 = 1;

          for (var11 = 0; var11 < this.anInt1063; ++var11) {
            int var12 = var8 / var10 % var7;
            float var13 = this.anIntArray1064[var12] * var15 + var16 + var9;
            this.aFloatArrayArray1062[var8][var11] = var13;
            if (var6) {
              var9 = var13;
            }

            var10 *= var7;
          }
        }
      } else {
        for (var8 = 0; var8 < this.anInt1065; ++var8) {
          var9 = 0.0F;
          var10 = var8 * this.anInt1063;

          for (var11 = 0; var11 < this.anInt1063; ++var11) {
            float var17 = this.anIntArray1064[var10] * var15 + var16 + var9;
            this.aFloatArrayArray1062[var8][var11] = var17;
            if (var6) {
              var9 = var17;
            }

            ++var10;
          }
        }
      }
    }

  }

  public float[] method1288() {
    return this.aFloatArrayArray1062[this.method1290()];
  }

  public void method1289() {
    int[] var1 = new int[this.anInt1065];
    int[] var2 = new int[33];

    int var3;
    int var4;
    int var5;
    int var6;
    int var7;
    int var8;
    int var10;
    for (var3 = 0; var3 < this.anInt1065; ++var3) {
      var4 = this.anIntArray1061[var3];
      if (var4 != 0) {
        var5 = 1 << 32 - var4;
        var6 = var2[var4];
        var1[var3] = var6;
        int var9;
        if ((var6 & var5) == 0) {
          var7 = var6 | var5;

          for (var8 = var4 - 1; var8 >= 1; --var8) {
            var9 = var2[var8];
            if (var9 != var6) {
              break;
            }

            var10 = 1 << 32 - var8;
            if ((var9 & var10) != 0) {
              var2[var8] = var2[var8 - 1];
              break;
            }

            var2[var8] = var9 | var10;
          }
        } else {
          var7 = var2[var4 - 1];
        }

        var2[var4] = var7;

        for (var8 = var4 + 1; var8 <= 32; ++var8) {
          var9 = var2[var8];
          if (var9 == var6) {
            var2[var8] = var7;
          }
        }
      }
    }

    this.anIntArray1066 = new int[8];
    int var11 = 0;

    for (var3 = 0; var3 < this.anInt1065; ++var3) {
      var4 = this.anIntArray1061[var3];
      if (var4 != 0) {
        var5 = var1[var3];
        var6 = 0;

        for (var7 = 0; var7 < var4; ++var7) {
          var8 = Integer.MIN_VALUE >>> var7;
          if ((var5 & var8) == 0) {
            ++var6;
          } else {
            if (this.anIntArray1066[var6] == 0) {
              this.anIntArray1066[var6] = var11;
            }

            var6 = this.anIntArray1066[var6];
          }

          if (var6 >= this.anIntArray1066.length) {
            int[] var12 = new int[this.anIntArray1066.length * 2];

            for (var10 = 0; var10 < this.anIntArray1066.length; ++var10) {
              var12[var10] = this.anIntArray1066[var10];
            }

            this.anIntArray1066 = var12;
          }

          var8 >>>= 1;
        }

        this.anIntArray1066[var6] = ~var3;
        if (var6 >= var11) {
          var11 = var6 + 1;
        }
      }
    }

  }

  public int method1290() {
    int var1;
    for (
        var1 = 0;
        this.anIntArray1066[var1] >= 0;
        var1 =
            MidiInstrumentStatics.method364() != 0 ? this.anIntArray1066[var1]
                : var1 + 1) {
    }

    return ~this.anIntArray1066[var1];
  }

}
